package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\u00C0\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001C\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0011\n\u0002\b/\n\u0002\u0010\u000E\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u0001:\u0004\u00B2\u0002\u00B3\u0002B\u0092\u0001\u0012\n\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012Y\u0010\u000B\u001AU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\f\u0012\u0006\u0010\u0016\u001A\u00020\u0017\u00A2\u0006\u0002\u0010\u0018J\t\u0010\u0085\u0001\u001A\u00020\u0014H\u0002J\t\u0010\u0086\u0001\u001A\u00020\u0014H\u0002JK\u0010\u0087\u0001\u001A\u00020\u0014\"\u0005\b\u0000\u0010\u0088\u0001\"\u0005\b\u0001\u0010\u0089\u00012\b\u0010\u008A\u0001\u001A\u0003H\u0088\u00012\"\u0010\u008B\u0001\u001A\u001D\u0012\u0005\u0012\u0003H\u0089\u0001\u0012\u0005\u0012\u0003H\u0088\u0001\u0012\u0004\u0012\u00020\u00140\u008C\u0001\u00A2\u0006\u0003\b\u008D\u0001H\u0016\u00A2\u0006\u0003\u0010\u008E\u0001J\t\u0010\u008F\u0001\u001A\u00020\u0005H\u0016J5\u0010\u0090\u0001\u001A\u0003H\u0089\u0001\"\u0005\b\u0000\u0010\u0089\u00012\u0007\u0010\u0091\u0001\u001A\u00020 2\u000F\u0010\u008B\u0001\u001A\n\u0012\u0005\u0012\u0003H\u0089\u00010\u0092\u0001H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0003\u0010\u0093\u0001J\u0014\u0010\u0094\u0001\u001A\u00020 2\t\u0010\u008A\u0001\u001A\u0004\u0018\u00010>H\u0017J\u0012\u0010\u0094\u0001\u001A\u00020 2\u0007\u0010\u008A\u0001\u001A\u00020 H\u0017J\u0013\u0010\u0094\u0001\u001A\u00020 2\b\u0010\u008A\u0001\u001A\u00030\u0095\u0001H\u0017J\u0013\u0010\u0094\u0001\u001A\u00020 2\b\u0010\u008A\u0001\u001A\u00030\u0096\u0001H\u0017J\u0013\u0010\u0094\u0001\u001A\u00020 2\b\u0010\u008A\u0001\u001A\u00030\u0097\u0001H\u0017J\u0013\u0010\u0094\u0001\u001A\u00020 2\b\u0010\u008A\u0001\u001A\u00030\u0098\u0001H\u0017J\u0012\u0010\u0094\u0001\u001A\u00020 2\u0007\u0010\u008A\u0001\u001A\u00020$H\u0017J\u0013\u0010\u0094\u0001\u001A\u00020 2\b\u0010\u008A\u0001\u001A\u00030\u0099\u0001H\u0017J\u0013\u0010\u0094\u0001\u001A\u00020 2\b\u0010\u008A\u0001\u001A\u00030\u009A\u0001H\u0017J\t\u0010\u009B\u0001\u001A\u00020\u0014H\u0002J\t\u0010\u009C\u0001\u001A\u00020\u0014H\u0002J\b\u0010(\u001A\u00020\u0014H\u0017JG\u0010\u009D\u0001\u001A\u00020\u00142\u001D\u0010\u009E\u0001\u001A\u0018\u0012\u0004\u0012\u000206\u0012\r\u0012\u000B\u0012\u0004\u0012\u00020>\u0018\u00010\u00A0\u00010\u009F\u00012\u0014\u0010\u00A1\u0001\u001A\u000F\u0012\u0004\u0012\u00020\u00140\u0092\u0001\u00A2\u0006\u0003\b\u00A2\u0001H\u0000\u00A2\u0006\u0006\b\u00A3\u0001\u0010\u00A4\u0001J$\u0010\u00A5\u0001\u001A\u00020$2\u0007\u0010\u00A6\u0001\u001A\u00020$2\u0007\u0010\u00A7\u0001\u001A\u00020$2\u0007\u0010\u00A8\u0001\u001A\u00020$H\u0002J\'\u0010\u00A9\u0001\u001A\u0003H\u0089\u0001\"\u0005\b\u0000\u0010\u0089\u00012\u000E\u0010\u00AA\u0001\u001A\t\u0012\u0005\u0012\u0003H\u0089\u00010cH\u0017\u00A2\u0006\u0003\u0010\u00AB\u0001J!\u0010\u00AC\u0001\u001A\u00020\u0014\"\u0005\b\u0000\u0010\u0089\u00012\u000F\u0010\u00AD\u0001\u001A\n\u0012\u0005\u0012\u0003H\u0089\u00010\u0092\u0001H\u0016J)\u0010\u00AE\u0001\u001A\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0d0bj\u0002`eH\u0002J\t\u0010\u00AF\u0001\u001A\u00020\u0014H\u0016J\u000F\u0010\u00B0\u0001\u001A\u00020\u0014H\u0000\u00A2\u0006\u0003\b\u00B1\u0001JF\u0010\u00B2\u0001\u001A\u00020\u00142\u001D\u0010\u009E\u0001\u001A\u0018\u0012\u0004\u0012\u000206\u0012\r\u0012\u000B\u0012\u0004\u0012\u00020>\u0018\u00010\u00A0\u00010\u009F\u00012\u0016\u0010\u00A1\u0001\u001A\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0092\u0001\u00A2\u0006\u0003\b\u00A2\u0001H\u0002\u00A2\u0006\u0003\u0010\u00A4\u0001J\u001B\u0010\u00B3\u0001\u001A\u00020\u00142\u0007\u0010\u00A6\u0001\u001A\u00020$2\u0007\u0010\u00B4\u0001\u001A\u00020$H\u0002J\t\u0010\u00B5\u0001\u001A\u00020\u0014H\u0016J\u0012\u0010\u00B6\u0001\u001A\u00020\u00142\u0007\u0010\u00B7\u0001\u001A\u00020 H\u0002J\t\u0010\u00B8\u0001\u001A\u00020\u0014H\u0017J\t\u0010\u00B9\u0001\u001A\u00020\u0014H\u0002J\t\u0010\u00BA\u0001\u001A\u00020\u0014H\u0017J\t\u0010\u00BB\u0001\u001A\u00020\u0014H\u0016J\t\u0010\u00BC\u0001\u001A\u00020\u0014H\u0017J\t\u0010\u00BD\u0001\u001A\u00020\u0014H\u0017J\f\u0010\u00BE\u0001\u001A\u0005\u0018\u00010\u00BF\u0001H\u0017J\t\u0010\u00C0\u0001\u001A\u00020\u0014H\u0016J\t\u0010\u00C1\u0001\u001A\u00020\u0014H\u0002J\t\u0010\u00C2\u0001\u001A\u00020\u0014H\u0002J\u001D\u0010\u00C3\u0001\u001A\u00020\u00142\u0007\u0010\u00B7\u0001\u001A\u00020 2\t\u0010\u00C4\u0001\u001A\u0004\u0018\u00010gH\u0002J\u001A\u0010\u00C5\u0001\u001A\u00020\u00142\u0007\u0010\u00C6\u0001\u001A\u00020$2\u0006\u0010O\u001A\u00020 H\u0002J\t\u0010\u00C7\u0001\u001A\u00020\u0014H\u0002J\u0012\u0010\u00C8\u0001\u001A\u00020$2\u0007\u0010\u00C9\u0001\u001A\u00020$H\u0002J\u001F\u0010\u00CA\u0001\u001A\u00020>2\t\u0010\u00CB\u0001\u001A\u0004\u0018\u00010>2\t\u0010\u00CC\u0001\u001A\u0004\u0018\u00010>H\u0017J\u000B\u0010\u00CD\u0001\u001A\u0004\u0018\u00010>H\u0001J-\u0010\u00CE\u0001\u001A\u00020$2\u0007\u0010\u00CF\u0001\u001A\u00020$2\u0007\u0010\u00A6\u0001\u001A\u00020$2\u0007\u0010\u00A7\u0001\u001A\u00020$2\u0007\u0010\u00D0\u0001\u001A\u00020$H\u0002J\u001F\u0010\u00D1\u0001\u001A\u00020\u00142\u000E\u0010\u008B\u0001\u001A\t\u0012\u0004\u0012\u00020\u00140\u0092\u0001H\u0000\u00A2\u0006\u0003\b\u00D2\u0001J\t\u0010\u00D3\u0001\u001A\u00020\u0014H\u0002J!\u0010\u00D3\u0001\u001A\u00020\u00142\u0010\u0010\u00D4\u0001\u001A\u000B\u0012\u0006\u0012\u0004\u0018\u00010>0\u00D5\u0001H\u0002\u00A2\u0006\u0003\u0010\u00D6\u0001J\t\u0010\u00D7\u0001\u001A\u00020\u0014H\u0002J\u0014\u0010\u00D8\u0001\u001A\u00020\u00142\t\b\u0002\u0010\u00D9\u0001\u001A\u00020 H\u0002J\t\u0010\u00DA\u0001\u001A\u00020\u0014H\u0002J.\u0010\u00DB\u0001\u001A\u00020 2\u001D\u0010\u009E\u0001\u001A\u0018\u0012\u0004\u0012\u000206\u0012\r\u0012\u000B\u0012\u0004\u0012\u00020>\u0018\u00010\u00A0\u00010\u009F\u0001H\u0000\u00A2\u0006\u0003\b\u00DC\u0001J\t\u0010\u00DD\u0001\u001A\u00020\u0014H\u0002J_\u0010\u00DE\u0001\u001A\u00020\u00142T\u0010\u00DF\u0001\u001AO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J_\u0010\u00E0\u0001\u001A\u00020\u00142T\u0010\u00DF\u0001\u001AO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\t\u0010\u00E1\u0001\u001A\u00020\u0014H\u0002J\u0014\u0010\u00E2\u0001\u001A\u00020\u00142\t\u0010\u0082\u0001\u001A\u0004\u0018\u00010>H\u0002J\t\u0010\u00E3\u0001\u001A\u00020\u0014H\u0002J\t\u0010\u00E4\u0001\u001A\u00020\u0014H\u0002J_\u0010\u00E5\u0001\u001A\u00020\u00142T\u0010\u00DF\u0001\u001AO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\u0012\u0010\u00E6\u0001\u001A\u00020\u00142\u0007\u0010\u00E7\u0001\u001A\u00020IH\u0002J_\u0010\u00E8\u0001\u001A\u00020\u00142T\u0010\u00DF\u0001\u001AO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J$\u0010\u00E9\u0001\u001A\u00020\u00142\u0007\u0010\u00EA\u0001\u001A\u00020$2\u0007\u0010\u00EB\u0001\u001A\u00020$2\u0007\u0010\u00EC\u0001\u001A\u00020$H\u0002J\u0012\u0010\u00ED\u0001\u001A\u00020\u00142\u0007\u0010\u00EE\u0001\u001A\u00020$H\u0002J\u001A\u0010\u00EF\u0001\u001A\u00020\u00142\u0006\u0010_\u001A\u00020$2\u0007\u0010\u00EC\u0001\u001A\u00020$H\u0002J\u0019\u0010\u00F0\u0001\u001A\u00020\u00142\u000E\u0010\u00F1\u0001\u001A\t\u0012\u0004\u0012\u00020\u00140\u0092\u0001H\u0016J\t\u0010\u00F2\u0001\u001A\u00020\u0014H\u0002J_\u0010\u00F3\u0001\u001A\u00020\u00142T\u0010\u00DF\u0001\u001AO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002Jj\u0010\u00F4\u0001\u001A\u00020\u00142\t\b\u0002\u0010\u00D9\u0001\u001A\u00020 2T\u0010\u00DF\u0001\u001AO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\t\u0010\u00F5\u0001\u001A\u00020\u0014H\u0002J$\u0010\u00F6\u0001\u001A\u00020\u00142\u0007\u0010\u00F7\u0001\u001A\u00020$2\u0007\u0010\u00F8\u0001\u001A\u00020$2\u0007\u0010\u00F9\u0001\u001A\u00020$H\u0002J\u0012\u0010\u00FA\u0001\u001A\u00020\u00142\u0007\u0010\u00FB\u0001\u001A\u00020tH\u0016J\t\u0010\u00FC\u0001\u001A\u00020\u0014H\u0002J\u000B\u0010\u00FD\u0001\u001A\u0004\u0018\u00010>H\u0016JP\u0010\u00FE\u0001\u001A\u0003H\u0089\u0001\"\u0005\b\u0000\u0010\u0089\u00012\u000E\u0010\u00AA\u0001\u001A\t\u0012\u0005\u0012\u0003H\u0089\u00010c2\'\u0010\u00FB\u0001\u001A\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0d0bj\u0002`eH\u0002\u00A2\u0006\u0003\u0010\u00FF\u0001J\t\u0010\u0080\u0002\u001A\u00020\u0014H\u0017J\t\u0010\u0081\u0002\u001A\u00020\u0014H\u0002J\t\u0010\u0082\u0002\u001A\u00020\u0014H\u0002J\t\u0010\u0083\u0002\u001A\u00020\u0014H\u0017J\u0013\u0010\u0084\u0002\u001A\u00020\u00142\b\u0010\u0084\u0002\u001A\u00030\u0085\u0002H\u0017J\t\u0010\u0086\u0002\u001A\u00020\u0014H\u0017J\u001C\u0010\u0087\u0002\u001A\u00020\u00142\u0007\u0010\u00AA\u0001\u001A\u00020$2\b\u0010\u0084\u0002\u001A\u00030\u0085\u0002H\u0017J1\u0010\u0088\u0002\u001A\u00020\u00142\u0007\u0010\u00AA\u0001\u001A\u00020$2\t\u0010\u0089\u0002\u001A\u0004\u0018\u00010>2\u0007\u0010\u00B7\u0001\u001A\u00020 2\t\u0010\u008A\u0002\u001A\u0004\u0018\u00010>H\u0002J\t\u0010\u008B\u0002\u001A\u00020\u0014H\u0017J\u0012\u0010\u008C\u0002\u001A\u00020\u00142\u0007\u0010\u00AA\u0001\u001A\u00020$H\u0002J\u001D\u0010\u008C\u0002\u001A\u00020\u00142\u0007\u0010\u00AA\u0001\u001A\u00020$2\t\u0010\u008D\u0002\u001A\u0004\u0018\u00010>H\u0002J\u001D\u0010\u008E\u0002\u001A\u00020\u00142\u0007\u0010\u00AA\u0001\u001A\u00020$2\t\u0010\u008D\u0002\u001A\u0004\u0018\u00010>H\u0017J\t\u0010\u008F\u0002\u001A\u00020\u0014H\u0016J&\u0010\u0090\u0002\u001A\u00020\u00142\u0015\u0010\u0091\u0002\u001A\u0010\u0012\u000B\b\u0001\u0012\u0007\u0012\u0002\b\u00030\u0092\u00020\u00D5\u0001H\u0017\u00A2\u0006\u0003\u0010\u0093\u0002J\u001D\u0010\u0094\u0002\u001A\u00020\u00142\u0007\u0010\u00B7\u0001\u001A\u00020 2\t\u0010\u008A\u0002\u001A\u0004\u0018\u00010>H\u0002J\u0012\u0010\u0095\u0002\u001A\u00020\u00142\u0007\u0010\u00AA\u0001\u001A\u00020$H\u0017J\u0012\u0010\u0096\u0002\u001A\u00020\u00012\u0007\u0010\u00AA\u0001\u001A\u00020$H\u0017J\u001D\u0010\u0097\u0002\u001A\u00020\u00142\u0007\u0010\u00AA\u0001\u001A\u00020$2\t\u0010\u008D\u0002\u001A\u0004\u0018\u00010>H\u0016J\t\u0010\u0098\u0002\u001A\u00020\u0014H\u0016J\t\u0010\u0099\u0002\u001A\u00020\u0014H\u0002J#\u0010\u009A\u0002\u001A\u00020 2\u0007\u0010\u00FB\u0001\u001A\u0002062\t\u0010\u009B\u0002\u001A\u0004\u0018\u00010>H\u0000\u00A2\u0006\u0003\b\u009C\u0002J\u0014\u0010\u009D\u0002\u001A\u00020\u00142\t\u0010\u008A\u0001\u001A\u0004\u0018\u00010>H\u0001J(\u0010\u009E\u0002\u001A\u00020\u00142\u0007\u0010\u009F\u0002\u001A\u00020$2\t\u0010\u008D\u0002\u001A\u0004\u0018\u00010>2\t\u0010\u008A\u0002\u001A\u0004\u0018\u00010>H\u0002J\u0012\u0010\u00A0\u0002\u001A\u00020\u00142\u0007\u0010\u00A1\u0002\u001A\u00020$H\u0002J(\u0010\u00A2\u0002\u001A\u00020\u00142\u0007\u0010\u009F\u0002\u001A\u00020$2\t\u0010\u008D\u0002\u001A\u0004\u0018\u00010>2\t\u0010\u008A\u0002\u001A\u0004\u0018\u00010>H\u0002J\u0012\u0010\u00A3\u0002\u001A\u00020\u00142\u0007\u0010\u009F\u0002\u001A\u00020$H\u0002J\u001B\u0010\u00A4\u0002\u001A\u00020\u00142\u0007\u0010\u00A6\u0001\u001A\u00020$2\u0007\u0010\u00EC\u0001\u001A\u00020$H\u0002J\u001B\u0010\u00A5\u0002\u001A\u00020\u00142\u0007\u0010\u00A6\u0001\u001A\u00020$2\u0007\u0010\u00A6\u0002\u001A\u00020$H\u0002J{\u0010\u00A7\u0002\u001A\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0d0bj\u0002`e2\'\u0010\u00A8\u0002\u001A\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0d0bj\u0002`e2\'\u0010\u00A9\u0002\u001A\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0d0bj\u0002`eH\u0002J\u0014\u0010\u00AA\u0002\u001A\u00020\u00142\t\u0010\u008A\u0001\u001A\u0004\u0018\u00010>H\u0016J\u0014\u0010\u00AB\u0002\u001A\u00020\u00142\t\u0010\u008A\u0001\u001A\u0004\u0018\u00010>H\u0001J\u0012\u0010\u00AC\u0002\u001A\u00020$2\u0007\u0010\u00A6\u0001\u001A\u00020$H\u0002J\t\u0010\u00AD\u0002\u001A\u00020\u0014H\u0016J\t\u0010\u00AE\u0002\u001A\u00020\u0014H\u0002J\t\u0010\u00AF\u0002\u001A\u00020\u0014H\u0002J\u0016\u0010\u00B0\u0002\u001A\u00020$*\u00020r2\u0007\u0010\u00A6\u0001\u001A\u00020$H\u0002J\u0018\u0010\u00B1\u0002\u001A\u0004\u0018\u00010>*\u00020r2\u0007\u0010\u00C9\u0001\u001A\u00020$H\u0002R\u0014\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u001AR\u0014\u0010\u001B\u001A\u00020\u001C8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001D\u0010\u001ER\u0014\u0010\u001F\u001A\u00020 8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b!\u0010\"R\u0014\u0010#\u001A\u00020$8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b%\u0010&Ra\u0010\u000B\u001AU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\fX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\'\u001A\u00020$X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010(\u001A\u00020 X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001A\u00020\u0017X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b)\u0010*R\u001A\u0010+\u001A\u00020,8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\b-\u0010.\u001A\u0004\b/\u00100R&\u00102\u001A\u00020$2\u0006\u00101\u001A\u00020$8\u0016@RX\u0097\u000E\u00A2\u0006\u000E\n\u0000\u0012\u0004\b3\u0010.\u001A\u0004\b4\u0010&R\u0016\u00105\u001A\u0004\u0018\u0001068@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b7\u00108R\u001A\u00109\u001A\u00020 8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\b:\u0010.\u001A\u0004\b;\u0010\"R\u0016\u0010<\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010>0=X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010?\u001A\u00020@X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010A\u001A\u00020$X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010B\u001A\u00020@X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0011\u0010C\u001A\u00020 8F\u00A2\u0006\u0006\u001A\u0004\bD\u0010\"R\u0014\u0010E\u001A\u00020 8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bF\u0010\"R\u000E\u0010G\u001A\u00020 X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010H\u001A\u00020IX\u0082\u000E\u00A2\u0006\u0002\n\u0000Ra\u0010J\u001AU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\fX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010K\u001A\u00020\u0007X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\bL\u0010MRa\u0010N\u001AU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150=X\u0082\u0004\u00A2\u0006\u0002\n\u0000R&\u0010O\u001A\u00020 2\u0006\u00101\u001A\u00020 8\u0016@RX\u0097\u000E\u00A2\u0006\u000E\n\u0000\u0012\u0004\bP\u0010.\u001A\u0004\bQ\u0010\"R\u0014\u0010R\u001A\b\u0012\u0004\u0012\u0002060=X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010S\u001A\b\u0012\u0004\u0012\u00020T0\fX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001E\u0010U\u001A\u00020 2\u0006\u00101\u001A\u00020 @BX\u0080\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\bV\u0010\"R\u001E\u0010W\u001A\u00020 2\u0006\u00101\u001A\u00020 @BX\u0080\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\bX\u0010\"R\u0010\u0010Y\u001A\u0004\u0018\u00010ZX\u0082\u000E\u00A2\u0006\u0002\n\u0000R.\u0010[\u001A\"\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0018\u00010\\j\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0018\u0001`]X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010^\u001A\u00020 X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010_\u001A\u00020$X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010`\u001A\u00020@X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u0004\u00A2\u0006\u0002\n\u0000R.\u0010a\u001A\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0d0bj\u0002`eX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010f\u001A\u0004\u0018\u00010gX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0016\u0010h\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010g0=X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010i\u001A\u00020$X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010j\u001A\u00020$X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010k\u001A\u00020$X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010l\u001A\u00020$X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010m\u001A\u00020$X\u0082\u000E\u00A2\u0006\u0002\n\u0000Rj\u0010n\u001A^\u0012\u0004\u0012\u00020$\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0d0bj\u0002`e0\\j.\u0012\u0004\u0012\u00020$\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0d0bj\u0002`e`]X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010o\u001A\u00020 X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010p\u001A\u00020@X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010q\u001A\u00020rX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0016\u0010s\u001A\u0004\u0018\u00010t8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bu\u0010vR\u000E\u0010w\u001A\u00020 X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010x\u001A\u00020$X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001A\u0010y\u001A\u00020 8VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\bz\u0010.\u001A\u0004\b{\u0010\"R\u000E\u0010\u0006\u001A\u00020\u0007X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010|\u001A\u00020}X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010~\u001A\u00020 X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u007F\u001A\u00020@X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000F\u0010\u0080\u0001\u001A\u00020\u0010X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000F\u0010\u0081\u0001\u001A\u00020$X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001D\u0010\u0082\u0001\u001A\u0004\u0018\u00010>*\u00020r8BX\u0082\u0004\u00A2\u0006\b\u001A\u0006\b\u0083\u0001\u0010\u0084\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006\u00B4\u0002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "applier", "Landroidx/compose/runtime/Applier;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "abandonSet", "", "Landroidx/compose/runtime/RememberObserver;", "changes", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "composition", "Landroidx/compose/runtime/ControlledComposition;", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Ljava/util/List;Landroidx/compose/runtime/ControlledComposition;)V", "getApplier", "()Landroidx/compose/runtime/Applier;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "areChildrenComposing", "", "getAreChildrenComposing$runtime_release", "()Z", "changeCount", "", "getChangeCount$runtime_release", "()I", "childrenComposing", "collectParameterInformation", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData$annotations", "()V", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "<set-?>", "compoundKeyHash", "getCompoundKeyHash$annotations", "getCompoundKeyHash", "currentRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "defaultsInvalid", "getDefaultsInvalid$annotations", "getDefaultsInvalid", "downNodes", "Landroidx/compose/runtime/Stack;", "", "entersStack", "Landroidx/compose/runtime/IntStack;", "groupNodeCount", "groupNodeCountStack", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges$runtime_release", "hasProvider", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "insertFixups", "insertTable", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "insertUpFixups", "inserting", "getInserting$annotations", "getInserting", "invalidateStack", "invalidations", "Landroidx/compose/runtime/Invalidation;", "isComposing", "isComposing$runtime_release", "isDisposed", "isDisposed$runtime_release", "nodeCountOverrides", "", "nodeCountVirtualOverrides", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "nodeExpected", "nodeIndex", "nodeIndexStack", "parentProvider", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "pending", "Landroidx/compose/runtime/Pending;", "pendingStack", "pendingUps", "previousCount", "previousMoveFrom", "previousMoveTo", "previousRemove", "providerUpdates", "providersInvalid", "providersInvalidStack", "reader", "Landroidx/compose/runtime/SlotReader;", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "reusing", "reusingGroup", "skipping", "getSkipping$annotations", "getSkipping", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "startedGroup", "startedGroups", "writer", "writersReaderDelta", "node", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "abortRoot", "addRecomposeScope", "apply", "V", "T", "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "buildContext", "cache", "invalid", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "changed", "", "", "", "", "", "", "cleanUpCompose", "clearUpdatedNodeCounts", "composeContent", "invalidationsRequested", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "content", "Landroidx/compose/runtime/Composable;", "composeContent$runtime_release", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Lkotlin/jvm/functions/Function2;)V", "compoundKeyOf", "group", "recomposeGroup", "recomposeKey", "consume", "key", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "createNode", "factory", "currentCompositionLocalScope", "disableReusing", "dispose", "dispose$runtime_release", "doCompose", "doRecordDownsFor", "nearestCommonRoot", "enableReusing", "end", "isNode", "endDefaults", "endGroup", "endMovableGroup", "endNode", "endProviders", "endReplaceableGroup", "endRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endReusableGroup", "endRoot", "ensureWriter", "enterGroup", "newPending", "exitGroup", "expectedNodeCount", "finalizeCompose", "insertedGroupVirtualIndex", "index", "joinKey", "left", "right", "nextSlot", "nodeIndexOf", "groupLocation", "recomposeIndex", "prepareCompose", "prepareCompose$runtime_release", "realizeDowns", "nodes", "", "([Ljava/lang/Object;)V", "realizeMovement", "realizeOperationLocation", "forParent", "realizeUps", "recompose", "recompose$runtime_release", "recomposeToGroupEnd", "record", "change", "recordApplierOperation", "recordDelete", "recordDown", "recordEndGroup", "recordEndRoot", "recordFixup", "recordInsert", "anchor", "recordInsertUpFixup", "recordMoveNode", "from", "to", "count", "recordReaderMoving", "location", "recordRemoveNode", "recordSideEffect", "effect", "recordSlotEditing", "recordSlotEditingOperation", "recordSlotTableOperation", "recordUp", "recordUpsAndDowns", "oldGroup", "newGroup", "commonRoot", "recordUsed", "scope", "registerInsertUpFixup", "rememberedValue", "resolveCompositionLocal", "(Landroidx/compose/runtime/CompositionLocal;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)Ljava/lang/Object;", "skipCurrentGroup", "skipGroup", "skipReaderToGroupEnd", "skipToGroupEnd", "sourceInformation", "", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "start", "objectKey", "data", "startDefaults", "startGroup", "dataKey", "startMovableGroup", "startNode", "startProviders", "values", "Landroidx/compose/runtime/ProvidedValue;", "([Landroidx/compose/runtime/ProvidedValue;)V", "startReaderGroup", "startReplaceableGroup", "startRestartGroup", "startReusableGroup", "startReusableNode", "startRoot", "tryImminentInvalidation", "instance", "tryImminentInvalidation$runtime_release", "updateCachedValue", "updateCompoundKeyWhenWeEnterGroup", "groupKey", "updateCompoundKeyWhenWeEnterGroupKeyHash", "keyHash", "updateCompoundKeyWhenWeExitGroup", "updateCompoundKeyWhenWeExitGroupKeyHash", "updateNodeCount", "updateNodeCountOverrides", "newCount", "updateProviderMapGroup", "parentScope", "currentProviders", "updateRememberedValue", "updateValue", "updatedNodeCount", "useNode", "validateNodeExpected", "validateNodeNotExpected", "groupCompoundKeyPart", "nodeAt", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ComposerImpl implements Composer {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001A\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001A\u00020\tH\u0016J\b\u0010\n\u001A\u00020\tH\u0016J\b\u0010\u000B\u001A\u00020\tH\u0016R\u0015\u0010\u0002\u001A\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/RememberObserver;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "onAbandoned", "", "onForgotten", "onRemembered", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class CompositionContextHolder implements RememberObserver {
        private final CompositionContextImpl ref;

        public CompositionContextHolder(CompositionContextImpl composerImpl$CompositionContextImpl0) {
            Intrinsics.checkNotNullParameter(composerImpl$CompositionContextImpl0, "ref");
            super();
            this.ref = composerImpl$CompositionContextImpl0;
        }

        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override  // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override  // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }

        @Override  // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\u0002\u0010\u0006J*\u0010*\u001A\u00020+2\u0006\u0010,\u001A\u00020-2\u0011\u0010.\u001A\r\u0012\u0004\u0012\u00020+0/\u00A2\u0006\u0002\b0H\u0010\u00A2\u0006\u0004\b1\u00102J\u0006\u00103\u001A\u00020+J\r\u00104\u001A\u00020+H\u0010\u00A2\u0006\u0002\b5J-\u0010\u0015\u001A\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000Fj\u0002`\u0013H\u0010\u00A2\u0006\u0002\b6J\u0015\u00107\u001A\u00020+2\u0006\u0010,\u001A\u00020-H\u0010\u00A2\u0006\u0002\b8J\u0015\u00109\u001A\u00020+2\u0006\u0010:\u001A\u00020;H\u0010\u00A2\u0006\u0002\b<J\u001B\u0010=\u001A\u00020+2\f\u0010>\u001A\b\u0012\u0004\u0012\u00020\"0\nH\u0010\u00A2\u0006\u0002\b?J\u0015\u0010@\u001A\u00020+2\u0006\u0010A\u001A\u00020BH\u0010\u00A2\u0006\u0002\bCJ\u0015\u0010D\u001A\u00020+2\u0006\u0010,\u001A\u00020-H\u0010\u00A2\u0006\u0002\bEJ\r\u0010F\u001A\u00020+H\u0010\u00A2\u0006\u0002\bGJ\u0015\u0010H\u001A\u00020+2\u0006\u0010A\u001A\u00020BH\u0010\u00A2\u0006\u0002\bIJ\u0015\u0010J\u001A\u00020+2\u0006\u0010,\u001A\u00020-H\u0010\u00A2\u0006\u0002\bKJ.\u0010L\u001A\u00020+2&\u0010:\u001A\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000Fj\u0002`\u0013R\u0014\u0010\u0004\u001A\u00020\u0005X\u0090\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u00A2\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rRk\u0010\u0014\u001A\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000Fj\u0002`\u00132&\u0010\u000E\u001A\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000Fj\u0002`\u00138B@BX\u0082\u008E\u0002\u00A2\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001A\u00020\u0003X\u0090\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u001CR\u0014\u0010\u001D\u001A\u00020\u001E8PX\u0090\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001F\u0010 R(\u0010!\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\n\u0018\u00010\nX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010\r\"\u0004\b$\u0010%R\u001A\u0010&\u001A\u00020\u001E8PX\u0090\u0004\u00A2\u0006\f\u0012\u0004\b\'\u0010(\u001A\u0004\b)\u0010 \u00A8\u0006M"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "compoundHashKey", "", "collectingParameterInformation", "", "(Landroidx/compose/runtime/ComposerImpl;IZ)V", "getCollectingParameterInformation$runtime_release", "()Z", "composers", "", "Landroidx/compose/runtime/ComposerImpl;", "getComposers", "()Ljava/util/Set;", "<set-?>", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalScope", "getCompositionLocalScope", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setCompositionLocalScope", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "getCompoundHashKey$runtime_release", "()I", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext$runtime_release", "()Lkotlin/coroutines/CoroutineContext;", "inspectionTables", "Landroidx/compose/runtime/tooling/CompositionData;", "getInspectionTables", "setInspectionTables", "(Ljava/util/Set;)V", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release$annotations", "()V", "getRecomposeCoroutineContext$runtime_release", "composeInitial", "", "composition", "Landroidx/compose/runtime/ControlledComposition;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "dispose", "doneComposing", "doneComposing$runtime_release", "getCompositionLocalScope$runtime_release", "invalidate", "invalidate$runtime_release", "invalidateScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime_release", "recordInspectionTable", "table", "recordInspectionTable$runtime_release", "registerComposer", "composer", "Landroidx/compose/runtime/Composer;", "registerComposer$runtime_release", "registerComposition", "registerComposition$runtime_release", "startComposing", "startComposing$runtime_release", "unregisterComposer", "unregisterComposer$runtime_release", "unregisterComposition", "unregisterComposition$runtime_release", "updateCompositionLocalScope", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final Set composers;
        private final MutableState compositionLocalScope$delegate;
        private final int compoundHashKey;
        private Set inspectionTables;

        static {
        }

        public CompositionContextImpl(int v, boolean z) {
            Intrinsics.checkNotNullParameter(composerImpl0, "this$0");
            ComposerImpl.this = composerImpl0;
            super();
            this.compoundHashKey = v;
            this.collectingParameterInformation = z;
            this.composers = new LinkedHashSet();
            this.compositionLocalScope$delegate = SnapshotStateKt.mutableStateOf$default(ExtensionsKt.persistentHashMapOf(), null, 2, null);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime_release(ControlledComposition controlledComposition0, Function2 function20) {
            Intrinsics.checkNotNullParameter(controlledComposition0, "composition");
            Intrinsics.checkNotNullParameter(function20, "content");
            ComposerImpl.this.parentContext.composeInitial$runtime_release(controlledComposition0, function20);
        }

        public final void dispose() {
            if(!this.composers.isEmpty() != 0) {
                Set set0 = this.inspectionTables;
                if(set0 != null) {
                    for(Object object0: this.getComposers()) {
                        ComposerImpl composerImpl0 = (ComposerImpl)object0;
                        for(Object object1: set0) {
                            ((Set)object1).remove(composerImpl0.slotTable);
                        }
                    }
                }
                this.composers.clear();
            }
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            --ComposerImpl.this.childrenComposing;
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public boolean getCollectingParameterInformation$runtime_release() {
            return this.collectingParameterInformation;
        }

        public final Set getComposers() {
            return this.composers;
        }

        private final PersistentMap getCompositionLocalScope() {
            return (PersistentMap)this.compositionLocalScope$delegate.getValue();
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public PersistentMap getCompositionLocalScope$runtime_release() {
            return this.getCompositionLocalScope();
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public int getCompoundHashKey$runtime_release() {
            return this.compoundHashKey;
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public CoroutineContext getEffectCoroutineContext$runtime_release() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext$runtime_release();
        }

        public final Set getInspectionTables() {
            return this.inspectionTables;
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        public static void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(ControlledComposition controlledComposition0) {
            Intrinsics.checkNotNullParameter(controlledComposition0, "composition");
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(controlledComposition0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl0) {
            Intrinsics.checkNotNullParameter(recomposeScopeImpl0, "scope");
            ComposerImpl.this.parentContext.invalidateScope$runtime_release(recomposeScopeImpl0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(Set set0) {
            Intrinsics.checkNotNullParameter(set0, "table");
            Set set1 = this.inspectionTables;
            if(set1 == null) {
                set1 = new HashSet();
                this.setInspectionTables(set1);
            }
            set1.add(set0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(Composer composer0) {
            Intrinsics.checkNotNullParameter(composer0, "composer");
            super.registerComposer$runtime_release(((ComposerImpl)composer0));
            this.composers.add(composer0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(ControlledComposition controlledComposition0) {
            Intrinsics.checkNotNullParameter(controlledComposition0, "composition");
            ComposerImpl.this.parentContext.registerComposition$runtime_release(controlledComposition0);
        }

        private final void setCompositionLocalScope(PersistentMap persistentMap0) {
            this.compositionLocalScope$delegate.setValue(persistentMap0);
        }

        public final void setInspectionTables(Set set0) {
            this.inspectionTables = set0;
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ++ComposerImpl.this.childrenComposing;
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(Composer composer0) {
            Intrinsics.checkNotNullParameter(composer0, "composer");
            Set set0 = this.inspectionTables;
            if(set0 != null) {
                for(Object object0: set0) {
                    ((Set)object0).remove(((ComposerImpl)composer0).slotTable);
                }
            }
            Collection collection0 = this.composers;
            if(collection0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
            TypeIntrinsics.asMutableCollection(collection0).remove(composer0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(ControlledComposition controlledComposition0) {
            Intrinsics.checkNotNullParameter(controlledComposition0, "composition");
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(controlledComposition0);
        }

        public final void updateCompositionLocalScope(PersistentMap persistentMap0) {
            Intrinsics.checkNotNullParameter(persistentMap0, "scope");
            this.setCompositionLocalScope(persistentMap0);
        }
    }

    private final Set abandonSet;
    private final Applier applier;
    private final List changes;
    private int childrenComposing;
    private boolean collectParameterInformation;
    private final ControlledComposition composition;
    private int compoundKeyHash;
    private Stack downNodes;
    private final IntStack entersStack;
    private int groupNodeCount;
    private IntStack groupNodeCountStack;
    private boolean hasProvider;
    private Anchor insertAnchor;
    private final List insertFixups;
    private final SlotTable insertTable;
    private final Stack insertUpFixups;
    private boolean inserting;
    private final Stack invalidateStack;
    private final List invalidations;
    private boolean isComposing;
    private boolean isDisposed;
    private int[] nodeCountOverrides;
    private HashMap nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private IntStack nodeIndexStack;
    private final CompositionContext parentContext;
    private PersistentMap parentProvider;
    private Pending pending;
    private final Stack pendingStack;
    private int pendingUps;
    private int previousCount;
    private int previousMoveFrom;
    private int previousMoveTo;
    private int previousRemove;
    private final HashMap providerUpdates;
    private boolean providersInvalid;
    private final IntStack providersInvalidStack;
    private SlotReader reader;
    private boolean reusing;
    private int reusingGroup;
    private final SlotTable slotTable;
    private Snapshot snapshot;
    private boolean startedGroup;
    private final IntStack startedGroups;
    private SlotWriter writer;
    private int writersReaderDelta;

    public ComposerImpl(Applier applier0, CompositionContext compositionContext0, SlotTable slotTable0, Set set0, List list0, ControlledComposition controlledComposition0) {
        Anchor anchor0;
        Intrinsics.checkNotNullParameter(applier0, "applier");
        Intrinsics.checkNotNullParameter(compositionContext0, "parentContext");
        Intrinsics.checkNotNullParameter(slotTable0, "slotTable");
        Intrinsics.checkNotNullParameter(set0, "abandonSet");
        Intrinsics.checkNotNullParameter(list0, "changes");
        Intrinsics.checkNotNullParameter(controlledComposition0, "composition");
        super();
        this.applier = applier0;
        this.parentContext = compositionContext0;
        this.slotTable = slotTable0;
        this.abandonSet = set0;
        this.changes = list0;
        this.composition = controlledComposition0;
        this.pendingStack = new Stack();
        this.nodeIndexStack = new IntStack();
        this.groupNodeCountStack = new IntStack();
        this.invalidations = new ArrayList();
        this.entersStack = new IntStack();
        this.parentProvider = ExtensionsKt.persistentHashMapOf();
        this.providerUpdates = new HashMap();
        this.providersInvalidStack = new IntStack();
        this.reusingGroup = -1;
        this.snapshot = SnapshotKt.currentSnapshot();
        this.invalidateStack = new Stack();
        SlotReader slotReader0 = slotTable0.openReader();
        slotReader0.close();
        this.reader = slotReader0;
        SlotTable slotTable1 = new SlotTable();
        this.insertTable = slotTable1;
        SlotWriter slotWriter0 = slotTable1.openWriter();
        slotWriter0.close();
        this.writer = slotWriter0;
        try(SlotReader slotReader1 = slotTable1.openReader()) {
            anchor0 = slotReader1.anchor(0);
        }
        this.insertAnchor = anchor0;
        this.insertFixups = new ArrayList();
        this.downNodes = new Stack();
        this.startedGroups = new IntStack();
        this.insertUpFixups = new Stack();
        this.previousRemove = -1;
        this.previousMoveFrom = -1;
        this.previousMoveTo = -1;
    }

    private final void abortRoot() {
        this.cleanUpCompose();
        this.pendingStack.clear();
        this.nodeIndexStack.clear();
        this.groupNodeCountStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.reader.close();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.isComposing = false;
    }

    private final void addRecomposeScope() {
        if(this.getInserting()) {
            RecomposeScopeImpl recomposeScopeImpl0 = new RecomposeScopeImpl(((CompositionImpl)this.getComposition()));
            this.invalidateStack.push(recomposeScopeImpl0);
            this.updateValue(recomposeScopeImpl0);
            recomposeScopeImpl0.start(this.snapshot.getId());
            return;
        }
        Invalidation invalidation0 = ComposerKt.removeLocation(this.invalidations, this.reader.getParent());
        Object object0 = this.reader.next();
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
        }
        ((RecomposeScopeImpl)object0).setRequiresRecompose(invalidation0 != null);
        this.invalidateStack.push(((RecomposeScopeImpl)object0));
        ((RecomposeScopeImpl)object0).start(this.snapshot.getId());
    }

    @Override  // androidx.compose.runtime.Composer
    public void apply(Object object0, Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        Function3 function30 = new Function3(object0) {
            final Function2 $block;
            final Object $value;

            {
                this.$block = function20;
                this.$value = object0;
                super(3);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                return Unit.INSTANCE;
            }

            public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                Intrinsics.checkNotNullParameter(applier0, "applier");
                Intrinsics.checkNotNullParameter(slotWriter0, "$noName_1");
                Intrinsics.checkNotNullParameter(rememberManager0, "$noName_2");
                Object object0 = applier0.getCurrent();
                this.$block.invoke(object0, this.$value);
            }
        };
        if(this.getInserting()) {
            this.recordFixup(function30);
            return;
        }
        this.recordApplierOperation(function30);
    }

    @Override  // androidx.compose.runtime.Composer
    public CompositionContext buildContext() {
        this.startGroup(206, ComposerKt.getReference());
        Object object0 = this.nextSlot();
        CompositionContextHolder composerImpl$CompositionContextHolder0 = object0 instanceof CompositionContextHolder ? ((CompositionContextHolder)object0) : null;
        if(composerImpl$CompositionContextHolder0 == null) {
            composerImpl$CompositionContextHolder0 = new CompositionContextHolder(new CompositionContextImpl(this, this.getCompoundKeyHash(), this.collectParameterInformation));
            this.updateValue(composerImpl$CompositionContextHolder0);
        }
        composerImpl$CompositionContextHolder0.getRef().updateCompositionLocalScope(this.currentCompositionLocalScope());
        this.endGroup();
        return composerImpl$CompositionContextHolder0.getRef();
    }

    @ComposeCompilerApi
    public final Object cache(boolean z, Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        Object object0 = this.nextSlot();
        if(object0 == Composer.Companion.getEmpty() || z) {
            object0 = function00.invoke();
            this.updateValue(object0);
        }
        return object0;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte b) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Byte && b == ((Number)object0).byteValue()) {
            return false;
        }
        this.updateValue(b);
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char c) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Character && c == ((Character)object0).charValue()) {
            return false;
        }
        this.updateValue(Character.valueOf(c));
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double f) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Double && f == ((Number)object0).doubleValue()) {
            return false;
        }
        this.updateValue(f);
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float f) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Float && f == ((Number)object0).floatValue()) {
            return false;
        }
        this.updateValue(f);
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int v) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Integer && v == ((Number)object0).intValue()) {
            return false;
        }
        this.updateValue(v);
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long v) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Long && v == ((Number)object0).longValue()) {
            return false;
        }
        this.updateValue(v);
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(Object object0) {
        if(!Intrinsics.areEqual(this.nextSlot(), object0)) {
            this.updateValue(object0);
            return true;
        }
        return false;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short v) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Short && v == ((Number)object0).shortValue()) {
            return false;
        }
        this.updateValue(v);
        return true;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean z) {
        Object object0 = this.nextSlot();
        if(object0 instanceof Boolean && z == ((Boolean)object0).booleanValue()) {
            return false;
        }
        this.updateValue(Boolean.valueOf(z));
        return true;
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.writersReaderDelta = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.startedGroup = false;
        this.startedGroups.clear();
        this.invalidateStack.clear();
        this.clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void collectParameterInformation() {
        this.collectParameterInformation = true;
    }

    public final void composeContent$runtime_release(IdentityArrayMap identityArrayMap0, Function2 function20) {
        Intrinsics.checkNotNullParameter(identityArrayMap0, "invalidationsRequested");
        Intrinsics.checkNotNullParameter(function20, "content");
        if(this.changes.isEmpty()) {
            this.doCompose(identityArrayMap0, function20);
            return;
        }
        ComposerKt.composeRuntimeError("Expected applyChanges() to have been called");
        throw new KotlinNothingValueException();
    }

    private final int compoundKeyOf(int v, int v1, int v2) {
        return v == v1 ? v2 : Integer.rotateLeft(this.compoundKeyOf(this.reader.parent(v), v1, v2), 3) ^ this.groupCompoundKeyPart(this.reader, v);
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public Object consume(CompositionLocal compositionLocal0) {
        Intrinsics.checkNotNullParameter(compositionLocal0, "key");
        return this.resolveCompositionLocal(compositionLocal0, this.currentCompositionLocalScope());
    }

    @Override  // androidx.compose.runtime.Composer
    public void createNode(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "factory");
        this.validateNodeExpected();
        if(this.getInserting()) {
            int v = this.nodeIndexStack.peek();
            Anchor anchor0 = this.writer.anchor(this.writer.getParent());
            ++this.groupNodeCount;
            this.recordFixup(new Function3(anchor0, v) {
                final Function0 $factory;
                final Anchor $groupAnchor;
                final int $insertIndex;

                {
                    this.$factory = function00;
                    this.$groupAnchor = anchor0;
                    this.$insertIndex = v;
                    super(3);
                }

                @Override  // kotlin.jvm.functions.Function3
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return Unit.INSTANCE;
                }

                public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                    Intrinsics.checkNotNullParameter(applier0, "applier");
                    Intrinsics.checkNotNullParameter(slotWriter0, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager0, "$noName_2");
                    Object object0 = this.$factory.invoke();
                    slotWriter0.updateNode(this.$groupAnchor, object0);
                    applier0.insertTopDown(this.$insertIndex, object0);
                    applier0.down(object0);
                }
            });
            this.recordInsertUpFixup(new Function3(v) {
                final Anchor $groupAnchor;
                final int $insertIndex;

                {
                    this.$groupAnchor = anchor0;
                    this.$insertIndex = v;
                    super(3);
                }

                @Override  // kotlin.jvm.functions.Function3
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return Unit.INSTANCE;
                }

                public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                    Intrinsics.checkNotNullParameter(applier0, "applier");
                    Intrinsics.checkNotNullParameter(slotWriter0, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager0, "$noName_2");
                    Object object0 = slotWriter0.node(this.$groupAnchor);
                    applier0.up();
                    applier0.insertBottomUp(this.$insertIndex, object0);
                }
            });
            return;
        }
        ComposerKt.composeRuntimeError("createNode() can only be called when inserting");
        throw new KotlinNothingValueException();
    }

    private final PersistentMap currentCompositionLocalScope() {
        if(this.getInserting() && this.hasProvider) {
            for(int v = this.writer.getParent(); v > 0; v = this.writer.parent(v)) {
                if(this.writer.groupKey(v) == 202 && Intrinsics.areEqual(this.writer.groupObjectKey(v), ComposerKt.getCompositionLocalMap())) {
                    Object object0 = this.writer.groupAux(v);
                    if(object0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    }
                    return (PersistentMap)object0;
                }
            }
        }
        if(this.slotTable.getGroupsSize() > 0) {
            for(int v1 = this.reader.getParent(); v1 > 0; v1 = this.reader.parent(v1)) {
                if(this.reader.groupKey(v1) == 202 && Intrinsics.areEqual(this.reader.groupObjectKey(v1), ComposerKt.getCompositionLocalMap())) {
                    PersistentMap persistentMap0 = (PersistentMap)this.providerUpdates.get(v1);
                    if(persistentMap0 == null) {
                        Object object1 = this.reader.groupAux(v1);
                        if(object1 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        }
                        return (PersistentMap)object1;
                    }
                    return persistentMap0;
                }
            }
        }
        return this.parentProvider;
    }

    @Override  // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    public final void dispose$runtime_release() {
        Object object0 = Trace.INSTANCE.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            this.invalidateStack.clear();
            this.invalidations.clear();
            this.changes.clear();
            this.getApplier().clear();
            this.isDisposed = true;
        }
        finally {
            Trace.INSTANCE.endSection(object0);
        }
    }

    private final void doCompose(IdentityArrayMap identityArrayMap0, Function2 function20) {
        if(!this.isComposing != 0) {
            Object object0 = Trace.INSTANCE.beginSection("Compose:recompose");
            try {
                this.snapshot = SnapshotKt.currentSnapshot();
                int v1 = identityArrayMap0.getSize$runtime_release();
                if(v1 > 0) {
                    for(int v2 = 0; true; ++v2) {
                        Object object1 = identityArrayMap0.getKeys$runtime_release()[v2];
                        if(object1 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                        }
                        IdentityArraySet identityArraySet0 = (IdentityArraySet)identityArrayMap0.getValues$runtime_release()[v2];
                        Anchor anchor0 = ((RecomposeScopeImpl)object1).getAnchor();
                        Integer integer0 = anchor0 == null ? null : anchor0.getLocation$runtime_release();
                        if(integer0 == null) {
                            return;
                        }
                        Invalidation invalidation0 = new Invalidation(((RecomposeScopeImpl)object1), ((int)integer0), identityArraySet0);
                        this.invalidations.add(invalidation0);
                        if(v2 + 1 >= v1) {
                            break;
                        }
                    }
                }
                List list0 = this.invalidations;
                if(list0.size() > 1) {
                    CollectionsKt.sortWith(list0, new androidx.compose.runtime.ComposerImpl.doCompose.lambda-24..inlined.sortBy.1());
                }
                try {
                    this.nodeIndex = 0;
                    this.isComposing = true;
                    this.startRoot();
                    SnapshotStateKt.observeDerivedStateRecalculations(new Function1() {
                        {
                            ComposerImpl.this = composerImpl0;
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.invoke(((State)object0));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(State state0) {
                            Intrinsics.checkNotNullParameter(state0, "it");
                            int v = ComposerImpl.this.childrenComposing;
                            ComposerImpl.this.childrenComposing = v + 1;
                        }
                    }, new Function1() {
                        {
                            ComposerImpl.this = composerImpl0;
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.invoke(((State)object0));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(State state0) {
                            Intrinsics.checkNotNullParameter(state0, "it");
                            --ComposerImpl.this.childrenComposing;
                        }
                    }, new Function0(this) {
                        final Function2 $content;

                        {
                            this.$content = function20;
                            ComposerImpl.this = composerImpl0;
                            super(0);
                        }

                        @Override  // kotlin.jvm.functions.Function0
                        public Object invoke() {
                            this.invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            if(this.$content != null) {
                                ComposerImpl.this.startGroup(200, ComposerKt.getInvocation());
                                ComposerKt.invokeComposable(ComposerImpl.this, this.$content);
                                ComposerImpl.this.endGroup();
                                return;
                            }
                            ComposerImpl.this.skipCurrentGroup();
                        }
                    });
                    this.endRoot();
                }
                catch(Throwable throwable0) {
                    this.isComposing = false;
                    this.invalidations.clear();
                    this.providerUpdates.clear();
                    this.abortRoot();
                    throw throwable0;
                }
                this.isComposing = false;
                this.invalidations.clear();
                this.providerUpdates.clear();
            }
            finally {
                Trace.INSTANCE.endSection(object0);
            }
            return;
        }
        ComposerKt.composeRuntimeError("Reentrant composition is not supported");
        throw new KotlinNothingValueException();

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000E\u0010\u0003\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000E\u0010\u0005\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.runtime.ComposerImpl.doCompose.lambda-24..inlined.sortBy.1 implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return ComparisonsKt.compareValues(((Invalidation)object0).getLocation(), ((Invalidation)object1).getLocation());
            }
        }

    }

    private final void doRecordDownsFor(int v, int v1) {
        if(v > 0 && v != v1) {
            this.doRecordDownsFor(this.reader.parent(v), v1);
            if(this.reader.isNode(v)) {
                this.recordDown(this.nodeAt(this.reader, v));
            }
        }
    }

    @Override  // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    private final void end(boolean z) {
        List list2;
        if(this.getInserting()) {
            int v = this.writer.getParent();
            this.updateCompoundKeyWhenWeExitGroup(this.writer.groupKey(v), this.writer.groupObjectKey(v), this.writer.groupAux(v));
        }
        else {
            int v1 = this.reader.getParent();
            this.updateCompoundKeyWhenWeExitGroup(this.reader.groupKey(v1), this.reader.groupObjectKey(v1), this.reader.groupAux(v1));
        }
        int v2 = this.groupNodeCount;
        Pending pending0 = this.pending;
        if(pending0 != null && pending0.getKeyInfos().size() > 0) {
            List list0 = pending0.getKeyInfos();
            List list1 = pending0.getUsed();
            Set set0 = ListUtilsKt.fastToSet(list1);
            Set set1 = new LinkedHashSet();
            int v3 = list1.size();
            int v4 = list0.size();
            int v5 = 0;
            int v6 = 0;
            int v7 = 0;
            while(v5 < v4) {
                KeyInfo keyInfo0 = (KeyInfo)list0.get(v5);
                if(!set0.contains(keyInfo0)) {
                    this.recordRemoveNode(pending0.nodePositionOf(keyInfo0) + pending0.getStartIndex(), keyInfo0.getNodes());
                    pending0.updateNodeCount(keyInfo0.getLocation(), 0);
                    this.recordReaderMoving(keyInfo0.getLocation());
                    this.reader.reposition(keyInfo0.getLocation());
                    this.recordDelete();
                    this.reader.skipGroup();
                    int v8 = this.reader.groupSize(keyInfo0.getLocation());
                    ComposerKt.removeRange(this.invalidations, keyInfo0.getLocation(), keyInfo0.getLocation() + v8);
                }
                else if(!set1.contains(keyInfo0)) {
                    if(v6 >= v3) {
                        continue;
                    }
                    KeyInfo keyInfo1 = (KeyInfo)list1.get(v6);
                    if(keyInfo1 == keyInfo0) {
                        list2 = list1;
                        ++v5;
                    }
                    else {
                        int v9 = pending0.nodePositionOf(keyInfo1);
                        set1.add(keyInfo1);
                        if(v9 == v7) {
                            list2 = list1;
                        }
                        else {
                            int v10 = pending0.updatedNodeCountOf(keyInfo1);
                            list2 = list1;
                            this.recordMoveNode(pending0.getStartIndex() + v9, v7 + pending0.getStartIndex(), v10);
                            pending0.registerMoveNode(v9, v7, v10);
                        }
                    }
                    ++v6;
                    v7 += pending0.updatedNodeCountOf(keyInfo1);
                    list1 = list2;
                    continue;
                }
                ++v5;
            }
            this.realizeMovement();
            if(list0.size() > 0) {
                this.recordReaderMoving(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int v11 = this.nodeIndex;
        while(!this.reader.isGroupEnd()) {
            int v12 = this.reader.getCurrentGroup();
            this.recordDelete();
            this.recordRemoveNode(v11, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, v12, this.reader.getCurrentGroup());
        }
        boolean z1 = this.getInserting();
        if(z1) {
            if(z) {
                this.registerInsertUpFixup();
                v2 = 1;
            }
            this.reader.endEmpty();
            int v13 = this.writer.getParent();
            this.writer.endGroup();
            if(!this.reader.getInEmpty()) {
                this.writer.endInsert();
                this.writer.close();
                this.recordInsert(this.insertAnchor);
                this.inserting = false;
                if(!this.slotTable.isEmpty()) {
                    this.updateNodeCount(-2 - v13, 0);
                    this.updateNodeCountOverrides(-2 - v13, v2);
                }
            }
        }
        else {
            if(z) {
                this.recordUp();
            }
            this.recordEndGroup();
            int v14 = this.reader.getParent();
            if(v2 != this.updatedNodeCount(v14)) {
                this.updateNodeCountOverrides(v14, v2);
            }
            if(z) {
                v2 = 1;
            }
            this.reader.endGroup();
            this.realizeMovement();
        }
        this.exitGroup(v2, z1);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        this.endGroup();
        RecomposeScopeImpl recomposeScopeImpl0 = this.getCurrentRecomposeScope$runtime_release();
        if(recomposeScopeImpl0 != null && recomposeScopeImpl0.getUsed()) {
            recomposeScopeImpl0.setDefaultsInScope(true);
        }
    }

    private final void endGroup() {
        this.end(false);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        this.endGroup();
    }

    @Override  // androidx.compose.runtime.Composer
    public void endNode() {
        this.end(true);
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() {
        this.endGroup();
        this.endGroup();
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        this.endGroup();
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public ScopeUpdateScope endRestartGroup() {
        RecomposeScopeImpl recomposeScopeImpl0 = null;
        RecomposeScopeImpl recomposeScopeImpl1 = this.invalidateStack.isNotEmpty() ? ((RecomposeScopeImpl)this.invalidateStack.pop()) : null;
        if(recomposeScopeImpl1 != null) {
            recomposeScopeImpl1.setRequiresRecompose(false);
        }
        if(recomposeScopeImpl1 != null) {
            Function1 function10 = recomposeScopeImpl1.end(this.snapshot.getId());
            if(function10 != null) {
                this.record(new Function3(this) {
                    final Function1 $it;

                    {
                        this.$it = function10;
                        ComposerImpl.this = composerImpl0;
                        super(3);
                    }

                    @Override  // kotlin.jvm.functions.Function3
                    public Object invoke(Object object0, Object object1, Object object2) {
                        this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                        Intrinsics.checkNotNullParameter(applier0, "$noName_0");
                        Intrinsics.checkNotNullParameter(slotWriter0, "$noName_1");
                        Intrinsics.checkNotNullParameter(rememberManager0, "$noName_2");
                        this.$it.invoke(ComposerImpl.this.getComposition());
                    }
                });
            }
        }
        if(recomposeScopeImpl1 != null && !recomposeScopeImpl1.getSkipped$runtime_release() && (recomposeScopeImpl1.getUsed() || this.collectParameterInformation)) {
            if(recomposeScopeImpl1.getAnchor() == null) {
                recomposeScopeImpl1.setAnchor((this.getInserting() ? this.writer.anchor(this.writer.getParent()) : this.reader.anchor(this.reader.getParent())));
            }
            recomposeScopeImpl1.setDefaultsInvalid(false);
            recomposeScopeImpl0 = recomposeScopeImpl1;
        }
        this.end(false);
        return recomposeScopeImpl0;
    }

    @Override  // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if(this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        this.end(false);
    }

    private final void endRoot() {
        this.endGroup();
        this.parentContext.doneComposing$runtime_release();
        this.endGroup();
        this.recordEndRoot();
        this.finalizeCompose();
        this.reader.close();
    }

    private final void ensureWriter() {
        if(this.writer.getClosed()) {
            SlotWriter slotWriter0 = this.insertTable.openWriter();
            this.writer = slotWriter0;
            slotWriter0.skipToGroupEnd();
            this.hasProvider = false;
        }
    }

    private final void enterGroup(boolean z, Pending pending0) {
        this.pendingStack.push(this.pending);
        this.pending = pending0;
        this.nodeIndexStack.push(this.nodeIndex);
        if(z) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.push(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void exitGroup(int v, boolean z) {
        Pending pending0 = (Pending)this.pendingStack.pop();
        if(pending0 != null && !z) {
            pending0.setGroupIndex(pending0.getGroupIndex() + 1);
        }
        this.pending = pending0;
        this.nodeIndex = this.nodeIndexStack.pop() + v;
        this.groupNodeCount = this.groupNodeCountStack.pop() + v;
    }

    private final void finalizeCompose() {
        this.realizeUps();
        if(this.pendingStack.isEmpty()) {
            if(this.startedGroups.isEmpty()) {
                this.cleanUpCompose();
                return;
            }
            ComposerKt.composeRuntimeError("Missed recording an endGroup()");
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Start/end imbalance");
        throw new KotlinNothingValueException();
    }

    @Override  // androidx.compose.runtime.Composer
    public Applier getApplier() {
        return this.applier;
    }

    @Override  // androidx.compose.runtime.Composer
    public CoroutineContext getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext$runtime_release();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.size();
    }

    @Override  // androidx.compose.runtime.Composer
    public ControlledComposition getComposition() {
        return this.composition;
    }

    @Override  // androidx.compose.runtime.Composer
    public CompositionData getCompositionData() {
        return this.slotTable;
    }

    @InternalComposeApi
    public static void getCompositionData$annotations() {
    }

    @Override  // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @InternalComposeApi
    public static void getCompoundKeyHash$annotations() {
    }

    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        return this.childrenComposing != 0 || !this.invalidateStack.isNotEmpty() ? null : ((RecomposeScopeImpl)this.invalidateStack.peek());
    }

    @Override  // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if(!this.providersInvalid) {
            RecomposeScopeImpl recomposeScopeImpl0 = this.getCurrentRecomposeScope$runtime_release();
            return recomposeScopeImpl0 == null ? false : recomposeScopeImpl0.getDefaultsInvalid();
        }
        return true;
    }

    @ComposeCompilerApi
    public static void getDefaultsInvalid$annotations() {
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return !this.changes.isEmpty();
    }

    public final SlotTable getInsertTable$runtime_release() {
        return this.insertTable;
    }

    @Override  // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @ComposeCompilerApi
    public static void getInserting$annotations() {
    }

    private final Object getNode(SlotReader slotReader0) {
        return slotReader0.node(slotReader0.getParent());
    }

    @Override  // androidx.compose.runtime.Composer
    public RecomposeScope getRecomposeScope() {
        return this.getCurrentRecomposeScope$runtime_release();
    }

    @Override  // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        if(!this.getInserting() && !this.reusing && !this.providersInvalid) {
            RecomposeScopeImpl recomposeScopeImpl0 = this.getCurrentRecomposeScope$runtime_release();
            return recomposeScopeImpl0 == null ? false : !recomposeScopeImpl0.getRequiresRecompose();
        }
        return false;
    }

    @ComposeCompilerApi
    public static void getSkipping$annotations() {
    }

    private final int groupCompoundKeyPart(SlotReader slotReader0, int v) {
        if(slotReader0.hasObjectKey(v)) {
            Object object0 = slotReader0.groupObjectKey(v);
            return object0 == null ? 0 : object0.hashCode();
        }
        int v1 = slotReader0.groupKey(v);
        if(v1 == 0xCF) {
            Object object1 = slotReader0.groupAux(v);
            return object1 == null || Intrinsics.areEqual(object1, Composer.Companion.getEmpty()) ? 0xCF : object1.hashCode();
        }
        return v1;
    }

    private final int insertedGroupVirtualIndex(int v) [...] // Inlined contents

    public final boolean isComposing$runtime_release() {
        return this.isComposing;
    }

    public final boolean isDisposed$runtime_release() {
        return this.isDisposed;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Object joinKey(Object object0, Object object1) {
        JoinedKey joinedKey0 = ComposerKt.getKey(this.reader.getGroupObjectKey(), object0, object1);
        return joinedKey0 == null ? new JoinedKey(object0, object1) : joinedKey0;
    }

    public final Object nextSlot() {
        if(this.getInserting()) {
            this.validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object object0 = this.reader.next();
        return this.reusing ? Composer.Companion.getEmpty() : object0;
    }

    private final Object nodeAt(SlotReader slotReader0, int v) {
        return slotReader0.node(v);
    }

    private final int nodeIndexOf(int v, int v1, int v2, int v3) {
        int v4;
        for(v4 = this.reader.parent(v1); v4 != v2 && !this.reader.isNode(v4); v4 = this.reader.parent(v4)) {
        }
        if(this.reader.isNode(v4)) {
            v3 = 0;
        }
        if(v4 == v1) {
            return v3;
        }
        int v5 = this.updatedNodeCount(v4) - this.reader.nodeCount(v1) + v3;
    label_9:
        while(v3 < v5 && v4 != v) {
            ++v4;
            while(true) {
                if(v4 >= v) {
                    break label_9;
                }
                int v6 = this.reader.groupSize(v4) + v4;
                if(v >= v6) {
                    v3 += this.updatedNodeCount(v4);
                    v4 = v6;
                    continue;
                }
                if(false) {
                    break label_9;
                }
                continue label_9;
            }
        }
        return v3;
    }

    public final void prepareCompose$runtime_release(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        if(!this.isComposing != 0) {
            try {
                this.isComposing = true;
                function00.invoke();
                this.isComposing = false;
                return;
            }
            catch(Throwable throwable0) {
                this.isComposing = false;
                throw throwable0;
            }
        }
        ComposerKt.composeRuntimeError("Preparing a composition while composing is not supported");
        throw new KotlinNothingValueException();
    }

    private final void realizeDowns() {
        if(this.downNodes.isNotEmpty()) {
            this.realizeDowns(this.downNodes.toArray());
            this.downNodes.clear();
        }
    }

    private final void realizeDowns(Object[] arr_object) {
        this.record(new Function3() {
            final Object[] $nodes;

            {
                this.$nodes = arr_object;
                super(3);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                return Unit.INSTANCE;
            }

            public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                Intrinsics.checkNotNullParameter(applier0, "applier");
                Intrinsics.checkNotNullParameter(slotWriter0, "$noName_1");
                Intrinsics.checkNotNullParameter(rememberManager0, "$noName_2");
                int v = this.$nodes.length - 1;
                if(v >= 0) {
                    for(int v1 = 0; true; ++v1) {
                        applier0.down(this.$nodes[v1]);
                        if(v1 + 1 > v) {
                            break;
                        }
                    }
                }
            }
        });
    }

    private final void realizeMovement() {
        int v = this.previousCount;
        this.previousCount = 0;
        if(v > 0) {
            int v1 = this.previousRemove;
            if(v1 >= 0) {
                this.previousRemove = -1;
                this.recordApplierOperation(new Function3(v) {
                    final int $count;
                    final int $removeIndex;

                    {
                        this.$removeIndex = v;
                        this.$count = v1;
                        super(3);
                    }

                    @Override  // kotlin.jvm.functions.Function3
                    public Object invoke(Object object0, Object object1, Object object2) {
                        this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                        Intrinsics.checkNotNullParameter(applier0, "applier");
                        Intrinsics.checkNotNullParameter(slotWriter0, "$noName_1");
                        Intrinsics.checkNotNullParameter(rememberManager0, "$noName_2");
                        applier0.remove(this.$removeIndex, this.$count);
                    }
                });
                return;
            }
            int v2 = this.previousMoveFrom;
            this.previousMoveFrom = -1;
            int v3 = this.previousMoveTo;
            this.previousMoveTo = -1;
            this.recordApplierOperation(new Function3(v3, v) {
                final int $count;
                final int $from;
                final int $to;

                {
                    this.$from = v;
                    this.$to = v1;
                    this.$count = v2;
                    super(3);
                }

                @Override  // kotlin.jvm.functions.Function3
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return Unit.INSTANCE;
                }

                public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                    Intrinsics.checkNotNullParameter(applier0, "applier");
                    Intrinsics.checkNotNullParameter(slotWriter0, "$noName_1");
                    Intrinsics.checkNotNullParameter(rememberManager0, "$noName_2");
                    applier0.move(this.$from, this.$to, this.$count);
                }
            });
        }
    }

    private final void realizeOperationLocation(boolean z) {
        int v = z ? this.reader.getParent() : this.reader.getCurrentGroup();
        int v1 = v - this.writersReaderDelta;
        if(v1 < 0) {
            throw new IllegalArgumentException("Tried to seek backward");
        }
        if(v1 > 0) {
            this.record(new Function3() {
                final int $distance;

                {
                    this.$distance = v;
                    super(3);
                }

                @Override  // kotlin.jvm.functions.Function3
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return Unit.INSTANCE;
                }

                public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                    Intrinsics.checkNotNullParameter(applier0, "$noName_0");
                    Intrinsics.checkNotNullParameter(slotWriter0, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager0, "$noName_2");
                    slotWriter0.advanceBy(this.$distance);
                }
            });
            this.writersReaderDelta = v;
        }
    }

    static void realizeOperationLocation$default(ComposerImpl composerImpl0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        composerImpl0.realizeOperationLocation(z);
    }

    private final void realizeUps() {
        int v = this.pendingUps;
        if(v > 0) {
            this.pendingUps = 0;
            this.record(new Function3() {
                final int $count;

                {
                    this.$count = v;
                    super(3);
                }

                @Override  // kotlin.jvm.functions.Function3
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return Unit.INSTANCE;
                }

                public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                    Intrinsics.checkNotNullParameter(applier0, "applier");
                    Intrinsics.checkNotNullParameter(slotWriter0, "$noName_1");
                    Intrinsics.checkNotNullParameter(rememberManager0, "$noName_2");
                    int v = this.$count;
                    for(int v1 = 0; v1 < v; ++v1) {
                        applier0.up();
                    }
                }
            });
        }
    }

    public final boolean recompose$runtime_release(IdentityArrayMap identityArrayMap0) {
        Intrinsics.checkNotNullParameter(identityArrayMap0, "invalidationsRequested");
        if(this.changes.isEmpty()) {
            if(!identityArrayMap0.isNotEmpty() && !this.invalidations.isEmpty() == 0) {
                return false;
            }
            this.doCompose(identityArrayMap0, null);
            return !this.changes.isEmpty();
        }
        ComposerKt.composeRuntimeError("Expected applyChanges() to have been called");
        throw new KotlinNothingValueException();
    }

    private final void recomposeToGroupEnd() {
        boolean z = this.isComposing;
        this.isComposing = true;
        int v = this.reader.getParent();
        int v1 = this.reader.groupSize(v) + v;
        int v2 = this.nodeIndex;
        int v3 = this.getCompoundKeyHash();
        int v4 = this.groupNodeCount;
        Invalidation invalidation0 = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), v1);
        boolean z1 = false;
        int v5 = v;
        while(invalidation0 != null) {
            int v6 = invalidation0.getLocation();
            ComposerKt.removeLocation(this.invalidations, v6);
            if(invalidation0.isInvalid()) {
                this.reader.reposition(v6);
                int v7 = this.reader.getCurrentGroup();
                this.recordUpsAndDowns(v5, v7, v);
                this.nodeIndex = this.nodeIndexOf(v6, v7, v, v2);
                this.compoundKeyHash = this.compoundKeyOf(this.reader.parent(v7), v, v3);
                invalidation0.getScope().compose(this);
                this.reader.restoreParent(v);
                v5 = v7;
                z1 = true;
            }
            else {
                this.invalidateStack.push(invalidation0.getScope());
                invalidation0.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            invalidation0 = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), v1);
        }
        if(z1) {
            this.recordUpsAndDowns(v5, v, v);
            this.reader.skipToGroupEnd();
            int v8 = this.updatedNodeCount(v);
            this.nodeIndex = v2 + v8;
            this.groupNodeCount = v4 + v8;
        }
        else {
            this.skipReaderToGroupEnd();
        }
        this.compoundKeyHash = v3;
        this.isComposing = z;
    }

    private final void record(Function3 function30) {
        this.changes.add(function30);
    }

    private final void recordApplierOperation(Function3 function30) {
        this.realizeUps();
        this.realizeDowns();
        this.record(function30);
    }

    private final void recordDelete() {
        this.recordSlotEditingOperation(ComposerKt.removeCurrentGroupInstance);
        this.writersReaderDelta += this.reader.getGroupSize();
    }

    private final void recordDown(Object object0) {
        this.downNodes.push(object0);
    }

    private final void recordEndGroup() {
        int v = this.reader.getParent();
        if(this.startedGroups.peekOr(-1) <= v) {
            if(this.startedGroups.peekOr(-1) == v) {
                this.startedGroups.pop();
                ComposerImpl.recordSlotTableOperation$default(this, false, ComposerKt.endGroupInstance, 1, null);
            }
            return;
        }
        ComposerKt.composeRuntimeError("Missed recording an endGroup");
        throw new KotlinNothingValueException();
    }

    private final void recordEndRoot() {
        if(this.startedGroup) {
            ComposerImpl.recordSlotTableOperation$default(this, false, ComposerKt.endGroupInstance, 1, null);
            this.startedGroup = false;
        }
    }

    private final void recordFixup(Function3 function30) {
        this.insertFixups.add(function30);
    }

    private final void recordInsert(Anchor anchor0) {
        if(this.insertFixups.isEmpty()) {
            this.recordSlotEditingOperation(new Function3(anchor0) {
                final Anchor $anchor;
                final SlotTable $insertTable;

                {
                    this.$insertTable = slotTable0;
                    this.$anchor = anchor0;
                    super(3);
                }

                @Override  // kotlin.jvm.functions.Function3
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return Unit.INSTANCE;
                }

                public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                    Intrinsics.checkNotNullParameter(applier0, "$noName_0");
                    Intrinsics.checkNotNullParameter(slotWriter0, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager0, "$noName_2");
                    slotWriter0.beginInsert();
                    int v = this.$anchor.toIndexFor(this.$insertTable);
                    slotWriter0.moveFrom(this.$insertTable, v);
                    slotWriter0.endInsert();
                }
            });
            return;
        }
        List list0 = CollectionsKt.toMutableList(this.insertFixups);
        this.insertFixups.clear();
        this.realizeUps();
        this.realizeDowns();
        this.recordSlotEditingOperation(new Function3(anchor0, list0) {
            final Anchor $anchor;
            final List $fixups;
            final SlotTable $insertTable;

            {
                this.$insertTable = slotTable0;
                this.$anchor = anchor0;
                this.$fixups = list0;
                super(3);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                return Unit.INSTANCE;
            }

            public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                Intrinsics.checkNotNullParameter(applier0, "applier");
                Intrinsics.checkNotNullParameter(slotWriter0, "slots");
                Intrinsics.checkNotNullParameter(rememberManager0, "rememberManager");
                List list0 = this.$fixups;
                try(SlotWriter slotWriter1 = this.$insertTable.openWriter()) {
                    int v = list0.size();
                    if(v - 1 >= 0) {
                        for(int v1 = 0; true; ++v1) {
                            ((Function3)list0.get(v1)).invoke(applier0, slotWriter1, rememberManager0);
                            if(v1 + 1 > v - 1) {
                                break;
                            }
                        }
                    }
                }
                slotWriter0.beginInsert();
                int v2 = this.$anchor.toIndexFor(this.$insertTable);
                slotWriter0.moveFrom(this.$insertTable, v2);
                slotWriter0.endInsert();
            }
        });
    }

    private final void recordInsertUpFixup(Function3 function30) {
        this.insertUpFixups.push(function30);
    }

    private final void recordMoveNode(int v, int v1, int v2) {
        if(v2 > 0) {
            int v3 = this.previousCount;
            if(v3 > 0 && this.previousMoveFrom == v - v3 && this.previousMoveTo == v1 - v3) {
                this.previousCount = v3 + v2;
                return;
            }
            this.realizeMovement();
            this.previousMoveFrom = v;
            this.previousMoveTo = v1;
            this.previousCount = v2;
        }
    }

    private final void recordReaderMoving(int v) {
        this.writersReaderDelta = v - (this.reader.getCurrentGroup() - this.writersReaderDelta);
    }

    private final void recordRemoveNode(int v, int v1) {
        if(v1 > 0) {
            if(v >= 0) {
                if(this.previousRemove == v) {
                    this.previousCount += v1;
                    return;
                }
                this.realizeMovement();
                this.previousRemove = v;
                this.previousCount = v1;
                return;
            }
            ComposerKt.composeRuntimeError(("Invalid remove index " + v).toString());
            throw new KotlinNothingValueException();
        }
    }

    @Override  // androidx.compose.runtime.Composer
    public void recordSideEffect(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "effect");
        this.record(new Function3() {
            final Function0 $effect;

            {
                this.$effect = function00;
                super(3);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                return Unit.INSTANCE;
            }

            public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                Intrinsics.checkNotNullParameter(applier0, "$noName_0");
                Intrinsics.checkNotNullParameter(slotWriter0, "$noName_1");
                Intrinsics.checkNotNullParameter(rememberManager0, "rememberManager");
                rememberManager0.sideEffect(this.$effect);
            }
        });
    }

    private final void recordSlotEditing() {
        if(!this.slotTable.isEmpty()) {
            SlotReader slotReader0 = this.reader;
            int v = slotReader0.getParent();
            if(this.startedGroups.peekOr(-1) != v) {
                if(!this.startedGroup) {
                    ComposerImpl.recordSlotTableOperation$default(this, false, ComposerKt.startRootGroup, 1, null);
                    this.startedGroup = true;
                }
                Anchor anchor0 = slotReader0.anchor(v);
                this.startedGroups.push(v);
                ComposerImpl.recordSlotTableOperation$default(this, false, new Function3() {
                    final Anchor $anchor;

                    {
                        this.$anchor = anchor0;
                        super(3);
                    }

                    @Override  // kotlin.jvm.functions.Function3
                    public Object invoke(Object object0, Object object1, Object object2) {
                        this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                        Intrinsics.checkNotNullParameter(applier0, "$noName_0");
                        Intrinsics.checkNotNullParameter(slotWriter0, "slots");
                        Intrinsics.checkNotNullParameter(rememberManager0, "$noName_2");
                        slotWriter0.ensureStarted(this.$anchor);
                    }
                }, 1, null);
            }
        }
    }

    private final void recordSlotEditingOperation(Function3 function30) {
        ComposerImpl.realizeOperationLocation$default(this, false, 1, null);
        this.recordSlotEditing();
        this.record(function30);
    }

    private final void recordSlotTableOperation(boolean z, Function3 function30) {
        this.realizeOperationLocation(z);
        this.record(function30);
    }

    static void recordSlotTableOperation$default(ComposerImpl composerImpl0, boolean z, Function3 function30, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        composerImpl0.recordSlotTableOperation(z, function30);
    }

    private final void recordUp() {
        if(this.downNodes.isNotEmpty()) {
            this.downNodes.pop();
            return;
        }
        ++this.pendingUps;
    }

    private final void recordUpsAndDowns(int v, int v1, int v2) {
        SlotReader slotReader0 = this.reader;
        int v3 = ComposerKt.nearestCommonRootOf(slotReader0, v, v1, v2);
        while(v > 0 && v != v3) {
            if(slotReader0.isNode(v)) {
                this.recordUp();
            }
            v = slotReader0.parent(v);
        }
        this.doRecordDownsFor(v1, v3);
    }

    @Override  // androidx.compose.runtime.Composer
    public void recordUsed(RecomposeScope recomposeScope0) {
        Intrinsics.checkNotNullParameter(recomposeScope0, "scope");
        RecomposeScopeImpl recomposeScopeImpl0 = recomposeScope0 instanceof RecomposeScopeImpl ? ((RecomposeScopeImpl)recomposeScope0) : null;
        if(recomposeScopeImpl0 != null) {
            recomposeScopeImpl0.setUsed(true);
        }
    }

    private final void registerInsertUpFixup() {
        Object object0 = this.insertUpFixups.pop();
        this.insertFixups.add(object0);
    }

    @Override  // androidx.compose.runtime.Composer
    public Object rememberedValue() {
        return this.nextSlot();
    }

    // 去混淆评级： 低(20)
    private final Object resolveCompositionLocal(CompositionLocal compositionLocal0, PersistentMap persistentMap0) {
        return ComposerKt.contains(persistentMap0, compositionLocal0) ? ComposerKt.getValueOf(persistentMap0, compositionLocal0) : compositionLocal0.getDefaultValueHolder$runtime_release().getValue();
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() {
        if(this.invalidations.isEmpty()) {
            this.skipGroup();
            return;
        }
        SlotReader slotReader0 = this.reader;
        int v = slotReader0.getGroupKey();
        Object object0 = slotReader0.getGroupObjectKey();
        Object object1 = slotReader0.getGroupAux();
        this.updateCompoundKeyWhenWeEnterGroup(v, object0, object1);
        this.startReaderGroup(slotReader0.isNode(), null);
        this.recomposeToGroupEnd();
        slotReader0.endGroup();
        this.updateCompoundKeyWhenWeExitGroup(v, object0, object1);
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if(this.groupNodeCount == 0) {
            RecomposeScopeImpl recomposeScopeImpl0 = this.getCurrentRecomposeScope$runtime_release();
            if(recomposeScopeImpl0 != null) {
                recomposeScopeImpl0.scopeSkipped();
            }
            if(this.invalidations.isEmpty()) {
                this.skipReaderToGroupEnd();
                return;
            }
            this.recomposeToGroupEnd();
            return;
        }
        ComposerKt.composeRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        throw new KotlinNothingValueException();
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(String s) {
        Intrinsics.checkNotNullParameter(s, "sourceInformation");
        if(this.getInserting()) {
            this.writer.insertAux(s);
        }
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        this.end(false);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int v, String s) {
        Intrinsics.checkNotNullParameter(s, "sourceInformation");
        this.start(v, null, false, s);
    }

    private final void start(int v, Object object0, boolean z, Object object1) {
        this.validateNodeNotExpected();
        this.updateCompoundKeyWhenWeEnterGroup(v, object0, object1);
        Pending pending0 = null;
        if(this.getInserting()) {
            this.reader.beginEmpty();
            int v1 = this.writer.getCurrentGroup();
            if(z) {
                this.writer.startNode(Composer.Companion.getEmpty());
            }
            else if(object1 == null) {
                SlotWriter slotWriter1 = this.writer;
                if(object0 == null) {
                    object0 = Composer.Companion.getEmpty();
                }
                slotWriter1.startGroup(v, object0);
            }
            else {
                SlotWriter slotWriter0 = this.writer;
                if(object0 == null) {
                    object0 = Composer.Companion.getEmpty();
                }
                slotWriter0.startData(v, object0, object1);
            }
            Pending pending1 = this.pending;
            if(pending1 != null) {
                KeyInfo keyInfo0 = new KeyInfo(v, -1, -2 - v1, -1, 0);
                pending1.registerInsert(keyInfo0, this.nodeIndex - pending1.getStartIndex());
                pending1.recordUsed(keyInfo0);
            }
            this.enterGroup(z, null);
            return;
        }
        if(this.pending == null) {
            if(this.reader.getGroupKey() != v || !Intrinsics.areEqual(object0, this.reader.getGroupObjectKey())) {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            }
            else {
                this.startReaderGroup(z, object1);
            }
        }
        Pending pending2 = this.pending;
        if(pending2 != null) {
            KeyInfo keyInfo1 = pending2.getNext(v, object0);
            if(keyInfo1 == null) {
                this.reader.beginEmpty();
                this.inserting = true;
                this.ensureWriter();
                this.writer.beginInsert();
                int v5 = this.writer.getCurrentGroup();
                if(z) {
                    this.writer.startNode(Composer.Companion.getEmpty());
                }
                else if(object1 == null) {
                    SlotWriter slotWriter3 = this.writer;
                    if(object0 == null) {
                        object0 = Composer.Companion.getEmpty();
                    }
                    slotWriter3.startGroup(v, object0);
                }
                else {
                    SlotWriter slotWriter2 = this.writer;
                    if(object0 == null) {
                        object0 = Composer.Companion.getEmpty();
                    }
                    slotWriter2.startData(v, object0, object1);
                }
                this.insertAnchor = this.writer.anchor(v5);
                KeyInfo keyInfo2 = new KeyInfo(v, -1, -2 - v5, -1, 0);
                pending2.registerInsert(keyInfo2, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo2);
                pending0 = new Pending(new ArrayList(), (z ? 0 : this.nodeIndex));
            }
            else {
                pending2.recordUsed(keyInfo1);
                int v2 = keyInfo1.getLocation();
                this.nodeIndex = pending2.nodePositionOf(keyInfo1) + pending2.getStartIndex();
                int v3 = pending2.slotPositionOf(keyInfo1);
                int v4 = v3 - pending2.getGroupIndex();
                pending2.registerMoveSlot(v3, pending2.getGroupIndex());
                this.recordReaderMoving(v2);
                this.reader.reposition(v2);
                if(v4 > 0) {
                    this.recordSlotEditingOperation(new Function3() {
                        final int $currentRelativePosition;

                        {
                            this.$currentRelativePosition = v;
                            super(3);
                        }

                        @Override  // kotlin.jvm.functions.Function3
                        public Object invoke(Object object0, Object object1, Object object2) {
                            this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                            Intrinsics.checkNotNullParameter(applier0, "$noName_0");
                            Intrinsics.checkNotNullParameter(slotWriter0, "slots");
                            Intrinsics.checkNotNullParameter(rememberManager0, "$noName_2");
                            slotWriter0.moveGroup(this.$currentRelativePosition);
                        }
                    });
                }
                this.startReaderGroup(z, object1);
            }
        }
        this.enterGroup(z, pending0);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        this.start(0, null, false, null);
    }

    private final void startGroup(int v) {
        this.start(v, null, false, null);
    }

    private final void startGroup(int v, Object object0) {
        this.start(v, object0, false, null);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int v, Object object0) {
        this.start(v, object0, false, null);
    }

    @Override  // androidx.compose.runtime.Composer
    public void startNode() {
        int v = 0x7D;
        if(!this.getInserting()) {
            if(!this.reusing) {
                if(this.reader.getGroupKey() == 0x7E) {
                    v = 0x7E;
                }
            }
            else if(this.reader.getGroupKey() == 0x7D) {
                v = 0x7E;
            }
        }
        this.start(v, null, true, null);
        this.nodeExpected = true;
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(ProvidedValue[] arr_providedValue) {
        boolean z;
        PersistentMap persistentMap2;
        Intrinsics.checkNotNullParameter(arr_providedValue, "values");
        PersistentMap persistentMap0 = this.currentCompositionLocalScope();
        this.startGroup(201, ComposerKt.getProvider());
        this.startGroup(203, ComposerKt.getProviderValues());
        PersistentMap persistentMap1 = (PersistentMap)ComposerKt.invokeComposableForResult(this, new Function2(persistentMap0) {
            final PersistentMap $parentScope;
            final ProvidedValue[] $values;

            {
                this.$values = arr_providedValue;
                this.$parentScope = persistentMap0;
                super(2);
            }

            public final PersistentMap invoke(Composer composer0, int v) {
                composer0.startReplaceableGroup(0x7C2F071A);
                ComposerKt.sourceInformation(composer0, "C1691@62526L42:Composer.kt#9igjgp");
                PersistentMap persistentMap0 = ComposerKt.compositionLocalMapOf(this.$values, this.$parentScope, composer0, 8);
                composer0.endReplaceableGroup();
                return persistentMap0;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Composer)object0), ((Number)object1).intValue());
            }
        });
        this.endGroup();
        if(this.getInserting()) {
            persistentMap2 = this.updateProviderMapGroup(persistentMap0, persistentMap1);
            this.hasProvider = true;
            z = false;
        }
        else {
            Object object0 = this.reader.groupGet(0);
            if(object0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            Object object1 = this.reader.groupGet(1);
            if(object1 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            if(!this.getSkipping() || !Intrinsics.areEqual(((PersistentMap)object1), persistentMap1)) {
                persistentMap2 = this.updateProviderMapGroup(persistentMap0, persistentMap1);
                z = !Intrinsics.areEqual(persistentMap2, ((PersistentMap)object0));
            }
            else {
                this.skipGroup();
                persistentMap2 = (PersistentMap)object0;
                z = false;
            }
        }
        if(z && !this.getInserting()) {
            this.providerUpdates.put(this.reader.getCurrentGroup(), persistentMap2);
        }
        this.providersInvalidStack.push(ComposerKt.access$asInt(this.providersInvalid));
        this.providersInvalid = z;
        this.start(202, ComposerKt.getCompositionLocalMap(), false, persistentMap2);
    }

    private final void startReaderGroup(boolean z, Object object0) {
        if(z) {
            this.reader.startNode();
            return;
        }
        if(object0 != null && this.reader.getGroupAux() != object0) {
            ComposerImpl.recordSlotTableOperation$default(this, false, new Function3() {
                final Object $data;

                {
                    this.$data = object0;
                    super(3);
                }

                @Override  // kotlin.jvm.functions.Function3
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return Unit.INSTANCE;
                }

                public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                    Intrinsics.checkNotNullParameter(applier0, "$noName_0");
                    Intrinsics.checkNotNullParameter(slotWriter0, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager0, "$noName_2");
                    slotWriter0.updateAux(this.$data);
                }
            }, 1, null);
        }
        this.reader.startGroup();
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int v) {
        this.start(v, null, false, null);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Composer startRestartGroup(int v) {
        this.start(v, null, false, null);
        this.addRecomposeScope();
        return this;
    }

    @Override  // androidx.compose.runtime.Composer
    public void startReusableGroup(int v, Object object0) {
        if(this.reader.getGroupKey() == v && !Intrinsics.areEqual(this.reader.getGroupAux(), object0) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        this.start(v, null, false, object0);
    }

    @Override  // androidx.compose.runtime.Composer
    public void startReusableNode() {
        this.start(0x7D, null, true, null);
        this.nodeExpected = true;
    }

    private final void startRoot() {
        this.reader = this.slotTable.openReader();
        this.startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        this.providersInvalidStack.push(ComposerKt.access$asInt(this.providersInvalid));
        this.providersInvalid = this.changed(this.parentProvider);
        this.collectParameterInformation = this.parentContext.getCollectingParameterInformation$runtime_release();
        Set set0 = (Set)this.resolveCompositionLocal(InspectionTablesKt.getLocalInspectionTables(), this.parentProvider);
        if(set0 != null) {
            set0.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set0);
        }
        this.startGroup(this.parentContext.getCompoundHashKey$runtime_release());
    }

    public final boolean tryImminentInvalidation$runtime_release(RecomposeScopeImpl recomposeScopeImpl0, Object object0) {
        Intrinsics.checkNotNullParameter(recomposeScopeImpl0, "scope");
        Anchor anchor0 = recomposeScopeImpl0.getAnchor();
        if(anchor0 == null) {
            return false;
        }
        int v = anchor0.toIndexFor(this.slotTable);
        if(this.isComposing && v >= this.reader.getCurrentGroup()) {
            ComposerKt.insertIfMissing(this.invalidations, v, recomposeScopeImpl0, object0);
            return true;
        }
        return false;
    }

    public final void updateCachedValue(Object object0) {
        if(this.getInserting() && object0 instanceof RememberObserver) {
            this.abandonSet.add(object0);
        }
        this.updateValue(object0);
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int v, Object object0, Object object1) {
        if(object0 == null) {
            if(object1 != null && v == 0xCF && !Intrinsics.areEqual(object1, Composer.Companion.getEmpty())) {
                this.updateCompoundKeyWhenWeEnterGroupKeyHash(object1.hashCode());
                return;
            }
            this.updateCompoundKeyWhenWeEnterGroupKeyHash(v);
            return;
        }
        if(object0 instanceof Enum) {
            this.updateCompoundKeyWhenWeEnterGroupKeyHash(((Enum)object0).ordinal());
            return;
        }
        this.updateCompoundKeyWhenWeEnterGroupKeyHash(object0.hashCode());
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int v) {
        this.compoundKeyHash = v ^ Integer.rotateLeft(this.getCompoundKeyHash(), 3);
    }

    private final void updateCompoundKeyWhenWeExitGroup(int v, Object object0, Object object1) {
        if(object0 == null) {
            if(object1 != null && v == 0xCF && !Intrinsics.areEqual(object1, Composer.Companion.getEmpty())) {
                this.updateCompoundKeyWhenWeExitGroupKeyHash(object1.hashCode());
                return;
            }
            this.updateCompoundKeyWhenWeExitGroupKeyHash(v);
            return;
        }
        if(object0 instanceof Enum) {
            this.updateCompoundKeyWhenWeExitGroupKeyHash(((Enum)object0).ordinal());
            return;
        }
        this.updateCompoundKeyWhenWeExitGroupKeyHash(object0.hashCode());
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int v) {
        this.compoundKeyHash = Integer.rotateRight(v ^ this.getCompoundKeyHash(), 3);
    }

    private final void updateNodeCount(int v, int v1) {
        if(this.updatedNodeCount(v) != v1) {
            if(v < 0) {
                HashMap hashMap0 = this.nodeCountVirtualOverrides;
                if(hashMap0 == null) {
                    hashMap0 = new HashMap();
                    this.nodeCountVirtualOverrides = hashMap0;
                }
                hashMap0.put(v, v1);
                return;
            }
            int[] arr_v = this.nodeCountOverrides;
            if(arr_v == null) {
                arr_v = new int[this.reader.getSize()];
                ArraysKt.fill$default(arr_v, -1, 0, 0, 6, null);
                this.nodeCountOverrides = arr_v;
            }
            arr_v[v] = v1;
        }
    }

    private final void updateNodeCountOverrides(int v, int v1) {
        int v2 = this.updatedNodeCount(v);
        if(v2 != v1) {
            int v3 = this.pendingStack.getSize() - 1;
            while(v != -1) {
                int v4 = this.updatedNodeCount(v) + (v1 - v2);
                this.updateNodeCount(v, v4);
                if(v3 >= 0) {
                    for(int v5 = v3; true; --v5) {
                        Pending pending0 = (Pending)this.pendingStack.peek(v5);
                        if(pending0 != null && pending0.updateNodeCount(v, v4)) {
                            v3 = v5 - 1;
                            break;
                        }
                        if(v5 - 1 < 0) {
                            break;
                        }
                    }
                }
                if(v < 0) {
                    v = this.reader.getParent();
                }
                else {
                    if(this.reader.isNode(v)) {
                        break;
                    }
                    v = this.reader.parent(v);
                }
            }
        }
    }

    private final PersistentMap updateProviderMapGroup(PersistentMap persistentMap0, PersistentMap persistentMap1) {
        Builder persistentMap$Builder0 = persistentMap0.builder();
        persistentMap$Builder0.putAll(persistentMap1);
        PersistentMap persistentMap2 = persistentMap$Builder0.build();
        this.startGroup(204, ComposerKt.getProviderMaps());
        this.changed(persistentMap2);
        this.changed(persistentMap1);
        this.endGroup();
        return persistentMap2;
    }

    @Override  // androidx.compose.runtime.Composer
    public void updateRememberedValue(Object object0) {
        this.updateValue(object0);
    }

    public final void updateValue(Object object0) {
        if(this.getInserting()) {
            this.writer.update(object0);
            if(object0 instanceof RememberObserver) {
                this.record(new Function3() {
                    final Object $value;

                    {
                        this.$value = object0;
                        super(3);
                    }

                    @Override  // kotlin.jvm.functions.Function3
                    public Object invoke(Object object0, Object object1, Object object2) {
                        this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                        Intrinsics.checkNotNullParameter(applier0, "$noName_0");
                        Intrinsics.checkNotNullParameter(slotWriter0, "$noName_1");
                        Intrinsics.checkNotNullParameter(rememberManager0, "rememberManager");
                        rememberManager0.remembering(((RememberObserver)this.$value));
                    }
                });
            }
        }
        else {
            this.recordSlotTableOperation(true, new Function3(this, this.reader.getGroupSlotIndex() - 1) {
                final int $groupSlotIndex;
                final Object $value;

                {
                    this.$value = object0;
                    ComposerImpl.this = composerImpl0;
                    this.$groupSlotIndex = v;
                    super(3);
                }

                @Override  // kotlin.jvm.functions.Function3
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.invoke(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return Unit.INSTANCE;
                }

                public final void invoke(Applier applier0, SlotWriter slotWriter0, RememberManager rememberManager0) {
                    Intrinsics.checkNotNullParameter(applier0, "$noName_0");
                    Intrinsics.checkNotNullParameter(slotWriter0, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager0, "rememberManager");
                    if(this.$value instanceof RememberObserver) {
                        ComposerImpl.this.abandonSet.add(this.$value);
                        rememberManager0.remembering(((RememberObserver)this.$value));
                    }
                    Object object0 = slotWriter0.set(this.$groupSlotIndex, this.$value);
                    if(object0 instanceof RememberObserver) {
                        rememberManager0.forgetting(((RememberObserver)object0));
                        return;
                    }
                    if(object0 instanceof RecomposeScopeImpl) {
                        CompositionImpl compositionImpl0 = ((RecomposeScopeImpl)object0).getComposition();
                        if(compositionImpl0 != null) {
                            ((RecomposeScopeImpl)object0).setComposition(null);
                            compositionImpl0.setPendingInvalidScopes$runtime_release(true);
                        }
                    }
                }
            });
        }
    }

    private final int updatedNodeCount(int v) {
        if(v < 0) {
            HashMap hashMap0 = this.nodeCountVirtualOverrides;
            if(hashMap0 != null) {
                Integer integer0 = (Integer)hashMap0.get(v);
                return integer0 == null ? 0 : ((int)integer0);
            }
            return 0;
        }
        int[] arr_v = this.nodeCountOverrides;
        if(arr_v != null) {
            int v1 = arr_v[v];
            return v1 < 0 ? this.reader.nodeCount(v) : v1;
        }
        return this.reader.nodeCount(v);
    }

    @Override  // androidx.compose.runtime.Composer
    public void useNode() {
        this.validateNodeExpected();
        if(!this.getInserting() != 0) {
            this.recordDown(this.getNode(this.reader));
            return;
        }
        ComposerKt.composeRuntimeError("useNode() called while inserting");
        throw new KotlinNothingValueException();
    }

    private final void validateNodeExpected() {
        if(this.nodeExpected) {
            this.nodeExpected = false;
            return;
        }
        ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        throw new KotlinNothingValueException();
    }

    private final void validateNodeNotExpected() {
        if(!this.nodeExpected != 0) {
            return;
        }
        ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        throw new KotlinNothingValueException();
    }
}

