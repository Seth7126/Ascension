package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001AO\u0010\u0006\u001A\u00020\u0007*\u00020\u00072\b\u0010\b\u001A\u0004\u0018\u00010\t2\b\u0010\n\u001A\u0004\u0018\u00010\t2\'\u0010\u000B\u001A#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\u0006\u0012\u0004\u0018\u00010\t0\f¢\u0006\u0002\b\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001AE\u0010\u0006\u001A\u00020\u0007*\u00020\u00072\b\u0010\b\u001A\u0004\u0018\u00010\t2\'\u0010\u000B\u001A#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\u0006\u0012\u0004\u0018\u00010\t0\f¢\u0006\u0002\b\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001AS\u0010\u0006\u001A\u00020\u0007*\u00020\u00072\u0016\u0010\u0013\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0014\"\u0004\u0018\u00010\t2\'\u0010\u000B\u001A#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\u0006\u0012\u0004\u0018\u00010\t0\f¢\u0006\u0002\b\u0010ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001A=\u0010\u0006\u001A\u00020\u0007*\u00020\u00072\'\u0010\u000B\u001A#\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\u0006\u0012\u0004\u0018\u00010\t0\f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"DownChangeConsumed", "Landroidx/compose/ui/input/pointer/ConsumedData;", "EmptyPointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "PointerInputModifierNoParamError", "", "pointerInput", "Landroidx/compose/ui/Modifier;", "key1", "", "key2", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "keys", "", "(Landroidx/compose/ui/Modifier;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SuspendingPointerInputFilterKt {
    private static final ConsumedData DownChangeConsumed = null;
    private static final PointerEvent EmptyPointerEvent = null;
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more \'key\' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";

    static {
        SuspendingPointerInputFilterKt.DownChangeConsumed = new ConsumedData(false, true, 1, null);
        SuspendingPointerInputFilterKt.EmptyPointerEvent = new PointerEvent(CollectionsKt.emptyList());
    }

    public static final Modifier pointerInput(Modifier modifier0, Object object0, Object object1, Function2 function20) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "block");
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3(object0, object1, function20) {
            final Function2 $block;
            final Object $key1;
            final Object $key2;

            {
                this.$key1 = object0;
                this.$key2 = object1;
                this.$block = function20;
                super(3);
            }

            public final Modifier invoke(Modifier modifier0, Composer composer0, int v) {
                Intrinsics.checkNotNullParameter(modifier0, "$this$composed");
                composer0.startReplaceableGroup(674420811);
                ComposerKt.sourceInformation(composer0, "C193@8102L7,194@8161L7,*195@8173L78,196@8268L64:SuspendingPointerInputFilter.kt#a556rk");
                ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
                Object object0 = composer0.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer0);
                ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
                Object object1 = composer0.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer0);
                composer0.startReplaceableGroup(-3686930);
                ComposerKt.sourceInformation(composer0, "C(remember)P(1):Composables.kt#9igjgp");
                boolean z = composer0.changed(((Density)object0));
                SuspendingPointerInputFilter suspendingPointerInputFilter0 = composer0.rememberedValue();
                if(z || suspendingPointerInputFilter0 == Composer.Companion.getEmpty()) {
                    suspendingPointerInputFilter0 = new SuspendingPointerInputFilter(((ViewConfiguration)object1), ((Density)object0));
                    composer0.updateRememberedValue(suspendingPointerInputFilter0);
                }
                composer0.endReplaceableGroup();
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.4.2.1 suspendingPointerInputFilterKt$pointerInput$4$2$10 = new Function2(suspendingPointerInputFilter0, null) {
                    final Function2 $block;
                    final SuspendingPointerInputFilter $this_apply;
                    int label;

                    {
                        this.$block = function20;
                        this.$this_apply = suspendingPointerInputFilter0;
                        super(2, continuation0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object object0, Continuation continuation0) {
                        return new androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.4.2.1(this.$block, this.$this_apply, continuation0);
                    }

                    @Override  // kotlin.jvm.functions.Function2
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                    }

                    public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                        return ((androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.4.2.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch(this.label) {
                            case 0: {
                                ResultKt.throwOnFailure(object0);
                                this.label = 1;
                                return this.$block.invoke(this.$this_apply, this) == object1 ? object1 : Unit.INSTANCE;
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
                EffectsKt.LaunchedEffect(suspendingPointerInputFilter0, this.$key1, this.$key2, suspendingPointerInputFilterKt$pointerInput$4$2$10, composer0, 0x240);
                composer0.endReplaceableGroup();
                return suspendingPointerInputFilter0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput..inlined.debugInspectorInfo.2 extends Lambda implements Function1 {
            final Function2 $block$inlined;
            final Object $key1$inlined;
            final Object $key2$inlined;

            public androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput..inlined.debugInspectorInfo.2(Object object0, Object object1, Function2 function20) {
                this.$key1$inlined = object0;
                this.$key2$inlined = object1;
                this.$block$inlined = function20;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("pointerInput");
                inspectorInfo0.getProperties().set("key1", this.$key1$inlined);
                inspectorInfo0.getProperties().set("key2", this.$key2$inlined);
                inspectorInfo0.getProperties().set("block", this.$block$inlined);
            }
        }

    }

    public static final Modifier pointerInput(Modifier modifier0, Object object0, Function2 function20) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "block");
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3(object0, function20) {
            final Function2 $block;
            final Object $key1;

            {
                this.$key1 = object0;
                this.$block = function20;
                super(3);
            }

            public final Modifier invoke(Modifier modifier0, Composer composer0, int v) {
                Intrinsics.checkNotNullParameter(modifier0, "$this$composed");
                composer0.startReplaceableGroup(674419630);
                ComposerKt.sourceInformation(composer0, "C162@6921L7,163@6980L7,*164@6992L78,165@7087L58:SuspendingPointerInputFilter.kt#a556rk");
                ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
                Object object0 = composer0.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer0);
                ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
                Object object1 = composer0.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer0);
                composer0.startReplaceableGroup(-3686930);
                ComposerKt.sourceInformation(composer0, "C(remember)P(1):Composables.kt#9igjgp");
                boolean z = composer0.changed(((Density)object0));
                SuspendingPointerInputFilter suspendingPointerInputFilter0 = composer0.rememberedValue();
                if(z || suspendingPointerInputFilter0 == Composer.Companion.getEmpty()) {
                    suspendingPointerInputFilter0 = new SuspendingPointerInputFilter(((ViewConfiguration)object1), ((Density)object0));
                    composer0.updateRememberedValue(suspendingPointerInputFilter0);
                }
                composer0.endReplaceableGroup();
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.2.2.1 suspendingPointerInputFilterKt$pointerInput$2$2$10 = new Function2(suspendingPointerInputFilter0, null) {
                    final Function2 $block;
                    final SuspendingPointerInputFilter $this_apply;
                    int label;

                    {
                        this.$block = function20;
                        this.$this_apply = suspendingPointerInputFilter0;
                        super(2, continuation0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object object0, Continuation continuation0) {
                        return new androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.2.2.1(this.$block, this.$this_apply, continuation0);
                    }

                    @Override  // kotlin.jvm.functions.Function2
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                    }

                    public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                        return ((androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.2.2.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch(this.label) {
                            case 0: {
                                ResultKt.throwOnFailure(object0);
                                this.label = 1;
                                return this.$block.invoke(this.$this_apply, this) == object1 ? object1 : Unit.INSTANCE;
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
                EffectsKt.LaunchedEffect(suspendingPointerInputFilter0, this.$key1, suspendingPointerInputFilterKt$pointerInput$2$2$10, composer0, 0x40);
                composer0.endReplaceableGroup();
                return suspendingPointerInputFilter0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final Function2 $block$inlined;
            final Object $key1$inlined;

            public androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput..inlined.debugInspectorInfo.1(Object object0, Function2 function20) {
                this.$key1$inlined = object0;
                this.$block$inlined = function20;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("pointerInput");
                inspectorInfo0.getProperties().set("key1", this.$key1$inlined);
                inspectorInfo0.getProperties().set("block", this.$block$inlined);
            }
        }

    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Modifier.pointerInput must provide one or more \'key\' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.")
    public static final Modifier pointerInput(Modifier modifier0, Function2 function20) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "block");
        throw new IllegalStateException("Modifier.pointerInput must provide one or more \'key\' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.");
    }

    public static final Modifier pointerInput(Modifier modifier0, Object[] arr_object, Function2 function20) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "keys");
        Intrinsics.checkNotNullParameter(function20, "block");
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3(arr_object, function20) {
            final Function2 $block;
            final Object[] $keys;

            {
                this.$keys = arr_object;
                this.$block = function20;
                super(3);
            }

            public final Modifier invoke(Modifier modifier0, Composer composer0, int v) {
                Intrinsics.checkNotNullParameter(modifier0, "$this$composed");
                composer0.startReplaceableGroup(0x2832DCB8);
                ComposerKt.sourceInformation(composer0, "C221@9235L7,222@9294L7,*223@9306L78,224@9401L59:SuspendingPointerInputFilter.kt#a556rk");
                ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
                Object object0 = composer0.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer0);
                ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
                Object object1 = composer0.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer0);
                composer0.startReplaceableGroup(-3686930);
                ComposerKt.sourceInformation(composer0, "C(remember)P(1):Composables.kt#9igjgp");
                boolean z = composer0.changed(((Density)object0));
                SuspendingPointerInputFilter suspendingPointerInputFilter0 = composer0.rememberedValue();
                if(z || suspendingPointerInputFilter0 == Composer.Companion.getEmpty()) {
                    suspendingPointerInputFilter0 = new SuspendingPointerInputFilter(((ViewConfiguration)object1), ((Density)object0));
                    composer0.updateRememberedValue(suspendingPointerInputFilter0);
                }
                composer0.endReplaceableGroup();
                SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
                spreadBuilder0.add(suspendingPointerInputFilter0);
                spreadBuilder0.addSpread(this.$keys);
                EffectsKt.LaunchedEffect(spreadBuilder0.toArray(new Object[spreadBuilder0.size()]), new Function2(suspendingPointerInputFilter0, null) {
                    final Function2 $block;
                    final SuspendingPointerInputFilter $this_apply;
                    int label;

                    {
                        this.$block = function20;
                        this.$this_apply = suspendingPointerInputFilter0;
                        super(2, continuation0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object object0, Continuation continuation0) {
                        return new androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.6.2.1(this.$block, this.$this_apply, continuation0);
                    }

                    @Override  // kotlin.jvm.functions.Function2
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                    }

                    public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                        return ((androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput.6.2.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch(this.label) {
                            case 0: {
                                ResultKt.throwOnFailure(object0);
                                this.label = 1;
                                return this.$block.invoke(this.$this_apply, this) == object1 ? object1 : Unit.INSTANCE;
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
                composer0.endReplaceableGroup();
                return suspendingPointerInputFilter0;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput..inlined.debugInspectorInfo.3 extends Lambda implements Function1 {
            final Function2 $block$inlined;
            final Object[] $keys$inlined;

            public androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput..inlined.debugInspectorInfo.3(Object[] arr_object, Function2 function20) {
                this.$keys$inlined = arr_object;
                this.$block$inlined = function20;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("pointerInput");
                inspectorInfo0.getProperties().set("keys", this.$keys$inlined);
                inspectorInfo0.getProperties().set("block", this.$block$inlined);
            }
        }

    }
}

