package androidx.compose.ui.platform;

import androidx.compose.runtime.saveable.SaveableStateRegistry.Entry;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001B\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0096\u0001J\u0013\u0010\u000B\u001A\u0004\u0018\u00010\n2\u0006\u0010\f\u001A\u00020\rH\u0096\u0001J\u0006\u0010\u000E\u001A\u00020\u0005J\u001D\u0010\u000F\u001A\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00110\u0010H\u0096\u0001J!\u0010\u0012\u001A\u00020\u00132\u0006\u0010\f\u001A\u00020\r2\u000E\u0010\u0014\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004H\u0096\u0001R\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "saveableStateRegistry", "onDispose", "Lkotlin/Function0;", "", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Lkotlin/jvm/functions/Function0;)V", "canBeSaved", "", "value", "", "consumeRestored", "key", "", "dispose", "performSave", "", "", "registerProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "valueProvider", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {
    private final SaveableStateRegistry $$delegate_0;
    private final Function0 onDispose;

    public DisposableSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry0, Function0 function00) {
        Intrinsics.checkNotNullParameter(saveableStateRegistry0, "saveableStateRegistry");
        Intrinsics.checkNotNullParameter(function00, "onDispose");
        super();
        this.onDispose = function00;
        this.$$delegate_0 = saveableStateRegistry0;
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "value");
        return this.$$delegate_0.canBeSaved(object0);
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        return this.$$delegate_0.consumeRestored(s);
    }

    public final void dispose() {
        this.onDispose.invoke();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map performSave() {
        return this.$$delegate_0.performSave();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Entry registerProvider(String s, Function0 function00) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(function00, "valueProvider");
        return this.$$delegate_0.registerProvider(s, function00);
    }
}

