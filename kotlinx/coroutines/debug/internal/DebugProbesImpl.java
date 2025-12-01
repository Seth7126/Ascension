package kotlinx.coroutines.debug.internal;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;

@Metadata(d1 = {"\u0000\u00D2\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001B\b\u00C0\u0002\u0018\u00002\u00020\u0013:\u0002\u008F\u0001B\t\b\u0002\u00A2\u0006\u0004\b\u0001\u0010\u0002J3\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0002\u00A2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0013\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F\u00A2\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F\"\b\b\u0000\u0010\u0014*\u00020\u00132\u001C\u0010\u0018\u001A\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00028\u00000\u0015H\u0082\b\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001B\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0002\u00A2\u0006\u0004\b\u001B\u0010\u000EJ\u0013\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u001C0\u000F\u00A2\u0006\u0004\b\u001D\u0010\u0012J)\u0010!\u001A\b\u0012\u0004\u0012\u00020\u001F0\u000F2\u0006\u0010\u001E\u001A\u00020\u00102\f\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001F0\u000F\u00A2\u0006\u0004\b!\u0010\"J5\u0010\'\u001A\b\u0012\u0004\u0012\u00020\u001F0\u000F2\u0006\u0010$\u001A\u00020#2\b\u0010&\u001A\u0004\u0018\u00010%2\f\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001F0\u000FH\u0002\u00A2\u0006\u0004\b\'\u0010(J?\u0010.\u001A\u000E\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0-2\u0006\u0010*\u001A\u00020)2\f\u0010,\u001A\b\u0012\u0004\u0012\u00020\u001F0+2\f\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001F0\u000FH\u0002\u00A2\u0006\u0004\b.\u0010/J3\u00101\u001A\u00020)2\u0006\u00100\u001A\u00020)2\f\u0010,\u001A\b\u0012\u0004\u0012\u00020\u001F0+2\f\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001F0\u000FH\u0002\u00A2\u0006\u0004\b1\u00102J\u001D\u00105\u001A\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\f\u0018\u000103H\u0002\u00A2\u0006\u0004\b5\u00106J\u0015\u00109\u001A\u00020#2\u0006\u00108\u001A\u000207\u00A2\u0006\u0004\b9\u0010:J\r\u0010;\u001A\u00020\f\u00A2\u0006\u0004\b;\u0010\u0002J%\u0010=\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\n2\f\u0010<\u001A\b\u0012\u0004\u0012\u00020\u001F0\u000FH\u0002\u00A2\u0006\u0004\b=\u0010>J\u001B\u0010@\u001A\u00020\f2\n\u0010?\u001A\u0006\u0012\u0002\b\u00030\u0016H\u0002\u00A2\u0006\u0004\b@\u0010AJ)\u0010D\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000\u00A2\u0006\u0004\bB\u0010CJ\u001B\u0010G\u001A\u00020\f2\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u0004H\u0000\u00A2\u0006\u0004\bE\u0010FJ\u001B\u0010I\u001A\u00020\f2\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u0004H\u0000\u00A2\u0006\u0004\bH\u0010FJ\'\u0010L\u001A\b\u0012\u0004\u0012\u00020\u001F0\u000F\"\b\b\u0000\u0010\u0003*\u00020J2\u0006\u0010K\u001A\u00028\u0000H\u0002\u00A2\u0006\u0004\bL\u0010MJ\u000F\u0010N\u001A\u00020\fH\u0002\u00A2\u0006\u0004\bN\u0010\u0002J\u000F\u0010O\u001A\u00020\fH\u0002\u00A2\u0006\u0004\bO\u0010\u0002J\r\u0010P\u001A\u00020\f\u00A2\u0006\u0004\bP\u0010\u0002J\u001F\u0010R\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00020Q2\u0006\u0010$\u001A\u00020#H\u0002\u00A2\u0006\u0004\bR\u0010SJ#\u0010T\u001A\u00020\f2\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010$\u001A\u00020#H\u0002\u00A2\u0006\u0004\bT\u0010UJ/\u0010T\u001A\u00020\f2\n\u0010?\u001A\u0006\u0012\u0002\b\u00030\u00162\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010$\u001A\u00020#H\u0002\u00A2\u0006\u0004\bT\u0010VJ;\u0010^\u001A\u00020\f*\u0002072\u0012\u0010Y\u001A\u000E\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020X0W2\n\u0010\\\u001A\u00060Zj\u0002`[2\u0006\u0010]\u001A\u00020#H\u0002\u00A2\u0006\u0004\b^\u0010_J\u0017\u0010`\u001A\u000204*\u0006\u0012\u0002\b\u00030\u0016H\u0002\u00A2\u0006\u0004\b`\u0010aJ\u001D\u0010?\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0016*\u0006\u0012\u0002\b\u00030\u0004H\u0002\u00A2\u0006\u0004\b?\u0010bJ\u001A\u0010?\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0016*\u00020QH\u0082\u0010\u00A2\u0006\u0004\b?\u0010cJ\u0016\u0010d\u001A\u0004\u0018\u00010Q*\u00020QH\u0082\u0010\u00A2\u0006\u0004\bd\u0010eJ\u001B\u0010f\u001A\u0004\u0018\u00010\u0006*\b\u0012\u0004\u0012\u00020\u001F0\u000FH\u0002\u00A2\u0006\u0004\bf\u0010gR\u0016\u0010h\u001A\u00020#8\u0002@\u0002X\u0082T\u00A2\u0006\u0006\n\u0004\bh\u0010iR\"\u0010k\u001A\u000E\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020X0j8\u0002@\u0002X\u0082\u0004\u00A2\u0006\u0006\n\u0004\bk\u0010lR \u0010p\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160m8B@\u0002X\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\bn\u0010oR&\u0010q\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\u0004\u0012\u0002040j8\u0002@\u0002X\u0082\u0004\u00A2\u0006\u0006\n\u0004\bq\u0010lR\u0016\u0010s\u001A\u00020r8\u0002@\u0002X\u0082\u0004\u00A2\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010v\u001A\u00020u8\u0002@\u0002X\u0082\u0004\u00A2\u0006\u0006\n\u0004\bv\u0010wR$\u0010x\u001A\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\f\u0018\u0001038\u0002@\u0002X\u0082\u0004\u00A2\u0006\u0006\n\u0004\bx\u0010yR\"\u0010z\u001A\u0002048\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bz\u0010{\u001A\u0004\b|\u0010}\"\u0004\b~\u0010\u007FR\u0019\u0010\u0080\u0001\u001A\u00020)8\u0002@\u0002X\u0082\u000E\u00A2\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001A\u0002048@@\u0000X\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0082\u0001\u0010}R&\u0010\u0084\u0001\u001A\u0002048\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0015\n\u0005\b\u0084\u0001\u0010{\u001A\u0005\b\u0085\u0001\u0010}\"\u0005\b\u0086\u0001\u0010\u007FR\u001B\u0010\u0087\u0001\u001A\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000E\u00A2\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R$\u0010\u008C\u0001\u001A\u00020#*\u0002078B@\u0002X\u0082\u0004\u00A2\u0006\u000F\u0012\u0006\b\u008A\u0001\u0010\u008B\u0001\u001A\u0005\b\u0089\u0001\u0010:R\u001D\u0010\u008D\u0001\u001A\u000204*\u00020\u001F8B@\u0002X\u0082\u0004\u00A2\u0006\b\u001A\u0006\b\u008D\u0001\u0010\u008E\u0001\u00A8\u0006\u0090\u0001"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "<init>", "()V", "T", "Lkotlin/coroutines/Continuation;", "completion", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "frame", "createOwner", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/StackTraceFrame;)Lkotlin/coroutines/Continuation;", "Ljava/io/PrintStream;", "out", "", "dumpCoroutines", "(Ljava/io/PrintStream;)V", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "dumpCoroutinesInfo", "()Ljava/util/List;", "", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "Lkotlin/coroutines/CoroutineContext;", "create", "dumpCoroutinesInfoImpl", "(Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "dumpCoroutinesSynchronized", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "dumpDebuggerInfo", "info", "Ljava/lang/StackTraceElement;", "coroutineTrace", "enhanceStackTraceWithThreadDump", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;Ljava/util/List;)Ljava/util/List;", "", "state", "Ljava/lang/Thread;", "thread", "enhanceStackTraceWithThreadDumpImpl", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "", "actualTrace", "Lkotlin/Pair;", "findContinuationStartIndex", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "frameIndex", "findIndexOfFrame", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lkotlin/Function1;", "", "getDynamicAttach", "()Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/Job;", "job", "hierarchyToString", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "install", "frames", "printStackTrace", "(Ljava/io/PrintStream;Ljava/util/List;)V", "owner", "probeCoroutineCompleted", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)V", "probeCoroutineCreated$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "probeCoroutineCreated", "probeCoroutineResumed$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)V", "probeCoroutineResumed", "probeCoroutineSuspended$kotlinx_coroutines_core", "probeCoroutineSuspended", "", "throwable", "sanitizeStackTrace", "(Ljava/lang/Throwable;)Ljava/util/List;", "startWeakRefCleanerThread", "stopWeakRefCleanerThread", "uninstall", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateRunningState", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Ljava/lang/String;)V", "updateState", "(Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;Lkotlin/coroutines/Continuation;Ljava/lang/String;)V", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "indent", "build", "(Lkotlinx/coroutines/Job;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "isFinished", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;)Z", "(Lkotlin/coroutines/Continuation;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "realCaller", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "toStackTraceFrame", "(Ljava/util/List;)Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "ARTIFICIAL_FRAME_MESSAGE", "Ljava/lang/String;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "callerInfoCache", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "getCapturedCoroutines", "()Ljava/util/Set;", "capturedCoroutines", "capturedCoroutinesMap", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "coroutineStateLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "dynamicAttach", "Lkotlin/jvm/functions/Function1;", "enableCreationStackTraces", "Z", "getEnableCreationStackTraces", "()Z", "setEnableCreationStackTraces", "(Z)V", "installations", "I", "isInstalled$kotlinx_coroutines_core", "isInstalled", "sanitizeStackTraces", "getSanitizeStackTraces", "setSanitizeStackTraces", "weakRefCleanerThread", "Ljava/lang/Thread;", "getDebugString", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "debugString", "isInternalMethod", "(Ljava/lang/StackTraceElement;)Z", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DebugProbesImpl {
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B%\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\n\u0010\u0010\u001A\u0004\u0018\u00010\u0011H\u0016J\u001E\u0010\u0012\u001A\u00020\u00132\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001A\u00020\u0018H\u0016R\u0016\u0010\t\u001A\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u0012\u0010\f\u001A\u00020\rX\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001A\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001A\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "info", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "frame", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class CoroutineOwner implements Continuation, CoroutineStackFrame {
        public final Continuation delegate;
        private final CoroutineStackFrame frame;
        public final DebugCoroutineInfoImpl info;

        public CoroutineOwner(Continuation continuation0, DebugCoroutineInfoImpl debugCoroutineInfoImpl0, CoroutineStackFrame coroutineStackFrame0) {
            this.delegate = continuation0;
            this.info = debugCoroutineInfoImpl0;
            this.frame = coroutineStackFrame0;
        }

        @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public CoroutineStackFrame getCallerFrame() {
            return this.frame == null ? null : this.frame.getCallerFrame();
        }

        @Override  // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.delegate.getContext();
        }

        @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public StackTraceElement getStackTraceElement() {
            return this.frame == null ? null : this.frame.getStackTraceElement();
        }

        @Override  // kotlin.coroutines.Continuation
        public void resumeWith(Object object0) {
            DebugProbesImpl.INSTANCE.probeCoroutineCompleted(this);
            this.delegate.resumeWith(object0);
        }

        @Override
        public String toString() {
            return this.delegate.toString();
        }
    }

    private static final String ARTIFICIAL_FRAME_MESSAGE = "Coroutine creation stacktrace";
    public static final DebugProbesImpl INSTANCE;
    private static final ConcurrentWeakMap callerInfoCache;
    private static final ConcurrentWeakMap capturedCoroutinesMap;
    private static final ReentrantReadWriteLock coroutineStateLock;
    private static final SimpleDateFormat dateFormat;
    private static final DebugProbesImpl.SequenceNumberRefVolatile debugProbesImpl$SequenceNumberRefVolatile;
    private static final Function1 dynamicAttach;
    private static boolean enableCreationStackTraces;
    private static volatile int installations;
    private static boolean sanitizeStackTraces;
    private static final AtomicLongFieldUpdater sequenceNumber$FU;
    private static Thread weakRefCleanerThread;

    static {
        DebugProbesImpl debugProbesImpl0 = new DebugProbesImpl();
        DebugProbesImpl.INSTANCE = debugProbesImpl0;
        DebugProbesImpl.dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        DebugProbesImpl.capturedCoroutinesMap = new ConcurrentWeakMap(false, 1, null);
        DebugProbesImpl.debugProbesImpl$SequenceNumberRefVolatile = new DebugProbesImpl.SequenceNumberRefVolatile(0L);
        DebugProbesImpl.coroutineStateLock = new ReentrantReadWriteLock();
        DebugProbesImpl.sanitizeStackTraces = true;
        DebugProbesImpl.enableCreationStackTraces = true;
        DebugProbesImpl.dynamicAttach = debugProbesImpl0.getDynamicAttach();
        DebugProbesImpl.callerInfoCache = new ConcurrentWeakMap(true);
        DebugProbesImpl.sequenceNumber$FU = AtomicLongFieldUpdater.newUpdater(DebugProbesImpl.SequenceNumberRefVolatile.class, "sequenceNumber");
    }

    public static final Set access$getCapturedCoroutines(DebugProbesImpl debugProbesImpl0) {
        return debugProbesImpl0.getCapturedCoroutines();
    }

    private final void build(Job job0, Map map0, StringBuilder stringBuilder0, String s) {
        DebugCoroutineInfoImpl debugCoroutineInfoImpl0 = (DebugCoroutineInfoImpl)map0.get(job0);
        if(debugCoroutineInfoImpl0 != null) {
            StackTraceElement stackTraceElement0 = (StackTraceElement)CollectionsKt.firstOrNull(debugCoroutineInfoImpl0.lastObservedStackTrace());
            stringBuilder0.append(s + this.getDebugString(job0) + ", continuation is " + debugCoroutineInfoImpl0.getState() + " at line " + stackTraceElement0 + '\n');
            s = s + "\t";
        }
        else if(!(job0 instanceof ScopeCoroutine)) {
            stringBuilder0.append(s + this.getDebugString(job0) + '\n');
            s = s + "\t";
        }
        for(Object object0: job0.getChildren()) {
            this.build(((Job)object0), map0, stringBuilder0, s);
        }
    }

    // 去混淆评级： 中等(60)
    private final Continuation createOwner(Continuation continuation0, StackTraceFrame stackTraceFrame0) {
        return continuation0;
    }

    public final void dumpCoroutines(PrintStream printStream0) {
        synchronized(printStream0) {
            DebugProbesImpl.INSTANCE.dumpCoroutinesSynchronized(printStream0);
        }
    }

    public final List dumpCoroutinesInfo() {
        ReentrantReadWriteLock reentrantReadWriteLock0 = DebugProbesImpl.coroutineStateLock;
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = reentrantReadWriteLock0.readLock();
        int v1 = reentrantReadWriteLock0.getWriteHoldCount() == 0 ? reentrantReadWriteLock0.getReadHoldCount() : 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            reentrantReadWriteLock$ReadLock0.unlock();
        }
        ReentrantReadWriteLock.WriteLock reentrantReadWriteLock$WriteLock0 = reentrantReadWriteLock0.writeLock();
        reentrantReadWriteLock$WriteLock0.lock();
        try {
            throw new IllegalStateException("Debug probes are not installed");
        }
        catch(Throwable throwable0) {
            for(int v = 0; v < v1; ++v) {
                reentrantReadWriteLock$ReadLock0.lock();
            }
            reentrantReadWriteLock$WriteLock0.unlock();
            throw throwable0;
        }
    }

    private final List dumpCoroutinesInfoImpl(Function2 function20) {
        ReentrantReadWriteLock reentrantReadWriteLock0 = DebugProbesImpl.coroutineStateLock;
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = reentrantReadWriteLock0.readLock();
        int v1 = reentrantReadWriteLock0.getWriteHoldCount() == 0 ? reentrantReadWriteLock0.getReadHoldCount() : 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            reentrantReadWriteLock$ReadLock0.unlock();
        }
        ReentrantReadWriteLock.WriteLock reentrantReadWriteLock$WriteLock0 = reentrantReadWriteLock0.writeLock();
        reentrantReadWriteLock$WriteLock0.lock();
        try {
            throw new IllegalStateException("Debug probes are not installed");
        }
        catch(Throwable throwable0) {
            for(int v = 0; v < v1; ++v) {
                reentrantReadWriteLock$ReadLock0.lock();
            }
            reentrantReadWriteLock$WriteLock0.unlock();
            throw throwable0;
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000E\u0010\u0003\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000E\u0010\u0005\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 5, 1})
        public final class kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesInfoImpl.lambda-14..inlined.sortedBy.1 implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return ComparisonsKt.compareValues(((CoroutineOwner)object0).info.sequenceNumber, ((CoroutineOwner)object1).info.sequenceNumber);
            }
        }

    }

    private final void dumpCoroutinesSynchronized(PrintStream printStream0) {
        ReentrantReadWriteLock reentrantReadWriteLock0 = DebugProbesImpl.coroutineStateLock;
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = reentrantReadWriteLock0.readLock();
        int v1 = reentrantReadWriteLock0.getWriteHoldCount() == 0 ? reentrantReadWriteLock0.getReadHoldCount() : 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            reentrantReadWriteLock$ReadLock0.unlock();
        }
        ReentrantReadWriteLock.WriteLock reentrantReadWriteLock$WriteLock0 = reentrantReadWriteLock0.writeLock();
        reentrantReadWriteLock$WriteLock0.lock();
        try {
            throw new IllegalStateException("Debug probes are not installed");
        }
        catch(Throwable throwable0) {
            for(int v = 0; v < v1; ++v) {
                reentrantReadWriteLock$ReadLock0.lock();
            }
            reentrantReadWriteLock$WriteLock0.unlock();
            throw throwable0;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u0010\u0003\u001A\u00020\u00022\n\u0010\u0001\u001A\u0006\u0012\u0002\b\u00030\u0000H\n"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesSynchronized.1.2 extends Lambda implements Function1 {
            public static final kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesSynchronized.1.2 INSTANCE;

            static {
                kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesSynchronized.1.2.INSTANCE = new kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesSynchronized.1.2();
            }

            kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesSynchronized.1.2() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(((CoroutineOwner)object0)));
            }

            public final boolean invoke(CoroutineOwner debugProbesImpl$CoroutineOwner0) {
                return !DebugProbesImpl.INSTANCE.isFinished(debugProbesImpl$CoroutineOwner0);
            }
        }


        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000E\u0010\u0003\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000E\u0010\u0005\u001A\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 5, 1})
        public final class kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesSynchronized.lambda-21..inlined.sortedBy.1 implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return ComparisonsKt.compareValues(((CoroutineOwner)object0).info.sequenceNumber, ((CoroutineOwner)object1).info.sequenceNumber);
            }
        }

    }

    public final List dumpDebuggerInfo() {
        ReentrantReadWriteLock reentrantReadWriteLock0 = DebugProbesImpl.coroutineStateLock;
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = reentrantReadWriteLock0.readLock();
        int v1 = reentrantReadWriteLock0.getWriteHoldCount() == 0 ? reentrantReadWriteLock0.getReadHoldCount() : 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            reentrantReadWriteLock$ReadLock0.unlock();
        }
        ReentrantReadWriteLock.WriteLock reentrantReadWriteLock$WriteLock0 = reentrantReadWriteLock0.writeLock();
        reentrantReadWriteLock$WriteLock0.lock();
        try {
            throw new IllegalStateException("Debug probes are not installed");
        }
        catch(Throwable throwable0) {
            for(int v = 0; v < v1; ++v) {
                reentrantReadWriteLock$ReadLock0.lock();
            }
            reentrantReadWriteLock$WriteLock0.unlock();
            throw throwable0;
        }
    }

    public final List enhanceStackTraceWithThreadDump(DebugCoroutineInfo debugCoroutineInfo0, List list0) {
        return this.enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfo0.getState(), debugCoroutineInfo0.getLastObservedThread(), list0);
    }

    private final List enhanceStackTraceWithThreadDumpImpl(String s, Thread thread0, List list0) {
        Object object0;
        if(Intrinsics.areEqual(s, "RUNNING") && thread0 != null) {
            try {
                object0 = Result.constructor-impl(thread0.getStackTrace());
            }
            catch(Throwable throwable0) {
                object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
            }
            if(Result.isFailure-impl(object0)) {
                object0 = null;
            }
            if(((StackTraceElement[])object0) == null) {
                return list0;
            }
            int v1;
            for(v1 = 0; true; ++v1) {
                if(v1 >= ((StackTraceElement[])object0).length) {
                    v1 = -1;
                    break;
                }
                StackTraceElement stackTraceElement0 = ((StackTraceElement[])object0)[v1];
                if(Intrinsics.areEqual(stackTraceElement0.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && Intrinsics.areEqual(stackTraceElement0.getMethodName(), "resumeWith") && Intrinsics.areEqual(stackTraceElement0.getFileName(), "ContinuationImpl.kt")) {
                    break;
                }
            }
            Pair pair0 = this.findContinuationStartIndex(v1, ((StackTraceElement[])object0), list0);
            int v2 = ((Number)pair0.component1()).intValue();
            int v3 = ((Number)pair0.component2()).intValue();
            if(v2 == -1) {
                return list0;
            }
            ArrayList arrayList0 = new ArrayList(list0.size() + v1 - v2 - 1 - v3);
            int v4 = v1 - v3;
            if(v4 > 0) {
                for(int v = 0; true; ++v) {
                    arrayList0.add(((StackTraceElement[])object0)[v]);
                    if(v + 1 >= v4) {
                        break;
                    }
                }
            }
            int v5 = v2 + 1;
            int v6 = list0.size();
            if(v5 < v6) {
                while(true) {
                    arrayList0.add(list0.get(v5));
                    if(v5 + 1 >= v6) {
                        break;
                    }
                    ++v5;
                }
            }
            return arrayList0;
        }
        return list0;
    }

    private final Pair findContinuationStartIndex(int v, StackTraceElement[] arr_stackTraceElement, List list0) {
        for(int v1 = 0; v1 < 3; ++v1) {
            int v2 = DebugProbesImpl.INSTANCE.findIndexOfFrame(v - 1 - v1, arr_stackTraceElement, list0);
            if(v2 != -1) {
                return TuplesKt.to(v2, v1);
            }
        }
        return TuplesKt.to(-1, 0);
    }

    private final int findIndexOfFrame(int v, StackTraceElement[] arr_stackTraceElement, List list0) {
        StackTraceElement stackTraceElement0 = (StackTraceElement)ArraysKt.getOrNull(arr_stackTraceElement, v);
        if(stackTraceElement0 == null) {
            return -1;
        }
        int v1 = 0;
        for(Object object0: list0) {
            StackTraceElement stackTraceElement1 = (StackTraceElement)object0;
            if(Intrinsics.areEqual(stackTraceElement1.getFileName(), stackTraceElement0.getFileName()) && Intrinsics.areEqual(stackTraceElement1.getClassName(), stackTraceElement0.getClassName()) && Intrinsics.areEqual(stackTraceElement1.getMethodName(), stackTraceElement0.getMethodName())) {
                return v1;
            }
            ++v1;
        }
        return -1;
    }

    private final Set getCapturedCoroutines() {
        return DebugProbesImpl.capturedCoroutinesMap.keySet();
    }

    // 去混淆评级： 低(20)
    private final String getDebugString(Job job0) {
        return job0 instanceof JobSupport ? ((JobSupport)job0).toDebugString() : job0.toString();
    }

    private static void getDebugString$annotations(Job job0) {
    }

    private final Function1 getDynamicAttach() {
        Object object1;
        try {
            Object object0 = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance();
            if(object0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            }
            object1 = Result.constructor-impl(((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object0, 1)));
        }
        catch(Throwable throwable0) {
            object1 = Result.constructor-impl(ResultKt.createFailure(throwable0));
        }
        if(Result.isFailure-impl(object1)) {
            object1 = null;
        }
        return (Function1)object1;
    }

    public final boolean getEnableCreationStackTraces() [...] // 潜在的解密器

    public final boolean getSanitizeStackTraces() {
        return DebugProbesImpl.sanitizeStackTraces;
    }

    public final String hierarchyToString(Job job0) {
        ReentrantReadWriteLock reentrantReadWriteLock0 = DebugProbesImpl.coroutineStateLock;
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = reentrantReadWriteLock0.readLock();
        int v1 = reentrantReadWriteLock0.getWriteHoldCount() == 0 ? reentrantReadWriteLock0.getReadHoldCount() : 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            reentrantReadWriteLock$ReadLock0.unlock();
        }
        ReentrantReadWriteLock.WriteLock reentrantReadWriteLock$WriteLock0 = reentrantReadWriteLock0.writeLock();
        reentrantReadWriteLock$WriteLock0.lock();
        try {
            throw new IllegalStateException("Debug probes are not installed");
        }
        catch(Throwable throwable0) {
            for(int v = 0; v < v1; ++v) {
                reentrantReadWriteLock$ReadLock0.lock();
            }
            reentrantReadWriteLock$WriteLock0.unlock();
            throw throwable0;
        }
    }

    public final void install() {
        ReentrantReadWriteLock reentrantReadWriteLock0 = DebugProbesImpl.coroutineStateLock;
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = reentrantReadWriteLock0.readLock();
        int v1 = reentrantReadWriteLock0.getWriteHoldCount() == 0 ? reentrantReadWriteLock0.getReadHoldCount() : 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            reentrantReadWriteLock$ReadLock0.unlock();
        }
        ReentrantReadWriteLock.WriteLock reentrantReadWriteLock$WriteLock0 = reentrantReadWriteLock0.writeLock();
        reentrantReadWriteLock$WriteLock0.lock();
        try {
            DebugProbesImpl.installations = 1;
            DebugProbesImpl.INSTANCE.startWeakRefCleanerThread();
            Function1 function10 = DebugProbesImpl.dynamicAttach;
            if(function10 != null) {
                function10.invoke(Boolean.TRUE);
            }
        }
        finally {
            for(int v = 0; v < v1; ++v) {
                reentrantReadWriteLock$ReadLock0.lock();
            }
            reentrantReadWriteLock$WriteLock0.unlock();
        }
    }

    private final boolean isFinished(CoroutineOwner debugProbesImpl$CoroutineOwner0) {
        CoroutineContext coroutineContext0 = debugProbesImpl$CoroutineOwner0.info.getContext();
        Job job0 = coroutineContext0 == null ? null : ((Job)coroutineContext0.get(Job.Key));
        if(job0 == null) {
            return false;
        }
        if(!job0.isCompleted()) {
            return false;
        }
        DebugProbesImpl.capturedCoroutinesMap.remove(debugProbesImpl$CoroutineOwner0);
        return true;
    }

    public final boolean isInstalled$kotlinx_coroutines_core() [...] // 潜在的解密器

    private final boolean isInternalMethod(StackTraceElement stackTraceElement0) {
        return StringsKt.startsWith$default(stackTraceElement0.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    private final CoroutineOwner owner(Continuation continuation0) {
        CoroutineStackFrame coroutineStackFrame0 = continuation0 instanceof CoroutineStackFrame ? ((CoroutineStackFrame)continuation0) : null;
        return coroutineStackFrame0 == null ? null : this.owner(coroutineStackFrame0);
    }

    private final CoroutineOwner owner(CoroutineStackFrame coroutineStackFrame0) {
        do {
            if(coroutineStackFrame0 instanceof CoroutineOwner) {
                return (CoroutineOwner)coroutineStackFrame0;
            }
            coroutineStackFrame0 = coroutineStackFrame0.getCallerFrame();
        }
        while(coroutineStackFrame0 != null);
        return null;
    }

    private final void printStackTrace(PrintStream printStream0, List list0) {
        for(Object object0: list0) {
            printStream0.print(Intrinsics.stringPlus("\n\tat ", ((StackTraceElement)object0)));
        }
    }

    private final void probeCoroutineCompleted(CoroutineOwner debugProbesImpl$CoroutineOwner0) {
        DebugProbesImpl.capturedCoroutinesMap.remove(debugProbesImpl$CoroutineOwner0);
        CoroutineStackFrame coroutineStackFrame0 = debugProbesImpl$CoroutineOwner0.info.getLastObservedFrame$kotlinx_coroutines_core();
        CoroutineStackFrame coroutineStackFrame1 = coroutineStackFrame0 == null ? null : this.realCaller(coroutineStackFrame0);
        if(coroutineStackFrame1 == null) {
            return;
        }
        DebugProbesImpl.callerInfoCache.remove(coroutineStackFrame1);
    }

    // 去混淆评级： 中等(50)
    public final Continuation probeCoroutineCreated$kotlinx_coroutines_core(Continuation continuation0) {
        return continuation0;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(Continuation continuation0) {
        this.updateState(continuation0, "RUNNING");
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(Continuation continuation0) {
        this.updateState(continuation0, "SUSPENDED");
    }

    private final CoroutineStackFrame realCaller(CoroutineStackFrame coroutineStackFrame0) {
        do {
            coroutineStackFrame0 = coroutineStackFrame0.getCallerFrame();
            if(coroutineStackFrame0 == null) {
                return null;
            }
        }
        while(coroutineStackFrame0.getStackTraceElement() == null);
        return coroutineStackFrame0;
    }

    private final List sanitizeStackTrace(Throwable throwable0) {
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        int v = -1;
        for(int v1 = arr_stackTraceElement.length - 1; v1 >= 0; --v1) {
            if(Intrinsics.areEqual(arr_stackTraceElement[v1].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                v = v1;
                break;
            }
        }
        if(!DebugProbesImpl.sanitizeStackTraces) {
            int v2 = arr_stackTraceElement.length - v;
            ArrayList arrayList0 = new ArrayList(v2);
            for(int v3 = 0; v3 < v2; ++v3) {
                arrayList0.add((v3 == 0 ? StackTraceRecoveryKt.artificialFrame("Coroutine creation stacktrace") : arr_stackTraceElement[v3 + v]));
            }
            return arrayList0;
        }
        ArrayList arrayList1 = new ArrayList(arr_stackTraceElement.length - v + 1);
        arrayList1.add(StackTraceRecoveryKt.artificialFrame("Coroutine creation stacktrace"));
    alab1:
        while(true) {
            ++v;
            while(true) {
                if(v >= arr_stackTraceElement.length) {
                    break alab1;
                }
                if(!this.isInternalMethod(arr_stackTraceElement[v])) {
                    arrayList1.add(arr_stackTraceElement[v]);
                    break;
                }
                arrayList1.add(arr_stackTraceElement[v]);
                int v4;
                for(v4 = v + 1; v4 < arr_stackTraceElement.length && this.isInternalMethod(arr_stackTraceElement[v4]); ++v4) {
                }
                int v5;
                for(v5 = v4 - 1; v5 > v && arr_stackTraceElement[v5].getFileName() == null; --v5) {
                }
                if(v5 > v && v5 < v4 - 1) {
                    arrayList1.add(arr_stackTraceElement[v5]);
                }
                arrayList1.add(arr_stackTraceElement[v4 - 1]);
                v = v4;
            }
        }
        return arrayList1;
    }

    public final void setEnableCreationStackTraces(boolean z) {
        DebugProbesImpl.enableCreationStackTraces = z;
    }

    public final void setSanitizeStackTraces(boolean z) {
        DebugProbesImpl.sanitizeStackTraces = z;
    }

    private final void startWeakRefCleanerThread() {
        DebugProbesImpl.weakRefCleanerThread = ThreadsKt.thread$default(false, true, null, "Coroutines Debugger Cleaner", 0, kotlinx.coroutines.debug.internal.DebugProbesImpl.startWeakRefCleanerThread.1.INSTANCE, 21, null);

        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class kotlinx.coroutines.debug.internal.DebugProbesImpl.startWeakRefCleanerThread.1 extends Lambda implements Function0 {
            public static final kotlinx.coroutines.debug.internal.DebugProbesImpl.startWeakRefCleanerThread.1 INSTANCE;

            static {
                kotlinx.coroutines.debug.internal.DebugProbesImpl.startWeakRefCleanerThread.1.INSTANCE = new kotlinx.coroutines.debug.internal.DebugProbesImpl.startWeakRefCleanerThread.1();
            }

            kotlinx.coroutines.debug.internal.DebugProbesImpl.startWeakRefCleanerThread.1() {
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                DebugProbesImpl.callerInfoCache.runWeakRefQueueCleaningLoopUntilInterrupted();
            }
        }

    }

    private final void stopWeakRefCleanerThread() {
        Thread thread0 = DebugProbesImpl.weakRefCleanerThread;
        if(thread0 != null) {
            thread0.interrupt();
        }
        DebugProbesImpl.weakRefCleanerThread = null;
    }

    private final StackTraceFrame toStackTraceFrame(List list0) {
        StackTraceFrame stackTraceFrame0 = null;
        if(!list0.isEmpty()) {
            ListIterator listIterator0 = list0.listIterator(list0.size());
            while(listIterator0.hasPrevious()) {
                stackTraceFrame0 = new StackTraceFrame(stackTraceFrame0, ((StackTraceElement)listIterator0.previous()));
            }
        }
        return stackTraceFrame0;
    }

    public final void uninstall() {
        ReentrantReadWriteLock reentrantReadWriteLock0 = DebugProbesImpl.coroutineStateLock;
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = reentrantReadWriteLock0.readLock();
        int v1 = reentrantReadWriteLock0.getWriteHoldCount() == 0 ? reentrantReadWriteLock0.getReadHoldCount() : 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            reentrantReadWriteLock$ReadLock0.unlock();
        }
        ReentrantReadWriteLock.WriteLock reentrantReadWriteLock$WriteLock0 = reentrantReadWriteLock0.writeLock();
        reentrantReadWriteLock$WriteLock0.lock();
        try {
            throw new IllegalStateException("Agent was not installed");
        }
        catch(Throwable throwable0) {
            for(int v = 0; v < v1; ++v) {
                reentrantReadWriteLock$ReadLock0.lock();
            }
            reentrantReadWriteLock$WriteLock0.unlock();
            throw throwable0;
        }
    }

    private final void updateRunningState(CoroutineStackFrame coroutineStackFrame0, String s) {
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = DebugProbesImpl.coroutineStateLock.readLock();
        reentrantReadWriteLock$ReadLock0.lock();
        reentrantReadWriteLock$ReadLock0.unlock();
    }

    // 去混淆评级： 中等(70)
    private final void updateState(Continuation continuation0, String s) {
    }

    private final void updateState(CoroutineOwner debugProbesImpl$CoroutineOwner0, Continuation continuation0, String s) {
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = DebugProbesImpl.coroutineStateLock.readLock();
        reentrantReadWriteLock$ReadLock0.lock();
        reentrantReadWriteLock$ReadLock0.unlock();
    }
}

