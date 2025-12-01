package com.google.android.vending.licensing;

import android.text.TextUtils;

public class ResponseData {
    public String extra;
    public int nonce;
    public String packageName;
    public int responseCode;
    public long timestamp;
    public String userId;
    public String versionCode;

    public static ResponseData parse(String s) {
        int v = s.indexOf(58);
        String s1 = "";
        if(-1 != v) {
            String s2 = s.substring(0, v);
            if(v < s.length()) {
                s1 = s.substring(v + 1);
            }
            s = s2;
        }
        String[] arr_s = TextUtils.split(s, "\\Q|\\E");
        if(arr_s.length < 6) {
            throw new IllegalArgumentException("Wrong number of fields.");
        }
        ResponseData responseData0 = new ResponseData();
        responseData0.extra = s1;
        responseData0.responseCode = Integer.parseInt(arr_s[0]);
        responseData0.nonce = Integer.parseInt(arr_s[1]);
        responseData0.packageName = arr_s[2];
        responseData0.versionCode = arr_s[3];
        responseData0.userId = arr_s[4];
        responseData0.timestamp = Long.parseLong(arr_s[5]);
        return responseData0;
    }

    @Override
    public String toString() {
        return TextUtils.join("|", new Object[]{this.responseCode, this.nonce, this.packageName, this.versionCode, this.userId, this.timestamp});
    }
}

