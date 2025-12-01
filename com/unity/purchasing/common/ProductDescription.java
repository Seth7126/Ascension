package com.unity.purchasing.common;

public class ProductDescription {
    public final ProductMetadata metadata;
    public final String receipt;
    public final String storeSpecificId;
    public final String transactionId;

    public ProductDescription(String s, ProductMetadata productMetadata0, String s1, String s2) {
        this.storeSpecificId = s;
        this.metadata = productMetadata0;
        this.receipt = s1;
        this.transactionId = s2;
    }

    @Override
    public String toString() {
        return "{ProductDescription: storeSpecificId = " + this.storeSpecificId + ", metadata = " + this.metadata + ", receipt = " + this.receipt + ", transactionId = " + this.transactionId + ", }";
    }
}

