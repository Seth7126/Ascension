package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010)\n\u0000\n\u0002\u0010*\n\u0000\n\u0002\u0010+\n\u0002\b\u001D\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0018\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B=\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0010\u0010\u0006\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\u000E\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0006\u0010\n\u001A\u00020\u000B\u00A2\u0006\u0002\u0010\fJ\u0015\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u001FJ\u001D\u0010\u001C\u001A\u00020 2\u0006\u0010!\u001A\u00020\u000B2\u0006\u0010\u001E\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\"J\u001E\u0010#\u001A\u00020\u001D2\u0006\u0010!\u001A\u00020\u000B2\f\u0010$\u001A\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u0016\u0010#\u001A\u00020\u001D2\f\u0010$\u001A\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u001D\u0010&\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010!\u001A\u00020\u000BH\u0002\u00A2\u0006\u0002\u0010\'J\u000E\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J=\u0010)\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000E\u0010*\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010+\u001A\u00020\u000B2\u000E\u0010,\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0-H\u0002\u00A2\u0006\u0002\u0010.J\u0016\u0010/\u001A\u00028\u00002\u0006\u0010!\u001A\u00020\u000BH\u0096\u0002\u00A2\u0006\u0002\u00100J\r\u00101\u001A\u00020\u000BH\u0000\u00A2\u0006\u0002\b2JG\u00103\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000E\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001A\u00020\u000B2\u0006\u0010!\u001A\u00020\u000B2\b\u0010\u001E\u001A\u0004\u0018\u00010\b2\u0006\u00105\u001A\u000206H\u0002\u00A2\u0006\u0002\u00107J[\u00103\u001A\u00020 2\f\u0010$\u001A\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010!\u001A\u00020\u000B2\u0006\u00108\u001A\u00020\u000B2\u0016\u00109\u001A\u0012\u0012\u000E\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u00072\u0006\u0010:\u001A\u00020\u000B2\u000E\u0010;\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002\u00A2\u0006\u0002\u0010<J/\u0010=\u001A\u00020 2\u0010\u0010\u0010\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010!\u001A\u00020\u000B2\u0006\u0010\u001E\u001A\u00028\u0000H\u0002\u00A2\u0006\u0002\u0010>J\u001D\u0010?\u001A\u00020\u001D2\u000E\u0010*\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002\u00A2\u0006\u0002\u0010@J\u000F\u0010A\u001A\b\u0012\u0004\u0012\u00028\u00000BH\u0096\u0002J\u001E\u0010C\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070D2\u0006\u0010!\u001A\u00020\u000BH\u0002J\u000E\u0010E\u001A\b\u0012\u0004\u0012\u00028\u00000FH\u0016J\u0016\u0010E\u001A\b\u0012\u0004\u0012\u00028\u00000F2\u0006\u0010!\u001A\u00020\u000BH\u0016J\'\u0010G\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0010\u0010*\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0002\u00A2\u0006\u0002\u0010HJ-\u0010I\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000E\u0010*\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010J\u001A\u00020\u000BH\u0002\u00A2\u0006\u0002\u0010KJ\u0015\u0010L\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002\u00A2\u0006\u0002\u0010\u0012J\u001F\u0010M\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\b\u0010\u001E\u001A\u0004\u0018\u00010\bH\u0002\u00A2\u0006\u0002\u0010NJ5\u0010O\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000E\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010!\u001A\u00020\u000B2\u0006\u00104\u001A\u00020\u000BH\u0002\u00A2\u0006\u0002\u0010PJ?\u0010Q\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u000E\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001A\u00020\u000B2\u0006\u0010R\u001A\u00020\u000B2\u0006\u0010S\u001A\u000206H\u0002\u00A2\u0006\u0002\u0010TJ/\u0010U\u001A\u00020 2\u0010\u0010\u0010\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010R\u001A\u00020\u000B2\u0006\u00104\u001A\u00020\u000BH\u0002\u00A2\u0006\u0002\u0010VJM\u0010W\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0010\u0010\u0010\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010R\u001A\u00020\u000B2\u0006\u00104\u001A\u00020\u000B2\u0014\u0010X\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070-H\u0002\u00A2\u0006\u0002\u0010YJE\u0010Z\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0010\u0010\u0010\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010R\u001A\u00020\u000B2\u0014\u00109\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0007H\u0002\u00A2\u0006\u0002\u0010[J?\u0010\\\u001A\u00020 2\u0010\u0010\u0010\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u000E\u0010]\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000E\u0010^\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002\u00A2\u0006\u0002\u0010_J?\u0010`\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0010\u0010\u0010\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u000E\u0010\u001A\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001A\u00020\u000BH\u0002\u00A2\u0006\u0002\u0010aJu\u0010b\u001A\u00020\u000B2\u0012\u0010c\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001D0d2\u000E\u0010*\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010e\u001A\u00020\u000B2\u0006\u0010f\u001A\u00020\u000B2\u0006\u0010g\u001A\u0002062\u0014\u0010h\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070i2\u0014\u00109\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070iH\u0002\u00A2\u0006\u0002\u0010jJ\u001C\u0010k\u001A\u00020\u001D2\u0012\u0010c\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001D0dH\u0002JA\u0010k\u001A\u00020\u000B2\u0012\u0010c\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001D0d2\u000E\u0010*\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010e\u001A\u00020\u000B2\u0006\u0010g\u001A\u000206H\u0002\u00A2\u0006\u0002\u0010lJ\u0016\u0010k\u001A\u00020\u001D2\f\u0010$\u001A\b\u0012\u0004\u0012\u00028\u00000%H\u0016J,\u0010m\u001A\u00020\u000B2\u0012\u0010c\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001D0d2\u0006\u0010n\u001A\u00020\u000B2\u0006\u0010g\u001A\u000206H\u0002J\u001A\u0010o\u001A\u00020\u001D2\u0012\u0010c\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001D0dJ\u0015\u0010p\u001A\u00028\u00002\u0006\u0010!\u001A\u00020\u000BH\u0016\u00A2\u0006\u0002\u00100J=\u0010q\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000E\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001A\u00020\u000B2\u0006\u0010!\u001A\u00020\u000B2\u0006\u0010S\u001A\u000206H\u0002\u00A2\u0006\u0002\u0010TJ9\u0010r\u001A\u0004\u0018\u00010\b2\u0010\u0010\u0010\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0006\u0010R\u001A\u00020\u000B2\u0006\u00104\u001A\u00020\u000B2\u0006\u0010!\u001A\u00020\u000BH\u0002\u00A2\u0006\u0002\u0010sJ/\u0010t\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u000E\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u0018\u001A\u00020\u000BH\u0002\u00A2\u0006\u0002\u0010KJ\b\u0010R\u001A\u00020\u000BH\u0002J\u001E\u0010u\u001A\u00028\u00002\u0006\u0010!\u001A\u00020\u000B2\u0006\u0010\u001E\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0002\u0010vJE\u0010w\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000E\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u00104\u001A\u00020\u000B2\u0006\u0010!\u001A\u00020\u000B2\u0006\u0010x\u001A\u00028\u00002\u0006\u0010y\u001A\u000206H\u0002\u00A2\u0006\u0002\u00107JU\u0010z\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010{\u001A\u00020\u000B2\u0006\u00108\u001A\u00020\u000B2\u0016\u00109\u001A\u0012\u0012\u000E\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u00072\u0006\u0010:\u001A\u00020\u000B2\u000E\u0010;\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002\u00A2\u0006\u0002\u0010|Jl\u0010}\u001A\u00020 2\f\u0010$\u001A\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010!\u001A\u00020\u000B2\u000E\u0010~\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u007F\u001A\u00020\u000B2\u0016\u00109\u001A\u0012\u0012\u000E\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u00072\u0006\u0010:\u001A\u00020\u000B2\u000E\u0010;\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0002\u00A2\u0006\u0003\u0010\u0080\u0001J\b\u0010n\u001A\u00020\u000BH\u0002J\u0010\u0010n\u001A\u00020\u000B2\u0006\u0010\u0018\u001A\u00020\u000BH\u0002R\u000E\u0010\r\u001A\u00020\u000EX\u0082\u000E\u00A2\u0006\u0002\n\u0000R4\u0010\u0010\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\u0010\u0010\u000F\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007@BX\u0080\u000E\u00A2\u0006\n\n\u0002\u0010\u0013\u001A\u0004\b\u0011\u0010\u0012R\u001A\u0010\n\u001A\u00020\u000BX\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001E\u0010\u0018\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000B@RX\u0096\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u0015R0\u0010\u001A\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000E\u0010\u000F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007@BX\u0080\u000E\u00A2\u0006\n\n\u0002\u0010\u0013\u001A\u0004\b\u001B\u0010\u0012R\u0014\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u0006\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X\u0082\u000E\u00A2\u0006\u0004\n\u0002\u0010\u0013R\u0018\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u000E\u00A2\u0006\u0004\n\u0002\u0010\u0013\u00A8\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "E", "Lkotlin/collections/AbstractMutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "vector", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "vectorRoot", "", "", "vectorTail", "rootShift", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "root", "getRoot$runtime_release", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getRootShift$runtime_release", "()I", "setRootShift$runtime_release", "(I)V", "size", "getSize", "tail", "getTail$runtime_release", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "bufferFor", "(I)[Ljava/lang/Object;", "build", "copyToBuffer", "buffer", "bufferIndex", "sourceIterator", "", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "get", "(I)Ljava/lang/Object;", "getModCount", "getModCount$runtime_release", "insertIntoRoot", "shift", "elementCarry", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "rightShift", "buffers", "nullBuffers", "nextBuffer", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "insertIntoTail", "([Ljava/lang/Object;ILjava/lang/Object;)V", "isMutable", "([Ljava/lang/Object;)Z", "iterator", "", "leafBufferIterator", "", "listIterator", "", "makeMutable", "([Ljava/lang/Object;)[Ljava/lang/Object;", "makeMutableShiftingRight", "distance", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "mutableBuffer", "mutableBufferWith", "(Ljava/lang/Object;)[Ljava/lang/Object;", "nullifyAfter", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "pullLastBuffer", "rootSize", "tailCarry", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "pullLastBufferFromRoot", "([Ljava/lang/Object;II)V", "pushBuffers", "buffersIterator", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "pushBuffersIncreasingHeightIfNeeded", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "pushFilledTail", "filledTail", "newTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "pushTail", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "recyclableRemoveAll", "predicate", "Lkotlin/Function1;", "bufferSize", "toBufferSize", "bufferRef", "recyclableBuffers", "", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;Ljava/util/List;Ljava/util/List;)I", "removeAll", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "removeAllFromTail", "tailSize", "removeAllWithPredicate", "removeAt", "removeFromRootAt", "removeFromTailAt", "([Ljava/lang/Object;III)Ljava/lang/Object;", "retainFirst", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "setInRoot", "e", "oldElementCarry", "shiftLeafBuffers", "startLeafIndex", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "splitToBuffers", "startBuffer", "startBufferSize", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentVectorBuilder extends AbstractMutableList implements Builder {
    private MutabilityOwnership ownership;
    private Object[] root;
    private int rootShift;
    private int size;
    private Object[] tail;
    private PersistentList vector;
    private Object[] vectorRoot;
    private Object[] vectorTail;

    public PersistentVectorBuilder(PersistentList persistentList0, Object[] arr_object, Object[] arr_object1, int v) {
        Intrinsics.checkNotNullParameter(persistentList0, "vector");
        Intrinsics.checkNotNullParameter(arr_object1, "vectorTail");
        super();
        this.vector = persistentList0;
        this.vectorRoot = arr_object;
        this.vectorTail = arr_object1;
        this.rootShift = v;
        this.ownership = new MutabilityOwnership();
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    @Override  // kotlin.collections.AbstractMutableList
    public void add(int v, Object object0) {
        ListImplementation.checkPositionIndex$runtime_release(v, this.size());
        if(v == this.size()) {
            this.add(object0);
            return;
        }
        ++this.modCount;
        int v1 = this.rootSize();
        if(v >= v1) {
            this.insertIntoTail(this.root, v - v1, object0);
            return;
        }
        ObjectRef objectRef0 = new ObjectRef(null);
        Object[] arr_object = this.root;
        Intrinsics.checkNotNull(arr_object);
        this.insertIntoTail(this.insertIntoRoot(arr_object, this.rootShift, v, object0, objectRef0), 0, objectRef0.getValue());
    }

    @Override
    public boolean add(Object object0) {
        ++this.modCount;
        int v = this.tailSize();
        if(v < 0x20) {
            Object[] arr_object = this.makeMutable(this.tail);
            arr_object[v] = object0;
            this.tail = arr_object;
            this.size = this.size() + 1;
            return true;
        }
        Object[] arr_object1 = this.mutableBufferWith(object0);
        this.pushFilledTail(this.root, this.tail, arr_object1);
        return true;
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        Object[] arr_object1;
        Intrinsics.checkNotNullParameter(collection0, "elements");
        ListImplementation.checkPositionIndex$runtime_release(v, this.size());
        if(v == this.size()) {
            return this.addAll(collection0);
        }
        if(collection0.isEmpty()) {
            return false;
        }
        ++this.modCount;
        int v1 = v >> 5 << 5;
        int v2 = (this.size() - v1 + collection0.size() - 1) / 0x20;
        if(v2 == 0) {
            Object[] arr_object = ArraysKt.copyInto(this.tail, this.makeMutable(this.tail), (v + collection0.size() - 1 & 0x1F) + 1, v & 0x1F, this.tailSize());
            this.copyToBuffer(arr_object, v & 0x1F, collection0.iterator());
            this.tail = arr_object;
            this.size = this.size() + collection0.size();
            return true;
        }
        Object[][] arr2_object = new Object[v2][];
        int v3 = this.tailSize();
        int v4 = this.tailSize(this.size() + collection0.size());
        if(v >= this.rootSize()) {
            arr_object1 = this.mutableBuffer();
            this.splitToBuffers(collection0, v, this.tail, v3, arr2_object, v2, arr_object1);
        }
        else if(v4 > v3) {
            int v5 = v4 - v3;
            arr_object1 = this.makeMutableShiftingRight(this.tail, v5);
            this.insertIntoRoot(collection0, v, v5, arr2_object, v2, arr_object1);
        }
        else {
            int v6 = v3 - v4;
            arr_object1 = ArraysKt.copyInto(this.tail, this.mutableBuffer(), 0, v6, v3);
            Object[] arr_object2 = this.makeMutableShiftingRight(this.tail, 0x20 - v6);
            arr2_object[v2 - 1] = arr_object2;
            this.insertIntoRoot(collection0, v, 0x20 - v6, arr2_object, v2 - 1, arr_object2);
        }
        this.root = this.pushBuffersIncreasingHeightIfNeeded(this.root, v1, arr2_object);
        this.tail = arr_object1;
        this.size = this.size() + collection0.size();
        return true;
    }

    @Override
    public boolean addAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(collection0.isEmpty()) {
            return false;
        }
        ++this.modCount;
        int v = this.tailSize();
        Iterator iterator0 = collection0.iterator();
        if(0x20 - v >= collection0.size()) {
            this.tail = this.copyToBuffer(this.makeMutable(this.tail), v, iterator0);
            this.size = this.size() + collection0.size();
            return true;
        }
        int v1 = (collection0.size() + v - 1) / 0x20;
        Object[][] arr2_object = new Object[v1][];
        arr2_object[0] = this.copyToBuffer(this.makeMutable(this.tail), v, iterator0);
        if(1 < v1) {
            for(int v2 = 1; true; ++v2) {
                arr2_object[v2] = this.copyToBuffer(this.mutableBuffer(), 0, iterator0);
                if(v2 + 1 >= v1) {
                    break;
                }
            }
        }
        this.root = this.pushBuffersIncreasingHeightIfNeeded(this.root, this.rootSize(), arr2_object);
        this.tail = this.copyToBuffer(this.mutableBuffer(), 0, iterator0);
        this.size = this.size() + collection0.size();
        return true;
    }

    private final Object[] bufferFor(int v) {
        if(this.rootSize() <= v) {
            return this.tail;
        }
        Object[] arr_object = this.root;
        Intrinsics.checkNotNull(arr_object);
        for(int v1 = this.rootShift; v1 > 0; v1 -= 5) {
            Object object0 = arr_object[v >> v1 & 0x1F];
            if(object0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            arr_object = (Object[])object0;
        }
        return arr_object;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection$Builder
    public PersistentCollection build() {
        return this.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList$Builder
    public PersistentList build() {
        PersistentList persistentList0;
        if(this.root != this.vectorRoot || this.tail != this.vectorTail) {
            this.ownership = new MutabilityOwnership();
            this.vectorRoot = this.root;
            Object[] arr_object = this.tail;
            this.vectorTail = arr_object;
            if(this.root != null) {
                Object[] arr_object2 = this.root;
                Intrinsics.checkNotNull(arr_object2);
                persistentList0 = new PersistentVector(arr_object2, this.tail, this.size(), this.rootShift);
            }
            else if(arr_object.length == 0) {
                persistentList0 = UtilsKt.persistentVectorOf();
            }
            else {
                Object[] arr_object1 = Arrays.copyOf(this.tail, this.size());
                Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOf(this, newSize)");
                persistentList0 = new SmallPersistentVector(arr_object1);
            }
        }
        else {
            persistentList0 = this.vector;
        }
        this.vector = persistentList0;
        return persistentList0;
    }

    private final Object[] copyToBuffer(Object[] arr_object, int v, Iterator iterator0) {
        while(v < 0x20 && iterator0.hasNext()) {
            Object object0 = iterator0.next();
            arr_object[v] = object0;
            ++v;
        }
        return arr_object;
    }

    @Override
    public Object get(int v) {
        ListImplementation.checkElementIndex$runtime_release(v, this.size());
        return this.bufferFor(v)[v & 0x1F];
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    public final Object[] getRoot$runtime_release() {
        return this.root;
    }

    public final int getRootShift$runtime_release() {
        return this.rootShift;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    public final Object[] getTail$runtime_release() {
        return this.tail;
    }

    private final void insertIntoRoot(Collection collection0, int v, int v1, Object[][] arr2_object, int v2, Object[] arr_object) {
        if(this.root == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object[] arr_object1 = this.shiftLeafBuffers(v >> 5, v1, arr2_object, v2, arr_object);
        int v3 = v2 - ((this.rootSize() >> 5) - 1 - (v >> 5));
        if(v3 < v2) {
            arr_object = arr2_object[v3];
            Intrinsics.checkNotNull(arr_object);
        }
        this.splitToBuffers(collection0, v, arr_object1, 0x20, arr2_object, v3, arr_object);
    }

    private final Object[] insertIntoRoot(Object[] arr_object, int v, int v1, Object object0, ObjectRef objectRef0) {
        int v2 = v1 >> v & 0x1F;
        if(v == 0) {
            objectRef0.setValue(arr_object[0x1F]);
            Object[] arr_object1 = ArraysKt.copyInto(arr_object, this.makeMutable(arr_object), v2 + 1, v2, 0x1F);
            arr_object1[v2] = object0;
            return arr_object1;
        }
        Object[] arr_object2 = this.makeMutable(arr_object);
        Object object1 = arr_object2[v2];
        if(object1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        arr_object2[v2] = this.insertIntoRoot(((Object[])object1), v - 5, v1, object0, objectRef0);
        int v3 = v2 + 1;
        if(v3 < 0x20) {
            Object object2;
            while((object2 = arr_object2[v3]) != null) {
                arr_object2[v3] = this.insertIntoRoot(((Object[])object2), v - 5, 0, objectRef0.getValue(), objectRef0);
                if(v3 + 1 >= 0x20) {
                    break;
                }
                ++v3;
            }
        }
        return arr_object2;
    }

    private final void insertIntoTail(Object[] arr_object, int v, Object object0) {
        int v1 = this.tailSize();
        Object[] arr_object1 = this.makeMutable(this.tail);
        if(v1 < 0x20) {
            ArraysKt.copyInto(this.tail, arr_object1, v + 1, v, v1);
            arr_object1[v] = object0;
            this.root = arr_object;
            this.tail = arr_object1;
            this.size = this.size() + 1;
            return;
        }
        Object[] arr_object2 = this.tail;
        Object object1 = arr_object2[0x1F];
        ArraysKt.copyInto(arr_object2, arr_object1, v + 1, v, 0x1F);
        arr_object1[v] = object0;
        this.pushFilledTail(arr_object, arr_object1, this.mutableBufferWith(object1));
    }

    private final boolean isMutable(Object[] arr_object) {
        return arr_object.length == 33 && arr_object[0x20] == this.ownership;
    }

    @Override
    public Iterator iterator() {
        return this.listIterator();
    }

    private final ListIterator leafBufferIterator(int v) {
        if(this.root == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int v1 = this.rootSize();
        ListImplementation.checkPositionIndex$runtime_release(v, v1 >> 5);
        int v2 = this.rootShift;
        if(v2 == 0) {
            Object[] arr_object = this.root;
            Intrinsics.checkNotNull(arr_object);
            return new SingleElementListIterator(arr_object, v);
        }
        Object[] arr_object1 = this.root;
        Intrinsics.checkNotNull(arr_object1);
        return new TrieIterator(arr_object1, v, v1 >> 5, v2 / 5);
    }

    @Override
    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    @Override
    public ListIterator listIterator(int v) {
        ListImplementation.checkPositionIndex$runtime_release(v, this.size());
        return new PersistentVectorMutableIterator(this, v);
    }

    private final Object[] makeMutable(Object[] arr_object) {
        if(arr_object == null) {
            return this.mutableBuffer();
        }
        return this.isMutable(arr_object) ? arr_object : ArraysKt.copyInto$default(arr_object, this.mutableBuffer(), 0, 0, RangesKt.coerceAtMost(arr_object.length, 0x20), 6, null);
    }

    // 去混淆评级： 低(20)
    private final Object[] makeMutableShiftingRight(Object[] arr_object, int v) {
        return this.isMutable(arr_object) ? ArraysKt.copyInto(arr_object, arr_object, v, 0, 0x20 - v) : ArraysKt.copyInto(arr_object, this.mutableBuffer(), v, 0, 0x20 - v);
    }

    private final Object[] mutableBuffer() {
        Object[] arr_object = new Object[33];
        arr_object[0x20] = this.ownership;
        return arr_object;
    }

    private final Object[] mutableBufferWith(Object object0) {
        Object[] arr_object = new Object[33];
        arr_object[0] = object0;
        arr_object[0x20] = this.ownership;
        return arr_object;
    }

    private final Object[] nullifyAfter(Object[] arr_object, int v, int v1) {
        if(v1 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(v1 == 0) {
            return arr_object;
        }
        int v2 = v >> v1 & 0x1F;
        Object object0 = arr_object[v2];
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] arr_object1 = this.nullifyAfter(((Object[])object0), v, v1 - 5);
        if(v2 < 0x1F && arr_object[v2 + 1] != null) {
            if(this.isMutable(arr_object)) {
                ArraysKt.fill(arr_object, null, v2 + 1, 0x20);
            }
            arr_object = ArraysKt.copyInto(arr_object, this.mutableBuffer(), 0, 0, v2 + 1);
        }
        if(arr_object1 != arr_object[v2]) {
            arr_object = this.makeMutable(arr_object);
            arr_object[v2] = arr_object1;
        }
        return arr_object;
    }

    private final Object[] pullLastBuffer(Object[] arr_object, int v, int v1, ObjectRef objectRef0) {
        Object[] arr_object1;
        int v2 = v1 - 1 >> v & 0x1F;
        if(v == 5) {
            objectRef0.setValue(arr_object[v2]);
            arr_object1 = null;
        }
        else {
            Object object0 = arr_object[v2];
            if(object0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            arr_object1 = this.pullLastBuffer(((Object[])object0), v - 5, v1, objectRef0);
        }
        if(arr_object1 == null && v2 == 0) {
            return null;
        }
        Object[] arr_object2 = this.makeMutable(arr_object);
        arr_object2[v2] = arr_object1;
        return arr_object2;
    }

    private final void pullLastBufferFromRoot(Object[] arr_object, int v, int v1) {
        if(v1 == 0) {
            this.root = null;
            if(arr_object == null) {
                arr_object = new Object[0];
            }
            this.tail = arr_object;
            this.size = v;
            this.rootShift = 0;
            return;
        }
        ObjectRef objectRef0 = new ObjectRef(null);
        Intrinsics.checkNotNull(arr_object);
        Object[] arr_object1 = this.pullLastBuffer(arr_object, v1, v, objectRef0);
        Intrinsics.checkNotNull(arr_object1);
        Object object0 = objectRef0.getValue();
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        this.tail = (Object[])object0;
        this.size = v;
        if(arr_object1[1] == null) {
            this.root = (Object[])arr_object1[0];
            this.rootShift = v1 - 5;
            return;
        }
        this.root = arr_object1;
        this.rootShift = v1;
    }

    private final Object[] pushBuffers(Object[] arr_object, int v, int v1, Iterator iterator0) {
        if(!iterator0.hasNext() || v1 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(v1 == 0) {
            return iterator0.next();
        }
        Object[] arr_object1 = this.makeMutable(arr_object);
        int v2 = v >> v1 & 0x1F;
        arr_object1[v2] = this.pushBuffers(((Object[])arr_object1[v2]), v, v1 - 5, iterator0);
        while(true) {
            ++v2;
            if(v2 >= 0x20 || !iterator0.hasNext()) {
                break;
            }
            arr_object1[v2] = this.pushBuffers(((Object[])arr_object1[v2]), 0, v1 - 5, iterator0);
        }
        return arr_object1;
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] arr_object, int v, Object[][] arr2_object) {
        Iterator iterator0 = ArrayIteratorKt.iterator(arr2_object);
        int v1 = this.rootShift;
        Object[] arr_object1 = v >> 5 >= 1 << v1 ? this.makeMutable(arr_object) : this.pushBuffers(arr_object, v, v1, iterator0);
        while(iterator0.hasNext()) {
            this.rootShift += 5;
            arr_object1 = this.mutableBufferWith(arr_object1);
            this.pushBuffers(arr_object1, 1 << this.rootShift, this.rootShift, iterator0);
        }
        return arr_object1;
    }

    private final void pushFilledTail(Object[] arr_object, Object[] arr_object1, Object[] arr_object2) {
        int v = this.rootShift;
        if(this.size() >> 5 > 1 << v) {
            this.root = this.pushTail(this.mutableBufferWith(arr_object), arr_object1, this.rootShift + 5);
            this.tail = arr_object2;
            this.rootShift += 5;
            this.size = this.size() + 1;
            return;
        }
        if(arr_object == null) {
            this.root = arr_object1;
            this.tail = arr_object2;
            this.size = this.size() + 1;
            return;
        }
        this.root = this.pushTail(arr_object, arr_object1, v);
        this.tail = arr_object2;
        this.size = this.size() + 1;
    }

    private final Object[] pushTail(Object[] arr_object, Object[] arr_object1, int v) {
        int v1 = this.size() - 1 >> v & 0x1F;
        Object[] arr_object2 = this.makeMutable(arr_object);
        if(v == 5) {
            arr_object2[v1] = arr_object1;
            return arr_object2;
        }
        arr_object2[v1] = this.pushTail(((Object[])arr_object2[v1]), arr_object1, v - 5);
        return arr_object2;
    }

    private final int recyclableRemoveAll(Function1 function10, Object[] arr_object, int v, int v1, ObjectRef objectRef0, List list0, List list1) {
        Object[] arr_object1;
        if(this.isMutable(arr_object)) {
            list0.add(arr_object);
        }
        Object object0 = objectRef0.getValue();
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        if(v > 0) {
            arr_object1 = (Object[])object0;
            for(int v2 = 0; true; ++v2) {
                Object object1 = arr_object[v2];
                if(!((Boolean)function10.invoke(object1)).booleanValue()) {
                    if(v1 == 0x20) {
                        arr_object1 = !list0.isEmpty() == 0 ? this.mutableBuffer() : ((Object[])list0.remove(list0.size() - 1));
                        v1 = 0;
                    }
                    arr_object1[v1] = object1;
                    ++v1;
                }
                if(v2 + 1 >= v) {
                    break;
                }
            }
        }
        else {
            arr_object1 = (Object[])object0;
        }
        objectRef0.setValue(arr_object1);
        if(((Object[])object0) != objectRef0.getValue()) {
            list1.add(((Object[])object0));
        }
        return v1;
    }

    private final int removeAll(Function1 function10, Object[] arr_object, int v, ObjectRef objectRef0) {
        if(v > 0) {
            Object[] arr_object1 = arr_object;
            int v2 = v;
            boolean z = false;
            for(int v1 = 0; true; ++v1) {
                Object object0 = arr_object[v1];
                if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                    if(z) {
                        arr_object1[v2] = object0;
                        ++v2;
                    }
                }
                else if(!z) {
                    arr_object1 = this.makeMutable(arr_object);
                    z = true;
                    v2 = v1;
                }
                if(v1 + 1 >= v) {
                    break;
                }
            }
            arr_object = arr_object1;
            v = v2;
        }
        objectRef0.setValue(arr_object);
        return v;
    }

    private final boolean removeAll(Function1 function10) {
        Object[] arr_object;
        int v = this.tailSize();
        ObjectRef objectRef0 = new ObjectRef(null);
        if(this.root == null) {
            return this.removeAllFromTail(function10, v, objectRef0) != v;
        }
        ListIterator listIterator0 = this.leafBufferIterator(0);
        int v1;
        for(v1 = 0x20; v1 == 0x20 && listIterator0.hasNext(); v1 = this.removeAll(function10, ((Object[])listIterator0.next()), 0x20, objectRef0)) {
        }
        if(v1 == 0x20) {
            listIterator0.hasNext();
            int v2 = this.removeAllFromTail(function10, v, objectRef0);
            if(v2 == 0) {
                this.pullLastBufferFromRoot(this.root, this.size(), this.rootShift);
            }
            return v2 != v;
        }
        int v3 = listIterator0.previousIndex() << 5;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        int v4;
        for(v4 = v1; listIterator0.hasNext(); v4 = this.recyclableRemoveAll(function10, ((Object[])listIterator0.next()), 0x20, v4, objectRef0, arrayList1, arrayList0)) {
        }
        int v5 = this.recyclableRemoveAll(function10, this.tail, v, v4, objectRef0, arrayList1, arrayList0);
        Object object0 = objectRef0.getValue();
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        ArraysKt.fill(((Object[])object0), null, v5, 0x20);
        if(arrayList0.isEmpty()) {
            arr_object = this.root;
            Intrinsics.checkNotNull(arr_object);
        }
        else {
            arr_object = this.pushBuffers(this.root, v3, this.rootShift, arrayList0.iterator());
        }
        int v6 = v3 + (arrayList0.size() << 5);
        this.root = this.retainFirst(arr_object, v6);
        this.tail = (Object[])object0;
        this.size = v6 + v5;
        return true;
    }

    @Override
    public boolean removeAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.removeAllWithPredicate(new Function1() {
            final Collection $elements;

            {
                this.$elements = collection0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(object0));
            }

            public final boolean invoke(Object object0) {
                return this.$elements.contains(object0);
            }
        });
    }

    private final int removeAllFromTail(Function1 function10, int v, ObjectRef objectRef0) {
        int v1 = this.removeAll(function10, this.tail, v, objectRef0);
        if(v1 == v) {
            boolean z = objectRef0.getValue() != this.tail;
            return v;
        }
        Object object0 = objectRef0.getValue();
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        ArraysKt.fill(((Object[])object0), null, v1, v);
        this.tail = (Object[])object0;
        this.size = this.size() - (v - v1);
        return v1;
    }

    public final boolean removeAllWithPredicate(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        boolean z = this.removeAll(function10);
        if(z) {
            ++this.modCount;
        }
        return z;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public Object removeAt(int v) {
        ListImplementation.checkElementIndex$runtime_release(v, this.size());
        ++this.modCount;
        int v1 = this.rootSize();
        if(v >= v1) {
            return this.removeFromTailAt(this.root, v1, this.rootShift, v - v1);
        }
        ObjectRef objectRef0 = new ObjectRef(this.tail[0]);
        Object[] arr_object = this.root;
        Intrinsics.checkNotNull(arr_object);
        this.removeFromTailAt(this.removeFromRootAt(arr_object, this.rootShift, v, objectRef0), v1, this.rootShift, 0);
        return objectRef0.getValue();
    }

    private final Object[] removeFromRootAt(Object[] arr_object, int v, int v1, ObjectRef objectRef0) {
        int v2 = v1 >> v & 0x1F;
        int v3 = 0x1F;
        if(v == 0) {
            Object object0 = arr_object[v2];
            Object[] arr_object1 = ArraysKt.copyInto(arr_object, this.makeMutable(arr_object), v2, v2 + 1, 0x20);
            arr_object1[0x1F] = objectRef0.getValue();
            objectRef0.setValue(object0);
            return arr_object1;
        }
        if(arr_object[0x1F] == null) {
            v3 = this.rootSize() - 1 >> v & 0x1F;
        }
        Object[] arr_object2 = this.makeMutable(arr_object);
        if(v2 + 1 <= v3) {
            while(true) {
                Object object1 = arr_object2[v3];
                if(object1 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                arr_object2[v3] = this.removeFromRootAt(((Object[])object1), v - 5, 0, objectRef0);
                if(v3 == v2 + 1) {
                    break;
                }
                --v3;
            }
        }
        Object object2 = arr_object2[v2];
        if(object2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        arr_object2[v2] = this.removeFromRootAt(((Object[])object2), v - 5, v1, objectRef0);
        return arr_object2;
    }

    private final Object removeFromTailAt(Object[] arr_object, int v, int v1, int v2) {
        int v3 = this.size() - v;
        if(v3 == 1) {
            Object object0 = this.tail[0];
            this.pullLastBufferFromRoot(arr_object, v, v1);
            return object0;
        }
        Object[] arr_object1 = this.tail;
        Object object1 = arr_object1[v2];
        Object[] arr_object2 = ArraysKt.copyInto(arr_object1, this.makeMutable(arr_object1), v2, v2 + 1, v3);
        arr_object2[v3 - 1] = null;
        this.root = arr_object;
        this.tail = arr_object2;
        this.size = v + v3 - 1;
        this.rootShift = v1;
        return object1;
    }

    private final Object[] retainFirst(Object[] arr_object, int v) {
        int v1;
        if((v & 0x1F) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        if(v == 0) {
            this.rootShift = 0;
            return null;
        }
        while(true) {
            v1 = this.rootShift;
            if(v - 1 >> v1 != 0) {
                break;
            }
            this.rootShift = v1 - 5;
            Object object0 = arr_object[0];
            if(object0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            arr_object = (Object[])object0;
        }
        return this.nullifyAfter(arr_object, v - 1, v1);
    }

    private final int rootSize() {
        return this.size() > 0x20 ? this.size() - 1 & 0xFFFFFFE0 : 0;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public Object set(int v, Object object0) {
        ListImplementation.checkElementIndex$runtime_release(v, this.size());
        if(this.rootSize() <= v) {
            Object[] arr_object = this.makeMutable(this.tail);
            if(arr_object != this.tail) {
                ++this.modCount;
            }
            Object object1 = arr_object[v & 0x1F];
            arr_object[v & 0x1F] = object0;
            this.tail = arr_object;
            return object1;
        }
        ObjectRef objectRef0 = new ObjectRef(null);
        Object[] arr_object1 = this.root;
        Intrinsics.checkNotNull(arr_object1);
        this.root = this.setInRoot(arr_object1, this.rootShift, v, object0, objectRef0);
        return objectRef0.getValue();
    }

    private final Object[] setInRoot(Object[] arr_object, int v, int v1, Object object0, ObjectRef objectRef0) {
        int v2 = v1 >> v & 0x1F;
        Object[] arr_object1 = this.makeMutable(arr_object);
        if(v == 0) {
            if(arr_object1 != arr_object) {
                ++this.modCount;
            }
            objectRef0.setValue(arr_object1[v2]);
            arr_object1[v2] = object0;
            return arr_object1;
        }
        Object object1 = arr_object1[v2];
        if(object1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        arr_object1[v2] = this.setInRoot(((Object[])object1), v - 5, v1, object0, objectRef0);
        return arr_object1;
    }

    public final void setRootShift$runtime_release(int v) {
        this.rootShift = v;
    }

    private final Object[] shiftLeafBuffers(int v, int v1, Object[][] arr2_object, int v2, Object[] arr_object) {
        if(this.root == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ListIterator listIterator0 = this.leafBufferIterator(this.rootSize() >> 5);
        while(listIterator0.previousIndex() != v) {
            Object[] arr_object1 = (Object[])listIterator0.previous();
            ArraysKt.copyInto(arr_object1, arr_object, 0, 0x20 - v1, 0x20);
            arr_object = this.makeMutableShiftingRight(arr_object1, v1);
            --v2;
            arr2_object[v2] = arr_object;
        }
        return (Object[])listIterator0.previous();
    }

    private final void splitToBuffers(Collection collection0, int v, Object[] arr_object, int v1, Object[][] arr2_object, int v2, Object[] arr_object1) {
        Object[] arr_object3;
        if(v2 < 1) {
            throw new IllegalStateException("Check failed.");
        }
        Object[] arr_object2 = this.makeMutable(arr_object);
        arr2_object[0] = arr_object2;
        int v4 = v + collection0.size() - 1 & 0x1F;
        int v5 = v1 - (v & 0x1F) + v4;
        if(v5 < 0x20) {
            ArraysKt.copyInto(arr_object2, arr_object1, v4 + 1, v & 0x1F, v1);
        }
        else {
            if(v2 == 1) {
                arr_object3 = arr_object2;
            }
            else {
                arr_object3 = this.mutableBuffer();
                --v2;
                arr2_object[v2] = arr_object3;
            }
            int v6 = v1 - (v5 - 0x1F);
            ArraysKt.copyInto(arr_object2, arr_object1, 0, v6, v1);
            ArraysKt.copyInto(arr_object2, arr_object3, v4 + 1, v & 0x1F, v6);
            arr_object1 = arr_object3;
        }
        Iterator iterator0 = collection0.iterator();
        this.copyToBuffer(arr_object2, v & 0x1F, iterator0);
        if(1 < v2) {
            for(int v3 = 1; true; ++v3) {
                arr2_object[v3] = this.copyToBuffer(this.mutableBuffer(), 0, iterator0);
                if(v3 + 1 >= v2) {
                    break;
                }
            }
        }
        this.copyToBuffer(arr_object1, 0, iterator0);
    }

    private final int tailSize() {
        return this.tailSize(this.size());
    }

    private final int tailSize(int v) {
        return v > 0x20 ? v - (v - 1 & 0xFFFFFFE0) : v;
    }
}

