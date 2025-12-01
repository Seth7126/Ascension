package com.unity.purchasing.common;

public class PurchaseFailureDescription {
    public String message;
    public String productId;
    public PurchaseFailureReason reason;
    public String storeSpecificErrorCode;

    public PurchaseFailureDescription(String s, PurchaseFailureReason purchaseFailureReason0) {
        this(s, purchaseFailureReason0, "", "");
    }

    public PurchaseFailureDescription(String s, PurchaseFailureReason purchaseFailureReason0, String s1, String s2) {
        this.productId = s;
        this.reason = purchaseFailureReason0;
        this.message = s1;
        this.storeSpecificErrorCode = s2;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 == null || !(object0 instanceof PurchaseFailureDescription) ? false : this.equalsAllFields(((PurchaseFailureDescription)object0));
    }

    // 去混淆评级： 低(30)
    public boolean equalsAllFields(PurchaseFailureDescription purchaseFailureDescription0) {
        return this.productId.equals(purchaseFailureDescription0.productId) && this.reason == purchaseFailureDescription0.reason && this.message.equals(purchaseFailureDescription0.message) && this.storeSpecificErrorCode.equals(purchaseFailureDescription0.storeSpecificErrorCode);
    }

    @Override
    public String toString() {
        return "productId: \"" + this.productId + "\" reason: " + this.reason + " message: \"" + this.message + "\" storeSpecificErrorCode: " + this.storeSpecificErrorCode;
    }
}

