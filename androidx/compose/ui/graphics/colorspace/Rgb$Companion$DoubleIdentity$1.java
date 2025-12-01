package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "d", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class Rgb.Companion.DoubleIdentity.1 extends Lambda implements Function1 {
    public static final Rgb.Companion.DoubleIdentity.1 INSTANCE;

    static {
        Rgb.Companion.DoubleIdentity.1.INSTANCE = new Rgb.Companion.DoubleIdentity.1();
    }

    Rgb.Companion.DoubleIdentity.1() {
        super(1);
    }

    public final double invoke(double f) {
        return f;
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(((Number)object0).doubleValue());
    }
}

