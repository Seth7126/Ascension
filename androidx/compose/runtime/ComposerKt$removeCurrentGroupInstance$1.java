package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001A\u00020\u00062\n\u0010\u0001\u001A\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\n"}, d2 = {"Landroidx/compose/runtime/Applier;", "<anonymous parameter 0>", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class ComposerKt.removeCurrentGroupInstance.1 extends Lambda implements Function3 {
    public static final ComposerKt.removeCurrentGroupInstance.1 INSTANCE;

    static {
        ComposerKt.removeCurrentGroupInstance.1.INSTANCE = new ComposerKt.removeCurrentGroupInstance.1();
    }

    ComposerKt.removeCurrentGroupInstance.1() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public Object invoke(Object object0, Object object1, Object object2) {
        this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
        return Unit.INSTANCE;
    }

    public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
        Intrinsics.checkNotNullParameter(applier0, "$noName_0");
        Intrinsics.checkNotNullParameter(slotWriter0, "slots");
        Intrinsics.checkNotNullParameter(rememberManager0, "rememberManager");
        ComposerKt.removeCurrentGroup(slotWriter0, rememberManager0);
    }
}

