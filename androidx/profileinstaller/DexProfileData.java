package androidx.profileinstaller;

import java.util.HashMap;
import java.util.HashSet;

class DexProfileData {
    final int classSetSize;
    final HashSet classes;
    final long dexChecksum;
    final int hotMethodRegionSize;
    final String key;
    final HashMap methods;
    final int numMethodIds;

    DexProfileData(String s, long v, int v1, int v2, int v3, HashSet hashSet0, HashMap hashMap0) {
        this.key = s;
        this.dexChecksum = v;
        this.classSetSize = v1;
        this.hotMethodRegionSize = v2;
        this.numMethodIds = v3;
        this.classes = hashSet0;
        this.methods = hashMap0;
    }
}

