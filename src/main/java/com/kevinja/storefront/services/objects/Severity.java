package com.kevinja.storefront.services.objects;

public enum Severity {
    DEBUG(0), INFO(10), WARNING(20), ERROR(30);

    private final int value;
    Severity(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
