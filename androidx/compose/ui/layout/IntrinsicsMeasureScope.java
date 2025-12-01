package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001A\u0010\u000E\u001A\u00020\u000F*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u000E\u001A\u00020\u000F*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0016\u001A\u00020\u0010*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001D\u0010\u0016\u001A\u00020\u0010*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u001D\u0010\u0016\u001A\u00020\u0010*\u00020\u000FH\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001BJ\u001A\u0010\u001C\u001A\u00020\u0007*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001D\u0010\u001AJ\u001A\u0010\u001C\u001A\u00020\u0007*\u00020\u0013H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001E\u0010\u0018J\r\u0010\u001F\u001A\u00020 *\u00020!H\u0097\u0001J\u001A\u0010\"\u001A\u00020\u0013*\u00020\u0010H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u001D\u0010\"\u001A\u00020\u0013*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b%\u0010$J\u001D\u0010\"\u001A\u00020\u0013*\u00020\u000FH\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001A\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0014\u0010\n\u001A\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001A\u0004\b\u000B\u0010\tR\u0014\u0010\u0004\u001A\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\r\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\'"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicsMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/unit/Density;", "density", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)V", "", "getDensity", "()F", "fontScale", "getFontScale", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class IntrinsicsMeasureScope implements MeasureScope, Density {
    private final Density $$delegate_0;
    private final LayoutDirection layoutDirection;

    public IntrinsicsMeasureScope(Density density0, LayoutDirection layoutDirection0) {
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        super();
        this.layoutDirection = layoutDirection0;
        this.$$delegate_0 = density0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
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
        return this.$$delegate_0.roundToPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx-0680j_4(float f) {
        return this.$$delegate_0.roundToPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-GaN1DYA(long v) {
        return this.$$delegate_0.toDp-GaN1DYA(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(float f) {
        return this.$$delegate_0.toDp-u2uoSUM(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(int v) {
        return this.$$delegate_0.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toPx--R2X_6o(long v) {
        return this.$$delegate_0.toPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toPx-0680j_4(float f) {
        return this.$$delegate_0.toPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect0) {
        Intrinsics.checkNotNullParameter(dpRect0, "<this>");
        return this.$$delegate_0.toRect(dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-0xMU5do(float f) {
        return this.$$delegate_0.toSp-0xMU5do(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(float f) {
        return this.$$delegate_0.toSp-kPz2Gy4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(int v) {
        return this.$$delegate_0.toSp-kPz2Gy4(v);
    }
}

