package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class SavedStateHandle {
    static class SavingStateLiveData extends MutableLiveData {
        private SavedStateHandle mHandle;
        private String mKey;

        SavingStateLiveData(SavedStateHandle savedStateHandle0, String s) {
            this.mKey = s;
            this.mHandle = savedStateHandle0;
        }

        SavingStateLiveData(SavedStateHandle savedStateHandle0, String s, Object object0) {
            super(object0);
            this.mKey = s;
            this.mHandle = savedStateHandle0;
        }

        void detach() {
            this.mHandle = null;
        }

        @Override  // androidx.lifecycle.MutableLiveData
        public void setValue(Object object0) {
            SavedStateHandle savedStateHandle0 = this.mHandle;
            if(savedStateHandle0 != null) {
                savedStateHandle0.mRegular.put(this.mKey, object0);
            }
            super.setValue(object0);
        }
    }

    private static final Class[] ACCEPTABLE_CLASSES = null;
    private static final String KEYS = "keys";
    private static final String VALUES = "values";
    private final Map mLiveDatas;
    final Map mRegular;
    private final SavedStateProvider mSavedStateProvider;
    final Map mSavedStateProviders;

    static {
        SavedStateHandle.ACCEPTABLE_CLASSES = new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    }

    public SavedStateHandle() {
        this.mSavedStateProviders = new HashMap();
        this.mLiveDatas = new HashMap();
        this.mSavedStateProvider = new SavedStateProvider() {
            @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
            public Bundle saveState() {
                for(Object object0: new HashMap(SavedStateHandle.this.mSavedStateProviders).entrySet()) {
                    Bundle bundle0 = ((SavedStateProvider)((Map.Entry)object0).getValue()).saveState();
                    String s = (String)((Map.Entry)object0).getKey();
                    SavedStateHandle.this.set(s, bundle0);
                }
                Set set0 = SavedStateHandle.this.mRegular.keySet();
                ArrayList arrayList0 = new ArrayList(set0.size());
                ArrayList arrayList1 = new ArrayList(arrayList0.size());
                for(Object object1: set0) {
                    arrayList0.add(((String)object1));
                    arrayList1.add(SavedStateHandle.this.mRegular.get(((String)object1)));
                }
                Bundle bundle1 = new Bundle();
                bundle1.putParcelableArrayList("keys", arrayList0);
                bundle1.putParcelableArrayList("values", arrayList1);
                return bundle1;
            }
        };
        this.mRegular = new HashMap();
    }

    public SavedStateHandle(Map map0) {
        this.mSavedStateProviders = new HashMap();
        this.mLiveDatas = new HashMap();
        this.mSavedStateProvider = new SavedStateProvider() {
            @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
            public Bundle saveState() {
                for(Object object0: new HashMap(SavedStateHandle.this.mSavedStateProviders).entrySet()) {
                    Bundle bundle0 = ((SavedStateProvider)((Map.Entry)object0).getValue()).saveState();
                    String s = (String)((Map.Entry)object0).getKey();
                    SavedStateHandle.this.set(s, bundle0);
                }
                Set set0 = SavedStateHandle.this.mRegular.keySet();
                ArrayList arrayList0 = new ArrayList(set0.size());
                ArrayList arrayList1 = new ArrayList(arrayList0.size());
                for(Object object1: set0) {
                    arrayList0.add(((String)object1));
                    arrayList1.add(SavedStateHandle.this.mRegular.get(((String)object1)));
                }
                Bundle bundle1 = new Bundle();
                bundle1.putParcelableArrayList("keys", arrayList0);
                bundle1.putParcelableArrayList("values", arrayList1);
                return bundle1;
            }
        };
        this.mRegular = new HashMap(map0);
    }

    public void clearSavedStateProvider(String s) {
        this.mSavedStateProviders.remove(s);
    }

    public boolean contains(String s) {
        return this.mRegular.containsKey(s);
    }

    static SavedStateHandle createHandle(Bundle bundle0, Bundle bundle1) {
        if(bundle0 == null && bundle1 == null) {
            return new SavedStateHandle();
        }
        HashMap hashMap0 = new HashMap();
        if(bundle1 != null) {
            for(Object object0: bundle1.keySet()) {
                hashMap0.put(((String)object0), bundle1.get(((String)object0)));
            }
        }
        if(bundle0 == null) {
            return new SavedStateHandle(hashMap0);
        }
        ArrayList arrayList0 = bundle0.getParcelableArrayList("keys");
        ArrayList arrayList1 = bundle0.getParcelableArrayList("values");
        if(arrayList0 == null || arrayList1 == null || arrayList0.size() != arrayList1.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for(int v = 0; v < arrayList0.size(); ++v) {
            hashMap0.put(((String)arrayList0.get(v)), arrayList1.get(v));
        }
        return new SavedStateHandle(hashMap0);
    }

    public Object get(String s) {
        return this.mRegular.get(s);
    }

    public MutableLiveData getLiveData(String s) {
        return this.getLiveDataInternal(s, false, null);
    }

    public MutableLiveData getLiveData(String s, Object object0) {
        return this.getLiveDataInternal(s, true, object0);
    }

    private MutableLiveData getLiveDataInternal(String s, boolean z, Object object0) {
        MutableLiveData mutableLiveData1;
        MutableLiveData mutableLiveData0 = (MutableLiveData)this.mLiveDatas.get(s);
        if(mutableLiveData0 != null) {
            return mutableLiveData0;
        }
        if(this.mRegular.containsKey(s)) {
            mutableLiveData1 = new SavingStateLiveData(this, s, this.mRegular.get(s));
        }
        else {
            mutableLiveData1 = z ? new SavingStateLiveData(this, s, object0) : new SavingStateLiveData(this, s);
        }
        this.mLiveDatas.put(s, mutableLiveData1);
        return mutableLiveData1;
    }

    public Set keys() {
        Set set0 = new HashSet(this.mRegular.keySet());
        ((HashSet)set0).addAll(this.mSavedStateProviders.keySet());
        ((HashSet)set0).addAll(this.mLiveDatas.keySet());
        return set0;
    }

    public Object remove(String s) {
        Object object0 = this.mRegular.remove(s);
        SavingStateLiveData savedStateHandle$SavingStateLiveData0 = (SavingStateLiveData)this.mLiveDatas.remove(s);
        if(savedStateHandle$SavingStateLiveData0 != null) {
            savedStateHandle$SavingStateLiveData0.detach();
        }
        return object0;
    }

    SavedStateProvider savedStateProvider() {
        return this.mSavedStateProvider;
    }

    public void set(String s, Object object0) {
        SavedStateHandle.validateValue(object0);
        MutableLiveData mutableLiveData0 = (MutableLiveData)this.mLiveDatas.get(s);
        if(mutableLiveData0 != null) {
            mutableLiveData0.setValue(object0);
            return;
        }
        this.mRegular.put(s, object0);
    }

    public void setSavedStateProvider(String s, SavedStateProvider savedStateRegistry$SavedStateProvider0) {
        this.mSavedStateProviders.put(s, savedStateRegistry$SavedStateProvider0);
    }

    private static void validateValue(Object object0) {
        if(object0 == null) {
            return;
        }
        Class[] arr_class = SavedStateHandle.ACCEPTABLE_CLASSES;
        for(int v = 0; v < arr_class.length; ++v) {
            if(arr_class[v].isInstance(object0)) {
                return;
            }
        }
        throw new IllegalArgumentException("Can\'t put value with type " + object0.getClass() + " into saved state");
    }
}

