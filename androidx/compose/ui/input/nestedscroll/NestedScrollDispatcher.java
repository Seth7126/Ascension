package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001A\u001A\u00020\u0018H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001B\u0010\u001CJ+\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u0019\u001A\u00020\u001E2\u0006\u0010\u001A\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020 ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J!\u0010#\u001A\u00020\u00182\u0006\u0010\u001A\u001A\u00020\u0018H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J#\u0010&\u001A\u00020\u001E2\u0006\u0010\u001A\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020 ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\'\u0010(R\"\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001A\u00020\u00058F¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u001C\u0010\r\u001A\u0004\u0018\u00010\u0005X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\f\"\u0004\b\u000F\u0010\u0010R\u001C\u0010\u0011\u001A\u0004\u0018\u00010\u0012X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "()V", "calculateNestedScrollScope", "Lkotlin/Function0;", "Lkotlinx/coroutines/CoroutineScope;", "getCalculateNestedScrollScope$ui_release", "()Lkotlin/jvm/functions/Function0;", "setCalculateNestedScrollScope$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "coroutineScope", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "originNestedScrollScope", "getOriginNestedScrollScope$ui_release", "setOriginNestedScrollScope$ui_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "parent", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getParent$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setParent$ui_release", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "dispatchPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "dispatchPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "dispatchPostScroll-DzOQY0M", "(JJI)J", "dispatchPreFling", "dispatchPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPreScroll", "dispatchPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    private Function0 calculateNestedScrollScope;
    private CoroutineScope originNestedScrollScope;
    private NestedScrollConnection parent;

    static {
    }

    public NestedScrollDispatcher() {
        this.calculateNestedScrollScope = new Function0() {
            {
                NestedScrollDispatcher.this = nestedScrollDispatcher0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }

            public final CoroutineScope invoke() {
                return NestedScrollDispatcher.this.getOriginNestedScrollScope$ui_release();
            }
        };
    }

    public final Object dispatchPostFling-RZ2iAVY(long v, long v1, Continuation continuation0) {
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.dispatchPostFling.1 nestedScrollDispatcher$dispatchPostFling$10;
        if(continuation0 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.dispatchPostFling.1) {
            nestedScrollDispatcher$dispatchPostFling$10 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.dispatchPostFling.1)continuation0;
            if((nestedScrollDispatcher$dispatchPostFling$10.label & 0x80000000) == 0) {
                nestedScrollDispatcher$dispatchPostFling$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return continuation0.dispatchPostFling-RZ2iAVY(0L, 0L, this);
                    }
                };
            }
            else {
                nestedScrollDispatcher$dispatchPostFling$10.label ^= 0x80000000;
            }
        }
        else {
            nestedScrollDispatcher$dispatchPostFling$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return continuation0.dispatchPostFling-RZ2iAVY(0L, 0L, this);
                }
            };
        }
        Object object0 = nestedScrollDispatcher$dispatchPostFling$10.result;
        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(nestedScrollDispatcher$dispatchPostFling$10.label) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                NestedScrollConnection nestedScrollConnection0 = this.getParent$ui_release();
                if(nestedScrollConnection0 == null) {
                    return Velocity.box-impl(0L);
                }
                nestedScrollDispatcher$dispatchPostFling$10.label = 1;
                object0 = nestedScrollConnection0.onPostFling-RZ2iAVY(v, v1, nestedScrollDispatcher$dispatchPostFling$10);
                return object0 == object1 ? object1 : Velocity.box-impl(((Velocity)object0).unbox-impl());
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(((Velocity)object0).unbox-impl());
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    // 去混淆评级： 低(30)
    public final long dispatchPostScroll-DzOQY0M(long v, long v1, int v2) {
        return this.parent == null ? 0L : this.parent.onPostScroll-DzOQY0M(v, v1, v2);
    }

    public final Object dispatchPreFling-QWom1Mo(long v, Continuation continuation0) {
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.dispatchPreFling.1 nestedScrollDispatcher$dispatchPreFling$10;
        if(continuation0 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.dispatchPreFling.1) {
            nestedScrollDispatcher$dispatchPreFling$10 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.dispatchPreFling.1)continuation0;
            if((nestedScrollDispatcher$dispatchPreFling$10.label & 0x80000000) == 0) {
                nestedScrollDispatcher$dispatchPreFling$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return continuation0.dispatchPreFling-QWom1Mo(0L, this);
                    }
                };
            }
            else {
                nestedScrollDispatcher$dispatchPreFling$10.label ^= 0x80000000;
            }
        }
        else {
            nestedScrollDispatcher$dispatchPreFling$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return continuation0.dispatchPreFling-QWom1Mo(0L, this);
                }
            };
        }
        Object object0 = nestedScrollDispatcher$dispatchPreFling$10.result;
        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(nestedScrollDispatcher$dispatchPreFling$10.label) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                NestedScrollConnection nestedScrollConnection0 = this.getParent$ui_release();
                if(nestedScrollConnection0 == null) {
                    return Velocity.box-impl(0L);
                }
                nestedScrollDispatcher$dispatchPreFling$10.label = 1;
                object0 = nestedScrollConnection0.onPreFling-QWom1Mo(v, nestedScrollDispatcher$dispatchPreFling$10);
                return object0 == object1 ? object1 : Velocity.box-impl(((Velocity)object0).unbox-impl());
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Velocity.box-impl(((Velocity)object0).unbox-impl());
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    // 去混淆评级： 低(30)
    public final long dispatchPreScroll-OzD1aCk(long v, int v1) {
        return this.parent == null ? 0L : this.parent.onPreScroll-OzD1aCk(v, v1);
    }

    public final Function0 getCalculateNestedScrollScope$ui_release() {
        return this.calculateNestedScrollScope;
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope0 = (CoroutineScope)this.calculateNestedScrollScope.invoke();
        if(coroutineScope0 == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return coroutineScope0;
    }

    public final CoroutineScope getOriginNestedScrollScope$ui_release() {
        return this.originNestedScrollScope;
    }

    public final NestedScrollConnection getParent$ui_release() {
        return this.parent;
    }

    public final void setCalculateNestedScrollScope$ui_release(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "<set-?>");
        this.calculateNestedScrollScope = function00;
    }

    public final void setOriginNestedScrollScope$ui_release(CoroutineScope coroutineScope0) {
        this.originNestedScrollScope = coroutineScope0;
    }

    public final void setParent$ui_release(NestedScrollConnection nestedScrollConnection0) {
        this.parent = nestedScrollConnection0;
    }
}

