package androidx.compose.ui.platform;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.R.id;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\f\u0010\u0011\u001A\u00020\f*\u00020\u0003H\u0002\u001A\f\u0010\u0012\u001A\u0004\u0018\u00010\u0001*\u00020\u0003\",\u0010\u0002\u001A\u0004\u0018\u00010\u0001*\u00020\u00032\b\u0010\u0000\u001A\u0004\u0018\u00010\u00018F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"\u0018\u0010\b\u001A\u00020\u0003*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\n\"\u001E\u0010\u000B\u001A\u00020\f*\u00020\u00038@X\u0080\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0013"}, d2 = {"value", "Landroidx/compose/runtime/CompositionContext;", "compositionContext", "Landroid/view/View;", "getCompositionContext", "(Landroid/view/View;)Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "(Landroid/view/View;Landroidx/compose/runtime/CompositionContext;)V", "contentChild", "getContentChild", "(Landroid/view/View;)Landroid/view/View;", "windowRecomposer", "Landroidx/compose/runtime/Recomposer;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "getWindowRecomposer", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "createLifecycleAwareViewTreeRecomposer", "findViewTreeCompositionContext", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class WindowRecomposer_androidKt {
    private static final Recomposer createLifecycleAwareViewTreeRecomposer(View view0) {
        PausableMonotonicFrameClock pausableMonotonicFrameClock0;
        CoroutineContext coroutineContext0 = AndroidUiDispatcher.Companion.getCurrentThread();
        MonotonicFrameClock monotonicFrameClock0 = (MonotonicFrameClock)coroutineContext0.get(MonotonicFrameClock.Key);
        if(monotonicFrameClock0 == null) {
            pausableMonotonicFrameClock0 = null;
        }
        else {
            PausableMonotonicFrameClock pausableMonotonicFrameClock1 = new PausableMonotonicFrameClock(monotonicFrameClock0);
            pausableMonotonicFrameClock1.pause();
            pausableMonotonicFrameClock0 = pausableMonotonicFrameClock1;
        }
        CoroutineContext coroutineContext1 = pausableMonotonicFrameClock0 == null ? EmptyCoroutineContext.INSTANCE : pausableMonotonicFrameClock0;
        CoroutineContext coroutineContext2 = coroutineContext0.plus(coroutineContext1);
        Recomposer recomposer0 = new Recomposer(coroutineContext2);
        CoroutineScope coroutineScope0 = CoroutineScopeKt.CoroutineScope(coroutineContext2);
        LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.get(view0);
        if(lifecycleOwner0 == null) {
            throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view0).toString());
        }
        view0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                view0.removeOnAttachStateChangeListener(this);
                recomposer0.cancel();
            }
        });
        lifecycleOwner0.getLifecycle().addObserver(new LifecycleEventObserver() {
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
            public final class WhenMappings {
                public static final int[] $EnumSwitchMapping$0;

                static {
                    int[] arr_v = new int[Event.values().length];
                    arr_v[Event.ON_CREATE.ordinal()] = 1;
                    arr_v[Event.ON_START.ordinal()] = 2;
                    arr_v[Event.ON_STOP.ordinal()] = 3;
                    arr_v[Event.ON_DESTROY.ordinal()] = 4;
                    WhenMappings.$EnumSwitchMapping$0 = arr_v;
                }
            }

            @Override  // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
                Intrinsics.checkNotNullParameter(lifecycleOwner0, "lifecycleOwner");
                Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
                switch(lifecycle$Event0) {
                    case 1: {
                        androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareViewTreeRecomposer.2.onStateChanged.1 windowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$onStateChanged$10 = new Function2(lifecycleOwner0, this, null) {
                            final LifecycleOwner $lifecycleOwner;
                            final Recomposer $recomposer;
                            final androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareViewTreeRecomposer.2 $self;
                            int label;

                            {
                                this.$recomposer = recomposer0;
                                this.$lifecycleOwner = lifecycleOwner0;
                                this.$self = windowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$20;
                                super(2, continuation0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation create(Object object0, Continuation continuation0) {
                                return new androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareViewTreeRecomposer.2.onStateChanged.1(this.$recomposer, this.$lifecycleOwner, this.$self, continuation0);
                            }

                            @Override  // kotlin.jvm.functions.Function2
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                            }

                            public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                                return ((androidx.compose.ui.platform.WindowRecomposer_androidKt.createLifecycleAwareViewTreeRecomposer.2.onStateChanged.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object object0) {
                                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                switch(this.label) {
                                    case 0: {
                                        ResultKt.throwOnFailure(object0);
                                        try {
                                            this.label = 1;
                                            if(this.$recomposer.runRecomposeAndApplyChanges(this) == object1) {
                                                return object1;
                                            label_7:
                                                ResultKt.throwOnFailure(object0);
                                            }
                                            break;
                                        }
                                        catch(Throwable throwable0) {
                                            this.$lifecycleOwner.getLifecycle().removeObserver(this.$self);
                                            throw throwable0;
                                        }
                                    }
                                    case 1: {
                                        goto label_7;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                this.$lifecycleOwner.getLifecycle().removeObserver(this.$self);
                                return Unit.INSTANCE;
                            }
                        };
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, windowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$onStateChanged$10, 1, null);
                        return;
                    }
                    case 2: {
                        PausableMonotonicFrameClock pausableMonotonicFrameClock0 = pausableMonotonicFrameClock0;
                        if(pausableMonotonicFrameClock0 != null) {
                            pausableMonotonicFrameClock0.resume();
                            return;
                        }
                        break;
                    }
                    case 3: {
                        PausableMonotonicFrameClock pausableMonotonicFrameClock1 = pausableMonotonicFrameClock0;
                        if(pausableMonotonicFrameClock1 != null) {
                            pausableMonotonicFrameClock1.pause();
                            return;
                        }
                        break;
                    }
                    case 4: {
                        recomposer0.cancel();
                    }
                }
            }
        });
        return recomposer0;
    }

    public static final CompositionContext findViewTreeCompositionContext(View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        CompositionContext compositionContext0 = WindowRecomposer_androidKt.getCompositionContext(view0);
        if(compositionContext0 != null) {
            return compositionContext0;
        }
        for(ViewParent viewParent0 = view0.getParent(); compositionContext0 == null && viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
            compositionContext0 = WindowRecomposer_androidKt.getCompositionContext(((View)viewParent0));
        }
        return compositionContext0;
    }

    public static final CompositionContext getCompositionContext(View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Object object0 = view0.getTag(id.androidx_compose_ui_view_composition_context);
        return object0 instanceof CompositionContext ? ((CompositionContext)object0) : null;
    }

    private static final View getContentChild(View view0) {
        ViewParent viewParent0 = view0.getParent();
        while(viewParent0 instanceof View && ((View)viewParent0).getId() != 0x1020002) {
            ViewParent viewParent1 = ((View)viewParent0).getParent();
            View view1 = (View)viewParent0;
            viewParent0 = viewParent1;
            view0 = view1;
        }
        return view0;
    }

    public static final Recomposer getWindowRecomposer(View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        if(!view0.isAttachedToWindow()) {
            throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view0 + " is not attached to a window").toString());
        }
        View view1 = WindowRecomposer_androidKt.getContentChild(view0);
        CompositionContext compositionContext0 = WindowRecomposer_androidKt.getCompositionContext(view1);
        if(compositionContext0 == null) {
            return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui_release(view1);
        }
        if(!(compositionContext0 instanceof Recomposer)) {
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
        }
        return (Recomposer)compositionContext0;
    }

    public static void getWindowRecomposer$annotations(View view0) {
    }

    public static final void setCompositionContext(View view0, CompositionContext compositionContext0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        view0.setTag(id.androidx_compose_ui_view_composition_context, compositionContext0);
    }
}

