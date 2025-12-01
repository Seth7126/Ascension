package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u000E\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001A\u00020\u0012R\"\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/Invalidation;", "", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "location", "", "instances", "Landroidx/compose/runtime/collection/IdentityArraySet;", "(Landroidx/compose/runtime/RecomposeScopeImpl;ILandroidx/compose/runtime/collection/IdentityArraySet;)V", "getInstances", "()Landroidx/compose/runtime/collection/IdentityArraySet;", "setInstances", "(Landroidx/compose/runtime/collection/IdentityArraySet;)V", "getLocation", "()I", "getScope", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "isInvalid", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class Invalidation {
    private IdentityArraySet instances;
    private final int location;
    private final RecomposeScopeImpl scope;

    public Invalidation(RecomposeScopeImpl recomposeScopeImpl0, int v, IdentityArraySet identityArraySet0) {
        Intrinsics.checkNotNullParameter(recomposeScopeImpl0, "scope");
        super();
        this.scope = recomposeScopeImpl0;
        this.location = v;
        this.instances = identityArraySet0;
    }

    public final IdentityArraySet getInstances() {
        return this.instances;
    }

    public final int getLocation() {
        return this.location;
    }

    public final RecomposeScopeImpl getScope() {
        return this.scope;
    }

    public final boolean isInvalid() {
        return this.scope.isInvalidFor(this.instances);
    }

    public final void setInstances(IdentityArraySet identityArraySet0) {
        this.instances = identityArraySet0;
    }
}

