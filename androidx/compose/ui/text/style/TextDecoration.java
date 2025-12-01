package androidx.compose.ui.text.style;

import androidx.compose.ui.text.TempListUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000F\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u0000H\u0086\u0002J\u0013\u0010\n\u001A\u00020\b2\b\u0010\t\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000B\u001A\u00020\u0003H\u0016J\u0011\u0010\f\u001A\u00020\u00002\u0006\u0010\r\u001A\u00020\u0000H\u0086\u0002J\b\u0010\u000E\u001A\u00020\u000FH\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration;", "", "mask", "", "(I)V", "getMask", "()I", "contains", "", "other", "equals", "hashCode", "plus", "decoration", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TextDecoration {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000E\u001A\u00020\u00042\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00040\u0010R\u001C\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007R\u001C\u0010\b\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\t\u0010\u0002\u001A\u0004\b\n\u0010\u0007R\u001C\u0010\u000B\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\f\u0010\u0002\u001A\u0004\b\r\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration$Companion;", "", "()V", "LineThrough", "Landroidx/compose/ui/text/style/TextDecoration;", "getLineThrough$annotations", "getLineThrough", "()Landroidx/compose/ui/text/style/TextDecoration;", "None", "getNone$annotations", "getNone", "Underline", "getUnderline$annotations", "getUnderline", "combine", "decorations", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final TextDecoration combine(List list0) {
            Intrinsics.checkNotNullParameter(list0, "decorations");
            Integer integer0 = 0;
            int v1 = list0.size();
            if(v1 - 1 >= 0) {
                for(int v = 0; true; ++v) {
                    integer0 = (int)(((TextDecoration)list0.get(v)).getMask() | integer0.intValue());
                    if(v + 1 > v1 - 1) {
                        break;
                    }
                }
            }
            return new TextDecoration(integer0.intValue());
        }

        public final TextDecoration getLineThrough() {
            return TextDecoration.LineThrough;
        }

        public static void getLineThrough$annotations() {
        }

        public final TextDecoration getNone() {
            return TextDecoration.None;
        }

        public static void getNone$annotations() {
        }

        public final TextDecoration getUnderline() {
            return TextDecoration.Underline;
        }

        public static void getUnderline$annotations() {
        }
    }

    public static final Companion Companion;
    private static final TextDecoration LineThrough;
    private static final TextDecoration None;
    private static final TextDecoration Underline;
    private final int mask;

    static {
        TextDecoration.Companion = new Companion(null);
        TextDecoration.None = new TextDecoration(0);
        TextDecoration.Underline = new TextDecoration(1);
        TextDecoration.LineThrough = new TextDecoration(2);
    }

    public TextDecoration(int v) {
        this.mask = v;
    }

    public final boolean contains(TextDecoration textDecoration0) {
        Intrinsics.checkNotNullParameter(textDecoration0, "other");
        return (textDecoration0.mask | this.mask) == this.mask;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof TextDecoration ? this.mask == ((TextDecoration)object0).mask : false;
    }

    public final int getMask() {
        return this.mask;
    }

    @Override
    public int hashCode() {
        return this.mask;
    }

    public final TextDecoration plus(TextDecoration textDecoration0) {
        Intrinsics.checkNotNullParameter(textDecoration0, "decoration");
        return new TextDecoration(textDecoration0.mask | this.mask);
    }

    @Override
    public String toString() {
        if(this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList0 = new ArrayList();
        if((this.mask & TextDecoration.Underline.mask) != 0) {
            arrayList0.add("Underline");
        }
        if((this.mask & TextDecoration.LineThrough.mask) != 0) {
            arrayList0.add("LineThrough");
        }
        return arrayList0.size() == 1 ? Intrinsics.stringPlus("TextDecoration.", arrayList0.get(0)) : "TextDecoration[" + TempListUtilsKt.fastJoinToString$default(arrayList0, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}

