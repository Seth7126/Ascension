package com.google.android.gms.internal.games;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzfs extends AbstractCollection implements Serializable {
    private static final Object[] zzmr;

    static {
        zzfs.zzmr = new Object[0];
    }

    @Override
    @Deprecated
    public final boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator iterator() {
        return this.zzcn();
    }

    @Override
    @Deprecated
    public final boolean remove(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(zzfs.zzmr);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        zzfo.checkNotNull(arr_object);
        int v = this.size();
        if(arr_object.length < v) {
            Object[] arr_object1 = this.zzco();
            if(arr_object1 != null) {
                return Arrays.copyOfRange(arr_object1, this.zzcp(), this.zzcq(), arr_object.getClass());
            }
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v);
        }
        else if(arr_object.length > v) {
            arr_object[v] = null;
        }
        this.zza(arr_object, 0);
        return arr_object;
    }

    int zza(Object[] arr_object, int v) {
        zzgg zzgg0 = (zzgg)this.iterator();
        while(zzgg0.hasNext()) {
            Object object0 = zzgg0.next();
            arr_object[v] = object0;
            ++v;
        }
        return v;
    }

    public abstract zzgg zzcn();

    @NullableDecl
    Object[] zzco() {
        return null;
    }

    int zzcp() {
        throw new UnsupportedOperationException();
    }

    int zzcq() {
        throw new UnsupportedOperationException();
    }

    // 去混淆评级： 低(20)
    public zzft zzcr() {
        return this.isEmpty() ? zzft.zzcs() : zzft.zza(this.toArray());
    }
}

