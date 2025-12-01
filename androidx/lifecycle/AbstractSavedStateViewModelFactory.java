package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;

public abstract class AbstractSavedStateViewModelFactory extends KeyedFactory {
    static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
    private final Bundle mDefaultArgs;
    private final Lifecycle mLifecycle;
    private final SavedStateRegistry mSavedStateRegistry;

    public AbstractSavedStateViewModelFactory(SavedStateRegistryOwner savedStateRegistryOwner0, Bundle bundle0) {
        this.mSavedStateRegistry = savedStateRegistryOwner0.getSavedStateRegistry();
        this.mLifecycle = savedStateRegistryOwner0.getLifecycle();
        this.mDefaultArgs = bundle0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$KeyedFactory
    public final ViewModel create(Class class0) {
        String s = class0.getCanonicalName();
        if(s == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return this.create(s, class0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$KeyedFactory
    public final ViewModel create(String s, Class class0) {
        SavedStateHandleController savedStateHandleController0 = SavedStateHandleController.create(this.mSavedStateRegistry, this.mLifecycle, s, this.mDefaultArgs);
        ViewModel viewModel0 = this.create(s, class0, savedStateHandleController0.getHandle());
        viewModel0.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController0);
        return viewModel0;
    }

    protected abstract ViewModel create(String arg1, Class arg2, SavedStateHandle arg3);

    @Override  // androidx.lifecycle.ViewModelProvider$OnRequeryFactory
    void onRequery(ViewModel viewModel0) {
        SavedStateHandleController.attachHandleIfNeeded(viewModel0, this.mSavedStateRegistry, this.mLifecycle);
    }
}

