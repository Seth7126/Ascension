package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\u0006\u001A\u00020\u00072\b\u0010\b\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000F\u0010\r\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/PathOperation;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class PathOperation {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006R\u001C\u0010\b\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\t\u0010\u0006R\u001C\u0010\n\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u000B\u0010\u0006R\u001C\u0010\f\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\r\u0010\u0006R\u001C\u0010\u000E\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u000F\u0010\u0006\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/PathOperation$Companion;", "", "()V", "Difference", "Landroidx/compose/ui/graphics/PathOperation;", "getDifference-b3I0S0c", "()I", "I", "Intersect", "getIntersect-b3I0S0c", "ReverseDifference", "getReverseDifference-b3I0S0c", "Union", "getUnion-b3I0S0c", "Xor", "getXor-b3I0S0c", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getDifference-b3I0S0c() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getIntersect-b3I0S0c() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getReverseDifference-b3I0S0c() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getUnion-b3I0S0c() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getXor-b3I0S0c() [...] // 潜在的解密器
    }

    public static final Companion Companion;
    private static final int Difference;
    private static final int Intersect;
    private static final int ReverseDifference;
    private static final int Union;
    private static final int Xor;
    private final int value;

    static {
        PathOperation.Companion = new Companion(null);
        PathOperation.Difference = 0;
        PathOperation.Intersect = 1;
        PathOperation.Union = 2;
        PathOperation.Xor = 3;
        PathOperation.ReverseDifference = 4;
    }

    private PathOperation(int v) {
        this.value = v;
    }

    public static final int access$getDifference$cp() [...] // 潜在的解密器

    public static final int access$getIntersect$cp() [...] // 潜在的解密器

    public static final int access$getReverseDifference$cp() [...] // 潜在的解密器

    public static final int access$getUnion$cp() [...] // 潜在的解密器

    public static final int access$getXor$cp() [...] // 潜在的解密器

    public static final PathOperation box-impl(int v) {
        return new PathOperation(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return PathOperation.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof PathOperation ? v == ((PathOperation)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return PathOperation.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    public String toString() {
        return PathOperation.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(int v) {
        if(PathOperation.equals-impl0(v, PathOperation.Difference)) {
            return "Difference";
        }
        if(PathOperation.equals-impl0(v, PathOperation.Intersect)) {
            return "Intersect";
        }
        if(PathOperation.equals-impl0(v, PathOperation.Union)) {
            return "Union";
        }
        if(PathOperation.equals-impl0(v, PathOperation.Xor)) {
            return "Xor";
        }
        return PathOperation.equals-impl0(v, PathOperation.ReverseDifference) ? "ReverseDifference" : "Unknown";
    }

    public final int unbox-impl() {
        return this.value;
    }
}

