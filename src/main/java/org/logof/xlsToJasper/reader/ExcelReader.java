package org.logof.xlsToJasper.reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.Optional;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.logof.xlsToJasper.model.MetaData;
import org.logof.xlsToJasper.model.MetaData.Border;
import org.logof.xlsToJasper.model.MetaData.FontMetaData;
import org.logof.xlsToJasper.model.MetaData.StyleMetaData;

@Data
@Slf4j
@RequiredArgsConstructor
public class ExcelReader implements FileReader {

  private final String filePath;

  @Override
  public MetaData parsing() {
    try (FileInputStream fis = new FileInputStream(filePath);
         Workbook workbook = new XSSFWorkbook(fis)) {

      Sheet sheet = workbook.getSheetAt(0); // Получаем первый лист

      MetaData metaData = new MetaData();

      int rowPosition = 0;
      for (Row row : sheet) {
        int colPosition = 0;

        for (Cell cell : row) {
          if (cell.getCellType() != CellType.BLANK) {
            int width = 0;
            int height = 0;

            CellStyle cellStyle = cell.getCellStyle();
            Font font = cell.getSheet().getWorkbook().getFontAt(cellStyle.getFontIndex());

            MetaData.StyleMetaData styleMetaData = StyleMetaData.builder()
                                                                .align(cellStyle.getAlignment().name())
                                                                .valign(cellStyle.getVerticalAlignment().name())
                                                                .build();

            MetaData.FontMetaData fontMetaData = FontMetaData.builder()
                                                             .size(font.getFontHeightInPoints())
                                                             .name(font.getFontName())
                                                             .bold(font.getBold())
                                                             .build();

            if (isFirstMergedCell(cell, sheet)) {
              Optional<CellRangeAddress> range = getMergedRange(cell, sheet);
              if (range.isPresent()) {
                CellRangeAddress cellRange = range.get();
                width = getMergedWidthInPixels(sheet, cellRange);
                height = getMergedHeightInPixels(sheet, cellRange);
              };
            } else if (!isPartOfMergedRegion(cell, sheet)) {
              width = getColumnWidthInPixels(sheet, cell.getColumnIndex());
              height =getRowHeightInPixels(row);
            }
            MetaData.Cell metaDataCell = MetaData.Cell.builder()
                                                      .value(getCellValueAsString(cell).trim())
                                                      .height(height)
                                                      .width(width)
                                                      .posX(colPosition)
                                                      .posY(rowPosition)
                                                      .fontMetaData(fontMetaData)
                                                      .styleMetaData(styleMetaData)
                                                      .build();
            metaData.getRowCells().add(metaDataCell);

            colPosition += width;
          } else {
            if (getMergedRange(cell, sheet).isEmpty()) {
              colPosition += getColumnWidthInPixels(sheet, cell.getColumnIndex());
            }
          }
        }

        rowPosition += getRowHeightInPixels(row);
      }

      calculateSize(metaData);

      return metaData;

    } catch (IOException e) {
      e.printStackTrace();
    }
    return new MetaData();
  }

  private void calculateSize(MetaData metaData) {
    var cellHeight = metaData.getRowCells().stream().max(Comparator.comparingInt(MetaData.Cell::getPosY));
    if (cellHeight.isPresent()) {
      int height = cellHeight.get().getPosY() + cellHeight.get().getHeight();
      metaData.setHeight(height);
    }

    var cellWidth = metaData.getRowCells().stream().max(Comparator.comparingInt(MetaData.Cell::getPosX));
    if (cellWidth.isPresent()) {
      int width = cellWidth.get().getPosX() + cellWidth.get().getWidth();
      metaData.setHeight(width);
    }
  }

  private String getCellValueAsString(Cell cell) {
    return switch (cell.getCellType()) {
      case STRING -> cell.getStringCellValue();
      case NUMERIC -> String.valueOf(cell.getNumericCellValue());
      case BOOLEAN -> String.valueOf(cell.getBooleanCellValue());
      default -> "";
    };
  }

  private boolean isFirstMergedCell(Cell cell, Sheet sheet) {
    for (CellRangeAddress range : sheet.getMergedRegions()) {
      if (range.isInRange(cell)) {
        return range.getFirstRow() == cell.getRowIndex() && range.getFirstColumn() == cell.getColumnIndex();
      }
    }
    return false;
  }

  private Optional<CellRangeAddress> getMergedRange(Cell cell, Sheet sheet) {
    return sheet.getMergedRegions()
                .stream()
                .filter(rec -> rec.isInRange(cell))
                .findAny();
  }

  private static boolean isPartOfMergedRegion(Cell cell, Sheet sheet) {
    for (CellRangeAddress range : sheet.getMergedRegions()) {
      if (range.isInRange(cell.getRowIndex(), cell.getColumnIndex())) {
        return true;
      }
    }
    return false;
  }
  private static int getColumnWidthInPixels(Sheet sheet, int columnIndex) {
    return (int) (sheet.getColumnWidthInPixels(columnIndex));
  }

  private static int getRowHeightInPixels(Row row) {
    double result = row.getHeightInPoints() * 96.0 / 72.0;
    return (int)(result);
  }

  private static int getMergedWidthInPixels(Sheet sheet, CellRangeAddress range) {
    int widthInPixels = 0;
    for (int i = range.getFirstColumn(); i <= range.getLastColumn(); i++) {
      widthInPixels += getColumnWidthInPixels(sheet, i);
    }
    return widthInPixels;
  }

  private static int getMergedHeightInPixels(Sheet sheet, CellRangeAddress range) {
    int heightInPixels = 0;
    for (int i = range.getFirstRow(); i <= range.getLastRow(); i++) {
      Row row = sheet.getRow(i);
      if (row != null) {
        heightInPixels += getRowHeightInPixels(row);
      }
    }
    return heightInPixels;
  }
}
