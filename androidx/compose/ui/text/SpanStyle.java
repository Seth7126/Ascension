package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u00A8\u0001\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u001B\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u001CJ\u00B3\u0001\u00107\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u00052\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001A\u00020\u00032\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u001B\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b8\u00109J\u0013\u0010:\u001A\u00020;2\b\u0010<\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010=\u001A\u00020>H\u0016J\u0014\u0010?\u001A\u00020\u00002\n\b\u0002\u0010<\u001A\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010@\u001A\u00020\u00002\u0006\u0010<\u001A\u00020\u0000H\u0087\u0002J\b\u0010A\u001A\u00020\u000FH\u0016R\u001C\u0010\u0017\u001A\u00020\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u001F\u001A\u0004\b\u001D\u0010\u001ER\u001C\u0010\u0011\u001A\u0004\u0018\u00010\u0012\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\b\n\u0000\u001A\u0004\b \u0010!R\u001C\u0010\u0002\u001A\u00020\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u001F\u001A\u0004\b\"\u0010\u001ER\u0013\u0010\f\u001A\u0004\u0018\u00010\r\u00A2\u0006\b\n\u0000\u001A\u0004\b#\u0010$R\u0013\u0010\u000E\u001A\u0004\u0018\u00010\u000F\u00A2\u0006\b\n\u0000\u001A\u0004\b%\u0010&R\u001C\u0010\u0004\u001A\u00020\u0005\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u001F\u001A\u0004\b\'\u0010\u001ER\u001C\u0010\b\u001A\u0004\u0018\u00010\t\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\b\n\u0000\u001A\u0004\b(\u0010)R\u001C\u0010\n\u001A\u0004\u0018\u00010\u000B\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\b\n\u0000\u001A\u0004\b*\u0010+R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b,\u0010-R\u001C\u0010\u0010\u001A\u00020\u0005\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u001F\u001A\u0004\b.\u0010\u001ER\u0013\u0010\u0015\u001A\u0004\u0018\u00010\u0016\u00A2\u0006\b\n\u0000\u001A\u0004\b/\u00100R\u0013\u0010\u001A\u001A\u0004\u0018\u00010\u001B\u00A2\u0006\b\n\u0000\u001A\u0004\b1\u00102R\u0013\u0010\u0018\u001A\u0004\u0018\u00010\u0019\u00A2\u0006\b\n\u0000\u001A\u0004\b3\u00104R\u0013\u0010\u0013\u001A\u0004\u0018\u00010\u0014\u00A2\u0006\b\n\u0000\u001A\u0004\b5\u00106\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006B"}, d2 = {"Landroidx/compose/ui/text/SpanStyle;", "", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getColor-0d7_KjU", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "()Ljava/lang/String;", "getFontSize-XSAIIZE", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getLetterSpacing-XSAIIZE", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "copy", "copy-IuqyXdg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;)Landroidx/compose/ui/text/SpanStyle;", "equals", "", "other", "hashCode", "", "merge", "plus", "toString", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SpanStyle {
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
    private final LocaleList localeList;
    private final Shadow shadow;
    private final TextDecoration textDecoration;
    private final TextGeometricTransform textGeometricTransform;

    private SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0) {
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
    }

    // 去混淆评级： 低(40)
    public SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v4 & 1) == 0 ? v : 16L), ((v4 & 2) == 0 ? v1 : 0x7FC00000L), ((v4 & 4) == 0 ? fontWeight0 : null), ((v4 & 8) == 0 ? fontStyle0 : null), ((v4 & 16) == 0 ? fontSynthesis0 : null), ((v4 & 0x20) == 0 ? fontFamily0 : null), ((v4 & 0x40) == 0 ? s : null), ((v4 & 0x80) == 0 ? v2 : 0x7FC00000L), ((v4 & 0x100) == 0 ? baselineShift0 : null), ((v4 & 0x200) == 0 ? textGeometricTransform0 : null), ((v4 & 0x400) == 0 ? localeList0 : null), ((v4 & 0x800) == 0 ? v3 : 16L), ((v4 & 0x1000) == 0 ? textDecoration0 : null), ((v4 & 0x2000) == 0 ? shadow0 : null), null);
    }

    public SpanStyle(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0);
    }

    public final SpanStyle copy-IuqyXdg(long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0) {
        return new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, fontFamily0, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, shadow0, null);
    }

    public static SpanStyle copy-IuqyXdg$default(SpanStyle spanStyle0, long v, long v1, FontWeight fontWeight0, FontStyle fontStyle0, FontSynthesis fontSynthesis0, FontFamily fontFamily0, String s, long v2, BaselineShift baselineShift0, TextGeometricTransform textGeometricTransform0, LocaleList localeList0, long v3, TextDecoration textDecoration0, Shadow shadow0, int v4, Object object0) {
        long v5 = (v4 & 1) == 0 ? v : spanStyle0.getColor-0d7_KjU();
        long v6 = (v4 & 2) == 0 ? v1 : spanStyle0.getFontSize-XSAIIZE();
        FontWeight fontWeight1 = (v4 & 4) == 0 ? fontWeight0 : spanStyle0.fontWeight;
        FontStyle fontStyle1 = (v4 & 8) == 0 ? fontStyle0 : spanStyle0.getFontStyle-4Lr2A7w();
        FontSynthesis fontSynthesis1 = (v4 & 16) == 0 ? fontSynthesis0 : spanStyle0.getFontSynthesis-ZQGJjVo();
        FontFamily fontFamily1 = (v4 & 0x20) == 0 ? fontFamily0 : spanStyle0.fontFamily;
        String s1 = (v4 & 0x40) == 0 ? s : spanStyle0.fontFeatureSettings;
        long v7 = (v4 & 0x80) == 0 ? v2 : spanStyle0.getLetterSpacing-XSAIIZE();
        BaselineShift baselineShift1 = (v4 & 0x100) == 0 ? baselineShift0 : spanStyle0.getBaselineShift-5SSeXJ0();
        TextGeometricTransform textGeometricTransform1 = (v4 & 0x200) == 0 ? textGeometricTransform0 : spanStyle0.textGeometricTransform;
        LocaleList localeList1 = (v4 & 0x400) == 0 ? localeList0 : spanStyle0.localeList;
        long v8 = (v4 & 0x800) == 0 ? v3 : spanStyle0.getBackground-0d7_KjU();
        TextDecoration textDecoration1 = (v4 & 0x1000) == 0 ? textDecoration0 : spanStyle0.textDecoration;
        return (v4 & 0x2000) == 0 ? spanStyle0.copy-IuqyXdg(v5, v6, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v7, baselineShift1, textGeometricTransform1, localeList1, v8, textDecoration1, shadow0) : spanStyle0.copy-IuqyXdg(v5, v6, fontWeight1, fontStyle1, fontSynthesis1, fontFamily1, s1, v7, baselineShift1, textGeometricTransform1, localeList1, v8, textDecoration1, spanStyle0.shadow);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SpanStyle)) {
            return false;
        }
        if(!Color.equals-impl0(this.getColor-0d7_KjU(), ((SpanStyle)object0).getColor-0d7_KjU())) {
            return false;
        }
        if(!TextUnit.equals-impl0(this.getFontSize-XSAIIZE(), ((SpanStyle)object0).getFontSize-XSAIIZE())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.fontWeight, ((SpanStyle)object0).fontWeight)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getFontStyle-4Lr2A7w(), ((SpanStyle)object0).getFontStyle-4Lr2A7w())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getFontSynthesis-ZQGJjVo(), ((SpanStyle)object0).getFontSynthesis-ZQGJjVo())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.fontFamily, ((SpanStyle)object0).fontFamily)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.fontFeatureSettings, ((SpanStyle)object0).fontFeatureSettings)) {
            return false;
        }
        if(!TextUnit.equals-impl0(this.getLetterSpacing-XSAIIZE(), ((SpanStyle)object0).getLetterSpacing-XSAIIZE())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getBaselineShift-5SSeXJ0(), ((SpanStyle)object0).getBaselineShift-5SSeXJ0())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.textGeometricTransform, ((SpanStyle)object0).textGeometricTransform)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.localeList, ((SpanStyle)object0).localeList)) {
            return false;
        }
        if(!Color.equals-impl0(this.getBackground-0d7_KjU(), ((SpanStyle)object0).getBackground-0d7_KjU())) {
            return false;
        }
        return Intrinsics.areEqual(this.textDecoration, ((SpanStyle)object0).textDecoration) ? Intrinsics.areEqual(this.shadow, ((SpanStyle)object0).shadow) : false;
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

    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
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
        Shadow shadow0 = this.shadow;
        if(shadow0 != null) {
            v2 = shadow0.hashCode();
        }
        return ((((((((((((v * 0x1F + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v2;
    }

    // 去混淆评级： 低(30)
    public final SpanStyle merge(SpanStyle spanStyle0) {
        if(spanStyle0 == null) {
            return this;
        }
        long v = spanStyle0.getColor-0d7_KjU();
        if(v == 16L) {
            v = this.getColor-0d7_KjU();
        }
        return new SpanStyle(v, (TextUnitKt.isUnspecified--R2X_6o(spanStyle0.getFontSize-XSAIIZE()) ? this.getFontSize-XSAIIZE() : spanStyle0.getFontSize-XSAIIZE()), (spanStyle0.fontWeight == null ? this.fontWeight : spanStyle0.fontWeight), (spanStyle0.getFontStyle-4Lr2A7w() == null ? this.getFontStyle-4Lr2A7w() : spanStyle0.getFontStyle-4Lr2A7w()), (spanStyle0.getFontSynthesis-ZQGJjVo() == null ? this.getFontSynthesis-ZQGJjVo() : spanStyle0.getFontSynthesis-ZQGJjVo()), (spanStyle0.fontFamily == null ? this.fontFamily : spanStyle0.fontFamily), (spanStyle0.fontFeatureSettings == null ? this.fontFeatureSettings : spanStyle0.fontFeatureSettings), (TextUnitKt.isUnspecified--R2X_6o(spanStyle0.getLetterSpacing-XSAIIZE()) ? this.getLetterSpacing-XSAIIZE() : spanStyle0.getLetterSpacing-XSAIIZE()), (spanStyle0.getBaselineShift-5SSeXJ0() == null ? this.getBaselineShift-5SSeXJ0() : spanStyle0.getBaselineShift-5SSeXJ0()), (spanStyle0.textGeometricTransform == null ? this.textGeometricTransform : spanStyle0.textGeometricTransform), (spanStyle0.localeList == null ? this.localeList : spanStyle0.localeList), (spanStyle0.getBackground-0d7_KjU() == 16L ? this.getBackground-0d7_KjU() : spanStyle0.getBackground-0d7_KjU()), (spanStyle0.textDecoration == null ? this.textDecoration : spanStyle0.textDecoration), (spanStyle0.shadow == null ? this.shadow : spanStyle0.shadow), null);
    }

    public static SpanStyle merge$default(SpanStyle spanStyle0, SpanStyle spanStyle1, int v, Object object0) {
        if((v & 1) != 0) {
            spanStyle1 = null;
        }
        return spanStyle0.merge(spanStyle1);
    }

    public final SpanStyle plus(SpanStyle spanStyle0) {
        Intrinsics.checkNotNullParameter(spanStyle0, "other");
        return this.merge(spanStyle0);
    }

    @Override
    public String toString() {
        return "SpanStyle(color=" + Color.toString-impl(this.getColor-0d7_KjU()) + ", fontSize=" + TextUnit.toString-impl(this.getFontSize-XSAIIZE()) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.getFontStyle-4Lr2A7w() + ", fontSynthesis=" + this.getFontSynthesis-ZQGJjVo() + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + TextUnit.toString-impl(this.getLetterSpacing-XSAIIZE()) + ", baselineShift=" + this.getBaselineShift-5SSeXJ0() + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + Color.toString-impl(this.getBackground-0d7_KjU()) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ')';
    }
}

