package com.google.android.gms.internal.games;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzfy extends zzfs implements Set {
    @NullableDecl
    private transient zzft zzmw;

    @Override
    public boolean equals(@NullableDecl Object object0) {
        if(object0 == this) {
            return true;
        }
        return !(object0 instanceof zzfy) || !this.zzcu() || !((zzfy)object0).zzcu() || this.hashCode() == object0.hashCode() ? zzge.zza(this, object0) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        for(Object object0: this) {
            v += (object0 == null ? 0 : object0.hashCode());
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    public Iterator iterator() {
        return this.zzcn();
    }

    private static zzfy zza(int v, Object[] arr_object) {
        int v5;
        int v4;
        int v2;
        Object[] arr_object1;
    alab1:
        while(true) {
            switch(v) {
                case 0: {
                    return zzgb.zzmz;
                }
                case 1: {
                    return zzfy.zze(arr_object[0]);
                label_4:
                    int v1 = zzfy.zzr(v);
                    arr_object1 = new Object[v1];
                    v2 = v1 - 1;
                    v4 = 0;
                    v5 = 0;
                    for(int v3 = 0; v3 < v; ++v3) {
                        Object object0 = zzfz.zza(arr_object[v3], v3);
                        int v6 = object0.hashCode();
                        for(int v7 = zzfp.zzp(v6); true; ++v7) {
                            int v8 = v7 & v2;
                            Object object1 = arr_object1[v8];
                            if(object1 == null) {
                                arr_object[v5] = object0;
                                arr_object1[v8] = object0;
                                v4 += v6;
                                ++v5;
                                break;
                            }
                            if(object1.equals(object0)) {
                                break;
                            }
                        }
                    }
                    Arrays.fill(arr_object, v5, v, null);
                    if(v5 == 1) {
                        return new zzgd(arr_object[0], v4);
                    }
                    if(zzfy.zzr(v5) < v1 / 2) {
                        break;
                    }
                    break alab1;
                }
                default: {
                    goto label_4;
                }
            }
            v = v5;
        }
        if(v5 < (arr_object.length >> 1) + (arr_object.length >> 2)) {
            arr_object = Arrays.copyOf(arr_object, v5);
        }
        return new zzgb(arr_object, v4, arr_object1, v2, v5);
    }

    public static zzfy zza(Object object0, Object object1, Object object2) {
        return zzfy.zza(3, new Object[]{object0, object1, object2});
    }

    @SafeVarargs
    public static zzfy zza(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object[] arr_object) {
        zzfo.checkArgument(arr_object.length <= 0x7FFFFFF9, "the total number of elements must fit in an int");
        Object[] arr_object1 = new Object[arr_object.length + 6];
        arr_object1[0] = object0;
        arr_object1[1] = object1;
        arr_object1[2] = object2;
        arr_object1[3] = object3;
        arr_object1[4] = object4;
        arr_object1[5] = object5;
        System.arraycopy(arr_object, 0, arr_object1, 6, arr_object.length);
        return zzfy.zza(arr_object.length + 6, arr_object1);
    }

    static zzfy zzb(int v, Object[] arr_object) {
        return zzfy.zza(v, arr_object);
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    public final zzft zzcr() {
        zzft zzft0 = this.zzmw;
        if(zzft0 == null) {
            zzft0 = this.zzcv();
            this.zzmw = zzft0;
        }
        return zzft0;
    }

    boolean zzcu() {
        return false;
    }

    zzft zzcv() {
        return zzft.zza(this.toArray());
    }

    public static zzfy zze(Object object0) {
        return new zzgd(object0);
    }

    private static int zzr(int v) {
        int v1 = Math.max(v, 2);
        boolean z = true;
        if(v1 < 0x2CCCCCCC) {
            int v2;
            for(v2 = Integer.highestOneBit(v1 - 1) << 1; ((double)v2) * 0.7 < ((double)v1); v2 <<= 1) {
            }
            return v2;
        }
        if(v1 >= 0x40000000) {
            z = false;
        }
        zzfo.checkArgument(z, "collection too large");
        return 0x40000000;
    }
}

