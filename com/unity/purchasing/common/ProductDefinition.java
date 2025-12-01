package com.unity.purchasing.common;

public class ProductDefinition {
    public String id;
    public String storeSpecificId;
    public ProductType type;

    public ProductDefinition(String s, ProductType productType0) {
        this(s, s, productType0);
    }

    public ProductDefinition(String s, String s1, ProductType productType0) {
        this.id = s;
        this.storeSpecificId = s1;
        this.type = productType0;
    }
}

