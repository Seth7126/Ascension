package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u008A\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 W2\u00020\u0001:\u0001WB\u0017\b\u0010\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\u0002\u0010\u0006B\u00D6\u0001\u0012\b\b\u0002\u0010\u0007\u001A\u00020\b\u0012\b\b\u0002\u0010\t\u001A\u00020\n\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u000E\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001A\u00020\n\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u001B\u0012\b\b\u0002\u0010\u001C\u001A\u00020\b\u0012\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001E\u0012\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001A\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001A\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001A\u00020\n\u0012\n\b\u0002\u0010&\u001A\u0004\u0018\u00010\'\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010(J\u00E1\u0001\u0010J\u001A\u00020\u00002\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\n2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001A\u00020\n2\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u001B2\b\b\u0002\u0010\u001C\u001A\u00020\b2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001E2\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001A\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001A\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001A\u00020\n2\n\b\u0002\u0010&\u001A\u0004\u0018\u00010\'\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bK\u0010LJ\u0013\u0010M\u001A\u00020N2\b\u0010O\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010P\u001A\u00020QH\u0016J\u0010\u0010R\u001A\u00020\u00002\u0006\u0010O\u001A\u00020\u0005H\u0007J\u0010\u0010R\u001A\u00020\u00002\u0006\u0010O\u001A\u00020\u0003H\u0007J\u0014\u0010R\u001A\u00020\u00002\n\b\u0002\u0010O\u001A\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010S\u001A\u00020\u00002\u0006\u0010O\u001A\u00020\u0005H\u0087\u0002J\u0011\u0010S\u001A\u00020\u00002\u0006\u0010O\u001A\u00020\u0003H\u0087\u0002J\u0011\u0010S\u001A\u00020\u00002\u0006\u0010O\u001A\u00020\u0000H\u0087\u0002J\b\u0010T\u001A\u00020\u0005H\u0007J\b\u0010U\u001A\u00020\u0003H\u0007J\b\u0010V\u001A\u00020\u0014H\u0016R\u001C\u0010\u001C\u001A\u00020\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010+\u001A\u0004\b)\u0010*R\u001C\u0010\u0016\u001A\u0004\u0018\u00010\u0017\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\b\n\u0000\u001A\u0004\b,\u0010-R\u001C\u0010\u0007\u001A\u00020\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010+\u001A\u0004\b.\u0010*R\u0013\u0010\u0011\u001A\u0004\u0018\u00010\u0012\u00A2\u0006\b\n\u0000\u001A\u0004\b/\u00100R\u0013\u0010\u0013\u001A\u0004\u0018\u00010\u0014\u00A2\u0006\b\n\u0000\u001A\u0004\b1\u00102R\u001C\u0010\t\u001A\u00020\n\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010+\u001A\u0004\b3\u0010*R\u001C\u0010\r\u001A\u0004\u0018\u00010\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\b\n\u0000\u001A\u0004\b4\u00105R\u001C\u0010\u000F\u001A\u0004\u0018\u00010\u0010\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\b\n\u0000\u001A\u0004\b6\u00107R\u0013\u0010\u000B\u001A\u0004\u0018\u00010\f\u00A2\u0006\b\n\u0000\u001A\u0004\b8\u00109R\u001C\u0010\u0015\u001A\u00020\n\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010+\u001A\u0004\b:\u0010*R\u001C\u0010%\u001A\u00020\n\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010+\u001A\u0004\b;\u0010*R\u0013\u0010\u001A\u001A\u0004\u0018\u00010\u001B\u00A2\u0006\b\n\u0000\u001A\u0004\b<\u0010=R\u0013\u0010\u001F\u001A\u0004\u0018\u00010 \u00A2\u0006\b\n\u0000\u001A\u0004\b>\u0010?R\u001C\u0010!\u001A\u0004\u0018\u00010\"\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\b\n\u0000\u001A\u0004\b@\u0010AR\u0013\u0010\u001D\u001A\u0004\u0018\u00010\u001E\u00A2\u0006\b\n\u0000\u001A\u0004\bB\u0010CR\u001C\u0010#\u001A\u0004\u0018\u00010$\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\b\n\u0000\u001A\u0004\bD\u0010ER\u0013\u0010\u0018\u001A\u0004\u0018\u00010\u0019\u00A2\u0006\b\n\u0000\u001A\u0004\bF\u0010GR\u0013\u0010&\u001A\u0004\u0018\u00010\'\u00A2\u0006\b\n\u0000\u001A\u0004\bH\u0010I\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006X"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "paragraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)V", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getColor-0d7_KjU", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "()Ljava/lang/String;", "getFontSize-XSAIIZE", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getLetterSpacing-XSAIIZE", "getLineHeight-XSAIIZE", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "copy", "copy-HL5avdY", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/TextStyle;", "equals", "", "other", "hashCode", "", "merge", "plus", "toParagraphStyle", "toSpanStyle", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TextStyle {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/TextStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/TextStyle;", "getDefault$annotations", "getDefault", "()Landroidx/compose/ui/text/TextStyle;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final TextStyle getDefault() {
            return TextStyle.Default;
        }

        public static void getDefault$annotations() {
        }
    }

    public static final Companion Companion;
    private static final TextStyle Default;
    private final long background;
    private final BaselineShift baselineShift;
    private final long color;
    private final FontFamily fontFamily;
    private final String fontFeatureSettings;
    private final long fontSize;
    private final FontStyle fontStyle;
    private final FontSynthesis fontSynthesis;
    private final FontWeight fontWeight;
    private final long letterSpacing;
    private final long lineHeight;
    private final LocaleList localeList;
    private final Shadow shadow;
    private final TextAlign textAlign;
    private final TextDecoration textDecoration;
    private final TextDirection textDirection;
    private final TextGeometricTransform textGeometricTransform;
    private final TextIndent textIndent;

    static {
        TextStyle.Companion = new Companion(null);
        TextStyle.Default = new TextStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 0x3FFFF, null);
    }

    private TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0) {
        this.color = v;
        this.fontSize = v1;
        this.fontWeight = fontWeight0;
        this.fontStyle = fontStyle0;
        this.fontSynthesis = fontSynthesis0;
        this.fontFamily = fontFamily0;
        this.fontFeatureSettings = s;
        this.letterSpacing = v2;
        this.baselineShift = baselineShift0;
        this.textGeometricTransform = textGeometricTransform0;
        this.localeList = localeList0;
        this.background = v3;
        this.textDecoration = textDecoration0;
        this.shadow = shadow0;
        this.textAlign = textAlign0;
        this.textDirection = textDirection0;
        this.lineHeight = v4;
        this.textIndent = textIndent0;
        if(!TextUnitKt.isUnspecified--R2X_6o(this.getLineHeight-XSAIIZE()) && TextUnit.getValue-impl(this.getLineHeight-XSAIIZE()) < 0.0f) {
            throw new IllegalStateException(("lineHeight can\'t be negative (" + TextUnit.getValue-impl(this.getLineHeight-XSAIIZE()) + ')').toString());
        }
    }

    // 去混淆评级： 中等(50)
    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v5 & 1) == 0 ? v : 16L), ((v5 & 2) == 0 ? v1 : 0x7FC00000L), ((v5 & 4) == 0 ? fontWeight0 : null), ((v5 & 8) == 0 ? fontStyle0 : null), ((v5 & 16) == 0 ? fontSynthesis0 : null), ((v5 & 0x20) == 0 ? fontFamily0 : null), ((v5 & 0x40) == 0 ? s : null), ((v5 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v5 & 0x100) == 0 ? baselineShift0 : null), ((v5 & 0x200) == 0 ? textGeometricTransform0 : null), ((v5 & 0x400) == 0 ? localeList0 : null), ((v5 & 0x800) == 0 ? v3 : 16L), ((v5 & 0x1000) == 0 ? textDecoration0 : null), ((v5 & 0x2000) == 0 ? shadow0 : null), ((v5 & 0x4000) == 0 ? textAlign0 : null), ((v5 & 0x8000) == 0 ? textDirection0 : null), ((v5 & 0x10000) == 0 ? v4 : 0x7FC00000L), ((v5 & 0x20000) == 0 ? textIndent0 : null), null);
    }

    public TextStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, textAlign0, textDirection0, v4, textIndent0);
    }

    public TextStyle(SpanStyle spanStyle0, ParagraphStyle paragraphStyle0) {
        Intrinsics.checkNotNullParameter(spanStyle0, "spanStyle");
        Intrinsics.checkNotNullParameter(paragraphStyle0, "paragraphStyle");
        this(spanStyle0.getColor-0d7_KjU(), spanStyle0.getFontSize-XSAIIZE(), spanStyle0.getFontWeight(), spanStyle0.getFontStyle-4Lr2A7w(), spanStyle0.getFontSynthesis-ZQGJjVo(), spanStyle0.getFontFamily(), spanStyle0.getFontFeatureSettings(), spanStyle0.getLetterSpacing-XSAIIZE(), spanStyle0.getBaselineShift-5SSeXJ0(), spanStyle0.getTextGeometricTransform(), spanStyle0.getLocaleList(), spanStyle0.getBackground-0d7_KjU(), spanStyle0.getTextDecoration(), spanStyle0.getShadow(), paragraphStyle0.getTextAlign-buA522U(), paragraphStyle0.getTextDirection-mmuk1to(), paragraphStyle0.getLineHeight-XSAIIZE(), paragraphStyle0.getTextIndent(), null);
    }

    public final TextStyle copy-HL5avdY(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0) {
        return new TextStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, textAlign0, textDirection0, v4, textIndent0, null);
    }

    public static TextStyle copy-HL5avdY$default(TextStyle textStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, TextAlign textAlign0, TextDirection textDirection0, long v4, TextIndent textIndent0, int v5, Object object0) {
        long v6 = (v5 & 1) == 0 ? v : textStyle0.getColor-0d7_KjU();
        long v7 = (v5 & 2) == 0 ? v1 : textStyle0.getFontSize-XSAIIZE();
        FontWeight fontWeight1 = (v5 & 4) == 0 ? fontWeight0 : textStyle0.fontWeight;
        FontStyle fontStyle1 = (v5 & 8) == 0 ? fontStyle0 : textStyle0.getFontStyle-4Lr2A7w();
        FontSynthesis fontSynthesis1 = (v5 & 16) == 0 ? fontSynthesis0 : textStyle0.getFontSynthesis-ZQGJjVo();
        FontFamily fontFamily1 = (v5 & 0x20) == 0 ? fontFamily0 : textStyle0.fontFamily;
        String s1 = (v5 & 0x40) == 0 ? s : textStyle0.fontFeatureSettings;
        long v8 = (v5 & 0x80) == 0 ? v2 : textStyle0.getLetterSpacing-XSAIIZE();
        BaselineShift baselineShift1 = (v5 & 0x100) == 0 ? baselineShift0 : textStyle0.getBaselineShift-5SSeXJ0();
        TextGeometricTransform textGeometricTransform1 = (v5 & 0x200) == 0 ? textGeometricTransform0 : textStyle0.textGeometricTransform;
        LocaleList localeList1 = (v5 & 0x400) == 0 ? localeList0 : textStyle0.localeList;
        long v9 = (v5 & 0x800) == 0 ? v3 : textStyle0.getBackground-0d7_KjU();
        TextDecoration textDecoration1 = (v5 & 0x1000) == 0 ? textDecoration0 : textStyle0.textDecoration;
        Shadow shadow1 = (v5 & 0x2000) == 0 ? shadow0 : textStyle0.shadow;
        TextAlign textAlign1 = (v5 & 0x4000) == 0 ? textAlign0 : textStyle0.getTextAlign-buA522U();
        TextDirection textDirection1 = (v5 & 0x8000) == 0 ? textDirection0 : textStyle0.getTextDirection-mmuk1to();
        long v10 = (v5 & 0x10000) == 0 ? v4 : textStyle0.getLineHeight-XSAIIZE();
        return (v5 & 0x20000) == 0 ? textStyle0.copy-HL5avdY(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, textAlign1, textDirection1, v10, textIndent0) : textStyle0.copy-HL5avdY(v6, v7, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v8, baselineShift1, textGeometricTransform1, localeList1, v9, textDecoration1, shadow1, textAlign1, textDirection1, v10, textStyle0.textIndent);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextStyle)) {
            return false;
        }
        if(!Color.equals-impl0(this.getColor-0d7_KjU(), ((TextStyle)object0).getColor-0d7_KjU())) {
            return false;
        }
        if(!TextUnit.equals-impl0(this.getFontSize-XSAIIZE(), ((TextStyle)object0).getFontSize-XSAIIZE())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.fontWeight, ((TextStyle)object0).fontWeight)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getFontStyle-4Lr2A7w(), ((TextStyle)object0).getFontStyle-4Lr2A7w())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getFontSynthesis-ZQGJjVo(), ((TextStyle)object0).getFontSynthesis-ZQGJjVo())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.fontFamily, ((TextStyle)object0).fontFamily)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.fontFeatureSettings, ((TextStyle)object0).fontFeatureSettings)) {
            return false;
        }
        if(!TextUnit.equals-impl0(this.getLetterSpacing-XSAIIZE(), ((TextStyle)object0).getLetterSpacing-XSAIIZE())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getBaselineShift-5SSeXJ0(), ((TextStyle)object0).getBaselineShift-5SSeXJ0())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.textGeometricTransform, ((TextStyle)object0).textGeometricTransform)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.localeList, ((TextStyle)object0).localeList)) {
            return false;
        }
        if(!Color.equals-impl0(this.getBackground-0d7_KjU(), ((TextStyle)object0).getBackground-0d7_KjU())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.textDecoration, ((TextStyle)object0).textDecoration)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.shadow, ((TextStyle)object0).shadow)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getTextAlign-buA522U(), ((TextStyle)object0).getTextAlign-buA522U())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getTextDirection-mmuk1to(), ((TextStyle)object0).getTextDirection-mmuk1to())) {
            return false;
        }
        return TextUnit.equals-impl0(this.getLineHeight-XSAIIZE(), ((TextStyle)object0).getLineHeight-XSAIIZE()) ? Intrinsics.areEqual(this.textIndent, ((TextStyle)object0).textIndent) : false;
    }

    public final long getBackground-0d7_KjU() {
        return this.background;
    }

    public final BaselineShift getBaselineShift-5SSeXJ0() {
        return this.baselineShift;
    }

    public final long getColor-0d7_KjU() {
        return this.color;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public final long getFontSize-XSAIIZE() {
        return this.fontSize;
    }

    public final FontStyle getFontStyle-4Lr2A7w() {
        return this.fontStyle;
    }

    public final FontSynthesis getFontSynthesis-ZQGJjVo() {
        return this.fontSynthesis;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final long getLetterSpacing-XSAIIZE() {
        return this.letterSpacing;
    }

    public final long getLineHeight-XSAIIZE() {
        return this.lineHeight;
    }

    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final TextAlign getTextAlign-buA522U() {
        return this.textAlign;
    }

    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public final TextDirection getTextDirection-mmuk1to() {
        return this.textDirection;
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    @Override
    public int hashCode() {
        int v = Color.hashCode-impl(this.getColor-0d7_KjU());
        int v1 = TextUnit.hashCode-impl(this.getFontSize-XSAIIZE());
        int v2 = 0;
        int v3 = this.fontWeight == null ? 0 : this.fontWeight.hashCode();
        FontStyle fontStyle0 = this.getFontStyle-4Lr2A7w();
        int v4 = fontStyle0 == null ? 0 : FontStyle.hashCode-impl(fontStyle0.unbox-impl());
        FontSynthesis fontSynthesis0 = this.getFontSynthesis-ZQGJjVo();
        int v5 = fontSynthesis0 == null ? 0 : FontSynthesis.hashCode-impl(fontSynthesis0.unbox-impl());
        int v6 = this.fontFamily == null ? 0 : this.fontFamily.hashCode();
        int v7 = this.fontFeatureSettings == null ? 0 : this.fontFeatureSettings.hashCode();
        int v8 = TextUnit.hashCode-impl(this.getLetterSpacing-XSAIIZE());
        BaselineShift baselineShift0 = this.getBaselineShift-5SSeXJ0();
        int v9 = baselineShift0 == null ? 0 : BaselineShift.hashCode-impl(baselineShift0.unbox-impl());
        int v10 = this.textGeometricTransform == null ? 0 : this.textGeometricTransform.hashCode();
        int v11 = this.localeList == null ? 0 : this.localeList.hashCode();
        int v12 = Color.hashCode-impl(this.getBackground-0d7_KjU());
        int v13 = this.textDecoration == null ? 0 : this.textDecoration.hashCode();
        int v14 = this.shadow == null ? 0 : this.shadow.hashCode();
        TextAlign textAlign0 = this.getTextAlign-buA522U();
        int v15 = textAlign0 == null ? 0 : TextAlign.hashCode-impl(textAlign0.unbox-impl());
        TextDirection textDirection0 = this.getTextDirection-mmuk1to();
        int v16 = textDirection0 == null ? 0 : TextDirection.hashCode-impl(textDirection0.unbox-impl());
        int v17 = TextUnit.hashCode-impl(this.getLineHeight-XSAIIZE());
        TextIndent textIndent0 = this.textIndent;
        if(textIndent0 != null) {
            v2 = textIndent0.hashCode();
        }
        return ((((((((((((((((v * 0x1F + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v15) * 0x1F + v16) * 0x1F + v17) * 0x1F + v2;
    }

    public final TextStyle merge(ParagraphStyle paragraphStyle0) {
        Intrinsics.checkNotNullParameter(paragraphStyle0, "other");
        return new TextStyle(this.toSpanStyle(), this.toParagraphStyle().merge(paragraphStyle0));
    }

    public final TextStyle merge(SpanStyle spanStyle0) {
        Intrinsics.checkNotNullParameter(spanStyle0, "other");
        return new TextStyle(this.toSpanStyle().merge(spanStyle0), this.toParagraphStyle());
    }

    public final TextStyle merge(TextStyle textStyle0) {
        return textStyle0 == null || Intrinsics.areEqual(textStyle0, TextStyle.Default) ? this : new TextStyle(this.toSpanStyle().merge(textStyle0.toSpanStyle()), this.toParagraphStyle().merge(textStyle0.toParagraphStyle()));
    }

    public static TextStyle merge$default(TextStyle textStyle0, TextStyle textStyle1, int v, Object object0) {
        if((v & 1) != 0) {
            textStyle1 = null;
        }
        return textStyle0.merge(textStyle1);
    }

    public final TextStyle plus(ParagraphStyle paragraphStyle0) {
        Intrinsics.checkNotNullParameter(paragraphStyle0, "other");
        return this.merge(paragraphStyle0);
    }

    public final TextStyle plus(SpanStyle spanStyle0) {
        Intrinsics.checkNotNullParameter(spanStyle0, "other");
        return this.merge(spanStyle0);
    }

    public final TextStyle plus(TextStyle textStyle0) {
        Intrinsics.checkNotNullParameter(textStyle0, "other");
        return this.merge(textStyle0);
    }

    public final ParagraphStyle toParagraphStyle() {
        return new ParagraphStyle(this.getTextAlign-buA522U(), this.getTextDirection-mmuk1to(), this.getLineHeight-XSAIIZE(), this.textIndent, null);
    }

    public final SpanStyle toSpanStyle() {
        return new SpanStyle(this.getColor-0d7_KjU(), this.getFontSize-XSAIIZE(), this.fontWeight, this.getFontStyle-4Lr2A7w(), this.getFontSynthesis-ZQGJjVo(), this.fontFamily, this.fontFeatureSettings, this.getLetterSpacing-XSAIIZE(), this.getBaselineShift-5SSeXJ0(), this.textGeometricTransform, this.localeList, this.getBackground-0d7_KjU(), this.textDecoration, this.shadow, null);
    }

    @Override
    public String toString() {
        return "TextStyle(color=" + Color.toString-impl(this.getColor-0d7_KjU()) + ", fontSize=" + TextUnit.toString-impl(this.getFontSize-XSAIIZE()) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.getFontStyle-4Lr2A7w() + ", fontSynthesis=" + this.getFontSynthesis-ZQGJjVo() + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + TextUnit.toString-impl(this.getLetterSpacing-XSAIIZE()) + ", baselineShift=" + this.getBaselineShift-5SSeXJ0() + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + Color.toString-impl(this.getBackground-0d7_KjU()) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", textAlign=" + this.getTextAlign-buA522U() + ", textDirection=" + this.getTextDirection-mmuk1to() + ", lineHeight=" + TextUnit.toString-impl(this.getLineHeight-XSAIIZE()) + ", textIndent=" + this.textIndent + ')';
    }
}

