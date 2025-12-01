package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@InternalPlatformTextApi
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\'B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\u0015\u001A\u00020\rJ\u0018\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\r2\u0006\u0010\u0019\u001A\u00020\u001AH\u0002J\u001E\u0010\u001B\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\r2\u0006\u0010\u001C\u001A\u00020\u001A2\u0006\u0010\u001D\u001A\u00020\u001AJ\u0010\u0010\u001E\u001A\u00020\r2\b\b\u0001\u0010\u0015\u001A\u00020\rJ\u0010\u0010\u001F\u001A\u00020\r2\b\b\u0001\u0010\u0018\u001A\u00020\rJ\u0010\u0010 \u001A\u00020\r2\b\b\u0001\u0010\u0015\u001A\u00020\rJ\u000E\u0010!\u001A\u00020\u001A2\u0006\u0010\"\u001A\u00020#J\u0010\u0010$\u001A\u00020\u001A2\b\b\u0001\u0010\u0015\u001A\u00020\rJ\u0010\u0010%\u001A\u00020\r2\u0006\u0010&\u001A\u00020\rH\u0002R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001A\u00020\r¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\r0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0013X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "layout", "Landroid/text/Layout;", "(Landroid/text/Layout;)V", "bidiProcessedParagraphs", "", "getLayout", "()Landroid/text/Layout;", "paragraphBidi", "", "Ljava/text/Bidi;", "paragraphCount", "", "getParagraphCount", "()I", "paragraphEnds", "", "tmpBuffer", "", "analyzeBidi", "paragraphIndex", "getDownstreamHorizontal", "", "offset", "primary", "", "getHorizontalPosition", "usePrimaryDirection", "upstream", "getParagraphEnd", "getParagraphForOffset", "getParagraphStart", "isLineEndSpace", "c", "", "isRtlParagraph", "lineEndToVisibleEnd", "lineEnd", "BidiRun", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LayoutHelper {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\u000E\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0006HÆ\u0003J\'\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001A\u00020\u00062\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\nR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "start", "", "end", "isRtl", "", "(IIZ)V", "getEnd", "()I", "()Z", "getStart", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class BidiRun {
        private final int end;
        private final boolean isRtl;
        private final int start;

        public BidiRun(int v, int v1, boolean z) {
            this.start = v;
            this.end = v1;
            this.isRtl = z;
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        public final BidiRun copy(int v, int v1, boolean z) {
            return new BidiRun(v, v1, z);
        }

        public static BidiRun copy$default(BidiRun layoutHelper$BidiRun0, int v, int v1, boolean z, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = layoutHelper$BidiRun0.start;
            }
            if((v2 & 2) != 0) {
                v1 = layoutHelper$BidiRun0.end;
            }
            if((v2 & 4) != 0) {
                z = layoutHelper$BidiRun0.isRtl;
            }
            return layoutHelper$BidiRun0.copy(v, v1, z);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof BidiRun)) {
                return false;
            }
            if(this.start != ((BidiRun)object0).start) {
                return false;
            }
            return this.end == ((BidiRun)object0).end ? this.isRtl == ((BidiRun)object0).isRtl : false;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        @Override
        public int hashCode() {
            int v = (this.start * 0x1F + this.end) * 0x1F;
            int v1 = this.isRtl;
            if(v1) {
                v1 = 1;
            }
            return v + v1;
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        @Override
        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }
    }

    private final boolean[] bidiProcessedParagraphs;
    private final Layout layout;
    private final List paragraphBidi;
    private final int paragraphCount;
    private final List paragraphEnds;
    private char[] tmpBuffer;

    public LayoutHelper(Layout layout0) {
        Intrinsics.checkNotNullParameter(layout0, "layout");
        super();
        this.layout = layout0;
        List list0 = new ArrayList();
        int v1 = 0;
        do {
            CharSequence charSequence0 = this.layout.getText();
            Intrinsics.checkNotNullExpressionValue(charSequence0, "layout.text");
            int v2 = StringsKt.indexOf$default(charSequence0, '\n', v1, false, 4, null);
            v1 = v2 >= 0 ? v2 + 1 : this.layout.getText().length();
            list0.add(v1);
        }
        while(v1 < this.layout.getText().length());
        this.paragraphEnds = list0;
        int v3 = list0.size();
        ArrayList arrayList0 = new ArrayList(v3);
        for(int v = 0; v < v3; ++v) {
            arrayList0.add(null);
        }
        this.paragraphBidi = arrayList0;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    public final Bidi analyzeBidi(int v) {
        Bidi bidi0;
        if(this.bidiProcessedParagraphs[v]) {
            return (Bidi)this.paragraphBidi.get(v);
        }
        int v1 = v == 0 ? 0 : ((Number)this.paragraphEnds.get(v - 1)).intValue();
        int v2 = ((Number)this.paragraphEnds.get(v)).intValue();
        int v3 = v2 - v1;
        char[] arr_c = this.tmpBuffer != null && this.tmpBuffer.length >= v3 ? this.tmpBuffer : new char[v3];
        TextUtils.getChars(this.layout.getText(), v1, v2, arr_c, 0);
        if(Bidi.requiresBidi(arr_c, 0, v3)) {
            bidi0 = new Bidi(arr_c, 0, null, 0, v3, ((int)this.isRtlParagraph(v)));
            if(bidi0.getRunCount() == 1) {
                bidi0 = null;
            }
        }
        else {
            bidi0 = null;
        }
        this.paragraphBidi.set(v, bidi0);
        this.bidiProcessedParagraphs[v] = true;
        if(bidi0 != null) {
            arr_c = arr_c == this.tmpBuffer ? null : this.tmpBuffer;
        }
        this.tmpBuffer = arr_c;
        return bidi0;
    }

    // 去混淆评级： 低(20)
    private final float getDownstreamHorizontal(int v, boolean z) {
        return z ? this.layout.getPrimaryHorizontal(v) : this.layout.getSecondaryHorizontal(v);
    }

    public final float getHorizontalPosition(int v, boolean z, boolean z1) {
        int v1 = LayoutCompatKt.getLineForOffset(this.layout, v, z1);
        int v2 = this.layout.getLineStart(v1);
        int v3 = this.layout.getLineEnd(v1);
        if(v != v2 && v != v3) {
            return this.getDownstreamHorizontal(v, z);
        }
        if(v != 0 && v != this.layout.getText().length()) {
            int v4 = this.getParagraphForOffset(v);
            boolean z2 = this.isRtlParagraph(v4);
            Bidi bidi0 = this.analyzeBidi(v4);
            Bidi bidi1 = bidi0 == null ? null : bidi0.createLineBidi(v2, this.lineEndToVisibleEnd(v3));
            boolean z3 = false;
            if(bidi1 != null && bidi1.getRunCount() != 1) {
                int v5 = bidi1.getRunCount();
                BidiRun[] arr_layoutHelper$BidiRun = new BidiRun[v5];
                for(int v6 = 0; v6 < v5; ++v6) {
                    arr_layoutHelper$BidiRun[v6] = new BidiRun(bidi1.getRunStart(v6) + v2, bidi1.getRunLimit(v6) + v2, bidi1.getRunLevel(v6) % 2 == 1);
                }
                int v7 = bidi1.getRunCount();
                byte[] arr_b = new byte[v7];
                for(int v8 = 0; v8 < v7; ++v8) {
                    arr_b[v8] = (byte)bidi1.getRunLevel(v8);
                }
                Bidi.reorderVisually(arr_b, 0, arr_layoutHelper$BidiRun, 0, v5);
                int v9 = -1;
                if(v == v2) {
                    for(int v10 = 0; v10 < v5; ++v10) {
                        if(arr_layoutHelper$BidiRun[v10].getStart() == v) {
                            v9 = v10;
                            break;
                        }
                    }
                    if(z || z2 == arr_layoutHelper$BidiRun[v9].isRtl()) {
                        z2 = !z2;
                    }
                    if(v9 == 0 && z2) {
                        return this.layout.getLineLeft(v1);
                    }
                    if(v9 == ArraysKt.getLastIndex(arr_layoutHelper$BidiRun) && !z2) {
                        return this.layout.getLineRight(v1);
                    }
                    if(z2) {
                        int v11 = arr_layoutHelper$BidiRun[v9 - 1].getStart();
                        return this.layout.getPrimaryHorizontal(v11);
                    }
                    int v12 = arr_layoutHelper$BidiRun[v9 + 1].getStart();
                    return this.layout.getPrimaryHorizontal(v12);
                }
                for(int v13 = 0; v13 < v5; ++v13) {
                    if(arr_layoutHelper$BidiRun[v13].getEnd() == v) {
                        v9 = v13;
                        break;
                    }
                }
                if(!z && z2 != arr_layoutHelper$BidiRun[v9].isRtl()) {
                    z2 = !z2;
                }
                if(v9 == 0 && z2) {
                    return this.layout.getLineLeft(v1);
                }
                if(v9 == ArraysKt.getLastIndex(arr_layoutHelper$BidiRun) && !z2) {
                    return this.layout.getLineRight(v1);
                }
                if(z2) {
                    int v14 = arr_layoutHelper$BidiRun[v9 - 1].getEnd();
                    return this.layout.getPrimaryHorizontal(v14);
                }
                int v15 = arr_layoutHelper$BidiRun[v9 + 1].getEnd();
                return this.layout.getPrimaryHorizontal(v15);
            }
            if(z || z2 == this.layout.isRtlCharAt(v2)) {
                z2 = !z2;
            }
            if(v == v2) {
                return z2 ? this.layout.getLineLeft(v1) : this.layout.getLineRight(v1);
            }
            if(!z2) {
                z3 = true;
            }
            return z3 ? this.layout.getLineLeft(v1) : this.layout.getLineRight(v1);
        }
        return this.getDownstreamHorizontal(v, z);
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int getParagraphEnd(int v) {
        return ((Number)this.paragraphEnds.get(v)).intValue();
    }

    public final int getParagraphForOffset(int v) {
        int v1 = CollectionsKt.binarySearch$default(this.paragraphEnds, v, 0, 0, 6, null);
        return v1 >= 0 ? v1 + 1 : -(v1 + 1);
    }

    public final int getParagraphStart(int v) {
        return v == 0 ? 0 : ((Number)this.paragraphEnds.get(v - 1)).intValue();
    }

    // 去混淆评级： 低(20)
    public final boolean isLineEndSpace(char c) {
        return c == 10 || c == 0x20 || c == 5760 ? true : 0x2000 <= c && c <= 0x200A && c != 0x2007 || (c == 0x205F || c == 0x3000);
    }

    public final boolean isRtlParagraph(int v) {
        int v1 = this.getParagraphStart(v);
        int v2 = this.layout.getLineForOffset(v1);
        return this.layout.getParagraphDirection(v2) == -1;
    }

    private final int lineEndToVisibleEnd(int v) {
        while(v > 0 && this.isLineEndSpace(this.layout.getText().charAt(v - 1))) {
            --v;
        }
        return v;
    }
}

