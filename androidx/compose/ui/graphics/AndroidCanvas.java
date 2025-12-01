package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas.VertexMode;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region.Op;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u00AC\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00A2\u0006\u0002\u0010\u0002J%\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0019H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ=\u0010\u001C\u001A\u00020\u00152\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u001E2\u0006\u0010 \u001A\u00020\u001E2\u0006\u0010!\u001A\u00020\u001E2\u0006\u0010\u0018\u001A\u00020\u0019H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\"\u0010#J\u001D\u0010$\u001A\u00020\u00152\u0006\u0010%\u001A\u00020&H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\'\u0010(J\b\u0010)\u001A\u00020\u0015H\u0016JH\u0010*\u001A\u00020\u00152\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u001E2\u0006\u0010 \u001A\u00020\u001E2\u0006\u0010!\u001A\u00020\u001E2\u0006\u0010+\u001A\u00020\u001E2\u0006\u0010,\u001A\u00020\u001E2\u0006\u0010-\u001A\u00020.2\u0006\u0010/\u001A\u000200H\u0016J-\u00101\u001A\u00020\u00152\u0006\u00102\u001A\u0002032\u0006\u00104\u001A\u00020\u001E2\u0006\u0010/\u001A\u000200H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b5\u00106J-\u00107\u001A\u00020\u00152\u0006\u00108\u001A\u0002092\u0006\u0010:\u001A\u0002032\u0006\u0010/\u001A\u000200H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b;\u0010<JE\u0010=\u001A\u00020\u00152\u0006\u00108\u001A\u0002092\u0006\u0010>\u001A\u00020?2\u0006\u0010@\u001A\u00020A2\u0006\u0010B\u001A\u00020?2\u0006\u0010C\u001A\u00020A2\u0006\u0010/\u001A\u000200H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bD\u0010EJ-\u0010F\u001A\u00020\u00152\u0006\u0010G\u001A\u0002032\u0006\u0010H\u001A\u0002032\u0006\u0010/\u001A\u000200H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bI\u0010JJ)\u0010K\u001A\u00020\u00152\f\u0010L\u001A\b\u0012\u0004\u0012\u0002030M2\u0006\u0010/\u001A\u0002002\u0006\u0010N\u001A\u00020OH\u0002\u00F8\u0001\u0000J0\u0010P\u001A\u00020\u00152\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u001E2\u0006\u0010 \u001A\u00020\u001E2\u0006\u0010!\u001A\u00020\u001E2\u0006\u0010/\u001A\u000200H\u0016J\u0018\u0010Q\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00172\u0006\u0010/\u001A\u000200H\u0016J3\u0010R\u001A\u00020\u00152\u0006\u0010S\u001A\u00020T2\f\u0010L\u001A\b\u0012\u0004\u0012\u0002030M2\u0006\u0010/\u001A\u000200H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bU\u0010VJ!\u0010R\u001A\u00020\u00152\f\u0010L\u001A\b\u0012\u0004\u0012\u0002030M2\u0006\u0010/\u001A\u000200H\u0002\u00F8\u0001\u0000J \u0010W\u001A\u00020\u00152\u0006\u0010L\u001A\u00020X2\u0006\u0010/\u001A\u0002002\u0006\u0010N\u001A\u00020OH\u0002J-\u0010Y\u001A\u00020\u00152\u0006\u0010S\u001A\u00020T2\u0006\u0010L\u001A\u00020X2\u0006\u0010/\u001A\u000200H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bZ\u0010[J \u0010Y\u001A\u00020\u00152\u0006\u0010L\u001A\u00020X2\u0006\u0010/\u001A\u0002002\u0006\u0010N\u001A\u00020OH\u0002J0\u0010\\\u001A\u00020\u00152\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u001E2\u0006\u0010 \u001A\u00020\u001E2\u0006\u0010!\u001A\u00020\u001E2\u0006\u0010/\u001A\u000200H\u0016J@\u0010]\u001A\u00020\u00152\u0006\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u001E2\u0006\u0010 \u001A\u00020\u001E2\u0006\u0010!\u001A\u00020\u001E2\u0006\u0010^\u001A\u00020\u001E2\u0006\u0010_\u001A\u00020\u001E2\u0006\u0010/\u001A\u000200H\u0016J-\u0010`\u001A\u00020\u00152\u0006\u0010a\u001A\u00020b2\u0006\u0010c\u001A\u00020d2\u0006\u0010/\u001A\u000200H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\be\u0010fJ\b\u0010g\u001A\u00020\u0015H\u0016J\b\u0010h\u001A\u00020\u0015H\u0016J\u0010\u0010i\u001A\u00020\u00152\u0006\u0010j\u001A\u00020\u001EH\u0016J\b\u0010k\u001A\u00020\u0015H\u0016J\u0018\u0010l\u001A\u00020\u00152\u0006\u0010m\u001A\u00020n2\u0006\u0010/\u001A\u000200H\u0016J\u0018\u0010o\u001A\u00020\u00152\u0006\u0010p\u001A\u00020\u001E2\u0006\u0010q\u001A\u00020\u001EH\u0016J\u0018\u0010r\u001A\u00020\u00152\u0006\u0010p\u001A\u00020\u001E2\u0006\u0010q\u001A\u00020\u001EH\u0016J\u0018\u0010s\u001A\u00020\u00152\u0006\u0010t\u001A\u00020\u001E2\u0006\u0010u\u001A\u00020\u001EH\u0016J\u0017\u0010v\u001A\u00020w*\u00020\u0019\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bx\u0010yR\u001B\u0010\u0003\u001A\u00020\u00048BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\u0005\u0010\u0006R(\u0010\t\u001A\u00060\nj\u0002`\u000B8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0002\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001B\u0010\u0011\u001A\u00020\u00048BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b\u0013\u0010\b\u001A\u0004\b\u0012\u0010\u0006\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006z"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "()V", "dstRect", "Landroid/graphics/Rect;", "getDstRect", "()Landroid/graphics/Rect;", "dstRect$delegate", "Lkotlin/Lazy;", "internalCanvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "getInternalCanvas$annotations", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "srcRect", "getSrcRect", "srcRect$delegate", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "concat", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "disableZ", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawCircle", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLines", "points", "", "stepBy", "", "drawOval", "drawPath", "drawPoints", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawRawLines", "", "drawRawPoints", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRect", "drawRoundRect", "radiusX", "radiusY", "drawVertices", "vertices", "Landroidx/compose/ui/graphics/Vertices;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "enableZ", "restore", "rotate", "degrees", "save", "saveLayer", "bounds", "Landroidx/compose/ui/geometry/Rect;", "scale", "sx", "sy", "skew", "translate", "dx", "dy", "toRegionOp", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidCanvas implements Canvas {
    private final Lazy dstRect$delegate;
    private android.graphics.Canvas internalCanvas;
    private final Lazy srcRect$delegate;

    static {
    }

    public AndroidCanvas() {
        this.internalCanvas = AndroidCanvas_androidKt.EmptyCanvas;
        this.srcRect$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, androidx.compose.ui.graphics.AndroidCanvas.srcRect.2.INSTANCE);
        this.dstRect$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, androidx.compose.ui.graphics.AndroidCanvas.dstRect.2.INSTANCE);

        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Rect;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.graphics.AndroidCanvas.dstRect.2 extends Lambda implements Function0 {
            public static final androidx.compose.ui.graphics.AndroidCanvas.dstRect.2 INSTANCE;

            static {
                androidx.compose.ui.graphics.AndroidCanvas.dstRect.2.INSTANCE = new androidx.compose.ui.graphics.AndroidCanvas.dstRect.2();
            }

            androidx.compose.ui.graphics.AndroidCanvas.dstRect.2() {
                super(0);
            }

            public final Rect invoke() {
                return new Rect();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }


        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroid/graphics/Rect;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.graphics.AndroidCanvas.srcRect.2 extends Lambda implements Function0 {
            public static final androidx.compose.ui.graphics.AndroidCanvas.srcRect.2 INSTANCE;

            static {
                androidx.compose.ui.graphics.AndroidCanvas.srcRect.2.INSTANCE = new androidx.compose.ui.graphics.AndroidCanvas.srcRect.2();
            }

            androidx.compose.ui.graphics.AndroidCanvas.srcRect.2() {
                super(0);
            }

            public final Rect invoke() {
                return new Rect();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }

    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void clipPath-mtrdD-E(Path path0, int v) {
        Intrinsics.checkNotNullParameter(path0, "path");
        android.graphics.Canvas canvas0 = this.internalCanvas;
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas0.clipPath(((AndroidPath)path0).getInternalPath(), this.toRegionOp--7u2Bmg(v));
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void clipRect-N_I0leg(float f, float f1, float f2, float f3, int v) {
        this.internalCanvas.clipRect(f, f1, f2, f3, this.toRegionOp--7u2Bmg(v));
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void clipRect-mtrdD-E(androidx.compose.ui.geometry.Rect rect0, int v) {
        DefaultImpls.clipRect-mtrdD-E(this, rect0, v);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void concat-58bKbWc(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "matrix");
        if(!MatrixKt.isIdentity-58bKbWc(arr_f)) {
            Matrix matrix0 = new Matrix();
            AndroidMatrixConversions_androidKt.setFrom-EL8BTi8(matrix0, arr_f);
            this.internalCanvas.concat(matrix0);
        }
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f, float f1, float f2, float f3, float f4, float f5, boolean z, Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "paint");
        this.internalCanvas.drawArc(f, f1, f2, f3, f4, f5, z, paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawArc(androidx.compose.ui.geometry.Rect rect0, float f, float f1, boolean z, Paint paint0) {
        DefaultImpls.drawArc(this, rect0, f, f1, z, paint0);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawArcRad(androidx.compose.ui.geometry.Rect rect0, float f, float f1, boolean z, Paint paint0) {
        DefaultImpls.drawArcRad(this, rect0, f, f1, z, paint0);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawCircle-9KIMszo(long v, float f, Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "paint");
        this.internalCanvas.drawCircle(Offset.getX-impl(v), Offset.getY-impl(v), f, paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawImage-d-4ec7I(ImageBitmap imageBitmap0, long v, Paint paint0) {
        Intrinsics.checkNotNullParameter(imageBitmap0, "image");
        Intrinsics.checkNotNullParameter(paint0, "paint");
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap0), Offset.getX-impl(v), Offset.getY-impl(v), paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawImageRect-HPBpro0(ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, Paint paint0) {
        Intrinsics.checkNotNullParameter(imageBitmap0, "image");
        Intrinsics.checkNotNullParameter(paint0, "paint");
        android.graphics.Canvas canvas0 = this.internalCanvas;
        Bitmap bitmap0 = AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap0);
        Rect rect0 = this.getSrcRect();
        rect0.left = (int)(v >> 0x20);
        rect0.top = (int)(v & 0xFFFFFFFFL);
        rect0.right = ((int)(v >> 0x20)) + ((int)(v1 >> 0x20));
        rect0.bottom = ((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL));
        Rect rect1 = this.getDstRect();
        rect1.left = (int)(v2 >> 0x20);
        rect1.top = (int)(v2 & 0xFFFFFFFFL);
        rect1.right = ((int)(v2 >> 0x20)) + ((int)(v3 >> 0x20));
        rect1.bottom = ((int)(v2 & 0xFFFFFFFFL)) + ((int)(v3 & 0xFFFFFFFFL));
        canvas0.drawBitmap(bitmap0, rect0, rect1, paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawLine-Wko1d7g(long v, long v1, Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "paint");
        this.internalCanvas.drawLine(Offset.getX-impl(v), Offset.getY-impl(v), Offset.getX-impl(v1), Offset.getY-impl(v1), paint0.asFrameworkPaint());
    }

    private final void drawLines(List list0, Paint paint0, int v) {
        if(list0.size() >= 2) {
            IntProgression intProgression0 = RangesKt.step(RangesKt.until(0, list0.size() - 1), v);
            int v1 = intProgression0.getFirst();
            int v2 = intProgression0.getLast();
            int v3 = intProgression0.getStep();
            if(v3 > 0 && v1 <= v2 || v3 < 0 && v2 <= v1) {
                while(true) {
                    long v4 = ((Offset)list0.get(v1)).unbox-impl();
                    long v5 = ((Offset)list0.get(v1 + 1)).unbox-impl();
                    this.internalCanvas.drawLine(Offset.getX-impl(v4), Offset.getY-impl(v4), Offset.getX-impl(v5), Offset.getY-impl(v5), paint0.asFrameworkPaint());
                    if(v1 == v2) {
                        break;
                    }
                    v1 += v3;
                }
            }
        }
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f, float f1, float f2, float f3, Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "paint");
        this.internalCanvas.drawOval(f, f1, f2, f3, paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawOval(androidx.compose.ui.geometry.Rect rect0, Paint paint0) {
        DefaultImpls.drawOval(this, rect0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawPath(Path path0, Paint paint0) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(paint0, "paint");
        android.graphics.Canvas canvas0 = this.internalCanvas;
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas0.drawPath(((AndroidPath)path0).getInternalPath(), paint0.asFrameworkPaint());
    }

    private final void drawPoints(List list0, Paint paint0) {
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                long v2 = ((Offset)list0.get(v1)).unbox-impl();
                this.getInternalCanvas().drawPoint(Offset.getX-impl(v2), Offset.getY-impl(v2), paint0.asFrameworkPaint());
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawPoints-O7TthRY(int v, List list0, Paint paint0) {
        Intrinsics.checkNotNullParameter(list0, "points");
        Intrinsics.checkNotNullParameter(paint0, "paint");
        if(PointMode.equals-impl0(v, 1)) {
            this.drawLines(list0, paint0, 2);
            return;
        }
        if(PointMode.equals-impl0(v, 2)) {
            this.drawLines(list0, paint0, 1);
            return;
        }
        if(PointMode.equals-impl0(v, 0)) {
            this.drawPoints(list0, paint0);
        }
    }

    private final void drawRawLines(float[] arr_f, Paint paint0, int v) {
        if(arr_f.length >= 4 && arr_f.length % 2 == 0) {
            IntProgression intProgression0 = RangesKt.step(RangesKt.until(0, arr_f.length - 3), v * 2);
            int v1 = intProgression0.getFirst();
            int v2 = intProgression0.getLast();
            int v3 = intProgression0.getStep();
            if(v3 > 0 && v1 <= v2 || v3 < 0 && v2 <= v1) {
                while(true) {
                    this.internalCanvas.drawLine(arr_f[v1], arr_f[v1 + 1], arr_f[v1 + 2], arr_f[v1 + 3], paint0.asFrameworkPaint());
                    if(v1 == v2) {
                        break;
                    }
                    v1 += v3;
                }
            }
        }
    }

    private final void drawRawPoints(float[] arr_f, Paint paint0, int v) {
        if(arr_f.length % 2 == 0) {
            IntProgression intProgression0 = RangesKt.step(RangesKt.until(0, arr_f.length - 1), v);
            int v1 = intProgression0.getFirst();
            int v2 = intProgression0.getLast();
            int v3 = intProgression0.getStep();
            if(v3 > 0 && v1 <= v2 || v3 < 0 && v2 <= v1) {
                while(true) {
                    this.internalCanvas.drawPoint(arr_f[v1], arr_f[v1 + 1], paint0.asFrameworkPaint());
                    if(v1 == v2) {
                        break;
                    }
                    v1 += v3;
                }
            }
        }
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawRawPoints-O7TthRY(int v, float[] arr_f, Paint paint0) {
        Intrinsics.checkNotNullParameter(arr_f, "points");
        Intrinsics.checkNotNullParameter(paint0, "paint");
        if(arr_f.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        if(PointMode.equals-impl0(v, 1)) {
            this.drawRawLines(arr_f, paint0, 2);
            return;
        }
        if(PointMode.equals-impl0(v, 2)) {
            this.drawRawLines(arr_f, paint0, 1);
            return;
        }
        if(PointMode.equals-impl0(v, 0)) {
            this.drawRawPoints(arr_f, paint0, 2);
        }
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f, float f1, float f2, float f3, Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "paint");
        this.internalCanvas.drawRect(f, f1, f2, f3, paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawRect(androidx.compose.ui.geometry.Rect rect0, Paint paint0) {
        DefaultImpls.drawRect(this, rect0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f, float f1, float f2, float f3, float f4, float f5, Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "paint");
        this.internalCanvas.drawRoundRect(f, f1, f2, f3, f4, f5, paint0.asFrameworkPaint());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawVertices-TPEHhCM(Vertices vertices0, int v, Paint paint0) {
        Intrinsics.checkNotNullParameter(vertices0, "vertices");
        Intrinsics.checkNotNullParameter(paint0, "paint");
        android.graphics.Canvas canvas0 = this.internalCanvas;
        Canvas.VertexMode canvas$VertexMode0 = AndroidVertexMode_androidKt.toAndroidVertexMode-JOOmi9M(vertices0.getVertexMode-c2xauaI());
        android.graphics.Paint paint1 = paint0.asFrameworkPaint();
        canvas0.drawVertices(canvas$VertexMode0, vertices0.getPositions().length, vertices0.getPositions(), 0, vertices0.getTextureCoordinates(), 0, vertices0.getColors(), 0, vertices0.getIndices(), 0, vertices0.getIndices().length, paint1);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    private final Rect getDstRect() {
        return (Rect)this.dstRect$delegate.getValue();
    }

    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    public static void getInternalCanvas$annotations() {
    }

    private final Rect getSrcRect() {
        return (Rect)this.srcRect$delegate.getValue();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void rotate(float f) {
        this.internalCanvas.rotate(f);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void saveLayer(androidx.compose.ui.geometry.Rect rect0, Paint paint0) {
        Intrinsics.checkNotNullParameter(rect0, "bounds");
        Intrinsics.checkNotNullParameter(paint0, "paint");
        this.internalCanvas.saveLayer(rect0.getLeft(), rect0.getTop(), rect0.getRight(), rect0.getBottom(), paint0.asFrameworkPaint(), 0x1F);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void scale(float f, float f1) {
        this.internalCanvas.scale(f, f1);
    }

    public final void setInternalCanvas(android.graphics.Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "<set-?>");
        this.internalCanvas = canvas0;
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void skew(float f, float f1) {
        this.internalCanvas.skew(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void skewRad(float f, float f1) {
        DefaultImpls.skewRad(this, f, f1);
    }

    // 去混淆评级： 低(40)
    public final Region.Op toRegionOp--7u2Bmg(int v) {
        return ClipOp.equals-impl0(v, 0) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void translate(float f, float f1) {
        this.internalCanvas.translate(f, f1);
    }
}

