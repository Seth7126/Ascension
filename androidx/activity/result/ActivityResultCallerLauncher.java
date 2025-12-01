package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B/\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\b\u001A\u00028\u0000¢\u0006\u0002\u0010\tJ\u0014\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J!\u0010\u0016\u001A\u00020\u00042\b\u0010\u0017\u001A\u0004\u0018\u00010\u00042\b\u0010\u0018\u001A\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001AJ\b\u0010\u001B\u001A\u00020\u0004H\u0016R\u001D\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0013\u0010\b\u001A\u00028\u0000¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\'\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0012\u0010\u000B¨\u0006\u001C"}, d2 = {"Landroidx/activity/result/ActivityResultCallerLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "", "launcher", "callerContract", "Landroidx/activity/result/contract/ActivityResultContract;", "input", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;)V", "getCallerContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "getInput", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "resultContract", "getResultContract", "resultContract$delegate", "Lkotlin/Lazy;", "getContract", "launch", "void", "options", "Landroidx/core/app/ActivityOptionsCompat;", "(Lkotlin/Unit;Landroidx/core/app/ActivityOptionsCompat;)V", "unregister", "activity-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ActivityResultCallerLauncher extends ActivityResultLauncher {
    private final ActivityResultContract callerContract;
    private final Object input;
    private final ActivityResultLauncher launcher;
    private final Lazy resultContract$delegate;

    static {
    }

    public ActivityResultCallerLauncher(ActivityResultLauncher activityResultLauncher0, ActivityResultContract activityResultContract0, Object object0) {
        Intrinsics.checkNotNullParameter(activityResultLauncher0, "launcher");
        Intrinsics.checkNotNullParameter(activityResultContract0, "callerContract");
        super();
        this.launcher = activityResultLauncher0;
        this.callerContract = activityResultContract0;
        this.input = object0;
        this.resultContract$delegate = LazyKt.lazy(new Function0() {
            {
                ActivityResultCallerLauncher.this = activityResultCallerLauncher0;
                super(0);
            }

            public final androidx.activity.result.ActivityResultCallerLauncher.resultContract.2.1 invoke() {
                return new ActivityResultContract() {
                    @Override  // androidx.activity.result.contract.ActivityResultContract
                    public Intent createIntent(Context context0, Object object0) {
                        return this.createIntent(context0, ((Unit)object0));
                    }

                    public Intent createIntent(Context context0, Unit unit0) {
                        Intrinsics.checkNotNullParameter(context0, "context");
                        Object object0 = ActivityResultCallerLauncher.this.getInput();
                        Intent intent0 = ActivityResultCallerLauncher.this.getCallerContract().createIntent(context0, object0);
                        Intrinsics.checkNotNullExpressionValue(intent0, "callerContract.createIntent(context, input)");
                        return intent0;
                    }

                    @Override  // androidx.activity.result.contract.ActivityResultContract
                    public Object parseResult(int v, Intent intent0) {
                        return ActivityResultCallerLauncher.this.getCallerContract().parseResult(v, intent0);
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
    }

    public final ActivityResultContract getCallerContract() {
        return this.callerContract;
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    public ActivityResultContract getContract() {
        return this.getResultContract();
    }

    public final Object getInput() {
        return this.input;
    }

    public final ActivityResultLauncher getLauncher() {
        return this.launcher;
    }

    public final ActivityResultContract getResultContract() {
        return (ActivityResultContract)this.resultContract$delegate.getValue();
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    public void launch(Object object0, ActivityOptionsCompat activityOptionsCompat0) {
        this.launch(((Unit)object0), activityOptionsCompat0);
    }

    public void launch(Unit unit0, ActivityOptionsCompat activityOptionsCompat0) {
        this.launcher.launch(this.input, activityOptionsCompat0);
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        this.launcher.unregister();
    }
}

