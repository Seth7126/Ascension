package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
public final class ComposableSingletons.RecomposerKt {
    public static final ComposableSingletons.RecomposerKt INSTANCE;
    public static Function2 lambda-1;

    static {
        ComposableSingletons.RecomposerKt.INSTANCE = new ComposableSingletons.RecomposerKt();
        ComposableSingletons.RecomposerKt.lambda-1 = ComposableLambdaKt.composableLambdaInstance(-985546190, false, ComposableSingletons.RecomposerKt.lambda-1.1.INSTANCE);
    }

    public final Function2 getLambda-1$runtime_release() {
        return ComposableSingletons.RecomposerKt.lambda-1;
    }
}

