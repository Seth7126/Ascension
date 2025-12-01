package com.google.android.gms.internal.games;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzft extends zzfs implements List, RandomAccess {
    private static final zzgf zzms;

    static {
        zzft.zzms = new zzfw(zzgc.zznd, 0);
    }

    @Override
    @Deprecated
    public final void add(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(@NullableDecl Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public boolean equals(@NullableDecl Object object0) {
        if(object0 == zzfo.checkNotNull(this)) {
            return true;
        }
        if(object0 instanceof List) {
            int v = this.size();
            if(v == ((List)object0).size()) {
                if(!(this instanceof RandomAccess) || !(((List)object0) instanceof RandomAccess)) {
                    int v2 = this.size();
                    Iterator iterator0 = ((List)object0).iterator();
                    int v3 = 0;
                    while(v3 < v2) {
                        if(!iterator0.hasNext()) {
                            return false;
                        }
                        Object object1 = this.get(v3);
                        ++v3;
                        Object object2 = iterator0.next();
                        if(!zzfl.equal(object1, object2)) {
                            return false;
                        }
                    }
                    return !iterator0.hasNext();
                }
                else {
                    for(int v1 = 0; v1 < v; ++v1) {
                        if(!zzfl.equal(this.get(v1), ((List)object0).get(v1))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = this.size();
        int v1 = 1;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 = v1 * 0x1F + this.get(v2).hashCode();
        }
        return v1;
    }

    @Override
    public int indexOf(@NullableDecl Object object0) {
        if(object0 == null) {
            return -1;
        }
        if(this instanceof RandomAccess) {
            int v = this.size();
            int v1 = 0;
            if(object0 == null) {
                while(v1 < v) {
                    if(this.get(v1) == null) {
                        return v1;
                    }
                    ++v1;
                }
                return -1;
            }
            while(v1 < v) {
                if(object0.equals(this.get(v1))) {
                    return v1;
                }
                ++v1;
            }
            return -1;
        }
        ListIterator listIterator0 = this.listIterator();
        while(listIterator0.hasNext()) {
            if(zzfl.equal(object0, listIterator0.next())) {
                return listIterator0.previousIndex();
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    public Iterator iterator() {
        return this.zzcn();
    }

    @Override
    public int lastIndexOf(@NullableDecl Object object0) {
        if(object0 == null) {
            return -1;
        }
        if(this instanceof RandomAccess) {
            if(object0 == null) {
                for(int v = this.size() - 1; v >= 0; --v) {
                    if(this.get(v) == null) {
                        return v;
                    }
                }
                return -1;
            }
            for(int v1 = this.size() - 1; v1 >= 0; --v1) {
                if(object0.equals(this.get(v1))) {
                    return v1;
                }
            }
            return -1;
        }
        ListIterator listIterator0 = this.listIterator(this.size());
        while(listIterator0.hasPrevious()) {
            if(zzfl.equal(object0, listIterator0.previous())) {
                return listIterator0.nextIndex();
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return (zzgf)this.listIterator(0);
    }

    @Override
    public ListIterator listIterator(int v) {
        zzfo.zzb(v, this.size());
        return this.isEmpty() ? zzft.zzms : new zzfw(this, v);
    }

    @Override
    @Deprecated
    public final Object remove(int v) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Object set(int v, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List subList(int v, int v1) {
        return this.zzc(v, v1);
    }

    static zzft zza(Object[] arr_object) {
        return zzft.zzb(arr_object, arr_object.length);
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    int zza(Object[] arr_object, int v) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v + v2] = this.get(v2);
        }
        return v + v1;
    }

    static zzft zzb(Object[] arr_object, int v) {
        return v == 0 ? zzgc.zznd : new zzgc(arr_object, v);
    }

    public zzft zzc(int v, int v1) {
        zzfo.zza(v, v1, this.size());
        int v2 = v1 - v;
        if(v2 == this.size()) {
            return this;
        }
        return v2 == 0 ? zzgc.zznd : new zzfv(this, v, v2);
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    public final zzgg zzcn() {
        return (zzgf)this.listIterator();
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    public final zzft zzcr() {
        return this;
    }

    public static zzft zzcs() {
        return zzgc.zznd;
    }

    public static zzft zzd(Object object0) {
        Object[] arr_object = {object0};
        for(int v = 0; v <= 0; ++v) {
            zzfz.zza(arr_object[0], 0);
        }
        return zzft.zzb(arr_object, 1);
    }
}

