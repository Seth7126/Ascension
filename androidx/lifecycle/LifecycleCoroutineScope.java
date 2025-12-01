package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J7\u0010\u0007\u001A\u00020\b2\'\u0010\t\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000B\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000Eø\u0001\u0000¢\u0006\u0002\u0010\u000FJ7\u0010\u0010\u001A\u00020\b2\'\u0010\t\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000B\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000Eø\u0001\u0000¢\u0006\u0002\u0010\u000FJ7\u0010\u0011\u001A\u00020\b2\'\u0010\t\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000B\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000Eø\u0001\u0000¢\u0006\u0002\u0010\u000FR\u0012\u0010\u0003\u001A\u00020\u0004X \u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$lifecycle_runtime_ktx_release", "()Landroidx/lifecycle/Lifecycle;", "launchWhenCreated", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "launchWhenResumed", "launchWhenStarted", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 4, 1})
public abstract class LifecycleCoroutineScope implements CoroutineScope {
    public abstract Lifecycle getLifecycle$lifecycle_runtime_ktx_release();

    public final Job launchWhenCreated(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new Function2(function20, null) {
            final Function2 $block;
            int label;

            {
                LifecycleCoroutineScope.this = lifecycleCoroutineScope0;
                this.$block = function20;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                Intrinsics.checkNotNullParameter(continuation0, "completion");
                return new androidx.lifecycle.LifecycleCoroutineScope.launchWhenCreated.1(LifecycleCoroutineScope.this, this.$block, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public final Object invoke(Object object0, Object object1) {
                return ((androidx.lifecycle.LifecycleCoroutineScope.launchWhenCreated.1)this.create(object0, ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        Lifecycle lifecycle0 = LifecycleCoroutineScope.this.getLifecycle$lifecycle_runtime_ktx_release();
                        this.label = 1;
                        return PausingDispatcherKt.whenCreated(lifecycle0, this.$block, this) == object1 ? object1 : Unit.INSTANCE;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, 3, null);
    }

    public final Job launchWhenResumed(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new Function2(function20, null) {
            final Function2 $block;
            int label;

            {
                LifecycleCoroutineScope.this = lifecycleCoroutineScope0;
                this.$block = function20;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                Intrinsics.checkNotNullParameter(continuation0, "completion");
                return new androidx.lifecycle.LifecycleCoroutineScope.launchWhenResumed.1(LifecycleCoroutineScope.this, this.$block, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public final Object invoke(Object object0, Object object1) {
                return ((androidx.lifecycle.LifecycleCoroutineScope.launchWhenResumed.1)this.create(object0, ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        Lifecycle lifecycle0 = LifecycleCoroutineScope.this.getLifecycle$lifecycle_runtime_ktx_release();
                        this.label = 1;
                        return PausingDispatcherKt.whenResumed(lifecycle0, this.$block, this) == object1 ? object1 : Unit.INSTANCE;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, 3, null);
    }

    public final Job launchWhenStarted(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new Function2(function20, null) {
            final Function2 $block;
            int label;

            {
                LifecycleCoroutineScope.this = lifecycleCoroutineScope0;
                this.$block = function20;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                Intrinsics.checkNotNullParameter(continuation0, "completion");
                return new androidx.lifecycle.LifecycleCoroutineScope.launchWhenStarted.1(LifecycleCoroutineScope.this, this.$block, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public final Object invoke(Object object0, Object object1) {
                return ((androidx.lifecycle.LifecycleCoroutineScope.launchWhenStarted.1)this.create(object0, ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        Lifecycle lifecycle0 = LifecycleCoroutineScope.this.getLifecycle$lifecycle_runtime_ktx_release();
                        this.label = 1;
                        return PausingDispatcherKt.whenStarted(lifecycle0, this.$block, this) == object1 ? object1 : Unit.INSTANCE;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, 3, null);
    }
}

