package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001A0\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\u000BH\u0007\u001A(\u0010\f\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\u000BH\u0007\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"SLOTS_PER_INT", "", "composableLambdaN", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "composer", "Landroidx/compose/runtime/Composer;", "key", "tracked", "", "arity", "block", "", "composableLambdaNInstance", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ComposableLambdaN_jvmKt {
    private static final int SLOTS_PER_INT = 10;

    @ComposeCompilerApi
    public static final ComposableLambdaN composableLambdaN(Composer composer0, int v, boolean z, int v1, Object object0) {
        ComposableLambdaNImpl composableLambdaNImpl0;
        Intrinsics.checkNotNullParameter(composer0, "composer");
        Intrinsics.checkNotNullParameter(object0, "block");
        composer0.startReplaceableGroup(v);
        Object object1 = composer0.rememberedValue();
        if(object1 == Composer.Companion.getEmpty()) {
            composableLambdaNImpl0 = new ComposableLambdaNImpl(v, z, v1);
            composer0.updateRememberedValue(composableLambdaNImpl0);
        }
        else if(object1 != null) {
            composableLambdaNImpl0 = (ComposableLambdaNImpl)object1;
        }
        else {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl");
        }
        composableLambdaNImpl0.update(object0);
        composer0.endReplaceableGroup();
        return composableLambdaNImpl0;
    }

    @ComposeCompilerApi
    public static final ComposableLambdaN composableLambdaNInstance(int v, boolean z, int v1, Object object0) {
        Intrinsics.checkNotNullParameter(object0, "block");
        ComposableLambdaNImpl composableLambdaNImpl0 = new ComposableLambdaNImpl(v, z, v1);
        composableLambdaNImpl0.update(object0);
        return composableLambdaNImpl0;
    }
}

