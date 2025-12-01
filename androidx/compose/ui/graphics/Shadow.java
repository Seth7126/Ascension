package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001D2\u00020\u0001:\u0001\u001DB&\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ1\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001A\u00020\u001AH\u0016J\b\u0010\u001B\u001A\u00020\u001CH\u0016R\u001C\u0010\u0006\u001A\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\'\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\r\u0010\n\u001A\u0004\b\u000E\u0010\u000FR\'\u0010\u0004\u001A\u00020\u00058\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\u0011\u0010\n\u001A\u0004\b\u0012\u0010\u000F\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/graphics/Shadow;", "", "color", "Landroidx/compose/ui/graphics/Color;", "offset", "Landroidx/compose/ui/geometry/Offset;", "blurRadius", "", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBlurRadius$annotations", "()V", "getBlurRadius", "()F", "getColor-0d7_KjU$annotations", "getColor-0d7_KjU", "()J", "J", "getOffset-F1C5BW0$annotations", "getOffset-F1C5BW0", "copy", "copy-qcb84PM", "(JJF)Landroidx/compose/ui/graphics/Shadow;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Shadow {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/Shadow$Companion;", "", "()V", "None", "Landroidx/compose/ui/graphics/Shadow;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/graphics/Shadow;", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final Shadow getNone() {
            return Shadow.None;
        }

        public static void getNone$annotations() {
        }
    }

    public static final Companion Companion;
    private static final Shadow None;
    private final float blurRadius;
    private final long color;
    private final long offset;

    static {
        Shadow.Companion = new Companion(null);
        Shadow.None = new Shadow(0L, 0L, 0.0f, 7, null);
    }

    private Shadow(long v, long v1, float f) {
        this.color = v;
        this.offset = v1;
        this.blurRadius = f;
    }

    public Shadow(long v, long v1, float f, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = 0xFF00000000000000L;
        }
        if((v2 & 2) != 0) {
            v1 = 0L;
        }
        this(v, v1, ((v2 & 4) == 0 ? f : 0.0f), null);
    }

    public Shadow(long v, long v1, float f, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, f);
    }

    public final Shadow copy-qcb84PM(long v, long v1, float f) {
        return new Shadow(v, v1, f, null);
    }

    public static Shadow copy-qcb84PM$default(Shadow shadow0, long v, long v1, float f, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = shadow0.getColor-0d7_KjU();
        }
        if((v2 & 2) != 0) {
            v1 = shadow0.getOffset-F1C5BW0();
        }
        if((v2 & 4) != 0) {
            f = shadow0.blurRadius;
        }
        return shadow0.copy-qcb84PM(v, v1, f);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Shadow)) {
            return false;
        }
        if(!Color.equals-impl0(this.getColor-0d7_KjU(), ((Shadow)object0).getColor-0d7_KjU())) {
            return false;
        }
        return Offset.equals-impl0(this.getOffset-F1C5BW0(), ((Shadow)object0).getOffset-F1C5BW0()) ? this.blurRadius == ((Shadow)object0).blurRadius : false;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    public static void getBlurRadius$annotations() {
    }

    public final long getColor-0d7_KjU() {
        return this.color;
    }

    public static void getColor-0d7_KjU$annotations() {
    }

    public final long getOffset-F1C5BW0() {
        return this.offset;
    }

    public static void getOffset-F1C5BW0$annotations() {
    }

    @Override
    public int hashCode() {
        return (Color.hashCode-impl(this.getColor-0d7_KjU()) * 0x1F + Offset.hashCode-impl(this.getOffset-F1C5BW0())) * 0x1F + Float.floatToIntBits(this.blurRadius);
    }

    @Override
    public String toString() {
        return "Shadow(color=" + Color.toString-impl(this.getColor-0d7_KjU()) + ", offset=" + Offset.toString-impl(this.getOffset-F1C5BW0()) + ", blurRadius=" + this.blurRadius + ')';
    }
}

