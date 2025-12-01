package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class AssetPackStates {
    public static AssetPackStates a(Bundle bundle0, co co0, eb eb0, be be0) {
        ArrayList arrayList0 = bundle0.getStringArrayList("pack_names");
        HashMap hashMap0 = new HashMap();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = (String)arrayList0.get(v1);
            hashMap0.put(s, AssetPackState.b(bundle0, s, co0, eb0, be0));
        }
        return new bo(bundle0.getLong("total_bytes_to_download"), hashMap0);
    }

    public abstract Map packStates();

    public abstract long totalBytes();
}

