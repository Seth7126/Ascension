package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalComposeUiApi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001BB\u0005¢\u0006\u0002\u0010\u0002R\u001A\u0010\u0003\u001A\u00020\u0004X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\u00040\nX\u0086.¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0010\u001A\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R(\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\u0010\u0014\u001A\u0004\u0018\u00010\u0015@FX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "()V", "disallowIntercept", "", "getDisallowIntercept$ui_release", "()Z", "setDisallowIntercept$ui_release", "(Z)V", "onTouchEvent", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "getOnTouchEvent", "()Lkotlin/jvm/functions/Function1;", "setOnTouchEvent", "(Lkotlin/jvm/functions/Function1;)V", "pointerInputFilter", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "value", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "requestDisallowInterceptTouchEvent", "getRequestDisallowInterceptTouchEvent", "()Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "setRequestDisallowInterceptTouchEvent", "(Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;)V", "DispatchToViewState", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PointerInteropFilter implements PointerInputModifier {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "", "(Ljava/lang/String;I)V", "Unknown", "Dispatching", "NotDispatching", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching;

        private static final DispatchToViewState[] $values() [...] // Inlined contents
    }

    private boolean disallowIntercept;
    public Function1 onTouchEvent;
    private final PointerInputFilter pointerInputFilter;
    private RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent;

    public PointerInteropFilter() {
        this.pointerInputFilter = new PointerInputFilter() {
            private DispatchToViewState state;

            {
                this.state = DispatchToViewState.Unknown;
            }

            private final void dispatchToView(PointerEvent pointerEvent0) {
                boolean z;
                List list0 = pointerEvent0.getChanges();
                int v = list0.size();
                if(v - 1 >= 0) {
                    int v2 = 0;
                    while(true) {
                        if(PointerEventKt.anyChangeConsumed(((PointerInputChange)list0.get(v2)))) {
                            z = true;
                            goto label_12;
                        }
                        if(v2 + 1 > v - 1) {
                            break;
                        }
                        ++v2;
                    }
                }
                z = false;
            label_12:
                Offset offset0 = null;
                if(z) {
                    if(this.state == DispatchToViewState.Dispatching) {
                        LayoutCoordinates layoutCoordinates0 = this.getLayoutCoordinates$ui_release();
                        if(layoutCoordinates0 != null) {
                            offset0 = Offset.box-impl(layoutCoordinates0.localToRoot-MK-Hz9U(0L));
                        }
                        if(offset0 == null) {
                            throw new IllegalStateException("layoutCoordinates not set");
                        }
                        PointerInteropUtils_androidKt.toCancelMotionEventScope-d-4ec7I(pointerEvent0, offset0.unbox-impl(), new Function1() {
                            {
                                PointerInteropFilter.this = pointerInteropFilter0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.invoke(((MotionEvent)object0));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(MotionEvent motionEvent0) {
                                Intrinsics.checkNotNullParameter(motionEvent0, "motionEvent");
                                PointerInteropFilter.this.getOnTouchEvent().invoke(motionEvent0);
                            }
                        });
                    }
                    this.state = DispatchToViewState.NotDispatching;
                    return;
                }
                LayoutCoordinates layoutCoordinates1 = this.getLayoutCoordinates$ui_release();
                if(layoutCoordinates1 != null) {
                    offset0 = Offset.box-impl(layoutCoordinates1.localToRoot-MK-Hz9U(0L));
                }
                if(offset0 == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                PointerInteropUtils_androidKt.toMotionEventScope-d-4ec7I(pointerEvent0, offset0.unbox-impl(), new Function1(PointerInteropFilter.this) {
                    {
                        androidx.compose.ui.input.pointer.PointerInteropFilter.pointerInputFilter.1.this = pointerInteropFilter$pointerInputFilter$10;
                        PointerInteropFilter.this = pointerInteropFilter0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((MotionEvent)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(MotionEvent motionEvent0) {
                        Intrinsics.checkNotNullParameter(motionEvent0, "motionEvent");
                        if(motionEvent0.getActionMasked() == 0) {
                            DispatchToViewState pointerInteropFilter$DispatchToViewState0 = ((Boolean)PointerInteropFilter.this.getOnTouchEvent().invoke(motionEvent0)).booleanValue() ? DispatchToViewState.Dispatching : DispatchToViewState.NotDispatching;
                            androidx.compose.ui.input.pointer.PointerInteropFilter.pointerInputFilter.1.this.state = pointerInteropFilter$DispatchToViewState0;
                            return;
                        }
                        PointerInteropFilter.this.getOnTouchEvent().invoke(motionEvent0);
                    }
                });
                if(this.state == DispatchToViewState.Dispatching) {
                    int v3 = list0.size();
                    if(v3 - 1 >= 0) {
                        for(int v1 = 0; true; ++v1) {
                            PointerEventKt.consumeAllChanges(((PointerInputChange)list0.get(v1)));
                            if(v1 + 1 > v3 - 1) {
                                break;
                            }
                        }
                    }
                }
            }

            @Override  // androidx.compose.ui.input.pointer.PointerInputFilter
            public void onCancel() {
                if(this.state == DispatchToViewState.Dispatching) {
                    PointerInteropUtils_androidKt.emptyCancelMotionEventScope(SystemClock.uptimeMillis(), new Function1() {
                        {
                            PointerInteropFilter.this = pointerInteropFilter0;
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.invoke(((MotionEvent)object0));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(MotionEvent motionEvent0) {
                            Intrinsics.checkNotNullParameter(motionEvent0, "motionEvent");
                            PointerInteropFilter.this.getOnTouchEvent().invoke(motionEvent0);
                        }
                    });
                    this.reset();
                }
            }

            @Override  // androidx.compose.ui.input.pointer.PointerInputFilter
            public void onPointerEvent-H0pRuoY(PointerEvent pointerEvent0, PointerEventPass pointerEventPass0, long v) {
                boolean z2;
                boolean z1;
                Intrinsics.checkNotNullParameter(pointerEvent0, "pointerEvent");
                Intrinsics.checkNotNullParameter(pointerEventPass0, "pass");
                List list0 = pointerEvent0.getChanges();
                boolean z = false;
                if(PointerInteropFilter.this.getDisallowIntercept$ui_release()) {
                    z2 = true;
                }
                else {
                    int v1 = list0.size();
                    if(v1 - 1 >= 0) {
                        int v2 = 0;
                        while(true) {
                            PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v2);
                            if(PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange0) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange0)) {
                                z1 = true;
                                goto label_16;
                            }
                            if(v2 + 1 > v1 - 1) {
                                break;
                            }
                            ++v2;
                        }
                    }
                    z1 = false;
                label_16:
                    z2 = z1;
                }
                if(this.state != DispatchToViewState.NotDispatching) {
                    if(pointerEventPass0 == PointerEventPass.Initial && z2) {
                        this.dispatchToView(pointerEvent0);
                    }
                    if(pointerEventPass0 == PointerEventPass.Final && !z2) {
                        this.dispatchToView(pointerEvent0);
                    }
                }
                if(pointerEventPass0 == PointerEventPass.Final) {
                    int v3 = list0.size();
                    if(v3 - 1 >= 0) {
                        int v4 = 0;
                        while(PointerEventKt.changedToUpIgnoreConsumed(((PointerInputChange)list0.get(v4)))) {
                            if(v4 + 1 > v3 - 1) {
                                goto label_36;
                            }
                            ++v4;
                        }
                    }
                    else {
                    label_36:
                        z = true;
                    }
                    if(z) {
                        this.reset();
                    }
                }
            }

            private final void reset() {
                this.state = DispatchToViewState.Unknown;
                PointerInteropFilter.this.setDisallowIntercept$ui_release(false);
            }
        };
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean all(Function1 function10) {
        return DefaultImpls.all(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean any(Function1 function10) {
        return DefaultImpls.any(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldIn(Object object0, Function2 function20) {
        return DefaultImpls.foldIn(this, object0, function20);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldOut(Object object0, Function2 function20) {
        return DefaultImpls.foldOut(this, object0, function20);
    }

    public final boolean getDisallowIntercept$ui_release() {
        return this.disallowIntercept;
    }

    public final Function1 getOnTouchEvent() {
        Function1 function10 = this.onTouchEvent;
        if(function10 != null) {
            return function10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
        throw null;
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputModifier
    public PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final RequestDisallowInterceptTouchEvent getRequestDisallowInterceptTouchEvent() {
        return this.requestDisallowInterceptTouchEvent;
    }

    public final void setDisallowIntercept$ui_release(boolean z) {
        this.disallowIntercept = z;
    }

    public final void setOnTouchEvent(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "<set-?>");
        this.onTouchEvent = function10;
    }

    public final void setRequestDisallowInterceptTouchEvent(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0) {
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent1 = this.requestDisallowInterceptTouchEvent;
        if(requestDisallowInterceptTouchEvent1 != null) {
            requestDisallowInterceptTouchEvent1.setPointerInteropFilter$ui_release(null);
        }
        this.requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent0;
        if(requestDisallowInterceptTouchEvent0 != null) {
            requestDisallowInterceptTouchEvent0.setPointerInteropFilter$ui_release(this);
        }
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }
}

