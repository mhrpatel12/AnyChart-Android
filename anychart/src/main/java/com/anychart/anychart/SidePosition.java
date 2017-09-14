package com.anychart.anychart;

import java.util.Locale;

public enum SidePosition implements JsObject.JsObjectInterface {
    CENTER("center"),
    INSIDE("inside"),
    OUTSIDE("outside");

    private final String value;

    SidePosition(String value) {
        this.value = value;
    }

    public String generateJs() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}