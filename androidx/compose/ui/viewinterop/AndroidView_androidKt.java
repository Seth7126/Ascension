package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001AK\u0010\u0007\u001A\u00020\u0003\"\b\b\u0000\u0010\b*\u00020\u00022\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\u00012\b\b\u0002\u0010\u000B\u001A\u00020\f2\u0014\b\u0002\u0010\r\u001A\u000E\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0002\u0010\u000E\"\"\u0010\u0000\u001A\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u000F"}, d2 = {"NoOpUpdate", "Lkotlin/Function1;", "Landroid/view/View;", "", "Lkotlin/ExtensionFunctionType;", "getNoOpUpdate", "()Lkotlin/jvm/functions/Function1;", "AndroidView", "T", "factory", "Landroid/content/Context;", "modifier", "Landroidx/compose/ui/Modifier;", "update", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidView_androidKt {
    private static final Function1 NoOpUpdate;

    static {
        AndroidView_androidKt.NoOpUpdate = AndroidView_androidKt.NoOpUpdate.1.INSTANCE;
    }

    public static final void AndroidView(Function1 function10, Modifier modifier0, Function1 function11, Composer composer0, int v, int v1) {
        Function1 function12;
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(function10, "factory");
        Composer composer1 = composer0.startRestartGroup(-88762710);
        ComposerKt.sourceInformation(composer1, "C(AndroidView)74@3443L7,80@3859L7,81@3914L7,82@3948L28,83@4028L7,84@4055L23,85@4121L40,86@4166L1085:AndroidView.android.kt#z33iqn");
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(function10) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x70) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(function11) ? 0x100 : 0x80);
        }
        if((v2 & 731 ^ 0x92) != 0 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.Companion;
            Function1 function13 = (v1 & 4) == 0 ? function11 : AndroidView_androidKt.NoOpUpdate;
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object0 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            Modifier modifier3 = ComposedModifierKt.materialize(composer1, SemanticsModifierKt.semantics(modifier2, true, androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.modifierWithSemantics.1.INSTANCE));
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object1 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object2 = composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            CompositionContext compositionContext0 = ComposablesKt.rememberCompositionContext(composer1, 0);
            ComposerKt.sourceInformationMarkerStart(composer1, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object object3 = composer1.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
            ComposerKt.sourceInformationMarkerEnd(composer1);
            String s = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(composer1, 0));
            composer1.startReplaceableGroup(0xFFC7BCB7);
            ComposerKt.sourceInformation(composer1, "C(remember):Composables.kt#9igjgp");
            Ref ref0 = composer1.rememberedValue();
            if(ref0 == Composer.Companion.getEmpty()) {
                ref0 = new Ref();
                composer1.updateRememberedValue(ref0);
            }
            composer1.endReplaceableGroup();
            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.1 androidView_androidKt$AndroidView$10 = new Function0(((Context)object0), compositionContext0, function10, ((SaveableStateRegistry)object3), s, ref0) {
                final Context $context;
                final Function1 $factory;
                final CompositionContext $parentReference;
                final String $stateKey;
                final SaveableStateRegistry $stateRegistry;
                final Ref $viewFactoryHolderRef;

                {
                    this.$context = context0;
                    this.$parentReference = compositionContext0;
                    this.$factory = function10;
                    this.$stateRegistry = saveableStateRegistry0;
                    this.$stateKey = s;
                    this.$viewFactoryHolderRef = ref0;
                    super(0);
                }

                public final LayoutNode invoke() {
                    ViewFactoryHolder viewFactoryHolder0 = new ViewFactoryHolder(this.$context, this.$parentReference);
                    viewFactoryHolder0.setFactory(this.$factory);
                    SparseArray sparseArray0 = null;
                    Object object0 = this.$stateRegistry == null ? null : this.$stateRegistry.consumeRestored(this.$stateKey);
                    if(object0 instanceof SparseArray) {
                        sparseArray0 = (SparseArray)object0;
                    }
                    if(sparseArray0 != null) {
                        View view0 = viewFactoryHolder0.getTypedView$ui_release();
                        if(view0 != null) {
                            view0.restoreHierarchyState(sparseArray0);
                        }
                    }
                    this.$viewFactoryHolderRef.setValue(viewFactoryHolder0);
                    return viewFactoryHolder0.getLayoutNode();
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    return this.invoke();
                }
            };
            composer1.startReplaceableGroup(-2103251527);
            ComposerKt.sourceInformation(composer1, "C(ComposeNode):Composables.kt#9igjgp");
            if(!(composer1.getApplier() instanceof UiApplier)) {
                ComposablesKt.invalidApplier();
            }
            composer1.startNode();
            if(composer1.getInserting()) {
                composer1.createNode(new Function0(androidView_androidKt$AndroidView$10) {
                    final Function0 $factory;

                    {
                        this.$factory = function00;
                        super(0);
                    }

                    @Override  // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.$factory.invoke();
                    }
                });
            }
            else {
                composer1.useNode();
            }
            Composer composer2 = Updater.constructor-impl(composer1);
            Updater.set-impl(composer2, modifier3, new Function2(ref0) {
                final Ref $viewFactoryHolderRef;

                {
                    this.$viewFactoryHolderRef = ref0;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((LayoutNode)object0), ((Modifier)object1));
                    return Unit.INSTANCE;
                }

                public final void invoke(LayoutNode layoutNode0, Modifier modifier0) {
                    Intrinsics.checkNotNullParameter(layoutNode0, "$this$set");
                    Intrinsics.checkNotNullParameter(modifier0, "it");
                    Object object0 = this.$viewFactoryHolderRef.getValue();
                    Intrinsics.checkNotNull(object0);
                    ((ViewFactoryHolder)object0).setModifier(modifier0);
                }
            });
            Updater.set-impl(composer2, ((Density)object1), new Function2(ref0) {
                final Ref $viewFactoryHolderRef;

                {
                    this.$viewFactoryHolderRef = ref0;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((LayoutNode)object0), ((Density)object1));
                    return Unit.INSTANCE;
                }

                public final void invoke(LayoutNode layoutNode0, Density density0) {
                    Intrinsics.checkNotNullParameter(layoutNode0, "$this$set");
                    Intrinsics.checkNotNullParameter(density0, "it");
                    Object object0 = this.$viewFactoryHolderRef.getValue();
                    Intrinsics.checkNotNull(object0);
                    ((ViewFactoryHolder)object0).setDensity(density0);
                }
            });
            Updater.set-impl(composer2, function13, new Function2(ref0) {
                final Ref $viewFactoryHolderRef;

                {
                    this.$viewFactoryHolderRef = ref0;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((LayoutNode)object0), ((Function1)object1));
                    return Unit.INSTANCE;
                }

                public final void invoke(LayoutNode layoutNode0, Function1 function10) {
                    Intrinsics.checkNotNullParameter(layoutNode0, "$this$set");
                    Intrinsics.checkNotNullParameter(function10, "it");
                    Object object0 = this.$viewFactoryHolderRef.getValue();
                    Intrinsics.checkNotNull(object0);
                    ((ViewFactoryHolder)object0).setUpdateBlock(function10);
                }
            });
            Updater.set-impl(composer2, ((LayoutDirection)object2), new Function2(ref0) {
                @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
                public final class WhenMappings {
                    public static final int[] $EnumSwitchMapping$0;

                    static {
                        int[] arr_v = new int[LayoutDirection.values().length];
                        arr_v[LayoutDirection.Ltr.ordinal()] = 1;
                        arr_v[LayoutDirection.Rtl.ordinal()] = 2;
                        WhenMappings.$EnumSwitchMapping$0 = arr_v;
                    }
                }

                final Ref $viewFactoryHolderRef;

                {
                    this.$viewFactoryHolderRef = ref0;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((LayoutNode)object0), ((LayoutDirection)object1));
                    return Unit.INSTANCE;
                }

                public final void invoke(LayoutNode layoutNode0, LayoutDirection layoutDirection0) {
                    Intrinsics.checkNotNullParameter(layoutNode0, "$this$set");
                    Intrinsics.checkNotNullParameter(layoutDirection0, "it");
                    Object object0 = this.$viewFactoryHolderRef.getValue();
                    Intrinsics.checkNotNull(object0);
                    int v = WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()];
                    int v1 = 1;
                    if(v == 1) {
                        v1 = 0;
                    }
                    else if(v != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((ViewFactoryHolder)object0).setLayoutDirection(v1);
                }
            });
            composer1.endNode();
            composer1.endReplaceableGroup();
            if(((SaveableStateRegistry)object3) == null) {
                composer1.startReplaceableGroup(-88760250);
            }
            else {
                composer1.startReplaceableGroup(-88760705);
                ComposerKt.sourceInformation(composer1, "110@5294L439");
                EffectsKt.DisposableEffect(((SaveableStateRegistry)object3), s, new Function1(((SaveableStateRegistry)object3), s, ref0) {
                    final String $stateKey;
                    final SaveableStateRegistry $stateRegistry;
                    final Ref $viewFactoryHolderRef;

                    {
                        this.$stateRegistry = saveableStateRegistry0;
                        this.$stateKey = s;
                        this.$viewFactoryHolderRef = ref0;
                        super(1);
                    }

                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope0) {
                        Intrinsics.checkNotNullParameter(disposableEffectScope0, "$this$DisposableEffect");
                        androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.3.valueProvider.1 androidView_androidKt$AndroidView$3$valueProvider$10 = new Function0() {
                            final Ref $viewFactoryHolderRef;

                            {
                                this.$viewFactoryHolderRef = ref0;
                                super(0);
                            }

                            public final SparseArray invoke() {
                                SparseArray sparseArray0 = new SparseArray();
                                Object object0 = this.$viewFactoryHolderRef.getValue();
                                Intrinsics.checkNotNull(object0);
                                View view0 = ((ViewFactoryHolder)object0).getTypedView$ui_release();
                                if(view0 != null) {
                                    view0.saveHierarchyState(sparseArray0);
                                }
                                return sparseArray0;
                            }

                            @Override  // kotlin.jvm.functions.Function0
                            public Object invoke() {
                                return this.invoke();
                            }
                        };
                        return new DisposableEffectResult() {
                            @Override  // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                this.$entry$inlined.unregister();
                            }
                        };
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.invoke(((DisposableEffectScope)object0));
                    }
                }, composer1, 8);
            }
            composer1.endReplaceableGroup();
            modifier1 = modifier2;
            function12 = function13;
        }
        else {
            composer1.skipToGroupEnd();
            function12 = function11;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(function10, modifier1, function12, v, v1) {
                final int $$changed;
                final int $$default;
                final Function1 $factory;
                final Modifier $modifier;
                final Function1 $update;

                {
                    this.$factory = function10;
                    this.$modifier = modifier0;
                    this.$update = function11;
                    this.$$changed = v;
                    this.$$default = v1;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    AndroidView_androidKt.AndroidView(this.$factory, this.$modifier, this.$update, composer0, this.$$changed | 1, this.$$default);
                }
            });
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        final class androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.modifierWithSemantics.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.modifierWithSemantics.1 INSTANCE;

            static {
                androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.modifierWithSemantics.1.INSTANCE = new androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.modifierWithSemantics.1();
            }

            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView.modifierWithSemantics.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((SemanticsPropertyReceiver)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                Intrinsics.checkNotNullParameter(semanticsPropertyReceiver0, "$this$semantics");
            }
        }

    }

    public static final Function1 getNoOpUpdate() {
        return AndroidView_androidKt.NoOpUpdate;
    }
}

