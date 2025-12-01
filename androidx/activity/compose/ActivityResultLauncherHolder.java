package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001F\u0010\n\u001A\u00020\u000B2\b\u0010\f\u001A\u0004\u0018\u00018\u00002\b\u0010\r\u001A\u0004\u0018\u00010\u000E¢\u0006\u0002\u0010\u000FJ\u0006\u0010\u0010\u001A\u00020\u000BR\"\u0010\u0004\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Landroidx/activity/compose/ActivityResultLauncherHolder;", "I", "", "()V", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "getLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "launch", "", "input", "options", "Landroidx/core/app/ActivityOptionsCompat;", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "unregister", "activity-compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ActivityResultLauncherHolder {
    private ActivityResultLauncher launcher;

    public final ActivityResultLauncher getLauncher() {
        return this.launcher;
    }

    public final void launch(Object object0, ActivityOptionsCompat activityOptionsCompat0) {
        Unit unit0;
        ActivityResultLauncher activityResultLauncher0 = this.launcher;
        if(activityResultLauncher0 == null) {
            unit0 = null;
        }
        else {
            activityResultLauncher0.launch(object0, activityOptionsCompat0);
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void setLauncher(ActivityResultLauncher activityResultLauncher0) {
        this.launcher = activityResultLauncher0;
    }

    public final void unregister() {
        Unit unit0;
        ActivityResultLauncher activityResultLauncher0 = this.launcher;
        if(activityResultLauncher0 == null) {
            unit0 = null;
        }
        else {
            activityResultLauncher0.unregister();
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}

