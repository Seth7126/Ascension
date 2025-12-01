package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

final class eq {
    private static final Pattern a;

    static {
        eq.a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");
    }

    static List a(File file0, File file1) throws IOException {
        File[] arr_file1;
        List list0 = new ArrayList();
        File[] arr_file = file1.listFiles((File file0, String s) -> eq.a.matcher(s).matches());
        if(arr_file == null) {
            arr_file1 = new File[0];
        }
        else {
            File[] arr_file2 = new File[arr_file.length];
            for(int v = 0; v < arr_file.length; ++v) {
                File file2 = arr_file[v];
                int v1 = Integer.parseInt(file2.getName().split("-")[0]);
                if(v1 > arr_file.length || arr_file2[v1] != null) {
                    throw new ck("Metadata folder ordering corrupt.");
                }
                arr_file2[v1] = file2;
            }
            arr_file1 = arr_file2;
        }
        for(int v2 = 0; v2 < arr_file1.length; ++v2) {
            File file3 = arr_file1[v2];
            list0.add(file3);
            if(file3.getName().contains("LFH")) {
                try(FileInputStream fileInputStream0 = new FileInputStream(file3)) {
                    eu eu0 = new bw(fileInputStream0).b();
                    if(eu0.c() == null) {
                        throw new ck("Metadata files corrupt. Could not read local file header.");
                    }
                    File file4 = new File(file0, eu0.c());
                    if(!file4.exists()) {
                        throw new ck(String.format("Missing asset file %s during slice reconstruction.", file4.getCanonicalPath()));
                    }
                    list0.add(file4);
                }
            }
        }
        return list0;
    }

    // 检测为 Lambda 实现
    static boolean b(File file0, String s) [...]
}

