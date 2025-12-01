package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0012\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0012\u0010\n\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\b0\u0007\u0012\u0006\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u000E\u001A\u00020\u000F¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0011\u001A\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000E\u001A\u00020\u000F¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001A\u00020\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u001AR\u0014\u0010\u001B\u001A\u00020\u001C8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001ER\u0014\u0010\u001F\u001A\u00020\u001C8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b \u0010\u001ER\u001D\u0010\n\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\b0\u0007¢\u0006\b\n\u0000\u001A\u0004\b!\u0010\"R\u001D\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001A\u0004\b#\u0010\"R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b$\u0010%R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b&\u0010\'R\u0014\u0010(\u001A\u00020)X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b*\u0010+R\u0014\u0010,\u001A\u00020-X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b.\u0010/R\u0011\u0010\f\u001A\u00020\r¢\u0006\b\n\u0000\u001A\u0004\b0\u00101¨\u00062"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "typefaceAdapter", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "density", "Landroidx/compose/ui/unit/Density;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/text/platform/TypefaceAdapter;Landroidx/compose/ui/unit/Density;)V", "charSequence", "", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "layoutIntrinsics", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics$ui_text_release", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "maxIntrinsicWidth", "", "getMaxIntrinsicWidth", "()F", "minIntrinsicWidth", "getMinIntrinsicWidth", "getPlaceholders", "()Ljava/util/List;", "getSpanStyles", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "getText", "()Ljava/lang/String;", "textDirectionHeuristic", "", "getTextDirectionHeuristic$ui_text_release", "()I", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTypefaceAdapter", "()Landroidx/compose/ui/text/platform/TypefaceAdapter;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {
    private final CharSequence charSequence;
    private final Density density;
    private final LayoutIntrinsics layoutIntrinsics;
    private final List placeholders;
    private final List spanStyles;
    private final TextStyle style;
    private final String text;
    private final int textDirectionHeuristic;
    private final AndroidTextPaint textPaint;
    private final TypefaceAdapter typefaceAdapter;

    public AndroidParagraphIntrinsics(String s, TextStyle textStyle0, List list0, List list1, TypefaceAdapter typefaceAdapter0, Density density0) {
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(textStyle0, "style");
        Intrinsics.checkNotNullParameter(list0, "spanStyles");
        Intrinsics.checkNotNullParameter(list1, "placeholders");
        Intrinsics.checkNotNullParameter(typefaceAdapter0, "typefaceAdapter");
        Intrinsics.checkNotNullParameter(density0, "density");
        super();
        this.text = s;
        this.style = textStyle0;
        this.spanStyles = list0;
        this.placeholders = list1;
        this.typefaceAdapter = typefaceAdapter0;
        this.density = density0;
        AndroidTextPaint androidTextPaint0 = new AndroidTextPaint(1, density0.getDensity());
        this.textPaint = androidTextPaint0;
        int v = AndroidParagraphIntrinsics_androidKt.resolveTextDirectionHeuristics-9GRLPo0(textStyle0.getTextDirection-mmuk1to(), textStyle0.getLocaleList());
        this.textDirectionHeuristic = v;
        SpanStyle spanStyle0 = TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint0, textStyle0.toSpanStyle(), typefaceAdapter0, density0);
        CharSequence charSequence0 = AndroidParagraphHelper_androidKt.createCharSequence(s, androidTextPaint0.getTextSize(), textStyle0, CollectionsKt.plus(CollectionsKt.listOf(new Range(spanStyle0, 0, s.length())), list0), list1, density0, typefaceAdapter0);
        this.charSequence = charSequence0;
        this.layoutIntrinsics = new LayoutIntrinsics(charSequence0, androidTextPaint0, v);
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final LayoutIntrinsics getLayoutIntrinsics$ui_text_release() {
        return this.layoutIntrinsics;
    }

    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    @Override  // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final List getPlaceholders() {
        return this.placeholders;
    }

    public final List getSpanStyles() {
        return this.spanStyles;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextDirectionHeuristic$ui_text_release() {
        return this.textDirectionHeuristic;
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.textPaint;
    }

    public final TypefaceAdapter getTypefaceAdapter() {
        return this.typefaceAdapter;
    }
}

