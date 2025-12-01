package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Path;
import android.text.BoringLayout.Metrics;
import android.text.Layout.Alignment;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@InternalPlatformTextApi
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u00A7\u0001\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\b\b\u0002\u0010\b\u001A\u00020\t\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B\u0012\b\b\u0002\u0010\f\u001A\u00020\t\u0012\b\b\u0002\u0010\r\u001A\u00020\u0005\u0012\b\b\u0003\u0010\u000E\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001A\u00020\t\u0012\b\b\u0002\u0010\u0012\u001A\u00020\t\u0012\b\b\u0002\u0010\u0013\u001A\u00020\t\u0012\b\b\u0002\u0010\u0014\u001A\u00020\t\u0012\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001A\u00020\u0019\u00A2\u0006\u0002\u0010\u001AJ\u000E\u00103\u001A\u00020\u00052\u0006\u00104\u001A\u00020\tJ\u000E\u00105\u001A\u00020\u00052\u0006\u00104\u001A\u00020\tJ\u000E\u00106\u001A\u00020\t2\u0006\u00107\u001A\u00020\tJ\u000E\u00108\u001A\u00020\t2\u0006\u00107\u001A\u00020\tJ\u000E\u00109\u001A\u00020\t2\u0006\u00107\u001A\u00020\tJ\u000E\u0010:\u001A\u00020\t2\u0006\u0010;\u001A\u00020\tJ\u000E\u0010<\u001A\u00020\t2\u0006\u0010=\u001A\u00020\tJ\u000E\u0010>\u001A\u00020\u00052\u0006\u00107\u001A\u00020\tJ\u000E\u0010?\u001A\u00020\u00052\u0006\u00107\u001A\u00020\tJ\u000E\u0010@\u001A\u00020\u00052\u0006\u00107\u001A\u00020\tJ\u000E\u0010A\u001A\u00020\t2\u0006\u00107\u001A\u00020\tJ\u000E\u0010B\u001A\u00020\u00052\u0006\u00104\u001A\u00020\tJ\u000E\u0010C\u001A\u00020\t2\u0006\u00107\u001A\u00020\tJ\u000E\u0010D\u001A\u00020\u00052\u0006\u00107\u001A\u00020\tJ\u0016\u0010E\u001A\u00020\t2\u0006\u00104\u001A\u00020\t2\u0006\u0010F\u001A\u00020\u0005J\u000E\u0010G\u001A\u00020\t2\u0006\u00104\u001A\u00020\tJ\u000E\u0010H\u001A\u00020\u00052\u0006\u0010;\u001A\u00020\tJ\u000E\u0010I\u001A\u00020\u00052\u0006\u0010;\u001A\u00020\tJ\u001E\u0010J\u001A\u00020K2\u0006\u0010L\u001A\u00020\t2\u0006\u0010M\u001A\u00020\t2\u0006\u0010N\u001A\u00020OJ\u000E\u0010P\u001A\u00020\u00102\u0006\u00107\u001A\u00020\tJ\u000E\u0010Q\u001A\u00020\u00102\u0006\u00107\u001A\u00020\tJ\u000E\u0010R\u001A\u00020\u00102\u0006\u0010;\u001A\u00020\tJ\u000E\u0010S\u001A\u00020K2\u0006\u0010T\u001A\u00020UR\u0011\u0010\u001B\u001A\u00020\u0010\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u001DR\u0011\u0010\u001E\u001A\u00020\t8F\u00A2\u0006\u0006\u001A\u0004\b\u001F\u0010 R\u001C\u0010!\u001A\u00020\"8\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u0011\u0010\u0018\u001A\u00020\u0019\u00A2\u0006\b\n\u0000\u001A\u0004\b\'\u0010(R\u0011\u0010)\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b*\u0010 R\u0011\u0010+\u001A\u00020\u00058F\u00A2\u0006\u0006\u001A\u0004\b,\u0010-R\u0011\u0010.\u001A\u00020\u00058F\u00A2\u0006\u0006\u001A\u0004\b/\u0010-R\u0011\u00100\u001A\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\b1\u00102\u00A8\u0006V"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "charSequence", "", "width", "", "textPaint", "Landroid/text/TextPaint;", "alignment", "", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "includePadding", "", "maxLines", "breakStrategy", "hyphenationFrequency", "justificationMode", "leftIndents", "", "rightIndents", "layoutIntrinsics", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "height", "getHeight", "()I", "layout", "Landroid/text/Layout;", "getLayout$annotations", "()V", "getLayout", "()Landroid/text/Layout;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "lineCount", "getLineCount", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "()F", "minIntrinsicWidth", "getMinIntrinsicWidth", "text", "getText", "()Ljava/lang/CharSequence;", "getLineBaseline", "line", "getLineBottom", "getLineEllipsisCount", "lineIndex", "getLineEllipsisOffset", "getLineEnd", "getLineForOffset", "offset", "getLineForVertical", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineVisibleEnd", "getLineWidth", "getOffsetForHorizontal", "horizontal", "getParagraphDirection", "getPrimaryHorizontal", "getSecondaryHorizontal", "getSelectionPath", "", "start", "end", "dest", "Landroid/graphics/Path;", "isEllipsisApplied", "isLineEllipsized", "isRtlCharAt", "paint", "canvas", "Landroid/graphics/Canvas;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TextLayout {
    private final boolean didExceedMaxLines;
    private final Layout layout;
    private final LayoutIntrinsics layoutIntrinsics;
    private final int lineCount;

    public TextLayout(CharSequence charSequence0, float f, TextPaint textPaint0, int v, TextUtils.TruncateAt textUtils$TruncateAt0, int v1, float f1, float f2, boolean z, int v2, int v3, int v4, int v5, int[] arr_v, int[] arr_v1, LayoutIntrinsics layoutIntrinsics0) {
        Intrinsics.checkNotNullParameter(charSequence0, "charSequence");
        boolean z2;
        Layout layout0;
        Intrinsics.checkNotNullParameter(textPaint0, "textPaint");
        Intrinsics.checkNotNullParameter(layoutIntrinsics0, "layoutIntrinsics");
        super();
        this.layoutIntrinsics = layoutIntrinsics0;
        int v6 = charSequence0.length();
        TextDirectionHeuristic textDirectionHeuristic0 = TextLayoutKt.getTextDirectionHeuristic(v1);
        Layout.Alignment layout$Alignment0 = TextAlignmentAdapter.INSTANCE.get(v);
        boolean z1 = charSequence0 instanceof Spanned && ((Spanned)charSequence0).nextSpanTransition(-1, v6, BaselineShiftSpan.class) < v6;
        BoringLayout.Metrics boringLayout$Metrics0 = layoutIntrinsics0.getBoringMetrics();
        int v7 = (int)(((float)Math.ceil(f)));
        if(boringLayout$Metrics0 == null || layoutIntrinsics0.getMaxIntrinsicWidth() > f || z1) {
            int v8 = charSequence0.length();
            layout0 = StaticLayoutFactory.create$default(StaticLayoutFactory.INSTANCE, charSequence0, 0, v8, textPaint0, v7, textDirectionHeuristic0, layout$Alignment0, v2, textUtils$TruncateAt0, ((int)(((float)Math.ceil(f)))), f1, f2, v5, z, false, v3, v4, arr_v, arr_v1, 0x4000, null);
        }
        else {
            layout0 = BoringLayoutFactory.INSTANCE.create(charSequence0, textPaint0, v7, boringLayout$Metrics0, layout$Alignment0, z, textUtils$TruncateAt0, v7);
        }
        this.layout = layout0;
        int v9 = Math.min(layout0.getLineCount(), v2);
        this.lineCount = v9;
        if(v9 < v2) {
            z2 = false;
        }
        else if(layout0.getEllipsisCount(v9 - 1) > 0 || layout0.getLineEnd(v9 - 1) != charSequence0.length()) {
            z2 = true;
        }
        else {
            z2 = false;
        }
        this.didExceedMaxLines = z2;
    }

    public TextLayout(CharSequence charSequence0, float f, TextPaint textPaint0, int v, TextUtils.TruncateAt textUtils$TruncateAt0, int v1, float f1, float f2, boolean z, int v2, int v3, int v4, int v5, int[] arr_v, int[] arr_v1, LayoutIntrinsics layoutIntrinsics0, int v6, DefaultConstructorMarker defaultConstructorMarker0) {
        int v7 = (v6 & 0x20) == 0 ? v1 : 2;
        this(charSequence0, ((v6 & 2) == 0 ? f : 0.0f), textPaint0, ((v6 & 8) == 0 ? v : 0), ((v6 & 16) == 0 ? textUtils$TruncateAt0 : null), v7, ((v6 & 0x40) == 0 ? f1 : 1.0f), ((v6 & 0x80) == 0 ? f2 : 0.0f), ((v6 & 0x100) == 0 ? z : true), ((v6 & 0x200) == 0 ? v2 : 0x7FFFFFFF), ((v6 & 0x400) == 0 ? v3 : 0), ((v6 & 0x800) == 0 ? v4 : 0), ((v6 & 0x1000) == 0 ? v5 : 0), ((v6 & 0x2000) == 0 ? arr_v : null), ((v6 & 0x4000) == 0 ? arr_v1 : null), ((v6 & 0x8000) == 0 ? layoutIntrinsics0 : new LayoutIntrinsics(charSequence0, textPaint0, v7)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    // 去混淆评级： 低(20)
    public final int getHeight() {
        return this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight();
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public static void getLayout$annotations() {
    }

    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineBaseline(int v) {
        return (float)this.layout.getLineBaseline(v);
    }

    public final float getLineBottom(int v) {
        return (float)this.layout.getLineBottom(v);
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEllipsisCount(int v) {
        return this.layout.getEllipsisCount(v);
    }

    public final int getLineEllipsisOffset(int v) {
        return this.layout.getEllipsisStart(v);
    }

    public final int getLineEnd(int v) {
        return this.layout.getEllipsisStart(v) == 0 ? this.layout.getLineEnd(v) : this.layout.getText().length();
    }

    public final int getLineForOffset(int v) {
        return this.layout.getLineForOffset(v);
    }

    public final int getLineForVertical(int v) {
        return this.layout.getLineForVertical(v);
    }

    public final float getLineHeight(int v) {
        return (float)(this.layout.getLineBottom(v) - this.layout.getLineTop(v));
    }

    public final float getLineLeft(int v) {
        return this.layout.getLineLeft(v);
    }

    public final float getLineRight(int v) {
        return this.layout.getLineRight(v);
    }

    public final int getLineStart(int v) {
        return this.layout.getLineStart(v);
    }

    public final float getLineTop(int v) {
        return (float)this.layout.getLineTop(v);
    }

    public final int getLineVisibleEnd(int v) {
        if(this.layout.getEllipsisStart(v) == 0) {
            return this.layout.getLineVisibleEnd(v);
        }
        int v1 = this.layout.getLineStart(v);
        return this.layout.getEllipsisStart(v) + v1;
    }

    public final float getLineWidth(int v) {
        return this.layout.getLineWidth(v);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int v, float f) {
        return this.layout.getOffsetForHorizontal(v, f);
    }

    public final int getParagraphDirection(int v) {
        return this.layout.getParagraphDirection(v);
    }

    public final float getPrimaryHorizontal(int v) {
        return this.layout.getPrimaryHorizontal(v);
    }

    public final float getSecondaryHorizontal(int v) {
        return this.layout.getSecondaryHorizontal(v);
    }

    public final void getSelectionPath(int v, int v1, Path path0) {
        Intrinsics.checkNotNullParameter(path0, "dest");
        this.layout.getSelectionPath(v, v1, path0);
    }

    public final CharSequence getText() {
        CharSequence charSequence0 = this.layout.getText();
        Intrinsics.checkNotNullExpressionValue(charSequence0, "layout.text");
        return charSequence0;
    }

    public final boolean isEllipsisApplied(int v) {
        return this.layout.getEllipsisCount(v) > 0;
    }

    public final boolean isLineEllipsized(int v) {
        return this.layout.getEllipsisStart(v) != 0;
    }

    public final boolean isRtlCharAt(int v) {
        return this.layout.isRtlCharAt(v);
    }

    public final void paint(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        this.layout.draw(canvas0);
    }
}

