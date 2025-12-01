package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

class FragmentManagerViewModel extends ViewModel {
    private static final Factory FACTORY;
    private final HashMap mChildNonConfigs;
    private boolean mHasBeenCleared;
    private boolean mHasSavedSnapshot;
    private final HashSet mRetainedFragments;
    private final boolean mStateAutomaticallySaved;
    private final HashMap mViewModelStores;

    static {
        FragmentManagerViewModel.FACTORY = new Factory() {
            @Override  // androidx.lifecycle.ViewModelProvider$Factory
            public ViewModel create(Class class0) {
                return new FragmentManagerViewModel(true);
            }
        };
    }

    FragmentManagerViewModel(boolean z) {
        this.mRetainedFragments = new HashSet();
        this.mChildNonConfigs = new HashMap();
        this.mViewModelStores = new HashMap();
        this.mHasBeenCleared = false;
        this.mHasSavedSnapshot = false;
        this.mStateAutomaticallySaved = z;
    }

    boolean addRetainedFragment(Fragment fragment0) {
        return this.mRetainedFragments.add(fragment0);
    }

    void clearNonConfigState(Fragment fragment0) {
        if(FragmentManagerImpl.DEBUG) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment0);
        }
        FragmentManagerViewModel fragmentManagerViewModel0 = (FragmentManagerViewModel)this.mChildNonConfigs.get(fragment0.mWho);
        if(fragmentManagerViewModel0 != null) {
            fragmentManagerViewModel0.onCleared();
            this.mChildNonConfigs.remove(fragment0.mWho);
        }
        ViewModelStore viewModelStore0 = (ViewModelStore)this.mViewModelStores.get(fragment0.mWho);
        if(viewModelStore0 != null) {
            viewModelStore0.clear();
            this.mViewModelStores.remove(fragment0.mWho);
        }
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && (this.mRetainedFragments.equals(((FragmentManagerViewModel)object0).mRetainedFragments) && this.mChildNonConfigs.equals(((FragmentManagerViewModel)object0).mChildNonConfigs) && this.mViewModelStores.equals(((FragmentManagerViewModel)object0).mViewModelStores));
    }

    FragmentManagerViewModel getChildNonConfig(Fragment fragment0) {
        FragmentManagerViewModel fragmentManagerViewModel0 = (FragmentManagerViewModel)this.mChildNonConfigs.get(fragment0.mWho);
        if(fragmentManagerViewModel0 == null) {
            fragmentManagerViewModel0 = new FragmentManagerViewModel(this.mStateAutomaticallySaved);
            this.mChildNonConfigs.put(fragment0.mWho, fragmentManagerViewModel0);
        }
        return fragmentManagerViewModel0;
    }

    static FragmentManagerViewModel getInstance(ViewModelStore viewModelStore0) {
        return (FragmentManagerViewModel)new ViewModelProvider(viewModelStore0, FragmentManagerViewModel.FACTORY).get(FragmentManagerViewModel.class);
    }

    Collection getRetainedFragments() {
        return this.mRetainedFragments;
    }

    @Deprecated
    FragmentManagerNonConfig getSnapshot() {
        if(this.mRetainedFragments.isEmpty() && this.mChildNonConfigs.isEmpty() && this.mViewModelStores.isEmpty()) {
            return null;
        }
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.mChildNonConfigs.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            FragmentManagerNonConfig fragmentManagerNonConfig0 = ((FragmentManagerViewModel)map$Entry0.getValue()).getSnapshot();
            if(fragmentManagerNonConfig0 != null) {
                hashMap0.put(map$Entry0.getKey(), fragmentManagerNonConfig0);
            }
        }
        this.mHasSavedSnapshot = true;
        return !this.mRetainedFragments.isEmpty() || !hashMap0.isEmpty() || !this.mViewModelStores.isEmpty() ? new FragmentManagerNonConfig(new ArrayList(this.mRetainedFragments), hashMap0, new HashMap(this.mViewModelStores)) : null;
    }

    ViewModelStore getViewModelStore(Fragment fragment0) {
        ViewModelStore viewModelStore0 = (ViewModelStore)this.mViewModelStores.get(fragment0.mWho);
        if(viewModelStore0 == null) {
            viewModelStore0 = new ViewModelStore();
            this.mViewModelStores.put(fragment0.mWho, viewModelStore0);
        }
        return viewModelStore0;
    }

    @Override
    public int hashCode() {
        return (this.mRetainedFragments.hashCode() * 0x1F + this.mChildNonConfigs.hashCode()) * 0x1F + this.mViewModelStores.hashCode();
    }

    boolean isCleared() {
        return this.mHasBeenCleared;
    }

    @Override  // androidx.lifecycle.ViewModel
    protected void onCleared() {
        if(FragmentManagerImpl.DEBUG) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.mHasBeenCleared = true;
    }

    boolean removeRetainedFragment(Fragment fragment0) {
        return this.mRetainedFragments.remove(fragment0);
    }

    @Deprecated
    void restoreFromSnapshot(FragmentManagerNonConfig fragmentManagerNonConfig0) {
        this.mRetainedFragments.clear();
        this.mChildNonConfigs.clear();
        this.mViewModelStores.clear();
        if(fragmentManagerNonConfig0 != null) {
            Collection collection0 = fragmentManagerNonConfig0.getFragments();
            if(collection0 != null) {
                this.mRetainedFragments.addAll(collection0);
            }
            Map map0 = fragmentManagerNonConfig0.getChildNonConfigs();
            if(map0 != null) {
                for(Object object0: map0.entrySet()) {
                    FragmentManagerViewModel fragmentManagerViewModel0 = new FragmentManagerViewModel(this.mStateAutomaticallySaved);
                    fragmentManagerViewModel0.restoreFromSnapshot(((FragmentManagerNonConfig)((Map.Entry)object0).getValue()));
                    Object object1 = ((Map.Entry)object0).getKey();
                    this.mChildNonConfigs.put(object1, fragmentManagerViewModel0);
                }
            }
            Map map1 = fragmentManagerNonConfig0.getViewModelStores();
            if(map1 != null) {
                this.mViewModelStores.putAll(map1);
            }
        }
        this.mHasSavedSnapshot = false;
    }

    boolean shouldDestroy(Fragment fragment0) {
        if(!this.mRetainedFragments.contains(fragment0)) {
            return true;
        }
        return this.mStateAutomaticallySaved ? this.mHasBeenCleared : !this.mHasSavedSnapshot;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FragmentManagerViewModel{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append("} Fragments (");
        Iterator iterator0 = this.mRetainedFragments.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(object0);
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(") Child Non Config (");
        Iterator iterator1 = this.mChildNonConfigs.keySet().iterator();
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            stringBuilder0.append(((String)object1));
            if(iterator1.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(") ViewModelStores (");
        Iterator iterator2 = this.mViewModelStores.keySet().iterator();
        while(iterator2.hasNext()) {
            Object object2 = iterator2.next();
            stringBuilder0.append(((String)object2));
            if(iterator2.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

