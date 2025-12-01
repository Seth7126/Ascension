package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.DpRect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\u008C\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001KB\u0017\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004\u00A2\u0006\u0002\u0010\bJ@\u0010\u001D\u001A\u0002H\u001E\"\u0004\b\u0000\u0010\u001E2\'\u0010\u001F\u001A#\b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001E0\"\u0012\u0006\u0012\u0004\u0018\u00010#0 \u00A2\u0006\u0002\b$H\u0096@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010%J\u0018\u0010&\u001A\u00020\'2\u0006\u0010(\u001A\u00020\r2\u0006\u0010)\u001A\u00020*H\u0002J-\u0010+\u001A\u00020\'2\u0006\u0010)\u001A\u00020*2\u001A\u0010\u001F\u001A\u0016\u0012\f\u0012\n\u0012\u0002\b\u00030\u0013R\u00020\u0000\u0012\u0004\u0012\u00020\'0,H\u0082\bJ\b\u0010-\u001A\u00020\'H\u0016J-\u0010.\u001A\u00020\'2\u0006\u0010(\u001A\u00020\r2\u0006\u0010)\u001A\u00020*2\u0006\u0010/\u001A\u00020\nH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b0\u00101J\u001A\u00102\u001A\u000203*\u000204H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b5\u00106J\u001A\u00102\u001A\u000203*\u000207H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b8\u00109J\u001A\u0010:\u001A\u000204*\u000207H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b;\u0010<J\u001D\u0010:\u001A\u000204*\u00020\u000EH\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b=\u0010>J\u001D\u0010:\u001A\u000204*\u000203H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b=\u0010?J\u001A\u0010@\u001A\u00020\u000E*\u000204H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bA\u0010>J\u001A\u0010@\u001A\u00020\u000E*\u000207H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bB\u0010<J\r\u0010C\u001A\u00020D*\u00020EH\u0097\u0001J\u001A\u0010F\u001A\u000207*\u000204H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bG\u0010HJ\u001D\u0010F\u001A\u000207*\u00020\u000EH\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\bI\u0010HJ\u001D\u0010F\u001A\u000207*\u000203H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\bI\u0010JR\u0019\u0010\t\u001A\u00020\nX\u0082\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010\u000BR\u000E\u0010\f\u001A\u00020\rX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001A\u00020\u000E8\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u001C\u0010\u0011\u001A\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\u0013R\u00020\u00000\u0012X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001A\u00020\u000E8\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\u0010R\u0010\u0010\u0016\u001A\u0004\u0018\u00010\rX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001C\u0010\u0017\u001A\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030\u0013R\u00020\u00000\u0012X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001A\u00020\u00018VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR\u0014\u0010\u0005\u001A\u00020\u0006X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u001C\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006L"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "density", "(Landroidx/compose/ui/platform/ViewConfiguration;Landroidx/compose/ui/unit/Density;)V", "boundsSize", "Landroidx/compose/ui/unit/IntSize;", "J", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "", "getDensity", "()F", "dispatchingPointerHandlers", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine;", "fontScale", "getFontScale", "lastPointerEvent", "pointerHandlers", "pointerInputFilter", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEventScope", "R", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPointerEvent", "", "pointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "forEachCurrentPointerHandler", "Lkotlin/Function1;", "onCancel", "onPointerEvent", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "PointerEventHandlerCoroutine", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SuspendingPointerInputFilter extends PointerInputFilter implements PointerInputModifier, PointerInputScope, Density {
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0013\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u00A2\u0006\u0002\u0010\u0006J\u0019\u0010!\u001A\u00020\u000E2\u0006\u0010\"\u001A\u00020\bH\u0096@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010#J\u0010\u0010$\u001A\u00020%2\b\u0010&\u001A\u0004\u0018\u00010\'J\u0016\u0010(\u001A\u00020%2\u0006\u0010)\u001A\u00020\u000E2\u0006\u0010\"\u001A\u00020\bJ\u001E\u0010*\u001A\u00020%2\f\u0010+\u001A\b\u0012\u0004\u0012\u00028\u00000,H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010-J\u001A\u0010.\u001A\u00020/*\u000200H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b1\u00102J\u001A\u0010.\u001A\u00020/*\u000203H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b4\u00105J\u001A\u00106\u001A\u000200*\u000203H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b7\u00108J\u001D\u00106\u001A\u000200*\u00020\u0012H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b9\u0010:J\u001D\u00106\u001A\u000200*\u00020/H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b9\u0010;J\u001A\u0010<\u001A\u00020\u0012*\u000200H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b=\u0010:J\u001A\u0010<\u001A\u00020\u0012*\u000203H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b>\u00108J\r\u0010?\u001A\u00020@*\u00020AH\u0097\u0001J\u001A\u0010B\u001A\u000203*\u000200H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bC\u0010DJ\u001D\u0010B\u001A\u000203*\u00020\u0012H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\bE\u0010DJ\u001D\u0010B\u001A\u000203*\u00020/H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\bE\u0010FR\u000E\u0010\u0007\u001A\u00020\bX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\t\u001A\u00020\nX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0014\u0010\r\u001A\u00020\u000E8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0011\u001A\u00020\u00128\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001A\u00020\u00128\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001A\n\u0012\u0004\u0012\u00020\u000E\u0018\u00010\u0018X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001D\u0010\u0019\u001A\u00020\u001A8VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u0014\u0010\u001D\u001A\u00020\u001E8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001F\u0010 \u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006G"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine;", "R", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/coroutines/Continuation;", "completion", "(Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilter;Lkotlin/coroutines/Continuation;)V", "awaitPass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "pointerAwaiter", "Lkotlinx/coroutines/CancellableContinuation;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEvent", "pass", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "cause", "", "offerPointerEvent", "event", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    final class PointerEventHandlerCoroutine implements AwaitPointerEventScope, Density, Continuation {
        private final SuspendingPointerInputFilter $$delegate_0;
        private PointerEventPass awaitPass;
        private final Continuation completion;
        private final CoroutineContext context;
        private CancellableContinuation pointerAwaiter;

        public PointerEventHandlerCoroutine(Continuation continuation0) {
            Intrinsics.checkNotNullParameter(suspendingPointerInputFilter0, "this$0");
            Intrinsics.checkNotNullParameter(continuation0, "completion");
            SuspendingPointerInputFilter.this = suspendingPointerInputFilter0;
            super();
            this.completion = continuation0;
            this.$$delegate_0 = suspendingPointerInputFilter0;
            this.awaitPass = PointerEventPass.Main;
            this.context = EmptyCoroutineContext.INSTANCE;
        }

        @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public Object awaitPointerEvent(PointerEventPass pointerEventPass0, Continuation continuation0) {
            CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation0), 1);
            cancellableContinuationImpl0.initCancellability();
            this.awaitPass = pointerEventPass0;
            this.pointerAwaiter = cancellableContinuationImpl0;
            Object object0 = cancellableContinuationImpl0.getResult();
            if(object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation0);
            }
            return object0;
        }

        public final void cancel(Throwable throwable0) {
            CancellableContinuation cancellableContinuation0 = this.pointerAwaiter;
            if(cancellableContinuation0 != null) {
                cancellableContinuation0.cancel(throwable0);
            }
            this.pointerAwaiter = null;
        }

        @Override  // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.context;
        }

        @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public PointerEvent getCurrentEvent() {
            return SuspendingPointerInputFilter.this.currentEvent;
        }

        @Override  // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override  // androidx.compose.ui.unit.Density
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public long getSize-YbymL2g() {
            return SuspendingPointerInputFilter.this.boundsSize;
        }

        @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public ViewConfiguration getViewConfiguration() {
            return SuspendingPointerInputFilter.this.getViewConfiguration();
        }

        public final void offerPointerEvent(PointerEvent pointerEvent0, PointerEventPass pointerEventPass0) {
            Intrinsics.checkNotNullParameter(pointerEvent0, "event");
            Intrinsics.checkNotNullParameter(pointerEventPass0, "pass");
            if(pointerEventPass0 == this.awaitPass) {
                CancellableContinuation cancellableContinuation0 = this.pointerAwaiter;
                if(cancellableContinuation0 != null) {
                    this.pointerAwaiter = null;
                    cancellableContinuation0.resumeWith(pointerEvent0);
                }
            }
        }

        @Override  // kotlin.coroutines.Continuation
        public void resumeWith(Object object0) {
            synchronized(SuspendingPointerInputFilter.this.pointerHandlers) {
                SuspendingPointerInputFilter.this.pointerHandlers.remove(this);
            }
            this.completion.resumeWith(object0);
        }

        @Override  // androidx.compose.ui.unit.Density
        public int roundToPx--R2X_6o(long v) {
            return this.$$delegate_0.roundToPx--R2X_6o(v);
        }

        @Override  // androidx.compose.ui.unit.Density
        public int roundToPx-0680j_4(float f) {
            return this.$$delegate_0.roundToPx-0680j_4(f);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float toDp-GaN1DYA(long v) {
            return this.$$delegate_0.toDp-GaN1DYA(v);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float toDp-u2uoSUM(float f) {
            return this.$$delegate_0.toDp-u2uoSUM(f);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float toDp-u2uoSUM(int v) {
            return this.$$delegate_0.toDp-u2uoSUM(v);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float toPx--R2X_6o(long v) {
            return this.$$delegate_0.toPx--R2X_6o(v);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float toPx-0680j_4(float f) {
            return this.$$delegate_0.toPx-0680j_4(f);
        }

        @Override  // androidx.compose.ui.unit.Density
        public Rect toRect(DpRect dpRect0) {
            Intrinsics.checkNotNullParameter(dpRect0, "<this>");
            return this.$$delegate_0.toRect(dpRect0);
        }

        @Override  // androidx.compose.ui.unit.Density
        public long toSp-0xMU5do(float f) {
            return this.$$delegate_0.toSp-0xMU5do(f);
        }

        @Override  // androidx.compose.ui.unit.Density
        public long toSp-kPz2Gy4(float f) {
            return this.$$delegate_0.toSp-kPz2Gy4(f);
        }

        @Override  // androidx.compose.ui.unit.Density
        public long toSp-kPz2Gy4(int v) {
            return this.$$delegate_0.toSp-kPz2Gy4(v);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[PointerEventPass.values().length];
            arr_v[PointerEventPass.Initial.ordinal()] = 1;
            arr_v[PointerEventPass.Final.ordinal()] = 2;
            arr_v[PointerEventPass.Main.ordinal()] = 3;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    private final Density $$delegate_0;
    private long boundsSize;
    private PointerEvent currentEvent;
    private final MutableVector dispatchingPointerHandlers;
    private PointerEvent lastPointerEvent;
    private final MutableVector pointerHandlers;
    private final ViewConfiguration viewConfiguration;

    public SuspendingPointerInputFilter(ViewConfiguration viewConfiguration0, Density density0) {
        Intrinsics.checkNotNullParameter(viewConfiguration0, "viewConfiguration");
        Intrinsics.checkNotNullParameter(density0, "density");
        super();
        this.viewConfiguration = viewConfiguration0;
        this.$$delegate_0 = density0;
        this.currentEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        this.pointerHandlers = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.dispatchingPointerHandlers = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = 0L;
    }

    public SuspendingPointerInputFilter(ViewConfiguration viewConfiguration0, Density density0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            density0 = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        }
        this(viewConfiguration0, density0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean all(Function1 function10) {
        return DefaultImpls.all(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean any(Function1 function10) {
        return DefaultImpls.any(this, function10);
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    public Object awaitPointerEventScope(Function2 function20, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        PointerEventHandlerCoroutine suspendingPointerInputFilter$PointerEventHandlerCoroutine0 = new PointerEventHandlerCoroutine(this, cancellableContinuationImpl0);
        synchronized(this.pointerHandlers) {
            this.pointerHandlers.add(suspendingPointerInputFilter$PointerEventHandlerCoroutine0);
            ContinuationKt.createCoroutine(function20, suspendingPointerInputFilter$PointerEventHandlerCoroutine0, suspendingPointerInputFilter$PointerEventHandlerCoroutine0).resumeWith(Unit.INSTANCE);
        }
        cancellableContinuationImpl0.invokeOnCancellation(new Function1() {
            final PointerEventHandlerCoroutine $handlerCoroutine;

            {
                this.$handlerCoroutine = suspendingPointerInputFilter$PointerEventHandlerCoroutine0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(Throwable throwable0) {
                this.$handlerCoroutine.cancel(throwable0);
            }
        });
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent0, PointerEventPass pointerEventPass0) {
        synchronized(this.pointerHandlers) {
            MutableVector mutableVector1 = this.dispatchingPointerHandlers;
            mutableVector1.addAll(mutableVector1.getSize(), this.pointerHandlers);
        }
        try {
            switch(pointerEventPass0) {
                case 1: 
                case 2: {
                    MutableVector mutableVector2 = this.dispatchingPointerHandlers;
                    int v2 = mutableVector2.getSize();
                    if(v2 > 0) {
                        Object[] arr_object = mutableVector2.getContent();
                        int v3 = 0;
                        do {
                            ((PointerEventHandlerCoroutine)arr_object[v3]).offerPointerEvent(pointerEvent0, pointerEventPass0);
                            ++v3;
                        }
                        while(v3 < v2);
                    }
                    break;
                }
                case 3: {
                    MutableVector mutableVector3 = this.dispatchingPointerHandlers;
                    int v4 = mutableVector3.getSize();
                    if(v4 > 0) {
                        int v5 = v4 - 1;
                        Object[] arr_object1 = mutableVector3.getContent();
                        while(true) {
                            ((PointerEventHandlerCoroutine)arr_object1[v5]).offerPointerEvent(pointerEvent0, pointerEventPass0);
                            --v5;
                            if(v5 < 0) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldIn(Object object0, Function2 function20) {
        return DefaultImpls.foldIn(this, object0, function20);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldOut(Object object0, Function2 function20) {
        return DefaultImpls.foldOut(this, object0, function20);
    }

    private final void forEachCurrentPointerHandler(PointerEventPass pointerEventPass0, Function1 function10) {
        synchronized(this.pointerHandlers) {
            MutableVector mutableVector1 = this.dispatchingPointerHandlers;
            mutableVector1.addAll(mutableVector1.getSize(), this.pointerHandlers);
        }
        try {
            switch(pointerEventPass0) {
                case 1: 
                case 2: {
                    MutableVector mutableVector2 = this.dispatchingPointerHandlers;
                    int v2 = mutableVector2.getSize();
                    if(v2 > 0) {
                        Object[] arr_object = mutableVector2.getContent();
                        int v3 = 0;
                        do {
                            function10.invoke(arr_object[v3]);
                            ++v3;
                        }
                        while(v3 < v2);
                    }
                    break;
                }
                case 3: {
                    MutableVector mutableVector3 = this.dispatchingPointerHandlers;
                    int v4 = mutableVector3.getSize();
                    if(v4 > 0) {
                        int v5 = v4 - 1;
                        Object[] arr_object1 = mutableVector3.getContent();
                        while(true) {
                            function10.invoke(arr_object1[v5]);
                            --v5;
                            if(v5 < 0) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputModifier
    public PointerInputFilter getPointerInputFilter() {
        return this;
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        PointerEvent pointerEvent0 = this.lastPointerEvent;
        if(pointerEvent0 == null) {
            return;
        }
        List list0 = pointerEvent0.getChanges();
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v1);
                PointerInputChange pointerInputChange1 = pointerInputChange0.getPressed() ? PointerInputChange.copy-Ezr-O64$default(pointerInputChange0, 0L, 0L, 0L, false, pointerInputChange0.getUptimeMillis(), pointerInputChange0.getPosition-F1C5BW0(), pointerInputChange0.getPressed(), SuspendingPointerInputFilterKt.DownChangeConsumed, 0, 0x107, null) : null;
                if(pointerInputChange1 != null) {
                    arrayList0.add(pointerInputChange1);
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        PointerEvent pointerEvent1 = new PointerEvent(arrayList0);
        this.currentEvent = pointerEvent1;
        this.dispatchPointerEvent(pointerEvent1, PointerEventPass.Initial);
        this.dispatchPointerEvent(pointerEvent1, PointerEventPass.Main);
        this.dispatchPointerEvent(pointerEvent1, PointerEventPass.Final);
        this.lastPointerEvent = null;
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onPointerEvent-H0pRuoY(PointerEvent pointerEvent0, PointerEventPass pointerEventPass0, long v) {
        int v2;
        Intrinsics.checkNotNullParameter(pointerEvent0, "pointerEvent");
        Intrinsics.checkNotNullParameter(pointerEventPass0, "pass");
        this.boundsSize = v;
        if(pointerEventPass0 == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent0;
        }
        this.dispatchPointerEvent(pointerEvent0, pointerEventPass0);
        List list0 = pointerEvent0.getChanges();
        int v1 = list0.size();
        if(v1 - 1 >= 0) {
            v2 = 0;
            int v3 = 0;
            while(PointerEventKt.changedToUpIgnoreConsumed(((PointerInputChange)list0.get(v3)))) {
                if(v3 + 1 > v1 - 1) {
                    goto label_16;
                }
                ++v3;
            }
        }
        else {
        label_16:
            v2 = 1;
        }
        if((v2 ^ 1) == 0) {
            pointerEvent0 = null;
        }
        this.lastPointerEvent = pointerEvent0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx--R2X_6o(long v) {
        return this.$$delegate_0.roundToPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx-0680j_4(float f) {
        return this.$$delegate_0.roundToPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-GaN1DYA(long v) {
        return this.$$delegate_0.toDp-GaN1DYA(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(float f) {
        return this.$$delegate_0.toDp-u2uoSUM(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(int v) {
        return this.$$delegate_0.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toPx--R2X_6o(long v) {
        return this.$$delegate_0.toPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toPx-0680j_4(float f) {
        return this.$$delegate_0.toPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect0) {
        Intrinsics.checkNotNullParameter(dpRect0, "<this>");
        return this.$$delegate_0.toRect(dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-0xMU5do(float f) {
        return this.$$delegate_0.toSp-0xMU5do(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(float f) {
        return this.$$delegate_0.toSp-kPz2Gy4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(int v) {
        return this.$$delegate_0.toSp-kPz2Gy4(v);
    }
}

