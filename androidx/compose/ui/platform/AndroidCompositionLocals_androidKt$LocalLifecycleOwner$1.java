package androidx.compose.ui.platform;

import androidx.lifecycle.LifecycleOwner;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class AndroidCompositionLocals_androidKt.LocalLifecycleOwner.1 extends Lambda implements Function0 {
    public static final AndroidCompositionLocals_androidKt.LocalLifecycleOwner.1 INSTANCE;

    static {
        AndroidCompositionLocals_androidKt.LocalLifecycleOwner.1.INSTANCE = new AndroidCompositionLocals_androidKt.LocalLifecycleOwner.1();
    }

    AndroidCompositionLocals_androidKt.LocalLifecycleOwner.1() {
        super(0);
    }

    public final LifecycleOwner invoke() {
        AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalLifecycleOwner");
        throw new KotlinNothingValueException();
    }

    @Override  // kotlin.jvm.functions.Function0
    public Object invoke() {
        return this.invoke();
    }
}

