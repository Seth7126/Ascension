package com.google.android.play.core.assetpacks;

final class bp extends em {
    private final int a;
    private final String b;
    private final long c;
    private final long d;
    private final int e;

    bp(int v, String s, long v1, long v2, int v3) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = v3;
    }

    @Override  // com.google.android.play.core.assetpacks.em
    final int a() {
        return this.a;
    }

    @Override  // com.google.android.play.core.assetpacks.em
    final int b() {
        return this.e;
    }

    @Override  // com.google.android.play.core.assetpacks.em
    final long c() {
        return this.c;
    }

    @Override  // com.google.android.play.core.assetpacks.em
    final long d() {
        return this.d;
    }

    @Override  // com.google.android.play.core.assetpacks.em
    final String e() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof em) {
            int v = ((em)object0).a();
            if(this.a == v) {
                String s = this.b;
                if(s != null) {
                    if(s.equals(((em)object0).e())) {
                    label_10:
                        long v1 = ((em)object0).c();
                        if(this.c == v1) {
                            long v2 = ((em)object0).d();
                            if(this.d == v2) {
                                int v3 = ((em)object0).b();
                                return this.e == v3;
                            }
                        }
                    }
                }
                else if(((em)object0).e() == null) {
                    goto label_10;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a ^ 1000003;
        return this.b == null ? ((v * 0xD5009D89 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ this.e : (((v * 1000003 ^ this.b.hashCode()) * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ this.e;
    }

    @Override
    public final String toString() {
        return "SliceCheckpoint{fileExtractionStatus=" + this.a + ", filePath=" + this.b + ", fileOffset=" + this.c + ", remainingBytes=" + this.d + ", previousChunk=" + this.e + "}";
    }
}

