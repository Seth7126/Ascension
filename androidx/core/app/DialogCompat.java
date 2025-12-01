package androidx.core.app;

import android.app.Dialog;
import android.os.Build.VERSION;
import android.view.View;

public class DialogCompat {
    public static View requireViewById(Dialog dialog0, int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            return dialog0.requireViewById(v);
        }
        View view0 = dialog0.findViewById(v);
        if(view0 == null) {
            throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
        }
        return view0;
    }
}

