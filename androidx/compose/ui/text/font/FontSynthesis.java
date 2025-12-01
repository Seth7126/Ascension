package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\f\u001A\u00020\u00072\b\u0010\r\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0005J\u000F\u0010\u0012\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001A\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0014\u0010\n\u001A\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\tR\u000E\u0010\u0002\u001A\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis;", "", "value", "", "constructor-impl", "(I)I", "isStyleOn", "", "isStyleOn-impl$ui_text_release", "(I)Z", "isWeightOn", "isWeightOn-impl$ui_text_release", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class FontSynthesis {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006R\u001C\u0010\b\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\t\u0010\u0006R\u001C\u0010\n\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u000B\u0010\u0006R\u001C\u0010\f\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\r\u0010\u0006\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis$Companion;", "", "()V", "All", "Landroidx/compose/ui/text/font/FontSynthesis;", "getAll-GVVA2EU", "()I", "I", "None", "getNone-GVVA2EU", "Style", "getStyle-GVVA2EU", "Weight", "getWeight-GVVA2EU", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getAll-GVVA2EU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getNone-GVVA2EU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getStyle-GVVA2EU() {
            return 3;
        }

        // 去混淆评级： 低(20)
        public final int getWeight-GVVA2EU() {
            return 2;
        }
    }

    private static final int All;
    public static final Companion Companion;
    private static final int None;
    private static final int Style;
    private static final int Weight;
    private final int value;

    static {
        FontSynthesis.Companion = new Companion(null);
        FontSynthesis.None = 0;
        FontSynthesis.All = 1;
        FontSynthesis.Weight = 2;
        FontSynthesis.Style = 3;
    }

    private FontSynthesis(int v) {
        this.value = v;
    }

    public static final int access$getAll$cp() [...] // 潜在的解密器

    public static final int access$getNone$cp() [...] // 潜在的解密器

    public static final int access$getStyle$cp() [...] // 潜在的解密器

    public static final int access$getWeight$cp() [...] // 潜在的解密器

    public static final FontSynthesis box-impl(int v) {
        return new FontSynthesis(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return FontSynthesis.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof FontSynthesis ? v == ((FontSynthesis)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return this.unbox-impl();
    }

    public static int hashCode-impl(int v) [...] // Inlined contents

    // 去混淆评级： 低(20)
    public static final boolean isStyleOn-impl$ui_text_release(int v) {
        return FontSynthesis.equals-impl0(v, FontSynthesis.All) || FontSynthesis.equals-impl0(v, FontSynthesis.Style);
    }

    // 去混淆评级： 低(20)
    public static final boolean isWeightOn-impl$ui_text_release(int v) {
        return FontSynthesis.equals-impl0(v, FontSynthesis.All) || FontSynthesis.equals-impl0(v, FontSynthesis.Weight);
    }

    @Override
    public String toString() {
        return FontSynthesis.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(int v) {
        if(FontSynthesis.equals-impl0(v, FontSynthesis.None)) {
            return "None";
        }
        if(FontSynthesis.equals-impl0(v, FontSynthesis.All)) {
            return "All";
        }
        if(FontSynthesis.equals-impl0(v, FontSynthesis.Weight)) {
            return "Weight";
        }
        return FontSynthesis.equals-impl0(v, FontSynthesis.Style) ? "Style" : "Invalid";
    }

    public final int unbox-impl() {
        return this.value;
    }
}

