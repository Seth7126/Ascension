package androidx.compose.ui.node;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.DrawCacheModifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001!B\u0015\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001A\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001BH\u0014J\u0010\u0010\u001D\u001A\u00020\u00182\u0006\u0010\u001E\u001A\u00020\u001FH\u0014J\n\u0010 \u001A\u0004\u0018\u00010\u000BH\u0002R\u000E\u0010\b\u001A\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001A\u0004\u0018\u00010\u000BX\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\f\u001A\u00020\rX\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u000E\u001A\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR$\u0010\u0011\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00028V@VX\u0096\u000E¢\u0006\f\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/compose/ui/node/ModifiedDrawNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/node/OwnerScope;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "drawModifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/draw/DrawModifier;)V", "buildCacheParams", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "cacheDrawModifier", "Landroidx/compose/ui/draw/DrawCacheModifier;", "invalidateCache", "", "isValid", "()Z", "value", "modifier", "getModifier", "()Landroidx/compose/ui/draw/DrawModifier;", "setModifier", "(Landroidx/compose/ui/draw/DrawModifier;)V", "updateCache", "Lkotlin/Function0;", "", "onMeasureResultChanged", "width", "", "height", "performDraw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "updateCacheDrawModifier", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ModifiedDrawNode extends DelegatingLayoutNodeWrapper implements OwnerScope {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001A\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/ModifiedDrawNode$Companion;", "", "()V", "onCommitAffectingModifiedDrawNode", "Lkotlin/Function1;", "Landroidx/compose/ui/node/ModifiedDrawNode;", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final Companion Companion;
    private final BuildDrawCacheParams buildCacheParams;
    private DrawCacheModifier cacheDrawModifier;
    private boolean invalidateCache;
    private static final Function1 onCommitAffectingModifiedDrawNode;
    private final Function0 updateCache;

    static {
        ModifiedDrawNode.Companion = new Companion(null);
        ModifiedDrawNode.onCommitAffectingModifiedDrawNode = ModifiedDrawNode.Companion.onCommitAffectingModifiedDrawNode.1.INSTANCE;
    }

    public ModifiedDrawNode(LayoutNodeWrapper layoutNodeWrapper0, DrawModifier drawModifier0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "wrapped");
        Intrinsics.checkNotNullParameter(drawModifier0, "drawModifier");
        super(layoutNodeWrapper0, drawModifier0);
        this.cacheDrawModifier = this.updateCacheDrawModifier();
        this.buildCacheParams = new BuildDrawCacheParams() {
            private final Density density;

            {
                this.density = modifiedDrawNode0.getLayoutNode$ui_release().getDensity();
            }

            @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
            public Density getDensity() {
                return this.density;
            }

            @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
            public LayoutDirection getLayoutDirection() {
                return ModifiedDrawNode.this.getLayoutNode$ui_release().getLayoutDirection();
            }

            @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
            public long getSize-NH-jbRc() {
                return IntSizeKt.toSize-ozmzZPI(ModifiedDrawNode.this.getMeasuredSize-YbymL2g());
            }
        };
        this.invalidateCache = true;
        this.updateCache = new Function0() {
            {
                ModifiedDrawNode.this = modifiedDrawNode0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                DrawCacheModifier drawCacheModifier0 = ModifiedDrawNode.this.cacheDrawModifier;
                if(drawCacheModifier0 != null) {
                    drawCacheModifier0.onBuildCache(ModifiedDrawNode.this.buildCacheParams);
                }
                ModifiedDrawNode.this.invalidateCache = false;
            }
        };
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public Element getModifier() {
        return this.getModifier();
    }

    public DrawModifier getModifier() {
        return (DrawModifier)super.getModifier();
    }

    @Override  // androidx.compose.ui.node.OwnerScope, androidx.compose.ui.node.LayoutNodeWrapper
    public boolean isValid() {
        return this.isAttached();
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    protected void onMeasureResultChanged(int v, int v1) {
        super.onMeasureResultChanged(v, v1);
        this.invalidateCache = true;
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    protected void performDraw(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        long v = IntSizeKt.toSize-ozmzZPI(this.getMeasuredSize-YbymL2g());
        if(this.cacheDrawModifier != null && this.invalidateCache) {
            LayoutNodeKt.requireOwner(this.getLayoutNode$ui_release()).getSnapshotObserver().observeReads$ui_release(this, ModifiedDrawNode.onCommitAffectingModifiedDrawNode, this.updateCache);
        }
        LayoutNodeDrawScope layoutNodeDrawScope0 = this.getLayoutNode$ui_release().getMDrawScope$ui_release();
        LayoutNodeWrapper layoutNodeWrapper0 = this.getWrapped$ui_release();
        layoutNodeDrawScope0.wrapped = layoutNodeWrapper0;
        CanvasDrawScope canvasDrawScope0 = layoutNodeDrawScope0.canvasDrawScope;
        Density density0 = layoutNodeWrapper0.getMeasureScope();
        LayoutDirection layoutDirection0 = layoutNodeWrapper0.getMeasureScope().getLayoutDirection();
        DrawParams canvasDrawScope$DrawParams0 = canvasDrawScope0.getDrawParams();
        DrawParams canvasDrawScope$DrawParams1 = canvasDrawScope0.getDrawParams();
        canvasDrawScope$DrawParams1.setDensity(density0);
        canvasDrawScope$DrawParams1.setLayoutDirection(layoutDirection0);
        canvasDrawScope$DrawParams1.setCanvas(canvas0);
        canvasDrawScope$DrawParams1.setSize-uvyYCjk(v);
        canvas0.save();
        this.getModifier().draw(layoutNodeDrawScope0);
        canvas0.restore();
        DrawParams canvasDrawScope$DrawParams2 = canvasDrawScope0.getDrawParams();
        canvasDrawScope$DrawParams2.setDensity(canvasDrawScope$DrawParams0.component1());
        canvasDrawScope$DrawParams2.setLayoutDirection(canvasDrawScope$DrawParams0.component2());
        canvasDrawScope$DrawParams2.setCanvas(canvasDrawScope$DrawParams0.component3());
        canvasDrawScope$DrawParams2.setSize-uvyYCjk(canvasDrawScope$DrawParams0.component4-NH-jbRc());
        layoutNodeDrawScope0.wrapped = layoutNodeDrawScope0.wrapped;
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public void setModifier(Element modifier$Element0) {
        this.setModifier(((DrawModifier)modifier$Element0));
    }

    public void setModifier(DrawModifier drawModifier0) {
        Intrinsics.checkNotNullParameter(drawModifier0, "value");
        super.setModifier(drawModifier0);
        this.cacheDrawModifier = this.updateCacheDrawModifier();
        this.invalidateCache = true;
    }

    private final DrawCacheModifier updateCacheDrawModifier() {
        DrawModifier drawModifier0 = this.getModifier();
        return drawModifier0 instanceof DrawCacheModifier ? ((DrawCacheModifier)drawModifier0) : null;
    }
}

