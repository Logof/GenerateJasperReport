package org.logof.xlsToJasper.jasper;

import jakarta.xml.bind.annotation.XmlElement;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import lombok.Data;
import org.logof.xlsToJasper.jasper.report.Band;
import org.logof.xlsToJasper.jasper.report.Detail;
import org.logof.xlsToJasper.jasper.report.Font;
import org.logof.xlsToJasper.jasper.report.JasperReport;
import org.logof.xlsToJasper.jasper.report.PageHeader;
import org.logof.xlsToJasper.jasper.report.Property;
import org.logof.xlsToJasper.jasper.report.ReportElement;
import org.logof.xlsToJasper.jasper.report.StaticText;
import org.logof.xlsToJasper.jasper.report.Text;
import org.logof.xlsToJasper.jasper.report.TextElement;
import org.logof.xlsToJasper.jasper.report.TextField;
import org.logof.xlsToJasper.jasper.report.TextFieldExpression;
import org.logof.xlsToJasper.jasper.report.Title;
import org.logof.xlsToJasper.model.MetaData;

@Data
public class Creator {
  private static final List<String> PROPERTIES = List.of(
    "com.jaspersoft.studio.unit.",
    "com.jaspersoft.studio.unit.pageHeight",
    "com.jaspersoft.studio.unit.pageWidth",
    "com.jaspersoft.studio.unit.topMargin",
    "com.jaspersoft.studio.unit.bottomMargin",
    "com.jaspersoft.studio.unit.leftMargin",
    "com.jaspersoft.studio.unit.rightMargin",
    "com.jaspersoft.studio.unit.columnWidth",
    "com.jaspersoft.studio.unit.columnSpacing");

  public void createProperties(JasperReport report) {
    report.getProperty().addAll(
      PROPERTIES.stream().map(rec -> {
        Property property = new Property();
        property.setName(rec);
        property.setValue("pixel");
        return property;
      }).toList());
  }

  public Title createTitle() {
    Title title = new Title();
    title.setBand(createBand());
    return title;
  }

  public PageHeader createPageHeader() {
    PageHeader pageHeader = new PageHeader();
    pageHeader.setBand(createBand());
    return pageHeader;
  }

  public Detail createDetail(MetaData metaData) {
    Detail detail = new Detail();

    Band band = createBand(metaData.getHeight());

    band.getBreakOrLineOrRectangle()
        .addAll(
          metaData.getRowCells()
                  .stream().map(cell ->
                                  cell.getValue().startsWith("{") && cell.getValue().endsWith("}")
                                  ? mapToTextField(cell)
                                  : mapToStaticText(cell))
                  .toList()
               );

    detail.getBand().add(band);
    return detail;
  }



  private Band createBand() {
    return new Band();
  }

  private Band createBand(int height) {
    Band band = new Band();
    band.setHeight(String.valueOf(height));

    return band;
  }


  public StaticText mapToStaticText(MetaData.Cell metaDataCell) {
    StaticText staticText = new StaticText();

    Text text = new Text();
    text.setContent(metaDataCell.getValue());

    staticText.setReportElement(mapToReportElement(metaDataCell));
    staticText.setTextElement(mapToTextElement(metaDataCell));
    staticText.setText(text);

    return staticText;
  }

  public TextField mapToTextField(MetaData.Cell metaDataCell) {
    TextField textField = new TextField();

    textField.setReportElement(mapToReportElement(metaDataCell));
    textField.setTextElement(mapToTextElement(metaDataCell));

    TextFieldExpression expression = new TextFieldExpression();
    expression.setContent(metaDataCell.getValue());

    textField.setTextFieldExpression(expression);

    return textField;
  }

  private ReportElement mapToReportElement(MetaData.Cell metaDataCell) {
    ReportElement reportElement = new ReportElement();
    reportElement.setX(String.valueOf(metaDataCell.getPosX()));
    reportElement.setY(String.valueOf(metaDataCell.getPosY()));
    reportElement.setHeight(String.valueOf(metaDataCell.getHeight()));
    reportElement.setWidth(String.valueOf(metaDataCell.getWidth()));
    reportElement.setUuid(UUID.randomUUID().toString());

    return reportElement;
  }

  private TextElement mapToTextElement(MetaData.Cell metaDataCell) {
    MetaData.FontMetaData fontMetaData = metaDataCell.getFontMetaData();
    MetaData.StyleMetaData styleMetaData = metaDataCell.getStyleMetaData();

    TextElement textElement = new TextElement();

    if (Objects.nonNull(styleMetaData)) {
      if (!styleMetaData.getAlign().equals("GENERAL")) {
        textElement.setTextAlignment(styleMetaData.getAlign().charAt(0) +
                                       styleMetaData.getAlign().substring(1).toLowerCase());
      }

      if (!styleMetaData.getValign().equals("GENERAL")) {
        textElement.setVerticalAlignment(styleMetaData.getValign().charAt(0) +
                                       styleMetaData.getValign().substring(1).toLowerCase());
      }
    }

    if (Objects.nonNull(fontMetaData)) {
      Font reportFont = new Font();
      reportFont.setFontName(fontMetaData.getName());
      reportFont.setSize(String.valueOf(fontMetaData.getSize()));
      reportFont.setIsBold(String.valueOf(fontMetaData.isBold()));

      textElement.setFont(reportFont);
    }
    return textElement;
  }
}
