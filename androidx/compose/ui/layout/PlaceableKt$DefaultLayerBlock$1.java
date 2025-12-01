package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class PlaceableKt.DefaultLayerBlock.1 extends Lambda implements Function1 {
    public static final PlaceableKt.DefaultLayerBlock.1 INSTANCE;

    static {
        PlaceableKt.DefaultLayerBlock.1.INSTANCE = new PlaceableKt.DefaultLayerBlock.1();
    }

    PlaceableKt.DefaultLayerBlock.1() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.invoke(((GraphicsLayerScope)object0));
        return Unit.INSTANCE;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope0) {
        Intrinsics.checkNotNullParameter(graphicsLayerScope0, "$this$null");
    }
}

