package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "Landroidx/compose/ui/geometry/Offset;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.OffsetSaver.2 extends Lambda implements Function1 {
    public static final SaversKt.OffsetSaver.2 INSTANCE;

    static {
        SaversKt.OffsetSaver.2.INSTANCE = new SaversKt.OffsetSaver.2();
    }

    SaversKt.OffsetSaver.2() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke-x-9fifI(object0);
    }

    public final Offset invoke-x-9fifI(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "it");
        if(Intrinsics.areEqual(object0, Boolean.FALSE)) {
            return Offset.box-impl(0x7FC000007FC00000L);
        }
        Object object1 = ((List)object0).get(0);
        Float float0 = null;
        Float float1 = object1 == null ? null : ((Float)object1);
        Intrinsics.checkNotNull(float1);
        float f = float1.floatValue();
        Object object2 = ((List)object0).get(1);
        if(object2 != null) {
            float0 = (Float)object2;
        }
        Intrinsics.checkNotNull(float0);
        return Offset.box-impl(OffsetKt.Offset(f, float0.floatValue()));
    }
}

