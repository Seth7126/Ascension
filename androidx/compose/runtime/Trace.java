package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001A\u00020\u0005J\u0010\u0010\u0006\u001A\u00020\u00072\b\u0010\b\u001A\u0004\u0018\u00010\u0001¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/Trace;", "", "()V", "beginSection", "name", "", "endSection", "", "token", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Trace {
    public static final Trace INSTANCE;

    static {
        Trace.INSTANCE = new Trace();
    }

    public final Object beginSection(String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        android.os.Trace.beginSection(s);
        return null;
    }

    public final void endSection(Object object0) {
        android.os.Trace.endSection();
    }
}

