package androidx.savedstate;

import android.os.Bundle;
import androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map.Entry;

public final class SavedStateRegistry {
    public interface AutoRecreated {
        void onRecreated(SavedStateRegistryOwner arg1);
    }

    public interface SavedStateProvider {
        Bundle saveState();
    }

    private static final String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    boolean mAllowingSavingState;
    private SafeIterableMap mComponents;
    private androidx.savedstate.Recreator.SavedStateProvider mRecreatorProvider;
    private boolean mRestored;
    private Bundle mRestoredState;

    SavedStateRegistry() {
        this.mComponents = new SafeIterableMap();
        this.mAllowingSavingState = true;
    }

    public Bundle consumeRestoredStateForKey(String s) {
        if(!this.mRestored) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle0 = this.mRestoredState;
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle(s);
            this.mRestoredState.remove(s);
            if(this.mRestoredState.isEmpty()) {
                this.mRestoredState = null;
            }
            return bundle1;
        }
        return null;
    }

    public boolean isRestored() {
        return this.mRestored;
    }

    void performRestore(Lifecycle lifecycle0, Bundle bundle0) {
        if(this.mRestored) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if(bundle0 != null) {
            this.mRestoredState = bundle0.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        lifecycle0.addObserver(new GenericLifecycleObserver() {
            @Override  // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
                if(lifecycle$Event0 == Event.ON_START) {
                    SavedStateRegistry.this.mAllowingSavingState = true;
                    return;
                }
                if(lifecycle$Event0 == Event.ON_STOP) {
                    SavedStateRegistry.this.mAllowingSavingState = false;
                }
            }
        });
        this.mRestored = true;
    }

    void performSave(Bundle bundle0) {
        Bundle bundle1 = new Bundle();
        Bundle bundle2 = this.mRestoredState;
        if(bundle2 != null) {
            bundle1.putAll(bundle2);
        }
        IteratorWithAdditions safeIterableMap$IteratorWithAdditions0 = this.mComponents.iteratorWithAdditions();
        while(safeIterableMap$IteratorWithAdditions0.hasNext()) {
            Object object0 = safeIterableMap$IteratorWithAdditions0.next();
            bundle1.putBundle(((String)((Map.Entry)object0).getKey()), ((SavedStateProvider)((Map.Entry)object0).getValue()).saveState());
        }
        bundle0.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle1);
    }

    public void registerSavedStateProvider(String s, SavedStateProvider savedStateRegistry$SavedStateProvider0) {
        if(((SavedStateProvider)this.mComponents.putIfAbsent(s, savedStateRegistry$SavedStateProvider0)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void runOnNextRecreation(Class class0) {
        if(!this.mAllowingSavingState) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if(this.mRecreatorProvider == null) {
            this.mRecreatorProvider = new androidx.savedstate.Recreator.SavedStateProvider(this);
        }
        try {
            class0.getDeclaredConstructor();
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new IllegalArgumentException("Class" + class0.getSimpleName() + " must have default constructor in order to be automatically recreated", noSuchMethodException0);
        }
        this.mRecreatorProvider.add(class0.getName());
    }

    public void unregisterSavedStateProvider(String s) {
        this.mComponents.remove(s);
    }
}

