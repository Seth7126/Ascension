package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\'\u0018\u00002\u00020\u0001B\u001E\u0012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0007R\u0010\u0010\b\u001A\u0004\u0018\u00010\u0004X\u0082\u000E¢\u0006\u0002\n\u0000R\u001F\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0016\u0010\u000E\u001A\u0004\u0018\u00010\u000F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001A\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001A\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/platform/InspectableValue;", "info", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "_values", "inspectableElements", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "getInspectableElements", "()Lkotlin/sequences/Sequence;", "nameFallback", "", "getNameFallback", "()Ljava/lang/String;", "valueOverride", "", "getValueOverride", "()Ljava/lang/Object;", "values", "getValues", "()Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class InspectorValueInfo implements InspectableValue {
    public static final int $stable = 8;
    private InspectorInfo _values;
    private final Function1 info;

    static {
    }

    public InspectorValueInfo(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "info");
        super();
        this.info = function10;
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    public Sequence getInspectableElements() {
        return this.getValues().getProperties();
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    public String getNameFallback() {
        return this.getValues().getName();
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    public Object getValueOverride() {
        return this.getValues().getValue();
    }

    private final InspectorInfo getValues() {
        InspectorInfo inspectorInfo0 = this._values;
        if(inspectorInfo0 == null) {
            inspectorInfo0 = new InspectorInfo();
            this.info.invoke(inspectorInfo0);
        }
        this._values = inspectorInfo0;
        return inspectorInfo0;
    }
}

