package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b!\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0012\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010#\u001A\u00020\u00002\b\b\u0002\u0010 \u001A\u00020\u00072\b\b\u0002\u0010\u001C\u001A\u00020\u00072\b\b\u0002\u0010\u001E\u001A\u00020\u00072\b\b\u0002\u0010\u001A\u001A\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010%J\u001A\u0010&\u001A\u00020\u000B2\b\u0010\'\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010\tJ\u000F\u0010,\u001A\u00020-H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0006\u001A\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0011\u0010\n\u001A\u00020\u000B8F¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0011\u0010\u000E\u001A\u00020\u000B8F¢\u0006\u0006\u001A\u0004\b\u000F\u0010\rR\u001A\u0010\u0010\u001A\u00020\u000B8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\rR\u001A\u0010\u0014\u001A\u00020\u000B8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0012\u001A\u0004\b\u0016\u0010\rR\u001A\u0010\u0017\u001A\u00020\u000B8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0012\u001A\u0004\b\u0019\u0010\rR\u0011\u0010\u001A\u001A\u00020\u00078F¢\u0006\u0006\u001A\u0004\b\u001B\u0010\tR\u0011\u0010\u001C\u001A\u00020\u00078F¢\u0006\u0006\u001A\u0004\b\u001D\u0010\tR\u0011\u0010\u001E\u001A\u00020\u00078F¢\u0006\u0006\u001A\u0004\b\u001F\u0010\tR\u0011\u0010 \u001A\u00020\u00078F¢\u0006\u0006\u001A\u0004\b!\u0010\tR\u0016\u0010\u0002\u001A\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\"\u0010\u0012\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u00061"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "value", "", "constructor-impl", "(J)J", "focusIndex", "", "getFocusIndex-impl", "(J)I", "hasBoundedHeight", "", "getHasBoundedHeight-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedWidth-impl", "hasFixedHeight", "getHasFixedHeight$annotations", "()V", "getHasFixedHeight-impl", "hasFixedWidth", "getHasFixedWidth$annotations", "getHasFixedWidth-impl", "isZero", "isZero$annotations", "isZero-impl", "maxHeight", "getMaxHeight-impl", "maxWidth", "getMaxWidth-impl", "minHeight", "getMinHeight-impl", "minWidth", "getMinWidth-impl", "getValue$annotations", "copy", "copy-Zbe2FdA", "(JIIII)J", "equals", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class Constraints {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001A\u00020\b2\u0006\u0010\u0018\u001A\u00020\bH\u0002J8\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\b2\u0006\u0010\u001C\u001A\u00020\b2\u0006\u0010\u001D\u001A\u00020\b2\u0006\u0010\u001E\u001A\u00020\bH\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b\u001F\u0010 J(\u0010!\u001A\u00020\u001A2\u0006\u0010\"\u001A\u00020\b2\u0006\u0010#\u001A\u00020\bH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b$\u0010%J \u0010&\u001A\u00020\u001A2\u0006\u0010#\u001A\u00020\bH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b\'\u0010(J \u0010)\u001A\u00020\u001A2\u0006\u0010\"\u001A\u00020\bH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b*\u0010(R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\bX\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u0004X\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000B\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\f\u001A\u00020\u0004X\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000E\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000F\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0010\u001A\u00020\u0004X\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0011\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0012\u001A\u00020\u0004X\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0013\u001A\u00020\u0006X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0014\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0015\u001A\u00020\bX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0016\u001A\u00020\u0006X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006+"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "()V", "FocusMask", "", "HeightMask", "", "Infinity", "", "MaxFocusBits", "MaxFocusHeight", "MaxFocusMask", "MaxFocusWidth", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusHeight", "MinFocusMask", "MinFocusWidth", "MinHeightOffsets", "MinNonFocusBits", "MinNonFocusMask", "WidthMask", "bitsNeedForSize", "size", "createConstraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "createConstraints-Zbe2FdA$ui_unit_release", "(IIII)J", "fixed", "width", "height", "fixed-JhjzzOo", "(II)J", "fixedHeight", "fixedHeight-OenEA2s", "(I)J", "fixedWidth", "fixedWidth-OenEA2s", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        private final int bitsNeedForSize(int v) {
            if(v < 0x1FFF) {
                return 13;
            }
            if(v < 0x7FFF) {
                return 15;
            }
            if(v < 0xFFFF) {
                return 16;
            }
            if(v >= 0x3FFFF) {
                throw new IllegalArgumentException("Can\'t represent a size of " + v + " in Constraints");
            }
            return 18;
        }

        public final long createConstraints-Zbe2FdA$ui_unit_release(int v, int v1, int v2, int v3) {
            long v8;
            int v4 = v3 == 0x7FFFFFFF ? v2 : v3;
            int v5 = this.bitsNeedForSize(v4);
            int v6 = v1 == 0x7FFFFFFF ? v : v1;
            int v7 = this.bitsNeedForSize(v6);
            if(v5 + v7 > 0x1F) {
                throw new IllegalArgumentException("Can\'t represent a width of " + v6 + " and height of " + v4 + " in Constraints");
            }
            switch(v7) {
                case 13: {
                    v8 = 3L;
                    break;
                }
                case 15: {
                    v8 = 2L;
                    break;
                }
                case 16: {
                    v8 = 0L;
                    break;
                }
                case 18: {
                    v8 = 1L;
                    break;
                }
                default: {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
            }
            int v9 = Constraints.MinHeightOffsets[((int)v8)];
            return ((long)(v1 == 0x7FFFFFFF ? 0 : v1 + 1)) << 33 | (v8 | ((long)v) << 2) | ((long)v2) << v9 | ((long)(v3 == 0x7FFFFFFF ? 0 : v3 + 1)) << v9 + 0x1F;
        }

        public final long fixed-JhjzzOo(int v, int v1) {
            if(v < 0 || v1 < 0) {
                throw new IllegalArgumentException(("width(" + v + ") and height(" + v1 + ") must be >= 0").toString());
            }
            return this.createConstraints-Zbe2FdA$ui_unit_release(v, v, v1, v1);
        }

        public final long fixedHeight-OenEA2s(int v) {
            if(v < 0) {
                throw new IllegalArgumentException(("height(" + v + ") must be >= 0").toString());
            }
            return this.createConstraints-Zbe2FdA$ui_unit_release(0, 0x7FFFFFFF, v, v);
        }

        public final long fixedWidth-OenEA2s(int v) {
            if(v < 0) {
                throw new IllegalArgumentException(("width(" + v + ") must be >= 0").toString());
            }
            return this.createConstraints-Zbe2FdA$ui_unit_release(v, v, 0, 0x7FFFFFFF);
        }
    }

    public static final Companion Companion = null;
    private static final long FocusMask = 3L;
    private static final int[] HeightMask = null;
    public static final int Infinity = 0x7FFFFFFF;
    private static final int MaxFocusBits = 18;
    private static final long MaxFocusHeight = 3L;
    private static final int MaxFocusMask = 0x3FFFF;
    private static final long MaxFocusWidth = 1L;
    private static final int MaxNonFocusBits = 13;
    private static final int MaxNonFocusMask = 0x1FFF;
    private static final int MinFocusBits = 16;
    private static final long MinFocusHeight = 2L;
    private static final int MinFocusMask = 0xFFFF;
    private static final long MinFocusWidth = 0L;
    private static final int[] MinHeightOffsets = null;
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 0x7FFF;
    private static final int[] WidthMask;
    private final long value;

    static {
        Constraints.Companion = new Companion(null);
        Constraints.MinHeightOffsets = new int[]{18, 20, 17, 15};
        Constraints.WidthMask = new int[]{0xFFFF, 0x3FFFF, 0x7FFF, 0x1FFF};
        Constraints.HeightMask = new int[]{0x7FFF, 0x1FFF, 0xFFFF, 0x3FFFF};
    }

    private Constraints(long v) {
        this.value = v;
    }

    public static final Constraints box-impl(long v) {
        return new Constraints(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-Zbe2FdA(long v, int v1, int v2, int v3, int v4) {
        if(v3 < 0 || v1 < 0) {
            throw new IllegalArgumentException(("minHeight(" + v3 + ") and minWidth(" + v1 + ") must be >= 0").toString());
        }
        if(v2 < v1 && v2 != 0x7FFFFFFF) {
            throw new IllegalArgumentException(("maxWidth(" + v2 + ") must be >= minWidth(" + v1 + ')').toString());
        }
        if(v4 < v3 && v4 != 0x7FFFFFFF) {
            throw new IllegalArgumentException(("maxHeight(" + v4 + ") must be >= minHeight(" + v3 + ')').toString());
        }
        return Constraints.Companion.createConstraints-Zbe2FdA$ui_unit_release(v1, v2, v3, v4);
    }

    public static long copy-Zbe2FdA$default(long v, int v1, int v2, int v3, int v4, int v5, Object object0) {
        if((v5 & 1) != 0) {
            v1 = Constraints.getMinWidth-impl(v);
        }
        if((v5 & 2) != 0) {
            v2 = Constraints.getMaxWidth-impl(v);
        }
        if((v5 & 4) != 0) {
            v3 = Constraints.getMinHeight-impl(v);
        }
        if((v5 & 8) != 0) {
            v4 = Constraints.getMaxHeight-impl(v);
        }
        return Constraints.copy-Zbe2FdA(v, v1, v2, v3, v4);
    }

    @Override
    public boolean equals(Object object0) {
        return Constraints.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof Constraints ? v == ((Constraints)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    private static final int getFocusIndex-impl(long v) [...] // Inlined contents

    public static final boolean getHasBoundedHeight-impl(long v) {
        int v1 = (int)(v & 3L);
        return (((int)(v >> Constraints.MinHeightOffsets[v1] + 0x1F)) & Constraints.HeightMask[v1]) != 0;
    }

    public static final boolean getHasBoundedWidth-impl(long v) {
        return (((int)(v >> 33)) & Constraints.WidthMask[((int)(v & 3L))]) != 0;
    }

    public static void getHasFixedHeight$annotations() {
    }

    public static final boolean getHasFixedHeight-impl(long v) {
        return Constraints.getMaxHeight-impl(v) == Constraints.getMinHeight-impl(v);
    }

    public static void getHasFixedWidth$annotations() {
    }

    public static final boolean getHasFixedWidth-impl(long v) {
        return Constraints.getMaxWidth-impl(v) == Constraints.getMinWidth-impl(v);
    }

    public static final int getMaxHeight-impl(long v) {
        int v1 = (int)(v & 3L);
        int v2 = ((int)(v >> Constraints.MinHeightOffsets[v1] + 0x1F)) & Constraints.HeightMask[v1];
        return v2 == 0 ? 0x7FFFFFFF : v2 - 1;
    }

    public static final int getMaxWidth-impl(long v) {
        int v1 = ((int)(v >> 33)) & Constraints.WidthMask[((int)(v & 3L))];
        return v1 == 0 ? 0x7FFFFFFF : v1 - 1;
    }

    public static final int getMinHeight-impl(long v) {
        int v1 = (int)(v & 3L);
        return ((int)(v >> Constraints.MinHeightOffsets[v1])) & Constraints.HeightMask[v1];
    }

    public static final int getMinWidth-impl(long v) {
        return ((int)(v >> 2)) & Constraints.WidthMask[Constraints.getFocusIndex-impl(v)];
    }

    public static void getValue$annotations() {
    }

    @Override
    public int hashCode() {
        return Constraints.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static void isZero$annotations() {
    }

    public static final boolean isZero-impl(long v) {
        return Constraints.getMaxWidth-impl(v) == 0 || Constraints.getMaxHeight-impl(v) == 0;
    }

    @Override
    public String toString() {
        return Constraints.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(long v) {
        int v1 = Constraints.getMaxWidth-impl(v);
        String s = "Infinity";
        String s1 = v1 == 0x7FFFFFFF ? "Infinity" : String.valueOf(v1);
        int v2 = Constraints.getMaxHeight-impl(v);
        if(v2 != 0x7FFFFFFF) {
            s = String.valueOf(v2);
        }
        return "Constraints(minWidth = " + Constraints.getMinWidth-impl(v) + ", maxWidth = " + s1 + ", minHeight = " + Constraints.getMinHeight-impl(v) + ", maxHeight = " + s + ')';
    }

    public final long unbox-impl() {
        return this.value;
    }
}

