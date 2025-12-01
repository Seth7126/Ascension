package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u0000 \u001A2\u00020\u0001:\u0001\u001AR\u0018\u0010\u0002\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001A\u00020\tX¦\u000E¢\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u0018\u0010\u000E\u001A\u00020\u000FX¦\u000E¢\u0006\f\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001A\u00020\u0015X¦\u000E¢\u0006\f\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface ComposeUiNode {
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R(\u0010\b\u001A\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\f¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER(\u0010\u000F\u001A\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\f¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u000ER(\u0010\u0012\u001A\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\f¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u000ER(\u0010\u0015\u001A\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000B0\t¢\u0006\u0002\b\f¢\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u000E¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode$Companion;", "", "()V", "Constructor", "Lkotlin/Function0;", "Landroidx/compose/ui/node/ComposeUiNode;", "getConstructor", "()Lkotlin/jvm/functions/Function0;", "SetDensity", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "Lkotlin/ExtensionFunctionType;", "getSetDensity", "()Lkotlin/jvm/functions/Function2;", "SetLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getSetLayoutDirection", "SetMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getSetMeasurePolicy", "SetModifier", "Landroidx/compose/ui/Modifier;", "getSetModifier", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        static final Companion $$INSTANCE;
        private static final Function0 Constructor;
        private static final Function2 SetDensity;
        private static final Function2 SetLayoutDirection;
        private static final Function2 SetMeasurePolicy;
        private static final Function2 SetModifier;

        static {
            Companion.$$INSTANCE = new Companion();
            Companion.Constructor = LayoutNode.Companion.getConstructor$ui_release();
            Companion.SetModifier = ComposeUiNode.Companion.SetModifier.1.INSTANCE;
            Companion.SetDensity = ComposeUiNode.Companion.SetDensity.1.INSTANCE;
            Companion.SetMeasurePolicy = ComposeUiNode.Companion.SetMeasurePolicy.1.INSTANCE;
            Companion.SetLayoutDirection = ComposeUiNode.Companion.SetLayoutDirection.1.INSTANCE;
        }

        public final Function0 getConstructor() {
            return Companion.Constructor;
        }

        public final Function2 getSetDensity() {
            return Companion.SetDensity;
        }

        public final Function2 getSetLayoutDirection() {
            return Companion.SetLayoutDirection;
        }

        public final Function2 getSetMeasurePolicy() {
            return Companion.SetMeasurePolicy;
        }

        public final Function2 getSetModifier() {
            return Companion.SetModifier;
        }
    }

    public static final Companion Companion;

    static {
        ComposeUiNode.Companion = Companion.$$INSTANCE;
    }

    Density getDensity();

    LayoutDirection getLayoutDirection();

    MeasurePolicy getMeasurePolicy();

    Modifier getModifier();

    void setDensity(Density arg1);

    void setLayoutDirection(LayoutDirection arg1);

    void setMeasurePolicy(MeasurePolicy arg1);

    void setModifier(Modifier arg1);
}

