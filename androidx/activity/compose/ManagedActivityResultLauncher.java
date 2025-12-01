package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.State;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B/\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0018\u0010\u0006\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001A\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\bH\u0016J\u001F\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00028\u00002\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FH\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001A\u00020\fH\u0017R \u0010\u0006\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/activity/compose/ManagedActivityResultLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "launcher", "Landroidx/activity/compose/ActivityResultLauncherHolder;", "contract", "Landroidx/compose/runtime/State;", "Landroidx/activity/result/contract/ActivityResultContract;", "(Landroidx/activity/compose/ActivityResultLauncherHolder;Landroidx/compose/runtime/State;)V", "getContract", "launch", "", "input", "options", "Landroidx/core/app/ActivityOptionsCompat;", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "unregister", "activity-compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ManagedActivityResultLauncher extends ActivityResultLauncher {
    public static final int $stable = 8;
    private final State contract;
    private final ActivityResultLauncherHolder launcher;

    static {
    }

    public ManagedActivityResultLauncher(ActivityResultLauncherHolder activityResultLauncherHolder0, State state0) {
        Intrinsics.checkNotNullParameter(activityResultLauncherHolder0, "launcher");
        Intrinsics.checkNotNullParameter(state0, "contract");
        super();
        this.launcher = activityResultLauncherHolder0;
        this.contract = state0;
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    public ActivityResultContract getContract() {
        return (ActivityResultContract)this.contract.getValue();
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    public void launch(Object object0, ActivityOptionsCompat activityOptionsCompat0) {
        this.launcher.launch(object0, activityOptionsCompat0);
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    @Deprecated(message = "Registration is automatically handled by rememberLauncherForActivityResult")
    public void unregister() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}

