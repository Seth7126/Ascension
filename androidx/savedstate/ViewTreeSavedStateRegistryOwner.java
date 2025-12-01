package androidx.savedstate;

import android.view.View;
import android.view.ViewParent;

public final class ViewTreeSavedStateRegistryOwner {
    public static SavedStateRegistryOwner get(View view0) {
        SavedStateRegistryOwner savedStateRegistryOwner0 = (SavedStateRegistryOwner)view0.getTag(id.view_tree_saved_state_registry_owner);
        if(savedStateRegistryOwner0 != null) {
            return savedStateRegistryOwner0;
        }
        for(ViewParent viewParent0 = view0.getParent(); savedStateRegistryOwner0 == null && viewParent0 instanceof View; viewParent0 = ((View)viewParent0).getParent()) {
            savedStateRegistryOwner0 = (SavedStateRegistryOwner)((View)viewParent0).getTag(id.view_tree_saved_state_registry_owner);
        }
        return savedStateRegistryOwner0;
    }

    public static void set(View view0, SavedStateRegistryOwner savedStateRegistryOwner0) {
        view0.setTag(id.view_tree_saved_state_registry_owner, savedStateRegistryOwner0);
    }
}

