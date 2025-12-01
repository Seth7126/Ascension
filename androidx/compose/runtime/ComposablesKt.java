package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001Ab\u0010\f\u001A\u00020\r\"\b\b\u0000\u0010\u000E*\u00020\u000F\"\u000E\b\u0001\u0010\u0010\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00112\u000E\b\b\u0010\u0012\u001A\b\u0012\u0004\u0012\u0002H\u000E0\u00132\"\u0010\u0014\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000E0\u0016\u0012\u0004\u0012\u00020\r0\u0015\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u0018H\u0087\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0002\u0010\u0019\u001Aq\u0010\f\u001A\u00020\r\"\u0004\b\u0000\u0010\u000E\"\u000E\b\u0001\u0010\u0010\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00112\u000E\b\b\u0010\u0012\u001A\b\u0012\u0004\u0012\u0002H\u000E0\u00132\"\u0010\u0014\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000E0\u0016\u0012\u0004\u0012\u00020\r0\u0015\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u00182\u0011\u0010\u001A\u001A\r\u0012\u0004\u0012\u00020\r0\u0013\u00A2\u0006\u0002\b\u001BH\u0087\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0002\u0010\u001C\u001A\u0097\u0001\u0010\f\u001A\u00020\r\"\u0004\b\u0000\u0010\u000E\"\u000E\b\u0001\u0010\u0010\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00112\u000E\b\b\u0010\u0012\u001A\b\u0012\u0004\u0012\u0002H\u000E0\u00132\"\u0010\u0014\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000E0\u0016\u0012\u0004\u0012\u00020\r0\u0015\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u00182$\b\b\u0010\u001D\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000E0\u001E\u0012\u0004\u0012\u00020\r0\u0015\u00A2\u0006\u0002\b\u001B\u00A2\u0006\u0002\b\u00182\u0011\u0010\u001A\u001A\r\u0012\u0004\u0012\u00020\r0\u0013\u00A2\u0006\u0002\b\u001BH\u0087\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0002\u0010\u001F\u001Ab\u0010 \u001A\u00020\r\"\b\b\u0000\u0010\u000E*\u00020\u000F\"\u000E\b\u0001\u0010\u0010\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00112\u000E\b\b\u0010\u0012\u001A\b\u0012\u0004\u0012\u0002H\u000E0\u00132\"\u0010\u0014\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000E0\u0016\u0012\u0004\u0012\u00020\r0\u0015\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u0018H\u0087\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0002\u0010\u0019\u001Aq\u0010 \u001A\u00020\r\"\u0004\b\u0000\u0010\u000E\"\u000E\b\u0001\u0010\u0010\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00112\u000E\b\b\u0010\u0012\u001A\b\u0012\u0004\u0012\u0002H\u000E0\u00132\"\u0010\u0014\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000E0\u0016\u0012\u0004\u0012\u00020\r0\u0015\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u00182\u0011\u0010\u001A\u001A\r\u0012\u0004\u0012\u00020\r0\u0013\u00A2\u0006\u0002\b\u001BH\u0087\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0002\u0010\u001C\u001A\u0097\u0001\u0010 \u001A\u00020\r\"\u0004\b\u0000\u0010\u000E\"\u000E\b\u0001\u0010\u0010\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00112\u000E\b\b\u0010\u0012\u001A\b\u0012\u0004\u0012\u0002H\u000E0\u00132\"\u0010\u0014\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000E0\u0016\u0012\u0004\u0012\u00020\r0\u0015\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0002\b\u00182$\b\b\u0010\u001D\u001A\u001E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000E0\u001E\u0012\u0004\u0012\u00020\r0\u0015\u00A2\u0006\u0002\b\u001B\u00A2\u0006\u0002\b\u00182\u0011\u0010\u001A\u001A\r\u0012\u0004\u0012\u00020\r0\u0013\u00A2\u0006\u0002\b\u001BH\u0087\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0002\u0010\u001F\u001A.\u0010!\u001A\u00020\r2\b\u0010\"\u001A\u0004\u0018\u00010\u000F2\u0011\u0010\u001A\u001A\r\u0012\u0004\u0012\u00020\r0\u0013\u00A2\u0006\u0002\b\u001BH\u0087\b\u00F8\u0001\u0001\u00A2\u0006\u0002\u0010#\u001A\b\u0010$\u001A\u00020\rH\u0001\u001AB\u0010\"\u001A\u0002H\u000E\"\u0004\b\u0000\u0010\u000E2\u0016\u0010%\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000F0&\"\u0004\u0018\u00010\u000F2\u0011\u0010\'\u001A\r\u0012\u0004\u0012\u0002H\u000E0\u0013\u00A2\u0006\u0002\b\u001BH\u0087\b\u00F8\u0001\u0001\u00A2\u0006\u0002\u0010(\u001A*\u0010)\u001A\u0002H\u000E\"\u0004\b\u0000\u0010\u000E2\u0011\u0010*\u001A\r\u0012\u0004\u0012\u0002H\u000E0\u0013\u00A2\u0006\u0002\b\u0017H\u0087\b\u00F8\u0001\u0001\u00A2\u0006\u0002\u0010+\u001A4\u0010)\u001A\u0002H\u000E\"\u0004\b\u0000\u0010\u000E2\b\u0010,\u001A\u0004\u0018\u00010\u000F2\u0011\u0010*\u001A\r\u0012\u0004\u0012\u0002H\u000E0\u0013\u00A2\u0006\u0002\b\u0017H\u0087\b\u00F8\u0001\u0001\u00A2\u0006\u0002\u0010-\u001A>\u0010)\u001A\u0002H\u000E\"\u0004\b\u0000\u0010\u000E2\b\u0010,\u001A\u0004\u0018\u00010\u000F2\b\u0010.\u001A\u0004\u0018\u00010\u000F2\u0011\u0010*\u001A\r\u0012\u0004\u0012\u0002H\u000E0\u0013\u00A2\u0006\u0002\b\u0017H\u0087\b\u00F8\u0001\u0001\u00A2\u0006\u0002\u0010/\u001AH\u0010)\u001A\u0002H\u000E\"\u0004\b\u0000\u0010\u000E2\b\u0010,\u001A\u0004\u0018\u00010\u000F2\b\u0010.\u001A\u0004\u0018\u00010\u000F2\b\u00100\u001A\u0004\u0018\u00010\u000F2\u0011\u0010*\u001A\r\u0012\u0004\u0012\u0002H\u000E0\u0013\u00A2\u0006\u0002\b\u0017H\u0087\b\u00F8\u0001\u0001\u00A2\u0006\u0002\u00101\u001AB\u0010)\u001A\u0002H\u000E\"\u0004\b\u0000\u0010\u000E2\u0016\u0010%\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000F0&\"\u0004\u0018\u00010\u000F2\u0011\u0010*\u001A\r\u0012\u0004\u0012\u0002H\u000E0\u0013\u00A2\u0006\u0002\b\u0017H\u0087\b\u00F8\u0001\u0001\u00A2\u0006\u0002\u00102\u001A\r\u00103\u001A\u000204H\u0007\u00A2\u0006\u0002\u00105\"\u0011\u0010\u0000\u001A\u00020\u00018G\u00A2\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001A\u00020\u00058G\u00A2\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007\"\u0011\u0010\b\u001A\u00020\t8G\u00A2\u0006\u0006\u001A\u0004\b\n\u0010\u000B\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u009920\u0001\u00A8\u00066"}, d2 = {"currentComposer", "Landroidx/compose/runtime/Composer;", "getCurrentComposer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;", "currentCompositeKeyHash", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "currentRecomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "ComposeNode", "", "T", "", "E", "Landroidx/compose/runtime/Applier;", "factory", "Lkotlin/Function0;", "update", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Landroidx/compose/runtime/DisallowComposableCalls;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "skippableUpdate", "Landroidx/compose/runtime/SkippableUpdater;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ReusableComposeNode", "ReusableContent", "key", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "invalidApplier", "keys", "", "block", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "remember", "calculation", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "rememberCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ComposablesKt {
    public static final void ComposeNode(Function0 function00, Function1 function10, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "factory");
        Intrinsics.checkNotNullParameter(function10, "update");
        composer0.startReplaceableGroup(-2103251527);
        ComposerKt.sourceInformation(composer0, "C(ComposeNode):Composables.kt#9igjgp");
        Applier applier0 = composer0.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if(!(applier0 instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer0.startNode();
        if(composer0.getInserting()) {
            composer0.createNode(new Function0(function00) {
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
            composer0.useNode();
        }
        function10.invoke(Updater.box-impl(Updater.constructor-impl(composer0)));
        composer0.endNode();
        composer0.endReplaceableGroup();
    }

    public static final void ComposeNode(Function0 function00, Function1 function10, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "factory");
        Intrinsics.checkNotNullParameter(function10, "update");
        Intrinsics.checkNotNullParameter(function20, "content");
        composer0.startReplaceableGroup(0x82A2F876);
        ComposerKt.sourceInformation(composer0, "C(ComposeNode)P(1,2)292@10549L9:Composables.kt#9igjgp");
        Applier applier0 = composer0.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if(!(applier0 instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer0.startNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        function10.invoke(Updater.box-impl(Updater.constructor-impl(composer0)));
        function20.invoke(composer0, ((int)(v >> 6 & 14)));
        composer0.endNode();
        composer0.endReplaceableGroup();
    }

    public static final void ComposeNode(Function0 function00, Function1 function10, Function3 function30, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "factory");
        Intrinsics.checkNotNullParameter(function10, "update");
        Intrinsics.checkNotNullParameter(function30, "skippableUpdate");
        Intrinsics.checkNotNullParameter(function20, "content");
        Applier applier0 = composer0.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if(!(applier0 instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer0.startNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        function10.invoke(Updater.box-impl(Updater.constructor-impl(composer0)));
        function30.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composer0)), composer0, ((int)(v >> 3 & 0x70)));
        composer0.startReplaceableGroup(2058660585);
        function20.invoke(composer0, ((int)(v >> 9 & 14)));
        composer0.endReplaceableGroup();
        composer0.endNode();
    }

    public static final void ReusableComposeNode(Function0 function00, Function1 function10, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "factory");
        Intrinsics.checkNotNullParameter(function10, "update");
        composer0.startReplaceableGroup(1546164280);
        ComposerKt.sourceInformation(composer0, "C(ReusableComposeNode):Composables.kt#9igjgp");
        Applier applier0 = composer0.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if(!(applier0 instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(new Function0(function00) {
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
            composer0.useNode();
        }
        composer0.disableReusing();
        function10.invoke(Updater.box-impl(Updater.constructor-impl(composer0)));
        composer0.enableReusing();
        composer0.endNode();
        composer0.endReplaceableGroup();
    }

    public static final void ReusableComposeNode(Function0 function00, Function1 function10, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "factory");
        Intrinsics.checkNotNullParameter(function10, "update");
        Intrinsics.checkNotNullParameter(function20, "content");
        composer0.startReplaceableGroup(0x5C28A3AB);
        ComposerKt.sourceInformation(composer0, "C(ReusableComposeNode)P(1,2)334@12088L9:Composables.kt#9igjgp");
        Applier applier0 = composer0.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if(!(applier0 instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        composer0.disableReusing();
        function10.invoke(Updater.box-impl(Updater.constructor-impl(composer0)));
        composer0.enableReusing();
        function20.invoke(composer0, ((int)(v >> 6 & 14)));
        composer0.endNode();
        composer0.endReplaceableGroup();
    }

    public static final void ReusableComposeNode(Function0 function00, Function1 function10, Function3 function30, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "factory");
        Intrinsics.checkNotNullParameter(function10, "update");
        Intrinsics.checkNotNullParameter(function30, "skippableUpdate");
        Intrinsics.checkNotNullParameter(function20, "content");
        Applier applier0 = composer0.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if(!(applier0 instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        composer0.disableReusing();
        function10.invoke(Updater.box-impl(Updater.constructor-impl(composer0)));
        composer0.enableReusing();
        function30.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composer0)), composer0, ((int)(v >> 3 & 0x70)));
        composer0.startReplaceableGroup(2058660585);
        function20.invoke(composer0, ((int)(v >> 9 & 14)));
        composer0.endReplaceableGroup();
        composer0.endNode();
    }

    public static final void ReusableContent(Object object0, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function20, "content");
        composer0.startReplaceableGroup(-1530021272);
        ComposerKt.sourceInformation(composer0, "C(ReusableContent)P(1)145@5253L9:Composables.kt#9igjgp");
        composer0.startReusableGroup(0xCF, object0);
        function20.invoke(composer0, ((int)(v >> 3 & 14)));
        composer0.endReusableGroup();
        composer0.endReplaceableGroup();
    }

    public static final Composer getCurrentComposer(Composer composer0, int v) {
        ComposerKt.sourceInformationMarkerStart(composer0, 0x2D127F0A, "C:Composables.kt#9igjgp");
        throw new NotImplementedError("Implemented as an intrinsic");
    }

    public static final int getCurrentCompositeKeyHash(Composer composer0, int v) {
        return composer0.getCompoundKeyHash();
    }

    public static final RecomposeScope getCurrentRecomposeScope(Composer composer0, int v) {
        ComposerKt.sourceInformationMarkerStart(composer0, 0x87F35E5, "C:Composables.kt#9igjgp");
        RecomposeScope recomposeScope0 = composer0.getRecomposeScope();
        if(recomposeScope0 == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        composer0.recordUsed(recomposeScope0);
        ComposerKt.sourceInformationMarkerEnd(composer0);
        return recomposeScope0;
    }

    // 去混淆评级： 低(20)
    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final Object key(Object[] arr_object, Function2 function20, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "keys");
        Intrinsics.checkNotNullParameter(function20, "block");
        composer0.startReplaceableGroup(-1542330587);
        ComposerKt.sourceInformation(composer0, "C(key)P(1)128@4598L7:Composables.kt#9igjgp");
        Object object0 = function20.invoke(composer0, ((int)(v >> 3 & 14)));
        composer0.endReplaceableGroup();
        return object0;
    }

    public static final Object remember(Object object0, Object object1, Object object2, Function0 function00, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "calculation");
        composer0.startReplaceableGroup(0xFFC7C131);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean z = composer0.changed(object0);
        boolean z1 = composer0.changed(object1);
        boolean z2 = composer0.changed(object2);
        Object object3 = composer0.rememberedValue();
        if((z | z1 | z2) != 0 || object3 == Composer.Companion.getEmpty()) {
            object3 = function00.invoke();
            composer0.updateRememberedValue(object3);
        }
        composer0.endReplaceableGroup();
        return object3;
    }

    public static final Object remember(Object object0, Object object1, Function0 function00, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "calculation");
        composer0.startReplaceableGroup(0xFFC7BF68);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1,2):Composables.kt#9igjgp");
        boolean z = composer0.changed(object0);
        boolean z1 = composer0.changed(object1);
        Object object2 = composer0.rememberedValue();
        if(z || z1 || object2 == Composer.Companion.getEmpty()) {
            object2 = function00.invoke();
            composer0.updateRememberedValue(object2);
        }
        composer0.endReplaceableGroup();
        return object2;
    }

    public static final Object remember(Object object0, Function0 function00, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "calculation");
        composer0.startReplaceableGroup(-3686930);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1):Composables.kt#9igjgp");
        boolean z = composer0.changed(object0);
        Object object1 = composer0.rememberedValue();
        if(z || object1 == Composer.Companion.getEmpty()) {
            object1 = function00.invoke();
            composer0.updateRememberedValue(object1);
        }
        composer0.endReplaceableGroup();
        return object1;
    }

    public static final Object remember(Function0 function00, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "calculation");
        composer0.startReplaceableGroup(0xFFC7BCB7);
        ComposerKt.sourceInformation(composer0, "C(remember):Composables.kt#9igjgp");
        Object object0 = composer0.rememberedValue();
        if(object0 == Composer.Companion.getEmpty()) {
            object0 = function00.invoke();
            composer0.updateRememberedValue(object0);
        }
        composer0.endReplaceableGroup();
        return object0;
    }

    public static final Object remember(Object[] arr_object, Function0 function00, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "keys");
        Intrinsics.checkNotNullParameter(function00, "calculation");
        composer0.startReplaceableGroup(-3685570);
        ComposerKt.sourceInformation(composer0, "C(remember)P(1):Composables.kt#9igjgp");
        int v1 = 0;
        boolean z;
        for(z = false; v1 < arr_object.length; z |= composer0.changed(object0)) {
            Object object0 = arr_object[v1];
            ++v1;
        }
        Object object1 = composer0.rememberedValue();
        if(z || object1 == Composer.Companion.getEmpty()) {
            object1 = function00.invoke();
            composer0.updateRememberedValue(object1);
        }
        composer0.endReplaceableGroup();
        return object1;
    }

    public static final CompositionContext rememberCompositionContext(Composer composer0, int v) {
        composer0.startReplaceableGroup(0xAEFC46DE);
        ComposerKt.sourceInformation(composer0, "C(rememberCompositionContext):Composables.kt#9igjgp");
        CompositionContext compositionContext0 = composer0.buildContext();
        composer0.endReplaceableGroup();
        return compositionContext0;
    }
}

