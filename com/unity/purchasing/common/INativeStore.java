package com.unity.purchasing.common;

public interface INativeStore {
    void FinishTransaction(String arg1, String arg2);

    void Purchase(String arg1, String arg2);

    void RetrieveProducts(String arg1);
}

