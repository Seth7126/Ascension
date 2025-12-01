package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\u0006\u001A\u00020\u00072\b\u0010\b\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000F\u0010\r\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u000E\u0010\u0002\u001A\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class TextDirection {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006R\u001C\u0010\b\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\t\u0010\u0006R\u001C\u0010\n\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u000B\u0010\u0006R\u001C\u0010\f\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\r\u0010\u0006R\u001C\u0010\u000E\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u000F\u0010\u0006\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/style/TextDirection$Companion;", "", "()V", "Content", "Landroidx/compose/ui/text/style/TextDirection;", "getContent-s_7X-co", "()I", "I", "ContentOrLtr", "getContentOrLtr-s_7X-co", "ContentOrRtl", "getContentOrRtl-s_7X-co", "Ltr", "getLtr-s_7X-co", "Rtl", "getRtl-s_7X-co", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getContent-s_7X-co() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getContentOrLtr-s_7X-co() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getContentOrRtl-s_7X-co() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getLtr-s_7X-co() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getRtl-s_7X-co() [...] // 潜在的解密器
    }

    public static final Companion Companion;
    private static final int Content;
    private static final int ContentOrLtr;
    private static final int ContentOrRtl;
    private static final int Ltr;
    private static final int Rtl;
    private final int value;

    static {
        TextDirection.Companion = new Companion(null);
        TextDirection.Ltr = 1;
        TextDirection.Rtl = 2;
        TextDirection.Content = 3;
        TextDirection.ContentOrLtr = 4;
        TextDirection.ContentOrRtl = 5;
    }

    private TextDirection(int v) {
        this.value = v;
    }

    public static final int access$getContent$cp() [...] // 潜在的解密器

    public static final int access$getContentOrLtr$cp() [...] // 潜在的解密器

    public static final int access$getContentOrRtl$cp() [...] // 潜在的解密器

    public static final int access$getLtr$cp() [...] // 潜在的解密器

    public static final int access$getRtl$cp() [...] // 潜在的解密器

    public static final TextDirection box-impl(int v) {
        return new TextDirection(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return TextDirection.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof TextDirection ? v == ((TextDirection)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return this.unbox-impl();
    }

    public static int hashCode-impl(int v) [...] // Inlined contents

    @Override
    public String toString() {
        return TextDirection.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(int v) {
        if(TextDirection.equals-impl0(v, TextDirection.Ltr)) {
            return "Ltr";
        }
        if(TextDirection.equals-impl0(v, TextDirection.Rtl)) {
            return "Rtl";
        }
        if(TextDirection.equals-impl0(v, 3)) {
            return "Content";
        }
        if(TextDirection.equals-impl0(v, TextDirection.ContentOrLtr)) {
            return "ContentOrLtr";
        }
        return TextDirection.equals-impl0(v, TextDirection.ContentOrRtl) ? "ContentOrRtl" : "Invalid";
    }

    public final int unbox-impl() {
        return this.value;
    }
}

