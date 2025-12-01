package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ThreadContextElement;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\n"}, d2 = {"Lkotlinx/coroutines/ThreadContextElement;", "found", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "<no name provided>"}, k = 3, mv = {1, 5, 1})
final class ThreadContextKt.findOne.1 extends Lambda implements Function2 {
    public static final ThreadContextKt.findOne.1 INSTANCE;

    static {
        ThreadContextKt.findOne.1.INSTANCE = new ThreadContextKt.findOne.1();
    }

    ThreadContextKt.findOne.1() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((ThreadContextElement)object0), ((Element)object1));
    }

    public final ThreadContextElement invoke(ThreadContextElement threadContextElement0, Element coroutineContext$Element0) {
        if(threadContextElement0 != null) {
            return threadContextElement0;
        }
        return coroutineContext$Element0 instanceof ThreadContextElement ? ((ThreadContextElement)coroutineContext$Element0) : null;
    }
}

