package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000F2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000FB\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u0000H\u0096\u0002J\u0013\u0010\t\u001A\u00020\n2\b\u0010\b\u001A\u0004\u0018\u00010\u000BH\u0096\u0002J\b\u0010\f\u001A\u00020\u0003H\u0016J\b\u0010\r\u001A\u00020\u000EH\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "", "weight", "", "(I)V", "getWeight", "()I", "compareTo", "other", "equals", "", "", "hashCode", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class FontWeight implements Comparable {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007R\u001C\u0010\b\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\t\u0010\u0002\u001A\u0004\b\n\u0010\u0007R\u001C\u0010\u000B\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\f\u0010\u0002\u001A\u0004\b\r\u0010\u0007R\u001C\u0010\u000E\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u000F\u0010\u0002\u001A\u0004\b\u0010\u0010\u0007R\u001C\u0010\u0011\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001A\u0004\b\u0013\u0010\u0007R\u001C\u0010\u0014\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001A\u0004\b\u0016\u0010\u0007R\u001C\u0010\u0017\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001A\u0004\b\u0019\u0010\u0007R\u001C\u0010\u001A\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u001B\u0010\u0002\u001A\u0004\b\u001C\u0010\u0007R\u001C\u0010\u001D\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u001E\u0010\u0002\u001A\u0004\b\u001F\u0010\u0007R\u001C\u0010 \u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b!\u0010\u0002\u001A\u0004\b\"\u0010\u0007R\u001C\u0010#\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b$\u0010\u0002\u001A\u0004\b%\u0010\u0007R\u001C\u0010&\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\'\u0010\u0002\u001A\u0004\b(\u0010\u0007R\u001C\u0010)\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b*\u0010\u0002\u001A\u0004\b+\u0010\u0007R\u001C\u0010,\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b-\u0010\u0002\u001A\u0004\b.\u0010\u0007R\u001C\u0010/\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b0\u0010\u0002\u001A\u0004\b1\u0010\u0007R\u001C\u00102\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b3\u0010\u0002\u001A\u0004\b4\u0010\u0007R\u001C\u00105\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b6\u0010\u0002\u001A\u0004\b7\u0010\u0007R\u001C\u00108\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b9\u0010\u0002\u001A\u0004\b:\u0010\u0007R\u001A\u0010;\u001A\b\u0012\u0004\u0012\u00020\u00040<X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b=\u0010>\u00A8\u0006?"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight$Companion;", "", "()V", "Black", "Landroidx/compose/ui/text/font/FontWeight;", "getBlack$annotations", "getBlack", "()Landroidx/compose/ui/text/font/FontWeight;", "Bold", "getBold$annotations", "getBold", "ExtraBold", "getExtraBold$annotations", "getExtraBold", "ExtraLight", "getExtraLight$annotations", "getExtraLight", "Light", "getLight$annotations", "getLight", "Medium", "getMedium$annotations", "getMedium", "Normal", "getNormal$annotations", "getNormal", "SemiBold", "getSemiBold$annotations", "getSemiBold", "Thin", "getThin$annotations", "getThin", "W100", "getW100$annotations", "getW100", "W200", "getW200$annotations", "getW200", "W300", "getW300$annotations", "getW300", "W400", "getW400$annotations", "getW400", "W500", "getW500$annotations", "getW500", "W600", "getW600$annotations", "getW600", "W700", "getW700$annotations", "getW700", "W800", "getW800$annotations", "getW800", "W900", "getW900$annotations", "getW900", "values", "", "getValues$ui_text_release", "()Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final FontWeight getBlack() {
            return FontWeight.Black;
        }

        public static void getBlack$annotations() {
        }

        public final FontWeight getBold() {
            return FontWeight.Bold;
        }

        public static void getBold$annotations() {
        }

        public final FontWeight getExtraBold() {
            return FontWeight.ExtraBold;
        }

        public static void getExtraBold$annotations() {
        }

        public final FontWeight getExtraLight() {
            return FontWeight.ExtraLight;
        }

        public static void getExtraLight$annotations() {
        }

        public final FontWeight getLight() {
            return FontWeight.Light;
        }

        public static void getLight$annotations() {
        }

        public final FontWeight getMedium() {
            return FontWeight.Medium;
        }

        public static void getMedium$annotations() {
        }

        public final FontWeight getNormal() {
            return FontWeight.Normal;
        }

        public static void getNormal$annotations() {
        }

        public final FontWeight getSemiBold() {
            return FontWeight.SemiBold;
        }

        public static void getSemiBold$annotations() {
        }

        public final FontWeight getThin() {
            return FontWeight.Thin;
        }

        public static void getThin$annotations() {
        }

        public final List getValues$ui_text_release() {
            return FontWeight.values;
        }

        public final FontWeight getW100() {
            return FontWeight.W100;
        }

        public static void getW100$annotations() {
        }

        public final FontWeight getW200() {
            return FontWeight.W200;
        }

        public static void getW200$annotations() {
        }

        public final FontWeight getW300() {
            return FontWeight.W300;
        }

        public static void getW300$annotations() {
        }

        public final FontWeight getW400() {
            return FontWeight.W400;
        }

        public static void getW400$annotations() {
        }

        public final FontWeight getW500() {
            return FontWeight.W500;
        }

        public static void getW500$annotations() {
        }

        public final FontWeight getW600() {
            return FontWeight.W600;
        }

        public static void getW600$annotations() {
        }

        public final FontWeight getW700() {
            return FontWeight.W700;
        }

        public static void getW700$annotations() {
        }

        public final FontWeight getW800() {
            return FontWeight.W800;
        }

        public static void getW800$annotations() {
        }

        public final FontWeight getW900() {
            return FontWeight.W900;
        }

        public static void getW900$annotations() {
        }
    }

    private static final FontWeight Black;
    private static final FontWeight Bold;
    public static final Companion Companion;
    private static final FontWeight ExtraBold;
    private static final FontWeight ExtraLight;
    private static final FontWeight Light;
    private static final FontWeight Medium;
    private static final FontWeight Normal;
    private static final FontWeight SemiBold;
    private static final FontWeight Thin;
    private static final FontWeight W100;
    private static final FontWeight W200;
    private static final FontWeight W300;
    private static final FontWeight W400;
    private static final FontWeight W500;
    private static final FontWeight W600;
    private static final FontWeight W700;
    private static final FontWeight W800;
    private static final FontWeight W900;
    private static final List values;
    private final int weight;

    static {
        FontWeight.Companion = new Companion(null);
        FontWeight fontWeight0 = new FontWeight(100);
        FontWeight.W100 = fontWeight0;
        FontWeight fontWeight1 = new FontWeight(200);
        FontWeight.W200 = fontWeight1;
        FontWeight fontWeight2 = new FontWeight(300);
        FontWeight.W300 = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(400);
        FontWeight.W400 = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(500);
        FontWeight.W500 = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(600);
        FontWeight.W600 = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(700);
        FontWeight.W700 = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(800);
        FontWeight.W800 = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(900);
        FontWeight.W900 = fontWeight8;
        FontWeight.Thin = fontWeight0;
        FontWeight.ExtraLight = fontWeight1;
        FontWeight.Light = fontWeight2;
        FontWeight.Normal = fontWeight3;
        FontWeight.Medium = fontWeight4;
        FontWeight.SemiBold = fontWeight5;
        FontWeight.Bold = fontWeight6;
        FontWeight.ExtraBold = fontWeight7;
        FontWeight.Black = fontWeight8;
        FontWeight.values = CollectionsKt.listOf(new FontWeight[]{fontWeight0, fontWeight1, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8});
    }

    public FontWeight(int v) {
        this.weight = v;
        if(1 > v || v > 1000) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + this.getWeight()).toString());
        }
    }

    public int compareTo(FontWeight fontWeight0) {
        Intrinsics.checkNotNullParameter(fontWeight0, "other");
        return Intrinsics.compare(this.weight, fontWeight0.weight);
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((FontWeight)object0));
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FontWeight ? this.weight == ((FontWeight)object0).weight : false;
    }

    public final int getWeight() {
        return this.weight;
    }

    @Override
    public int hashCode() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "FontWeight(weight=" + this.weight + ')';
    }
}

