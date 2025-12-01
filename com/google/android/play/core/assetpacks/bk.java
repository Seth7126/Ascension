package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.an;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

final class bk extends an {
    private final File a;
    private final File b;
    private final NavigableMap c;

    bk(File file0, File file1) throws IOException {
        this.a = file0;
        this.b = file1;
        this.c = new TreeMap();
        List list0 = eq.a(file0, file1);
        if(list0.isEmpty()) {
            throw new ck(String.format("Virtualized slice archive empty for %s, %s", file0, file1));
        }
        long v = 0L;
        for(Object object0: list0) {
            this.c.put(v, ((File)object0));
            v += ((File)object0).length();
        }
    }

    @Override  // com.google.android.play.core.assetpacks.internal.an
    public final long a() {
        Map.Entry map$Entry0 = this.c.lastEntry();
        return ((long)(((Long)map$Entry0.getKey()))) + ((File)map$Entry0.getValue()).length();
    }

    @Override  // com.google.android.play.core.assetpacks.internal.an
    protected final InputStream b(long v, long v1) throws IOException {
        if(v < 0L || v1 < 0L) {
            throw new ck(String.format("Invalid input parameters %s, %s", v, v1));
        }
        long v2 = v + v1;
        if(v2 > this.a()) {
            throw new ck(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", this.a(), v2));
        }
        Long long0 = (Long)this.c.floorKey(v);
        Long long1 = (Long)this.c.floorKey(v2);
        if(long0.equals(long1)) {
            return new bj(this.d(v, long0), v1);
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(this.d(v, long0));
        Collection collection0 = this.c.subMap(long0, false, long1, false).values();
        if(!collection0.isEmpty()) {
            arrayList0.add(new dr(Collections.enumeration(collection0)));
        }
        arrayList0.add(new bj(new FileInputStream(((File)this.c.get(long1))), v1 - (((long)long1) - v)));
        return new SequenceInputStream(Collections.enumeration(arrayList0));
    }

    @Override
    public final void close() {
    }

    private final InputStream d(long v, Long long0) throws IOException {
        InputStream inputStream0 = new FileInputStream(((File)this.c.get(long0)));
        if(inputStream0.skip(v - ((long)long0)) != v - ((long)long0)) {
            throw new ck(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", long0));
        }
        return inputStream0;
    }
}

