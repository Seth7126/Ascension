package androidx.compose.ui.text.platform;

import android.graphics.Paint.FontMetricsInt;
import android.text.Spanned;
import android.text.TextUtils.TruncateAt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u00C2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Bg\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0012\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0012\u0010\n\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\b0\u0007\u0012\u0006\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u000E\u001A\u00020\u000F\u0012\u0006\u0010\u0010\u001A\u00020\u0011\u0012\u0006\u0010\u0012\u001A\u00020\u0013\u0012\u0006\u0010\u0014\u001A\u00020\u0015\u00A2\u0006\u0002\u0010\u0016B%\u0012\u0006\u0010\u0017\u001A\u00020\u0018\u0012\u0006\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u000E\u001A\u00020\u000F\u0012\u0006\u0010\u0010\u001A\u00020\u0011\u00A2\u0006\u0002\u0010\u0019J\u0010\u0010L\u001A\u00020M2\u0006\u0010N\u001A\u00020\rH\u0016J\u0010\u0010O\u001A\u0002082\u0006\u0010N\u001A\u00020\rH\u0016J\u0010\u0010P\u001A\u0002082\u0006\u0010N\u001A\u00020\rH\u0016J\u0018\u0010Q\u001A\u00020\u00112\u0006\u0010N\u001A\u00020\r2\u0006\u0010R\u001A\u00020\u000FH\u0016J\u0010\u0010S\u001A\u00020\u00112\u0006\u0010T\u001A\u00020\rH\u0016J\u0018\u0010U\u001A\u00020\r2\u0006\u0010T\u001A\u00020\r2\u0006\u0010V\u001A\u00020\u000FH\u0016J\u0010\u0010W\u001A\u00020\r2\u0006\u0010N\u001A\u00020\rH\u0016J\u0010\u0010X\u001A\u00020\r2\u0006\u0010Y\u001A\u00020\u0011H\u0016J\u0010\u0010Z\u001A\u00020\u00112\u0006\u0010T\u001A\u00020\rH\u0016J\u0010\u0010[\u001A\u00020\u00112\u0006\u0010T\u001A\u00020\rH\u0016J\u0010\u0010\\\u001A\u00020\u00112\u0006\u0010T\u001A\u00020\rH\u0016J\u0010\u0010]\u001A\u00020\r2\u0006\u0010T\u001A\u00020\rH\u0016J\u0010\u0010^\u001A\u00020\u00112\u0006\u0010T\u001A\u00020\rH\u0016J\u0010\u0010_\u001A\u00020\u00112\u0006\u0010T\u001A\u00020\rH\u0016J\u001D\u0010`\u001A\u00020\r2\u0006\u0010a\u001A\u00020bH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001A\u00020M2\u0006\u0010N\u001A\u00020\rH\u0016J\u0018\u0010f\u001A\u00020g2\u0006\u0010h\u001A\u00020\r2\u0006\u0010i\u001A\u00020\rH\u0016J \u0010H\u001A\u00020j2\u0006\u0010N\u001A\u00020\rH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\bk\u0010lJ\u0015\u0010m\u001A\u00020\u000F2\u0006\u0010T\u001A\u00020\rH\u0001\u00A2\u0006\u0002\bnJ\u0010\u0010o\u001A\u00020\u000F2\u0006\u0010T\u001A\u00020\rH\u0016J9\u0010p\u001A\u00020q2\u0006\u0010r\u001A\u00020s2\u0006\u0010t\u001A\u00020u2\b\u0010v\u001A\u0004\u0018\u00010w2\b\u0010x\u001A\u0004\u0018\u00010yH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bz\u0010{R\u001A\u0010\u001A\u001A\u00020\u001B8@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0014\u0010 \u001A\u00020\u000F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b!\u0010\"R\u0011\u0010\u000E\u001A\u00020\u000F\u00A2\u0006\b\n\u0000\u001A\u0004\b#\u0010\"R\u0014\u0010$\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b%\u0010&R\u0014\u0010\'\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b(\u0010&R\u0014\u0010)\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b*\u0010&R\u000E\u0010+\u001A\u00020,X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010-\u001A\u00020\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b.\u0010/R\u0014\u00100\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b1\u0010&R\u0011\u0010\f\u001A\u00020\r\u00A2\u0006\b\n\u0000\u001A\u0004\b2\u0010/R\u0014\u00103\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b4\u0010&R\u0011\u0010\u0017\u001A\u00020\u0018\u00A2\u0006\b\n\u0000\u001A\u0004\b5\u00106R\u001C\u00107\u001A\n\u0012\u0006\u0012\u0004\u0018\u0001080\u0007X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b9\u0010:R\u001A\u0010;\u001A\u00020<8@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\b=\u0010\u001D\u001A\u0004\b>\u0010?R\u001A\u0010@\u001A\u00020A8@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\bB\u0010\u001D\u001A\u0004\bC\u0010DR\u0014\u0010\u0010\u001A\u00020\u0011X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\bE\u0010&R\u001B\u0010F\u001A\u00020G8BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bH\u0010I\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006|"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "maxLines", "", "ellipsis", "", "width", "", "typefaceAdapter", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "density", "Landroidx/compose/ui/unit/Density;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IZFLandroidx/compose/ui/text/platform/TypefaceAdapter;Landroidx/compose/ui/unit/Density;)V", "paragraphIntrinsics", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IZF)V", "charSequence", "", "getCharSequence$ui_text_release$annotations", "()V", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "getEllipsis", "firstBaseline", "getFirstBaseline", "()F", "height", "getHeight", "lastBaseline", "getLastBaseline", "layout", "Landroidx/compose/ui/text/android/TextLayout;", "lineCount", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "placeholderRects", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "textLocale", "Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "getTextLocale$ui_text_release", "()Ljava/util/Locale;", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release$annotations", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getWidth", "wordBoundary", "Landroidx/compose/ui/text/android/selection/WordBoundary;", "getWordBoundary", "()Landroidx/compose/ui/text/android/selection/WordBoundary;", "wordBoundary$delegate", "Lkotlin/Lazy;", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBottom", "lineIndex", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "isEllipsisApplied", "isEllipsisApplied$ui_text_release", "isLineEllipsized", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "color", "Landroidx/compose/ui/graphics/Color;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidParagraph implements Paragraph {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ResolvedTextDirection.values().length];
            arr_v[ResolvedTextDirection.Ltr.ordinal()] = 1;
            arr_v[ResolvedTextDirection.Rtl.ordinal()] = 2;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    private final boolean ellipsis;
    private final TextLayout layout;
    private final int maxLines;
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    private final List placeholderRects;
    private final float width;
    private final Lazy wordBoundary$delegate;

    static {
    }

    public AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics0, int v, boolean z, float f) {
        Intrinsics.checkNotNullParameter(androidParagraphIntrinsics0, "paragraphIntrinsics");
        List list0;
        Rect rect0;
        float f3;
        float f1;
        super();
        this.paragraphIntrinsics = androidParagraphIntrinsics0;
        this.maxLines = v;
        this.ellipsis = z;
        this.width = f;
        if(v < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        if(this.getWidth() < 0.0f) {
            throw new IllegalArgumentException("width should not be negative");
        }
        TextStyle textStyle0 = androidParagraphIntrinsics0.getStyle();
        TextAlign textAlign0 = textStyle0.getTextAlign-buA522U();
        this.layout = new TextLayout(androidParagraphIntrinsics0.getCharSequence$ui_text_release(), this.getWidth(), this.getTextPaint$ui_text_release(), AndroidParagraph_androidKt.toLayoutAlign-AMY3VfE(textStyle0.getTextAlign-buA522U()), (z ? TextUtils.TruncateAt.END : null), androidParagraphIntrinsics0.getTextDirectionHeuristic$ui_text_release(), 1.0f, 0.0f, false, v, 0, 0, ((int)(textAlign0 == null ? false : TextAlign.equals-impl0(textAlign0.unbox-impl(), 4))), null, null, androidParagraphIntrinsics0.getLayoutIntrinsics$ui_text_release(), 0x6D80, null);
        CharSequence charSequence0 = androidParagraphIntrinsics0.getCharSequence$ui_text_release();
        if(charSequence0 instanceof Spanned) {
            Object[] arr_object = ((Spanned)charSequence0).getSpans(0, charSequence0.length(), PlaceholderSpan.class);
            Intrinsics.checkNotNullExpressionValue(arr_object, "getSpans(0, length, PlaceholderSpan::class.java)");
            ArrayList arrayList0 = new ArrayList(arr_object.length);
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                PlaceholderSpan placeholderSpan0 = (PlaceholderSpan)arr_object[v1];
                int v2 = ((Spanned)charSequence0).getSpanStart(placeholderSpan0);
                int v3 = ((Spanned)charSequence0).getSpanEnd(placeholderSpan0);
                int v4 = this.layout.getLineForOffset(v2);
                if(this.layout.getLineEllipsisCount(v4) > 0 && v3 > this.layout.getLineEllipsisOffset(v4) || v3 > this.layout.getLineEnd(v4)) {
                    rect0 = null;
                }
                else {
                    switch(this.getBidiRunDirection(v2)) {
                        case 1: {
                            f1 = this.getHorizontalPosition(v2, true);
                            break;
                        }
                        case 2: {
                            f1 = this.getHorizontalPosition(v2, true) - ((float)placeholderSpan0.getWidthPx());
                            break;
                        }
                        default: {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    float f2 = ((float)placeholderSpan0.getWidthPx()) + f1;
                    TextLayout textLayout0 = this.layout;
                    switch(placeholderSpan0.getVerticalAlign()) {
                        case 0: {
                            f3 = textLayout0.getLineBaseline(v4) - ((float)placeholderSpan0.getHeightPx());
                            break;
                        }
                        case 1: {
                            f3 = textLayout0.getLineTop(v4);
                            break;
                        }
                        case 2: {
                            f3 = textLayout0.getLineBottom(v4) - ((float)placeholderSpan0.getHeightPx());
                            break;
                        }
                        case 3: {
                            f3 = (textLayout0.getLineTop(v4) + textLayout0.getLineBottom(v4) - ((float)placeholderSpan0.getHeightPx())) / 2.0f;
                            break;
                        }
                        case 4: {
                            f3 = ((float)placeholderSpan0.getFontMetrics().ascent) + textLayout0.getLineBaseline(v4);
                            break;
                        }
                        case 5: {
                            f3 = ((float)placeholderSpan0.getFontMetrics().descent) + textLayout0.getLineBaseline(v4) - ((float)placeholderSpan0.getHeightPx());
                            break;
                        }
                        case 6: {
                            Paint.FontMetricsInt paint$FontMetricsInt0 = placeholderSpan0.getFontMetrics();
                            f3 = ((float)((paint$FontMetricsInt0.ascent + paint$FontMetricsInt0.descent - placeholderSpan0.getHeightPx()) / 2)) + textLayout0.getLineBaseline(v4);
                            break;
                        }
                        default: {
                            throw new IllegalStateException("unexpected verticalAlignment");
                        }
                    }
                    rect0 = new Rect(f1, f3, f2, ((float)placeholderSpan0.getHeightPx()) + f3);
                }
                arrayList0.add(rect0);
            }
            list0 = arrayList0;
        }
        else {
            list0 = CollectionsKt.emptyList();
        }
        this.placeholderRects = list0;
        Function0 function00 = new Function0() {
            {
                AndroidParagraph.this = androidParagraph0;
                super(0);
            }

            public final WordBoundary invoke() {
                return new WordBoundary(AndroidParagraph.this.getTextLocale$ui_text_release(), AndroidParagraph.this.layout.getText());
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        this.wordBoundary$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, function00);
    }

    public AndroidParagraph(String s, TextStyle textStyle0, List list0, List list1, int v, boolean z, float f, TypefaceAdapter typefaceAdapter0, Density density0) {
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(textStyle0, "style");
        Intrinsics.checkNotNullParameter(list0, "spanStyles");
        Intrinsics.checkNotNullParameter(list1, "placeholders");
        Intrinsics.checkNotNullParameter(typefaceAdapter0, "typefaceAdapter");
        Intrinsics.checkNotNullParameter(density0, "density");
        this(new AndroidParagraphIntrinsics(s, textStyle0, list0, list1, typefaceAdapter0, density0), v, z, f);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getBidiRunDirection(int v) {
        return this.layout.isRtlCharAt(v) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public Rect getBoundingBox(int v) {
        float f = this.layout.getPrimaryHorizontal(v);
        float f1 = this.layout.getPrimaryHorizontal(v + 1);
        int v1 = this.layout.getLineForOffset(v);
        return new Rect(f, this.layout.getLineTop(v1), f1, this.layout.getLineBottom(v1));
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.paragraphIntrinsics.getCharSequence$ui_text_release();
    }

    public static void getCharSequence$ui_text_release$annotations() {
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public Rect getCursorRect(int v) {
        if(v < 0 || v > this.getCharSequence$ui_text_release().length()) {
            throw new AssertionError("offset(" + v + ") is out of bounds (0," + this.getCharSequence$ui_text_release().length());
        }
        float f = this.layout.getPrimaryHorizontal(v);
        int v1 = this.layout.getLineForOffset(v);
        return new Rect(f, this.layout.getLineTop(v1), f, this.layout.getLineBottom(v1));
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    public final boolean getEllipsis() {
        return this.ellipsis;
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return this.layout.getLineBaseline(0);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return (float)this.layout.getHeight();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int v, boolean z) {
        return z ? this.layout.getPrimaryHorizontal(v) : this.layout.getSecondaryHorizontal(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        int v = this.getLineCount();
        if(this.maxLines < v) {
            return this.layout.getLineBaseline(this.maxLines - 1);
        }
        int v1 = this.getLineCount();
        return this.layout.getLineBaseline(v1 - 1);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int v) {
        return this.layout.getLineBottom(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int v, boolean z) {
        return z ? this.layout.getLineVisibleEnd(v) : this.layout.getLineEnd(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int v) {
        return this.layout.getLineForOffset(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float f) {
        return this.layout.getLineForVertical(((int)f));
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int v) {
        return this.layout.getLineHeight(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int v) {
        return this.layout.getLineLeft(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLineRight(int v) {
        return this.layout.getLineRight(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int getLineStart(int v) {
        return this.layout.getLineStart(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLineTop(int v) {
        return this.layout.getLineTop(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int v) {
        return this.layout.getLineWidth(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public int getOffsetForPosition-k-4lQ0M(long v) {
        int v1 = (int)Offset.getY-impl(v);
        int v2 = this.layout.getLineForVertical(v1);
        float f = Offset.getX-impl(v);
        return this.layout.getOffsetForHorizontal(v2, f);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getParagraphDirection(int v) {
        int v1 = this.layout.getLineForOffset(v);
        return this.layout.getParagraphDirection(v1) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public Path getPathForRange(int v, int v1) {
        if(v < 0 || v > v1 || v1 > this.getCharSequence$ui_text_release().length()) {
            throw new AssertionError("Start(" + v + ") or End(" + v1 + ") is out of Range(0.." + this.getCharSequence$ui_text_release().length() + "), or start > end!");
        }
        android.graphics.Path path0 = new android.graphics.Path();
        this.layout.getSelectionPath(v, v1, path0);
        return AndroidPath_androidKt.asComposePath(path0);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public List getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final Locale getTextLocale$ui_text_release() {
        Locale locale0 = this.paragraphIntrinsics.getTextPaint$ui_text_release().getTextLocale();
        Intrinsics.checkNotNullExpressionValue(locale0, "paragraphIntrinsics.textPaint.textLocale");
        return locale0;
    }

    public static void getTextLocale$ui_text_release$annotations() {
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release();
    }

    public static void getTextPaint$ui_text_release$annotations() {
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return this.width;
    }

    private final WordBoundary getWordBoundary() {
        return (WordBoundary)this.wordBoundary$delegate.getValue();
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public long getWordBoundary--jx7JFs(int v) {
        return TextRangeKt.TextRange(this.getWordBoundary().getWordStart(v), this.getWordBoundary().getWordEnd(v));
    }

    public final boolean isEllipsisApplied$ui_text_release(int v) {
        return this.layout.isEllipsisApplied(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int v) {
        return this.layout.isLineEllipsized(v);
    }

    @Override  // androidx.compose.ui.text.Paragraph
    public void paint-RPmYEkk(Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        this.getTextPaint$ui_text_release().setColor-8_81llA(v);
        this.getTextPaint$ui_text_release().setShadow(shadow0);
        this.getTextPaint$ui_text_release().setTextDecoration(textDecoration0);
        android.graphics.Canvas canvas1 = AndroidCanvas_androidKt.getNativeCanvas(canvas0);
        if(this.getDidExceedMaxLines()) {
            canvas1.save();
            canvas1.clipRect(0.0f, 0.0f, this.getWidth(), this.getHeight());
        }
        this.layout.paint(canvas1);
        if(this.getDidExceedMaxLines()) {
            canvas1.restore();
        }
    }
}

