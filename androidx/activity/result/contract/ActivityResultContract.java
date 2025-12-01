package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;

public abstract class ActivityResultContract {
    public static final class SynchronousResult {
        private final Object mValue;

        public SynchronousResult(Object object0) {
            this.mValue = object0;
        }

        public Object getValue() {
            return this.mValue;
        }
    }

    public abstract Intent createIntent(Context arg1, Object arg2);

    public SynchronousResult getSynchronousResult(Context context, Object input) {
        return null;
    }

    public abstract Object parseResult(int arg1, Intent arg2);
}

