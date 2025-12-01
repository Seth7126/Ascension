package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\'\u0010\u0004\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\nø\u0001\u0000¢\u0006\u0002\u0010\u000BJ\b\u0010\u0010\u001A\u00020\bH\u0016J\b\u0010\u0011\u001A\u00020\bH\u0016J\b\u0010\u0012\u001A\u00020\bH\u0016R\u0010\u0010\f\u001A\u0004\u0018\u00010\rX\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u000E\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0004\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\nX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u000F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/LaunchedEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "parentCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "task", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "job", "Lkotlinx/coroutines/Job;", "scope", "Lkotlin/jvm/functions/Function2;", "onAbandoned", "onForgotten", "onRemembered", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LaunchedEffectImpl implements RememberObserver {
    private Job job;
    private final CoroutineScope scope;
    private final Function2 task;

    public LaunchedEffectImpl(CoroutineContext coroutineContext0, Function2 function20) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "parentCoroutineContext");
        Intrinsics.checkNotNullParameter(function20, "task");
        super();
        this.task = function20;
        this.scope = CoroutineScopeKt.CoroutineScope(coroutineContext0);
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Job job0 = this.job;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        this.job = null;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Job job0 = this.job;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        this.job = null;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        Job job0 = this.job;
        if(job0 != null) {
            JobKt__JobKt.cancel$default(job0, "Old job was still running!", null, 2, null);
        }
        this.job = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, this.task, 3, null);
    }
}

