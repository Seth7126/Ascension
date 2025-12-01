package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\b\u0010\f\u001A\u00020\rH\u0007\u001A)\u0010\u000E\u001A\b\u0012\u0004\u0012\u0002H\u00100\u000F\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001A\u00020\b2\u0006\u0010\u0012\u001A\u0002H\u0010H\u0007¢\u0006\u0002\u0010\u0013\u001A\u001A\u0010\u0014\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\b2\b\u0010\u0012\u001A\u0004\u0018\u00010\nH\u0007\"&\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0000\u001A\u00020\u00018\u0006@BX\u0087\u000E¢\u0006\u000E\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0002\u0010\u0005\":\u0010\u0006\u001A.\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\u0007j\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t`\u000BX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"<set-?>", "", "isLiveLiteralsEnabled", "isLiveLiteralsEnabled$annotations", "()V", "()Z", "liveLiteralCache", "Ljava/util/HashMap;", "", "Landroidx/compose/runtime/MutableState;", "", "Lkotlin/collections/HashMap;", "enableLiveLiterals", "", "liveLiteral", "Landroidx/compose/runtime/State;", "T", "key", "value", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/compose/runtime/State;", "updateLiveLiteralValue", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class LiveLiteralKt {
    private static boolean isLiveLiteralsEnabled;
    private static final HashMap liveLiteralCache;

    static {
        LiveLiteralKt.liveLiteralCache = new HashMap();
    }

    @InternalComposeApi
    public static final void enableLiveLiterals() {
        LiveLiteralKt.isLiveLiteralsEnabled = true;
    }

    public static final boolean isLiveLiteralsEnabled() {
        return LiveLiteralKt.isLiveLiteralsEnabled;
    }

    @ComposeCompilerApi
    @InternalComposeApi
    public static void isLiveLiteralsEnabled$annotations() {
    }

    @ComposeCompilerApi
    @InternalComposeApi
    public static final State liveLiteral(String s, Object object0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Map map0 = LiveLiteralKt.liveLiteralCache;
        MutableState mutableState0 = map0.get(s);
        if(mutableState0 == null) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            map0.put(s, mutableState0);
        }
        return mutableState0;
    }

    @InternalComposeApi
    public static final void updateLiveLiteralValue(String s, Object object0) {
        boolean z;
        Intrinsics.checkNotNullParameter(s, "key");
        Map map0 = LiveLiteralKt.liveLiteralCache;
        MutableState mutableState0 = map0.get(s);
        if(mutableState0 == null) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
            map0.put(s, mutableState0);
            z = false;
        }
        else {
            z = true;
        }
        if(z) {
            mutableState0.setValue(object0);
        }
    }
}

