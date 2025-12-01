package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0018\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0001H\u0000\u001A(\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH\u0007\u001A \u0010\u000F\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH\u0007\u001A\u0010\u0010\u0010\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0001H\u0000\u001A\u0010\u0010\u0011\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0001H\u0000\u001A\u0016\u0010\u0012\u001A\u00020\f*\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001A\u00020\u0013H\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"BITS_PER_SLOT", "", "SLOTS_PER_INT", "bitsForSlot", "bits", "slot", "composableLambda", "Landroidx/compose/runtime/internal/ComposableLambda;", "composer", "Landroidx/compose/runtime/Composer;", "key", "tracked", "", "block", "", "composableLambdaInstance", "differentBits", "sameBits", "replacableWith", "Landroidx/compose/runtime/RecomposeScope;", "other", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ComposableLambdaKt {
    private static final int BITS_PER_SLOT = 3;
    private static final int SLOTS_PER_INT = 10;

    public static final int bitsForSlot(int v, int v1) [...] // Inlined contents

    @ComposeCompilerApi
    public static final ComposableLambda composableLambda(Composer composer0, int v, boolean z, Object object0) {
        ComposableLambdaImpl composableLambdaImpl0;
        Intrinsics.checkNotNullParameter(composer0, "composer");
        Intrinsics.checkNotNullParameter(object0, "block");
        composer0.startReplaceableGroup(v);
        Object object1 = composer0.rememberedValue();
        if(object1 == Composer.Companion.getEmpty()) {
            composableLambdaImpl0 = new ComposableLambdaImpl(v, z);
            composer0.updateRememberedValue(composableLambdaImpl0);
        }
        else if(object1 != null) {
            composableLambdaImpl0 = (ComposableLambdaImpl)object1;
        }
        else {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
        }
        composableLambdaImpl0.update(object0);
        composer0.endReplaceableGroup();
        return composableLambdaImpl0;
    }

    @ComposeCompilerApi
    public static final ComposableLambda composableLambdaInstance(int v, boolean z, Object object0) {
        Intrinsics.checkNotNullParameter(object0, "block");
        ComposableLambdaImpl composableLambdaImpl0 = new ComposableLambdaImpl(v, z);
        composableLambdaImpl0.update(object0);
        return composableLambdaImpl0;
    }

    public static final int differentBits(int v) {
        return 2 << v % 10 * 3 + 1;
    }

    // 去混淆评级： 低(25)
    public static final boolean replacableWith(RecomposeScope recomposeScope0, RecomposeScope recomposeScope1) {
        Intrinsics.checkNotNullParameter(recomposeScope1, "other");
        return recomposeScope0 == null || recomposeScope0 instanceof RecomposeScopeImpl && recomposeScope1 instanceof RecomposeScopeImpl && (!((RecomposeScopeImpl)recomposeScope0).getValid() || Intrinsics.areEqual(recomposeScope0, recomposeScope1) || Intrinsics.areEqual(((RecomposeScopeImpl)recomposeScope0).getAnchor(), ((RecomposeScopeImpl)recomposeScope1).getAnchor()));
    }

    public static final int sameBits(int v) {
        return 1 << v % 10 * 3 + 1;
    }
}

