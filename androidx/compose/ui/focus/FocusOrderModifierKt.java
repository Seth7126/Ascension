package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A#\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001A\u00020\b\u001A+\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001A\u00020\b2\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\t"}, d2 = {"focusOrder", "Landroidx/compose/ui/Modifier;", "focusOrderReceiver", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusOrder;", "", "Lkotlin/ExtensionFunctionType;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class FocusOrderModifierKt {
    public static final Modifier focusOrder(Modifier modifier0, FocusRequester focusRequester0) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(focusRequester0, "focusRequester");
        return FocusRequesterModifierKt.focusRequester(modifier0, focusRequester0);
    }

    public static final Modifier focusOrder(Modifier modifier0, FocusRequester focusRequester0, Function1 function10) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(focusRequester0, "focusRequester");
        Intrinsics.checkNotNullParameter(function10, "focusOrderReceiver");
        return FocusOrderModifierKt.focusOrder(FocusRequesterModifierKt.focusRequester(modifier0, focusRequester0), function10);
    }

    public static final Modifier focusOrder(Modifier modifier0, Function1 function10) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "focusOrderReceiver");
        return modifier0.then(new FocusOrderModifierImpl(function10, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.focus.FocusOrderModifierKt.focusOrder..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final Function1 $focusOrderReceiver$inlined;

            public androidx.compose.ui.focus.FocusOrderModifierKt.focusOrder..inlined.debugInspectorInfo.1(Function1 function10) {
                this.$focusOrderReceiver$inlined = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("focusOrder");
                inspectorInfo0.getProperties().set("focusOrderReceiver", this.$focusOrderReceiver$inlined);
            }
        }

    }
}

