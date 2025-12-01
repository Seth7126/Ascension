package com.google.android.play.core.assetpacks;

final class bm extends AssetPackLocation {
    private final int a;
    private final String b;
    private final String c;

    bm(int v, String s, String s1) {
        this.a = v;
        this.b = s;
        this.c = s1;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackLocation
    public final String assetsPath() {
        return this.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof AssetPackLocation) {
            int v = ((AssetPackLocation)object0).packStorageMethod();
            if(this.a == v) {
                String s = this.b;
                if(s == null) {
                    if(((AssetPackLocation)object0).path() == null) {
                        return this.c == null ? ((AssetPackLocation)object0).assetsPath() == null : this.c.equals(((AssetPackLocation)object0).assetsPath());
                    }
                }
                else if(s.equals(((AssetPackLocation)object0).path())) {
                    return this.c == null ? ((AssetPackLocation)object0).assetsPath() == null : this.c.equals(((AssetPackLocation)object0).assetsPath());
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a ^ 1000003;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v * 1000003 ^ v2) * 1000003 ^ v1;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackLocation
    public final int packStorageMethod() {
        return this.a;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackLocation
    public final String path() {
        return this.b;
    }

    @Override
    public final String toString() {
        return "AssetPackLocation{packStorageMethod=" + this.a + ", path=" + this.b + ", assetsPath=" + this.c + "}";
    }
}

