package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
public final class ComposableSingletons.CompositionKt {
    public static final ComposableSingletons.CompositionKt INSTANCE;
    public static Function2 lambda-1;
    public static Function2 lambda-2;

    static {
        ComposableSingletons.CompositionKt.INSTANCE = new ComposableSingletons.CompositionKt();
        ComposableSingletons.CompositionKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(0xC541CF92, false, ComposableSingletons.CompositionKt.lambda-1.1.INSTANCE);
        ComposableSingletons.CompositionKt.lambda-2 = ComposableLambdaKt.composableLambdaInstance(0xC541B981, false, ComposableSingletons.CompositionKt.lambda-2.1.INSTANCE);
    }

    public final Function2 getLambda-1$runtime_release() {
        return ComposableSingletons.CompositionKt.lambda-1;
    }

    public final Function2 getLambda-2$runtime_release() {
        return ComposableSingletons.CompositionKt.lambda-2;
    }
}

