package androidx.compose.ui.draw;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.unit.Density.DefaultImpls;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u001F\u0010\u001D\u001A\u00020\u000E2\u0017\u0010\u001E\u001A\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001F¢\u0006\u0002\b\"J\u001F\u0010#\u001A\u00020\u000E2\u0017\u0010\u001E\u001A\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!0\u001F¢\u0006\u0002\b\"R\u001A\u0010\u0003\u001A\u00020\u0004X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001A\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u001C\u0010\r\u001A\u0004\u0018\u00010\u000EX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001A\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001A\u00020\u00168F¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018R\u001A\u0010\u0019\u001A\u00020\u001A8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001C\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/unit/Density;", "()V", "cacheParams", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "getCacheParams$ui_release", "()Landroidx/compose/ui/draw/BuildDrawCacheParams;", "setCacheParams$ui_release", "(Landroidx/compose/ui/draw/BuildDrawCacheParams;)V", "density", "", "getDensity", "()F", "drawResult", "Landroidx/compose/ui/draw/DrawResult;", "getDrawResult$ui_release", "()Landroidx/compose/ui/draw/DrawResult;", "setDrawResult$ui_release", "(Landroidx/compose/ui/draw/DrawResult;)V", "fontScale", "getFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "onDrawBehind", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "onDrawWithContent", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class CacheDrawScope implements Density {
    public static final int $stable;
    private BuildDrawCacheParams cacheParams;
    private DrawResult drawResult;

    static {
    }

    public CacheDrawScope() {
        this.cacheParams = EmptyBuildDrawCacheParams.INSTANCE;
    }

    public final BuildDrawCacheParams getCacheParams$ui_release() {
        return this.cacheParams;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    public final DrawResult getDrawResult$ui_release() {
        return this.drawResult;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    public final long getSize-NH-jbRc() {
        return this.cacheParams.getSize-NH-jbRc();
    }

    public final DrawResult onDrawBehind(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        return this.onDrawWithContent(new Function1() {
            final Function1 $block;

            {
                this.$block = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((ContentDrawScope)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(ContentDrawScope contentDrawScope0) {
                Intrinsics.checkNotNullParameter(contentDrawScope0, "$this$onDrawWithContent");
                this.$block.invoke(contentDrawScope0);
                contentDrawScope0.drawContent();
            }
        });
    }

    public final DrawResult onDrawWithContent(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        DrawResult drawResult0 = new DrawResult(function10);
        this.setDrawResult$ui_release(drawResult0);
        return drawResult0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx--R2X_6o(long v) {
        return DefaultImpls.roundToPx--R2X_6o(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx-0680j_4(float f) {
        return DefaultImpls.roundToPx-0680j_4(this, f);
    }

    public final void setCacheParams$ui_release(BuildDrawCacheParams buildDrawCacheParams0) {
        Intrinsics.checkNotNullParameter(buildDrawCacheParams0, "<set-?>");
        this.cacheParams = buildDrawCacheParams0;
    }

    public final void setDrawResult$ui_release(DrawResult drawResult0) {
        this.drawResult = drawResult0;
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

