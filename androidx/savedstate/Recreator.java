package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

final class Recreator implements GenericLifecycleObserver {
    static final class SavedStateProvider implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {
        final Set mClasses;

        SavedStateProvider(SavedStateRegistry savedStateRegistry0) {
            this.mClasses = new HashSet();
            savedStateRegistry0.registerSavedStateProvider("androidx.savedstate.Restarter", this);
        }

        void add(String s) {
            this.mClasses.add(s);
        }

        @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
        public Bundle saveState() {
            Bundle bundle0 = new Bundle();
            bundle0.putStringArrayList("classes_to_restore", new ArrayList(this.mClasses));
            return bundle0;
        }
    }

    static final String CLASSES_KEY = "classes_to_restore";
    static final String COMPONENT_KEY = "androidx.savedstate.Restarter";
    private final SavedStateRegistryOwner mOwner;

    Recreator(SavedStateRegistryOwner savedStateRegistryOwner0) {
        this.mOwner = savedStateRegistryOwner0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        if(lifecycle$Event0 != Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        lifecycleOwner0.getLifecycle().removeObserver(this);
        Bundle bundle0 = this.mOwner.getSavedStateRegistry().consumeRestoredStateForKey("androidx.savedstate.Restarter");
        if(bundle0 == null) {
            return;
        }
        ArrayList arrayList0 = bundle0.getStringArrayList("classes_to_restore");
        if(arrayList0 == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for(Object object0: arrayList0) {
            this.reflectiveNew(((String)object0));
        }
    }

    private void reflectiveNew(String s) {
        AutoRecreated savedStateRegistry$AutoRecreated0;
        Constructor constructor0;
        Class class0;
        try {
            class0 = Class.forName(s, false, Recreator.class.getClassLoader()).asSubclass(AutoRecreated.class);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException("Class " + s + " wasn\'t found", classNotFoundException0);
        }
        try {
            constructor0 = class0.getDeclaredConstructor();
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new IllegalStateException("Class" + class0.getSimpleName() + " must have default constructor in order to be automatically recreated", noSuchMethodException0);
        }
        constructor0.setAccessible(true);
        try {
            savedStateRegistry$AutoRecreated0 = (AutoRecreated)constructor0.newInstance();
        }
        catch(Exception exception0) {
            throw new RuntimeException("Failed to instantiate " + s, exception0);
        }
        savedStateRegistry$AutoRecreated0.onRecreated(this.mOwner);
    }
}

