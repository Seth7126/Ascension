package com.google.android.vending.licensing;

public interface Obfuscator {
    String obfuscate(String arg1, String arg2);

    String unobfuscate(String arg1, String arg2) throws ValidationException;
}

