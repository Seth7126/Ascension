package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0012\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001A\u00020\u0014H\u0016J\u001D\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0019\u0010\r\u001A\u00020\u0005X\u0082\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000E\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "onSizeChanged", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "", "inspectorInfo", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnSizeChanged", "()Lkotlin/jvm/functions/Function1;", "previousSize", "J", "equals", "", "other", "", "hashCode", "", "onRemeasured", "size", "onRemeasured-ozmzZPI", "(J)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class OnSizeChangedModifier extends InspectorValueInfo implements OnRemeasuredModifier {
    private final Function1 onSizeChanged;
    private long previousSize;

    public OnSizeChangedModifier(Function1 function10, Function1 function11) {
        Intrinsics.checkNotNullParameter(function10, "onSizeChanged");
        Intrinsics.checkNotNullParameter(function11, "inspectorInfo");
        super(function11);
        this.onSizeChanged = function10;
        this.previousSize = 0x8000000080000000L;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean all(Function1 function10) {
        return DefaultImpls.all(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean any(Function1 function10) {
        return DefaultImpls.any(this, function10);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof OnSizeChangedModifier ? Intrinsics.areEqual(this.onSizeChanged, ((OnSizeChangedModifier)object0).onSizeChanged) : false;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldIn(Object object0, Function2 function20) {
        return DefaultImpls.foldIn(this, object0, function20);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldOut(Object object0, Function2 function20) {
        return DefaultImpls.foldOut(this, object0, function20);
    }

    public final Function1 getOnSizeChanged() {
        return this.onSizeChanged;
    }

    @Override
    public int hashCode() {
        return this.onSizeChanged.hashCode();
    }

    @Override  // androidx.compose.ui.layout.OnRemeasuredModifier
    public void onRemeasured-ozmzZPI(long v) {
        if(!IntSize.equals-impl0(this.previousSize, v)) {
            IntSize intSize0 = IntSize.box-impl(v);
            this.onSizeChanged.invoke(intSize0);
            this.previousSize = v;
        }
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }
}

