package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001A\u00020\rHÖ\u0001J\t\u0010\u000E\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u000F"}, d2 = {"Landroidx/compose/runtime/OpaqueKey;", "", "key", "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class OpaqueKey {
    private final String key;

    public OpaqueKey(String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        super();
        this.key = s;
    }

    public final String component1() {
        return this.key;
    }

    public final OpaqueKey copy(String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        return new OpaqueKey(s);
    }

    public static OpaqueKey copy$default(OpaqueKey opaqueKey0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = opaqueKey0.key;
        }
        return opaqueKey0.copy(s);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof OpaqueKey ? Intrinsics.areEqual(this.key, ((OpaqueKey)object0).key) : false;
    }

    public final String getKey() {
        return this.key;
    }

    @Override
    public int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return "OpaqueKey(key=" + this.key + ')';
    }
}

