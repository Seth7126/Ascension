package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AU\u0010\u0005\u001A\u0002H\u0006\"\u0004\b\u0000\u0010\u00062<\u0010\u0007\u001A8\b\u0001\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u000E\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0002\b\u000FH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000E\u0010\u0003\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"FramePending", "", "ProduceAnotherFrame", "RecomposerCompoundHashKey", "", "withRunningRecomposer", "R", "block", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/Recomposer;", "Lkotlin/ParameterName;", "name", "recomposer", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class RecomposerKt {
    private static final Object FramePending = null;
    private static final Object ProduceAnotherFrame = null;
    private static final int RecomposerCompoundHashKey = 1000;

    static {
        RecomposerKt.ProduceAnotherFrame = new Object();
        RecomposerKt.FramePending = new Object();
    }

    public static final Object withRunningRecomposer(Function3 function30, Continuation continuation0) {
        return CoroutineScopeKt.coroutineScope(new Function2(function30, null) {
            final Function3 $block;
            private Object L$0;
            int label;

            {
                this.$block = function30;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                androidx.compose.runtime.RecomposerKt.withRunningRecomposer.2 recomposerKt$withRunningRecomposer$20 = new androidx.compose.runtime.RecomposerKt.withRunningRecomposer.2(this.$block, continuation0);
                recomposerKt$withRunningRecomposer$20.L$0 = object0;
                return recomposerKt$withRunningRecomposer$20;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                return ((androidx.compose.runtime.RecomposerKt.withRunningRecomposer.2)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Recomposer recomposer0;
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        CoroutineScope coroutineScope0 = (CoroutineScope)this.L$0;
                        recomposer0 = new Recomposer(coroutineScope0.getCoroutineContext());
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope0, null, null, new Function2(null) {
                            final Recomposer $recomposer;
                            int label;

                            {
                                this.$recomposer = recomposer0;
                                super(2, continuation0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object object0, Continuation continuation0) {
                                return new androidx.compose.runtime.RecomposerKt.withRunningRecomposer.2.1(this.$recomposer, continuation0);
                            }

                            @Override  // kotlin.jvm.functions.Function2
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                            }

                            public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                                return ((androidx.compose.runtime.RecomposerKt.withRunningRecomposer.2.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object object0) {
                                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                switch(this.label) {
                                    case 0: {
                                        ResultKt.throwOnFailure(object0);
                                        this.label = 1;
                                        return this.$recomposer.runRecomposeAndApplyChanges(this) == object1 ? object1 : Unit.INSTANCE;
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
                        this.L$0 = recomposer0;
                        this.label = 1;
                        object0 = this.$block.invoke(coroutineScope0, recomposer0, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        recomposer0 = (Recomposer)this.L$0;
                        ResultKt.throwOnFailure(object0);
                        break;
                    }
                    case 2: {
                        Object object2 = this.L$0;
                        ResultKt.throwOnFailure(object0);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                recomposer0.close();
                this.L$0 = object0;
                this.label = 2;
                return recomposer0.join(this) == object1 ? object1 : object0;
            }
        }, continuation0);
    }
}

