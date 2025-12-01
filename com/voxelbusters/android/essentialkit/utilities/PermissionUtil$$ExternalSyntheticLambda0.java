package com.voxelbusters.android.essentialkit.utilities;

import android.app.Activity;
import com.voxelbusters.android.essentialkit.helpers.PermissionRequestFragment;
import java.util.ArrayList;
import java.util.List;

public final class PermissionUtil..ExternalSyntheticLambda0 implements Runnable {
    public final ArrayList f$0;
    public final List f$1;
    public final String f$2;
    public final PermissionRequestFragment f$3;
    public final Activity f$4;

    public PermissionUtil..ExternalSyntheticLambda0(ArrayList arrayList0, List list0, String s, PermissionRequestFragment permissionRequestFragment0, Activity activity0) {
        this.f$0 = arrayList0;
        this.f$1 = list0;
        this.f$2 = s;
        this.f$3 = permissionRequestFragment0;
        this.f$4 = activity0;
    }

    @Override
    public final void run() {
        PermissionUtil.lambda$requestPermissions$0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
    }
}

