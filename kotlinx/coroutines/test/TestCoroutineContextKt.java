package kotlinx.coroutines.test;

import java.util.Collection;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A+\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u0017\u0010\u0004\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¨\u0006\u0007"}, d2 = {"withTestContext", "", "testContext", "Lkotlinx/coroutines/test/TestCoroutineContext;", "testBody", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TestCoroutineContextKt {
    @Deprecated(level = DeprecationLevel.WARNING, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @ReplaceWith(expression = "testContext.runBlockingTest(testBody)", imports = {"kotlin.coroutines.test"}))
    public static final void withTestContext(TestCoroutineContext testCoroutineContext0, Function1 function10) {
        function10.invoke(testCoroutineContext0);
        Iterable iterable0 = testCoroutineContext0.getExceptions();
        boolean z = true;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(!(((Throwable)object0) instanceof CancellationException)) {
                    z = false;
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        if(!z) {
            throw new AssertionError("Coroutine encountered unhandled exceptions:\n" + testCoroutineContext0.getExceptions());
        }
    }

    public static void withTestContext$default(TestCoroutineContext testCoroutineContext0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            testCoroutineContext0 = new TestCoroutineContext(null, 1, null);
        }
        TestCoroutineContextKt.withTestContext(testCoroutineContext0, function10);
    }
}

