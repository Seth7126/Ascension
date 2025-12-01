package com.google.android.gms.internal.games;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzge {
    static boolean zza(Set set0, @NullableDecl Object object0) {
        if(set0 == object0) {
            return true;
        }
        if(object0 instanceof Set) {
            Set set1 = (Set)object0;
            try {
                if(set0.size() == set1.size() && set0.containsAll(set1)) {
                    return true;
                }
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }
}

