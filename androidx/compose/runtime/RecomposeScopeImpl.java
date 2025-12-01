package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000F\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0002\u0010\u0005J\u000E\u00104\u001A\u00020\u00102\u0006\u00105\u001A\u00020\u000EJ\u001C\u00106\u001A\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0010\u0018\u0001072\u0006\u00109\u001A\u00020\u000FJ\b\u0010:\u001A\u00020\u0010H\u0016J\u0010\u0010;\u001A\u00020<2\b\u0010\u0015\u001A\u0004\u0018\u00010,J\u0016\u0010=\u001A\u00020\u00162\u000E\u0010>\u001A\n\u0012\u0004\u0012\u00020,\u0018\u00010?J\u000E\u0010@\u001A\u00020\u00102\u0006\u0010A\u001A\u00020,J\u0006\u0010B\u001A\u00020\u0010J\u0006\u0010C\u001A\u00020\u0010J\u000E\u0010D\u001A\u00020\u00102\u0006\u00109\u001A\u00020\u000FJ\"\u0010E\u001A\u00020\u00102\u0018\u0010\f\u001A\u0014\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00100\rH\u0016R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u0007X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\"\u0010\f\u001A\u0016\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0005R\u000E\u0010\u0014\u001A\u00020\u000FX\u0082\u000E\u00A2\u0006\u0002\n\u0000R$\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u00168F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR$\u0010\u001C\u001A\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u00168F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b\u001D\u0010\u0019\"\u0004\b\u001E\u0010\u001BR\u000E\u0010\u001F\u001A\u00020\u000FX\u0082\u000E\u00A2\u0006\u0002\n\u0000R$\u0010 \u001A\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u00168F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001BR$\u0010#\u001A\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u00168B@BX\u0082\u000E\u00A2\u0006\f\u001A\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001BR$\u0010&\u001A\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u00168@@BX\u0080\u000E\u00A2\u0006\f\u001A\u0004\b\'\u0010\u0019\"\u0004\b(\u0010\u001BR\"\u0010)\u001A\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030+\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010*X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010-\u001A\u0004\u0018\u00010.X\u0082\u000E\u00A2\u0006\u0002\n\u0000R$\u0010/\u001A\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u00168F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001BR\u0011\u00102\u001A\u00020\u00168F\u00A2\u0006\u0006\u001A\u0004\b3\u0010\u0019\u00A8\u0006F"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "composition", "Landroidx/compose/runtime/CompositionImpl;", "(Landroidx/compose/runtime/CompositionImpl;)V", "anchor", "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "block", "Lkotlin/Function2;", "Landroidx/compose/runtime/Composer;", "", "", "getComposition", "()Landroidx/compose/runtime/CompositionImpl;", "setComposition", "currentToken", "value", "", "defaultsInScope", "getDefaultsInScope", "()Z", "setDefaultsInScope", "(Z)V", "defaultsInvalid", "getDefaultsInvalid", "setDefaultsInvalid", "flags", "requiresRecompose", "getRequiresRecompose", "setRequiresRecompose", "rereading", "getRereading", "setRereading", "skipped", "getSkipped$runtime_release", "setSkipped", "trackedDependencies", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/DerivedState;", "", "trackedInstances", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "used", "getUsed", "setUsed", "valid", "getValid", "compose", "composer", "end", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "token", "invalidate", "invalidateForResult", "Landroidx/compose/runtime/InvalidationResult;", "isInvalidFor", "instances", "Landroidx/compose/runtime/collection/IdentityArraySet;", "recordRead", "instance", "rereadTrackedInstances", "scopeSkipped", "start", "updateScope", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class RecomposeScopeImpl implements RecomposeScope, ScopeUpdateScope {
    private Anchor anchor;
    private Function2 block;
    private CompositionImpl composition;
    private int currentToken;
    private int flags;
    private IdentityArrayMap trackedDependencies;
    private IdentityArrayIntMap trackedInstances;

    public RecomposeScopeImpl(CompositionImpl compositionImpl0) {
        this.composition = compositionImpl0;
    }

    public final void compose(Composer composer0) {
        Unit unit0;
        Intrinsics.checkNotNullParameter(composer0, "composer");
        Function2 function20 = this.block;
        if(function20 == null) {
            unit0 = null;
        }
        else {
            function20.invoke(composer0, 1);
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    public final Function1 end(int v) {
        IdentityArrayIntMap identityArrayIntMap0 = this.trackedInstances;
        if(identityArrayIntMap0 != null && !this.getSkipped$runtime_release()) {
            int v1 = identityArrayIntMap0.getSize();
            boolean z = false;
            if(v1 > 0) {
                int v2 = 0;
                while(identityArrayIntMap0.getKeys()[v2] != null) {
                    if(identityArrayIntMap0.getValues()[v2] != v) {
                        z = true;
                        goto label_14;
                    }
                    if(v2 + 1 >= v1) {
                        goto label_14;
                    }
                    ++v2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
        label_14:
            if(z) {
                return new Function1(v, identityArrayIntMap0) {
                    final IdentityArrayIntMap $instances;
                    final int $token;

                    {
                        RecomposeScopeImpl.this = recomposeScopeImpl0;
                        this.$token = v;
                        this.$instances = identityArrayIntMap0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((Composition)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composition composition0) {
                        Intrinsics.checkNotNullParameter(composition0, "composition");
                        if(RecomposeScopeImpl.this.currentToken == this.$token && Intrinsics.areEqual(this.$instances, RecomposeScopeImpl.this.trackedInstances) && composition0 instanceof CompositionImpl) {
                            IdentityArrayIntMap identityArrayIntMap0 = this.$instances;
                            int v = this.$token;
                            RecomposeScopeImpl recomposeScopeImpl0 = RecomposeScopeImpl.this;
                            int v1 = identityArrayIntMap0.getSize();
                            int v2 = 0;
                            if(v1 > 0) {
                                int v4 = 0;
                                for(int v3 = 0; true; ++v3) {
                                    Object object0 = identityArrayIntMap0.getKeys()[v3];
                                    if(object0 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    int v5 = identityArrayIntMap0.getValues()[v3];
                                    boolean z = v5 != v;
                                    if(z) {
                                        ((CompositionImpl)composition0).removeObservation$runtime_release(object0, recomposeScopeImpl0);
                                        DerivedState derivedState0 = object0 instanceof DerivedState ? ((DerivedState)object0) : null;
                                        if(derivedState0 != null) {
                                            IdentityArrayMap identityArrayMap0 = recomposeScopeImpl0.trackedDependencies;
                                            if(identityArrayMap0 != null) {
                                                identityArrayMap0.remove(derivedState0);
                                                if(identityArrayMap0.getSize$runtime_release() == 0) {
                                                    recomposeScopeImpl0.trackedDependencies = null;
                                                }
                                            }
                                        }
                                    }
                                    if(!z) {
                                        if(v4 != v3) {
                                            identityArrayIntMap0.getKeys()[v4] = object0;
                                            identityArrayIntMap0.getValues()[v4] = v5;
                                        }
                                        ++v4;
                                    }
                                    if(v3 + 1 >= v1) {
                                        v2 = v4;
                                        break;
                                    }
                                }
                            }
                            int v6 = identityArrayIntMap0.getSize();
                            if(v2 < v6) {
                                for(int v7 = v2; true; ++v7) {
                                    identityArrayIntMap0.getKeys()[v7] = null;
                                    if(v7 + 1 >= v6) {
                                        break;
                                    }
                                }
                            }
                            identityArrayIntMap0.setSize(v2);
                            if(this.$instances.getSize() == 0) {
                                RecomposeScopeImpl.this.trackedInstances = null;
                            }
                        }
                    }
                };
            }
        }
        return null;
    }

    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final CompositionImpl getComposition() {
        return this.composition;
    }

    public final boolean getDefaultsInScope() {
        return (this.flags & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.flags & 8) != 0;
    }

    private final boolean getRereading() {
        return (this.flags & 0x20) != 0;
    }

    public final boolean getSkipped$runtime_release() {
        return (this.flags & 16) != 0;
    }

    public final boolean getUsed() {
        return (this.flags & 1) != 0;
    }

    public final boolean getValid() {
        if(this.composition != null) {
            return this.anchor == null ? false : this.anchor.getValid();
        }
        return false;
    }

    @Override  // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        CompositionImpl compositionImpl0 = this.composition;
        if(compositionImpl0 != null) {
            compositionImpl0.invalidate(this, null);
        }
    }

    public final InvalidationResult invalidateForResult(Object object0) {
        InvalidationResult invalidationResult0 = this.composition == null ? null : this.composition.invalidate(this, object0);
        return invalidationResult0 == null ? InvalidationResult.IGNORED : invalidationResult0;
    }

    public final boolean isInvalidFor(IdentityArraySet identityArraySet0) {
        if(identityArraySet0 == null) {
            return true;
        }
        IdentityArrayMap identityArrayMap0 = this.trackedDependencies;
        if(identityArrayMap0 == null) {
            return true;
        }
        if(identityArraySet0.isNotEmpty()) {
            if(!(identityArraySet0 instanceof Collection) || !identityArraySet0.isEmpty()) {
                for(Object object0: identityArraySet0) {
                    if(!(object0 instanceof DerivedState) || !Intrinsics.areEqual(identityArrayMap0.get(object0), ((DerivedState)object0).getValue())) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void recordRead(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "instance");
        if(this.getRereading()) {
            return;
        }
        IdentityArrayIntMap identityArrayIntMap0 = this.trackedInstances;
        if(identityArrayIntMap0 == null) {
            identityArrayIntMap0 = new IdentityArrayIntMap();
            this.trackedInstances = identityArrayIntMap0;
        }
        identityArrayIntMap0.add(object0, this.currentToken);
        if(object0 instanceof DerivedState) {
            IdentityArrayMap identityArrayMap0 = this.trackedDependencies;
            if(identityArrayMap0 == null) {
                identityArrayMap0 = new IdentityArrayMap(0, 1, null);
                this.trackedDependencies = identityArrayMap0;
            }
            identityArrayMap0.set(object0, ((DerivedState)object0).getCurrentValue());
        }
    }

    public final void rereadTrackedInstances() {
        CompositionImpl compositionImpl0 = this.composition;
        if(compositionImpl0 != null) {
            IdentityArrayIntMap identityArrayIntMap0 = this.trackedInstances;
            if(identityArrayIntMap0 != null) {
                this.setRereading(true);
                try {
                    int v1 = identityArrayIntMap0.getSize();
                    if(v1 > 0) {
                        for(int v2 = 0; true; ++v2) {
                            Object object0 = identityArrayIntMap0.getKeys()[v2];
                            if(object0 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            int v3 = identityArrayIntMap0.getValues()[v2];
                            compositionImpl0.recordReadOf(object0);
                            if(v2 + 1 >= v1) {
                                break;
                            }
                        }
                    }
                }
                finally {
                    this.setRereading(false);
                }
            }
        }
    }

    public final void scopeSkipped() {
        this.setSkipped(true);
    }

    public final void setAnchor(Anchor anchor0) {
        this.anchor = anchor0;
    }

    public final void setComposition(CompositionImpl compositionImpl0) {
        this.composition = compositionImpl0;
    }

    public final void setDefaultsInScope(boolean z) {
        if(z) {
            this.flags |= 2;
            return;
        }
        this.flags &= -3;
    }

    public final void setDefaultsInvalid(boolean z) {
        if(z) {
            this.flags |= 4;
            return;
        }
        this.flags &= -5;
    }

    public final void setRequiresRecompose(boolean z) {
        if(z) {
            this.flags |= 8;
            return;
        }
        this.flags &= -9;
    }

    private final void setRereading(boolean z) {
        if(z) {
            this.flags |= 0x20;
            return;
        }
        this.flags &= -33;
    }

    private final void setSkipped(boolean z) {
        if(z) {
            this.flags |= 16;
            return;
        }
        this.flags &= -17;
    }

    public final void setUsed(boolean z) {
        if(z) {
            this.flags |= 1;
            return;
        }
        this.flags &= -2;
    }

    public final void start(int v) {
        this.currentToken = v;
        this.setSkipped(false);
    }

    @Override  // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        this.block = function20;
    }
}

