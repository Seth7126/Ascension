package com.unity.purchasing.common;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class StoreDeserializer implements INativeStore, IStore {
    public static List DeserializeProducts(String s) {
        try {
            JSONArray jSONArray0 = new JSONArray(s);
            List list0 = new ArrayList();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                list0.add(StoreDeserializer.GetProductDefinition(jSONArray0.getJSONObject(v)));
            }
            return list0;
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
    }

    @Override  // com.unity.purchasing.common.INativeStore
    public void FinishTransaction(String s, String s1) {
        this.FinishTransaction(StoreDeserializer.GetProductDefinition(s), s1);
    }

    public static ProductDefinition GetProductDefinition(String s) {
        if(s == null) {
            return null;
        }
        try {
            return StoreDeserializer.GetProductDefinition(new JSONObject(s));
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
    }

    private static ProductDefinition GetProductDefinition(JSONObject jSONObject0) {
        try {
            return new ProductDefinition(jSONObject0.getString("id"), jSONObject0.getString("storeSpecificId"), ProductType.valueOf(jSONObject0.getString("type")));
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
    }

    @Override  // com.unity.purchasing.common.INativeStore
    public void Purchase(String s, String s1) {
        this.Purchase(StoreDeserializer.GetProductDefinition(s), s1);
    }

    @Override  // com.unity.purchasing.common.INativeStore
    public void RetrieveProducts(String s) {
        this.RetrieveProducts(StoreDeserializer.DeserializeProducts(s));
    }
}

