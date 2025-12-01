package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class InspectableValueKt.NoInspectorInfo.1 extends Lambda implements Function1 {
    public static final InspectableValueKt.NoInspectorInfo.1 INSTANCE;

    static {
        InspectableValueKt.NoInspectorInfo.1.INSTANCE = new InspectableValueKt.NoInspectorInfo.1();
    }

    InspectableValueKt.NoInspectorInfo.1() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.invoke(((InspectorInfo)object0));
        return Unit.INSTANCE;
    }

    public final void invoke(InspectorInfo inspectorInfo0) {
        Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
    }
}

