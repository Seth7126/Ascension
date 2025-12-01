package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build.VERSION;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline.Rounded;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004J\u001B\u0010\"\u001A\u00020\u00062\u0006\u0010#\u001A\u00020$\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b%\u0010&J\u001B\u0010\'\u001A\u00020(2\u0006\u0010\u001A\u001A\u00020\u001B\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b)\u0010*J6\u0010\'\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u00192\u0006\u0010+\u001A\u00020,2\u0006\u0010-\u001A\u00020\u00062\u0006\u0010.\u001A\u00020,2\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0002\u001A\u00020\u0003J\b\u0010/\u001A\u00020(H\u0002J\u0010\u00100\u001A\u00020(2\u0006\u00101\u001A\u00020\nH\u0002J\u0010\u00102\u001A\u00020(2\u0006\u00103\u001A\u000204H\u0002J\u0010\u00105\u001A\u00020(2\u0006\u00106\u001A\u000207H\u0002R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\bX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0010\u0010\t\u001A\u0004\u0018\u00010\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u000B\u001A\u0004\u0018\u00010\fX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0013\u0010\r\u001A\u0004\u0018\u00010\n8F\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0010\u001A\u00020\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0011\u001A\u00020\u0012X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0013\u0010\u0013\u001A\u0004\u0018\u00010\b8F\u00A2\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R\u000E\u0010\u0016\u001A\u00020\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001A\u0004\u0018\u00010\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0018\u001A\u00020\u0019X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0019\u0010\u001A\u001A\u00020\u001BX\u0082\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010\u001CR\u0012\u0010\u001D\u001A\u0004\u0018\u00010\nX\u0082\u000E\u00A2\u0006\u0004\n\u0002\b\u001ER\u0012\u0010\u001F\u001A\u0004\u0018\u00010\nX\u0082\u000E\u00A2\u0006\u0004\n\u0002\b R\u000E\u0010!\u001A\u00020\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00069"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "cacheIsDirty", "", "cachedOutline", "Landroid/graphics/Outline;", "cachedRrectPath", "Landroidx/compose/ui/graphics/Path;", "calculatedOutline", "Landroidx/compose/ui/graphics/Outline;", "clipPath", "getClipPath", "()Landroidx/compose/ui/graphics/Path;", "isSupportedOutline", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outline", "getOutline", "()Landroid/graphics/Outline;", "outlineNeeded", "outlinePath", "shape", "Landroidx/compose/ui/graphics/Shape;", "size", "Landroidx/compose/ui/geometry/Size;", "J", "tmpOpPath", "tmpOpPath$1", "tmpTouchPointPath", "tmpTouchPointPath$1", "usePathForClip", "isInOutline", "position", "Landroidx/compose/ui/geometry/Offset;", "isInOutline-k-4lQ0M", "(J)Z", "update", "", "update-uvyYCjk", "(J)V", "alpha", "", "clipToOutline", "elevation", "updateCache", "updateCacheWithPath", "composePath", "updateCacheWithRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "updateCacheWithRoundRect", "roundRect", "Landroidx/compose/ui/geometry/RoundRect;", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class OutlineResolver {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver$Companion;", "", "()V", "tmpOpPath", "Landroidx/compose/ui/graphics/Path;", "tmpTouchPointPath", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final Companion Companion;
    private boolean cacheIsDirty;
    private final Outline cachedOutline;
    private Path cachedRrectPath;
    private androidx.compose.ui.graphics.Outline calculatedOutline;
    private Density density;
    private boolean isSupportedOutline;
    private LayoutDirection layoutDirection;
    private boolean outlineNeeded;
    private Path outlinePath;
    private Shape shape;
    private long size;
    private static final Path tmpOpPath;
    private Path tmpOpPath$1;
    private static final Path tmpTouchPointPath;
    private Path tmpTouchPointPath$1;
    private boolean usePathForClip;

    static {
        OutlineResolver.Companion = new Companion(null);
        OutlineResolver.tmpOpPath = AndroidPath_androidKt.Path();
        OutlineResolver.tmpTouchPointPath = AndroidPath_androidKt.Path();
    }

    public OutlineResolver(Density density0) {
        Intrinsics.checkNotNullParameter(density0, "density");
        super();
        this.density = density0;
        this.isSupportedOutline = true;
        Outline outline0 = new Outline();
        outline0.setAlpha(1.0f);
        this.cachedOutline = outline0;
        this.size = 0L;
        this.shape = RectangleShapeKt.getRectangleShape();
        this.layoutDirection = LayoutDirection.Ltr;
    }

    public final Path getClipPath() {
        this.updateCache();
        return this.usePathForClip ? this.outlinePath : null;
    }

    public final Outline getOutline() {
        this.updateCache();
        return !this.outlineNeeded || !this.isSupportedOutline ? null : this.cachedOutline;
    }

    public final boolean isInOutline-k-4lQ0M(long v) {
        if(!this.outlineNeeded) {
            return true;
        }
        return this.calculatedOutline == null ? true : ShapeContainingUtilKt.isInOutline(this.calculatedOutline, Offset.getX-impl(v), Offset.getY-impl(v), this.tmpTouchPointPath$1, this.tmpOpPath$1);
    }

    public final boolean update(Shape shape0, float f, boolean z, float f1, LayoutDirection layoutDirection0, Density density0) {
        Intrinsics.checkNotNullParameter(shape0, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        Intrinsics.checkNotNullParameter(density0, "density");
        this.cachedOutline.setAlpha(f);
        boolean z1 = Intrinsics.areEqual(this.shape, shape0);
        if(!z1) {
            this.shape = shape0;
            this.cacheIsDirty = true;
        }
        boolean z2 = z || f1 > 0.0f;
        if(this.outlineNeeded != z2) {
            this.outlineNeeded = z2;
            this.cacheIsDirty = true;
        }
        if(this.layoutDirection != layoutDirection0) {
            this.layoutDirection = layoutDirection0;
            this.cacheIsDirty = true;
        }
        if(!Intrinsics.areEqual(this.density, density0)) {
            this.density = density0;
            this.cacheIsDirty = true;
        }
        return !z1;
    }

    public final void update-uvyYCjk(long v) {
        if(!Size.equals-impl0(this.size, v)) {
            this.size = v;
            this.cacheIsDirty = true;
        }
    }

    private final void updateCache() {
        if(this.cacheIsDirty) {
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            if(!this.outlineNeeded || Size.getWidth-impl(this.size) <= 0.0f || Size.getHeight-impl(this.size) <= 0.0f) {
                this.cachedOutline.setEmpty();
            }
            else {
                this.isSupportedOutline = true;
                androidx.compose.ui.graphics.Outline outline0 = this.shape.createOutline-Pq9zytI(this.size, this.layoutDirection, this.density);
                this.calculatedOutline = outline0;
                if(outline0 instanceof Rectangle) {
                    this.updateCacheWithRect(((Rectangle)outline0).getRect());
                    return;
                }
                if(outline0 instanceof Rounded) {
                    this.updateCacheWithRoundRect(((Rounded)outline0).getRoundRect());
                    return;
                }
                if(outline0 instanceof Generic) {
                    this.updateCacheWithPath(((Generic)outline0).getPath());
                }
            }
        }
    }

    private final void updateCacheWithPath(Path path0) {
        if(Build.VERSION.SDK_INT <= 28 && !path0.isConvex()) {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        else {
            Outline outline0 = this.cachedOutline;
            if(!(path0 instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline0.setConvexPath(((AndroidPath)path0).getInternalPath());
            this.usePathForClip = !this.cachedOutline.canClip();
        }
        this.outlinePath = path0;
    }

    private final void updateCacheWithRect(Rect rect0) {
        int v = MathKt.roundToInt(rect0.getLeft());
        int v1 = MathKt.roundToInt(rect0.getTop());
        int v2 = MathKt.roundToInt(rect0.getRight());
        int v3 = MathKt.roundToInt(rect0.getBottom());
        this.cachedOutline.setRect(v, v1, v2, v3);
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect0) {
        float f = CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs());
        if(RoundRectKt.isSimple(roundRect0)) {
            int v = MathKt.roundToInt(roundRect0.getLeft());
            int v1 = MathKt.roundToInt(roundRect0.getTop());
            int v2 = MathKt.roundToInt(roundRect0.getRight());
            int v3 = MathKt.roundToInt(roundRect0.getBottom());
            this.cachedOutline.setRoundRect(v, v1, v2, v3, f);
            return;
        }
        Path path0 = this.cachedRrectPath;
        if(path0 == null) {
            path0 = AndroidPath_androidKt.Path();
            this.cachedRrectPath = path0;
        }
        path0.reset();
        path0.addRoundRect(roundRect0);
        this.updateCacheWithPath(path0);
    }
}

