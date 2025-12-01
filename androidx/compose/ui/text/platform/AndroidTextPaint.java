package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001B\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\f2\b\u0010\u0007\u001A\u0004\u0018\u00010\bJ\u0010\u0010\u0012\u001A\u00020\f2\b\u0010\t\u001A\u0004\u0018\u00010\nR\u000E\u0010\u0007\u001A\u00020\bX\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\nX\u0082\u000E¢\u0006\u0002\n\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "flags", "", "density", "", "(IF)V", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "setColor", "", "color", "Landroidx/compose/ui/graphics/Color;", "setColor-8_81llA", "(J)V", "setShadow", "setTextDecoration", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidTextPaint extends TextPaint {
    private Shadow shadow;
    private TextDecoration textDecoration;

    public AndroidTextPaint(int v, float f) {
        super(v);
        this.density = f;
        this.textDecoration = TextDecoration.Companion.getNone();
        this.shadow = Shadow.Companion.getNone();
    }

    public final void setColor-8_81llA(long v) {
        if(v != 16L) {
            int v1 = ColorKt.toArgb-8_81llA(v);
            if(this.getColor() != v1) {
                this.setColor(v1);
            }
        }
    }

    public final void setShadow(Shadow shadow0) {
        if(shadow0 == null) {
            shadow0 = Shadow.Companion.getNone();
        }
        if(!Intrinsics.areEqual(this.shadow, shadow0)) {
            this.shadow = shadow0;
            if(Intrinsics.areEqual(shadow0, Shadow.Companion.getNone())) {
                this.clearShadowLayer();
                return;
            }
            this.setShadowLayer(this.shadow.getBlurRadius(), Offset.getX-impl(this.shadow.getOffset-F1C5BW0()), Offset.getY-impl(this.shadow.getOffset-F1C5BW0()), ColorKt.toArgb-8_81llA(this.shadow.getColor-0d7_KjU()));
        }
    }

    public final void setTextDecoration(TextDecoration textDecoration0) {
        if(textDecoration0 == null) {
            textDecoration0 = TextDecoration.Companion.getNone();
        }
        if(!Intrinsics.areEqual(this.textDecoration, textDecoration0)) {
            this.textDecoration = textDecoration0;
            this.setUnderlineText(textDecoration0.contains(TextDecoration.Companion.getUnderline()));
            this.setStrikeThruText(this.textDecoration.contains(TextDecoration.Companion.getLineThrough()));
        }
    }
}

