package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\u0018\u0000 \u001D2\u00020\u0001:\u0001\u001DB<\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001A\u00020\b\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\nø\u0001\u0000¢\u0006\u0002\u0010\u000BJ\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001A\u00020\u001AH\u0016J\b\u0010\u001B\u001A\u00020\u001CH\u0016R\u001C\u0010\u0005\u001A\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u001C\u0010\u0007\u001A\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\u000F\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001A\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0011\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "width", "", "miter", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "join", "Landroidx/compose/ui/graphics/StrokeJoin;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "(FFIILandroidx/compose/ui/graphics/PathEffect;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCap-KaPHkGw", "()I", "I", "getJoin-LxFBmk8", "getMiter", "()F", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "getWidth", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Stroke extends DrawStyle {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006R\u001C\u0010\b\u001A\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\n\u0010\u0006R\u000E\u0010\u000B\u001A\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\fX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke$Companion;", "", "()V", "DefaultCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getDefaultCap-KaPHkGw", "()I", "I", "DefaultJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getDefaultJoin-LxFBmk8", "DefaultMiter", "", "HairlineWidth", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getDefaultCap-KaPHkGw() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDefaultJoin-LxFBmk8() {
            return 0;
        }
    }

    public static final Companion Companion = null;
    private static final int DefaultCap = 0;
    private static final int DefaultJoin = 0;
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth;
    private final int cap;
    private final int join;
    private final float miter;
    private final PathEffect pathEffect;
    private final float width;

    static {
        Stroke.Companion = new Companion(null);
        Stroke.DefaultCap = 0;
        Stroke.DefaultJoin = 0;
    }

    private Stroke(float f, float f1, int v, int v1, PathEffect pathEffect0) {
        super(null);
        this.width = f;
        this.miter = f1;
        this.cap = v;
        this.join = v1;
        this.pathEffect = pathEffect0;
    }

    public Stroke(float f, float f1, int v, int v1, PathEffect pathEffect0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        if((v2 & 16) != 0) {
            pathEffect0 = null;
        }
        this(((v2 & 1) == 0 ? f : 0.0f), ((v2 & 2) == 0 ? f1 : 4.0f), v, v1, pathEffect0, null);
    }

    public Stroke(float f, float f1, int v, int v1, PathEffect pathEffect0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(f, f1, v, v1, pathEffect0);
    }

    public static final int access$getDefaultCap$cp() [...] // 潜在的解密器

    public static final int access$getDefaultJoin$cp() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Stroke)) {
            return false;
        }
        if(this.width != ((Stroke)object0).width) {
            return false;
        }
        if(this.miter != ((Stroke)object0).miter) {
            return false;
        }
        if(!StrokeCap.equals-impl0(this.getCap-KaPHkGw(), ((Stroke)object0).getCap-KaPHkGw())) {
            return false;
        }
        return StrokeJoin.equals-impl0(this.getJoin-LxFBmk8(), ((Stroke)object0).getJoin-LxFBmk8()) ? Intrinsics.areEqual(this.pathEffect, ((Stroke)object0).pathEffect) : false;
    }

    public final int getCap-KaPHkGw() {
        return this.cap;
    }

    public final int getJoin-LxFBmk8() {
        return this.join;
    }

    public final float getMiter() {
        return this.miter;
    }

    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public final float getWidth() {
        return this.width;
    }

    @Override
    public int hashCode() {
        int v = Float.floatToIntBits(this.width);
        int v1 = Float.floatToIntBits(this.miter);
        int v2 = this.getCap-KaPHkGw();
        int v3 = this.getJoin-LxFBmk8();
        return this.pathEffect == null ? (((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F : (((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + this.pathEffect.hashCode();
    }

    @Override
    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + StrokeCap.toString-impl(this.getCap-KaPHkGw()) + ", join=" + StrokeJoin.toString-impl(this.getJoin-LxFBmk8()) + ", pathEffect=" + this.pathEffect + ')';
    }
}

