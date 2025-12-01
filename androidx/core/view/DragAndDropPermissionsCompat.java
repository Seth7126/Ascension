package androidx.core.view;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

public final class DragAndDropPermissionsCompat {
    private Object mDragAndDropPermissions;

    private DragAndDropPermissionsCompat(Object object0) {
        this.mDragAndDropPermissions = object0;
    }

    public void release() {
        if(Build.VERSION.SDK_INT >= 24) {
            ((DragAndDropPermissions)this.mDragAndDropPermissions).release();
        }
    }

    public static DragAndDropPermissionsCompat request(Activity activity0, DragEvent dragEvent0) {
        if(Build.VERSION.SDK_INT >= 24) {
            DragAndDropPermissions dragAndDropPermissions0 = activity0.requestDragAndDropPermissions(dragEvent0);
            return dragAndDropPermissions0 == null ? null : new DragAndDropPermissionsCompat(dragAndDropPermissions0);
        }
        return null;
    }
}

