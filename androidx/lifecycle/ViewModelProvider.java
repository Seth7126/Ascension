package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

public class ViewModelProvider {
    public static class AndroidViewModelFactory extends NewInstanceFactory {
        private Application mApplication;
        private static AndroidViewModelFactory sInstance;

        public AndroidViewModelFactory(Application application0) {
            this.mApplication = application0;
        }

        @Override  // androidx.lifecycle.ViewModelProvider$NewInstanceFactory
        public ViewModel create(Class class0) {
            if(AndroidViewModel.class.isAssignableFrom(class0)) {
                try {
                    return (ViewModel)class0.getConstructor(Application.class).newInstance(this.mApplication);
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    throw new RuntimeException("Cannot create an instance of " + class0, noSuchMethodException0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new RuntimeException("Cannot create an instance of " + class0, illegalAccessException0);
                }
                catch(InstantiationException instantiationException0) {
                    throw new RuntimeException("Cannot create an instance of " + class0, instantiationException0);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw new RuntimeException("Cannot create an instance of " + class0, invocationTargetException0);
                }
            }
            return super.create(class0);
        }

        public static AndroidViewModelFactory getInstance(Application application0) {
            if(AndroidViewModelFactory.sInstance == null) {
                AndroidViewModelFactory.sInstance = new AndroidViewModelFactory(application0);
            }
            return AndroidViewModelFactory.sInstance;
        }
    }

    public interface Factory {
        ViewModel create(Class arg1);
    }

    static abstract class KeyedFactory extends OnRequeryFactory implements Factory {
        @Override  // androidx.lifecycle.ViewModelProvider$Factory
        public ViewModel create(Class class0) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract ViewModel create(String arg1, Class arg2);
    }

    public static class NewInstanceFactory implements Factory {
        private static NewInstanceFactory sInstance;

        @Override  // androidx.lifecycle.ViewModelProvider$Factory
        public ViewModel create(Class class0) {
            try {
                return (ViewModel)class0.newInstance();
            }
            catch(InstantiationException instantiationException0) {
                throw new RuntimeException("Cannot create an instance of " + class0, instantiationException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new RuntimeException("Cannot create an instance of " + class0, illegalAccessException0);
            }
        }

        static NewInstanceFactory getInstance() {
            if(NewInstanceFactory.sInstance == null) {
                NewInstanceFactory.sInstance = new NewInstanceFactory();
            }
            return NewInstanceFactory.sInstance;
        }
    }

    static class OnRequeryFactory {
        void onRequery(ViewModel viewModel0) {
        }
    }

    private static final String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";
    private final Factory mFactory;
    private final ViewModelStore mViewModelStore;

    public ViewModelProvider(ViewModelStore viewModelStore0, Factory viewModelProvider$Factory0) {
        this.mFactory = viewModelProvider$Factory0;
        this.mViewModelStore = viewModelStore0;
    }

    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner0) {
        ViewModelStore viewModelStore0 = viewModelStoreOwner0.getViewModelStore();
        Factory viewModelProvider$Factory0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelProviderFactory() : NewInstanceFactory.getInstance();
        this(viewModelStore0, viewModelProvider$Factory0);
    }

    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner0, Factory viewModelProvider$Factory0) {
        this(viewModelStoreOwner0.getViewModelStore(), viewModelProvider$Factory0);
    }

    public ViewModel get(Class class0) {
        String s = class0.getCanonicalName();
        if(s == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return this.get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + s, class0);
    }

    public ViewModel get(String s, Class class0) {
        ViewModel viewModel0 = this.mViewModelStore.get(s);
        if(class0.isInstance(viewModel0)) {
            Factory viewModelProvider$Factory0 = this.mFactory;
            if(viewModelProvider$Factory0 instanceof OnRequeryFactory) {
                ((OnRequeryFactory)viewModelProvider$Factory0).onRequery(viewModel0);
            }
            return viewModel0;
        }
        ViewModel viewModel1 = this.mFactory instanceof KeyedFactory ? ((KeyedFactory)this.mFactory).create(s, class0) : this.mFactory.create(class0);
        this.mViewModelStore.put(s, viewModel1);
        return viewModel1;
    }
}

