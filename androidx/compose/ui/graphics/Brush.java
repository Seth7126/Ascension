package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.OffsetKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\f\u0082\u0001\u0002\u000E\u000F\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "()V", "applyTo", "", "size", "Landroidx/compose/ui/geometry/Size;", "p", "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "Companion", "Landroidx/compose/ui/graphics/SolidColor;", "Landroidx/compose/ui/graphics/ShaderBrush;", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class Brush {
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002J_\u0010\u0003\u001A\u00020\u00042*\u0010\u0005\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u000E\u0010\u000FJA\u0010\u0003\u001A\u00020\u00042\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u000E\u0010\u0012J_\u0010\u0013\u001A\u00020\u00042*\u0010\u0005\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0014\u001A\u00020\u00152\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\f\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u0013\u001A\u00020\u00042\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u0014\u001A\u00020\u00152\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\f\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0019J_\u0010\u001A\u001A\u00020\u00042*\u0010\u0005\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001B\u001A\u00020\u00152\b\b\u0002\u0010\u001C\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001EJA\u0010\u001A\u001A\u00020\u00042\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u001B\u001A\u00020\u00152\b\b\u0002\u0010\u001C\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001FJK\u0010 \u001A\u00020\u00042*\u0010\u0005\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001B\u001A\u00020\u0015H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b!\u0010\"J-\u0010 \u001A\u00020\u00042\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u001B\u001A\u00020\u0015H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b!\u0010#J_\u0010$\u001A\u00020\u00042*\u0010\u0005\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010%\u001A\u00020\b2\b\b\u0002\u0010&\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\'\u0010\u000FJA\u0010$\u001A\u00020\u00042\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010%\u001A\u00020\b2\b\b\u0002\u0010&\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\'\u0010\u0012\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006("}, d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "()V", "horizontalGradient", "Landroidx/compose/ui/graphics/Brush;", "colorStops", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "startX", "endX", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "horizontalGradient-8A-3gB4", "([Lkotlin/Pair;FFI)Landroidx/compose/ui/graphics/Brush;", "colors", "", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;", "linearGradient", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "linearGradient-mHitzGk", "([Lkotlin/Pair;JJI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/Brush;", "radialGradient", "center", "radius", "radialGradient-P_Vx-Ks", "([Lkotlin/Pair;JFI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/Brush;", "sweepGradient", "sweepGradient-Uv8p0NA", "([Lkotlin/Pair;J)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;J)Landroidx/compose/ui/graphics/Brush;", "verticalGradient", "startY", "endY", "verticalGradient-8A-3gB4", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final Brush horizontalGradient-8A-3gB4(List list0, float f, float f1, int v) {
            Intrinsics.checkNotNullParameter(list0, "colors");
            return this.linearGradient-mHitzGk(list0, OffsetKt.Offset(f, 0.0f), OffsetKt.Offset(f1, 0.0f), v);
        }

        public final Brush horizontalGradient-8A-3gB4(Pair[] arr_pair, float f, float f1, int v) {
            Intrinsics.checkNotNullParameter(arr_pair, "colorStops");
            return this.linearGradient-mHitzGk(((Pair[])Arrays.copyOf(arr_pair, arr_pair.length)), OffsetKt.Offset(f, 0.0f), OffsetKt.Offset(f1, 0.0f), v);
        }

        public static Brush horizontalGradient-8A-3gB4$default(Companion brush$Companion0, List list0, float f, float f1, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if((v1 & 4) != 0) {
                f1 = Infinityf;
            }
            if((v1 & 8) != 0) {
                v = 0;
            }
            return brush$Companion0.horizontalGradient-8A-3gB4(list0, f, f1, v);
        }

        public static Brush horizontalGradient-8A-3gB4$default(Companion brush$Companion0, Pair[] arr_pair, float f, float f1, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if((v1 & 4) != 0) {
                f1 = Infinityf;
            }
            if((v1 & 8) != 0) {
                v = 0;
            }
            return brush$Companion0.horizontalGradient-8A-3gB4(arr_pair, f, f1, v);
        }

        public final Brush linearGradient-mHitzGk(List list0, long v, long v1, int v2) {
            Intrinsics.checkNotNullParameter(list0, "colors");
            return new LinearGradient(list0, null, v, v1, v2, null);
        }

        public final Brush linearGradient-mHitzGk(Pair[] arr_pair, long v, long v1, int v2) {
            Intrinsics.checkNotNullParameter(arr_pair, "colorStops");
            ArrayList arrayList0 = new ArrayList(arr_pair.length);
            for(int v4 = 0; v4 < arr_pair.length; ++v4) {
                arrayList0.add(Color.box-impl(((Color)arr_pair[v4].getSecond()).unbox-impl()));
            }
            ArrayList arrayList1 = new ArrayList(arr_pair.length);
            for(int v3 = 0; v3 < arr_pair.length; ++v3) {
                arrayList1.add(((Number)arr_pair[v3].getFirst()).floatValue());
            }
            return new LinearGradient(arrayList0, arrayList1, v, v1, v2, null);
        }

        public static Brush linearGradient-mHitzGk$default(Companion brush$Companion0, List list0, long v, long v1, int v2, int v3, Object object0) {
            if((v3 & 2) != 0) {
                v = 0L;
            }
            if((v3 & 4) != 0) {
                v1 = 0x7F8000007F800000L;
            }
            if((v3 & 8) != 0) {
                v2 = 0;
            }
            return brush$Companion0.linearGradient-mHitzGk(list0, v, v1, v2);
        }

        public static Brush linearGradient-mHitzGk$default(Companion brush$Companion0, Pair[] arr_pair, long v, long v1, int v2, int v3, Object object0) {
            if((v3 & 2) != 0) {
                v = 0L;
            }
            if((v3 & 4) != 0) {
                v1 = 0x7F8000007F800000L;
            }
            if((v3 & 8) != 0) {
                v2 = 0;
            }
            return brush$Companion0.linearGradient-mHitzGk(arr_pair, v, v1, v2);
        }

        public final Brush radialGradient-P_Vx-Ks(List list0, long v, float f, int v1) {
            Intrinsics.checkNotNullParameter(list0, "colors");
            return new RadialGradient(list0, null, v, f, v1, null);
        }

        public final Brush radialGradient-P_Vx-Ks(Pair[] arr_pair, long v, float f, int v1) {
            Intrinsics.checkNotNullParameter(arr_pair, "colorStops");
            ArrayList arrayList0 = new ArrayList(arr_pair.length);
            for(int v3 = 0; v3 < arr_pair.length; ++v3) {
                arrayList0.add(Color.box-impl(((Color)arr_pair[v3].getSecond()).unbox-impl()));
            }
            ArrayList arrayList1 = new ArrayList(arr_pair.length);
            for(int v2 = 0; v2 < arr_pair.length; ++v2) {
                arrayList1.add(((Number)arr_pair[v2].getFirst()).floatValue());
            }
            return new RadialGradient(arrayList0, arrayList1, v, f, v1, null);
        }

        public static Brush radialGradient-P_Vx-Ks$default(Companion brush$Companion0, List list0, long v, float f, int v1, int v2, Object object0) {
            if((v2 & 2) != 0) {
                v = 0x7FC000007FC00000L;
            }
            if((v2 & 8) != 0) {
                v1 = 0;
            }
            return brush$Companion0.radialGradient-P_Vx-Ks(list0, v, ((v2 & 4) == 0 ? f : Infinityf), v1);
        }

        public static Brush radialGradient-P_Vx-Ks$default(Companion brush$Companion0, Pair[] arr_pair, long v, float f, int v1, int v2, Object object0) {
            if((v2 & 2) != 0) {
                v = 0x7FC000007FC00000L;
            }
            if((v2 & 8) != 0) {
                v1 = 0;
            }
            return brush$Companion0.radialGradient-P_Vx-Ks(arr_pair, v, ((v2 & 4) == 0 ? f : Infinityf), v1);
        }

        public final Brush sweepGradient-Uv8p0NA(List list0, long v) {
            Intrinsics.checkNotNullParameter(list0, "colors");
            return new SweepGradient(v, list0, null, null);
        }

        public final Brush sweepGradient-Uv8p0NA(Pair[] arr_pair, long v) {
            Intrinsics.checkNotNullParameter(arr_pair, "colorStops");
            ArrayList arrayList0 = new ArrayList(arr_pair.length);
            for(int v2 = 0; v2 < arr_pair.length; ++v2) {
                arrayList0.add(Color.box-impl(((Color)arr_pair[v2].getSecond()).unbox-impl()));
            }
            ArrayList arrayList1 = new ArrayList(arr_pair.length);
            for(int v1 = 0; v1 < arr_pair.length; ++v1) {
                arrayList1.add(((Number)arr_pair[v1].getFirst()).floatValue());
            }
            return new SweepGradient(v, arrayList0, arrayList1, null);
        }

        public static Brush sweepGradient-Uv8p0NA$default(Companion brush$Companion0, List list0, long v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                v = 0x7FC000007FC00000L;
            }
            return brush$Companion0.sweepGradient-Uv8p0NA(list0, v);
        }

        public static Brush sweepGradient-Uv8p0NA$default(Companion brush$Companion0, Pair[] arr_pair, long v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                v = 0x7FC000007FC00000L;
            }
            return brush$Companion0.sweepGradient-Uv8p0NA(arr_pair, v);
        }

        public final Brush verticalGradient-8A-3gB4(List list0, float f, float f1, int v) {
            Intrinsics.checkNotNullParameter(list0, "colors");
            return this.linearGradient-mHitzGk(list0, OffsetKt.Offset(0.0f, f), OffsetKt.Offset(0.0f, f1), v);
        }

        public final Brush verticalGradient-8A-3gB4(Pair[] arr_pair, float f, float f1, int v) {
            Intrinsics.checkNotNullParameter(arr_pair, "colorStops");
            return this.linearGradient-mHitzGk(((Pair[])Arrays.copyOf(arr_pair, arr_pair.length)), OffsetKt.Offset(0.0f, f), OffsetKt.Offset(0.0f, f1), v);
        }

        public static Brush verticalGradient-8A-3gB4$default(Companion brush$Companion0, List list0, float f, float f1, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if((v1 & 4) != 0) {
                f1 = Infinityf;
            }
            if((v1 & 8) != 0) {
                v = 0;
            }
            return brush$Companion0.verticalGradient-8A-3gB4(list0, f, f1, v);
        }

        public static Brush verticalGradient-8A-3gB4$default(Companion brush$Companion0, Pair[] arr_pair, float f, float f1, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if((v1 & 4) != 0) {
                f1 = Infinityf;
            }
            if((v1 & 8) != 0) {
                v = 0;
            }
            return brush$Companion0.verticalGradient-8A-3gB4(arr_pair, f, f1, v);
        }
    }

    public static final Companion Companion;

    static {
        Brush.Companion = new Companion(null);
    }

    private Brush() {
    }

    public Brush(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public abstract void applyTo-Pq9zytI(long arg1, Paint arg2, float arg3);
}

