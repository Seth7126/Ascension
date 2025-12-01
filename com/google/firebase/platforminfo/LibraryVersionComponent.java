package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;

public class LibraryVersionComponent {
    public static Component create(String s, String s1) {
        return Component.intoSet(LibraryVersion.create(s, s1), LibraryVersion.class);
    }
}

