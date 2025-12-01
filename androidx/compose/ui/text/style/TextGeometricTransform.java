package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001A\u0010\t\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003J\u0013\u0010\n\u001A\u00020\u000B2\b\u0010\f\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001A\u00020\u000EH\u0016J\b\u0010\u000F\u001A\u00020\u0010H\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform;", "", "scaleX", "", "skewX", "(FF)V", "getScaleX", "()F", "getSkewX", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TextGeometricTransform {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "", "()V", "None", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "getNone$ui_text_release$annotations", "getNone$ui_text_release", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final TextGeometricTransform getNone$ui_text_release() {
            return TextGeometricTransform.None;
        }

        public static void getNone$ui_text_release$annotations() {
        }
    }

    public static final Companion Companion;
    private static final TextGeometricTransform None;
    private final float scaleX;
    private final float skewX;

    static {
        TextGeometricTransform.Companion = new Companion(null);
        TextGeometricTransform.None = new TextGeometricTransform(1.0f, 0.0f);
    }

    public TextGeometricTransform() {
        this(0.0f, 0.0f, 3, null);
    }

    public TextGeometricTransform(float f, float f1) {
        this.scaleX = f;
        this.skewX = f1;
    }

    public TextGeometricTransform(float f, float f1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        this(f, f1);
    }

    public final TextGeometricTransform copy(float f, float f1) {
        return new TextGeometricTransform(f, f1);
    }

    public static TextGeometricTransform copy$default(TextGeometricTransform textGeometricTransform0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = textGeometricTransform0.scaleX;
        }
        if((v & 2) != 0) {
            f1 = textGeometricTransform0.skewX;
        }
        return textGeometricTransform0.copy(f, f1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextGeometricTransform)) {
            return false;
        }
        return this.scaleX == ((TextGeometricTransform)object0).scaleX ? this.skewX == ((TextGeometricTransform)object0).skewX : false;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.scaleX) * 0x1F + Float.floatToIntBits(this.skewX);
    }

    @Override
    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.scaleX + ", skewX=" + this.skewX + ')';
    }
}

