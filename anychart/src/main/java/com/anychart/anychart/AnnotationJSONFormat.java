package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class AnnotationJSONFormat extends JsObject  {

    
    private Boolean allowEdit;
    private Anchor anchor;
    private AnyColor color;
    private Fill fill;
    private Stroke grid;
    private PatternFill hatchFill;
    private Fill hoverFill;
    private Double hoverGap;
    private Stroke hoverGrid;
    private PatternFill hoverHatchFill;
    private Double hoverSize;
    private Stroke hoverStroke;
    private Stroke hoverTrend;
    private MarkerType markerType;
    private Double offsetX;
    private Double offsetY;
    private Double secondValueAnchor;
    private Double secondXAnchor;
    private Fill selectFill;
    private Stroke selectGrid;
    private PatternFill selectHatchFill;
    private Double selectSize;
    private Stroke selectStroke;
    private Stroke selectTrend;
    private Double size;
    private Stroke stroke;
    private Double thirdValueAnchor;
    private Double thirdXAnchor;
    private Stroke trend;
    private Double valueAnchor;
    private Double xAnchor;

    
    public AnnotationJSONFormat(Boolean allowEdit, Anchor anchor, AnyColor color, Fill fill, Stroke grid, PatternFill hatchFill, Fill hoverFill, Double hoverGap, Stroke hoverGrid, PatternFill hoverHatchFill, Double hoverSize, Stroke hoverStroke, Stroke hoverTrend, MarkerType markerType, Double offsetX, Double offsetY, Double secondValueAnchor, Double secondXAnchor, Fill selectFill, Stroke selectGrid, PatternFill selectHatchFill, Double selectSize, Stroke selectStroke, Stroke selectTrend, Double size, Stroke stroke, Double thirdValueAnchor, Double thirdXAnchor, Stroke trend, Double valueAnchor, Double xAnchor) {
        this.allowEdit = allowEdit;
        this.anchor = anchor;
        this.color = color;
        this.fill = fill;
        this.grid = grid;
        this.hatchFill = hatchFill;
        this.hoverFill = hoverFill;
        this.hoverGap = hoverGap;
        this.hoverGrid = hoverGrid;
        this.hoverHatchFill = hoverHatchFill;
        this.hoverSize = hoverSize;
        this.hoverStroke = hoverStroke;
        this.hoverTrend = hoverTrend;
        this.markerType = markerType;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.secondValueAnchor = secondValueAnchor;
        this.secondXAnchor = secondXAnchor;
        this.selectFill = selectFill;
        this.selectGrid = selectGrid;
        this.selectHatchFill = selectHatchFill;
        this.selectSize = selectSize;
        this.selectStroke = selectStroke;
        this.selectTrend = selectTrend;
        this.size = size;
        this.stroke = stroke;
        this.thirdValueAnchor = thirdValueAnchor;
        this.thirdXAnchor = thirdXAnchor;
        this.trend = trend;
        this.valueAnchor = valueAnchor;
        this.xAnchor = xAnchor;

        js.append(String.format(Locale.US, "{allowEdit: %b,anchor: %s,color: %s,fill: %s,grid: %s,hatchFill: %s,hoverFill: %s,hoverGap: %f,hoverGrid: %s,hoverHatchFill: %s,hoverSize: %f,hoverStroke: %s,hoverTrend: %s,markerType: %s,offsetX: %f,offsetY: %f,secondValueAnchor: %f,secondXAnchor: %f,selectFill: %s,selectGrid: %s,selectHatchFill: %s,selectSize: %f,selectStroke: %s,selectTrend: %s,size: %f,stroke: %s,thirdValueAnchor: %f,thirdXAnchor: %f,trend: %s,valueAnchor: %f,xAnchor: %f}",  allowEdit, (anchor != null) ? anchor.generateJs() : "null", (color != null) ? color.generateJs() : "null", (fill != null) ? fill.generateJs() : "null", (grid != null) ? grid.generateJs() : "null", (hatchFill != null) ? hatchFill.generateJs() : "null", (hoverFill != null) ? hoverFill.generateJs() : "null", hoverGap, (hoverGrid != null) ? hoverGrid.generateJs() : "null", (hoverHatchFill != null) ? hoverHatchFill.generateJs() : "null", hoverSize, (hoverStroke != null) ? hoverStroke.generateJs() : "null", (hoverTrend != null) ? hoverTrend.generateJs() : "null", (markerType != null) ? markerType.generateJs() : "null", offsetX, offsetY, secondValueAnchor, secondXAnchor, (selectFill != null) ? selectFill.generateJs() : "null", (selectGrid != null) ? selectGrid.generateJs() : "null", (selectHatchFill != null) ? selectHatchFill.generateJs() : "null", selectSize, (selectStroke != null) ? selectStroke.generateJs() : "null", (selectTrend != null) ? selectTrend.generateJs() : "null", size, (stroke != null) ? stroke.generateJs() : "null", thirdValueAnchor, thirdXAnchor, (trend != null) ? trend.generateJs() : "null", valueAnchor, xAnchor));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}