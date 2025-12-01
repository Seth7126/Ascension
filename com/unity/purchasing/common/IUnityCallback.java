package com.unity.purchasing.common;

public interface IUnityCallback {
    void OnProductsRetrieved(String arg1);

    void OnPurchaseFailed(String arg1);

    void OnPurchaseSucceeded(String arg1, String arg2, String arg3);

    void OnSetupFailed(String arg1);
}

