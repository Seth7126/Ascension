package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\b\u0000\u0018\u0000 ~*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002~\u007FB\'\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u000E\u0010\u0007\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b\u00A2\u0006\u0002\u0010\tB/\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u000E\u0010\u0007\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u000B\u00A2\u0006\u0002\u0010\fJ\u0091\u0001\u0010\u0011\u001A\u00020\u00122\u0081\u0001\u0010\u0013\u001A}\u0012\u001F\u0012\u001D\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00120\u0014H\u0000\u00A2\u0006\u0002\b\u001AJ\u009C\u0001\u0010\u0011\u001A\u00020\u00122\u0081\u0001\u0010\u0013\u001A}\u0012\u001F\u0012\u001D\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0019\u001A\u00020\u00052\u0006\u0010\u0018\u001A\u00020\u0005H\u0002J\u0014\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001CH\u0002J\u0014\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001CH\u0002JO\u0010\u001E\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u0006\u0010\u001F\u001A\u00020\u00052\u0006\u0010 \u001A\u00020\u00052\u0006\u0010!\u001A\u00020\u00052\u0006\u0010\"\u001A\u00028\u00002\u0006\u0010#\u001A\u00028\u00012\u0006\u0010\u0018\u001A\u00020\u00052\b\u0010$\u001A\u0004\u0018\u00010\u000BH\u0002\u00A2\u0006\u0002\u0010%J\b\u0010&\u001A\u00020\u0005H\u0002J\u0015\u0010\'\u001A\u00020(2\u0006\u0010)\u001A\u00028\u0000H\u0002\u00A2\u0006\u0002\u0010*J\u0017\u0010+\u001A\u0004\u0018\u00018\u00012\u0006\u0010)\u001A\u00028\u0000H\u0002\u00A2\u0006\u0002\u0010,J+\u0010-\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001C2\u0006\u0010)\u001A\u00028\u00002\u0006\u0010.\u001A\u00028\u0001H\u0002\u00A2\u0006\u0002\u0010/J#\u00100\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010)\u001A\u00028\u0000H\u0002\u00A2\u0006\u0002\u00101J+\u00100\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010)\u001A\u00028\u00002\u0006\u0010.\u001A\u00028\u0001H\u0002\u00A2\u0006\u0002\u00102J\u001E\u00103\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00104\u001A\u00020\u0005H\u0002J#\u00105\u001A\u00020(2\u0006\u00106\u001A\u00020\u00052\u0006\u0010)\u001A\u00028\u00002\u0006\u0010\u0018\u001A\u00020\u0005\u00A2\u0006\u0002\u00107J\u001C\u00108\u001A\u00020(2\u0012\u00109\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002J\r\u0010:\u001A\u00020\u0005H\u0000\u00A2\u0006\u0002\b;J\u0015\u0010<\u001A\u00020\u00052\u0006\u0010 \u001A\u00020\u0005H\u0000\u00A2\u0006\u0002\b=J%\u0010>\u001A\u0004\u0018\u00018\u00012\u0006\u00106\u001A\u00020\u00052\u0006\u0010)\u001A\u00028\u00002\u0006\u0010\u0018\u001A\u00020\u0005\u00A2\u0006\u0002\u0010?J\u0015\u0010@\u001A\u00020(2\u0006\u0010 \u001A\u00020\u0005H\u0000\u00A2\u0006\u0002\bAJ\u0010\u0010B\u001A\u00020(2\u0006\u0010 \u001A\u00020\u0005H\u0002J1\u0010C\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010 \u001A\u00020\u00052\u0006\u0010)\u001A\u00028\u00002\u0006\u0010.\u001A\u00028\u0001H\u0002\u00A2\u0006\u0002\u0010DJ\u0015\u0010E\u001A\u00028\u00002\u0006\u0010\u001F\u001A\u00020\u0005H\u0002\u00A2\u0006\u0002\u0010FJ[\u0010G\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010H\u001A\u00020\u00052\u0006\u0010I\u001A\u00028\u00002\u0006\u0010J\u001A\u00028\u00012\u0006\u0010K\u001A\u00020\u00052\u0006\u0010L\u001A\u00028\u00002\u0006\u0010M\u001A\u00028\u00012\u0006\u0010\u0018\u001A\u00020\u00052\b\u0010$\u001A\u0004\u0018\u00010\u000BH\u0002\u00A2\u0006\u0002\u0010NJI\u0010O\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001F\u001A\u00020\u00052\u0006\u0010 \u001A\u00020\u00052\u0006\u0010!\u001A\u00020\u00052\u0006\u0010\"\u001A\u00028\u00002\u0006\u0010#\u001A\u00028\u00012\u0006\u0010\u0018\u001A\u00020\u0005H\u0002\u00A2\u0006\u0002\u0010PJ=\u0010Q\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010)\u001A\u00028\u00002\u0006\u0010.\u001A\u00028\u00012\u0012\u0010R\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0002\u00A2\u0006\u0002\u0010TJ8\u0010U\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u00109\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010V\u001A\u00020W2\u0006\u0010$\u001A\u00020\u000BH\u0002J?\u0010X\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010)\u001A\u00028\u00002\u0006\u0010.\u001A\u00028\u00012\u0012\u0010R\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0002\u00A2\u0006\u0002\u0010TJ7\u0010X\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010)\u001A\u00028\u00002\u0012\u0010R\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0002\u00A2\u0006\u0002\u0010YJ2\u0010Z\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00104\u001A\u00020\u00052\u0012\u0010R\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0002J9\u0010[\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010 \u001A\u00020\u00052\u0006\u0010)\u001A\u00028\u00002\u0006\u0010.\u001A\u00028\u00012\u0006\u0010$\u001A\u00020\u000BH\u0002\u00A2\u0006\u0002\u0010\\JQ\u0010]\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001F\u001A\u00020\u00052\u0006\u0010 \u001A\u00020\u00052\u0006\u0010!\u001A\u00020\u00052\u0006\u0010\"\u001A\u00028\u00002\u0006\u0010#\u001A\u00028\u00012\u0006\u0010\u0018\u001A\u00020\u00052\u0006\u0010$\u001A\u00020\u000BH\u0002\u00A2\u0006\u0002\u0010^JK\u0010_\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00106\u001A\u00020\u00052\u0006\u0010)\u001A\u00028\u00002\u0006\u0010.\u001A\u00028\u00012\u0006\u0010\u0018\u001A\u00020\u00052\u0012\u0010R\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010S\u00A2\u0006\u0002\u0010`JJ\u0010a\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u00109\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0018\u001A\u00020\u00052\u0006\u0010V\u001A\u00020W2\u0012\u0010R\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SJT\u0010b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010c\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010 \u001A\u00020\u00052\u0006\u0010\u0018\u001A\u00020\u00052\u0006\u0010V\u001A\u00020W2\u0012\u0010R\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0002JM\u0010d\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00106\u001A\u00020\u00052\u0006\u0010)\u001A\u00028\u00002\u0006\u0010.\u001A\u00028\u00012\u0006\u0010\u0018\u001A\u00020\u00052\u0012\u0010R\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010S\u00A2\u0006\u0002\u0010`JE\u0010d\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00106\u001A\u00020\u00052\u0006\u0010)\u001A\u00028\u00002\u0006\u0010\u0018\u001A\u00020\u00052\u0012\u0010R\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010S\u00A2\u0006\u0002\u0010eJ:\u0010f\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001F\u001A\u00020\u00052\u0006\u0010 \u001A\u00020\u00052\u0012\u0010R\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0002J.\u0010g\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010h\u001A\u00020\u00052\u0006\u0010 \u001A\u00020\u00052\u0006\u0010$\u001A\u00020\u000BH\u0002JX\u0010i\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010j\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010k\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010h\u001A\u00020\u00052\u0006\u0010 \u001A\u00020\u00052\u0006\u0010$\u001A\u00020\u000BH\u0002J8\u0010l\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010h\u001A\u00020\u00052\u0012\u0010k\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010$\u001A\u00020\u000BH\u0002J=\u0010m\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001F\u001A\u00020\u00052\u0006\u0010.\u001A\u00028\u00012\u0012\u0010R\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0002\u00A2\u0006\u0002\u0010nJ!\u0010o\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010h\u001A\u00020\u0005H\u0000\u00A2\u0006\u0002\bpJ\u0015\u0010h\u001A\u00020\u00052\u0006\u0010 \u001A\u00020\u0005H\u0000\u00A2\u0006\u0002\bqJ9\u0010r\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001C2\u0006\u00106\u001A\u00020\u00052\u0006\u0010)\u001A\u00028\u00002\u0006\u0010.\u001A\u00028\u00012\u0006\u0010\u0018\u001A\u00020\u0005\u00A2\u0006\u0002\u0010sJ9\u0010t\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00106\u001A\u00020\u00052\u0006\u0010)\u001A\u00028\u00002\u0006\u0010.\u001A\u00028\u00012\u0006\u0010\u0018\u001A\u00020\u0005\u00A2\u0006\u0002\u0010uJ1\u0010t\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00106\u001A\u00020\u00052\u0006\u0010)\u001A\u00028\u00002\u0006\u0010\u0018\u001A\u00020\u0005\u00A2\u0006\u0002\u0010vJ&\u0010w\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001F\u001A\u00020\u00052\u0006\u0010 \u001A\u00020\u0005H\u0002J&\u0010x\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010h\u001A\u00020\u00052\u0006\u0010 \u001A\u00020\u0005H\u0002JP\u0010y\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010j\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010k\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010h\u001A\u00020\u00052\u0006\u0010 \u001A\u00020\u0005H\u0002J8\u0010z\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010h\u001A\u00020\u00052\u0006\u0010 \u001A\u00020\u00052\u0012\u0010k\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002J)\u0010{\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001F\u001A\u00020\u00052\u0006\u0010.\u001A\u00028\u0001H\u0002\u00A2\u0006\u0002\u0010|J\u0015\u0010}\u001A\u00028\u00012\u0006\u0010\u001F\u001A\u00020\u0005H\u0002\u00A2\u0006\u0002\u0010FR0\u0010\u0007\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u000E\u0010\r\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b@BX\u0080\u000E\u00A2\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u000E\u0010\u000FR\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0005X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010\n\u001A\u0004\u0018\u00010\u000BX\u0082\u0004\u00A2\u0006\u0002\n\u0000\u00A8\u0006\u0080\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", "V", "", "dataMap", "", "nodeMap", "buffer", "", "(II[Ljava/lang/Object;)V", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "(II[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "<set-?>", "getBuffer$runtime_release", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "accept", "", "visitor", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "node", "shift", "hash", "accept$runtime_release", "asInsertResult", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "asUpdateResult", "bufferMoveEntryToNode", "keyIndex", "positionMask", "newKeyHash", "newKey", "newValue", "owner", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)[Ljava/lang/Object;", "calculateSize", "collisionContainsKey", "", "key", "(Ljava/lang/Object;)Z", "collisionGet", "(Ljava/lang/Object;)Ljava/lang/Object;", "collisionPut", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "collisionRemove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionRemoveEntryAtIndex", "i", "containsKey", "keyHash", "(ILjava/lang/Object;I)Z", "elementsIdentityEquals", "otherNode", "entryCount", "entryCount$runtime_release", "entryKeyIndex", "entryKeyIndex$runtime_release", "get", "(ILjava/lang/Object;I)Ljava/lang/Object;", "hasEntryAt", "hasEntryAt$runtime_release", "hasNodeAt", "insertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "keyAtIndex", "(I)Ljava/lang/Object;", "makeNode", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "moveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionPut", "mutator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionPutAll", "intersectionCounter", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutableCollisionRemove", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionRemoveEntryAtIndex", "mutableInsertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutablePutAll", "mutablePutAllFromOtherNodeCell", "other", "mutableRemove", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemoveEntryAtIndex", "mutableRemoveNodeAtIndex", "nodeIndex", "mutableReplaceNode", "targetNode", "newNode", "mutableUpdateNodeAtIndex", "mutableUpdateValueAtIndex", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nodeAtIndex", "nodeAtIndex$runtime_release", "nodeIndex$runtime_release", "put", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "remove", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeEntryAtIndex", "removeNodeAtIndex", "replaceNode", "updateNodeAtIndex", "updateValueAtIndex", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "valueAtKeyIndex", "Companion", "ModificationResult", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TrieNode {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B!\u0012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJD\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002*\u0010\u0010\u001A&\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0011H\u0086\bø\u0001\u0000R&\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", "V", "", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "sizeDelta", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "getNode", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "getSizeDelta", "()I", "replaceNode", "operation", "Lkotlin/Function1;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class ModificationResult {
        private TrieNode node;
        private final int sizeDelta;

        public ModificationResult(TrieNode trieNode0, int v) {
            Intrinsics.checkNotNullParameter(trieNode0, "node");
            super();
            this.node = trieNode0;
            this.sizeDelta = v;
        }

        public final TrieNode getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final ModificationResult replaceNode(Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "operation");
            this.setNode(((TrieNode)function10.invoke(this.getNode())));
            return this;
        }

        public final void setNode(TrieNode trieNode0) {
            Intrinsics.checkNotNullParameter(trieNode0, "<set-?>");
            this.node = trieNode0;
        }
    }

    public static final Companion Companion;
    private static final TrieNode EMPTY;
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;
    private final MutabilityOwnership ownedBy;

    static {
        TrieNode.Companion = new Companion(null);
        TrieNode.EMPTY = new TrieNode(0, 0, new Object[0]);
    }

    public TrieNode(int v, int v1, Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        this(v, v1, arr_object, null);
    }

    public TrieNode(int v, int v1, Object[] arr_object, MutabilityOwnership mutabilityOwnership0) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        super();
        this.dataMap = v;
        this.nodeMap = v1;
        this.ownedBy = mutabilityOwnership0;
        this.buffer = arr_object;
    }

    private final void accept(Function5 function50, int v, int v1) {
        function50.invoke(this, v1, v, this.dataMap, this.nodeMap);
        for(int v2 = this.nodeMap; v2 != 0; v2 -= v3) {
            int v3 = Integer.lowestOneBit(v2);
            this.nodeAtIndex$runtime_release(this.nodeIndex$runtime_release(v3)).accept(function50, (Integer.numberOfTrailingZeros(v3) << v1) + v, v1 + 5);
        }
    }

    public final void accept$runtime_release(Function5 function50) {
        Intrinsics.checkNotNullParameter(function50, "visitor");
        this.accept(function50, 0, 0);
    }

    private final ModificationResult asInsertResult() {
        return new ModificationResult(this, 1);
    }

    private final ModificationResult asUpdateResult() {
        return new ModificationResult(this, 0);
    }

    private final Object[] bufferMoveEntryToNode(int v, int v1, int v2, Object object0, Object object1, int v3, MutabilityOwnership mutabilityOwnership0) {
        Object object2 = this.keyAtIndex(v);
        TrieNode trieNode0 = this.makeNode((object2 == null ? 0 : object2.hashCode()), object2, this.valueAtKeyIndex(v), v2, object0, object1, v3 + 5, mutabilityOwnership0);
        return TrieNodeKt.replaceEntryWithNode(this.buffer, v, this.nodeIndex$runtime_release(v1) + 1, trieNode0);
    }

    private final int calculateSize() {
        if(this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int v = Integer.bitCount(this.dataMap);
        int v1 = v * 2;
        int v2 = this.buffer.length;
        if(v1 < v2) {
            while(true) {
                v += this.nodeAtIndex$runtime_release(v1).calculateSize();
                if(v1 + 1 >= v2) {
                    break;
                }
                ++v1;
            }
        }
        return v;
    }

    private final boolean collisionContainsKey(Object object0) {
        IntProgression intProgression0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int v = intProgression0.getFirst();
        int v1 = intProgression0.getLast();
        int v2 = intProgression0.getStep();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(Intrinsics.areEqual(object0, this.buffer[v])) {
                    return true;
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return false;
    }

    private final Object collisionGet(Object object0) {
        IntProgression intProgression0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int v = intProgression0.getFirst();
        int v1 = intProgression0.getLast();
        int v2 = intProgression0.getStep();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(Intrinsics.areEqual(object0, this.keyAtIndex(v))) {
                    return this.valueAtKeyIndex(v);
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return null;
    }

    private final ModificationResult collisionPut(Object object0, Object object1) {
        IntProgression intProgression0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int v = intProgression0.getFirst();
        int v1 = intProgression0.getLast();
        int v2 = intProgression0.getStep();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(Intrinsics.areEqual(object0, this.keyAtIndex(v))) {
                    if(object1 == this.valueAtKeyIndex(v)) {
                        return null;
                    }
                    Object[] arr_object = Arrays.copyOf(this.buffer, this.buffer.length);
                    Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, size)");
                    arr_object[v + 1] = object1;
                    return new TrieNode(0, 0, arr_object).asUpdateResult();
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return new TrieNode(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, object0, object1)).asInsertResult();
    }

    private final TrieNode collisionRemove(Object object0) {
        IntProgression intProgression0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int v = intProgression0.getFirst();
        int v1 = intProgression0.getLast();
        int v2 = intProgression0.getStep();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(Intrinsics.areEqual(object0, this.keyAtIndex(v))) {
                    return this.collisionRemoveEntryAtIndex(v);
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return this;
    }

    private final TrieNode collisionRemove(Object object0, Object object1) {
        IntProgression intProgression0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int v = intProgression0.getFirst();
        int v1 = intProgression0.getLast();
        int v2 = intProgression0.getStep();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(Intrinsics.areEqual(object0, this.keyAtIndex(v)) && Intrinsics.areEqual(object1, this.valueAtKeyIndex(v))) {
                    return this.collisionRemoveEntryAtIndex(v);
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return this;
    }

    private final TrieNode collisionRemoveEntryAtIndex(int v) {
        return this.buffer.length == 2 ? null : new TrieNode(0, 0, TrieNodeKt.removeEntryAtIndex(this.buffer, v));
    }

    public final boolean containsKey(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$runtime_release(1 << v2)) {
            return Intrinsics.areEqual(object0, this.keyAtIndex(this.entryKeyIndex$runtime_release(1 << v2)));
        }
        if(this.hasNodeAt(1 << v2)) {
            TrieNode trieNode0 = this.nodeAtIndex$runtime_release(this.nodeIndex$runtime_release(1 << v2));
            return v1 == 30 ? trieNode0.collisionContainsKey(object0) : trieNode0.containsKey(v, object0, v1 + 5);
        }
        return false;
    }

    private final boolean elementsIdentityEquals(TrieNode trieNode0) {
        if(this == trieNode0) {
            return true;
        }
        if(this.nodeMap != trieNode0.nodeMap) {
            return false;
        }
        if(this.dataMap != trieNode0.dataMap) {
            return false;
        }
        int v = this.buffer.length;
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                if(this.buffer[v1] != trieNode0.buffer[v1]) {
                    return false;
                }
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        return true;
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.dataMap);
    }

    public final int entryKeyIndex$runtime_release(int v) {
        return Integer.bitCount(v - 1 & this.dataMap) * 2;
    }

    public final Object get(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$runtime_release(1 << v2)) {
            int v3 = this.entryKeyIndex$runtime_release(1 << v2);
            return Intrinsics.areEqual(object0, this.keyAtIndex(v3)) ? this.valueAtKeyIndex(v3) : null;
        }
        if(this.hasNodeAt(1 << v2)) {
            TrieNode trieNode0 = this.nodeAtIndex$runtime_release(this.nodeIndex$runtime_release(1 << v2));
            return v1 == 30 ? trieNode0.collisionGet(object0) : trieNode0.get(v, object0, v1 + 5);
        }
        return null;
    }

    public final Object[] getBuffer$runtime_release() {
        return this.buffer;
    }

    public final boolean hasEntryAt$runtime_release(int v) {
        return (v & this.dataMap) != 0;
    }

    private final boolean hasNodeAt(int v) {
        return (v & this.nodeMap) != 0;
    }

    private final TrieNode insertEntryAt(int v, Object object0, Object object1) {
        Object[] arr_object = TrieNodeKt.insertEntryAtIndex(this.buffer, this.entryKeyIndex$runtime_release(v), object0, object1);
        return new TrieNode(v | this.dataMap, this.nodeMap, arr_object);
    }

    private final Object keyAtIndex(int v) {
        return this.buffer[v];
    }

    private final TrieNode makeNode(int v, Object object0, Object object1, int v1, Object object2, Object object3, int v2, MutabilityOwnership mutabilityOwnership0) {
        if(v2 > 30) {
            return new TrieNode(0, 0, new Object[]{object0, object1, object2, object3}, mutabilityOwnership0);
        }
        int v3 = v >> v2 & 0x1F;
        int v4 = v1 >> v2 & 0x1F;
        if(v3 != v4) {
            return v3 >= v4 ? new TrieNode(1 << v3 | 1 << v4, 0, new Object[]{object2, object3, object0, object1}, mutabilityOwnership0) : new TrieNode(1 << v3 | 1 << v4, 0, new Object[]{object0, object1, object2, object3}, mutabilityOwnership0);
        }
        return new TrieNode(0, 1 << v3, new Object[]{this.makeNode(v, object0, object1, v1, object2, object3, v2 + 5, mutabilityOwnership0)}, mutabilityOwnership0);
    }

    private final TrieNode moveEntryToNode(int v, int v1, int v2, Object object0, Object object1, int v3) {
        Object[] arr_object = this.bufferMoveEntryToNode(v, v1, v2, object0, object1, v3, null);
        return new TrieNode(this.dataMap ^ v1, v1 | this.nodeMap, arr_object);
    }

    private final TrieNode mutableCollisionPut(Object object0, Object object1, PersistentHashMapBuilder persistentHashMapBuilder0) {
        IntProgression intProgression0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int v = intProgression0.getFirst();
        int v1 = intProgression0.getLast();
        int v2 = intProgression0.getStep();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(Intrinsics.areEqual(object0, this.keyAtIndex(v))) {
                    persistentHashMapBuilder0.setOperationResult$runtime_release(this.valueAtKeyIndex(v));
                    if(this.ownedBy == persistentHashMapBuilder0.getOwnership$runtime_release()) {
                        this.buffer[v + 1] = object1;
                        return this;
                    }
                    persistentHashMapBuilder0.setModCount$runtime_release(persistentHashMapBuilder0.getModCount$runtime_release() + 1);
                    Object[] arr_object = Arrays.copyOf(this.buffer, this.buffer.length);
                    Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, size)");
                    arr_object[v + 1] = object1;
                    return new TrieNode(0, 0, arr_object, persistentHashMapBuilder0.getOwnership$runtime_release());
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        persistentHashMapBuilder0.setSize(persistentHashMapBuilder0.size() + 1);
        return new TrieNode(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, object0, object1), persistentHashMapBuilder0.getOwnership$runtime_release());
    }

    private final TrieNode mutableCollisionPutAll(TrieNode trieNode0, DeltaCounter deltaCounter0, MutabilityOwnership mutabilityOwnership0) {
        Object[] arr_object = Arrays.copyOf(this.buffer, this.buffer.length + trieNode0.buffer.length);
        Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, newSize)");
        int v = this.buffer.length;
        IntProgression intProgression0 = RangesKt.step(RangesKt.until(0, trieNode0.buffer.length), 2);
        int v1 = intProgression0.getFirst();
        int v2 = intProgression0.getLast();
        int v3 = intProgression0.getStep();
        if(v3 > 0 && v1 <= v2 || v3 < 0 && v2 <= v1) {
            while(true) {
                if(this.collisionContainsKey(trieNode0.buffer[v1])) {
                    deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                }
                else {
                    Object[] arr_object1 = trieNode0.buffer;
                    arr_object[v] = arr_object1[v1];
                    arr_object[v + 1] = arr_object1[v1 + 1];
                    v += 2;
                }
                if(v1 == v2) {
                    break;
                }
                v1 += v3;
            }
        }
        if(v == this.buffer.length) {
            return this;
        }
        if(v != trieNode0.buffer.length) {
            if(v == arr_object.length) {
                return new TrieNode(0, 0, arr_object, mutabilityOwnership0);
            }
            Object[] arr_object2 = Arrays.copyOf(arr_object, v);
            Intrinsics.checkNotNullExpressionValue(arr_object2, "java.util.Arrays.copyOf(this, newSize)");
            return new TrieNode(0, 0, arr_object2, mutabilityOwnership0);
        }
        return trieNode0;
    }

    private final TrieNode mutableCollisionRemove(Object object0, PersistentHashMapBuilder persistentHashMapBuilder0) {
        IntProgression intProgression0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int v = intProgression0.getFirst();
        int v1 = intProgression0.getLast();
        int v2 = intProgression0.getStep();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(Intrinsics.areEqual(object0, this.keyAtIndex(v))) {
                    return this.mutableCollisionRemoveEntryAtIndex(v, persistentHashMapBuilder0);
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return this;
    }

    private final TrieNode mutableCollisionRemove(Object object0, Object object1, PersistentHashMapBuilder persistentHashMapBuilder0) {
        IntProgression intProgression0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int v = intProgression0.getFirst();
        int v1 = intProgression0.getLast();
        int v2 = intProgression0.getStep();
        if(v2 > 0 && v <= v1 || v2 < 0 && v1 <= v) {
            while(true) {
                if(Intrinsics.areEqual(object0, this.keyAtIndex(v)) && Intrinsics.areEqual(object1, this.valueAtKeyIndex(v))) {
                    return this.mutableCollisionRemoveEntryAtIndex(v, persistentHashMapBuilder0);
                }
                if(v == v1) {
                    break;
                }
                v += v2;
            }
        }
        return this;
    }

    private final TrieNode mutableCollisionRemoveEntryAtIndex(int v, PersistentHashMapBuilder persistentHashMapBuilder0) {
        persistentHashMapBuilder0.setSize(persistentHashMapBuilder0.size() - 1);
        persistentHashMapBuilder0.setOperationResult$runtime_release(this.valueAtKeyIndex(v));
        if(this.buffer.length == 2) {
            return null;
        }
        if(this.ownedBy == persistentHashMapBuilder0.getOwnership$runtime_release()) {
            this.buffer = TrieNodeKt.removeEntryAtIndex(this.buffer, v);
            return this;
        }
        return new TrieNode(0, 0, TrieNodeKt.removeEntryAtIndex(this.buffer, v), persistentHashMapBuilder0.getOwnership$runtime_release());
    }

    private final TrieNode mutableInsertEntryAt(int v, Object object0, Object object1, MutabilityOwnership mutabilityOwnership0) {
        int v1 = this.entryKeyIndex$runtime_release(v);
        if(this.ownedBy == mutabilityOwnership0) {
            this.buffer = TrieNodeKt.insertEntryAtIndex(this.buffer, v1, object0, object1);
            this.dataMap |= v;
            return this;
        }
        Object[] arr_object = TrieNodeKt.insertEntryAtIndex(this.buffer, v1, object0, object1);
        return new TrieNode(v | this.dataMap, this.nodeMap, arr_object, mutabilityOwnership0);
    }

    private final TrieNode mutableMoveEntryToNode(int v, int v1, int v2, Object object0, Object object1, int v3, MutabilityOwnership mutabilityOwnership0) {
        if(this.ownedBy == mutabilityOwnership0) {
            this.buffer = this.bufferMoveEntryToNode(v, v1, v2, object0, object1, v3, mutabilityOwnership0);
            this.dataMap ^= v1;
            this.nodeMap |= v1;
            return this;
        }
        Object[] arr_object = this.bufferMoveEntryToNode(v, v1, v2, object0, object1, v3, mutabilityOwnership0);
        return new TrieNode(this.dataMap ^ v1, v1 | this.nodeMap, arr_object, mutabilityOwnership0);
    }

    public final TrieNode mutablePut(int v, Object object0, Object object1, int v1, PersistentHashMapBuilder persistentHashMapBuilder0) {
        Intrinsics.checkNotNullParameter(persistentHashMapBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$runtime_release(1 << v2)) {
            int v3 = this.entryKeyIndex$runtime_release(1 << v2);
            if(Intrinsics.areEqual(object0, this.keyAtIndex(v3))) {
                persistentHashMapBuilder0.setOperationResult$runtime_release(this.valueAtKeyIndex(v3));
                return this.valueAtKeyIndex(v3) == object1 ? this : this.mutableUpdateValueAtIndex(v3, object1, persistentHashMapBuilder0);
            }
            persistentHashMapBuilder0.setSize(persistentHashMapBuilder0.size() + 1);
            return this.mutableMoveEntryToNode(v3, 1 << v2, v, object0, object1, v1, persistentHashMapBuilder0.getOwnership$runtime_release());
        }
        if(this.hasNodeAt(1 << v2)) {
            int v4 = this.nodeIndex$runtime_release(1 << v2);
            TrieNode trieNode0 = this.nodeAtIndex$runtime_release(v4);
            TrieNode trieNode1 = v1 == 30 ? trieNode0.mutableCollisionPut(object0, object1, persistentHashMapBuilder0) : trieNode0.mutablePut(v, object0, object1, v1 + 5, persistentHashMapBuilder0);
            return trieNode0 == trieNode1 ? this : this.mutableUpdateNodeAtIndex(v4, trieNode1, persistentHashMapBuilder0.getOwnership$runtime_release());
        }
        persistentHashMapBuilder0.setSize(persistentHashMapBuilder0.size() + 1);
        return this.mutableInsertEntryAt(1 << v2, object0, object1, persistentHashMapBuilder0.getOwnership$runtime_release());
    }

    public final TrieNode mutablePutAll(TrieNode trieNode0, int v, DeltaCounter deltaCounter0, PersistentHashMapBuilder persistentHashMapBuilder0) {
        TrieNode trieNode3;
        int v10;
        TrieNode trieNode2;
        int v4;
        Intrinsics.checkNotNullParameter(trieNode0, "otherNode");
        Intrinsics.checkNotNullParameter(deltaCounter0, "intersectionCounter");
        Intrinsics.checkNotNullParameter(persistentHashMapBuilder0, "mutator");
        if(this == trieNode0) {
            deltaCounter0.plusAssign(this.calculateSize());
            return this;
        }
        if(v > 30) {
            return this.mutableCollisionPutAll(trieNode0, deltaCounter0, persistentHashMapBuilder0.getOwnership$runtime_release());
        }
        int v1 = this.nodeMap | trieNode0.nodeMap;
        int v2 = this.dataMap & trieNode0.dataMap;
        int v3 = (this.dataMap ^ trieNode0.dataMap) & ~v1;
        while(true) {
            v4 = 0;
            if(v2 == 0) {
                break;
            }
            int v5 = Integer.lowestOneBit(v2);
            if(Intrinsics.areEqual(this.keyAtIndex(this.entryKeyIndex$runtime_release(v5)), trieNode0.keyAtIndex(trieNode0.entryKeyIndex$runtime_release(v5)))) {
                v3 |= v5;
            }
            else {
                v1 |= v5;
            }
            v2 ^= v5;
        }
        TrieNode trieNode1 = !Intrinsics.areEqual(this.ownedBy, persistentHashMapBuilder0.getOwnership$runtime_release()) || this.dataMap != v3 || this.nodeMap != v1 ? new TrieNode(v3, v1, new Object[Integer.bitCount(v3) * 2 + Integer.bitCount(v1)]) : this;
        int v6 = v1;
        int v7 = 0;
        while(v6 != 0) {
            int v8 = Integer.lowestOneBit(v6);
            int v9 = trieNode1.getBuffer$runtime_release().length - 1 - v7;
            Object[] arr_object = trieNode1.getBuffer$runtime_release();
            if(this.hasNodeAt(v8)) {
                trieNode2 = this.nodeAtIndex$runtime_release(this.nodeIndex$runtime_release(v8)).mutablePutAllFromOtherNodeCell(trieNode0, v8, v, deltaCounter0, persistentHashMapBuilder0);
                v10 = v8;
                trieNode3 = trieNode1;
            }
            else if(trieNode0.hasNodeAt(v8)) {
                trieNode2 = trieNode0.nodeAtIndex$runtime_release(trieNode0.nodeIndex$runtime_release(v8)).mutablePutAllFromOtherNodeCell(this, v8, v, deltaCounter0, persistentHashMapBuilder0);
                v10 = v8;
                trieNode3 = trieNode1;
            }
            else {
                int v11 = this.entryKeyIndex$runtime_release(v8);
                Object object0 = this.keyAtIndex(v11);
                Object object1 = this.valueAtKeyIndex(v11);
                int v12 = trieNode0.entryKeyIndex$runtime_release(v8);
                Object object2 = trieNode0.keyAtIndex(v12);
                v10 = v8;
                trieNode3 = trieNode1;
                trieNode2 = this.makeNode((object0 == null ? 0 : object0.hashCode()), object0, object1, (object2 == null ? 0 : object2.hashCode()), object2, trieNode0.valueAtKeyIndex(v12), v + 5, persistentHashMapBuilder0.getOwnership$runtime_release());
            }
            arr_object[v9] = trieNode2;
            ++v7;
            v6 ^= v10;
            trieNode1 = trieNode3;
        }
        while(v3 != 0) {
            int v13 = Integer.lowestOneBit(v3);
            if(trieNode0.hasEntryAt$runtime_release(v13)) {
                int v15 = trieNode0.entryKeyIndex$runtime_release(v13);
                trieNode1.getBuffer$runtime_release()[v4 * 2] = trieNode0.keyAtIndex(v15);
                trieNode1.getBuffer$runtime_release()[v4 * 2 + 1] = trieNode0.valueAtKeyIndex(v15);
                if(this.hasEntryAt$runtime_release(v13)) {
                    deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                }
            }
            else {
                int v14 = this.entryKeyIndex$runtime_release(v13);
                trieNode1.getBuffer$runtime_release()[v4 * 2] = this.keyAtIndex(v14);
                trieNode1.getBuffer$runtime_release()[v4 * 2 + 1] = this.valueAtKeyIndex(v14);
            }
            ++v4;
            v3 ^= v13;
        }
        if(this.elementsIdentityEquals(trieNode1)) {
            return this;
        }
        return trieNode0.elementsIdentityEquals(trieNode1) ? trieNode0 : trieNode1;
    }

    private final TrieNode mutablePutAllFromOtherNodeCell(TrieNode trieNode0, int v, int v1, DeltaCounter deltaCounter0, PersistentHashMapBuilder persistentHashMapBuilder0) {
        if(trieNode0.hasNodeAt(v)) {
            return this.mutablePutAll(trieNode0.nodeAtIndex$runtime_release(trieNode0.nodeIndex$runtime_release(v)), v1 + 5, deltaCounter0, persistentHashMapBuilder0);
        }
        if(trieNode0.hasEntryAt$runtime_release(v)) {
            int v2 = trieNode0.entryKeyIndex$runtime_release(v);
            Object object0 = trieNode0.keyAtIndex(v2);
            TrieNode trieNode1 = this.mutablePut((object0 == null ? 0 : object0.hashCode()), object0, trieNode0.valueAtKeyIndex(v2), v1 + 5, persistentHashMapBuilder0);
            deltaCounter0.setCount(deltaCounter0.getCount() + 1);
            return trieNode1;
        }
        return this;
    }

    public final TrieNode mutableRemove(int v, Object object0, int v1, PersistentHashMapBuilder persistentHashMapBuilder0) {
        Intrinsics.checkNotNullParameter(persistentHashMapBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$runtime_release(1 << v2)) {
            int v3 = this.entryKeyIndex$runtime_release(1 << v2);
            return Intrinsics.areEqual(object0, this.keyAtIndex(v3)) ? this.mutableRemoveEntryAtIndex(v3, 1 << v2, persistentHashMapBuilder0) : this;
        }
        if(this.hasNodeAt(1 << v2)) {
            int v4 = this.nodeIndex$runtime_release(1 << v2);
            TrieNode trieNode0 = this.nodeAtIndex$runtime_release(v4);
            return v1 == 30 ? this.mutableReplaceNode(trieNode0, trieNode0.mutableCollisionRemove(object0, persistentHashMapBuilder0), v4, 1 << v2, persistentHashMapBuilder0.getOwnership$runtime_release()) : this.mutableReplaceNode(trieNode0, trieNode0.mutableRemove(v, object0, v1 + 5, persistentHashMapBuilder0), v4, 1 << v2, persistentHashMapBuilder0.getOwnership$runtime_release());
        }
        return this;
    }

    public final TrieNode mutableRemove(int v, Object object0, Object object1, int v1, PersistentHashMapBuilder persistentHashMapBuilder0) {
        Intrinsics.checkNotNullParameter(persistentHashMapBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$runtime_release(1 << v2)) {
            int v3 = this.entryKeyIndex$runtime_release(1 << v2);
            return !Intrinsics.areEqual(object0, this.keyAtIndex(v3)) || !Intrinsics.areEqual(object1, this.valueAtKeyIndex(v3)) ? this : this.mutableRemoveEntryAtIndex(v3, 1 << v2, persistentHashMapBuilder0);
        }
        if(this.hasNodeAt(1 << v2)) {
            int v4 = this.nodeIndex$runtime_release(1 << v2);
            TrieNode trieNode0 = this.nodeAtIndex$runtime_release(v4);
            return v1 == 30 ? this.mutableReplaceNode(trieNode0, trieNode0.mutableCollisionRemove(object0, object1, persistentHashMapBuilder0), v4, 1 << v2, persistentHashMapBuilder0.getOwnership$runtime_release()) : this.mutableReplaceNode(trieNode0, trieNode0.mutableRemove(v, object0, object1, v1 + 5, persistentHashMapBuilder0), v4, 1 << v2, persistentHashMapBuilder0.getOwnership$runtime_release());
        }
        return this;
    }

    private final TrieNode mutableRemoveEntryAtIndex(int v, int v1, PersistentHashMapBuilder persistentHashMapBuilder0) {
        persistentHashMapBuilder0.setSize(persistentHashMapBuilder0.size() - 1);
        persistentHashMapBuilder0.setOperationResult$runtime_release(this.valueAtKeyIndex(v));
        if(this.buffer.length == 2) {
            return null;
        }
        if(this.ownedBy == persistentHashMapBuilder0.getOwnership$runtime_release()) {
            this.buffer = TrieNodeKt.removeEntryAtIndex(this.buffer, v);
            this.dataMap ^= v1;
            return this;
        }
        Object[] arr_object = TrieNodeKt.removeEntryAtIndex(this.buffer, v);
        return new TrieNode(v1 ^ this.dataMap, this.nodeMap, arr_object, persistentHashMapBuilder0.getOwnership$runtime_release());
    }

    private final TrieNode mutableRemoveNodeAtIndex(int v, int v1, MutabilityOwnership mutabilityOwnership0) {
        Object[] arr_object = this.buffer;
        if(arr_object.length == 1) {
            return null;
        }
        if(this.ownedBy == mutabilityOwnership0) {
            this.buffer = TrieNodeKt.removeNodeAtIndex(arr_object, v);
            this.nodeMap ^= v1;
            return this;
        }
        Object[] arr_object1 = TrieNodeKt.removeNodeAtIndex(arr_object, v);
        return new TrieNode(this.dataMap, v1 ^ this.nodeMap, arr_object1, mutabilityOwnership0);
    }

    private final TrieNode mutableReplaceNode(TrieNode trieNode0, TrieNode trieNode1, int v, int v1, MutabilityOwnership mutabilityOwnership0) {
        if(trieNode1 == null) {
            return this.mutableRemoveNodeAtIndex(v, v1, mutabilityOwnership0);
        }
        return this.ownedBy == mutabilityOwnership0 || trieNode0 != trieNode1 ? this.mutableUpdateNodeAtIndex(v, trieNode1, mutabilityOwnership0) : this;
    }

    private final TrieNode mutableUpdateNodeAtIndex(int v, TrieNode trieNode0, MutabilityOwnership mutabilityOwnership0) {
        Object[] arr_object = this.buffer;
        if(arr_object.length == 1 && trieNode0.buffer.length == 2 && trieNode0.nodeMap == 0) {
            trieNode0.dataMap = this.nodeMap;
            return trieNode0;
        }
        if(this.ownedBy == mutabilityOwnership0) {
            arr_object[v] = trieNode0;
            return this;
        }
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOf(this, size)");
        arr_object1[v] = trieNode0;
        return new TrieNode(this.dataMap, this.nodeMap, arr_object1, mutabilityOwnership0);
    }

    private final TrieNode mutableUpdateValueAtIndex(int v, Object object0, PersistentHashMapBuilder persistentHashMapBuilder0) {
        if(this.ownedBy == persistentHashMapBuilder0.getOwnership$runtime_release()) {
            this.buffer[v + 1] = object0;
            return this;
        }
        persistentHashMapBuilder0.setModCount$runtime_release(persistentHashMapBuilder0.getModCount$runtime_release() + 1);
        Object[] arr_object = Arrays.copyOf(this.buffer, this.buffer.length);
        Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, size)");
        arr_object[v + 1] = object0;
        return new TrieNode(this.dataMap, this.nodeMap, arr_object, persistentHashMapBuilder0.getOwnership$runtime_release());
    }

    public final TrieNode nodeAtIndex$runtime_release(int v) {
        Object object0 = this.buffer[v];
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        }
        return (TrieNode)object0;
    }

    public final int nodeIndex$runtime_release(int v) {
        return this.buffer.length - 1 - Integer.bitCount(v - 1 & this.nodeMap);
    }

    public final ModificationResult put(int v, Object object0, Object object1, int v1) {
        ModificationResult trieNode$ModificationResult0;
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$runtime_release(1 << v2)) {
            int v3 = this.entryKeyIndex$runtime_release(1 << v2);
            if(Intrinsics.areEqual(object0, this.keyAtIndex(v3))) {
                return this.valueAtKeyIndex(v3) == object1 ? null : this.updateValueAtIndex(v3, object1).asUpdateResult();
            }
            return this.moveEntryToNode(v3, 1 << v2, v, object0, object1, v1).asInsertResult();
        }
        if(this.hasNodeAt(1 << v2)) {
            int v4 = this.nodeIndex$runtime_release(1 << v2);
            TrieNode trieNode0 = this.nodeAtIndex$runtime_release(v4);
            if(v1 == 30) {
                trieNode$ModificationResult0 = trieNode0.collisionPut(object0, object1);
                if(trieNode$ModificationResult0 == null) {
                    return null;
                }
            }
            else {
                trieNode$ModificationResult0 = trieNode0.put(v, object0, object1, v1 + 5);
                if(trieNode$ModificationResult0 == null) {
                    return null;
                }
            }
            trieNode$ModificationResult0.setNode(this.updateNodeAtIndex(v4, 1 << v2, trieNode$ModificationResult0.getNode()));
            return trieNode$ModificationResult0;
        }
        return this.insertEntryAt(1 << v2, object0, object1).asInsertResult();
    }

    public final TrieNode remove(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$runtime_release(1 << v2)) {
            int v3 = this.entryKeyIndex$runtime_release(1 << v2);
            return Intrinsics.areEqual(object0, this.keyAtIndex(v3)) ? this.removeEntryAtIndex(v3, 1 << v2) : this;
        }
        if(this.hasNodeAt(1 << v2)) {
            int v4 = this.nodeIndex$runtime_release(1 << v2);
            TrieNode trieNode0 = this.nodeAtIndex$runtime_release(v4);
            return v1 == 30 ? this.replaceNode(trieNode0, trieNode0.collisionRemove(object0), v4, 1 << v2) : this.replaceNode(trieNode0, trieNode0.remove(v, object0, v1 + 5), v4, 1 << v2);
        }
        return this;
    }

    public final TrieNode remove(int v, Object object0, Object object1, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.hasEntryAt$runtime_release(1 << v2)) {
            int v3 = this.entryKeyIndex$runtime_release(1 << v2);
            return !Intrinsics.areEqual(object0, this.keyAtIndex(v3)) || !Intrinsics.areEqual(object1, this.valueAtKeyIndex(v3)) ? this : this.removeEntryAtIndex(v3, 1 << v2);
        }
        if(this.hasNodeAt(1 << v2)) {
            int v4 = this.nodeIndex$runtime_release(1 << v2);
            TrieNode trieNode0 = this.nodeAtIndex$runtime_release(v4);
            return v1 == 30 ? this.replaceNode(trieNode0, trieNode0.collisionRemove(object0, object1), v4, 1 << v2) : this.replaceNode(trieNode0, trieNode0.remove(v, object0, object1, v1 + 5), v4, 1 << v2);
        }
        return this;
    }

    private final TrieNode removeEntryAtIndex(int v, int v1) {
        Object[] arr_object = this.buffer;
        if(arr_object.length == 2) {
            return null;
        }
        Object[] arr_object1 = TrieNodeKt.removeEntryAtIndex(arr_object, v);
        return new TrieNode(v1 ^ this.dataMap, this.nodeMap, arr_object1);
    }

    private final TrieNode removeNodeAtIndex(int v, int v1) {
        Object[] arr_object = this.buffer;
        if(arr_object.length == 1) {
            return null;
        }
        Object[] arr_object1 = TrieNodeKt.removeNodeAtIndex(arr_object, v);
        return new TrieNode(this.dataMap, v1 ^ this.nodeMap, arr_object1);
    }

    private final TrieNode replaceNode(TrieNode trieNode0, TrieNode trieNode1, int v, int v1) {
        if(trieNode1 == null) {
            return this.removeNodeAtIndex(v, v1);
        }
        return trieNode0 == trieNode1 ? this : this.updateNodeAtIndex(v, v1, trieNode1);
    }

    private final TrieNode updateNodeAtIndex(int v, int v1, TrieNode trieNode0) {
        Object[] arr_object = trieNode0.buffer;
        if(arr_object.length == 2 && trieNode0.nodeMap == 0) {
            if(this.buffer.length == 1) {
                trieNode0.dataMap = this.nodeMap;
                return trieNode0;
            }
            Object[] arr_object1 = TrieNodeKt.replaceNodeWithEntry(this.buffer, v, this.entryKeyIndex$runtime_release(v1), arr_object[0], arr_object[1]);
            return new TrieNode(this.dataMap ^ v1, v1 ^ this.nodeMap, arr_object1);
        }
        Object[] arr_object2 = Arrays.copyOf(this.buffer, this.buffer.length);
        Intrinsics.checkNotNullExpressionValue(arr_object2, "java.util.Arrays.copyOf(this, newSize)");
        arr_object2[v] = trieNode0;
        return new TrieNode(this.dataMap, this.nodeMap, arr_object2);
    }

    private final TrieNode updateValueAtIndex(int v, Object object0) {
        Object[] arr_object = Arrays.copyOf(this.buffer, this.buffer.length);
        Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, size)");
        arr_object[v + 1] = object0;
        return new TrieNode(this.dataMap, this.nodeMap, arr_object);
    }

    private final Object valueAtKeyIndex(int v) {
        return this.buffer[v + 1];
    }
}

