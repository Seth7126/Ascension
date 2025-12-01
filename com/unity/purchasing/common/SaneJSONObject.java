package com.unity.purchasing.common;

import org.json.JSONException;
import org.json.JSONObject;

public class SaneJSONObject extends JSONObject {
    @Override  // org.json.JSONObject
    public JSONObject put(String s, double f) {
        try {
            return super.put(s, f);
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
    }

    @Override  // org.json.JSONObject
    public JSONObject put(String s, Object object0) {
        try {
            return super.put(s, object0);
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
    }

    @Override  // org.json.JSONObject
    public JSONObject put(String s, boolean z) {
        try {
            return super.put(s, z);
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
    }
}

