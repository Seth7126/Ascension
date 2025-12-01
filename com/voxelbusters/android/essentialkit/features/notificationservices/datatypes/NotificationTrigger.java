package com.voxelbusters.android.essentialkit.features.notificationservices.datatypes;

import org.json.JSONException;
import org.json.JSONObject;

public class NotificationTrigger {
    public boolean repeat;

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("repeat", this.repeat);
        return jSONObject0;
    }
}

