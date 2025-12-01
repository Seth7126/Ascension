package androidx.compose.ui.hapticfeedback;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0012\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\u0006\u001A\u00020\u00072\b\u0010\b\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000F\u0010\r\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u000E\u0010\u0002\u001A\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class HapticFeedbackType {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000F\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00040\nø\u0001\u0000R\u001A\u0010\u0003\u001A\u00020\u00048Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u001A\u0010\u0007\u001A\u00020\u00048Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b\b\u0010\u0006\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;", "", "()V", "LongPress", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "getLongPress-5zf0vsI", "()I", "TextHandleMove", "getTextHandleMove-5zf0vsI", "values", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getLongPress-5zf0vsI() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getTextHandleMove-5zf0vsI() [...] // 潜在的解密器

        // 去混淆评级： 低(40)
        public final List values() {
            return CollectionsKt.listOf(new HapticFeedbackType[]{HapticFeedbackType.box-impl(0), HapticFeedbackType.box-impl(9)});
        }
    }

    public static final Companion Companion;
    private final int value;

    static {
        HapticFeedbackType.Companion = new Companion(null);
    }

    private HapticFeedbackType(int v) {
        this.value = v;
    }

    public static final HapticFeedbackType box-impl(int v) {
        return new HapticFeedbackType(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return HapticFeedbackType.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof HapticFeedbackType ? v == ((HapticFeedbackType)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return HapticFeedbackType.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    public String toString() {
        return HapticFeedbackType.toString-impl(this.unbox-impl());
    }

    // 去混淆评级： 低(23)
    public static String toString-impl(int v) {
        if(HapticFeedbackType.equals-impl0(v, 0)) {
            return "LongPress";
        }
        return HapticFeedbackType.equals-impl0(v, 9) ? "TextHandleMove" : "Invalid";
    }

    public final int unbox-impl() {
        return this.value;
    }
}

