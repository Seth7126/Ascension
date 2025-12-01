package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0014\u0010\u0000\u001A\u00020\u0005*\u00020\u00052\u0006\u0010\u0000\u001A\u00020\u0001H\u0007\"\u0017\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"layoutId", "", "Landroidx/compose/ui/layout/Measurable;", "getLayoutId", "(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;", "Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class LayoutIdKt {
    public static final Object getLayoutId(Measurable measurable0) {
        Intrinsics.checkNotNullParameter(measurable0, "<this>");
        Object object0 = measurable0.getParentData();
        LayoutIdParentData layoutIdParentData0 = object0 instanceof LayoutIdParentData ? ((LayoutIdParentData)object0) : null;
        return layoutIdParentData0 == null ? null : layoutIdParentData0.getLayoutId();
    }

    public static final Modifier layoutId(Modifier modifier0, Object object0) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(object0, "layoutId");
        return modifier0.then(new LayoutId(object0, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.layout.LayoutIdKt.layoutId..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final Object $layoutId$inlined;

            public androidx.compose.ui.layout.LayoutIdKt.layoutId..inlined.debugInspectorInfo.1(Object object0) {
                this.$layoutId$inlined = object0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("layoutId");
                inspectorInfo0.setValue(this.$layoutId$inlined);
            }
        }

    }
}

