package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.math.MathKt;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
final class AlignmentLineKt.LastBaseline.1 extends FunctionReferenceImpl implements Function2 {
    public static final AlignmentLineKt.LastBaseline.1 INSTANCE;

    static {
        AlignmentLineKt.LastBaseline.1.INSTANCE = new AlignmentLineKt.LastBaseline.1();
    }

    AlignmentLineKt.LastBaseline.1() {
        super(2, MathKt.class, "max", "max(II)I", 1);
    }

    public final int invoke(int v, int v1) {
        return Math.max(v, v1);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((Number)object0).intValue(), ((Number)object1).intValue());
    }
}

