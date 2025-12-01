package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class AndroidUiDispatcher.Companion.Main.2 extends Lambda implements Function0 {
    public static final AndroidUiDispatcher.Companion.Main.2 INSTANCE;

    static {
        AndroidUiDispatcher.Companion.Main.2.INSTANCE = new AndroidUiDispatcher.Companion.Main.2();
    }

    AndroidUiDispatcher.Companion.Main.2() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public Object invoke() {
        return this.invoke();
    }

    public final CoroutineContext invoke() {
        Choreographer choreographer0 = AndroidUiDispatcher_androidKt.isMainThread() ? Choreographer.getInstance() : ((Choreographer)BuildersKt.runBlocking(Dispatchers.getMain(), new Function2() {
            int label;

            {
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                return new androidx.compose.ui.platform.AndroidUiDispatcher.Companion.Main.2.dispatcher.1(continuation0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                return ((androidx.compose.ui.platform.AndroidUiDispatcher.Companion.Main.2.dispatcher.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                if(this.label != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                ResultKt.throwOnFailure(object0);
                return Choreographer.getInstance();
            }
        }));
        Intrinsics.checkNotNullExpressionValue(choreographer0, "if (isMainThread()) Choreographer.getInstance()\n                else runBlocking(Dispatchers.Main) { Choreographer.getInstance() }");
        Handler handler0 = HandlerCompat.createAsync(Looper.getMainLooper());
        Intrinsics.checkNotNullExpressionValue(handler0, "createAsync(Looper.getMainLooper())");
        AndroidUiDispatcher androidUiDispatcher0 = new AndroidUiDispatcher(choreographer0, handler0, null);
        return androidUiDispatcher0.plus(androidUiDispatcher0.getFrameClock());
    }
}

