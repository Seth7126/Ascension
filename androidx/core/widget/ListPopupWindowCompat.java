package androidx.core.widget;

import android.view.View.OnTouchListener;
import android.view.View;
import android.widget.ListPopupWindow;

public final class ListPopupWindowCompat {
    public static View.OnTouchListener createDragToOpenListener(ListPopupWindow listPopupWindow0, View view0) {
        return listPopupWindow0.createDragToOpenListener(view0);
    }

    @Deprecated
    public static View.OnTouchListener createDragToOpenListener(Object object0, View view0) {
        return ListPopupWindowCompat.createDragToOpenListener(((ListPopupWindow)object0), view0);
    }
}

