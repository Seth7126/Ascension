package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;

public final class SavedStateRegistryController {
    private final SavedStateRegistryOwner mOwner;
    private final SavedStateRegistry mRegistry;

    private SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner0) {
        this.mOwner = savedStateRegistryOwner0;
        this.mRegistry = new SavedStateRegistry();
    }

    public static SavedStateRegistryController create(SavedStateRegistryOwner savedStateRegistryOwner0) {
        return new SavedStateRegistryController(savedStateRegistryOwner0);
    }

    public SavedStateRegistry getSavedStateRegistry() {
        return this.mRegistry;
    }

    public void performRestore(Bundle bundle0) {
        Lifecycle lifecycle0 = this.mOwner.getLifecycle();
        if(lifecycle0.getCurrentState() != State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner\'s initialization stage");
        }
        lifecycle0.addObserver(new Recreator(this.mOwner));
        this.mRegistry.performRestore(lifecycle0, bundle0);
    }

    public void performSave(Bundle bundle0) {
        this.mRegistry.performSave(bundle0);
    }
}

