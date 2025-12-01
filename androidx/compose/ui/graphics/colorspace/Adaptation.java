package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000F\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001A\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Adaptation;", "", "transform", "", "([F)V", "getTransform$ui_graphics_release", "()[F", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class Adaptation {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u0006¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Adaptation$Companion;", "", "()V", "Bradford", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "getBradford", "()Landroidx/compose/ui/graphics/colorspace/Adaptation;", "Ciecat02", "getCiecat02", "VonKries", "getVonKries", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final Adaptation getBradford() {
            return Adaptation.Bradford;
        }

        public final Adaptation getCiecat02() {
            return Adaptation.Ciecat02;
        }

        public final Adaptation getVonKries() {
            return Adaptation.VonKries;
        }
    }

    private static final Adaptation Bradford;
    private static final Adaptation Ciecat02;
    public static final Companion Companion;
    private static final Adaptation VonKries;
    private final float[] transform;

    static {
        Adaptation.Companion = new Companion(null);
        Adaptation.Bradford = new Adaptation.Companion.Bradford.1(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
        Adaptation.VonKries = new Adaptation.Companion.VonKries.1(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});
        Adaptation.Ciecat02 = new Adaptation.Companion.Ciecat02.1(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});
    }

    private Adaptation(float[] arr_f) {
        this.transform = arr_f;
    }

    public Adaptation(float[] arr_f, DefaultConstructorMarker defaultConstructorMarker0) {
        this(arr_f);
    }

    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }
}

