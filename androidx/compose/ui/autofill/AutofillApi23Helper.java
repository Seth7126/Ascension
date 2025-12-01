package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0004H\u0007J\u001A\u0010\b\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0004H\u0007J@\u0010\n\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u0004H\u0007J6\u0010\u0012\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u00042\b\u0010\u0014\u001A\u0004\u0018\u00010\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\u0010\u0017\u001A\u0004\u0018\u00010\u0015H\u0007¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi23Helper;", "", "()V", "addChildCount", "", "structure", "Landroid/view/ViewStructure;", "num", "newChild", "index", "setDimens", "", "left", "top", "scrollX", "scrollY", "width", "height", "setId", "id", "packageName", "", "typeName", "entryName", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AutofillApi23Helper {
    public static final AutofillApi23Helper INSTANCE;

    static {
        AutofillApi23Helper.INSTANCE = new AutofillApi23Helper();
    }

    public final int addChildCount(ViewStructure viewStructure0, int v) {
        Intrinsics.checkNotNullParameter(viewStructure0, "structure");
        return viewStructure0.addChildCount(v);
    }

    public final ViewStructure newChild(ViewStructure viewStructure0, int v) {
        Intrinsics.checkNotNullParameter(viewStructure0, "structure");
        return viewStructure0.newChild(v);
    }

    public final void setDimens(ViewStructure viewStructure0, int v, int v1, int v2, int v3, int v4, int v5) {
        Intrinsics.checkNotNullParameter(viewStructure0, "structure");
        viewStructure0.setDimens(v, v1, v2, v3, v4, v5);
    }

    public final void setId(ViewStructure viewStructure0, int v, String s, String s1, String s2) {
        Intrinsics.checkNotNullParameter(viewStructure0, "structure");
        viewStructure0.setId(v, s, s1, s2);
    }
}

