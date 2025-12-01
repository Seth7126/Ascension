package com.google.android.play.core.assetpacks.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class ad {
    private static final o a;
    private final Context b;
    private final String c;

    static {
        ad.a = new o("SplitInstallInfoProvider");
    }

    ad(Context context0) {
        this.b = context0;
        this.c = "com.playdekgames.android.Ascension";
    }

    public final Set a() {
        PackageInfo packageInfo0;
        try {
            packageInfo0 = this.b.getPackageManager().getPackageInfo(this.c, 0x80);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            ad.a.b("App is not found in PackageManager", new Object[0]);
            packageInfo0 = null;
        }
        if(packageInfo0 != null && packageInfo0.applicationInfo != null) {
            Set set0 = new HashSet();
            Bundle bundle0 = packageInfo0.applicationInfo.metaData;
            HashSet hashSet0 = new HashSet();
            if(bundle0 != null) {
                String s = bundle0.getString("com.android.dynamic.apk.fused.modules");
                if(s == null || s.isEmpty()) {
                    ad.a.a("App has no fused modules.", new Object[0]);
                }
                else {
                    Collections.addAll(hashSet0, s.split(",", -1));
                    hashSet0.remove("");
                    hashSet0.remove("base");
                }
            }
            String[] arr_s = packageInfo0.splitNames;
            if(arr_s == null) {
                ad.a.a("No splits are found or app cannot be found in package manager.", new Object[0]);
            }
            else {
                Object[] arr_object = {Arrays.toString(arr_s)};
                ad.a.a("Adding splits from package manager: %s", arr_object);
                Collections.addAll(hashSet0, arr_s);
            }
            ab ab0 = ac.a();
            if(ab0 != null) {
                hashSet0.addAll(ab0.a());
            }
            for(Object object0: hashSet0) {
                String s1 = (String)object0;
                if(!s1.startsWith("config.") && !s1.contains(".config.")) {
                    set0.add(s1);
                }
            }
            return set0;
        }
        return new HashSet();
    }
}

