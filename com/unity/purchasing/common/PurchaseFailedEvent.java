package com.unity.purchasing.common;

import org.json.JSONObject;

public class PurchaseFailedEvent {
    public static String jsonEncodePurchaseFailure(String s, PurchaseFailureReason purchaseFailureReason0, String s1) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("productId", s);
            jSONObject0.put("reason", purchaseFailureReason0);
            jSONObject0.put("message", s1);
            return jSONObject0.toString();
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }
}

