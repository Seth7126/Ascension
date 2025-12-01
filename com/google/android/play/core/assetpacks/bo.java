package com.google.android.play.core.assetpacks;

import java.util.Map;

final class bo extends AssetPackStates {
    private final long a;
    private final Map b;

    bo(long v, Map map0) {
        this.a = v;
        this.b = map0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof AssetPackStates) {
            long v = ((AssetPackStates)object0).totalBytes();
            if(this.a == v) {
                Map map0 = ((AssetPackStates)object0).packStates();
                return this.b.equals(map0);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackStates
    public final Map packStates() {
        return this.b;
    }

    @Override
    public final String toString() {
        return "AssetPackStates{totalBytes=" + this.a + ", packStates=" + this.b.toString() + "}";
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackStates
    public final long totalBytes() {
        return this.a;
    }
}

