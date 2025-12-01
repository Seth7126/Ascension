package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001A\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$Companion$currentThread$1", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", "initialValue", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidUiDispatcher.Companion.currentThread.1 extends ThreadLocal {
    @Override
    public Object initialValue() {
        return this.initialValue();
    }

    protected CoroutineContext initialValue() {
        Choreographer choreographer0 = Choreographer.getInstance();
        Intrinsics.checkNotNullExpressionValue(choreographer0, "getInstance()");
        Looper looper0 = Looper.myLooper();
        if(looper0 == null) {
            throw new IllegalStateException("no Looper on this thread");
        }
        Handler handler0 = HandlerCompat.createAsync(looper0);
        Intrinsics.checkNotNullExpressionValue(handler0, "createAsync(\n                        Looper.myLooper()\n                            ?: error(\"no Looper on this thread\")\n                    )");
        AndroidUiDispatcher androidUiDispatcher0 = new AndroidUiDispatcher(choreographer0, handler0, null);
        return androidUiDispatcher0.plus(androidUiDispatcher0.getFrameClock());
    }
}

