package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001E\u0012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001A\u00020\nH\u0016J\b\u0010\u000B\u001A\u00020\nH\u0016J\b\u0010\f\u001A\u00020\nH\u0016R\u001F\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001A\u0004\u0018\u00010\u0005X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/DisposableEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "effect", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "onDispose", "onAbandoned", "", "onForgotten", "onRemembered", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class DisposableEffectImpl implements RememberObserver {
    private final Function1 effect;
    private DisposableEffectResult onDispose;

    public DisposableEffectImpl(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "effect");
        super();
        this.effect = function10;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        DisposableEffectResult disposableEffectResult0 = this.onDispose;
        if(disposableEffectResult0 != null) {
            disposableEffectResult0.dispose();
        }
        this.onDispose = null;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        DisposableEffectScope disposableEffectScope0 = EffectsKt.InternalDisposableEffectScope;
        this.onDispose = (DisposableEffectResult)this.effect.invoke(disposableEffectScope0);
    }
}

