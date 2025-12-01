package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A,\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001A\u00020\tH\u0001¨\u0006\n"}, d2 = {"pointerInteropFilter", "Landroidx/compose/ui/Modifier;", "requestDisallowInterceptTouchEvent", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "onTouchEvent", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "view", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class PointerInteropFilter_androidKt {
    @ExperimentalComposeUiApi
    public static final Modifier pointerInteropFilter(Modifier modifier0, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0, Function1 function10) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "onTouchEvent");
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3(function10, requestDisallowInterceptTouchEvent0) {
            final Function1 $onTouchEvent;
            final RequestDisallowInterceptTouchEvent $requestDisallowInterceptTouchEvent;

            {
                this.$onTouchEvent = function10;
                this.$requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent0;
                super(3);
            }

            public final Modifier invoke(Modifier modifier0, Composer composer0, int v) {
                Intrinsics.checkNotNullParameter(modifier0, "$this$composed");
                composer0.startReplaceableGroup(0x23BD1DCE);
                ComposerKt.sourceInformation(composer0, "C71@3078L35:PointerInteropFilter.android.kt#a556rk");
                composer0.startReplaceableGroup(0xFFC7BCB7);
                ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
                PointerInteropFilter pointerInteropFilter0 = composer0.rememberedValue();
                if(pointerInteropFilter0 == Composer.Companion.getEmpty()) {
                    pointerInteropFilter0 = new PointerInteropFilter();
                    composer0.updateRememberedValue(pointerInteropFilter0);
                }
                composer0.endReplaceableGroup();
                pointerInteropFilter0.setOnTouchEvent(this.$onTouchEvent);
                pointerInteropFilter0.setRequestDisallowInterceptTouchEvent(this.$requestDisallowInterceptTouchEvent);
                composer0.endReplaceableGroup();
                return pointerInteropFilter0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.pointerInteropFilter..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final Function1 $onTouchEvent$inlined;
            final RequestDisallowInterceptTouchEvent $requestDisallowInterceptTouchEvent$inlined;

            public androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.pointerInteropFilter..inlined.debugInspectorInfo.1(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0, Function1 function10) {
                this.$requestDisallowInterceptTouchEvent$inlined = requestDisallowInterceptTouchEvent0;
                this.$onTouchEvent$inlined = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("pointerInteropFilter");
                inspectorInfo0.getProperties().set("requestDisallowInterceptTouchEvent", this.$requestDisallowInterceptTouchEvent$inlined);
                inspectorInfo0.getProperties().set("onTouchEvent", this.$onTouchEvent$inlined);
            }
        }

    }

    @ExperimentalComposeUiApi
    public static final Modifier pointerInteropFilter(Modifier modifier0, AndroidViewHolder androidViewHolder0) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(androidViewHolder0, "view");
        PointerInteropFilter pointerInteropFilter0 = new PointerInteropFilter();
        pointerInteropFilter0.setOnTouchEvent(new Function1(androidViewHolder0) {
            final AndroidViewHolder $view;

            {
                this.$view = androidViewHolder0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(((MotionEvent)object0)));
            }

            public final boolean invoke(MotionEvent motionEvent0) {
                Intrinsics.checkNotNullParameter(motionEvent0, "motionEvent");
                return this.$view.dispatchTouchEvent(motionEvent0);
            }
        });
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0 = new RequestDisallowInterceptTouchEvent();
        pointerInteropFilter0.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent0);
        androidViewHolder0.setOnRequestDisallowInterceptTouchEvent$ui_release(requestDisallowInterceptTouchEvent0);
        return modifier0.then(pointerInteropFilter0);
    }

    public static Modifier pointerInteropFilter$default(Modifier modifier0, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            requestDisallowInterceptTouchEvent0 = null;
        }
        return PointerInteropFilter_androidKt.pointerInteropFilter(modifier0, requestDisallowInterceptTouchEvent0, function10);
    }
}

