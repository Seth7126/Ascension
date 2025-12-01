package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public final class SavedStateViewModelFactory extends KeyedFactory {
    private static final Class[] ANDROID_VIEWMODEL_SIGNATURE;
    private static final Class[] VIEWMODEL_SIGNATURE;
    private final Application mApplication;
    private final Bundle mDefaultArgs;
    private final Factory mFactory;
    private final Lifecycle mLifecycle;
    private final SavedStateRegistry mSavedStateRegistry;

    static {
        SavedStateViewModelFactory.ANDROID_VIEWMODEL_SIGNATURE = new Class[]{Application.class, SavedStateHandle.class};
        SavedStateViewModelFactory.VIEWMODEL_SIGNATURE = new Class[]{SavedStateHandle.class};
    }

    public SavedStateViewModelFactory(Application application0, SavedStateRegistryOwner savedStateRegistryOwner0) {
        this(application0, savedStateRegistryOwner0, null);
    }

    public SavedStateViewModelFactory(Application application0, SavedStateRegistryOwner savedStateRegistryOwner0, Bundle bundle0) {
        this.mSavedStateRegistry = savedStateRegistryOwner0.getSavedStateRegistry();
        this.mLifecycle = savedStateRegistryOwner0.getLifecycle();
        this.mDefaultArgs = bundle0;
        this.mApplication = application0;
        NewInstanceFactory viewModelProvider$NewInstanceFactory0 = application0 == null ? NewInstanceFactory.getInstance() : AndroidViewModelFactory.getInstance(application0);
        this.mFactory = viewModelProvider$NewInstanceFactory0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$KeyedFactory
    public ViewModel create(Class class0) {
        String s = class0.getCanonicalName();
        if(s == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return this.create(s, class0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$KeyedFactory
    public ViewModel create(String s, Class class0) {
        ViewModel viewModel0;
        boolean z = AndroidViewModel.class.isAssignableFrom(class0);
        Constructor constructor0 = !z || this.mApplication == null ? SavedStateViewModelFactory.findMatchingConstructor(class0, SavedStateViewModelFactory.VIEWMODEL_SIGNATURE) : SavedStateViewModelFactory.findMatchingConstructor(class0, SavedStateViewModelFactory.ANDROID_VIEWMODEL_SIGNATURE);
        if(constructor0 == null) {
            return this.mFactory.create(class0);
        }
        SavedStateHandleController savedStateHandleController0 = SavedStateHandleController.create(this.mSavedStateRegistry, this.mLifecycle, s, this.mDefaultArgs);
        try {
            if(z) {
                Application application0 = this.mApplication;
                viewModel0 = application0 == null ? ((ViewModel)constructor0.newInstance(savedStateHandleController0.getHandle())) : ((ViewModel)constructor0.newInstance(application0, savedStateHandleController0.getHandle()));
            }
            else {
                viewModel0 = (ViewModel)constructor0.newInstance(savedStateHandleController0.getHandle());
            }
            viewModel0.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController0);
            return viewModel0;
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("Failed to access " + class0, illegalAccessException0);
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException("A " + class0 + " cannot be instantiated.", instantiationException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException("An exception happened in constructor of " + class0, invocationTargetException0.getCause());
        }
    }

    private static Constructor findMatchingConstructor(Class class0, Class[] arr_class) {
        Constructor[] arr_constructor = class0.getConstructors();
        for(int v = 0; v < arr_constructor.length; ++v) {
            Constructor constructor0 = arr_constructor[v];
            if(Arrays.equals(arr_class, constructor0.getParameterTypes())) {
                return constructor0;
            }
        }
        return null;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$OnRequeryFactory
    void onRequery(ViewModel viewModel0) {
        SavedStateHandleController.attachHandleIfNeeded(viewModel0, this.mSavedStateRegistry, this.mLifecycle);
    }
}

