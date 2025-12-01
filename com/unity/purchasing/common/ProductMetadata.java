package com.unity.purchasing.common;

import java.math.BigDecimal;

public class ProductMetadata {
    public final String isoCurrencyCode;
    public final String localizedDescription;
    public final BigDecimal localizedPrice;
    public final String localizedPriceString;
    public final String localizedTitle;

    public ProductMetadata(String s, String s1, String s2, String s3, BigDecimal bigDecimal0) {
        if(s == null) {
            s = "";
        }
        this.localizedPriceString = s;
        this.localizedTitle = s1;
        this.localizedDescription = s2;
        this.isoCurrencyCode = s3;
        this.localizedPrice = bigDecimal0;
    }

    @Override
    public String toString() {
        return "{ProductMetadata: localizedPriceString = " + this.localizedPriceString + ", localizedTitle = " + this.localizedTitle + ", localizedDescription = " + this.localizedDescription + ", isoCurrencyCode = " + this.isoCurrencyCode + ", localizedPrice = " + this.localizedPrice + ", }";
    }
}

