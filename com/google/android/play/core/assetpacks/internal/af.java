package com.google.android.play.core.assetpacks.internal;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;

public final class af {
    public static void a(PackageManager packageManager0, ComponentName componentName0, int v) {
        int v1 = packageManager0.getComponentEnabledSetting(componentName0);
        if(v1 != 1) {
            if(v1 == 2) {
            label_26:
                packageManager0.setComponentEnabledSetting(componentName0, 1, 1);
            }
            else {
                String s = componentName0.getPackageName();
                String s1 = componentName0.getClassName();
                try {
                    PackageInfo packageInfo0 = packageManager0.getPackageInfo(s, 0x204);
                    ComponentInfo[][] arr2_componentInfo = {packageInfo0.activities, packageInfo0.services, packageInfo0.providers};
                    int v2 = 0;
                alab1:
                    while(true) {
                        ComponentInfo componentInfo0 = null;
                        if(v2 >= 3) {
                            break;
                        }
                        android.content.pm.ComponentInfo[] arr_componentInfo = arr2_componentInfo[v2];
                        if(arr_componentInfo != null) {
                            int v3 = arr_componentInfo.length;
                            int v4 = 0;
                            while(v4 < v3) {
                                ComponentInfo componentInfo1 = arr_componentInfo[v4];
                                if(!componentInfo1.name.equals(s1)) {
                                    ++v4;
                                    continue;
                                }
                                componentInfo0 = componentInfo1;
                                break alab1;
                            }
                        }
                        ++v2;
                    }
                    if(componentInfo0 == null) {
                        goto label_26;
                    }
                    else if(!componentInfo0.isEnabled()) {
                        goto label_26;
                    }
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    goto label_26;
                }
            }
        }
    }
}

