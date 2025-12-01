package com.google.android.play.core.assetpacks;

import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

final class dq {
    static String a(List list0) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest0 = MessageDigest.getInstance("SHA256");
        byte[] arr_b = new byte[0x2000];
        for(Object object0: list0) {
            try(FileInputStream fileInputStream0 = new FileInputStream(((File)object0))) {
                do {
                    int v = fileInputStream0.read(arr_b);
                    if(v > 0) {
                        messageDigest0.update(arr_b, 0, v);
                    }
                }
                while(v != -1);
            }
        }
        return Base64.encodeToString(messageDigest0.digest(), 11);
    }
}

