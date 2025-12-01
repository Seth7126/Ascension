package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001A,\u0010\r\u001A\u00020\u000E*\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u00012\u0006\u0010\u0014\u001A\u00020\u0015H\u0002\u001A(\u0010\u0016\u001A\u00020\u000E*\u00020\u000F2\u0012\u0010\u0017\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00190\u00182\u0006\u0010\u0014\u001A\u00020\u0015H\u0000\"!\u0010\u0000\u001A\u00020\u0001*\u00020\u00028BX\u0082\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"!\u0010\u0007\u001A\u00020\u0001*\u00020\b8BX\u0082\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001A"}, d2 = {"spanUnit", "", "Landroidx/compose/ui/unit/TextUnit;", "getSpanUnit--R2X_6o$annotations", "(J)V", "getSpanUnit--R2X_6o", "(J)I", "spanVerticalAlign", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "getSpanVerticalAlign-do9X-Gg", "(I)I", "setPlaceholder", "", "Landroid/text/Spannable;", "placeholder", "Landroidx/compose/ui/text/Placeholder;", "start", "end", "density", "Landroidx/compose/ui/unit/Density;", "setPlaceholders", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class PlaceholderExtensions_androidKt {
    private static final int getSpanUnit--R2X_6o(long v) {
        long v1 = TextUnit.getType-UIouoOA(v);
        if(TextUnitType.equals-impl0(v1, 0x100000000L)) {
            return 0;
        }
        return TextUnitType.equals-impl0(v1, 0x200000000L) ? 1 : 2;
    }

    private static void getSpanUnit--R2X_6o$annotations(long v) {
    }

    private static final int getSpanVerticalAlign-do9X-Gg(int v) {
        if(PlaceholderVerticalAlign.equals-impl0(v, 1)) {
            return 0;
        }
        if(PlaceholderVerticalAlign.equals-impl0(v, 2)) {
            return 1;
        }
        if(PlaceholderVerticalAlign.equals-impl0(v, 3)) {
            return 2;
        }
        if(PlaceholderVerticalAlign.equals-impl0(v, 4)) {
            return 3;
        }
        if(PlaceholderVerticalAlign.equals-impl0(v, 5)) {
            return 4;
        }
        if(PlaceholderVerticalAlign.equals-impl0(v, 6)) {
            return 5;
        }
        if(!PlaceholderVerticalAlign.equals-impl0(v, 7)) {
            throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
        }
        return 6;
    }

    private static void getSpanVerticalAlign-do9X-Gg$annotations(int v) {
    }

    private static final void setPlaceholder(Spannable spannable0, Placeholder placeholder0, int v, int v1, Density density0) {
        SpannableExtensions_androidKt.setSpan(spannable0, new PlaceholderSpan(TextUnit.getValue-impl(placeholder0.getWidth-XSAIIZE()), PlaceholderExtensions_androidKt.getSpanUnit--R2X_6o(placeholder0.getWidth-XSAIIZE()), TextUnit.getValue-impl(placeholder0.getHeight-XSAIIZE()), PlaceholderExtensions_androidKt.getSpanUnit--R2X_6o(placeholder0.getHeight-XSAIIZE()), density0.getFontScale() * density0.getDensity(), PlaceholderExtensions_androidKt.getSpanVerticalAlign-do9X-Gg(placeholder0.getPlaceholderVerticalAlign-J6kI3mc())), v, v1);
    }

    public static final void setPlaceholders(Spannable spannable0, List list0, Density density0) {
        Intrinsics.checkNotNullParameter(spannable0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "placeholders");
        Intrinsics.checkNotNullParameter(density0, "density");
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Range annotatedString$Range0 = (Range)list0.get(v1);
                PlaceholderExtensions_androidKt.setPlaceholder(spannable0, ((Placeholder)annotatedString$Range0.component1()), annotatedString$Range0.component2(), annotatedString$Range0.component3(), density0);
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
    }
}

