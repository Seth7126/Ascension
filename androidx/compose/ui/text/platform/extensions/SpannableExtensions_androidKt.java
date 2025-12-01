package androidx.compose.ui.text.platform.extensions;

import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan.Standard;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.TypefaceAdapter;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u00AE\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\'\u0010\u0000\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0006\u0010\u0007\u001AF\u0010\b\u001A\u00020\t2\b\u0010\n\u001A\u0004\u0018\u00010\u000B2\u0012\u0010\f\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\u000E0\r2\u001E\u0010\u000F\u001A\u001A\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010H\u0000\u001A\f\u0010\u0012\u001A\u00020\u0013*\u00020\u0014H\u0002\u001A\u0016\u0010\u0015\u001A\u00020\u000B*\u0004\u0018\u00010\u000B2\u0006\u0010\u0016\u001A\u00020\u000BH\u0002\u001A1\u0010\u0017\u001A\u00020\t*\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u001C\u001A\u00020\u0011H\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001A1\u0010\u001F\u001A\u00020\t*\u00020\u00182\b\u0010 \u001A\u0004\u0018\u00010!2\u0006\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u001C\u001A\u00020\u0011H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0002\b\"\u001A1\u0010#\u001A\u00020\t*\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u001C\u001A\u00020\u0011H\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b$\u0010\u001E\u001A0\u0010%\u001A\u00020\t*\u00020\u00182\u0006\u0010&\u001A\u00020\u00142\u0012\u0010\f\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\u000E0\r2\u0006\u0010\'\u001A\u00020(H\u0002\u001A&\u0010)\u001A\u00020\t*\u00020\u00182\b\u0010*\u001A\u0004\u0018\u00010+2\u0006\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u001C\u001A\u00020\u0011H\u0002\u001A9\u0010,\u001A\u00020\t*\u00020\u00182\u0006\u0010-\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u001C\u001A\u00020\u0011H\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b.\u0010/\u001A&\u00100\u001A\u00020\t*\u00020\u00182\b\u00101\u001A\u0004\u0018\u0001022\u0006\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u001C\u001A\u00020\u0011H\u0002\u001A1\u00103\u001A\u00020\t*\u00020\u00182\u0006\u00104\u001A\u00020\u00032\u0006\u00105\u001A\u0002062\u0006\u0010\u0004\u001A\u00020\u0005H\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b7\u00108\u001A&\u00109\u001A\u00020\t*\u00020\u00182\b\u0010:\u001A\u0004\u0018\u00010;2\u0006\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u001C\u001A\u00020\u0011H\u0000\u001A&\u0010<\u001A\u00020\t*\u00020\u00182\b\u0010=\u001A\u0004\u0018\u00010>2\u0006\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u001C\u001A\u00020\u0011H\u0002\u001A$\u0010?\u001A\u00020\t*\u00020\u00182\u0006\u0010@\u001A\u00020A2\u0006\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u001C\u001A\u00020\u0011H\u0000\u001A:\u0010B\u001A\u00020\t*\u00020\u00182\f\u0010C\u001A\b\u0012\u0004\u0012\u00020\u000B0\u000E2\u0006\u0010\u0004\u001A\u00020\u00052\u0016\u0010D\u001A\u0012\u0012\u0004\u0012\u00020F0Ej\b\u0012\u0004\u0012\u00020F`GH\u0002\u001A8\u0010H\u001A\u00020\t*\u00020\u00182\u0006\u0010&\u001A\u00020\u00142\u0012\u0010\f\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\u000E0\r2\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\'\u001A\u00020(H\u0000\u001A&\u0010I\u001A\u00020\t*\u00020\u00182\b\u0010J\u001A\u0004\u0018\u00010K2\u0006\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u001C\u001A\u00020\u0011H\u0000\u001A&\u0010L\u001A\u00020\t*\u00020\u00182\b\u0010M\u001A\u0004\u0018\u00010N2\u0006\u00105\u001A\u0002062\u0006\u0010\u0004\u001A\u00020\u0005H\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006O"}, d2 = {"createLetterSpacingSpan", "Landroid/text/style/MetricAffectingSpan;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "density", "Landroidx/compose/ui/unit/Density;", "createLetterSpacingSpan-eAf_CNQ", "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "flattenFontStylesAndApply", "", "contextFontSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "block", "Lkotlin/Function3;", "", "hasFontAttributes", "", "Landroidx/compose/ui/text/TextStyle;", "merge", "spanStyle", "setBackground", "Landroid/text/Spannable;", "color", "Landroidx/compose/ui/graphics/Color;", "start", "end", "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBaselineShift", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "setBaselineShift-0ocSgnM", "setColor", "setColor-RPmYEkk", "setFontAttributes", "contextTextStyle", "typefaceAdapter", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "setFontFeatureSettings", "fontFeatureSettings", "", "setFontSize", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setGeometricTransform", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "setLineHeight", "lineHeight", "contextFontSize", "", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "setLocaleList", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "setShadow", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "setSpan", "span", "", "setSpanStyle", "spanStyleRange", "lowPrioritySpans", "Ljava/util/ArrayList;", "Landroidx/compose/ui/text/platform/extensions/SpanRange;", "Lkotlin/collections/ArrayList;", "setSpanStyles", "setTextDecoration", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "setTextIndent", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SpannableExtensions_androidKt {
    private static final MetricAffectingSpan createLetterSpacingSpan-eAf_CNQ(long v, Density density0) {
        long v1 = TextUnit.getType-UIouoOA(v);
        if(TextUnitType.equals-impl0(v1, 0x100000000L)) {
            return new LetterSpacingSpanPx(density0.toPx--R2X_6o(v));
        }
        return TextUnitType.equals-impl0(v1, 0x200000000L) ? new LetterSpacingSpanEm(TextUnit.getValue-impl(v)) : null;
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle0, List list0, Function3 function30) {
        Intrinsics.checkNotNullParameter(list0, "spanStyles");
        Intrinsics.checkNotNullParameter(function30, "block");
        if(list0.size() <= 1) {
            if(!list0.isEmpty() != 0) {
                function30.invoke(SpannableExtensions_androidKt.merge(spanStyle0, ((SpanStyle)((Range)list0.get(0)).getItem())), ((Range)list0.get(0)).getStart(), ((Range)list0.get(0)).getEnd());
            }
            return;
        }
        int v = list0.size();
        Integer[] arr_integer = new Integer[v * 2];
        for(int v1 = 0; v1 < v * 2; ++v1) {
            arr_integer[v1] = 0;
        }
        int v2 = list0.size();
        if(v2 - 1 >= 0) {
            for(int v3 = 0; true; ++v3) {
                Range annotatedString$Range0 = (Range)list0.get(v3);
                arr_integer[v3] = annotatedString$Range0.getStart();
                arr_integer[v3 + v] = annotatedString$Range0.getEnd();
                if(v3 + 1 > v2 - 1) {
                    break;
                }
            }
        }
        ArraysKt.sort(arr_integer);
        int v4 = ((Number)ArraysKt.first(arr_integer)).intValue();
        int v5 = 0;
        while(v5 < v * 2) {
            int v6 = (int)arr_integer[v5];
            ++v5;
            if(v6 != v4) {
                int v7 = list0.size() - 1;
                SpanStyle spanStyle1 = spanStyle0;
                if(v7 >= 0) {
                    for(int v8 = 0; true; ++v8) {
                        Range annotatedString$Range1 = (Range)list0.get(v8);
                        if(AnnotatedStringKt.intersect(v4, v6, annotatedString$Range1.getStart(), annotatedString$Range1.getEnd())) {
                            spanStyle1 = SpannableExtensions_androidKt.merge(spanStyle1, ((SpanStyle)annotatedString$Range1.getItem()));
                        }
                        if(v8 + 1 > v7) {
                            break;
                        }
                    }
                }
                if(spanStyle1 != null) {
                    function30.invoke(spanStyle1, v4, v6);
                }
                v4 = v6;
            }
        }
    }

    private static final boolean hasFontAttributes(TextStyle textStyle0) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle0.toSpanStyle()) || textStyle0.getFontSynthesis-ZQGJjVo() != null;
    }

    private static final SpanStyle merge(SpanStyle spanStyle0, SpanStyle spanStyle1) {
        return spanStyle0 == null ? spanStyle1 : spanStyle0.merge(spanStyle1);
    }

    public static final void setBackground-RPmYEkk(Spannable spannable0, long v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(spannable0, "$this$setBackground");
        if(v != 16L) {
            SpannableExtensions_androidKt.setSpan(spannable0, new BackgroundColorSpan(ColorKt.toArgb-8_81llA(v)), v1, v2);
        }
    }

    private static final void setBaselineShift-0ocSgnM(Spannable spannable0, BaselineShift baselineShift0, int v, int v1) {
        if(baselineShift0 != null) {
            SpannableExtensions_androidKt.setSpan(spannable0, new BaselineShiftSpan(baselineShift0.unbox-impl()), v, v1);
        }
    }

    public static final void setColor-RPmYEkk(Spannable spannable0, long v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(spannable0, "$this$setColor");
        if(v != 16L) {
            SpannableExtensions_androidKt.setSpan(spannable0, new ForegroundColorSpan(ColorKt.toArgb-8_81llA(v)), v1, v2);
        }
    }

    private static final void setFontAttributes(Spannable spannable0, TextStyle textStyle0, List list0, TypefaceAdapter typefaceAdapter0) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Object object0 = list0.get(v1);
                if(TextPaintExtensions_androidKt.hasFontAttributes(((SpanStyle)((Range)object0).getItem())) || ((SpanStyle)((Range)object0).getItem()).getFontSynthesis-ZQGJjVo() != null) {
                    arrayList0.add(object0);
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        SpannableExtensions_androidKt.flattenFontStylesAndApply((SpannableExtensions_androidKt.hasFontAttributes(textStyle0) ? new SpanStyle(0L, 0L, textStyle0.getFontWeight(), textStyle0.getFontStyle-4Lr2A7w(), textStyle0.getFontSynthesis-ZQGJjVo(), textStyle0.getFontFamily(), null, 0L, null, null, null, 0L, null, null, 0x3FC3, null) : null), arrayList0, new Function3(spannable0, typefaceAdapter0) {
            final Spannable $this_setFontAttributes;
            final TypefaceAdapter $typefaceAdapter;

            {
                this.$this_setFontAttributes = spannable0;
                this.$typefaceAdapter = typefaceAdapter0;
                super(3);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                this.invoke(((SpanStyle)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(SpanStyle spanStyle0, int v, int v1) {
                Intrinsics.checkNotNullParameter(spanStyle0, "spanStyle");
                FontWeight fontWeight0 = spanStyle0.getFontWeight() == null ? FontWeight.Companion.getNormal() : spanStyle0.getFontWeight();
                FontStyle fontStyle0 = spanStyle0.getFontStyle-4Lr2A7w();
                FontSynthesis fontSynthesis0 = spanStyle0.getFontSynthesis-ZQGJjVo();
                this.$this_setFontAttributes.setSpan(new TypefaceSpan(this.$typefaceAdapter.create-DPcqOEQ(spanStyle0.getFontFamily(), fontWeight0, (fontStyle0 == null ? 0 : fontStyle0.unbox-impl()), (fontSynthesis0 == null ? 1 : fontSynthesis0.unbox-impl()))), v, v1, 33);
            }
        });
    }

    private static final void setFontFeatureSettings(Spannable spannable0, String s, int v, int v1) {
        if(s != null) {
            SpannableExtensions_androidKt.setSpan(spannable0, new FontFeatureSpan(s), v, v1);
        }
    }

    public static final void setFontSize-KmRG4DE(Spannable spannable0, long v, Density density0, int v1, int v2) {
        Intrinsics.checkNotNullParameter(spannable0, "$this$setFontSize");
        Intrinsics.checkNotNullParameter(density0, "density");
        long v3 = TextUnit.getType-UIouoOA(v);
        if(TextUnitType.equals-impl0(v3, 0x100000000L)) {
            SpannableExtensions_androidKt.setSpan(spannable0, new AbsoluteSizeSpan(MathKt.roundToInt(density0.toPx--R2X_6o(v)), false), v1, v2);
            return;
        }
        if(TextUnitType.equals-impl0(v3, 0x200000000L)) {
            SpannableExtensions_androidKt.setSpan(spannable0, new RelativeSizeSpan(TextUnit.getValue-impl(v)), v1, v2);
        }
    }

    private static final void setGeometricTransform(Spannable spannable0, TextGeometricTransform textGeometricTransform0, int v, int v1) {
        if(textGeometricTransform0 != null) {
            SpannableExtensions_androidKt.setSpan(spannable0, new ScaleXSpan(textGeometricTransform0.getScaleX()), v, v1);
            SpannableExtensions_androidKt.setSpan(spannable0, new SkewXSpan(textGeometricTransform0.getSkewX()), v, v1);
        }
    }

    public static final void setLineHeight-r9BaKPg(Spannable spannable0, long v, float f, Density density0) {
        Intrinsics.checkNotNullParameter(spannable0, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density0, "density");
        long v1 = TextUnit.getType-UIouoOA(v);
        if(TextUnitType.equals-impl0(v1, 0x100000000L)) {
            SpannableExtensions_androidKt.setSpan(spannable0, new LineHeightSpan(((int)(((float)Math.ceil(density0.toPx--R2X_6o(v)))))), 0, spannable0.length());
            return;
        }
        if(TextUnitType.equals-impl0(v1, 0x200000000L)) {
            SpannableExtensions_androidKt.setSpan(spannable0, new LineHeightSpan(((int)(((float)Math.ceil(TextUnit.getValue-impl(v) * f))))), 0, spannable0.length());
        }
    }

    public static final void setLocaleList(Spannable spannable0, LocaleList localeList0, int v, int v1) {
        Intrinsics.checkNotNullParameter(spannable0, "<this>");
        if(localeList0 != null) {
            LocaleSpan localeSpan0 = Build.VERSION.SDK_INT >= 24 ? LocaleListHelperMethods.INSTANCE.localeSpan(localeList0) : new LocaleSpan(LocaleExtensions_androidKt.toJavaLocale((localeList0.isEmpty() ? Locale.Companion.getCurrent() : localeList0.get(0))));
            SpannableExtensions_androidKt.setSpan(spannable0, localeSpan0, v, v1);
        }
    }

    private static final void setShadow(Spannable spannable0, Shadow shadow0, int v, int v1) {
        if(shadow0 != null) {
            SpannableExtensions_androidKt.setSpan(spannable0, new ShadowSpan(ColorKt.toArgb-8_81llA(shadow0.getColor-0d7_KjU()), Offset.getX-impl(shadow0.getOffset-F1C5BW0()), Offset.getY-impl(shadow0.getOffset-F1C5BW0()), shadow0.getBlurRadius()), v, v1);
        }
    }

    public static final void setSpan(Spannable spannable0, Object object0, int v, int v1) {
        Intrinsics.checkNotNullParameter(spannable0, "<this>");
        Intrinsics.checkNotNullParameter(object0, "span");
        spannable0.setSpan(object0, v, v1, 33);
    }

    private static final void setSpanStyle(Spannable spannable0, Range annotatedString$Range0, Density density0, ArrayList arrayList0) {
        int v = annotatedString$Range0.getStart();
        int v1 = annotatedString$Range0.getEnd();
        SpanStyle spanStyle0 = (SpanStyle)annotatedString$Range0.getItem();
        SpannableExtensions_androidKt.setBaselineShift-0ocSgnM(spannable0, spanStyle0.getBaselineShift-5SSeXJ0(), v, v1);
        SpannableExtensions_androidKt.setColor-RPmYEkk(spannable0, spanStyle0.getColor-0d7_KjU(), v, v1);
        SpannableExtensions_androidKt.setTextDecoration(spannable0, spanStyle0.getTextDecoration(), v, v1);
        SpannableExtensions_androidKt.setFontSize-KmRG4DE(spannable0, spanStyle0.getFontSize-XSAIIZE(), density0, v, v1);
        SpannableExtensions_androidKt.setFontFeatureSettings(spannable0, spanStyle0.getFontFeatureSettings(), v, v1);
        SpannableExtensions_androidKt.setGeometricTransform(spannable0, spanStyle0.getTextGeometricTransform(), v, v1);
        SpannableExtensions_androidKt.setLocaleList(spannable0, spanStyle0.getLocaleList(), v, v1);
        SpannableExtensions_androidKt.setBackground-RPmYEkk(spannable0, spanStyle0.getBackground-0d7_KjU(), v, v1);
        SpannableExtensions_androidKt.setShadow(spannable0, spanStyle0.getShadow(), v, v1);
        MetricAffectingSpan metricAffectingSpan0 = SpannableExtensions_androidKt.createLetterSpacingSpan-eAf_CNQ(spanStyle0.getLetterSpacing-XSAIIZE(), density0);
        if(metricAffectingSpan0 != null) {
            arrayList0.add(new SpanRange(metricAffectingSpan0, v, v1));
        }
    }

    public static final void setSpanStyles(Spannable spannable0, TextStyle textStyle0, List list0, Density density0, TypefaceAdapter typefaceAdapter0) {
        Intrinsics.checkNotNullParameter(spannable0, "<this>");
        Intrinsics.checkNotNullParameter(textStyle0, "contextTextStyle");
        Intrinsics.checkNotNullParameter(list0, "spanStyles");
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(typefaceAdapter0, "typefaceAdapter");
        SpannableExtensions_androidKt.setFontAttributes(spannable0, textStyle0, list0, typefaceAdapter0);
        ArrayList arrayList0 = new ArrayList();
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                Range annotatedString$Range0 = (Range)list0.get(v2);
                int v3 = annotatedString$Range0.getStart();
                int v4 = annotatedString$Range0.getEnd();
                if(v3 >= 0 && v3 < spannable0.length() && v4 > v3 && v4 <= spannable0.length()) {
                    SpannableExtensions_androidKt.setSpanStyle(spannable0, annotatedString$Range0, density0, arrayList0);
                }
                if(v2 + 1 > v - 1) {
                    break;
                }
            }
        }
        int v5 = arrayList0.size();
        if(v5 - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                SpanRange spanRange0 = (SpanRange)arrayList0.get(v1);
                SpannableExtensions_androidKt.setSpan(spannable0, spanRange0.component1(), spanRange0.component2(), spanRange0.component3());
                if(v1 + 1 > v5 - 1) {
                    break;
                }
            }
        }
    }

    public static final void setTextDecoration(Spannable spannable0, TextDecoration textDecoration0, int v, int v1) {
        Intrinsics.checkNotNullParameter(spannable0, "<this>");
        if(textDecoration0 != null) {
            SpannableExtensions_androidKt.setSpan(spannable0, new TextDecorationSpan(textDecoration0.contains(TextDecoration.Companion.getUnderline()), textDecoration0.contains(TextDecoration.Companion.getLineThrough())), v, v1);
        }
    }

    public static final void setTextIndent(Spannable spannable0, TextIndent textIndent0, float f, Density density0) {
        float f2;
        Intrinsics.checkNotNullParameter(spannable0, "<this>");
        Intrinsics.checkNotNullParameter(density0, "density");
        if(textIndent0 != null && (!TextUnit.equals-impl0(textIndent0.getFirstLine-XSAIIZE(), 0x100000000L) || !TextUnit.equals-impl0(textIndent0.getRestLine-XSAIIZE(), 0x100000000L)) && !TextUnitKt.isUnspecified--R2X_6o(textIndent0.getFirstLine-XSAIIZE()) && !TextUnitKt.isUnspecified--R2X_6o(textIndent0.getRestLine-XSAIIZE())) {
            long v = TextUnit.getType-UIouoOA(textIndent0.getFirstLine-XSAIIZE());
            float f1 = 0.0f;
            if(TextUnitType.equals-impl0(v, 0x100000000L)) {
                f2 = density0.toPx--R2X_6o(textIndent0.getFirstLine-XSAIIZE());
            }
            else {
                f2 = TextUnitType.equals-impl0(v, 0x200000000L) ? TextUnit.getValue-impl(textIndent0.getFirstLine-XSAIIZE()) * f : 0.0f;
            }
            long v1 = TextUnit.getType-UIouoOA(textIndent0.getRestLine-XSAIIZE());
            if(TextUnitType.equals-impl0(v1, 0x100000000L)) {
                f1 = density0.toPx--R2X_6o(textIndent0.getRestLine-XSAIIZE());
            }
            else if(TextUnitType.equals-impl0(v1, 0x200000000L)) {
                f1 = TextUnit.getValue-impl(textIndent0.getRestLine-XSAIIZE()) * f;
            }
            SpannableExtensions_androidKt.setSpan(spannable0, new LeadingMarginSpan.Standard(((int)(((float)Math.ceil(f2)))), ((int)(((float)Math.ceil(f1))))), 0, spannable0.length());
        }
    }
}

