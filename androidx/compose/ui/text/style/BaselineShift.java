package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0012\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\b\u001A\u00020\t2\b\u0010\n\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift;", "", "multiplier", "", "constructor-impl", "(F)F", "getMultiplier", "()F", "equals", "", "other", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(F)I", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class BaselineShift {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\'\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007R\'\u0010\t\u001A\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001A\u0004\b\u000B\u0010\u0007R\'\u0010\f\u001A\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001A\u0004\b\u000E\u0010\u0007\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/text/style/BaselineShift$Companion;", "", "()V", "None", "Landroidx/compose/ui/text/style/BaselineShift;", "getNone-y9eOQZs$annotations", "getNone-y9eOQZs", "()F", "F", "Subscript", "getSubscript-y9eOQZs$annotations", "getSubscript-y9eOQZs", "Superscript", "getSuperscript-y9eOQZs$annotations", "getSuperscript-y9eOQZs", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final float getNone-y9eOQZs() [...] // 潜在的解密器

        public static void getNone-y9eOQZs$annotations() {
        }

        // 去混淆评级： 低(20)
        public final float getSubscript-y9eOQZs() {
            return -0.5f;
        }

        public static void getSubscript-y9eOQZs$annotations() {
        }

        // 去混淆评级： 低(20)
        public final float getSuperscript-y9eOQZs() {
            return 0.5f;
        }

        public static void getSuperscript-y9eOQZs$annotations() {
        }
    }

    public static final Companion Companion;
    private static final float None;
    private static final float Subscript;
    private static final float Superscript;
    private final float multiplier;

    static {
        BaselineShift.Companion = new Companion(null);
        BaselineShift.Superscript = 0.5f;
        BaselineShift.Subscript = -0.5f;
        BaselineShift.None = 0.0f;
    }

    private BaselineShift(float f) {
        this.multiplier = f;
    }

    public static final float access$getNone$cp() [...] // 潜在的解密器

    public static final float access$getSubscript$cp() [...] // 潜在的解密器

    public static final float access$getSuperscript$cp() [...] // 潜在的解密器

    public static final BaselineShift box-impl(float f) {
        return new BaselineShift(f);
    }

    public static float constructor-impl(float f) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return BaselineShift.equals-impl(this.unbox-impl(), object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(float f, Object object0) {
        return object0 instanceof BaselineShift ? Intrinsics.areEqual(f, ((BaselineShift)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(float f, float f1) {
        return Intrinsics.areEqual(f, f1);
    }

    public final float getMultiplier() {
        return this.unbox-impl();
    }

    @Override
    public int hashCode() {
        return BaselineShift.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(float f) {
        return Float.floatToIntBits(f);
    }

    @Override
    public String toString() {
        return "BaselineShift(multiplier=" + this.unbox-impl() + ')';
    }

    public static String toString-impl(float f) [...] // Inlined contents

    public final float unbox-impl() {
        return this.multiplier;
    }
}

