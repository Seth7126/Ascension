package androidx.fragment.app;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

class FragmentViewLifecycleOwner implements LifecycleOwner {
    private LifecycleRegistry mLifecycleRegistry;

    FragmentViewLifecycleOwner() {
        this.mLifecycleRegistry = null;
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        this.initialize();
        return this.mLifecycleRegistry;
    }

    void handleLifecycleEvent(Event lifecycle$Event0) {
        this.mLifecycleRegistry.handleLifecycleEvent(lifecycle$Event0);
    }

    void initialize() {
        if(this.mLifecycleRegistry == null) {
            this.mLifecycleRegistry = new LifecycleRegistry(this);
        }
    }

    boolean isInitialized() {
        return this.mLifecycleRegistry != null;
    }
}

