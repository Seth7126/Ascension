package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "Landroidx/compose/ui/graphics/Shadow;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.ShadowSaver.2 extends Lambda implements Function1 {
    public static final SaversKt.ShadowSaver.2 INSTANCE;

    static {
        SaversKt.ShadowSaver.2.INSTANCE = new SaversKt.ShadowSaver.2();
    }

    SaversKt.ShadowSaver.2() {
        super(1);
    }

    public final Shadow invoke(Object object0) {
        Offset offset0;
        Color color0;
        Intrinsics.checkNotNullParameter(object0, "it");
        Object object1 = ((List)object0).get(0);
        Saver saver0 = SaversKt.getSaver(Color.Companion);
        Float float0 = null;
        if(Intrinsics.areEqual(object1, Boolean.FALSE)) {
            color0 = null;
        }
        else if(object1 != null) {
            color0 = (Color)saver0.restore(object1);
        }
        else {
            color0 = null;
        }
        Intrinsics.checkNotNull(color0);
        long v = color0.unbox-impl();
        Object object2 = ((List)object0).get(1);
        Saver saver1 = SaversKt.getSaver(Offset.Companion);
        if(Intrinsics.areEqual(object2, Boolean.FALSE)) {
            offset0 = null;
        }
        else if(object2 != null) {
            offset0 = (Offset)saver1.restore(object2);
        }
        else {
            offset0 = null;
        }
        Intrinsics.checkNotNull(offset0);
        long v1 = offset0.unbox-impl();
        Object object3 = ((List)object0).get(2);
        if(object3 != null) {
            float0 = (Float)object3;
        }
        Intrinsics.checkNotNull(float0);
        return new Shadow(v, v1, float0.floatValue(), null);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(object0);
    }
}

