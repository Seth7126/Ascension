package com.unity.purchasing.common;

import java.util.List;

public interface IStoreCallback {
    void OnProductsRetrieved(List arg1);

    void OnPurchaseFailed(PurchaseFailureDescription arg1);

    void OnPurchaseSucceeded(String arg1, String arg2, String arg3);

    void OnSetupFailed(InitializationFailureReason arg1);
}

