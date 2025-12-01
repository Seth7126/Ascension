package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001A \u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0012\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¨\u0006\u0005"}, d2 = {"onGloballyPositioned", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class OnGloballyPositionedModifierKt {
    public static final Modifier onGloballyPositioned(Modifier modifier0, Function1 function10) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "onGloballyPositioned");
        return modifier0.then(new OnGloballyPositionedModifierImpl(function10, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final Function1 $onGloballyPositioned$inlined;

            public androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned..inlined.debugInspectorInfo.1(Function1 function10) {
                this.$onGloballyPositioned$inlined = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("onGloballyPositioned");
                inspectorInfo0.getProperties().set("onGloballyPositioned", this.$onGloballyPositioned$inlined);
            }
        }

    }
}

