package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
public final class ComposableSingletons.Wrapper_androidKt {
    public static final ComposableSingletons.Wrapper_androidKt INSTANCE;
    public static Function2 lambda-1;

    static {
        ComposableSingletons.Wrapper_androidKt.INSTANCE = new ComposableSingletons.Wrapper_androidKt();
        ComposableSingletons.Wrapper_androidKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xC541E260, false, ComposableSingletons.Wrapper_androidKt.lambda-1.1.INSTANCE);
    }

    public final Function2 getLambda-1$ui_release() {
        return ComposableSingletons.Wrapper_androidKt.lambda-1;
    }
}

