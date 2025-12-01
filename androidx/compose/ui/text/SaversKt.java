package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset.Companion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u00D4\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AL\u0010G\u001A\u0004\u0018\u0001HH\"\u0014\b\u0000\u0010I*\u000E\u0012\u0004\u0012\u0002HJ\u0012\u0004\u0012\u0002HK0\u0001\"\u0004\b\u0001\u0010J\"\u0004\b\u0002\u0010K\"\u0006\b\u0003\u0010H\u0018\u00012\b\u0010L\u001A\u0004\u0018\u0001HK2\u0006\u0010M\u001A\u0002HIH\u0080\b\u00A2\u0006\u0002\u0010N\u001A\"\u0010G\u001A\u0004\u0018\u0001HH\"\u0006\b\u0000\u0010H\u0018\u00012\b\u0010L\u001A\u0004\u0018\u00010\u0003H\u0080\b\u00A2\u0006\u0002\u0010O\u001AI\u0010P\u001A\u00020\u0003\"\u0014\b\u0000\u0010I*\u000E\u0012\u0004\u0012\u0002HJ\u0012\u0004\u0012\u0002HK0\u0001\"\u0004\b\u0001\u0010J\"\u0004\b\u0002\u0010K2\b\u0010L\u001A\u0004\u0018\u0001HJ2\u0006\u0010M\u001A\u0002HI2\u0006\u0010Q\u001A\u00020RH\u0000\u00A2\u0006\u0002\u0010S\u001A\u001F\u0010P\u001A\u0004\u0018\u0001HI\"\u0004\b\u0000\u0010I2\b\u0010L\u001A\u0004\u0018\u0001HIH\u0000\u00A2\u0006\u0002\u0010O\" \u0010\u0000\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0004\u0010\u0005\"(\u0010\u0006\u001A\u001C\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\b0\u0007\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\"\u0010\t\u001A\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\b\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\u001D\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00F8\u0001\u0000\u00A2\u0006\u0002\n\u0000\"#\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00F8\u0001\u0000\u00A2\u0006\b\n\u0000\u0012\u0004\b\u000E\u0010\u000F\"\u001A\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\u001A\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\u001A\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\u001D\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00F8\u0001\u0000\u00A2\u0006\u0002\n\u0000\" \u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u0005\"\u001A\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000\" \u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001F\u0010\u0005\"\u001A\u0010 \u001A\u000E\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\u001A\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\u001A\u0010$\u001A\u000E\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\u001D\u0010&\u001A\u000E\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00F8\u0001\u0000\u00A2\u0006\u0002\n\u0000\"#\u0010(\u001A\u000E\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00F8\u0001\u0000\u00A2\u0006\b\n\u0000\u0012\u0004\b*\u0010\u000F\"\u001A\u0010+\u001A\u000E\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\'\u0010-\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0001*\u00020.8@X\u0080\u0004\u00F8\u0001\u0000\u00A2\u0006\u0006\u001A\u0004\b/\u00100\"\'\u0010-\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001*\u0002018@X\u0080\u0004\u00F8\u0001\u0000\u00A2\u0006\u0006\u001A\u0004\b/\u00102\"$\u0010-\u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\u00030\u0001*\u0002038@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b/\u00104\"\'\u0010-\u001A\u000E\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00030\u0001*\u0002058@X\u0080\u0004\u00F8\u0001\u0000\u00A2\u0006\u0006\u001A\u0004\b/\u00106\"$\u0010-\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0001*\u0002078@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b/\u00108\"$\u0010-\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001*\u0002098@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b/\u0010:\"$\u0010-\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001*\u00020;8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b/\u0010<\"\'\u0010-\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\u00030\u0001*\u00020=8@X\u0080\u0004\u00F8\u0001\u0000\u00A2\u0006\u0006\u001A\u0004\b/\u0010>\"$\u0010-\u001A\u000E\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u0001*\u00020?8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b/\u0010@\"$\u0010-\u001A\u000E\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u0001*\u00020A8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b/\u0010B\"$\u0010-\u001A\u000E\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u0001*\u00020C8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b/\u0010D\"\'\u0010-\u001A\u000E\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00030\u0001*\u00020E8@X\u0080\u0004\u00F8\u0001\u0000\u00A2\u0006\u0006\u001A\u0004\b/\u0010F\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006T"}, d2 = {"AnnotatedStringSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/AnnotatedString;", "", "getAnnotatedStringSaver", "()Landroidx/compose/runtime/saveable/Saver;", "AnnotationRangeListSaver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "AnnotationRangeSaver", "BaselineShiftSaver", "Landroidx/compose/ui/text/style/BaselineShift;", "ColorSaver", "Landroidx/compose/ui/graphics/Color;", "getColorSaver$annotations", "()V", "FontWeightSaver", "Landroidx/compose/ui/text/font/FontWeight;", "LocaleListSaver", "Landroidx/compose/ui/text/intl/LocaleList;", "LocaleSaver", "Landroidx/compose/ui/text/intl/Locale;", "OffsetSaver", "Landroidx/compose/ui/geometry/Offset;", "ParagraphStyleSaver", "Landroidx/compose/ui/text/ParagraphStyle;", "getParagraphStyleSaver", "ShadowSaver", "Landroidx/compose/ui/graphics/Shadow;", "SpanStyleSaver", "Landroidx/compose/ui/text/SpanStyle;", "getSpanStyleSaver", "TextDecorationSaver", "Landroidx/compose/ui/text/style/TextDecoration;", "TextGeometricTransformSaver", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "TextIndentSaver", "Landroidx/compose/ui/text/style/TextIndent;", "TextRangeSaver", "Landroidx/compose/ui/text/TextRange;", "TextUnitSaver", "Landroidx/compose/ui/unit/TextUnit;", "getTextUnitSaver$annotations", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "Saver", "Landroidx/compose/ui/geometry/Offset$Companion;", "getSaver", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Color$Companion;", "(Landroidx/compose/ui/graphics/Color$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Shadow$Companion;", "(Landroidx/compose/ui/graphics/Shadow$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/TextRange$Companion;", "(Landroidx/compose/ui/text/TextRange$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/Locale$Companion;", "(Landroidx/compose/ui/text/intl/Locale$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/LocaleList$Companion;", "(Landroidx/compose/ui/text/intl/LocaleList$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/BaselineShift$Companion;", "(Landroidx/compose/ui/text/style/BaselineShift$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextDecoration$Companion;", "(Landroidx/compose/ui/text/style/TextDecoration$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "(Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextIndent$Companion;", "(Landroidx/compose/ui/text/style/TextIndent$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/unit/TextUnit$Companion;", "(Landroidx/compose/ui/unit/TextUnit$Companion;)Landroidx/compose/runtime/saveable/Saver;", "restore", "Result", "T", "Original", "Saveable", "value", "saver", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "save", "scope", "Landroidx/compose/runtime/saveable/SaverScope;", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SaversKt {
    private static final Saver AnnotatedStringSaver;
    private static final Saver AnnotationRangeListSaver;
    private static final Saver AnnotationRangeSaver;
    private static final Saver BaselineShiftSaver;
    private static final Saver ColorSaver;
    private static final Saver FontWeightSaver;
    private static final Saver LocaleListSaver;
    private static final Saver LocaleSaver;
    private static final Saver OffsetSaver;
    private static final Saver ParagraphStyleSaver;
    private static final Saver ShadowSaver;
    private static final Saver SpanStyleSaver;
    private static final Saver TextDecorationSaver;
    private static final Saver TextGeometricTransformSaver;
    private static final Saver TextIndentSaver;
    private static final Saver TextRangeSaver;
    private static final Saver TextUnitSaver;
    private static final Saver VerbatimTtsAnnotationSaver;

    static {
        SaversKt.AnnotatedStringSaver = SaverKt.Saver(SaversKt.AnnotatedStringSaver.1.INSTANCE, SaversKt.AnnotatedStringSaver.2.INSTANCE);
        SaversKt.AnnotationRangeListSaver = SaverKt.Saver(SaversKt.AnnotationRangeListSaver.1.INSTANCE, SaversKt.AnnotationRangeListSaver.2.INSTANCE);
        SaversKt.AnnotationRangeSaver = SaverKt.Saver(SaversKt.AnnotationRangeSaver.1.INSTANCE, SaversKt.AnnotationRangeSaver.2.INSTANCE);
        SaversKt.VerbatimTtsAnnotationSaver = SaverKt.Saver(SaversKt.VerbatimTtsAnnotationSaver.1.INSTANCE, SaversKt.VerbatimTtsAnnotationSaver.2.INSTANCE);
        SaversKt.ParagraphStyleSaver = SaverKt.Saver(SaversKt.ParagraphStyleSaver.1.INSTANCE, SaversKt.ParagraphStyleSaver.2.INSTANCE);
        SaversKt.SpanStyleSaver = SaverKt.Saver(SaversKt.SpanStyleSaver.1.INSTANCE, SaversKt.SpanStyleSaver.2.INSTANCE);
        SaversKt.TextDecorationSaver = SaverKt.Saver(SaversKt.TextDecorationSaver.1.INSTANCE, SaversKt.TextDecorationSaver.2.INSTANCE);
        SaversKt.TextGeometricTransformSaver = SaverKt.Saver(SaversKt.TextGeometricTransformSaver.1.INSTANCE, SaversKt.TextGeometricTransformSaver.2.INSTANCE);
        SaversKt.TextIndentSaver = SaverKt.Saver(SaversKt.TextIndentSaver.1.INSTANCE, SaversKt.TextIndentSaver.2.INSTANCE);
        SaversKt.FontWeightSaver = SaverKt.Saver(SaversKt.FontWeightSaver.1.INSTANCE, SaversKt.FontWeightSaver.2.INSTANCE);
        SaversKt.BaselineShiftSaver = SaverKt.Saver(SaversKt.BaselineShiftSaver.1.INSTANCE, SaversKt.BaselineShiftSaver.2.INSTANCE);
        SaversKt.TextRangeSaver = SaverKt.Saver(SaversKt.TextRangeSaver.1.INSTANCE, SaversKt.TextRangeSaver.2.INSTANCE);
        SaversKt.ShadowSaver = SaverKt.Saver(SaversKt.ShadowSaver.1.INSTANCE, SaversKt.ShadowSaver.2.INSTANCE);
        SaversKt.ColorSaver = SaverKt.Saver(SaversKt.ColorSaver.1.INSTANCE, SaversKt.ColorSaver.2.INSTANCE);
        SaversKt.TextUnitSaver = SaverKt.Saver(SaversKt.TextUnitSaver.1.INSTANCE, SaversKt.TextUnitSaver.2.INSTANCE);
        SaversKt.OffsetSaver = SaverKt.Saver(SaversKt.OffsetSaver.1.INSTANCE, SaversKt.OffsetSaver.2.INSTANCE);
        SaversKt.LocaleListSaver = SaverKt.Saver(SaversKt.LocaleListSaver.1.INSTANCE, SaversKt.LocaleListSaver.2.INSTANCE);
        SaversKt.LocaleSaver = SaverKt.Saver(SaversKt.LocaleSaver.1.INSTANCE, SaversKt.LocaleSaver.2.INSTANCE);
    }

    public static final Saver getAnnotatedStringSaver() {
        return SaversKt.AnnotatedStringSaver;
    }

    private static void getColorSaver$annotations() {
    }

    public static final Saver getParagraphStyleSaver() {
        return SaversKt.ParagraphStyleSaver;
    }

    public static final Saver getSaver(Companion offset$Companion0) {
        Intrinsics.checkNotNullParameter(offset$Companion0, "<this>");
        return SaversKt.OffsetSaver;
    }

    public static final Saver getSaver(androidx.compose.ui.graphics.Color.Companion color$Companion0) {
        Intrinsics.checkNotNullParameter(color$Companion0, "<this>");
        return SaversKt.ColorSaver;
    }

    public static final Saver getSaver(androidx.compose.ui.graphics.Shadow.Companion shadow$Companion0) {
        Intrinsics.checkNotNullParameter(shadow$Companion0, "<this>");
        return SaversKt.ShadowSaver;
    }

    public static final Saver getSaver(androidx.compose.ui.text.TextRange.Companion textRange$Companion0) {
        Intrinsics.checkNotNullParameter(textRange$Companion0, "<this>");
        return SaversKt.TextRangeSaver;
    }

    public static final Saver getSaver(androidx.compose.ui.text.font.FontWeight.Companion fontWeight$Companion0) {
        Intrinsics.checkNotNullParameter(fontWeight$Companion0, "<this>");
        return SaversKt.FontWeightSaver;
    }

    public static final Saver getSaver(androidx.compose.ui.text.intl.Locale.Companion locale$Companion0) {
        Intrinsics.checkNotNullParameter(locale$Companion0, "<this>");
        return SaversKt.LocaleSaver;
    }

    public static final Saver getSaver(androidx.compose.ui.text.intl.LocaleList.Companion localeList$Companion0) {
        Intrinsics.checkNotNullParameter(localeList$Companion0, "<this>");
        return SaversKt.LocaleListSaver;
    }

    public static final Saver getSaver(androidx.compose.ui.text.style.BaselineShift.Companion baselineShift$Companion0) {
        Intrinsics.checkNotNullParameter(baselineShift$Companion0, "<this>");
        return SaversKt.BaselineShiftSaver;
    }

    public static final Saver getSaver(androidx.compose.ui.text.style.TextDecoration.Companion textDecoration$Companion0) {
        Intrinsics.checkNotNullParameter(textDecoration$Companion0, "<this>");
        return SaversKt.TextDecorationSaver;
    }

    public static final Saver getSaver(androidx.compose.ui.text.style.TextGeometricTransform.Companion textGeometricTransform$Companion0) {
        Intrinsics.checkNotNullParameter(textGeometricTransform$Companion0, "<this>");
        return SaversKt.TextGeometricTransformSaver;
    }

    public static final Saver getSaver(androidx.compose.ui.text.style.TextIndent.Companion textIndent$Companion0) {
        Intrinsics.checkNotNullParameter(textIndent$Companion0, "<this>");
        return SaversKt.TextIndentSaver;
    }

    public static final Saver getSaver(androidx.compose.ui.unit.TextUnit.Companion textUnit$Companion0) {
        Intrinsics.checkNotNullParameter(textUnit$Companion0, "<this>");
        return SaversKt.TextUnitSaver;
    }

    public static final Saver getSpanStyleSaver() {
        return SaversKt.SpanStyleSaver;
    }

    private static void getTextUnitSaver$annotations() {
    }

    public static final Object restore(Object object0) {
        if(object0 == null) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(1, "Result");
        return object0;
    }

    public static final Object restore(Object object0, Saver saver0) {
        Intrinsics.checkNotNullParameter(saver0, "saver");
        Object object1 = null;
        if(Intrinsics.areEqual(object0, Boolean.FALSE)) {
            return null;
        }
        if(object0 != null) {
            object1 = saver0.restore(object0);
            Intrinsics.reifiedOperationMarker(1, "Result");
        }
        return object1;
    }

    public static final Object save(Object object0) [...] // Inlined contents

    public static final Object save(Object object0, Saver saver0, SaverScope saverScope0) {
        Intrinsics.checkNotNullParameter(saver0, "saver");
        Intrinsics.checkNotNullParameter(saverScope0, "scope");
        if(object0 != null) {
            Object object1 = saver0.save(saverScope0, object0);
            if(object1 != null) {
                return object1;
            }
        }
        return false;
    }
}

