package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\r\u001A\u00020\u000EH\u0016R \u0010\u0002\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0014\u0010\u000B\u001A\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\n¨\u0006\u000F"}, d2 = {"androidx/compose/ui/layout/MeasureScope$layout$1", "Landroidx/compose/ui/layout/MeasureResult;", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "getAlignmentLines", "()Ljava/util/Map;", "height", "getHeight", "()I", "width", "getWidth", "placeChildren", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class MeasureScope.layout.1 implements MeasureResult {
    final Map $alignmentLines;
    final int $height;
    final Function1 $placementBlock;
    final int $width;
    private final Map alignmentLines;
    private final int height;
    private final int width;

    MeasureScope.layout.1(int v, int v1, Map map0, MeasureScope measureScope0, Function1 function10) {
        this.$width = v;
        this.$height = v1;
        this.$alignmentLines = map0;
        MeasureScope.this = measureScope0;
        this.$placementBlock = function10;
        super();
        this.width = v;
        this.height = v1;
        this.alignmentLines = map0;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public Map getAlignmentLines() {
        return this.alignmentLines;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.height;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.width;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        LayoutDirection layoutDirection0 = MeasureScope.this.getLayoutDirection();
        LayoutDirection layoutDirection1 = PlacementScope.Companion.getParentLayoutDirection();
        PlacementScope.parentWidth = this.$width;
        PlacementScope.parentLayoutDirection = layoutDirection0;
        this.$placementBlock.invoke(PlacementScope.Companion);
        PlacementScope.parentWidth = 0;
        PlacementScope.parentLayoutDirection = layoutDirection1;
    }
}

