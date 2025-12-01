package androidx.compose.ui.text;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "Landroidx/compose/ui/unit/TextUnit;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.TextUnitSaver.2 extends Lambda implements Function1 {
    public static final SaversKt.TextUnitSaver.2 INSTANCE;

    static {
        SaversKt.TextUnitSaver.2.INSTANCE = new SaversKt.TextUnitSaver.2();
    }

    SaversKt.TextUnitSaver.2() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke-XNhUCwk(object0);
    }

    public final TextUnit invoke-XNhUCwk(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "it");
        Object object1 = ((List)object0).get(0);
        TextUnitType textUnitType0 = null;
        Float float0 = object1 == null ? null : ((Float)object1);
        Intrinsics.checkNotNull(float0);
        float f = float0.floatValue();
        Object object2 = ((List)object0).get(1);
        if(object2 != null) {
            textUnitType0 = (TextUnitType)object2;
        }
        Intrinsics.checkNotNull(textUnitType0);
        return TextUnit.box-impl(TextUnitKt.TextUnit-anM5pPY(f, textUnitType0.unbox-impl()));
    }
}

