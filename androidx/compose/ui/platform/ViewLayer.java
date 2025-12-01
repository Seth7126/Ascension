package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas.DefaultImpls;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u00B8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 v2\u00020\u00012\u00020\u0002:\u0002vwB7\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\f\u00A2\u0006\u0002\u0010\rJ\b\u0010;\u001A\u00020\nH\u0016J\u0010\u0010<\u001A\u00020\n2\u0006\u0010=\u001A\u00020>H\u0014J\u0010\u0010?\u001A\u00020\n2\u0006\u0010=\u001A\u00020\tH\u0016J\b\u0010@\u001A\u00020\nH\u0016J\b\u0010A\u001A\u00020\nH\u0016J\u001D\u0010B\u001A\u00020\u001A2\u0006\u0010C\u001A\u00020DH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bE\u0010FJ\u0018\u0010G\u001A\u00020\n2\u0006\u0010H\u001A\u00020I2\u0006\u0010J\u001A\u00020\u001AH\u0016J%\u0010K\u001A\u00020D2\u0006\u0010L\u001A\u00020D2\u0006\u0010J\u001A\u00020\u001AH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bM\u0010NJ\u001D\u0010O\u001A\u00020\n2\u0006\u0010C\u001A\u00020PH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bQ\u0010RJ0\u0010S\u001A\u00020\n2\u0006\u0010T\u001A\u00020\u001A2\u0006\u0010U\u001A\u00020V2\u0006\u0010W\u001A\u00020V2\u0006\u0010X\u001A\u00020V2\u0006\u0010Y\u001A\u00020VH\u0014J\b\u0010Z\u001A\u00020\nH\u0002J\u001D\u0010[\u001A\u00020\n2\u0006\u0010\\\u001A\u00020]H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b^\u0010RJ\b\u0010_\u001A\u00020\nH\u0016J\u008D\u0001\u0010`\u001A\u00020\n2\u0006\u0010a\u001A\u00020\u000F2\u0006\u0010b\u001A\u00020\u000F2\u0006\u0010c\u001A\u00020\u000F2\u0006\u0010d\u001A\u00020\u000F2\u0006\u0010e\u001A\u00020\u000F2\u0006\u0010f\u001A\u00020\u000F2\u0006\u0010g\u001A\u00020\u000F2\u0006\u0010h\u001A\u00020\u000F2\u0006\u0010i\u001A\u00020\u000F2\u0006\u0010j\u001A\u00020\u000F2\u0006\u0010k\u001A\u00020+2\u0006\u0010l\u001A\u00020m2\u0006\u0010n\u001A\u00020\u001A2\u0006\u0010o\u001A\u00020p2\u0006\u0010q\u001A\u00020rH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bs\u0010tJ\b\u0010u\u001A\u00020\nH\u0002R$\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\u000F8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000E\u0010\u0015\u001A\u00020\u0016X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001A\u0004\u0018\u00010\u0018X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0019\u001A\u00020\u001AX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u001CR\u001D\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001D\u0010\u001ER\u000E\u0010\u001F\u001A\u00020\u001AX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0017\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\f\u00A2\u0006\b\n\u0000\u001A\u0004\b \u0010!R$\u0010\"\u001A\u00020\u001A2\u0006\u0010\u000E\u001A\u00020\u001A@BX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010&\u001A\u00020\'8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b(\u0010)R\u0019\u0010*\u001A\u00020+X\u0082\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010,R\u0016\u0010-\u001A\u0004\u0018\u00010.8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b/\u00100R\u000E\u00101\u001A\u000202X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u00103\u001A\u000204X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b5\u00106R\u001A\u00107\u001A\u00020\'8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\b8\u00109\u001A\u0004\b:\u0010)\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006x"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "container", "Landroidx/compose/ui/platform/DrawChildContainer;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "invalidateParentLayer", "Lkotlin/Function0;", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "value", "", "cameraDistancePx", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipBoundsCache", "Landroid/graphics/Rect;", "clipToBounds", "", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "getDrawBlock", "()Lkotlin/jvm/functions/Function1;", "drawnWithZ", "getInvalidateParentLayer", "()Lkotlin/jvm/functions/Function0;", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "layerId", "", "getLayerId", "()J", "mTransformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "manualClipPath", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "matrixCache", "Landroidx/compose/ui/platform/ViewLayerMatrixCache;", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerViewId", "getOwnerViewId$annotations", "()V", "getOwnerViewId", "destroy", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "drawLayer", "forceLayout", "invalidate", "isInLayer", "position", "Landroidx/compose/ui/geometry/Offset;", "isInLayer-k-4lQ0M", "(J)Z", "mapBounds", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "inverse", "mapOffset", "point", "mapOffset-8S9VItk", "(JZ)J", "move", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "onLayout", "changed", "l", "", "t", "r", "b", "resetClipBounds", "resize", "size", "Landroidx/compose/ui/unit/IntSize;", "resize-ozmzZPI", "updateDisplayList", "updateLayerProperties", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "updateLayerProperties-dRfWZ4U", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "updateOutlineResolver", "Companion", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ViewLayer extends View implements OwnedLayer {
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u0017H\u0007R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006R\u001E\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\b@BX\u0086\u000E¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0010\u0010\f\u001A\u0004\u0018\u00010\rX\u0082\u000E¢\u0006\u0002\n\u0000R$\u0010\u000E\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\b@@X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\u000B\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0013X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$Companion;", "", "()V", "OutlineProvider", "Landroid/view/ViewOutlineProvider;", "getOutlineProvider", "()Landroid/view/ViewOutlineProvider;", "<set-?>", "", "hasRetrievedMethod", "getHasRetrievedMethod", "()Z", "recreateDisplayList", "Ljava/lang/reflect/Field;", "shouldUseDispatchDraw", "getShouldUseDispatchDraw", "setShouldUseDispatchDraw$ui_release", "(Z)V", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "updateDisplayList", "", "view", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final boolean getHasRetrievedMethod() [...] // 潜在的解密器

        public final ViewOutlineProvider getOutlineProvider() {
            return ViewLayer.OutlineProvider;
        }

        // 去混淆评级： 低(20)
        public final boolean getShouldUseDispatchDraw() [...] // 潜在的解密器

        public final void setShouldUseDispatchDraw$ui_release(boolean z) {
            ViewLayer.shouldUseDispatchDraw = z;
        }

        public final void updateDisplayList(View view0) {
            Intrinsics.checkNotNullParameter(view0, "view");
            ViewLayer.hasRetrievedMethod = true;
            if(Build.VERSION.SDK_INT < 28) {
                ViewLayer.updateDisplayListIfDirtyMethod = View.class.getDeclaredMethod("updateDisplayListIfDirty");
            }
            else {
                Class[] arr_class = {String.class, new Class[0].getClass()};
                ViewLayer.updateDisplayListIfDirtyMethod = (Method)Class.class.getDeclaredMethod("getDeclaredMethod", arr_class).invoke(View.class, "updateDisplayListIfDirty");
            }
            ViewLayer.recreateDisplayList = View.class.getDeclaredField("mRecreateDisplayList");
            Method method0 = ViewLayer.updateDisplayListIfDirtyMethod;
            if(method0 != null) {
                method0.setAccessible(true);
            }
            Field field0 = ViewLayer.recreateDisplayList;
            if(field0 != null) {
                field0.setAccessible(true);
            }
            Field field1 = ViewLayer.recreateDisplayList;
            if(field1 != null) {
                field1.setBoolean(view0, true);
            }
            Method method1 = ViewLayer.updateDisplayListIfDirtyMethod;
            if(method1 != null) {
                method1.invoke(view0);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$UniqueDrawingIdApi29;", "", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class UniqueDrawingIdApi29 {
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$UniqueDrawingIdApi29$Companion;", "", "()V", "getUniqueDrawingId", "", "view", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public static final class androidx.compose.ui.platform.ViewLayer.UniqueDrawingIdApi29.Companion {
            private androidx.compose.ui.platform.ViewLayer.UniqueDrawingIdApi29.Companion() {
            }

            public androidx.compose.ui.platform.ViewLayer.UniqueDrawingIdApi29.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @JvmStatic
            public final long getUniqueDrawingId(View view0) {
                Intrinsics.checkNotNullParameter(view0, "view");
                return view0.getUniqueDrawingId();
            }
        }

        public static final androidx.compose.ui.platform.ViewLayer.UniqueDrawingIdApi29.Companion Companion;

        static {
            UniqueDrawingIdApi29.Companion = new androidx.compose.ui.platform.ViewLayer.UniqueDrawingIdApi29.Companion(null);
        }

        @JvmStatic
        public static final long getUniqueDrawingId(View view0) {
            return UniqueDrawingIdApi29.Companion.getUniqueDrawingId(view0);
        }
    }

    public static final Companion Companion;
    private static final ViewOutlineProvider OutlineProvider;
    private final CanvasHolder canvasHolder;
    private Rect clipBoundsCache;
    private boolean clipToBounds;
    private final DrawChildContainer container;
    private final Function1 drawBlock;
    private boolean drawnWithZ;
    private static boolean hasRetrievedMethod;
    private final Function0 invalidateParentLayer;
    private boolean isInvalidated;
    private long mTransformOrigin;
    private final ViewLayerMatrixCache matrixCache;
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;
    private static Field recreateDisplayList;
    private static boolean shouldUseDispatchDraw;
    private static Method updateDisplayListIfDirtyMethod;

    static {
        ViewLayer.Companion = new Companion(null);
        ViewLayer.OutlineProvider = new ViewLayer.Companion.OutlineProvider.1();
    }

    public ViewLayer(AndroidComposeView androidComposeView0, DrawChildContainer drawChildContainer0, Function1 function10, Function0 function00) {
        Intrinsics.checkNotNullParameter(androidComposeView0, "ownerView");
        Intrinsics.checkNotNullParameter(drawChildContainer0, "container");
        Intrinsics.checkNotNullParameter(function10, "drawBlock");
        Intrinsics.checkNotNullParameter(function00, "invalidateParentLayer");
        super(androidComposeView0.getContext());
        this.ownerView = androidComposeView0;
        this.container = drawChildContainer0;
        this.drawBlock = function10;
        this.invalidateParentLayer = function00;
        this.outlineResolver = new OutlineResolver(androidComposeView0.getDensity());
        this.canvasHolder = new CanvasHolder();
        this.matrixCache = new ViewLayerMatrixCache();
        this.mTransformOrigin = 0x3F0000003F000000L;
        this.setWillNotDraw(false);
        this.setId(View.generateViewId());
        drawChildContainer0.addView(this);
    }

    public static final boolean access$getHasRetrievedMethod$cp() [...] // 潜在的解密器

    public static final boolean access$getShouldUseDispatchDraw$cp() [...] // 潜在的解密器

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        Runnable runnable0 = new Runnable() {
            @Override
            public final void run() {
                ViewLayer.this.getContainer().removeView(ViewLayer.this);
            }
        };
        this.container.postOnAnimation(runnable0);
        this.setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
    }

    @Override  // android.view.View
    protected void dispatchDraw(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        this.setInvalidated(false);
        CanvasHolder canvasHolder0 = this.canvasHolder;
        Canvas canvas1 = canvasHolder0.getAndroidCanvas().getInternalCanvas();
        canvasHolder0.getAndroidCanvas().setInternalCanvas(canvas0);
        androidx.compose.ui.graphics.Canvas canvas2 = canvasHolder0.getAndroidCanvas();
        Path path0 = this.getManualClipPath();
        if(path0 != null) {
            canvas2.save();
            DefaultImpls.clipPath-mtrdD-E$default(canvas2, path0, 0, 2, null);
        }
        this.getDrawBlock().invoke(canvas2);
        if(path0 != null) {
            canvas2.restore();
        }
        canvasHolder0.getAndroidCanvas().setInternalCanvas(canvas1);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(androidx.compose.ui.graphics.Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        boolean z = this.getElevation() > 0.0f;
        this.drawnWithZ = z;
        if(z) {
            canvas0.enableZ();
        }
        long v = this.getDrawingTime();
        this.container.drawChild$ui_release(canvas0, this, v);
        if(this.drawnWithZ) {
            canvas0.disableZ();
        }
    }

    @Override  // android.view.View
    public void forceLayout() {
    }

    public final float getCameraDistancePx() {
        return this.getCameraDistance() / ((float)this.getResources().getDisplayMetrics().densityDpi);
    }

    public final DrawChildContainer getContainer() {
        return this.container;
    }

    public final Function1 getDrawBlock() {
        return this.drawBlock;
    }

    public final Function0 getInvalidateParentLayer() {
        return this.invalidateParentLayer;
    }

    @Override  // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return (long)this.getId();
    }

    private final Path getManualClipPath() {
        return this.getClipToOutline() ? this.outlineResolver.getClipPath() : null;
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override  // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return Build.VERSION.SDK_INT < 29 ? -1L : UniqueDrawingIdApi29.Companion.getUniqueDrawingId(this.ownerView);
    }

    @ExperimentalComposeUiApi
    public static void getOwnerViewId$annotations() {
    }

    @Override  // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if(!this.isInvalidated) {
            this.setInvalidated(true);
            super.invalidate();
            this.ownerView.invalidate();
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public boolean isInLayer-k-4lQ0M(long v) {
        float f = Offset.getX-impl(v);
        float f1 = Offset.getY-impl(v);
        if(this.clipToBounds) {
            return 0.0f <= f && f < ((float)this.getWidth()) && 0.0f <= f1 && f1 < ((float)this.getHeight());
        }
        return this.getClipToOutline() ? this.outlineResolver.isInOutline-k-4lQ0M(v) : true;
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect0, boolean z) {
        Intrinsics.checkNotNullParameter(mutableRect0, "rect");
        if(z) {
            Matrix.map-impl(this.matrixCache.getInverseMatrix-GrdbGEg(this), mutableRect0);
            return;
        }
        Matrix.map-impl(this.matrixCache.getMatrix-GrdbGEg(this), mutableRect0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.OwnedLayer
    public long mapOffset-8S9VItk(long v, boolean z) {
        return z ? Matrix.map-MK-Hz9U(this.matrixCache.getInverseMatrix-GrdbGEg(this), v) : Matrix.map-MK-Hz9U(this.matrixCache.getMatrix-GrdbGEg(this), v);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void move--gyyYBs(long v) {
        if(((int)(v >> 0x20)) != this.getLeft()) {
            this.offsetLeftAndRight(((int)(v >> 0x20)) - this.getLeft());
            this.matrixCache.invalidate();
        }
        if(((int)(v & 0xFFFFFFFFL)) != this.getTop()) {
            this.offsetTopAndBottom(((int)(v & 0xFFFFFFFFL)) - this.getTop());
            this.matrixCache.invalidate();
        }
    }

    @Override  // android.view.View
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    private final void resetClipBounds() {
        Rect rect1;
        if(this.clipToBounds) {
            Rect rect0 = this.clipBoundsCache;
            if(rect0 == null) {
                this.clipBoundsCache = new Rect(0, 0, this.getWidth(), this.getHeight());
            }
            else {
                Intrinsics.checkNotNull(rect0);
                rect0.set(0, 0, this.getWidth(), this.getHeight());
            }
            rect1 = this.clipBoundsCache;
        }
        else {
            rect1 = null;
        }
        this.setClipBounds(rect1);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void resize-ozmzZPI(long v) {
        if(((int)(v >> 0x20)) != this.getWidth() || ((int)(v & 0xFFFFFFFFL)) != this.getHeight()) {
            this.setPivotX(TransformOrigin.getPivotFractionX-impl(this.mTransformOrigin) * ((float)(((int)(v >> 0x20)))));
            this.setPivotY(TransformOrigin.getPivotFractionY-impl(this.mTransformOrigin) * ((float)(((int)(v & 0xFFFFFFFFL)))));
            this.outlineResolver.update-uvyYCjk(SizeKt.Size(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL))));
            this.updateOutlineResolver();
            this.layout(this.getLeft(), this.getTop(), this.getLeft() + ((int)(v >> 0x20)), this.getTop() + ((int)(v & 0xFFFFFFFFL)));
            this.resetClipBounds();
            this.matrixCache.invalidate();
        }
    }

    public final void setCameraDistancePx(float f) {
        this.setCameraDistance(f * ((float)this.getResources().getDisplayMetrics().densityDpi));
    }

    private final void setInvalidated(boolean z) {
        if(z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if(this.isInvalidated && !ViewLayer.shouldUseDispatchDraw) {
            this.setInvalidated(false);
            ViewLayer.Companion.updateDisplayList(this);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties-dRfWZ4U(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, LayoutDirection layoutDirection0, Density density0) {
        Intrinsics.checkNotNullParameter(shape0, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        Intrinsics.checkNotNullParameter(density0, "density");
        this.mTransformOrigin = v;
        this.setScaleX(f);
        this.setScaleY(f1);
        this.setAlpha(f2);
        this.setTranslationX(f3);
        this.setTranslationY(f4);
        this.setElevation(f5);
        this.setRotation(f8);
        this.setRotationX(f6);
        this.setRotationY(f7);
        this.setPivotX(TransformOrigin.getPivotFractionX-impl(this.mTransformOrigin) * ((float)this.getWidth()));
        this.setPivotY(TransformOrigin.getPivotFractionY-impl(this.mTransformOrigin) * ((float)this.getHeight()));
        this.setCameraDistancePx(f9);
        int v1 = 1;
        this.clipToBounds = z && shape0 == RectangleShapeKt.getRectangleShape();
        this.resetClipBounds();
        int v2 = this.getManualClipPath() == null ? 0 : 1;
        this.setClipToOutline(z && shape0 != RectangleShapeKt.getRectangleShape());
        float f10 = this.getAlpha();
        boolean z1 = this.getClipToOutline();
        float f11 = this.getElevation();
        boolean z2 = this.outlineResolver.update(shape0, f10, z1, f11, layoutDirection0, density0);
        this.updateOutlineResolver();
        if(this.getManualClipPath() == null) {
            v1 = 0;
        }
        if(v2 != v1 || v1 != 0 && z2) {
            this.invalidate();
        }
        if(!this.drawnWithZ && this.getElevation() > 0.0f) {
            this.invalidateParentLayer.invoke();
        }
        this.matrixCache.invalidate();
    }

    private final void updateOutlineResolver() {
        this.setOutlineProvider((this.outlineResolver.getOutline() == null ? null : ViewLayer.OutlineProvider));
    }
}

