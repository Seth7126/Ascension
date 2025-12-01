package androidx.core.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.DisplayCutout;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import java.util.Collections;
import java.util.List;

public final class DisplayCutoutCompat {
    private final Object mDisplayCutout;

    public DisplayCutoutCompat(Rect rect0, List list0) {
        this((Build.VERSION.SDK_INT < 28 ? null : new DisplayCutout(rect0, list0)));
    }

    public DisplayCutoutCompat(Insets insets0, Rect rect0, Rect rect1, Rect rect2, Rect rect3, Insets insets1) {
        this(DisplayCutoutCompat.constructDisplayCutout(insets0, rect0, rect1, rect2, rect3, insets1));
    }

    private DisplayCutoutCompat(Object object0) {
        this.mDisplayCutout = object0;
    }

    // 去混淆评级： 低(30)
    private static DisplayCutout constructDisplayCutout(Insets insets0, Rect rect0, Rect rect1, Rect rect2, Rect rect3, Insets insets1) {
        return new DisplayCutout(insets0.toPlatformInsets(), rect0, rect1, rect2, rect3, insets1.toPlatformInsets());
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 == null || this.getClass() != object0.getClass() ? false : ObjectsCompat.equals(this.mDisplayCutout, ((DisplayCutoutCompat)object0).mDisplayCutout);
    }

    public List getBoundingRects() {
        return Build.VERSION.SDK_INT < 28 ? Collections.emptyList() : ((DisplayCutout)this.mDisplayCutout).getBoundingRects();
    }

    public int getSafeInsetBottom() {
        return Build.VERSION.SDK_INT < 28 ? 0 : ((DisplayCutout)this.mDisplayCutout).getSafeInsetBottom();
    }

    public int getSafeInsetLeft() {
        return Build.VERSION.SDK_INT < 28 ? 0 : ((DisplayCutout)this.mDisplayCutout).getSafeInsetLeft();
    }

    public int getSafeInsetRight() {
        return Build.VERSION.SDK_INT < 28 ? 0 : ((DisplayCutout)this.mDisplayCutout).getSafeInsetRight();
    }

    public int getSafeInsetTop() {
        return Build.VERSION.SDK_INT < 28 ? 0 : ((DisplayCutout)this.mDisplayCutout).getSafeInsetTop();
    }

    // 去混淆评级： 低(30)
    public Insets getWaterfallInsets() {
        return Insets.toCompatInsets(((DisplayCutout)this.mDisplayCutout).getWaterfallInsets());
    }

    @Override
    public int hashCode() {
        return this.mDisplayCutout == null ? 0 : this.mDisplayCutout.hashCode();
    }

    @Override
    public String toString() {
        return "DisplayCutoutCompat{" + this.mDisplayCutout + "}";
    }

    DisplayCutout unwrap() {
        return (DisplayCutout)this.mDisplayCutout;
    }

    static DisplayCutoutCompat wrap(Object object0) {
        return object0 == null ? null : new DisplayCutoutCompat(object0);
    }
}

