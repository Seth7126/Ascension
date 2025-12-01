package com.androidnative.gms.utils;

public class AN_IdFactory {
    private static int id;

    static {
    }

    public static int GetNextId() {
        int v = AN_IdFactory.id + 1;
        AN_IdFactory.id = v;
        return v;
    }
}

