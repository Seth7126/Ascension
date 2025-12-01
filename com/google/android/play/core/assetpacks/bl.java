package com.google.android.play.core.assetpacks;

final class bl extends AssetLocation {
    private final String a;
    private final long b;
    private final long c;

    bl(String s, long v, long v1) {
        if(s == null) {
            throw new NullPointerException("Null path");
        }
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof AssetLocation) {
            String s = ((AssetLocation)object0).path();
            if(this.a.equals(s)) {
                long v = ((AssetLocation)object0).offset();
                if(this.b == v) {
                    long v1 = ((AssetLocation)object0).size();
                    return this.c == v1;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20))) * 1000003 ^ ((int)(this.c >>> 0x20 ^ this.c));
    }

    @Override  // com.google.android.play.core.assetpacks.AssetLocation
    public final long offset() {
        return this.b;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetLocation
    public final String path() {
        return this.a;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetLocation
    public final long size() {
        return this.c;
    }

    @Override
    public final String toString() {
        return "AssetLocation{path=" + this.a + ", offset=" + this.b + ", size=" + this.c + "}";
    }
}

