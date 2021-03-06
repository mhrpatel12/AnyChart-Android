package com.anychart.core.annotations;

import com.anychart.JsObject;

import com.anychart.enums.Anchor;
import com.anychart.graphics.vector.AnyColor;
import com.anychart.graphics.vector.Fill;
import com.anychart.graphics.vector.Stroke;
import com.anychart.graphics.vector.PatternFill;
import com.anychart.core.StateSettings;
import com.anychart.enums.MarkerType;

import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for annotation JSON format.
 */
public class AnnotationJSONFormat extends JsObject  {

    
    public AnnotationJSONFormat(Boolean allowEdit, Anchor anchor, AnyColor color, Fill fill, Stroke grid, PatternFill hatchFill, Number hoverGap, StateSettings hovered, MarkerType markerType, Number offsetX, Number offsetY, Number secondValueAnchor, Number secondXAnchor, StateSettings selected, Number size, Stroke stroke, Number thirdValueAnchor, Number thirdXAnchor, Stroke trend, Number valueAnchor, Number xAnchor) {
        js.append(String.format(Locale.US, "{allowEdit:%s, anchor: %s, color: %s, fill: %s, grid: %s, hatchFill: %s, hoverGap: %s, hovered: %s, markerType: %s, offsetX: %s, offsetY: %s, secondValueAnchor: %s, secondXAnchor: %s, selected: %s, size: %s, stroke: %s, thirdValueAnchor: %s, thirdXAnchor: %s, trend: %s, valueAnchor: %s, xAnchor: %s, } ", allowEdit, (anchor != null) ? anchor.getJsBase() : null, (color != null) ? color.getJsBase() : null, (fill != null) ? fill.getJsBase() : null, (grid != null) ? grid.getJsBase() : null, (hatchFill != null) ? hatchFill.getJsBase() : null, hoverGap, (hovered != null) ? hovered.getJsBase() : null, (markerType != null) ? markerType.getJsBase() : null, offsetX, offsetY, secondValueAnchor, secondXAnchor, (selected != null) ? selected.getJsBase() : null, size, (stroke != null) ? stroke.getJsBase() : null, thirdValueAnchor, thirdXAnchor, (trend != null) ? trend.getJsBase() : null, valueAnchor, xAnchor));
    }
    public AnnotationJSONFormat(Boolean allowEdit, Anchor anchor, AnyColor color, Fill fill, Stroke grid, PatternFill hatchFill, Number hoverGap, StateSettings hovered, String markerType, Number offsetX, Number offsetY, Number secondValueAnchor, Number secondXAnchor, StateSettings selected, Number size, Stroke stroke, Number thirdValueAnchor, Number thirdXAnchor, Stroke trend, Number valueAnchor, Number xAnchor) {
        js.append(String.format(Locale.US, "{allowEdit:%s, anchor: %s, color: %s, fill: %s, grid: %s, hatchFill: %s, hoverGap: %s, hovered: %s, markerType: %s, offsetX: %s, offsetY: %s, secondValueAnchor: %s, secondXAnchor: %s, selected: %s, size: %s, stroke: %s, thirdValueAnchor: %s, thirdXAnchor: %s, trend: %s, valueAnchor: %s, xAnchor: %s, } ", allowEdit, (anchor != null) ? anchor.getJsBase() : null, (color != null) ? color.getJsBase() : null, (fill != null) ? fill.getJsBase() : null, (grid != null) ? grid.getJsBase() : null, (hatchFill != null) ? hatchFill.getJsBase() : null, hoverGap, (hovered != null) ? hovered.getJsBase() : null, wrapQuotes(markerType), offsetX, offsetY, secondValueAnchor, secondXAnchor, (selected != null) ? selected.getJsBase() : null, size, (stroke != null) ? stroke.getJsBase() : null, thirdValueAnchor, thirdXAnchor, (trend != null) ? trend.getJsBase() : null, valueAnchor, xAnchor));
    }
    public AnnotationJSONFormat(Boolean allowEdit, String anchor, AnyColor color, Fill fill, Stroke grid, PatternFill hatchFill, Number hoverGap, StateSettings hovered, MarkerType markerType, Number offsetX, Number offsetY, Number secondValueAnchor, Number secondXAnchor, StateSettings selected, Number size, Stroke stroke, Number thirdValueAnchor, Number thirdXAnchor, Stroke trend, Number valueAnchor, Number xAnchor) {
        js.append(String.format(Locale.US, "{allowEdit:%s, anchor: %s, color: %s, fill: %s, grid: %s, hatchFill: %s, hoverGap: %s, hovered: %s, markerType: %s, offsetX: %s, offsetY: %s, secondValueAnchor: %s, secondXAnchor: %s, selected: %s, size: %s, stroke: %s, thirdValueAnchor: %s, thirdXAnchor: %s, trend: %s, valueAnchor: %s, xAnchor: %s, } ", allowEdit, wrapQuotes(anchor), (color != null) ? color.getJsBase() : null, (fill != null) ? fill.getJsBase() : null, (grid != null) ? grid.getJsBase() : null, (hatchFill != null) ? hatchFill.getJsBase() : null, hoverGap, (hovered != null) ? hovered.getJsBase() : null, (markerType != null) ? markerType.getJsBase() : null, offsetX, offsetY, secondValueAnchor, secondXAnchor, (selected != null) ? selected.getJsBase() : null, size, (stroke != null) ? stroke.getJsBase() : null, thirdValueAnchor, thirdXAnchor, (trend != null) ? trend.getJsBase() : null, valueAnchor, xAnchor));
    }
    public AnnotationJSONFormat(Boolean allowEdit, String anchor, AnyColor color, Fill fill, Stroke grid, PatternFill hatchFill, Number hoverGap, StateSettings hovered, String markerType, Number offsetX, Number offsetY, Number secondValueAnchor, Number secondXAnchor, StateSettings selected, Number size, Stroke stroke, Number thirdValueAnchor, Number thirdXAnchor, Stroke trend, Number valueAnchor, Number xAnchor) {
        js.append(String.format(Locale.US, "{allowEdit:%s, anchor: %s, color: %s, fill: %s, grid: %s, hatchFill: %s, hoverGap: %s, hovered: %s, markerType: %s, offsetX: %s, offsetY: %s, secondValueAnchor: %s, secondXAnchor: %s, selected: %s, size: %s, stroke: %s, thirdValueAnchor: %s, thirdXAnchor: %s, trend: %s, valueAnchor: %s, xAnchor: %s, } ", allowEdit, wrapQuotes(anchor), (color != null) ? color.getJsBase() : null, (fill != null) ? fill.getJsBase() : null, (grid != null) ? grid.getJsBase() : null, (hatchFill != null) ? hatchFill.getJsBase() : null, hoverGap, (hovered != null) ? hovered.getJsBase() : null, wrapQuotes(markerType), offsetX, offsetY, secondValueAnchor, secondXAnchor, (selected != null) ? selected.getJsBase() : null, size, (stroke != null) ? stroke.getJsBase() : null, thirdValueAnchor, thirdXAnchor, (trend != null) ? trend.getJsBase() : null, valueAnchor, xAnchor));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}