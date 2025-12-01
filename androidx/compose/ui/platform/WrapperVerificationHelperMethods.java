package androidx.compose.ui.platform;

import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001C\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001A\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/WrapperVerificationHelperMethods;", "", "()V", "attributeSourceResourceMap", "", "", "view", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class WrapperVerificationHelperMethods {
    public static final WrapperVerificationHelperMethods INSTANCE;

    static {
        WrapperVerificationHelperMethods.INSTANCE = new WrapperVerificationHelperMethods();
    }

    public final Map attributeSourceResourceMap(View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Map map0 = view0.getAttributeSourceResourceMap();
        Intrinsics.checkNotNullExpressionValue(map0, "view.attributeSourceResourceMap");
        return map0;
    }
}

