package com.unity.purchasing.common;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class UnityPurchasing implements IStoreCallback {
    private IUnityCallback bridge;

    public UnityPurchasing(IUnityCallback iUnityCallback0) {
        this.bridge = iUnityCallback0;
    }

    @Override  // com.unity.purchasing.common.IStoreCallback
    public void OnProductsRetrieved(List list0) {
        this.bridge.OnProductsRetrieved(UnityPurchasing.SerialiseProducts(list0));
    }

    @Override  // com.unity.purchasing.common.IStoreCallback
    public void OnPurchaseFailed(PurchaseFailureDescription purchaseFailureDescription0) {
        this.bridge.OnPurchaseFailed(UnityPurchasing.SerialisePurchaseFailure(purchaseFailureDescription0));
    }

    @Override  // com.unity.purchasing.common.IStoreCallback
    public void OnPurchaseSucceeded(String s, String s1, String s2) {
        this.bridge.OnPurchaseSucceeded(s, s1, s2);
    }

    @Override  // com.unity.purchasing.common.IStoreCallback
    public void OnSetupFailed(InitializationFailureReason initializationFailureReason0) {
        this.bridge.OnSetupFailed(initializationFailureReason0.toString());
    }

    private static JSONObject SerialiseMetadata(ProductMetadata productMetadata0) {
        JSONObject jSONObject0 = new SaneJSONObject();
        ((SaneJSONObject)jSONObject0).put("isoCurrencyCode", productMetadata0.isoCurrencyCode);
        ((SaneJSONObject)jSONObject0).put("localizedDescription", productMetadata0.localizedDescription);
        ((SaneJSONObject)jSONObject0).put("localizedPriceString", productMetadata0.localizedPriceString);
        ((SaneJSONObject)jSONObject0).put("localizedPrice", (productMetadata0.localizedPrice == null ? 0.0 : productMetadata0.localizedPrice.doubleValue()));
        ((SaneJSONObject)jSONObject0).put("localizedTitle", productMetadata0.localizedTitle);
        return jSONObject0;
    }

    private static JSONObject SerialiseProduct(ProductDescription productDescription0) {
        JSONObject jSONObject0 = new SaneJSONObject();
        ((SaneJSONObject)jSONObject0).put("metadata", UnityPurchasing.SerialiseMetadata(productDescription0.metadata));
        ((SaneJSONObject)jSONObject0).put("receipt", productDescription0.receipt);
        ((SaneJSONObject)jSONObject0).put("storeSpecificId", productDescription0.storeSpecificId);
        ((SaneJSONObject)jSONObject0).put("transactionId", productDescription0.transactionId);
        return jSONObject0;
    }

    public static String SerialiseProducts(List list0) {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: list0) {
            jSONArray0.put(UnityPurchasing.SerialiseProduct(((ProductDescription)object0)));
        }
        return jSONArray0.toString();
    }

    public static String SerialisePurchaseFailure(PurchaseFailureDescription purchaseFailureDescription0) {
        SaneJSONObject saneJSONObject0 = new SaneJSONObject();
        saneJSONObject0.put("message", purchaseFailureDescription0.message);
        saneJSONObject0.put("productId", purchaseFailureDescription0.productId);
        saneJSONObject0.put("reason", purchaseFailureDescription0.reason.toString());
        saneJSONObject0.put("storeSpecificErrorCode", purchaseFailureDescription0.storeSpecificErrorCode);
        return saneJSONObject0.toString();
    }
}

