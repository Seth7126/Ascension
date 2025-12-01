package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u00A4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 l2\u00020\u0001:\u0001lJ@\u0010+\u001A\u00020,\"\u0004\b\u0000\u0010-\"\u0004\b\u0001\u0010.2\u0006\u0010/\u001A\u0002H-2\u001D\u00100\u001A\u0019\u0012\u0004\u0012\u0002H.\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u00020,01\u00A2\u0006\u0002\b2H\'\u00A2\u0006\u0002\u00103J\b\u00104\u001A\u000205H\'J\u0012\u00106\u001A\u00020\u001C2\b\u0010/\u001A\u0004\u0018\u00010\u0001H\'J\u0010\u00106\u001A\u00020\u001C2\u0006\u0010/\u001A\u00020\u001CH\u0017J\u0010\u00106\u001A\u00020\u001C2\u0006\u0010/\u001A\u000207H\u0017J\u0010\u00106\u001A\u00020\u001C2\u0006\u0010/\u001A\u000208H\u0017J\u0010\u00106\u001A\u00020\u001C2\u0006\u0010/\u001A\u000209H\u0017J\u0010\u00106\u001A\u00020\u001C2\u0006\u0010/\u001A\u00020:H\u0017J\u0010\u00106\u001A\u00020\u001C2\u0006\u0010/\u001A\u00020\u0017H\u0017J\u0010\u00106\u001A\u00020\u001C2\u0006\u0010/\u001A\u00020;H\u0017J\u0010\u00106\u001A\u00020\u001C2\u0006\u0010/\u001A\u00020<H\u0017J\b\u0010=\u001A\u00020,H\'J!\u0010>\u001A\u0002H.\"\u0004\b\u0000\u0010.2\f\u0010?\u001A\b\u0012\u0004\u0012\u0002H.0@H\'\u00A2\u0006\u0002\u0010AJ\u001C\u0010B\u001A\u00020,\"\u0004\b\u0000\u0010.2\f\u0010C\u001A\b\u0012\u0004\u0012\u0002H.0DH\'J\b\u0010E\u001A\u00020,H\'J\b\u0010F\u001A\u00020,H\'J\b\u0010G\u001A\u00020,H\'J\b\u0010H\u001A\u00020,H\'J\b\u0010I\u001A\u00020,H\'J\b\u0010J\u001A\u00020,H\'J\b\u0010K\u001A\u00020,H\'J\n\u0010L\u001A\u0004\u0018\u00010MH\'J\b\u0010N\u001A\u00020,H\'J\u001C\u0010O\u001A\u00020\u00012\b\u0010P\u001A\u0004\u0018\u00010\u00012\b\u0010Q\u001A\u0004\u0018\u00010\u0001H\'J\u0016\u0010R\u001A\u00020,2\f\u0010S\u001A\b\u0012\u0004\u0012\u00020,0DH\'J\u0010\u0010T\u001A\u00020,2\u0006\u0010U\u001A\u00020$H\'J\n\u0010V\u001A\u0004\u0018\u00010\u0001H\'J\b\u0010W\u001A\u00020,H\'J\b\u0010X\u001A\u00020,H\'J\u0010\u0010Y\u001A\u00020,2\u0006\u0010Y\u001A\u00020ZH&J\b\u0010[\u001A\u00020,H&J\u0018\u0010\\\u001A\u00020,2\u0006\u0010?\u001A\u00020\u00172\u0006\u0010Y\u001A\u00020ZH&J\b\u0010]\u001A\u00020,H\'J\u001A\u0010^\u001A\u00020,2\u0006\u0010?\u001A\u00020\u00172\b\u0010_\u001A\u0004\u0018\u00010\u0001H\'J\b\u0010`\u001A\u00020,H\'J!\u0010a\u001A\u00020,2\u0012\u0010b\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030d0cH\'\u00A2\u0006\u0002\u0010eJ\u0010\u0010f\u001A\u00020,2\u0006\u0010?\u001A\u00020\u0017H\'J\u0010\u0010g\u001A\u00020\u00002\u0006\u0010?\u001A\u00020\u0017H\'J\u001A\u0010h\u001A\u00020,2\u0006\u0010?\u001A\u00020\u00172\b\u0010_\u001A\u0004\u0018\u00010\u0001H\'J\b\u0010i\u001A\u00020,H\'J\u0012\u0010j\u001A\u00020,2\b\u0010/\u001A\u0004\u0018\u00010\u0001H\'J\b\u0010k\u001A\u00020,H\'R\u001E\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u00038&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R\u001A\u0010\b\u001A\u00020\t8fX\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\n\u0010\u0005\u001A\u0004\b\u000B\u0010\fR\u0014\u0010\r\u001A\u00020\u000E8fX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0011\u001A\u00020\u00128&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u0013\u0010\u0005\u001A\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0016\u001A\u00020\u00178&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u0018\u0010\u0005\u001A\u0004\b\u0019\u0010\u001AR\u001A\u0010\u001B\u001A\u00020\u001C8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u001D\u0010\u0005\u001A\u0004\b\u001E\u0010\u001FR\u001A\u0010 \u001A\u00020\u001C8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b!\u0010\u0005\u001A\u0004\b\"\u0010\u001FR\u001C\u0010#\u001A\u0004\u0018\u00010$8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b%\u0010\u0005\u001A\u0004\b&\u0010\'R\u001A\u0010(\u001A\u00020\u001C8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b)\u0010\u0005\u001A\u0004\b*\u0010\u001F\u00A8\u0006m"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "applier", "Landroidx/compose/runtime/Applier;", "getApplier$annotations", "()V", "getApplier", "()Landroidx/compose/runtime/Applier;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "composition", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData$annotations", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compoundKeyHash", "", "getCompoundKeyHash$annotations", "getCompoundKeyHash", "()I", "defaultsInvalid", "", "getDefaultsInvalid$annotations", "getDefaultsInvalid", "()Z", "inserting", "getInserting$annotations", "getInserting", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "skipping", "getSkipping$annotations", "getSkipping", "apply", "", "V", "T", "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "buildContext", "Landroidx/compose/runtime/CompositionContext;", "changed", "", "", "", "", "", "", "collectParameterInformation", "consume", "key", "Landroidx/compose/runtime/CompositionLocal;", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "createNode", "factory", "Lkotlin/Function0;", "disableReusing", "enableReusing", "endDefaults", "endMovableGroup", "endNode", "endProviders", "endReplaceableGroup", "endRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endReusableGroup", "joinKey", "left", "right", "recordSideEffect", "effect", "recordUsed", "scope", "rememberedValue", "skipCurrentGroup", "skipToGroupEnd", "sourceInformation", "", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "startDefaults", "startMovableGroup", "dataKey", "startNode", "startProviders", "values", "", "Landroidx/compose/runtime/ProvidedValue;", "([Landroidx/compose/runtime/ProvidedValue;)V", "startReplaceableGroup", "startRestartGroup", "startReusableGroup", "startReusableNode", "updateRememberedValue", "useNode", "Companion", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface Composer {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "()V", "Empty", "getEmpty", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        static final Companion $$INSTANCE;
        private static final Object Empty;

        static {
            Companion.$$INSTANCE = new Companion();
            Companion.Empty = new Composer.Companion.Empty.1();
        }

        public final Object getEmpty() {
            return Companion.Empty;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        @ComposeCompilerApi
        public static boolean changed(Composer composer0, byte b) {
            Intrinsics.checkNotNullParameter(composer0, "this");
            return composer0.changed(b);
        }

        @ComposeCompilerApi
        public static boolean changed(Composer composer0, char c) {
            Intrinsics.checkNotNullParameter(composer0, "this");
            return composer0.changed(c);
        }

        @ComposeCompilerApi
        public static boolean changed(Composer composer0, double f) {
            Intrinsics.checkNotNullParameter(composer0, "this");
            return composer0.changed(f);
        }

        @ComposeCompilerApi
        public static boolean changed(Composer composer0, float f) {
            Intrinsics.checkNotNullParameter(composer0, "this");
            return composer0.changed(f);
        }

        @ComposeCompilerApi
        public static boolean changed(Composer composer0, int v) {
            Intrinsics.checkNotNullParameter(composer0, "this");
            return composer0.changed(v);
        }

        @ComposeCompilerApi
        public static boolean changed(Composer composer0, long v) {
            Intrinsics.checkNotNullParameter(composer0, "this");
            return composer0.changed(v);
        }

        @ComposeCompilerApi
        public static boolean changed(Composer composer0, short v) {
            Intrinsics.checkNotNullParameter(composer0, "this");
            return composer0.changed(v);
        }

        @ComposeCompilerApi
        public static boolean changed(Composer composer0, boolean z) {
            Intrinsics.checkNotNullParameter(composer0, "this");
            return composer0.changed(z);
        }

        @ComposeCompilerApi
        public static void getApplier$annotations() {
        }

        @InternalComposeApi
        public static void getApplyCoroutineContext$annotations() {
        }

        @InternalComposeApi
        public static void getCompositionData$annotations() {
        }

        @InternalComposeApi
        public static void getCompoundKeyHash$annotations() {
        }

        @ComposeCompilerApi
        public static void getDefaultsInvalid$annotations() {
        }

        @ComposeCompilerApi
        public static void getInserting$annotations() {
        }

        @InternalComposeApi
        public static void getRecomposeScope$annotations() {
        }

        @ComposeCompilerApi
        public static void getSkipping$annotations() {
        }
    }

    public static final Companion Companion;

    static {
        Composer.Companion = Companion.$$INSTANCE;
    }

    @ComposeCompilerApi
    void apply(Object arg1, Function2 arg2);

    @InternalComposeApi
    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(byte arg1);

    @ComposeCompilerApi
    boolean changed(char arg1);

    @ComposeCompilerApi
    boolean changed(double arg1);

    @ComposeCompilerApi
    boolean changed(float arg1);

    @ComposeCompilerApi
    boolean changed(int arg1);

    @ComposeCompilerApi
    boolean changed(long arg1);

    @ComposeCompilerApi
    boolean changed(Object arg1);

    @ComposeCompilerApi
    boolean changed(short arg1);

    @ComposeCompilerApi
    boolean changed(boolean arg1);

    @InternalComposeApi
    void collectParameterInformation();

    @InternalComposeApi
    Object consume(CompositionLocal arg1);

    @ComposeCompilerApi
    void createNode(Function0 arg1);

    @ComposeCompilerApi
    void disableReusing();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    @InternalComposeApi
    void endProviders();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    Applier getApplier();

    CoroutineContext getApplyCoroutineContext();

    ControlledComposition getComposition();

    CompositionData getCompositionData();

    int getCompoundKeyHash();

    boolean getDefaultsInvalid();

    boolean getInserting();

    RecomposeScope getRecomposeScope();

    boolean getSkipping();

    @ComposeCompilerApi
    Object joinKey(Object arg1, Object arg2);

    @InternalComposeApi
    void recordSideEffect(Function0 arg1);

    @InternalComposeApi
    void recordUsed(RecomposeScope arg1);

    @ComposeCompilerApi
    Object rememberedValue();

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(String arg1);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int arg1, String arg2);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int arg1, Object arg2);

    @ComposeCompilerApi
    void startNode();

    @InternalComposeApi
    void startProviders(ProvidedValue[] arg1);

    @ComposeCompilerApi
    void startReplaceableGroup(int arg1);

    @ComposeCompilerApi
    Composer startRestartGroup(int arg1);

    @ComposeCompilerApi
    void startReusableGroup(int arg1, Object arg2);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(Object arg1);

    @ComposeCompilerApi
    void useNode();
}

