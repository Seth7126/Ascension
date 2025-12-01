package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000E\b&\u0018\u0000 )2\u00020\u0001:\u0001)B\u001A\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006B\"\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0013\u0010\u0017\u001A\u00020\u000F2\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\u001E\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\u001C2\u0006\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u001E\u001A\u00020\u001CJ\u0010\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001F\u001A\u00020\u001AH&J\u0010\u0010 \u001A\u00020\u001C2\u0006\u0010!\u001A\u00020\bH&J\u0010\u0010\"\u001A\u00020\u001C2\u0006\u0010!\u001A\u00020\bH&J\b\u0010#\u001A\u00020\bH\u0016J\b\u0010$\u001A\u00020\u0003H\u0016J\u001E\u0010%\u001A\u00020\u001A2\u0006\u0010&\u001A\u00020\u001C2\u0006\u0010\'\u001A\u00020\u001C2\u0006\u0010(\u001A\u00020\u001CJ\u0010\u0010%\u001A\u00020\u001A2\u0006\u0010\u001F\u001A\u00020\u001AH&R\u0011\u0010\n\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u0014\u0010\u0007\u001A\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0014\u0010\u000E\u001A\u00020\u000F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u0010R\u0012\u0010\u0011\u001A\u00020\u000FX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0010R\u001C\u0010\u0004\u001A\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0014\u001A\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "model", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "id", "", "(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "componentCount", "getComponentCount", "()I", "getId$ui_graphics_release", "isSrgb", "", "()Z", "isWideGamut", "getModel-xdoWZVw", "()J", "J", "getName", "()Ljava/lang/String;", "equals", "other", "fromXyz", "", "x", "", "y", "z", "v", "getMaxValue", "component", "getMinValue", "hashCode", "toString", "toXyz", "r", "g", "b", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class ColorSpace {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace$Companion;", "", "()V", "MaxId", "", "MinId", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final Companion Companion = null;
    public static final int MaxId = 0x3F;
    public static final int MinId = -1;
    private final int id;
    private final long model;
    private final String name;

    static {
        ColorSpace.Companion = new Companion(null);
    }

    private ColorSpace(String s, long v) {
        this(s, v, -1, null);
    }

    private ColorSpace(String s, long v, int v1) {
        this.name = s;
        this.model = v;
        this.id = v1;
        if(s.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if(v1 < -1 || v1 > 0x3F) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public ColorSpace(String s, long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, v, v1);
    }

    public ColorSpace(String s, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(this.getClass()), Reflection.getOrCreateKotlinClass(object0.getClass())) || this.id != ((ColorSpace)object0).id) {
            return false;
        }
        return Intrinsics.areEqual(this.name, ((ColorSpace)object0).name) ? ColorModel.equals-impl0(this.getModel-xdoWZVw(), ((ColorSpace)object0).getModel-xdoWZVw()) : false;
    }

    public final float[] fromXyz(float f, float f1, float f2) {
        float[] arr_f = new float[((int)(this.getModel-xdoWZVw() >> 0x20))];
        arr_f[0] = f;
        arr_f[1] = f1;
        arr_f[2] = f2;
        return this.fromXyz(arr_f);
    }

    public abstract float[] fromXyz(float[] arg1);

    public final int getComponentCount() {
        return ColorModel.getComponentCount-impl(this.getModel-xdoWZVw());
    }

    public final int getId$ui_graphics_release() {
        return this.id;
    }

    public abstract float getMaxValue(int arg1);

    public abstract float getMinValue(int arg1);

    public final long getModel-xdoWZVw() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return (this.name.hashCode() * 0x1F + ColorModel.hashCode-impl(this.getModel-xdoWZVw())) * 0x1F + this.id;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    @Override
    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ColorModel.toString-impl(this.getModel-xdoWZVw()) + ')';
    }

    public final float[] toXyz(float f, float f1, float f2) {
        return this.toXyz(new float[]{f, f1, f2});
    }

    public abstract float[] toXyz(float[] arg1);
}

