package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u0006H\u0007R\u0010\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001A\u0004\u0018\u00010\u0004X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/CanvasUtils;", "", "()V", "inorderBarrierMethod", "Ljava/lang/reflect/Method;", "orderMethodsFetched", "", "reorderBarrierMethod", "enableZ", "", "canvas", "Landroid/graphics/Canvas;", "enable", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class CanvasUtils {
    public static final CanvasUtils INSTANCE;
    private static Method inorderBarrierMethod;
    private static boolean orderMethodsFetched;
    private static Method reorderBarrierMethod;

    static {
        CanvasUtils.INSTANCE = new CanvasUtils();
    }

    public final void enableZ(Canvas canvas0, boolean z) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        if(Build.VERSION.SDK_INT >= 29) {
            CanvasZHelper.INSTANCE.enableZ(canvas0, z);
            return;
        }
        if(!CanvasUtils.orderMethodsFetched) {
            try {
                if(Build.VERSION.SDK_INT == 28) {
                    Class[] arr_class = {String.class, new Class[0].getClass()};
                    Method method0 = Class.class.getDeclaredMethod("getDeclaredMethod", arr_class);
                    CanvasUtils.reorderBarrierMethod = (Method)method0.invoke(Canvas.class, "insertReorderBarrier");
                    CanvasUtils.inorderBarrierMethod = (Method)method0.invoke(Canvas.class, "insertInorderBarrier");
                }
                else {
                    CanvasUtils.reorderBarrierMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier");
                    CanvasUtils.inorderBarrierMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier");
                }
                Method method1 = CanvasUtils.reorderBarrierMethod;
                if(method1 != null) {
                    method1.setAccessible(true);
                }
                Method method2 = CanvasUtils.inorderBarrierMethod;
                if(method2 != null) {
                    method2.setAccessible(true);
                }
            }
            catch(IllegalAccessException | InvocationTargetException | NoSuchMethodException unused_ex) {
            }
            CanvasUtils.orderMethodsFetched = true;
        }
        try {
            if(z) {
                Method method3 = CanvasUtils.reorderBarrierMethod;
                if(method3 != null) {
                    Intrinsics.checkNotNull(method3);
                    method3.invoke(canvas0);
                }
            }
            if(!z) {
                Method method4 = CanvasUtils.inorderBarrierMethod;
                if(method4 != null) {
                    Intrinsics.checkNotNull(method4);
                    method4.invoke(canvas0);
                }
            }
        }
        catch(IllegalAccessException | InvocationTargetException unused_ex) {
        }
    }
}

