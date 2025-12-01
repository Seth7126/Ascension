package com.google.android.vending.licensing;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.util.Log;

public class PreferenceObfuscator {
    private static final String TAG = "PreferenceObfuscator";
    private SharedPreferences.Editor mEditor;
    private final Obfuscator mObfuscator;
    private final SharedPreferences mPreferences;

    public PreferenceObfuscator(SharedPreferences sharedPreferences0, Obfuscator obfuscator0) {
        this.mPreferences = sharedPreferences0;
        this.mObfuscator = obfuscator0;
        this.mEditor = null;
    }

    public void commit() {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.mEditor;
        if(sharedPreferences$Editor0 != null) {
            sharedPreferences$Editor0.commit();
            this.mEditor = null;
        }
    }

    public String getString(String s, String s1) {
        String s2 = this.mPreferences.getString(s, null);
        if(s2 != null) {
            try {
                return this.mObfuscator.unobfuscate(s2, s);
            }
            catch(ValidationException unused_ex) {
                Log.w("PreferenceObfuscator", "Validation error while reading preference: " + s);
            }
        }
        return s1;
    }

    public void putString(String s, String s1) {
        if(this.mEditor == null) {
            this.mEditor = this.mPreferences.edit();
        }
        String s2 = this.mObfuscator.obfuscate(s1, s);
        this.mEditor.putString(s, s2);
    }
}

