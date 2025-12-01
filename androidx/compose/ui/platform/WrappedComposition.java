package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R.id;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0001¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001A\u00020\u0011H\u0016J\u0018\u0010\u0019\u001A\u00020\u00112\u0006\u0010\u001A\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001DH\u0016J \u0010\u001E\u001A\u00020\u00112\u0011\u0010\u001F\u001A\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0016¢\u0006\u0002\u0010 R\u0010\u0010\u0007\u001A\u0004\u0018\u00010\bX\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\nX\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u000B\u001A\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0014\u0010\u000E\u001A\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\rR\u001B\u0010\u000F\u001A\r\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012X\u0082\u000E¢\u0006\u0004\n\u0002\u0010\u0013R\u0011\u0010\u0005\u001A\u00020\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Landroidx/compose/runtime/Composition;", "Landroidx/lifecycle/LifecycleEventObserver;", "owner", "Landroidx/compose/ui/platform/AndroidComposeView;", "original", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/Composition;)V", "addedToLifecycle", "Landroidx/lifecycle/Lifecycle;", "disposed", "", "hasInvalidations", "getHasInvalidations", "()Z", "isDisposed", "lastContent", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "getOriginal", "()Landroidx/compose/runtime/Composition;", "getOwner", "()Landroidx/compose/ui/platform/AndroidComposeView;", "dispose", "onStateChanged", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "setContent", "content", "(Lkotlin/jvm/functions/Function2;)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class WrappedComposition implements Composition, LifecycleEventObserver {
    private Lifecycle addedToLifecycle;
    private boolean disposed;
    private Function2 lastContent;
    private final Composition original;
    private final AndroidComposeView owner;

    public WrappedComposition(AndroidComposeView androidComposeView0, Composition composition0) {
        Intrinsics.checkNotNullParameter(androidComposeView0, "owner");
        Intrinsics.checkNotNullParameter(composition0, "original");
        super();
        this.owner = androidComposeView0;
        this.original = composition0;
        this.lastContent = ComposableSingletons.Wrapper_androidKt.INSTANCE.getLambda-1$ui_release();
    }

    @Override  // androidx.compose.runtime.Composition
    public void dispose() {
        if(!this.disposed) {
            this.disposed = true;
            this.owner.setTag(id.wrapped_composition_tag, null);
            Lifecycle lifecycle0 = this.addedToLifecycle;
            if(lifecycle0 != null) {
                lifecycle0.removeObserver(this);
            }
        }
        this.original.dispose();
    }

    @Override  // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    public final Composition getOriginal() {
        return this.original;
    }

    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override  // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.original.isDisposed();
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "source");
        Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
        if(lifecycle$Event0 == Event.ON_DESTROY) {
            this.dispose();
            return;
        }
        if(lifecycle$Event0 == Event.ON_CREATE && !this.disposed) {
            this.setContent(this.lastContent);
        }
    }

    @Override  // androidx.compose.runtime.Composition
    public void setContent(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "content");
        Function1 function10 = new Function1(function20) {
            final Function2 $content;

            {
                WrappedComposition.this = wrappedComposition0;
                this.$content = function20;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((ViewTreeOwners)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(ViewTreeOwners androidComposeView$ViewTreeOwners0) {
                Intrinsics.checkNotNullParameter(androidComposeView$ViewTreeOwners0, "it");
                if(!WrappedComposition.this.disposed) {
                    Lifecycle lifecycle0 = androidComposeView$ViewTreeOwners0.getLifecycleOwner().getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle0, "it.lifecycleOwner.lifecycle");
                    WrappedComposition.this.lastContent = this.$content;
                    if(WrappedComposition.this.addedToLifecycle == null) {
                        WrappedComposition.this.addedToLifecycle = lifecycle0;
                        lifecycle0.addObserver(WrappedComposition.this);
                        return;
                    }
                    if(lifecycle0.getCurrentState().isAtLeast(State.CREATED)) {
                        WrappedComposition.this.getOriginal().setContent(ComposableLambdaKt.composableLambdaInstance(0xC541E4DE, true, new Function2(this.$content) {
                            final Function2 $content;

                            {
                                WrappedComposition.this = wrappedComposition0;
                                this.$content = function20;
                                super(2);
                            }

                            @Override  // kotlin.jvm.functions.Function2
                            public Object invoke(Object object0, Object object1) {
                                this.invoke(((Composer)object0), ((Number)object1).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer0, int v) {
                                ComposerKt.sourceInformation(composer0, "C157@6261L61,158@6347L56,160@6429L176:Wrapper.android.kt#itgzvw");
                                if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
                                    composer0.skipToGroupEnd();
                                    return;
                                }
                                Object object0 = WrappedComposition.this.getOwner().getTag(id.inspection_slot_table_set);
                                Set set0 = TypeIntrinsics.isMutableSet(object0) ? ((Set)object0) : null;
                                if(set0 == null) {
                                    ViewParent viewParent0 = WrappedComposition.this.getOwner().getParent();
                                    View view0 = viewParent0 instanceof View ? ((View)viewParent0) : null;
                                    Object object1 = view0 == null ? null : view0.getTag(id.inspection_slot_table_set);
                                    set0 = TypeIntrinsics.isMutableSet(object1) ? ((Set)object1) : null;
                                }
                                if(set0 != null) {
                                    set0.add(composer0.getCompositionData());
                                    composer0.collectParameterInformation();
                                }
                                EffectsKt.LaunchedEffect(WrappedComposition.this.getOwner(), new Function2(null) {
                                    int label;

                                    {
                                        WrappedComposition.this = wrappedComposition0;
                                        super(2, continuation0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation create(Object object0, Continuation continuation0) {
                                        return new androidx.compose.ui.platform.WrappedComposition.setContent.1.1.1(WrappedComposition.this, continuation0);
                                    }

                                    @Override  // kotlin.jvm.functions.Function2
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                                    }

                                    public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                                        return ((androidx.compose.ui.platform.WrappedComposition.setContent.1.1.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object object0) {
                                        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        switch(this.label) {
                                            case 0: {
                                                ResultKt.throwOnFailure(object0);
                                                this.label = 1;
                                                return WrappedComposition.this.getOwner().keyboardVisibilityEventLoop(this) == object1 ? object1 : Unit.INSTANCE;
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
                                }, composer0, 8);
                                EffectsKt.LaunchedEffect(WrappedComposition.this.getOwner(), new Function2(null) {
                                    int label;

                                    {
                                        WrappedComposition.this = wrappedComposition0;
                                        super(2, continuation0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation create(Object object0, Continuation continuation0) {
                                        return new androidx.compose.ui.platform.WrappedComposition.setContent.1.1.2(WrappedComposition.this, continuation0);
                                    }

                                    @Override  // kotlin.jvm.functions.Function2
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                                    }

                                    public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                                        return ((androidx.compose.ui.platform.WrappedComposition.setContent.1.1.2)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object object0) {
                                        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        switch(this.label) {
                                            case 0: {
                                                ResultKt.throwOnFailure(object0);
                                                this.label = 1;
                                                return WrappedComposition.this.getOwner().boundsUpdatesEventLoop(this) == object1 ? object1 : Unit.INSTANCE;
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
                                }, composer0, 8);
                                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{InspectionTablesKt.getLocalInspectionTables().provides(set0)}, ComposableLambdaKt.composableLambda(composer0, 0xCF217FE8, true, new Function2(this.$content) {
                                    final Function2 $content;

                                    {
                                        WrappedComposition.this = wrappedComposition0;
                                        this.$content = function20;
                                        super(2);
                                    }

                                    @Override  // kotlin.jvm.functions.Function2
                                    public Object invoke(Object object0, Object object1) {
                                        this.invoke(((Composer)object0), ((Number)object1).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer0, int v) {
                                        ComposerKt.sourceInformation(composer0, "C161@6532L47:Wrapper.android.kt#itgzvw");
                                        if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
                                            composer0.skipToGroupEnd();
                                            return;
                                        }
                                        AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(WrappedComposition.this.getOwner(), this.$content, composer0, 8);
                                    }
                                }), composer0, 56);
                            }
                        }));
                    }
                }
            }
        };
        this.owner.setOnViewTreeOwnersAvailable(function10);
    }
}

