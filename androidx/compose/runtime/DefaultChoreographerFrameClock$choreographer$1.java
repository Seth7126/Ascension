package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001A\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008A@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class DefaultChoreographerFrameClock.choreographer.1 extends SuspendLambda implements Function2 {
    int label;

    DefaultChoreographerFrameClock.choreographer.1(Continuation continuation0) {
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new DefaultChoreographerFrameClock.choreographer.1(continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
    }

    public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
        return ((DefaultChoreographerFrameClock.choreographer.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        if(this.label != 0) {
            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        ResultKt.throwOnFailure(object0);
        return Choreographer.getInstance();
    }
}

