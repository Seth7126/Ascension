package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode.LayoutState;
import androidx.compose.ui.node.LayoutNode.NoIntrinsicsMeasurePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0003PQRB\u0007\b\u0016\u00A2\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u00A2\u0006\u0002\u0010\u0005J*\u0010*\u001A\u00020+2\u001D\u0010,\u001A\u0019\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u001F\u0012\u0004\u0012\u00020 0\u001D\u00A2\u0006\u0002\b!H\u0002\u00F8\u0001\u0000J\u0010\u0010-\u001A\u00020\t2\u0006\u0010.\u001A\u00020\u0004H\u0002J\u0010\u0010/\u001A\u00020\"2\u0006\u0010\u0010\u001A\u00020\u0004H\u0002J\r\u00100\u001A\u00020\"H\u0000\u00A2\u0006\u0002\b1J\u0010\u00102\u001A\u00020\"2\u0006\u00103\u001A\u00020\tH\u0002J\u0017\u00104\u001A\u00020\"2\f\u0010,\u001A\b\u0012\u0004\u0012\u00020\"05H\u0082\bJ\b\u00106\u001A\u00020\"H\u0002J\"\u00107\u001A\u00020\"2\u0006\u00108\u001A\u00020\u00042\u0006\u00109\u001A\u00020\u00042\b\b\u0002\u0010:\u001A\u00020\u0004H\u0002J(\u0010;\u001A\u00020<2\b\u0010=\u001A\u0004\u0018\u00010\u00012\u0011\u0010>\u001A\r\u0012\u0004\u0012\u00020\"05\u00A2\u0006\u0002\b?\u00A2\u0006\u0002\u0010@J\u0018\u0010A\u001A\u00020\"2\u0006\u00103\u001A\u00020\t2\u0006\u0010B\u001A\u00020\u0013H\u0002J2\u0010A\u001A\u00020\"2\u0006\u00103\u001A\u00020\t2\b\u0010=\u001A\u0004\u0018\u00010\u00012\u0011\u0010>\u001A\r\u0012\u0004\u0012\u00020\"05\u00A2\u0006\u0002\b?H\u0002\u00A2\u0006\u0002\u0010CJ2\u0010A\u001A\b\u0012\u0004\u0012\u00020E0D2\b\u0010=\u001A\u0004\u0018\u00010\u00012\u0011\u0010>\u001A\r\u0012\u0004\u0012\u00020\"05\u00A2\u0006\u0002\b?H\u0000\u00A2\u0006\u0004\bF\u0010GJ:\u0010H\u001A\u00020I2\b\u0010J\u001A\u0004\u0018\u00010I2\u0006\u0010K\u001A\u00020\t2\u0006\u0010L\u001A\u00020\u000B2\u0011\u0010M\u001A\r\u0012\u0004\u0012\u00020\"05\u00A2\u0006\u0002\b?H\u0002\u00A2\u0006\u0002\u0010NJ\u0012\u0010O\u001A\u00020\t2\b\u0010=\u001A\u0004\u0018\u00010\u0001H\u0002R\u000E\u0010\u0006\u001A\u00020\u0007X\u0082D\u00A2\u0006\u0002\n\u0000R\u0010\u0010\b\u001A\u0004\u0018\u00010\tX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001C\u0010\n\u001A\u0004\u0018\u00010\u000BX\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u000E\u0010\u0010\u001A\u00020\u0004X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001C\u0010\u0014\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\t0\u0012X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0015\u001A\u00020\u0004X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0016\u001A\u00020\u0004X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001A\u00020\t8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001A\u001A\u00060\u001BR\u00020\u0000X\u0082\u0004\u00A2\u0006\u0002\n\u0000RE\u0010\u001C\u001A0\u0012\u0004\u0012\u00020\t\u0012\u001B\u0012\u0019\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u001F\u0012\u0004\u0012\u00020 0\u001D\u00A2\u0006\u0002\b!\u0012\u0004\u0012\u00020\"0\u001D\u00A2\u0006\u0002\b!X\u0080\u0004\u00F8\u0001\u0000\u00A2\u0006\b\n\u0000\u001A\u0004\b#\u0010$R%\u0010%\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0&\u00A2\u0006\u0002\b!X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\'\u0010(R\u001C\u0010)\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\t0\u0012X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006S"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState;", "", "()V", "maxSlotsToRetainForReuse", "", "(I)V", "NoIntrinsicsMessage", "", "_root", "Landroidx/compose/ui/node/LayoutNode;", "compositionContext", "Landroidx/compose/runtime/CompositionContext;", "getCompositionContext$ui_release", "()Landroidx/compose/runtime/CompositionContext;", "setCompositionContext$ui_release", "(Landroidx/compose/runtime/CompositionContext;)V", "currentIndex", "nodeToNodeState", "", "Landroidx/compose/ui/layout/SubcomposeLayoutState$NodeState;", "precomposeMap", "precomposedCount", "reusableCount", "root", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "scope", "Landroidx/compose/ui/layout/SubcomposeLayoutState$Scope;", "setMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "", "getSetMeasurePolicy$ui_release", "()Lkotlin/jvm/functions/Function2;", "setRoot", "Lkotlin/Function1;", "getSetRoot$ui_release", "()Lkotlin/jvm/functions/Function1;", "slotIdToNode", "createMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "block", "createNodeAt", "index", "disposeAfterIndex", "disposeCurrentNodes", "disposeCurrentNodes$ui_release", "disposeNode", "node", "ignoreRemeasureRequests", "Lkotlin/Function0;", "makeSureStateIsConsistent", "move", "from", "to", "count", "precompose", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "slotId", "content", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "subcompose", "nodeState", "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "Landroidx/compose/ui/layout/Measurable;", "subcompose$ui_release", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "subcomposeInto", "Landroidx/compose/runtime/Composition;", "existing", "container", "parent", "composable", "(Landroidx/compose/runtime/Composition;Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "takeNodeFromReusables", "NodeState", "PrecomposedSlotHandle", "Scope", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SubcomposeLayoutState {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0002\u0018\u00002\u00020\u0001B.\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001\u0012\u0011\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u001C\u0010\u0007\u001A\u0004\u0018\u00010\bX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\'\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006X\u0086\u000E¢\u0006\u0010\n\u0002\u0010\u0012\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R\u001C\u0010\u0002\u001A\u0004\u0018\u00010\u0001X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$NodeState;", "", "slotId", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "composition", "Landroidx/compose/runtime/Composition;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composition;)V", "getComposition", "()Landroidx/compose/runtime/Composition;", "setComposition", "(Landroidx/compose/runtime/Composition;)V", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "getSlotId", "()Ljava/lang/Object;", "setSlotId", "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class NodeState {
        private Composition composition;
        private Function2 content;
        private Object slotId;

        public NodeState(Object object0, Function2 function20, Composition composition0) {
            Intrinsics.checkNotNullParameter(function20, "content");
            super();
            this.slotId = object0;
            this.content = function20;
            this.composition = composition0;
        }

        public NodeState(Object object0, Function2 function20, Composition composition0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 4) != 0) {
                composition0 = null;
            }
            this(object0, function20, composition0);
        }

        public final Composition getComposition() {
            return this.composition;
        }

        public final Function2 getContent() {
            return this.content;
        }

        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setComposition(Composition composition0) {
            this.composition = composition0;
        }

        public final void setContent(Function2 function20) {
            Intrinsics.checkNotNullParameter(function20, "<set-?>");
            this.content = function20;
        }

        public final void setSlotId(Object object0) {
            this.slotId = object0;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "", "dispose", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public interface PrecomposedSlotHandle {
        void dispose();
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001A\u0004\u0018\u00010\u00162\u0011\u0010\u0017\u001A\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001AH\u0016¢\u0006\u0002\u0010\u001BR\u001A\u0010\u0003\u001A\u00020\u0004X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001A\u0010\t\u001A\u00020\u0004X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u0006\"\u0004\b\u000B\u0010\bR\u001A\u0010\f\u001A\u00020\rX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$Scope;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "(Landroidx/compose/ui/layout/SubcomposeLayoutState;)V", "density", "", "getDensity", "()F", "setDensity", "(F)V", "fontScale", "getFontScale", "setFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "subcompose", "", "Landroidx/compose/ui/layout/Measurable;", "slotId", "", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;
        private LayoutDirection layoutDirection;

        public Scope() {
            Intrinsics.checkNotNullParameter(subcomposeLayoutState0, "this$0");
            SubcomposeLayoutState.this = subcomposeLayoutState0;
            super();
            this.layoutDirection = LayoutDirection.Rtl;
        }

        @Override  // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override  // androidx.compose.ui.unit.Density
        public float getFontScale() {
            return this.fontScale;
        }

        @Override  // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @Override  // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(int v, int v1, Map map0, Function1 function10) {
            return DefaultImpls.layout(this, v, v1, map0, function10);
        }

        @Override  // androidx.compose.ui.unit.Density
        public int roundToPx--R2X_6o(long v) {
            return DefaultImpls.roundToPx--R2X_6o(this, v);
        }

        @Override  // androidx.compose.ui.unit.Density
        public int roundToPx-0680j_4(float f) {
            return DefaultImpls.roundToPx-0680j_4(this, f);
        }

        public void setDensity(float f) {
            this.density = f;
        }

        public void setFontScale(float f) {
            this.fontScale = f;
        }

        public void setLayoutDirection(LayoutDirection layoutDirection0) {
            Intrinsics.checkNotNullParameter(layoutDirection0, "<set-?>");
            this.layoutDirection = layoutDirection0;
        }

        @Override  // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List subcompose(Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(function20, "content");
            return SubcomposeLayoutState.this.subcompose$ui_release(object0, function20);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float toDp-GaN1DYA(long v) {
            return DefaultImpls.toDp-GaN1DYA(this, v);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float toDp-u2uoSUM(float f) {
            return DefaultImpls.toDp-u2uoSUM(this, f);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float toDp-u2uoSUM(int v) {
            return DefaultImpls.toDp-u2uoSUM(this, v);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float toPx--R2X_6o(long v) {
            return DefaultImpls.toPx--R2X_6o(this, v);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float toPx-0680j_4(float f) {
            return DefaultImpls.toPx-0680j_4(this, f);
        }

        @Override  // androidx.compose.ui.unit.Density
        public Rect toRect(DpRect dpRect0) {
            return DefaultImpls.toRect(this, dpRect0);
        }

        @Override  // androidx.compose.ui.unit.Density
        public long toSp-0xMU5do(float f) {
            return DefaultImpls.toSp-0xMU5do(this, f);
        }

        @Override  // androidx.compose.ui.unit.Density
        public long toSp-kPz2Gy4(float f) {
            return DefaultImpls.toSp-kPz2Gy4(this, f);
        }

        @Override  // androidx.compose.ui.unit.Density
        public long toSp-kPz2Gy4(int v) {
            return DefaultImpls.toSp-kPz2Gy4(this, v);
        }
    }

    public static final int $stable = 8;
    private final String NoIntrinsicsMessage;
    private LayoutNode _root;
    private CompositionContext compositionContext;
    private int currentIndex;
    private final int maxSlotsToRetainForReuse;
    private final Map nodeToNodeState;
    private final Map precomposeMap;
    private int precomposedCount;
    private int reusableCount;
    private final Scope scope;
    private final Function2 setMeasurePolicy;
    private final Function1 setRoot;
    private final Map slotIdToNode;

    static {
    }

    public SubcomposeLayoutState() {
        this(0);
    }

    public SubcomposeLayoutState(int v) {
        this.maxSlotsToRetainForReuse = v;
        this.setRoot = new Function1() {
            {
                SubcomposeLayoutState.this = subcomposeLayoutState0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((LayoutNode)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(LayoutNode layoutNode0) {
                Intrinsics.checkNotNullParameter(layoutNode0, "$this$null");
                SubcomposeLayoutState.this._root = layoutNode0;
            }
        };
        this.setMeasurePolicy = new Function2() {
            {
                SubcomposeLayoutState.this = subcomposeLayoutState0;
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((LayoutNode)object0), ((Function2)object1));
                return Unit.INSTANCE;
            }

            public final void invoke(LayoutNode layoutNode0, Function2 function20) {
                Intrinsics.checkNotNullParameter(layoutNode0, "$this$null");
                Intrinsics.checkNotNullParameter(function20, "it");
                layoutNode0.setMeasurePolicy(SubcomposeLayoutState.this.createMeasurePolicy(function20));
            }
        };
        this.nodeToNodeState = new LinkedHashMap();
        this.slotIdToNode = new LinkedHashMap();
        this.scope = new Scope(this);
        this.precomposeMap = new LinkedHashMap();
        this.NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve \'match parent\' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    private final MeasurePolicy createMeasurePolicy(Function2 function20) {
        return new NoIntrinsicsMeasurePolicy(/*ERROR_MISSING_ARG_2/*) {
            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
                Intrinsics.checkNotNullParameter(measureScope0, "$receiver");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                function20.scope.setLayoutDirection(measureScope0.getLayoutDirection());
                function20.scope.setDensity(measureScope0.getDensity());
                function20.scope.setFontScale(measureScope0.getFontScale());
                function20.currentIndex = 0;
                Constraints constraints0 = Constraints.box-impl(v);
                return new MeasureResult() {
                    @Override  // androidx.compose.ui.layout.MeasureResult
                    public Map getAlignmentLines() {
                        return SubcomposeLayoutState.this.getAlignmentLines();
                    }

                    @Override  // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return SubcomposeLayoutState.this.getHeight();
                    }

                    @Override  // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return SubcomposeLayoutState.this.getWidth();
                    }

                    @Override  // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        SubcomposeLayoutState.this.currentIndex.currentIndex = this.$indexAfterMeasure;
                        SubcomposeLayoutState.this.placeChildren();
                        SubcomposeLayoutState.this.currentIndex.disposeAfterIndex(SubcomposeLayoutState.this.currentIndex.currentIndex);
                    }
                };
            }
        };
    }

    private final LayoutNode createNodeAt(int v) {
        LayoutNode layoutNode0 = new LayoutNode(true);
        LayoutNode layoutNode1 = this.getRoot();
        layoutNode1.ignoreRemeasureRequests = true;
        this.getRoot().insertAt$ui_release(v, layoutNode0);
        layoutNode1.ignoreRemeasureRequests = false;
        return layoutNode0;
    }

    private final void disposeAfterIndex(int v) {
        int v1 = this.getRoot().getFoldedChildren$ui_release().size() - this.precomposedCount;
        int v2 = Math.max(v, v1 - this.maxSlotsToRetainForReuse);
        int v3 = v1 - v2;
        this.reusableCount = v3;
        int v4 = v3 + v2;
        if(v2 < v4) {
            for(int v5 = v2; true; ++v5) {
                LayoutNode layoutNode0 = (LayoutNode)this.getRoot().getFoldedChildren$ui_release().get(v5);
                Object object0 = this.nodeToNodeState.get(layoutNode0);
                Intrinsics.checkNotNull(object0);
                Object object1 = ((NodeState)object0).getSlotId();
                this.slotIdToNode.remove(object1);
                if(v5 + 1 >= v4) {
                    break;
                }
            }
        }
        int v6 = v2 - v;
        if(v6 > 0) {
            LayoutNode layoutNode1 = this.getRoot();
            layoutNode1.ignoreRemeasureRequests = true;
            int v7 = v + v6;
            if(v < v7) {
                for(int v8 = v; true; ++v8) {
                    this.disposeNode(((LayoutNode)this.getRoot().getFoldedChildren$ui_release().get(v8)));
                    if(v8 + 1 >= v7) {
                        break;
                    }
                }
            }
            this.getRoot().removeAt$ui_release(v, v6);
            layoutNode1.ignoreRemeasureRequests = false;
        }
        this.makeSureStateIsConsistent();
    }

    public final void disposeCurrentNodes$ui_release() {
        for(Object object0: this.nodeToNodeState.values()) {
            Composition composition0 = ((NodeState)object0).getComposition();
            Intrinsics.checkNotNull(composition0);
            composition0.dispose();
        }
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
    }

    private final void disposeNode(LayoutNode layoutNode0) {
        Object object0 = this.nodeToNodeState.remove(layoutNode0);
        Intrinsics.checkNotNull(object0);
        Composition composition0 = ((NodeState)object0).getComposition();
        Intrinsics.checkNotNull(composition0);
        composition0.dispose();
        Object object1 = ((NodeState)object0).getSlotId();
        this.slotIdToNode.remove(object1);
    }

    public final CompositionContext getCompositionContext$ui_release() {
        return this.compositionContext;
    }

    private final LayoutNode getRoot() {
        LayoutNode layoutNode0 = this._root;
        if(layoutNode0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return layoutNode0;
    }

    public final Function2 getSetMeasurePolicy$ui_release() {
        return this.setMeasurePolicy;
    }

    public final Function1 getSetRoot$ui_release() {
        return this.setRoot;
    }

    private final void ignoreRemeasureRequests(Function0 function00) {
        LayoutNode layoutNode0 = this.getRoot();
        layoutNode0.ignoreRemeasureRequests = true;
        function00.invoke();
        layoutNode0.ignoreRemeasureRequests = false;
    }

    private final void makeSureStateIsConsistent() {
        int v = this.getRoot().getFoldedChildren$ui_release().size();
        if(this.nodeToNodeState.size() != v) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.size() + ") and the children count on the SubcomposeLayout (" + this.getRoot().getFoldedChildren$ui_release().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
    }

    private final void move(int v, int v1, int v2) {
        LayoutNode layoutNode0 = this.getRoot();
        layoutNode0.ignoreRemeasureRequests = true;
        this.getRoot().move$ui_release(v, v1, v2);
        layoutNode0.ignoreRemeasureRequests = false;
    }

    static void move$default(SubcomposeLayoutState subcomposeLayoutState0, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 4) != 0) {
            v2 = 1;
        }
        subcomposeLayoutState0.move(v, v1, v2);
    }

    public final PrecomposedSlotHandle precompose(Object object0, Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "content");
        this.makeSureStateIsConsistent();
        if(!this.slotIdToNode.containsKey(object0)) {
            Map map0 = this.precomposeMap;
            LayoutNode layoutNode0 = map0.get(object0);
            if(layoutNode0 == null) {
                if(this.reusableCount > 0) {
                    layoutNode0 = this.takeNodeFromReusables(object0);
                    this.move(this.getRoot().getFoldedChildren$ui_release().indexOf(layoutNode0), this.getRoot().getFoldedChildren$ui_release().size(), 1);
                }
                else {
                    layoutNode0 = this.createNodeAt(this.getRoot().getFoldedChildren$ui_release().size());
                }
                ++this.precomposedCount;
                map0.put(object0, layoutNode0);
            }
            this.subcompose(layoutNode0, object0, function20);
        }
        return new PrecomposedSlotHandle() {
            @Override  // androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle
            public void dispose() {
                LayoutNode layoutNode0 = (LayoutNode)object0.precomposeMap.remove(this.$slotId);
                if(layoutNode0 != null) {
                    int v = object0.getRoot().getFoldedChildren$ui_release().indexOf(layoutNode0);
                    if(v == -1) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if(object0.reusableCount < object0.maxSlotsToRetainForReuse) {
                        int v1 = object0.getRoot().getFoldedChildren$ui_release().size();
                        object0.move(v, v1 - object0.precomposedCount - object0.reusableCount, 1);
                        ++object0.reusableCount;
                    }
                    else {
                        LayoutNode layoutNode1 = object0.getRoot();
                        layoutNode1.ignoreRemeasureRequests = true;
                        object0.disposeNode(layoutNode0);
                        object0.getRoot().removeAt$ui_release(v, 1);
                        layoutNode1.ignoreRemeasureRequests = false;
                    }
                    if(object0.precomposedCount <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    --object0.precomposedCount;
                }
            }
        };
    }

    public final void setCompositionContext$ui_release(CompositionContext compositionContext0) {
        this.compositionContext = compositionContext0;
    }

    private final void subcompose(LayoutNode layoutNode0, NodeState subcomposeLayoutState$NodeState0) {
        layoutNode0.withNoSnapshotReadObservation$ui_release(new Function0(subcomposeLayoutState$NodeState0, layoutNode0) {
            final LayoutNode $node;
            final NodeState $nodeState;

            {
                SubcomposeLayoutState.this = subcomposeLayoutState0;
                this.$nodeState = subcomposeLayoutState$NodeState0;
                this.$node = layoutNode0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                SubcomposeLayoutState subcomposeLayoutState0 = SubcomposeLayoutState.this;
                NodeState subcomposeLayoutState$NodeState0 = this.$nodeState;
                LayoutNode layoutNode0 = this.$node;
                LayoutNode layoutNode1 = subcomposeLayoutState0.getRoot();
                layoutNode1.ignoreRemeasureRequests = true;
                Function2 function20 = subcomposeLayoutState$NodeState0.getContent();
                Composition composition0 = subcomposeLayoutState$NodeState0.getComposition();
                CompositionContext compositionContext0 = subcomposeLayoutState0.getCompositionContext$ui_release();
                if(compositionContext0 == null) {
                    throw new IllegalStateException("parent composition reference not set");
                }
                subcomposeLayoutState$NodeState0.setComposition(subcomposeLayoutState0.subcomposeInto(composition0, layoutNode0, compositionContext0, ComposableLambdaKt.composableLambdaInstance(-985540201, true, new Function2() {
                    final Function2 $content;

                    {
                        this.$content = function20;
                        super(2);
                    }

                    @Override  // kotlin.jvm.functions.Function2
                    public Object invoke(Object object0, Object object1) {
                        this.invoke(((Composer)object0), ((Number)object1).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer0, int v) {
                        ComposerKt.sourceInformation(composer0, "C240@10454L9:SubcomposeLayout.kt#80mrfh");
                        if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
                            composer0.skipToGroupEnd();
                            return;
                        }
                        this.$content.invoke(composer0, 0);
                    }
                })));
                layoutNode1.ignoreRemeasureRequests = false;
            }
        });
    }

    private final void subcompose(LayoutNode layoutNode0, Object object0, Function2 function20) {
        Map map0 = this.nodeToNodeState;
        NodeState subcomposeLayoutState$NodeState0 = map0.get(layoutNode0);
        if(subcomposeLayoutState$NodeState0 == null) {
            subcomposeLayoutState$NodeState0 = new NodeState(object0, ComposableSingletons.SubcomposeLayoutKt.INSTANCE.getLambda-1$ui_release(), null, 4, null);
            map0.put(layoutNode0, subcomposeLayoutState$NodeState0);
        }
        Composition composition0 = subcomposeLayoutState$NodeState0.getComposition();
        if(subcomposeLayoutState$NodeState0.getContent() != function20 || (composition0 == null ? true : composition0.getHasInvalidations())) {
            subcomposeLayoutState$NodeState0.setContent(function20);
            this.subcompose(layoutNode0, subcomposeLayoutState$NodeState0);
        }
    }

    public final List subcompose$ui_release(Object object0, Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "content");
        this.makeSureStateIsConsistent();
        LayoutState layoutNode$LayoutState0 = this.getRoot().getLayoutState$ui_release();
        if(layoutNode$LayoutState0 != LayoutState.Measuring && layoutNode$LayoutState0 != LayoutState.LayingOut) {
            throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks");
        }
        Map map0 = this.slotIdToNode;
        LayoutNode layoutNode0 = map0.get(object0);
        if(layoutNode0 == null) {
            layoutNode0 = (LayoutNode)this.precomposeMap.remove(object0);
            if(layoutNode0 == null) {
                layoutNode0 = this.reusableCount <= 0 ? this.createNodeAt(this.currentIndex) : this.takeNodeFromReusables(object0);
            }
            else {
                int v = this.precomposedCount;
                if(v <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                this.precomposedCount = v - 1;
            }
            map0.put(object0, layoutNode0);
        }
        int v1 = this.getRoot().getFoldedChildren$ui_release().indexOf(layoutNode0);
        int v2 = this.currentIndex;
        if(v1 < v2) {
            throw new IllegalArgumentException("Key " + object0 + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
        }
        if(v2 != v1) {
            SubcomposeLayoutState.move$default(this, v1, v2, 0, 4, null);
        }
        ++this.currentIndex;
        this.subcompose(layoutNode0, object0, function20);
        return layoutNode0.getChildren$ui_release();
    }

    private final Composition subcomposeInto(Composition composition0, LayoutNode layoutNode0, CompositionContext compositionContext0, Function2 function20) {
        if(composition0 == null || composition0.isDisposed()) {
            composition0 = Wrapper_androidKt.createSubcomposition(layoutNode0, compositionContext0);
        }
        composition0.setContent(function20);
        return composition0;
    }

    private final LayoutNode takeNodeFromReusables(Object object0) {
        if(this.reusableCount <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        int v = this.getRoot().getFoldedChildren$ui_release().size() - this.precomposedCount;
        int v1 = v - this.reusableCount;
        int v2;
        for(v2 = v1; true; ++v2) {
            LayoutNode layoutNode0 = (LayoutNode)this.getRoot().getFoldedChildren$ui_release().get(v2);
            NodeState subcomposeLayoutState$NodeState0 = (NodeState)MapsKt.getValue(this.nodeToNodeState, layoutNode0);
            if(Intrinsics.areEqual(subcomposeLayoutState$NodeState0.getSlotId(), object0)) {
                break;
            }
            if(v2 == v - 1) {
                subcomposeLayoutState$NodeState0.setSlotId(object0);
                break;
            }
        }
        if(v2 != v1) {
            this.move(v2, v1, 1);
        }
        --this.reusableCount;
        return (LayoutNode)this.getRoot().getFoldedChildren$ui_release().get(v1);
    }
}

