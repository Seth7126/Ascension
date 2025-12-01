package com.google.android.play.core.assetpacks;

final class bn extends AssetPackState {
    private final String a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final int f;
    private final int g;
    private final String h;
    private final String i;

    bn(String s, int v, int v1, long v2, long v3, int v4, int v5, String s1, String s2) {
        if(s == null) {
            throw new NullPointerException("Null name");
        }
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        if(s1 == null) {
            throw new NullPointerException("Null availableVersionTag");
        }
        this.h = s1;
        if(s2 == null) {
            throw new NullPointerException("Null installedVersionTag");
        }
        this.i = s2;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackState
    public final String availableVersionTag() {
        return this.h;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackState
    public final long bytesDownloaded() {
        return this.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof AssetPackState && this.a.equals(((AssetPackState)object0).name())) {
            int v = ((AssetPackState)object0).status();
            if(this.b == v) {
                int v1 = ((AssetPackState)object0).errorCode();
                if(this.c == v1) {
                    long v2 = ((AssetPackState)object0).bytesDownloaded();
                    if(this.d == v2) {
                        long v3 = ((AssetPackState)object0).totalBytesToDownload();
                        if(this.e == v3) {
                            int v4 = ((AssetPackState)object0).transferProgressPercentage();
                            if(this.f == v4) {
                                int v5 = ((AssetPackState)object0).updateAvailability();
                                if(this.g == v5) {
                                    String s = ((AssetPackState)object0).availableVersionTag();
                                    if(this.h.equals(s)) {
                                        String s1 = ((AssetPackState)object0).installedVersionTag();
                                        return this.i.equals(s1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackState
    public final int errorCode() {
        return this.c;
    }

    @Override
    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e >>> 0x20 ^ this.e))) * 1000003 ^ this.f) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackState
    public final String installedVersionTag() {
        return this.i;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackState
    public final String name() {
        return this.a;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackState
    public final int status() {
        return this.b;
    }

    @Override
    public final String toString() {
        return "AssetPackState{name=" + this.a + ", status=" + this.b + ", errorCode=" + this.c + ", bytesDownloaded=" + this.d + ", totalBytesToDownload=" + this.e + ", transferProgressPercentage=" + this.f + ", updateAvailability=" + this.g + ", availableVersionTag=" + this.h + ", installedVersionTag=" + this.i + "}";
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackState
    public final long totalBytesToDownload() {
        return this.e;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackState
    public final int transferProgressPercentage() {
        return this.f;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackState
    public final int updateAvailability() {
        return this.g;
    }
}

