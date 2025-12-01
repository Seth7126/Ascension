package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0012\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\u0006\u001A\u00020\u00072\b\u0010\b\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u000E\u0010\u0002\u001A\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType;", "", "type", "", "constructor-impl", "(J)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class TextUnitType {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006R\u001C\u0010\b\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\t\u0010\u0006R\u001C\u0010\n\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u000B\u0010\u0006\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType$Companion;", "", "()V", "Em", "Landroidx/compose/ui/unit/TextUnitType;", "getEm-UIouoOA", "()J", "J", "Sp", "getSp-UIouoOA", "Unspecified", "getUnspecified-UIouoOA", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getEm-UIouoOA() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long getSp-UIouoOA() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long getUnspecified-UIouoOA() [...] // 潜在的解密器
    }

    public static final Companion Companion;
    private static final long Em;
    private static final long Sp;
    private static final long Unspecified;
    private final long type;

    static {
        TextUnitType.Companion = new Companion(null);
        TextUnitType.Unspecified = 0L;
        TextUnitType.Sp = 0x100000000L;
        TextUnitType.Em = 0x200000000L;
    }

    private TextUnitType(long v) {
        this.type = v;
    }

    public static final long access$getEm$cp() [...] // 潜在的解密器

    public static final long access$getSp$cp() [...] // 潜在的解密器

    public static final long access$getUnspecified$cp() [...] // 潜在的解密器

    public static final TextUnitType box-impl(long v) {
        return new TextUnitType(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return TextUnitType.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof TextUnitType ? v == ((TextUnitType)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return TextUnitType.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Override
    public String toString() {
        return TextUnitType.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(long v) {
        if(TextUnitType.equals-impl0(v, 0L)) {
            return "Unspecified";
        }
        if(TextUnitType.equals-impl0(v, 0x100000000L)) {
            return "Sp";
        }
        return TextUnitType.equals-impl0(v, 0x200000000L) ? "Em" : "Invalid";
    }

    public final long unbox-impl() {
        return this.type;
    }
}

