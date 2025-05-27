package org.logof.xlsToJasper.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MetaData {

  private int width = 0;
  private int height = 0;

  private List<Cell> rowCells = new ArrayList<>();

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Cell {
    private String value;

    private int width;
    private int height;

    private int posX;
    private int posY;

    private FontMetaData fontMetaData;
    private StyleMetaData styleMetaData;
    private Border border;
  }

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class StyleMetaData {
    private String align;
    private String valign;
  }

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class FontMetaData {
    private String name;
    private int size;

    private boolean bold;
  }

  @Data
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Border {
    private int left;
    private int top;
    private int right;
    private int bottom;
  }
}
