package com.unity.purchasing.common;

import java.util.List;

public interface IStore {
    void FinishTransaction(ProductDefinition arg1, String arg2);

    void Purchase(ProductDefinition arg1);

    void Purchase(ProductDefinition arg1, String arg2);

    void RetrieveProducts(List arg1);
}

