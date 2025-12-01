package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001AQ\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0001\u00A2\u0006\u0002\u0010\u0007\u001A-\u0010\b\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0001\u00A2\u0006\u0002\u0010\f\u001A\u0014\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\nH\u0001\u001A-\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0001\u00A2\u0006\u0002\u0010\u000F\u001AQ\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0001\u00A2\u0006\u0002\u0010\u0007\u001A\u0014\u0010\u0011\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\nH\u0001\u001A-\u0010\u0011\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0001\u00A2\u0006\u0002\u0010\f\u001A \u0010\u0012\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0000\u001AQ\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0000\u00A2\u0006\u0002\u0010\u0007\u001A\u0014\u0010\u0013\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\nH\u0000\u001A-\u0010\u0013\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0000\u00A2\u0006\u0002\u0010\f\u001A\u0014\u0010\u0014\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\nH\u0000\u001A-\u0010\u0014\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0000\u00A2\u0006\u0002\u0010\u000F\u001A \u0010\u0015\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0000\u001AQ\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0000\u00A2\u0006\u0002\u0010\u0007\u001A\u0014\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\nH\u0000\u001A-\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u0012\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005\"\u0002H\nH\u0000\u00A2\u0006\u0002\u0010\f\u001A-\u0010\u0017\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0004\u001A-\u0010\u0017\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0004\u001A,\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u0006\u0010\u001B\u001A\u0002H\nH\u0080\n\u00A2\u0006\u0002\u0010\u001C\u001A4\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002\u00A2\u0006\u0002\u0010\u001D\u001A-\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001A-\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u001EH\u0080\u0002\u001A,\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\u0006\u0010\u001B\u001A\u0002H\nH\u0080\n\u00A2\u0006\u0002\u0010\u001F\u001A4\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002\u00A2\u0006\u0002\u0010 \u001A-\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001A-\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u001EH\u0080\u0002\u001A@\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010!\u001A\u0002H\u0002H\u0080\u0002\u00A2\u0006\u0002\u0010\"\u001AH\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u000E\u0010#\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005H\u0080\u0002\u00A2\u0006\u0002\u0010$\u001AA\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010#\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0019H\u0080\u0002\u001AA\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010#\u001A\b\u0012\u0004\u0012\u0002H\u00020\u001EH\u0080\u0002\u001A,\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u0006\u0010\u001B\u001A\u0002H\nH\u0080\n\u00A2\u0006\u0002\u0010%\u001A4\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002\u00A2\u0006\u0002\u0010&\u001A-\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001A-\u0010\u001A\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u001EH\u0080\u0002\u001A<\u0010\'\u001A\b\u0012\u0004\u0012\u0002H(0\u000E\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u000E2\u0018\u0010)\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H(0+\u0012\u0004\u0012\u00020,0*H\u0080\b\u00F8\u0001\u0000\u001AV\u0010\'\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001E\u0010)\u001A\u001A\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030-\u0012\u0004\u0012\u00020,0*H\u0080\b\u00F8\u0001\u0000\u001A<\u0010\'\u001A\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\t2\u0018\u0010)\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H(0.\u0012\u0004\u0012\u00020,0*H\u0080\b\u00F8\u0001\u0000\u001A,\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u0006\u0010\u001B\u001A\u0002H\nH\u0080\n\u00A2\u0006\u0002\u0010\u001C\u001A4\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002\u00A2\u0006\u0002\u0010\u001D\u001A-\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001A-\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u0018\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00182\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u001EH\u0080\u0002\u001A,\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\u0006\u0010\u001B\u001A\u0002H\nH\u0080\n\u00A2\u0006\u0002\u0010\u001F\u001A4\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002\u00A2\u0006\u0002\u0010 \u001A-\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001A-\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\u000E\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000E2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u001EH\u0080\u0002\u001AT\u0010/\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001A\u0010\u0004\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005H\u0080\n\u00A2\u0006\u0002\u00100\u001AG\u0010/\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u00101\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006H\u0080\n\u001AM\u0010/\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0019H\u0080\n\u001AI\u0010/\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u00102\u001A\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0080\n\u001AM\u0010/\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u001EH\u0080\n\u001A,\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u0006\u0010\u001B\u001A\u0002H\nH\u0080\n\u00A2\u0006\u0002\u0010%\u001A4\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0005H\u0080\u0002\u00A2\u0006\u0002\u0010&\u001A-\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u0019H\u0080\u0002\u001A-\u0010/\u001A\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\n0\u001EH\u0080\u0002\u001AS\u00104\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001A\u0010\u0004\u001A\u0016\u0012\u0012\b\u0001\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005H\u0000\u00A2\u0006\u0002\u00100\u001AL\u00104\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0019H\u0000\u001AH\u00104\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u00102\u001A\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001AL\u00104\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u001EH\u0000\u001A\u0012\u00105\u001A\b\u0012\u0004\u0012\u00020706*\u000208H\u0000\u001A\u001E\u00105\u001A\b\u0012\u0004\u0012\u0002H(06\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001A\u001E\u00105\u001A\b\u0012\u0004\u0012\u0002H(06\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001EH\u0000\u001A0\u00109\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030:\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001A\u0012\u0010;\u001A\b\u0012\u0004\u0012\u0002070\t*\u000208H\u0000\u001A\u001E\u0010;\u001A\b\u0012\u0004\u0012\u0002H(0<\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001A\u001E\u0010;\u001A\b\u0012\u0004\u0012\u0002H(0<\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001EH\u0000\u001A0\u0010=\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001A\u0012\u0010>\u001A\b\u0012\u0004\u0012\u0002070\t*\u000208H\u0000\u001A\u001E\u0010>\u001A\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001A\u001E\u0010>\u001A\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001EH\u0000\u001A\u0012\u0010?\u001A\b\u0012\u0004\u0012\u0002070\u000E*\u000208H\u0000\u001A\u001E\u0010?\u001A\b\u0012\u0004\u0012\u0002H(0\u000E\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001A\u001E\u0010?\u001A\b\u0012\u0004\u0012\u0002H(0\u000E\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001EH\u0000\u001A0\u0010@\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0000\u001A\u0012\u0010A\u001A\b\u0012\u0004\u0012\u0002070\t*\u000208H\u0000\u001A\u001E\u0010A\u001A\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u0019H\u0000\u001A\u001E\u0010A\u001A\b\u0012\u0004\u0012\u0002H(0\t\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u0002H(0\u001EH\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006B"}, d2 = {"immutableHashMapOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "K", "V", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "immutableHashSetOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "E", "elements", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "immutableListOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "immutableMapOf", "immutableSetOf", "persistentHashMapOf", "persistentHashSetOf", "persistentListOf", "persistentMapOf", "persistentSetOf", "intersect", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "", "minus", "element", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "Lkotlin/sequences/Sequence;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "key", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "keys", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "mutate", "T", "mutator", "Lkotlin/Function1;", "", "", "", "", "plus", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;[Lkotlin/Pair;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "pair", "map", "", "putAll", "toImmutableList", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "", "toImmutableMap", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "toImmutableSet", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "toPersistentHashMap", "toPersistentHashSet", "toPersistentList", "toPersistentMap", "toPersistentSet", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ExtensionsKt {
    @Deprecated(message = "Use persistentHashMapOf instead.", replaceWith = @ReplaceWith(expression = "persistentHashMapOf(*pairs)", imports = {}))
    public static final PersistentMap immutableHashMapOf(Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        return ExtensionsKt.persistentHashMapOf(((Pair[])Arrays.copyOf(arr_pair, arr_pair.length)));
    }

    @Deprecated(message = "Use persistentHashSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentHashSetOf(*elements)", imports = {}))
    public static final PersistentSet immutableHashSetOf(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return ExtensionsKt.persistentHashSetOf(Arrays.copyOf(arr_object, arr_object.length));
    }

    @Deprecated(message = "Use persistentListOf instead.", replaceWith = @ReplaceWith(expression = "persistentListOf()", imports = {}))
    public static final PersistentList immutableListOf() {
        return ExtensionsKt.persistentListOf();
    }

    @Deprecated(message = "Use persistentListOf instead.", replaceWith = @ReplaceWith(expression = "persistentListOf(*elements)", imports = {}))
    public static final PersistentList immutableListOf(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return ExtensionsKt.persistentListOf(Arrays.copyOf(arr_object, arr_object.length));
    }

    @Deprecated(message = "Use persistentMapOf instead.", replaceWith = @ReplaceWith(expression = "persistentMapOf(*pairs)", imports = {}))
    public static final PersistentMap immutableMapOf(Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        return ExtensionsKt.persistentMapOf(((Pair[])Arrays.copyOf(arr_pair, arr_pair.length)));
    }

    @Deprecated(message = "Use persistentSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentSetOf()", imports = {}))
    public static final PersistentSet immutableSetOf() {
        return ExtensionsKt.persistentSetOf();
    }

    @Deprecated(message = "Use persistentSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentSetOf(*elements)", imports = {}))
    public static final PersistentSet immutableSetOf(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return ExtensionsKt.persistentSetOf(Arrays.copyOf(arr_object, arr_object.length));
    }

    public static final PersistentSet intersect(PersistentCollection persistentCollection0, Iterable iterable0) {
        Intrinsics.checkNotNullParameter(persistentCollection0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        return ExtensionsKt.intersect(ExtensionsKt.toPersistentSet(persistentCollection0), iterable0);
    }

    public static final PersistentSet intersect(PersistentSet persistentSet0, Iterable iterable0) {
        Intrinsics.checkNotNullParameter(persistentSet0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return persistentSet0.retainAll(((Collection)iterable0));
        }
        Builder persistentSet$Builder0 = persistentSet0.builder();
        CollectionsKt.retainAll(persistentSet$Builder0, iterable0);
        return persistentSet$Builder0.build();
    }

    public static final PersistentCollection minus(PersistentCollection persistentCollection0, Iterable iterable0) {
        Intrinsics.checkNotNullParameter(persistentCollection0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return persistentCollection0.removeAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        CollectionsKt.removeAll(persistentCollection$Builder0, iterable0);
        return persistentCollection$Builder0.build();
    }

    public static final PersistentCollection minus(PersistentCollection persistentCollection0, Object object0) {
        Intrinsics.checkNotNullParameter(persistentCollection0, "<this>");
        return persistentCollection0.remove(object0);
    }

    public static final PersistentCollection minus(PersistentCollection persistentCollection0, Sequence sequence0) {
        Intrinsics.checkNotNullParameter(persistentCollection0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        CollectionsKt.removeAll(persistentCollection$Builder0, sequence0);
        return persistentCollection$Builder0.build();
    }

    public static final PersistentCollection minus(PersistentCollection persistentCollection0, Object[] arr_object) {
        Intrinsics.checkNotNullParameter(persistentCollection0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        CollectionsKt.removeAll(persistentCollection$Builder0, arr_object);
        return persistentCollection$Builder0.build();
    }

    public static final PersistentList minus(PersistentList persistentList0, Iterable iterable0) {
        Intrinsics.checkNotNullParameter(persistentList0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return persistentList0.removeAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        CollectionsKt.removeAll(persistentList$Builder0, iterable0);
        return persistentList$Builder0.build();
    }

    public static final PersistentList minus(PersistentList persistentList0, Object object0) {
        Intrinsics.checkNotNullParameter(persistentList0, "<this>");
        return persistentList0.remove(object0);
    }

    public static final PersistentList minus(PersistentList persistentList0, Sequence sequence0) {
        Intrinsics.checkNotNullParameter(persistentList0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        CollectionsKt.removeAll(persistentList$Builder0, sequence0);
        return persistentList$Builder0.build();
    }

    public static final PersistentList minus(PersistentList persistentList0, Object[] arr_object) {
        Intrinsics.checkNotNullParameter(persistentList0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        CollectionsKt.removeAll(persistentList$Builder0, arr_object);
        return persistentList$Builder0.build();
    }

    public static final PersistentMap minus(PersistentMap persistentMap0, Iterable iterable0) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "keys");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentMap0.builder();
        CollectionsKt.removeAll(persistentMap$Builder0.keySet(), iterable0);
        return persistentMap$Builder0.build();
    }

    public static final PersistentMap minus(PersistentMap persistentMap0, Object object0) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        return persistentMap0.remove(object0);
    }

    public static final PersistentMap minus(PersistentMap persistentMap0, Sequence sequence0) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "keys");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentMap0.builder();
        CollectionsKt.removeAll(persistentMap$Builder0.keySet(), sequence0);
        return persistentMap$Builder0.build();
    }

    public static final PersistentMap minus(PersistentMap persistentMap0, Object[] arr_object) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "keys");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentMap0.builder();
        CollectionsKt.removeAll(persistentMap$Builder0.keySet(), arr_object);
        return persistentMap$Builder0.build();
    }

    public static final PersistentSet minus(PersistentSet persistentSet0, Iterable iterable0) {
        Intrinsics.checkNotNullParameter(persistentSet0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return persistentSet0.removeAll(((Collection)iterable0));
        }
        Builder persistentSet$Builder0 = persistentSet0.builder();
        CollectionsKt.removeAll(persistentSet$Builder0, iterable0);
        return persistentSet$Builder0.build();
    }

    public static final PersistentSet minus(PersistentSet persistentSet0, Object object0) {
        Intrinsics.checkNotNullParameter(persistentSet0, "<this>");
        return persistentSet0.remove(object0);
    }

    public static final PersistentSet minus(PersistentSet persistentSet0, Sequence sequence0) {
        Intrinsics.checkNotNullParameter(persistentSet0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        Builder persistentSet$Builder0 = persistentSet0.builder();
        CollectionsKt.removeAll(persistentSet$Builder0, sequence0);
        return persistentSet$Builder0.build();
    }

    public static final PersistentSet minus(PersistentSet persistentSet0, Object[] arr_object) {
        Intrinsics.checkNotNullParameter(persistentSet0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        Builder persistentSet$Builder0 = persistentSet0.builder();
        CollectionsKt.removeAll(persistentSet$Builder0, arr_object);
        return persistentSet$Builder0.build();
    }

    public static final PersistentList mutate(PersistentList persistentList0, Function1 function10) {
        Intrinsics.checkNotNullParameter(persistentList0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "mutator");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        function10.invoke(persistentList$Builder0);
        return persistentList$Builder0.build();
    }

    public static final PersistentMap mutate(PersistentMap persistentMap0, Function1 function10) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "mutator");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentMap0.builder();
        function10.invoke(persistentMap$Builder0);
        return persistentMap$Builder0.build();
    }

    public static final PersistentSet mutate(PersistentSet persistentSet0, Function1 function10) {
        Intrinsics.checkNotNullParameter(persistentSet0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "mutator");
        Builder persistentSet$Builder0 = persistentSet0.builder();
        function10.invoke(persistentSet$Builder0);
        return persistentSet$Builder0.build();
    }

    public static final PersistentMap persistentHashMapOf() {
        return PersistentHashMap.Companion.emptyOf$runtime_release();
    }

    public static final PersistentMap persistentHashMapOf(Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = PersistentHashMap.Companion.emptyOf$runtime_release().builder();
        MapsKt.putAll(persistentMap$Builder0, arr_pair);
        return persistentMap$Builder0.build();
    }

    public static final PersistentSet persistentHashSetOf() {
        return PersistentHashSet.Companion.emptyOf$runtime_release();
    }

    public static final PersistentSet persistentHashSetOf(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return PersistentHashSet.Companion.emptyOf$runtime_release().addAll(ArraysKt.asList(arr_object));
    }

    public static final PersistentList persistentListOf() {
        return UtilsKt.persistentVectorOf();
    }

    public static final PersistentList persistentListOf(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return UtilsKt.persistentVectorOf().addAll(ArraysKt.asList(arr_object));
    }

    public static final PersistentMap persistentMapOf() {
        return PersistentOrderedMap.Companion.emptyOf$runtime_release();
    }

    public static final PersistentMap persistentMapOf(Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = PersistentOrderedMap.Companion.emptyOf$runtime_release().builder();
        MapsKt.putAll(persistentMap$Builder0, arr_pair);
        return persistentMap$Builder0.build();
    }

    public static final PersistentSet persistentSetOf() {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release();
    }

    public static final PersistentSet persistentSetOf(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return PersistentOrderedSet.Companion.emptyOf$runtime_release().addAll(ArraysKt.asList(arr_object));
    }

    public static final PersistentCollection plus(PersistentCollection persistentCollection0, Iterable iterable0) {
        Intrinsics.checkNotNullParameter(persistentCollection0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return persistentCollection0.addAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        CollectionsKt.addAll(persistentCollection$Builder0, iterable0);
        return persistentCollection$Builder0.build();
    }

    public static final PersistentCollection plus(PersistentCollection persistentCollection0, Object object0) {
        Intrinsics.checkNotNullParameter(persistentCollection0, "<this>");
        return persistentCollection0.add(object0);
    }

    public static final PersistentCollection plus(PersistentCollection persistentCollection0, Sequence sequence0) {
        Intrinsics.checkNotNullParameter(persistentCollection0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        CollectionsKt.addAll(persistentCollection$Builder0, sequence0);
        return persistentCollection$Builder0.build();
    }

    public static final PersistentCollection plus(PersistentCollection persistentCollection0, Object[] arr_object) {
        Intrinsics.checkNotNullParameter(persistentCollection0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        CollectionsKt.addAll(persistentCollection$Builder0, arr_object);
        return persistentCollection$Builder0.build();
    }

    public static final PersistentList plus(PersistentList persistentList0, Iterable iterable0) {
        Intrinsics.checkNotNullParameter(persistentList0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return persistentList0.addAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        CollectionsKt.addAll(persistentList$Builder0, iterable0);
        return persistentList$Builder0.build();
    }

    public static final PersistentList plus(PersistentList persistentList0, Object object0) {
        Intrinsics.checkNotNullParameter(persistentList0, "<this>");
        return persistentList0.add(object0);
    }

    public static final PersistentList plus(PersistentList persistentList0, Sequence sequence0) {
        Intrinsics.checkNotNullParameter(persistentList0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        CollectionsKt.addAll(persistentList$Builder0, sequence0);
        return persistentList$Builder0.build();
    }

    public static final PersistentList plus(PersistentList persistentList0, Object[] arr_object) {
        Intrinsics.checkNotNullParameter(persistentList0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        CollectionsKt.addAll(persistentList$Builder0, arr_object);
        return persistentList$Builder0.build();
    }

    public static final PersistentMap plus(PersistentMap persistentMap0, Iterable iterable0) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "pairs");
        return ExtensionsKt.putAll(persistentMap0, iterable0);
    }

    public static final PersistentMap plus(PersistentMap persistentMap0, Map map0) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "map");
        return ExtensionsKt.putAll(persistentMap0, map0);
    }

    public static final PersistentMap plus(PersistentMap persistentMap0, Pair pair0) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(pair0, "pair");
        return persistentMap0.put(pair0.getFirst(), pair0.getSecond());
    }

    public static final PersistentMap plus(PersistentMap persistentMap0, Sequence sequence0) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "pairs");
        return ExtensionsKt.putAll(persistentMap0, sequence0);
    }

    public static final PersistentMap plus(PersistentMap persistentMap0, Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        return ExtensionsKt.putAll(persistentMap0, arr_pair);
    }

    public static final PersistentSet plus(PersistentSet persistentSet0, Iterable iterable0) {
        Intrinsics.checkNotNullParameter(persistentSet0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return persistentSet0.addAll(((Collection)iterable0));
        }
        Builder persistentSet$Builder0 = persistentSet0.builder();
        CollectionsKt.addAll(persistentSet$Builder0, iterable0);
        return persistentSet$Builder0.build();
    }

    public static final PersistentSet plus(PersistentSet persistentSet0, Object object0) {
        Intrinsics.checkNotNullParameter(persistentSet0, "<this>");
        return persistentSet0.add(object0);
    }

    public static final PersistentSet plus(PersistentSet persistentSet0, Sequence sequence0) {
        Intrinsics.checkNotNullParameter(persistentSet0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "elements");
        Builder persistentSet$Builder0 = persistentSet0.builder();
        CollectionsKt.addAll(persistentSet$Builder0, sequence0);
        return persistentSet$Builder0.build();
    }

    public static final PersistentSet plus(PersistentSet persistentSet0, Object[] arr_object) {
        Intrinsics.checkNotNullParameter(persistentSet0, "<this>");
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        Builder persistentSet$Builder0 = persistentSet0.builder();
        CollectionsKt.addAll(persistentSet$Builder0, arr_object);
        return persistentSet$Builder0.build();
    }

    public static final PersistentMap putAll(PersistentMap persistentMap0, Iterable iterable0) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(iterable0, "pairs");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentMap0.builder();
        MapsKt.putAll(persistentMap$Builder0, iterable0);
        return persistentMap$Builder0.build();
    }

    public static final PersistentMap putAll(PersistentMap persistentMap0, Map map0) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "map");
        return persistentMap0.putAll(map0);
    }

    public static final PersistentMap putAll(PersistentMap persistentMap0, Sequence sequence0) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(sequence0, "pairs");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentMap0.builder();
        MapsKt.putAll(persistentMap$Builder0, sequence0);
        return persistentMap$Builder0.build();
    }

    public static final PersistentMap putAll(PersistentMap persistentMap0, Pair[] arr_pair) {
        Intrinsics.checkNotNullParameter(persistentMap0, "<this>");
        Intrinsics.checkNotNullParameter(arr_pair, "pairs");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = persistentMap0.builder();
        MapsKt.putAll(persistentMap$Builder0, arr_pair);
        return persistentMap$Builder0.build();
    }

    public static final ImmutableList toImmutableList(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return ExtensionsKt.toPersistentList(charSequence0);
    }

    public static final ImmutableList toImmutableList(Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        ImmutableList immutableList0 = iterable0 instanceof ImmutableList ? ((ImmutableList)iterable0) : null;
        return immutableList0 == null ? ExtensionsKt.toPersistentList(iterable0) : immutableList0;
    }

    public static final ImmutableList toImmutableList(Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return ExtensionsKt.toPersistentList(sequence0);
    }

    public static final ImmutableMap toImmutableMap(Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        PersistentMap persistentMap0 = null;
        ImmutableMap immutableMap0 = map0 instanceof ImmutableMap ? ((ImmutableMap)map0) : null;
        if(immutableMap0 == null) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder persistentMap$Builder0 = map0 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder ? ((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder)map0) : null;
            if(persistentMap$Builder0 != null) {
                persistentMap0 = persistentMap$Builder0.build();
            }
            immutableMap0 = persistentMap0;
            if(immutableMap0 == null) {
                return ExtensionsKt.persistentMapOf().putAll(map0);
            }
        }
        return immutableMap0;
    }

    public static final ImmutableSet toImmutableSet(Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        PersistentSet persistentSet0 = null;
        ImmutableSet immutableSet0 = iterable0 instanceof ImmutableSet ? ((ImmutableSet)iterable0) : null;
        if(immutableSet0 == null) {
            Builder persistentSet$Builder0 = iterable0 instanceof Builder ? ((Builder)iterable0) : null;
            if(persistentSet$Builder0 != null) {
                persistentSet0 = persistentSet$Builder0.build();
            }
            immutableSet0 = persistentSet0;
            if(immutableSet0 == null) {
                return ExtensionsKt.plus(ExtensionsKt.persistentSetOf(), iterable0);
            }
        }
        return immutableSet0;
    }

    public static final ImmutableSet toImmutableSet(Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return ExtensionsKt.toPersistentSet(sequence0);
    }

    public static final PersistentSet toImmutableSet(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        return ExtensionsKt.toPersistentSet(charSequence0);
    }

    public static final PersistentMap toPersistentHashMap(Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        PersistentHashMap persistentHashMap0 = null;
        PersistentHashMap persistentHashMap1 = map0 instanceof PersistentHashMap ? ((PersistentHashMap)map0) : null;
        if(persistentHashMap1 == null) {
            PersistentHashMapBuilder persistentHashMapBuilder0 = map0 instanceof PersistentHashMapBuilder ? ((PersistentHashMapBuilder)map0) : null;
            if(persistentHashMapBuilder0 != null) {
                persistentHashMap0 = persistentHashMapBuilder0.build();
            }
            return persistentHashMap0 == null ? PersistentHashMap.Companion.emptyOf$runtime_release().putAll(map0) : persistentHashMap0;
        }
        return persistentHashMap1;
    }

    public static final PersistentSet toPersistentHashSet(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Builder persistentSet$Builder0 = ExtensionsKt.persistentHashSetOf().builder();
        StringsKt.toCollection(charSequence0, persistentSet$Builder0);
        return persistentSet$Builder0.build();
    }

    public static final PersistentSet toPersistentHashSet(Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        PersistentHashSet persistentHashSet0 = null;
        PersistentHashSet persistentHashSet1 = iterable0 instanceof PersistentHashSet ? ((PersistentHashSet)iterable0) : null;
        if(persistentHashSet1 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder0 = iterable0 instanceof PersistentHashSetBuilder ? ((PersistentHashSetBuilder)iterable0) : null;
            if(persistentHashSetBuilder0 != null) {
                persistentHashSet0 = persistentHashSetBuilder0.build();
            }
            return persistentHashSet0 == null ? ExtensionsKt.plus(PersistentHashSet.Companion.emptyOf$runtime_release(), iterable0) : persistentHashSet0;
        }
        return persistentHashSet1;
    }

    public static final PersistentSet toPersistentHashSet(Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return ExtensionsKt.plus(ExtensionsKt.persistentHashSetOf(), sequence0);
    }

    public static final PersistentList toPersistentList(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = ExtensionsKt.persistentListOf().builder();
        StringsKt.toCollection(charSequence0, persistentList$Builder0);
        return persistentList$Builder0.build();
    }

    public static final PersistentList toPersistentList(Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        PersistentList persistentList0 = null;
        PersistentList persistentList1 = iterable0 instanceof PersistentList ? ((PersistentList)iterable0) : null;
        if(persistentList1 == null) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = iterable0 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder ? ((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder)iterable0) : null;
            if(persistentList$Builder0 != null) {
                persistentList0 = persistentList$Builder0.build();
            }
            return persistentList0 == null ? ExtensionsKt.plus(ExtensionsKt.persistentListOf(), iterable0) : persistentList0;
        }
        return persistentList1;
    }

    public static final PersistentList toPersistentList(Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return ExtensionsKt.plus(ExtensionsKt.persistentListOf(), sequence0);
    }

    public static final PersistentMap toPersistentMap(Map map0) {
        Intrinsics.checkNotNullParameter(map0, "<this>");
        PersistentMap persistentMap0 = null;
        PersistentOrderedMap persistentOrderedMap0 = map0 instanceof PersistentOrderedMap ? ((PersistentOrderedMap)map0) : null;
        if(persistentOrderedMap0 == null) {
            PersistentOrderedMapBuilder persistentOrderedMapBuilder0 = map0 instanceof PersistentOrderedMapBuilder ? ((PersistentOrderedMapBuilder)map0) : null;
            if(persistentOrderedMapBuilder0 != null) {
                persistentMap0 = persistentOrderedMapBuilder0.build();
            }
            return persistentMap0 == null ? PersistentOrderedMap.Companion.emptyOf$runtime_release().putAll(map0) : persistentMap0;
        }
        return persistentOrderedMap0;
    }

    public static final PersistentSet toPersistentSet(CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(charSequence0, "<this>");
        Builder persistentSet$Builder0 = ExtensionsKt.persistentSetOf().builder();
        StringsKt.toCollection(charSequence0, persistentSet$Builder0);
        return persistentSet$Builder0.build();
    }

    public static final PersistentSet toPersistentSet(Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "<this>");
        PersistentSet persistentSet0 = null;
        PersistentOrderedSet persistentOrderedSet0 = iterable0 instanceof PersistentOrderedSet ? ((PersistentOrderedSet)iterable0) : null;
        if(persistentOrderedSet0 == null) {
            PersistentOrderedSetBuilder persistentOrderedSetBuilder0 = iterable0 instanceof PersistentOrderedSetBuilder ? ((PersistentOrderedSetBuilder)iterable0) : null;
            if(persistentOrderedSetBuilder0 != null) {
                persistentSet0 = persistentOrderedSetBuilder0.build();
            }
            return persistentSet0 == null ? ExtensionsKt.plus(PersistentOrderedSet.Companion.emptyOf$runtime_release(), iterable0) : persistentSet0;
        }
        return persistentOrderedSet0;
    }

    public static final PersistentSet toPersistentSet(Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "<this>");
        return ExtensionsKt.plus(ExtensionsKt.persistentSetOf(), sequence0);
    }
}

