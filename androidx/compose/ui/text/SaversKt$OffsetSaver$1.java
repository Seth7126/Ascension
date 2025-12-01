package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001A\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\n"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.OffsetSaver.1 extends Lambda implements Function2 {
    public static final SaversKt.OffsetSaver.1 INSTANCE;

    static {
        SaversKt.OffsetSaver.1.INSTANCE = new SaversKt.OffsetSaver.1();
    }

    SaversKt.OffsetSaver.1() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke-Uv8p0NA(((SaverScope)object0), ((Offset)object1).unbox-impl());
    }

    public final Object invoke-Uv8p0NA(SaverScope saverScope0, long v) {
        Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
        return Offset.equals-impl0(v, 0x7FC000007FC00000L) ? false : CollectionsKt.arrayListOf(new Float[]{((Float)SaversKt.save(Offset.getX-impl(v))), ((Float)SaversKt.save(Offset.getY-impl(v)))});
    }
}

