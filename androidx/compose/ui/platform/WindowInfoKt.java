package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A0\u0010\u0000\u001A\u00020\u00012!\u0010\u0002\u001A\u001D\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"WindowFocusObserver", "", "onWindowFocusChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isWindowFocused", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class WindowInfoKt {
    public static final void WindowFocusObserver(Function1 function10, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function10, "onWindowFocusChanged");
        Composer composer1 = composer0.startRestartGroup(-603757098);
        ComposerKt.sourceInformation(composer1, "C(WindowFocusObserver)43@1579L7,44@1606L42,45@1680L90,45@1653L117:WindowInfo.kt#itgzvw");
        int v1 = (v & 14) == 0 ? (composer1.changed(function10) ? 4 : 2) | v : v;
        if((2 ^ v1 & 11) != 0 || !composer1.getSkipping()) {
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalWindowInfo());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            State state0 = SnapshotStateKt.rememberUpdatedState(function10, composer1, v1 & 14);
            composer1.startReplaceableGroup(0xFFC7BF68);
            ComposerKt.sourceInformation(composer1, "C(remember)P(1,2):Composables.kt#9igjgp");
            boolean z = composer1.changed(((WindowInfo)object0));
            boolean z1 = composer1.changed(state0);
            androidx.compose.ui.platform.WindowInfoKt.WindowFocusObserver.1.1 windowInfoKt$WindowFocusObserver$1$10 = composer1.rememberedValue();
            if(z || z1 || windowInfoKt$WindowFocusObserver$1$10 == Composer.Companion.getEmpty()) {
                windowInfoKt$WindowFocusObserver$1$10 = new Function2(((WindowInfo)object0), state0, null) {
                    final State $callback;
                    final WindowInfo $windowInfo;
                    int label;

                    {
                        this.$windowInfo = windowInfo0;
                        this.$callback = state0;
                        super(2, continuation0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object object0, Continuation continuation0) {
                        return new androidx.compose.ui.platform.WindowInfoKt.WindowFocusObserver.1.1(this.$windowInfo, this.$callback, continuation0);
                    }

                    @Override  // kotlin.jvm.functions.Function2
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                    }

                    public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                        return ((androidx.compose.ui.platform.WindowInfoKt.WindowFocusObserver.1.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch(this.label) {
                            case 0: {
                                ResultKt.throwOnFailure(object0);
                                Flow flow0 = SnapshotStateKt.snapshotFlow(new Function0() {
                                    final WindowInfo $windowInfo;

                                    {
                                        this.$windowInfo = windowInfo0;
                                        super(0);
                                    }

                                    @Override  // kotlin.jvm.functions.Function0
                                    public Object invoke() {
                                        return Boolean.valueOf(this.invoke());
                                    }

                                    public final boolean invoke() {
                                        return this.$windowInfo.isWindowFocused();
                                    }
                                });
                                FlowCollector flowCollector0 = new FlowCollector() {
                                    @Override  // kotlinx.coroutines.flow.FlowCollector
                                    public Object emit(Object object0, Continuation continuation0) {
                                        Object object1 = ((Function1)this.$callback$inlined.getValue()).invoke(Boxing.boxBoolean(((Boolean)object0).booleanValue()));
                                        return object1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
                                    }
                                };
                                this.label = 1;
                                return flow0.collect(flowCollector0, this) == object1 ? object1 : Unit.INSTANCE;
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
                };
                composer1.updateRememberedValue(windowInfoKt$WindowFocusObserver$1$10);
            }
            composer1.endReplaceableGroup();
            EffectsKt.LaunchedEffect(((WindowInfo)object0), windowInfoKt$WindowFocusObserver$1$10, composer1, 0);
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(function10, v) {
                final int $$changed;
                final Function1 $onWindowFocusChanged;

                {
                    this.$onWindowFocusChanged = function10;
                    this.$$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    WindowInfoKt.WindowFocusObserver(this.$onWindowFocusChanged, composer0, this.$$changed | 1);
                }
            });
        }
    }
}

