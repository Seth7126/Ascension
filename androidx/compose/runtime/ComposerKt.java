package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u00C4\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0010\u001A\u0010\u00109\u001A\u00020:2\u0006\u0010;\u001A\u00020<H\u0000\u001Ai\u0010=\u001A\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010?\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@0>j\u0002`A2\u0012\u0010B\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030D0C2&\u0010E\u001A\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010?\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@0>j\u0002`AH\u0003\u00A2\u0006\u0002\u0010F\u001A(\u0010G\u001A\u0004\u0018\u00010\u00012\b\u0010H\u001A\u0004\u0018\u00010\u00012\b\u0010I\u001A\u0004\u0018\u00010\u00012\b\u0010J\u001A\u0004\u0018\u00010\u0001H\u0002\u001A(\u0010K\u001A\u00020\u00132\u0006\u0010L\u001A\u00020M2\u0011\u0010N\u001A\r\u0012\u0004\u0012\u00020\u00130O\u00A2\u0006\u0002\bPH\u0000\u00A2\u0006\u0002\u0010Q\u001A.\u0010R\u001A\u0002HS\"\u0004\b\u0000\u0010S2\u0006\u0010L\u001A\u00020M2\u0011\u0010N\u001A\r\u0012\u0004\u0012\u0002HS0O\u00A2\u0006\u0002\bPH\u0000\u00A2\u0006\u0002\u0010T\u001AP\u0010U\u001A>\u0012\u0004\u0012\u0002HW\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HY0Xj\b\u0012\u0004\u0012\u0002HY`Z0Vj\u001E\u0012\u0004\u0012\u0002HW\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HY0Xj\b\u0012\u0004\u0012\u0002HY`Z`[\"\u0004\b\u0000\u0010W\"\u0004\b\u0001\u0010YH\u0002\u001A\u0010\u0010\\\u001A\u00020\u00132\u0006\u0010H\u001A\u00020]H\u0000\u001A\"\u0010\\\u001A\u00020\u00132\u0006\u0010H\u001A\u00020]2\f\u0010^\u001A\b\u0012\u0004\u0012\u00020\u00010OH\u0080\b\u00F8\u0001\u0000\u001A\u0018\u0010_\u001A\u00020\u00132\u0006\u0010L\u001A\u00020M2\u0006\u0010_\u001A\u00020<H\u0007\u001A\u0010\u0010`\u001A\u00020\u00132\u0006\u0010L\u001A\u00020MH\u0007\u001A \u0010a\u001A\u00020\u00132\u0006\u0010L\u001A\u00020M2\u0006\u0010b\u001A\u00020\u00072\u0006\u0010_\u001A\u00020<H\u0007\u001A\f\u0010c\u001A\u00020]*\u00020\u0007H\u0002\u001A\f\u0010d\u001A\u00020\u0007*\u00020]H\u0002\u001A1\u0010e\u001A\u0002HS\"\u0004\b\u0000\u0010S*\u00020M2\u0006\u0010f\u001A\u00020]2\f\u0010g\u001A\b\u0012\u0004\u0012\u0002HS0OH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010h\u001A@\u0010i\u001A\u00020]\"\u0004\b\u0000\u0010S*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010?\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@0>j\u0002`A2\f\u0010b\u001A\b\u0012\u0004\u0012\u0002HS0?H\u0000\u001A\u001C\u0010j\u001A\u00020\u0007*\u00020k2\u0006\u0010l\u001A\u00020\u00072\u0006\u0010m\u001A\u00020\u0007H\u0002\u001A\u001A\u0010n\u001A\u00020\u0007*\b\u0012\u0004\u0012\u00020p0o2\u0006\u0010q\u001A\u00020\u0007H\u0002\u001A$\u0010r\u001A\u0004\u0018\u00010p*\b\u0012\u0004\u0012\u00020p0o2\u0006\u0010s\u001A\u00020\u00072\u0006\u0010t\u001A\u00020\u0007H\u0002\u001AE\u0010u\u001A\u0002HS\"\u0004\b\u0000\u0010S*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010?\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@0>j\u0002`A2\f\u0010b\u001A\b\u0012\u0004\u0012\u0002HS0?H\u0000\u00A2\u0006\u0002\u0010v\u001A,\u0010w\u001A\u00020\u0013*\b\u0012\u0004\u0012\u00020p0o2\u0006\u0010q\u001A\u00020\u00072\u0006\u0010x\u001A\u00020y2\b\u0010z\u001A\u0004\u0018\u00010\u0001H\u0002\u001A\u0080\u0001\u0010{\u001A\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010?\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@0>j\u0002`A*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010?\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@0>j\u0002`A2.\u0010|\u001A*\u0012 \u0012\u001E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010?\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@0~\u0012\u0004\u0012\u00020\u00130}H\u0080\b\u00F8\u0001\u0000\u001A\'\u0010\u007F\u001A\u00020\u0007*\u00020k2\u0007\u0010\u0080\u0001\u001A\u00020\u00072\u0007\u0010\u0081\u0001\u001A\u00020\u00072\u0007\u0010\u0082\u0001\u001A\u00020\u0007H\u0002\u001A[\u0010\u0083\u0001\u001A\u0004\u0018\u0001HY\"\u0004\b\u0000\u0010W\"\u0004\b\u0001\u0010Y*4\u0012\u0004\u0012\u0002HW\u0012\n\u0012\b\u0012\u0004\u0012\u0002HY0X0Vj\u001E\u0012\u0004\u0012\u0002HW\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HY0Xj\b\u0012\u0004\u0012\u0002HY`Z`[2\u0006\u0010b\u001A\u0002HWH\u0002\u00A2\u0006\u0003\u0010\u0084\u0001\u001Aa\u0010\u0085\u0001\u001A\u00020]\"\u0004\b\u0000\u0010W\"\u0004\b\u0001\u0010Y*4\u0012\u0004\u0012\u0002HW\u0012\n\u0012\b\u0012\u0004\u0012\u0002HY0X0Vj\u001E\u0012\u0004\u0012\u0002HW\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HY0Xj\b\u0012\u0004\u0012\u0002HY`Z`[2\u0006\u0010b\u001A\u0002HW2\u0006\u0010H\u001A\u0002HYH\u0002\u00A2\u0006\u0003\u0010\u0086\u0001\u001Ac\u0010\u0087\u0001\u001A\u0004\u0018\u00010\u0013\"\u0004\b\u0000\u0010W\"\u0004\b\u0001\u0010Y*4\u0012\u0004\u0012\u0002HW\u0012\n\u0012\b\u0012\u0004\u0012\u0002HY0X0Vj\u001E\u0012\u0004\u0012\u0002HW\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002HY0Xj\b\u0012\u0004\u0012\u0002HY`Z`[2\u0006\u0010b\u001A\u0002HW2\u0006\u0010H\u001A\u0002HYH\u0002\u00A2\u0006\u0003\u0010\u0088\u0001\u001A\u0015\u0010\u0089\u0001\u001A\u00020\u0013*\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u0000\u001A\u001D\u0010\u008A\u0001\u001A\u0004\u0018\u00010p*\b\u0012\u0004\u0012\u00020p0o2\u0006\u0010q\u001A\u00020\u0007H\u0002\u001A#\u0010\u008B\u0001\u001A\u00020\u0013*\b\u0012\u0004\u0012\u00020p0o2\u0006\u0010s\u001A\u00020\u00072\u0006\u0010t\u001A\u00020\u0007H\u0002\"\u001C\u0010\u0000\u001A\u00020\u00018\u0000X\u0081\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001A\u00020\u00078\u0000X\u0081T\u00A2\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"[\u0010\t\u001AO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000B\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\nj\u0002`\u0014X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\u001C\u0010\u0015\u001A\u00020\u00018\u0000X\u0081\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u0016\u0010\u0003\u001A\u0004\b\u0017\u0010\u0005\"\u0016\u0010\u0018\u001A\u00020\u00078\u0000X\u0081T\u00A2\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0003\"\u000E\u0010\u001A\u001A\u00020\u0007X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u001B\u001A\u00020\u0007X\u0082T\u00A2\u0006\u0002\n\u0000\"\u001C\u0010\u001C\u001A\u00020\u00018\u0000X\u0081\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u001D\u0010\u0003\u001A\u0004\b\u001E\u0010\u0005\"\u0016\u0010\u001F\u001A\u00020\u00078\u0000X\u0081T\u00A2\u0006\b\n\u0000\u0012\u0004\b \u0010\u0003\"\u001C\u0010!\u001A\u00020\u00018\u0000X\u0081\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\"\u0010\u0003\u001A\u0004\b#\u0010\u0005\"\u0016\u0010$\u001A\u00020\u00078\u0000X\u0081T\u00A2\u0006\b\n\u0000\u0012\u0004\b%\u0010\u0003\"\u001C\u0010&\u001A\u00020\u00018\u0000X\u0081\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\'\u0010\u0003\u001A\u0004\b(\u0010\u0005\"\u0016\u0010)\u001A\u00020\u00078\u0000X\u0081T\u00A2\u0006\b\n\u0000\u0012\u0004\b*\u0010\u0003\"\u001C\u0010+\u001A\u00020\u00018\u0000X\u0081\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b,\u0010\u0003\u001A\u0004\b-\u0010\u0005\"\u0016\u0010.\u001A\u00020\u00078\u0000X\u0081T\u00A2\u0006\b\n\u0000\u0012\u0004\b/\u0010\u0003\"[\u00100\u001AO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000B\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\nj\u0002`\u0014X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\u0016\u00101\u001A\u00020\u00078\u0000X\u0081T\u00A2\u0006\b\n\u0000\u0012\u0004\b2\u0010\u0003\"\u000E\u00103\u001A\u00020\u0007X\u0082T\u00A2\u0006\u0002\n\u0000\"[\u00104\u001AO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000B\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\nj\u0002`\u0014X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\u0018\u00105\u001A\u00020\u0001*\u0002068BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b7\u00108*\u009F\u0001\b\u0000\u0010\u008C\u0001\"K\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000B\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\n2K\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u000B\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011\u00A2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\n*E\b\u0000\u0010\u008D\u0001\"\u001E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010?\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@0>2\u001E\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010?\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@0>\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006\u008E\u0001"}, d2 = {"compositionLocalMap", "", "getCompositionLocalMap$annotations", "()V", "getCompositionLocalMap", "()Ljava/lang/Object;", "compositionLocalMapKey", "", "getCompositionLocalMapKey$annotations", "endGroupInstance", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Lkotlin/ParameterName;", "name", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "invocation", "getInvocation$annotations", "getInvocation", "invocationKey", "getInvocationKey$annotations", "nodeKey", "nodeKeyReplace", "provider", "getProvider$annotations", "getProvider", "providerKey", "getProviderKey$annotations", "providerMaps", "getProviderMaps$annotations", "getProviderMaps", "providerMapsKey", "getProviderMapsKey$annotations", "providerValues", "getProviderValues$annotations", "getProviderValues", "providerValuesKey", "getProviderValuesKey$annotations", "reference", "getReference$annotations", "getReference", "referenceKey", "getReferenceKey$annotations", "removeCurrentGroupInstance", "reuseKey", "getReuseKey$annotations", "rootKey", "startRootGroup", "joinedKey", "Landroidx/compose/runtime/KeyInfo;", "getJoinedKey", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "composeRuntimeError", "", "message", "", "compositionLocalMapOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "values", "", "Landroidx/compose/runtime/ProvidedValue;", "parentScope", "([Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "getKey", "value", "left", "right", "invokeComposable", "composer", "Landroidx/compose/runtime/Composer;", "composable", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)V", "invokeComposableForResult", "T", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "multiMap", "Ljava/util/HashMap;", "K", "Ljava/util/LinkedHashSet;", "V", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "runtimeCheck", "", "lazyMessage", "sourceInformation", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "key", "asBool", "asInt", "cache", "invalid", "block", "(Landroidx/compose/runtime/Composer;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "contains", "distanceFrom", "Landroidx/compose/runtime/SlotReader;", "index", "root", "findLocation", "", "Landroidx/compose/runtime/Invalidation;", "location", "firstInRange", "start", "end", "getValueOf", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "insertIfMissing", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "instance", "mutate", "mutator", "Lkotlin/Function1;", "", "nearestCommonRootOf", "a", "b", "common", "pop", "(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "remove", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Unit;", "removeCurrentGroup", "removeLocation", "removeRange", "Change", "CompositionLocalMap", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ComposerKt {
    private static final Object compositionLocalMap = null;
    public static final int compositionLocalMapKey = 202;
    private static final Function3 endGroupInstance = null;
    private static final Object invocation = null;
    public static final int invocationKey = 200;
    private static final int nodeKey = 0x7D;
    private static final int nodeKeyReplace = 0x7E;
    private static final Object provider = null;
    public static final int providerKey = 201;
    private static final Object providerMaps = null;
    public static final int providerMapsKey = 204;
    private static final Object providerValues = null;
    public static final int providerValuesKey = 203;
    private static final Object reference = null;
    public static final int referenceKey = 206;
    private static final Function3 removeCurrentGroupInstance = null;
    public static final int reuseKey = 0xCF;
    private static final int rootKey = 100;
    private static final Function3 startRootGroup;

    static {
        ComposerKt.removeCurrentGroupInstance = ComposerKt.removeCurrentGroupInstance.1.INSTANCE;
        ComposerKt.endGroupInstance = ComposerKt.endGroupInstance.1.INSTANCE;
        ComposerKt.startRootGroup = ComposerKt.startRootGroup.1.INSTANCE;
        ComposerKt.invocation = new OpaqueKey("provider");
        ComposerKt.provider = new OpaqueKey("provider");
        ComposerKt.compositionLocalMap = new OpaqueKey("compositionLocalMap");
        ComposerKt.providerValues = new OpaqueKey("providerValues");
        ComposerKt.providerMaps = new OpaqueKey("providers");
        ComposerKt.reference = new OpaqueKey("reference");
    }

    public static final int access$asInt(boolean z) {
        return z;
    }

    private static final boolean asBool(int v) {
        return v != 0;
    }

    private static final int asInt(boolean z) [...] // Inlined contents

    @ComposeCompilerApi
    public static final Object cache(Composer composer0, boolean z, Function0 function00) {
        Intrinsics.checkNotNullParameter(composer0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "block");
        Object object0 = composer0.rememberedValue();
        if(z || object0 == Composer.Companion.getEmpty()) {
            object0 = function00.invoke();
            composer0.updateRememberedValue(object0);
        }
        return object0;
    }

    public static final Void composeRuntimeError(String s) {
        Intrinsics.checkNotNullParameter(s, "message");
        throw new IllegalStateException(("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + s + "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }

    private static final PersistentMap compositionLocalMapOf(ProvidedValue[] arr_providedValue, PersistentMap persistentMap0, Composer composer0, int v) {
        composer0.startReplaceableGroup(0x2894FBF5);
        ComposerKt.sourceInformation(composer0, "C(compositionLocalMapOf)P(1):Composer.kt#9igjgp");
        Builder persistentMap$Builder0 = ExtensionsKt.persistentHashMapOf().builder();
        int v1 = 0;
        while(v1 < arr_providedValue.length) {
            ProvidedValue providedValue0 = arr_providedValue[v1];
            ++v1;
            if(!providedValue0.getCanOverride() && ComposerKt.contains(persistentMap0, providedValue0.getCompositionLocal())) {
                composer0.startReplaceableGroup(0x564DB0B8);
            }
            else {
                composer0.startReplaceableGroup(0x564DAFEC);
                ComposerKt.sourceInformation(composer0, "*312@11340L24");
                persistentMap$Builder0.put(providedValue0.getCompositionLocal(), providedValue0.getCompositionLocal().provided$runtime_release(providedValue0.getValue(), composer0, 72));
            }
            composer0.endReplaceableGroup();
        }
        PersistentMap persistentMap1 = persistentMap$Builder0.build();
        composer0.endReplaceableGroup();
        return persistentMap1;
    }

    public static final boolean contains(PersistentMap persistentMap0, CompositionLocal compositionLocal0) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(compositionLocal0, "key");
        return persistentMap0.containsKey(compositionLocal0);
    }

    private static final int distanceFrom(SlotReader slotReader0, int v, int v1) {
        int v2;
        for(v2 = 0; v > 0 && v != v1; ++v2) {
            v = slotReader0.parent(v);
        }
        return v2;
    }

    private static final int findLocation(List list0, int v) {
        int v1 = list0.size() - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            int v4 = Intrinsics.compare(((Invalidation)list0.get(v3)).getLocation(), v);
            if(v4 < 0) {
                v2 = v3 + 1;
                continue;
            }
            if(v4 > 0) {
                v1 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v2 + 1);
    }

    private static final Invalidation firstInRange(List list0, int v, int v1) {
        int v2 = ComposerKt.findLocation(list0, v);
        if(v2 < 0) {
            v2 = -(v2 + 1);
        }
        if(v2 < list0.size()) {
            Invalidation invalidation0 = (Invalidation)list0.get(v2);
            return invalidation0.getLocation() >= v1 ? null : invalidation0;
        }
        return null;
    }

    public static final Object getCompositionLocalMap() {
        return ComposerKt.compositionLocalMap;
    }

    public static void getCompositionLocalMap$annotations() {
    }

    public static void getCompositionLocalMapKey$annotations() {
    }

    public static final Object getInvocation() {
        return ComposerKt.invocation;
    }

    public static void getInvocation$annotations() {
    }

    public static void getInvocationKey$annotations() {
    }

    private static final Object getJoinedKey(KeyInfo keyInfo0) {
        return keyInfo0.getObjectKey() != null ? new JoinedKey(keyInfo0.getKey(), keyInfo0.getObjectKey()) : keyInfo0.getKey();
    }

    private static final Object getKey(Object object0, Object object1, Object object2) {
        JoinedKey joinedKey0 = object0 instanceof JoinedKey ? ((JoinedKey)object0) : null;
        if(joinedKey0 != null) {
            if(!Intrinsics.areEqual(joinedKey0.getLeft(), object1) || !Intrinsics.areEqual(joinedKey0.getRight(), object2)) {
                object0 = ComposerKt.getKey(joinedKey0.getLeft(), object1, object2);
                return object0 == null ? ComposerKt.getKey(joinedKey0.getRight(), object1, object2) : object0;
            }
            return object0;
        }
        return null;
    }

    public static final Object getProvider() {
        return ComposerKt.provider;
    }

    public static void getProvider$annotations() {
    }

    public static void getProviderKey$annotations() {
    }

    public static final Object getProviderMaps() {
        return ComposerKt.providerMaps;
    }

    public static void getProviderMaps$annotations() {
    }

    public static void getProviderMapsKey$annotations() {
    }

    public static final Object getProviderValues() {
        return ComposerKt.providerValues;
    }

    public static void getProviderValues$annotations() {
    }

    public static void getProviderValuesKey$annotations() {
    }

    public static final Object getReference() {
        return ComposerKt.reference;
    }

    public static void getReference$annotations() {
    }

    public static void getReferenceKey$annotations() {
    }

    public static void getReuseKey$annotations() {
    }

    public static final Object getValueOf(PersistentMap persistentMap0, CompositionLocal compositionLocal0) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(compositionLocal0, "key");
        State state0 = (State)persistentMap0.get(compositionLocal0);
        return state0 == null ? null : state0.getValue();
    }

    private static final void insertIfMissing(List list0, int v, RecomposeScopeImpl recomposeScopeImpl0, Object object0) {
        int v1 = ComposerKt.findLocation(list0, v);
        IdentityArraySet identityArraySet0 = null;
        if(v1 < 0) {
            if(object0 != null) {
                identityArraySet0 = new IdentityArraySet();
                identityArraySet0.add(object0);
            }
            list0.add(-(v1 + 1), new Invalidation(recomposeScopeImpl0, v, identityArraySet0));
            return;
        }
        if(object0 == null) {
            ((Invalidation)list0.get(v1)).setInstances(null);
            return;
        }
        IdentityArraySet identityArraySet1 = ((Invalidation)list0.get(v1)).getInstances();
        if(identityArraySet1 != null) {
            identityArraySet1.add(object0);
        }
    }

    public static final void invokeComposable(Composer composer0, Function2 function20) {
        Intrinsics.checkNotNullParameter(composer0, "composer");
        Intrinsics.checkNotNullParameter(function20, "composable");
        function20.invoke(composer0, 1);
    }

    public static final Object invokeComposableForResult(Composer composer0, Function2 function20) {
        Intrinsics.checkNotNullParameter(composer0, "composer");
        Intrinsics.checkNotNullParameter(function20, "composable");
        return function20.invoke(composer0, 1);
    }

    private static final HashMap multiMap() {
        return new HashMap();
    }

    public static final PersistentMap mutate(PersistentMap persistentMap0, Function1 function10) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "mutator");
        Builder persistentMap$Builder0 = persistentMap0.builder();
        function10.invoke(persistentMap$Builder0);
        return persistentMap$Builder0.build();
    }

    private static final int nearestCommonRootOf(SlotReader slotReader0, int v, int v1, int v2) {
        if(v == v1) {
            return v;
        }
        if(v != v2 && v1 != v2) {
            if(slotReader0.parent(v) == v1) {
                return v1;
            }
            if(slotReader0.parent(v1) == v) {
                return v;
            }
            if(slotReader0.parent(v) == slotReader0.parent(v1)) {
                return slotReader0.parent(v);
            }
            int v3 = ComposerKt.distanceFrom(slotReader0, v, v2);
            int v4 = ComposerKt.distanceFrom(slotReader0, v1, v2);
            for(int v6 = 0; v6 < v3 - v4; ++v6) {
                v = slotReader0.parent(v);
            }
            for(int v5 = 0; v5 < v4 - v3; ++v5) {
                v1 = slotReader0.parent(v1);
            }
            while(v != v1) {
                v = slotReader0.parent(v);
                v1 = slotReader0.parent(v1);
            }
            return v;
        }
        return v2;
    }

    private static final Object pop(HashMap hashMap0, Object object0) {
        LinkedHashSet linkedHashSet0 = (LinkedHashSet)hashMap0.get(object0);
        if(linkedHashSet0 != null) {
            Object object1 = CollectionsKt.firstOrNull(linkedHashSet0);
            if(object1 != null) {
                ComposerKt.remove(hashMap0, object0, object1);
                return object1;
            }
        }
        return null;
    }

    private static final boolean put(HashMap hashMap0, Object object0, Object object1) {
        LinkedHashSet linkedHashSet0 = hashMap0.get(object0);
        if(linkedHashSet0 == null) {
            linkedHashSet0 = new LinkedHashSet();
            hashMap0.put(object0, linkedHashSet0);
        }
        return linkedHashSet0.add(object1);
    }

    private static final Unit remove(HashMap hashMap0, Object object0, Object object1) {
        LinkedHashSet linkedHashSet0 = (LinkedHashSet)hashMap0.get(object0);
        if(linkedHashSet0 == null) {
            return null;
        }
        linkedHashSet0.remove(object1);
        if(linkedHashSet0.isEmpty()) {
            hashMap0.remove(object0);
        }
        return Unit.INSTANCE;
    }

    public static final void removeCurrentGroup(SlotWriter slotWriter0, RememberManager rememberManager0) {
        Intrinsics.checkNotNullParameter(slotWriter0, "<this>");
        Intrinsics.checkNotNullParameter(rememberManager0, "rememberManager");
        Iterator iterator0 = slotWriter0.groupSlots();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 instanceof RememberObserver) {
                rememberManager0.forgetting(((RememberObserver)object0));
            }
            else if(object0 instanceof RecomposeScopeImpl) {
                CompositionImpl compositionImpl0 = ((RecomposeScopeImpl)object0).getComposition();
                if(compositionImpl0 != null) {
                    compositionImpl0.setPendingInvalidScopes$runtime_release(true);
                    ((RecomposeScopeImpl)object0).setComposition(null);
                }
            }
        }
        slotWriter0.removeGroup();
    }

    private static final Invalidation removeLocation(List list0, int v) {
        int v1 = ComposerKt.findLocation(list0, v);
        return v1 < 0 ? null : ((Invalidation)list0.remove(v1));
    }

    private static final void removeRange(List list0, int v, int v1) {
        int v2 = ComposerKt.findLocation(list0, v);
        if(v2 < 0) {
            v2 = -(v2 + 1);
        }
        while(v2 < list0.size() && ((Invalidation)list0.get(v2)).getLocation() < v1) {
            list0.remove(v2);
        }
    }

    public static final void runtimeCheck(boolean z) {
        if(z) {
            return;
        }
        ComposerKt.composeRuntimeError("Check failed");
        throw new KotlinNothingValueException();
    }

    public static final void runtimeCheck(boolean z, Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "lazyMessage");
        if(z) {
            return;
        }
        ComposerKt.composeRuntimeError(function00.invoke().toString());
        throw new KotlinNothingValueException();
    }

    @ComposeCompilerApi
    public static final void sourceInformation(Composer composer0, String s) {
        Intrinsics.checkNotNullParameter(composer0, "composer");
        Intrinsics.checkNotNullParameter(s, "sourceInformation");
        composer0.sourceInformation(s);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(Composer composer0) {
        Intrinsics.checkNotNullParameter(composer0, "composer");
        composer0.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(Composer composer0, int v, String s) {
        Intrinsics.checkNotNullParameter(composer0, "composer");
        Intrinsics.checkNotNullParameter(s, "sourceInformation");
        composer0.sourceInformationMarkerStart(v, s);
    }
}

