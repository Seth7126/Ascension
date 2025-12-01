package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.TextGeometricTransformSaver.2 extends Lambda implements Function1 {
    public static final SaversKt.TextGeometricTransformSaver.2 INSTANCE;

    static {
        SaversKt.TextGeometricTransformSaver.2.INSTANCE = new SaversKt.TextGeometricTransformSaver.2();
    }

    SaversKt.TextGeometricTransformSaver.2() {
        super(1);
    }

    public final TextGeometricTransform invoke(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "it");
        return new TextGeometricTransform(((Number)((List)object0).get(0)).floatValue(), ((Number)((List)object0).get(1)).floatValue());
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(object0);
    }
}

