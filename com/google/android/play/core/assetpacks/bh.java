package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.play.core.assetpacks.internal.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

final class bh {
    private static final o a;
    private static final long b;
    private static final long c;
    private final Context d;
    private final ed e;

    static {
        bh.a = new o("AssetPackStorage");
        bh.b = TimeUnit.DAYS.toMillis(14L);
        bh.c = TimeUnit.DAYS.toMillis(28L);
    }

    bh(Context context0, ed ed0) {
        this.d = context0;
        this.e = ed0;
    }

    final void A(String s, int v, long v1, int v2) throws IOException {
        File file0 = this.J(s, v, v1);
        Properties properties0 = new Properties();
        properties0.put("numberOfMerges", String.valueOf(v2));
        file0.getParentFile().mkdirs();
        file0.createNewFile();
        FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
        properties0.store(fileOutputStream0, null);
        fileOutputStream0.close();
    }

    final void B(String s, int v, long v1) {
        File file0 = this.I(s);
        if(!file0.exists()) {
            return;
        }
        File[] arr_file = file0.listFiles();
        for(int v2 = 0; v2 < arr_file.length; ++v2) {
            File file1 = arr_file[v2];
            if(!file1.getName().equals(String.valueOf(v)) && !file1.getName().equals("stale.tmp")) {
                bh.Q(file1);
            }
            else if(file1.getName().equals(String.valueOf(v))) {
                File[] arr_file1 = file1.listFiles();
                for(int v3 = 0; v3 < arr_file1.length; ++v3) {
                    File file2 = arr_file1[v3];
                    if(!file2.getName().equals(String.valueOf(v1))) {
                        bh.Q(file2);
                    }
                }
            }
        }
    }

    final void C(List list0) {
        int v = this.e.a();
        for(Object object0: this.O()) {
            File file0 = (File)object0;
            if(!list0.contains(file0.getName()) && bh.H(file0, true) != ((long)v)) {
                bh.Q(file0);
            }
        }
    }

    final boolean D(String s) {
        return this.I(s).exists() ? bh.Q(this.I(s)) : true;
    }

    final boolean E(String s, int v, long v1) {
        return this.K(s, v, v1).exists() ? bh.Q(this.K(s, v, v1)) : true;
    }

    final boolean F(String s, int v, long v1) {
        return this.h(s, v, v1).exists() ? bh.Q(this.h(s, v, v1)) : true;
    }

    final boolean G(String s) {
        try {
            if(this.r(s) != null) {
                return true;
            }
        }
        catch(IOException unused_ex) {
        }
        return false;
    }

    private static long H(File file0, boolean z) {
        if(!file0.exists()) {
            return -1L;
        }
        ArrayList arrayList0 = new ArrayList();
        if(z && file0.listFiles().length > 1) {
            bh.a.e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            File[] arr_file = file0.listFiles();
        label_7:
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                if(!file1.getName().equals("stale.tmp")) {
                    arrayList0.add(Long.valueOf(file1.getName()));
                }
            }
        }
        catch(NumberFormatException numberFormatException0) {
            bh.a.c(numberFormatException0, "Corrupt asset pack directories.", new Object[0]);
            if(true) {
                goto label_16;
            }
            goto label_7;
        }
    label_16:
        if(arrayList0.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList0);
        return (long)(((Long)arrayList0.get(arrayList0.size() - 1)));
    }

    private final File I(String s) {
        return new File(this.L(), s);
    }

    private final File J(String s, int v, long v1) {
        return new File(this.j(s, v, v1), "merge.tmp");
    }

    private final File K(String s, int v, long v1) {
        return new File(new File(new File(this.M(), s), String.valueOf(v)), String.valueOf(v1));
    }

    private final File L() {
        return new File(this.d.getFilesDir(), "assetpacks");
    }

    private final File M() {
        return new File(this.L(), "_tmp");
    }

    private static List N(PackageInfo packageInfo0, String s) {
        List list0 = new ArrayList();
        if(packageInfo0.splitNames == null) {
            return list0;
        }
        for(int v = -Arrays.binarySearch(packageInfo0.splitNames, s) - 1; v < packageInfo0.splitNames.length && packageInfo0.splitNames[v].startsWith(s); ++v) {
            list0.add(packageInfo0.applicationInfo.splitSourceDirs[v]);
        }
        return list0;
    }

    private final List O() {
        List list0 = new ArrayList();
        try {
            if(!this.L().exists() || this.L().listFiles() == null) {
                return list0;
            }
            File[] arr_file = this.L().listFiles();
        label_5:
            for(int v = 0; v < arr_file.length; ++v) {
                File file0 = arr_file[v];
                if(!file0.getCanonicalPath().equals(this.M().getCanonicalPath())) {
                    list0.add(file0);
                }
            }
        }
        catch(IOException iOException0) {
            bh.a.b("Could not process directory while scanning installed packs. %s", new Object[]{iOException0});
            if(true) {
                return list0;
            }
            goto label_5;
        }
        return list0;
    }

    private static void P(File file0) {
        if(file0.listFiles() != null && file0.listFiles().length > 1) {
            long v1 = bh.H(file0, false);
            File[] arr_file = file0.listFiles();
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                if(!file1.getName().equals(String.valueOf(v1)) && !file1.getName().equals("stale.tmp")) {
                    bh.Q(file1);
                }
            }
        }
    }

    private static boolean Q(File file0) {
        File[] arr_file = file0.listFiles();
        boolean z = true;
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                z &= bh.Q(arr_file[v]);
            }
        }
        return file0.delete() ? z : false;
    }

    final int a(String s) {
        return (int)bh.H(this.I(s), true);
    }

    final int b(String s, int v, long v1) throws IOException {
        Properties properties0;
        File file0 = this.J(s, v, v1);
        if(!file0.exists()) {
            return 0;
        }
        properties0 = new Properties();
        try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
            properties0.load(fileInputStream0);
        }
        if(properties0.getProperty("numberOfMerges") != null) {
            try {
                return Integer.parseInt(properties0.getProperty("numberOfMerges"));
            }
            catch(NumberFormatException numberFormatException0) {
                throw new ck("Merge checkpoint file corrupt.", numberFormatException0);
            }
        }
        throw new ck("Merge checkpoint file corrupt.");
    }

    final long c(String s) {
        return bh.H(this.g(s, ((int)bh.H(this.I(s), true))), true);
    }

    final AssetLocation d(String s, String s1, List list0) {
        if(list0 == null) {
            return null;
        }
        String s2 = new File("assets", s1).getPath();
        for(Object object0: list0) {
            String s3 = (String)object0;
            try {
                AssetLocation assetLocation0 = bt.a(s3, s2);
                if(assetLocation0 != null) {
                    return assetLocation0;
                }
            }
            catch(IOException iOException0) {
                bh.a.c(iOException0, "Failed to parse APK file \'%s\' looking for asset \'%s\'.", new Object[]{s3, s1});
                return null;
            }
            if(false) {
                break;
            }
        }
        bh.a.a("The asset %s is not present in Asset Pack %s. Searched in APKs: %s", new Object[]{s1, s, list0});
        return null;
    }

    final AssetLocation e(String s, String s1, AssetPackLocation assetPackLocation0) {
        File file0 = new File(assetPackLocation0.assetsPath(), s1);
        if(file0.exists()) {
            return new bl(file0.getPath(), 0L, file0.length());
        }
        Object[] arr_object = {s1, s, assetPackLocation0.assetsPath()};
        bh.a.a("The asset %s is not present in Asset Pack %s. Searched in folder: %s", arr_object);
        return null;
    }

    final AssetPackLocation f(String s) throws IOException {
        String s1 = this.r(s);
        if(s1 == null) {
            return null;
        }
        File file0 = new File(s1, "assets");
        if(!file0.isDirectory()) {
            bh.a.b("Failed to find assets directory: %s", new Object[]{file0});
            return null;
        }
        return new bm(0, s1, file0.getCanonicalPath());
    }

    final File g(String s, int v) {
        return new File(this.I(s), String.valueOf(v));
    }

    final File h(String s, int v, long v1) {
        return new File(this.g(s, v), String.valueOf(v1));
    }

    final File i(String s, int v, long v1) {
        return new File(this.h(s, v, v1), "_metadata");
    }

    final File j(String s, int v, long v1) {
        return new File(this.K(s, v, v1), "_packs");
    }

    final File k(String s, int v, long v1) {
        return new File(this.i(s, v, v1), "properties.dat");
    }

    final File l(String s, int v, long v1) {
        return new File(new File(this.K(s, v, v1), "_slices"), "_metadata");
    }

    final File m(String s, int v, long v1, String s1) {
        return new File(this.o(s, v, v1, s1), "checkpoint_ext.dat");
    }

    final File n(String s, int v, long v1, String s1) {
        return new File(this.o(s, v, v1, s1), "checkpoint.dat");
    }

    final File o(String s, int v, long v1, String s1) {
        return new File(this.l(s, v, v1), s1);
    }

    final File p(String s, int v, long v1, String s1) {
        return new File(new File(new File(this.K(s, v, v1), "_slices"), "_unverified"), s1);
    }

    final File q(String s, int v, long v1, String s1) {
        return new File(new File(new File(this.K(s, v, v1), "_slices"), "_verified"), s1);
    }

    final String r(String s) throws IOException {
        File file0 = new File(this.L(), s);
        if(!file0.exists()) {
            bh.a.a("Pack not found with pack name: %s", new Object[]{s});
            return null;
        }
        File file1 = new File(file0, String.valueOf(this.e.a()));
        if(!file1.exists()) {
            Object[] arr_object = {s, this.e.a()};
            bh.a.a("Pack not found with pack name: %s app version: %s", arr_object);
            return null;
        }
        File[] arr_file = file1.listFiles();
        if(arr_file != null && arr_file.length != 0) {
            if(arr_file.length > 1) {
                Object[] arr_object1 = {s, this.e.a()};
                bh.a.b("Multiple pack versions found for pack name: %s app version: %s", arr_object1);
                return null;
            }
            return arr_file[0].getCanonicalPath();
        }
        Object[] arr_object2 = {s, this.e.a()};
        bh.a.a("No pack version found for pack name: %s app version: %s", arr_object2);
        return null;
    }

    final List s(String s) {
        PackageInfo packageInfo0;
        String s1 = null;
        try {
            packageInfo0 = this.d.getPackageManager().getPackageInfo("com.playdekgames.android.Ascension", 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            bh.a.b("Could not find PackageInfo.", new Object[0]);
            packageInfo0 = null;
        }
        if(packageInfo0 == null) {
            return null;
        }
        List list0 = new ArrayList();
        if(packageInfo0.splitNames == null || packageInfo0.applicationInfo.splitSourceDirs == null) {
            bh.a.a("No splits present for package %s.", new Object[]{s});
        }
        else {
            int v = Arrays.binarySearch(packageInfo0.splitNames, s);
            if(v < 0) {
                bh.a.a("Asset Pack \'%s\' is not installed.", new Object[]{s});
            }
            else {
                s1 = packageInfo0.applicationInfo.splitSourceDirs[v];
            }
        }
        if(s1 == null) {
            list0.add(packageInfo0.applicationInfo.sourceDir);
            list0.addAll(bh.N(packageInfo0, "config."));
            return list0;
        }
        list0.add(s1);
        list0.addAll(bh.N(packageInfo0, s + ".config."));
        return list0;
    }

    final Map t() {
        Map map0 = new HashMap();
        for(Object object0: this.O()) {
            String s = ((File)object0).getName();
            int v = (int)bh.H(this.I(s), true);
            long v1 = bh.H(this.g(s, v), true);
            if(this.h(s, v, v1).exists()) {
                map0.put(s, v1);
            }
        }
        return map0;
    }

    final Map u() {
        Map map0 = new HashMap();
        for(Object object0: this.v().keySet()) {
            map0.put(((String)object0), this.c(((String)object0)));
        }
        return map0;
    }

    final Map v() {
        Map map0 = new HashMap();
        try {
            for(Object object0: this.O()) {
                File file0 = (File)object0;
                AssetPackLocation assetPackLocation0 = this.f(file0.getName());
                if(assetPackLocation0 != null) {
                    map0.put(file0.getName(), assetPackLocation0);
                }
            }
        }
        catch(IOException iOException0) {
            bh.a.b("Could not process directory while scanning installed packs: %s", new Object[]{iOException0});
        }
        return map0;
    }

    final void w() {
        for(Object object0: this.O()) {
            File file0 = (File)object0;
            if(file0.listFiles() != null) {
                bh.P(file0);
                long v1 = bh.H(file0, false);
                if(((long)this.e.a()) != v1) {
                    File file1 = new File(new File(file0, String.valueOf(v1)), "stale.tmp");
                    try {
                        file1.createNewFile();
                    }
                    catch(IOException unused_ex) {
                        bh.a.b("Could not write staleness marker.", new Object[0]);
                    }
                }
                File[] arr_file = file0.listFiles();
                for(int v = 0; v < arr_file.length; ++v) {
                    bh.P(arr_file[v]);
                }
            }
        }
    }

    final void x() {
        if(!this.M().exists()) {
            return;
        }
        File[] arr_file = this.M().listFiles();
        for(int v = 0; v < arr_file.length; ++v) {
            File file0 = arr_file[v];
            if(System.currentTimeMillis() - file0.lastModified() > bh.b) {
                bh.Q(file0);
            }
            else {
                bh.P(file0);
            }
        }
    }

    final void y() {
        for(Object object0: this.O()) {
            File file0 = (File)object0;
            if(file0.listFiles() != null) {
                File[] arr_file = file0.listFiles();
                for(int v = 0; v < arr_file.length; ++v) {
                    File file1 = arr_file[v];
                    File file2 = new File(file1, "stale.tmp");
                    if(file2.exists() && System.currentTimeMillis() - file2.lastModified() > bh.c) {
                        bh.Q(file1);
                    }
                }
            }
        }
    }

    final void z() {
        bh.Q(this.L());
    }
}

