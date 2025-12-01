package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.ui.draw.PainterModifier..ExternalSyntheticBackport0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;

@Metadata(d1 = {"\u0000\u00AE\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001:\u0001bB%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\u0002\u0010\bJ\u0016\u0010E\u001A\u00020\u001B2\f\u0010F\u001A\b\u0012\u0004\u0012\u0002030GH\u0002J\b\u0010H\u001A\u00020\u001BH\u0016J \u0010I\u001A\u00020\u001B2\u0011\u0010J\u001A\r\u0012\u0004\u0012\u00020\u001B0\u001E\u00A2\u0006\u0002\b\u001FH\u0016\u00A2\u0006\u0002\u0010#J\b\u0010K\u001A\u00020\u001BH\u0016J\b\u0010L\u001A\u00020\u001BH\u0002J\b\u0010M\u001A\u00020\u001BH\u0002J\u0018\u0010N\u001A\u00020O2\u0006\u0010P\u001A\u0002012\b\u0010Q\u001A\u0004\u0018\u000103J\b\u0010R\u001A\u00020\u001BH\u0016J\u0010\u0010S\u001A\u00020\u001B2\u0006\u0010T\u001A\u000203H\u0002J\u0016\u0010U\u001A\u00020\u000F2\f\u0010F\u001A\b\u0012\u0004\u0012\u0002030GH\u0016J\u0016\u0010V\u001A\u00020\u001B2\f\u0010W\u001A\b\u0012\u0004\u0012\u00020\u001B0\u001EH\u0016J\b\u0010X\u001A\u00020\u000FH\u0016J\u0016\u0010Y\u001A\u00020\u001B2\f\u0010F\u001A\b\u0012\u0004\u0012\u0002030GH\u0016J\u0010\u0010Z\u001A\u00020\u001B2\u0006\u0010T\u001A\u000203H\u0016J\u0010\u0010[\u001A\u00020\u001B2\u0006\u0010T\u001A\u000203H\u0016J\u001D\u0010\\\u001A\u00020\u001B2\u0006\u0010Q\u001A\u0002032\u0006\u0010P\u001A\u000201H\u0000\u00A2\u0006\u0002\b]J \u0010^\u001A\u00020\u001B2\u0011\u0010J\u001A\r\u0012\u0004\u0012\u00020\u001B0\u001E\u00A2\u0006\u0002\b\u001FH\u0016\u00A2\u0006\u0002\u0010#J\u001C\u0010_\u001A\u0016\u0012\u0004\u0012\u000201\u0012\f\u0012\n\u0012\u0004\u0012\u000203\u0018\u00010200H\u0002J\u0010\u0010`\u001A\u00020\u001B2\u0006\u0010C\u001A\u00020DH\u0002J\b\u0010a\u001A\u00020\u001BH\u0016R\u0010\u0010\t\u001A\u0004\u0018\u00010\u0007X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001E\u0010\n\u001A\u0012\u0012\u0004\u0012\u00020\f0\u000Bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0005X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u000E\u001A\u00020\u000F8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011Ra\u0010\u0012\u001AU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0017\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\u001B0\u0014j\u0002`\u001C0\u0013X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\'\u0010\u001D\u001A\r\u0012\u0004\u0012\u00020\u001B0\u001E\u00A2\u0006\u0002\b\u001FX\u0086\u000E\u00A2\u0006\u0010\n\u0002\u0010$\u001A\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000E\u0010%\u001A\u00020&X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0018\u0010\'\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0(X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010*\u001A\u00020\u000FX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010+\u001A\u00020\u000F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b,\u0010\u0011R\u0014\u0010-\u001A\u00020\u000F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b.\u0010\u0011R\"\u0010/\u001A\u0016\u0012\u0004\u0012\u000201\u0012\f\u0012\n\u0012\u0004\u0012\u000203\u0018\u00010200X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u00104\u001A\u00020\u000F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b4\u0010\u0011R\u0014\u00105\u001A\u00020\u000F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b5\u0010\u0011R\u0011\u00106\u001A\u00020\u000F\u00A2\u0006\b\n\u0000\u001A\u0004\b6\u0010\u0011R\u000E\u00107\u001A\u000203X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u00108\u001A\b\u0012\u0004\u0012\u0002010(X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u00109\u001A\b\u0012\u0004\u0012\u0002010(X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010:\u001A\u00020\u000FX\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b;\u0010\u0011\"\u0004\b<\u0010=R\"\u0010>\u001A\u0016\u0012\u0006\u0012\u0004\u0018\u0001030?j\n\u0012\u0006\u0012\u0004\u0018\u000103`@X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001A\u00020\u00078F\u00A2\u0006\u0006\u001A\u0004\bA\u0010BR\u000E\u0010C\u001A\u00020DX\u0082\u0004\u00A2\u0006\u0002\n\u0000\u00A8\u0006c"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "parent", "Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "_recomposeContext", "abandonSet", "Ljava/util/HashSet;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/collections/HashSet;", "areChildrenComposing", "", "getAreChildrenComposing", "()Z", "changes", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "composable", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "derivedStates", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "Landroidx/compose/runtime/DerivedState;", "disposed", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges", "invalidations", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "", "isComposing", "isDisposed", "isRoot", "lock", "observations", "observationsProcessed", "pendingInvalidScopes", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "addPendingInvalidationsLocked", "values", "", "applyChanges", "composeContent", "content", "dispose", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", "scope", "instance", "invalidateAll", "invalidateScopeOfLocked", "value", "observesAnyOf", "prepareCompose", "block", "recompose", "recordModificationsOf", "recordReadOf", "recordWriteOf", "removeObservation", "removeObservation$runtime_release", "setContent", "takeInvalidations", "validateRecomposeScopeAnchors", "verifyConsistent", "RememberEventDispatcher", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class CompositionImpl implements ControlledComposition {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001A\u00020\u000BJ\u0006\u0010\r\u001A\u00020\u000BJ\u0006\u0010\u000E\u001A\u00020\u000BJ\u0010\u0010\u0006\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u0004H\u0016J\u0010\u0010\b\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u0004H\u0016J\u0016\u0010\u0010\u001A\u00020\u000B2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u0016R\u0014\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/CompositionImpl$RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "abandoning", "", "Landroidx/compose/runtime/RememberObserver;", "(Ljava/util/Set;)V", "forgetting", "", "remembering", "sideEffects", "Lkotlin/Function0;", "", "dispatchAbandons", "dispatchRememberObservers", "dispatchSideEffects", "instance", "sideEffect", "effect", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class RememberEventDispatcher implements RememberManager {
        private final Set abandoning;
        private final List forgetting;
        private final List remembering;
        private final List sideEffects;

        public RememberEventDispatcher(Set set0) {
            Intrinsics.checkNotNullParameter(set0, "abandoning");
            super();
            this.abandoning = set0;
            this.remembering = new ArrayList();
            this.forgetting = new ArrayList();
            this.sideEffects = new ArrayList();
        }

        public final void dispatchAbandons() {
            if(!this.abandoning.isEmpty() != 0) {
                Iterator iterator0 = this.abandoning.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    iterator0.remove();
                    ((RememberObserver)object0).onAbandoned();
                }
            }
        }

        public final void dispatchRememberObservers() {
            if(!this.forgetting.isEmpty() != 0) {
                int v = this.forgetting.size() - 1;
                if(v >= 0) {
                    while(true) {
                        RememberObserver rememberObserver0 = (RememberObserver)this.forgetting.get(v);
                        if(!this.abandoning.contains(rememberObserver0)) {
                            rememberObserver0.onForgotten();
                        }
                        if(v - 1 < 0) {
                            break;
                        }
                        --v;
                    }
                }
            }
            if(!this.remembering.isEmpty() != 0) {
                List list0 = this.remembering;
                int v1 = list0.size();
                if(v1 - 1 >= 0) {
                    for(int v2 = 0; true; ++v2) {
                        RememberObserver rememberObserver1 = (RememberObserver)list0.get(v2);
                        this.abandoning.remove(rememberObserver1);
                        rememberObserver1.onRemembered();
                        if(v2 + 1 > v1 - 1) {
                            break;
                        }
                    }
                }
            }
        }

        public final void dispatchSideEffects() {
            if(!this.sideEffects.isEmpty() != 0) {
                List list0 = this.sideEffects;
                int v = list0.size();
                if(v - 1 >= 0) {
                    for(int v1 = 0; true; ++v1) {
                        ((Function0)list0.get(v1)).invoke();
                        if(v1 + 1 > v - 1) {
                            break;
                        }
                    }
                }
                this.sideEffects.clear();
            }
        }

        @Override  // androidx.compose.runtime.RememberManager
        public void forgetting(RememberObserver rememberObserver0) {
            Intrinsics.checkNotNullParameter(rememberObserver0, "instance");
            int v = this.remembering.lastIndexOf(rememberObserver0);
            if(v >= 0) {
                this.remembering.remove(v);
                this.abandoning.remove(rememberObserver0);
                return;
            }
            this.forgetting.add(rememberObserver0);
        }

        @Override  // androidx.compose.runtime.RememberManager
        public void remembering(RememberObserver rememberObserver0) {
            Intrinsics.checkNotNullParameter(rememberObserver0, "instance");
            int v = this.forgetting.lastIndexOf(rememberObserver0);
            if(v >= 0) {
                this.forgetting.remove(v);
                this.abandoning.remove(rememberObserver0);
                return;
            }
            this.remembering.add(rememberObserver0);
        }

        @Override  // androidx.compose.runtime.RememberManager
        public void sideEffect(Function0 function00) {
            Intrinsics.checkNotNullParameter(function00, "effect");
            this.sideEffects.add(function00);
        }
    }

    private final CoroutineContext _recomposeContext;
    private final HashSet abandonSet;
    private final Applier applier;
    private final List changes;
    private Function2 composable;
    private final ComposerImpl composer;
    private final IdentityScopeMap derivedStates;
    private boolean disposed;
    private IdentityArrayMap invalidations;
    private final boolean isRoot;
    private final Object lock;
    private final IdentityScopeMap observations;
    private final IdentityScopeMap observationsProcessed;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference pendingModifications;
    private final SlotTable slotTable;

    public CompositionImpl(CompositionContext compositionContext0, Applier applier0, CoroutineContext coroutineContext0) {
        Intrinsics.checkNotNullParameter(compositionContext0, "parent");
        Intrinsics.checkNotNullParameter(applier0, "applier");
        super();
        this.parent = compositionContext0;
        this.applier = applier0;
        this.pendingModifications = new AtomicReference(null);
        this.lock = new Object();
        HashSet hashSet0 = new HashSet();
        this.abandonSet = hashSet0;
        SlotTable slotTable0 = new SlotTable();
        this.slotTable = slotTable0;
        this.observations = new IdentityScopeMap();
        this.derivedStates = new IdentityScopeMap();
        ArrayList arrayList0 = new ArrayList();
        this.changes = arrayList0;
        this.observationsProcessed = new IdentityScopeMap();
        this.invalidations = new IdentityArrayMap(0, 1, null);
        ComposerImpl composerImpl0 = new ComposerImpl(applier0, compositionContext0, slotTable0, hashSet0, arrayList0, this);
        compositionContext0.registerComposer$runtime_release(composerImpl0);
        this.composer = composerImpl0;
        this._recomposeContext = coroutineContext0;
        this.isRoot = compositionContext0 instanceof Recomposer;
        this.composable = ComposableSingletons.CompositionKt.INSTANCE.getLambda-1$runtime_release();
    }

    public CompositionImpl(CompositionContext compositionContext0, Applier applier0, CoroutineContext coroutineContext0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            coroutineContext0 = null;
        }
        this(compositionContext0, applier0, coroutineContext0);
    }

    private final void addPendingInvalidationsLocked(Set set0) {
        int v11;
        int v7;
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        for(Object object0: set0) {
            if(object0 instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl)object0).invalidateForResult(null);
            }
            else {
                CompositionImpl.addPendingInvalidationsLocked$invalidate(this, ref$ObjectRef0, object0);
                IdentityScopeMap identityScopeMap0 = this.derivedStates;
                int v = identityScopeMap0.find(object0);
                if(v >= 0) {
                    for(Object object1: identityScopeMap0.scopeSetAt(v)) {
                        CompositionImpl.addPendingInvalidationsLocked$invalidate(this, ref$ObjectRef0, ((DerivedState)object1));
                    }
                }
            }
        }
        HashSet hashSet0 = (HashSet)ref$ObjectRef0.element;
        if(hashSet0 != null) {
            IdentityScopeMap identityScopeMap1 = this.observations;
            int v1 = identityScopeMap1.getSize();
            if(v1 > 0) {
                int v2 = 0;
                int v3 = 0;
                while(true) {
                    int v4 = identityScopeMap1.getValueOrder()[v2];
                    IdentityArraySet identityArraySet0 = identityScopeMap1.getScopeSets()[v4];
                    Intrinsics.checkNotNull(identityArraySet0);
                    int v5 = identityArraySet0.size();
                    if(v5 > 0) {
                        int v6 = 0;
                        v7 = 0;
                        Object object2;
                        while((object2 = identityArraySet0.getValues()[v6]) != null) {
                            if(!hashSet0.contains(((RecomposeScopeImpl)object2))) {
                                if(v7 != v6) {
                                    identityArraySet0.getValues()[v7] = object2;
                                }
                                ++v7;
                            }
                            if(v6 + 1 >= v5) {
                                goto label_42;
                            }
                            ++v6;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    }
                    else {
                        v7 = 0;
                    }
                label_42:
                    int v8 = identityArraySet0.size();
                    if(v7 < v8) {
                        for(int v9 = v7; true; ++v9) {
                            identityArraySet0.getValues()[v9] = null;
                            if(v9 + 1 >= v8) {
                                break;
                            }
                        }
                    }
                    identityArraySet0.setSize(v7);
                    if(identityArraySet0.size() > 0) {
                        if(v3 != v2) {
                            int v10 = identityScopeMap1.getValueOrder()[v3];
                            identityScopeMap1.getValueOrder()[v3] = v4;
                            identityScopeMap1.getValueOrder()[v2] = v10;
                        }
                        ++v3;
                    }
                    if(v2 + 1 >= v1) {
                        v11 = v3;
                        break;
                    }
                    ++v2;
                }
            }
            else {
                v11 = 0;
            }
            int v12 = identityScopeMap1.getSize();
            if(v11 < v12) {
                for(int v13 = v11; true; ++v13) {
                    identityScopeMap1.getValues()[identityScopeMap1.getValueOrder()[v13]] = null;
                    if(v13 + 1 >= v12) {
                        break;
                    }
                }
            }
            identityScopeMap1.setSize(v11);
        }
    }

    private static final void addPendingInvalidationsLocked$invalidate(CompositionImpl compositionImpl0, ObjectRef ref$ObjectRef0, Object object0) {
        IdentityScopeMap identityScopeMap0 = compositionImpl0.observations;
        int v = identityScopeMap0.find(object0);
        if(v >= 0) {
            for(Object object1: identityScopeMap0.scopeSetAt(v)) {
                RecomposeScopeImpl recomposeScopeImpl0 = (RecomposeScopeImpl)object1;
                if(!compositionImpl0.observationsProcessed.remove(object0, recomposeScopeImpl0) && recomposeScopeImpl0.invalidateForResult(object0) != InvalidationResult.IGNORED) {
                    HashSet hashSet0 = (HashSet)ref$ObjectRef0.element;
                    if(hashSet0 == null) {
                        hashSet0 = new HashSet();
                        ref$ObjectRef0.element = hashSet0;
                    }
                    hashSet0.add(recomposeScopeImpl0);
                }
            }
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        int v27;
        int v23;
        int v11;
        int v7;
        synchronized(this.lock) {
            RememberEventDispatcher compositionImpl$RememberEventDispatcher0 = new RememberEventDispatcher(this.abandonSet);
            try {
                this.applier.onBeginChanges();
                SlotWriter slotWriter0 = this.slotTable.openWriter();
                try {
                    Applier applier0 = this.applier;
                    List list0 = this.changes;
                    int v3 = list0.size();
                    if(v3 - 1 >= 0) {
                        for(int v4 = 0; true; ++v4) {
                            ((Function3)list0.get(v4)).invoke(applier0, slotWriter0, compositionImpl$RememberEventDispatcher0);
                            if(v4 + 1 > v3 - 1) {
                                break;
                            }
                        }
                    }
                    this.changes.clear();
                }
                finally {
                    slotWriter0.close();
                }
                this.applier.onEndChanges();
                compositionImpl$RememberEventDispatcher0.dispatchRememberObservers();
                compositionImpl$RememberEventDispatcher0.dispatchSideEffects();
                if(this.getPendingInvalidScopes$runtime_release()) {
                    this.setPendingInvalidScopes$runtime_release(false);
                    IdentityScopeMap identityScopeMap0 = this.observations;
                    int v5 = identityScopeMap0.getSize();
                    if(v5 > 0) {
                        int v6 = 0;
                        v7 = 0;
                        while(true) {
                            int v8 = identityScopeMap0.getValueOrder()[v6];
                            IdentityArraySet identityArraySet0 = identityScopeMap0.getScopeSets()[v8];
                            Intrinsics.checkNotNull(identityArraySet0);
                            int v9 = identityArraySet0.size();
                            if(v9 > 0) {
                                int v10 = 0;
                                v11 = 0;
                                Object object1;
                                while((object1 = identityArraySet0.getValues()[v10]) != null) {
                                    if(!((RecomposeScopeImpl)object1).getValid() == 0) {
                                        if(v11 != v10) {
                                            identityArraySet0.getValues()[v11] = object1;
                                        }
                                        ++v11;
                                    }
                                    if(v10 + 1 >= v9) {
                                        goto label_50;
                                    }
                                    ++v10;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                            else {
                                v11 = 0;
                            }
                        label_50:
                            int v12 = identityArraySet0.size();
                            if(v11 < v12) {
                                for(int v13 = v11; true; ++v13) {
                                    identityArraySet0.getValues()[v13] = null;
                                    if(v13 + 1 >= v12) {
                                        break;
                                    }
                                }
                            }
                            identityArraySet0.setSize(v11);
                            if(identityArraySet0.size() > 0) {
                                if(v7 != v6) {
                                    int v14 = identityScopeMap0.getValueOrder()[v7];
                                    identityScopeMap0.getValueOrder()[v7] = v8;
                                    identityScopeMap0.getValueOrder()[v6] = v14;
                                }
                                ++v7;
                            }
                            if(v6 + 1 >= v5) {
                                break;
                            }
                            ++v6;
                        }
                    }
                    else {
                        v7 = 0;
                    }
                    int v15 = identityScopeMap0.getSize();
                    if(v7 < v15) {
                        for(int v16 = v7; true; ++v16) {
                            identityScopeMap0.getValues()[identityScopeMap0.getValueOrder()[v16]] = null;
                            if(v16 + 1 >= v15) {
                                break;
                            }
                        }
                    }
                    identityScopeMap0.setSize(v7);
                    IdentityScopeMap identityScopeMap1 = this.derivedStates;
                    int v17 = identityScopeMap1.getSize();
                    if(v17 > 0) {
                        int v18 = 0;
                        int v19 = 0;
                        while(true) {
                            int v20 = identityScopeMap1.getValueOrder()[v18];
                            IdentityArraySet identityArraySet1 = identityScopeMap1.getScopeSets()[v20];
                            Intrinsics.checkNotNull(identityArraySet1);
                            int v21 = identityArraySet1.size();
                            if(v21 > 0) {
                                int v22 = 0;
                                v23 = 0;
                                Object object2;
                                while((object2 = identityArraySet1.getValues()[v22]) != null) {
                                    if(!this.observations.contains(((DerivedState)object2)) == 0) {
                                        if(v23 != v22) {
                                            identityArraySet1.getValues()[v23] = object2;
                                        }
                                        ++v23;
                                    }
                                    if(v22 + 1 >= v21) {
                                        goto label_100;
                                    }
                                    ++v22;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                            else {
                                v23 = 0;
                            }
                        label_100:
                            int v24 = identityArraySet1.size();
                            if(v23 < v24) {
                                for(int v25 = v23; true; ++v25) {
                                    identityArraySet1.getValues()[v25] = null;
                                    if(v25 + 1 >= v24) {
                                        break;
                                    }
                                }
                            }
                            identityArraySet1.setSize(v23);
                            if(identityArraySet1.size() > 0) {
                                if(v19 != v18) {
                                    int v26 = identityScopeMap1.getValueOrder()[v19];
                                    identityScopeMap1.getValueOrder()[v19] = v20;
                                    identityScopeMap1.getValueOrder()[v18] = v26;
                                }
                                ++v19;
                            }
                            if(v18 + 1 >= v17) {
                                v27 = v19;
                                break;
                            }
                            ++v18;
                        }
                    }
                    else {
                        v27 = 0;
                    }
                    int v28 = identityScopeMap1.getSize();
                    if(v27 < v28) {
                        for(int v29 = v27; true; ++v29) {
                            identityScopeMap1.getValues()[identityScopeMap1.getValueOrder()[v29]] = null;
                            if(v29 + 1 >= v28) {
                                break;
                            }
                        }
                    }
                    identityScopeMap1.setSize(v27);
                }
            }
            finally {
                compositionImpl$RememberEventDispatcher0.dispatchAbandons();
            }
            this.drainPendingModificationsLocked();
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void composeContent(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "content");
        synchronized(this.lock) {
            this.drainPendingModificationsForCompositionLocked();
            IdentityArrayMap identityArrayMap0 = this.takeInvalidations();
            this.composer.composeContent$runtime_release(identityArrayMap0, function20);
        }
    }

    @Override  // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized(this.lock) {
            if(!this.disposed) {
                this.disposed = true;
                this.setComposable(ComposableSingletons.CompositionKt.INSTANCE.getLambda-2$runtime_release());
                if(this.slotTable.getGroupsSize() > 0) {
                    RememberEventDispatcher compositionImpl$RememberEventDispatcher0 = new RememberEventDispatcher(this.abandonSet);
                    SlotWriter slotWriter0 = this.slotTable.openWriter();
                    try {
                        ComposerKt.removeCurrentGroup(slotWriter0, compositionImpl$RememberEventDispatcher0);
                    }
                    finally {
                        slotWriter0.close();
                    }
                    this.applier.clear();
                    compositionImpl$RememberEventDispatcher0.dispatchRememberObservers();
                }
                this.composer.dispose$runtime_release();
                this.parent.unregisterComposition$runtime_release(this);
                this.parent.unregisterComposition$runtime_release(this);
            }
        }
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object object0 = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if(object0 != null) {
            if(Intrinsics.areEqual(object0, CompositionKt.PendingApplyNoModifications)) {
                throw new IllegalStateException("pending composition has not been applied");
            }
            if(object0 instanceof Set) {
                this.addPendingInvalidationsLocked(((Set)object0));
                return;
            }
            if(!(object0 instanceof Object[])) {
                throw new IllegalStateException(("corrupt pendingModifications drain: " + this.pendingModifications).toString());
            }
            int v = 0;
            while(v < ((Set[])object0).length) {
                Set set0 = ((Set[])object0)[v];
                ++v;
                this.addPendingInvalidationsLocked(set0);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object object0 = this.pendingModifications.getAndSet(null);
        if(!Intrinsics.areEqual(object0, CompositionKt.PendingApplyNoModifications)) {
            if(object0 instanceof Set) {
                this.addPendingInvalidationsLocked(((Set)object0));
                return;
            }
            if(!(object0 instanceof Object[])) {
                throw object0 == null ? new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported") : new IllegalStateException(("corrupt pendingModifications drain: " + this.pendingModifications).toString());
            }
            int v = 0;
            while(v < ((Set[])object0).length) {
                Set set0 = ((Set[])object0)[v];
                ++v;
                this.addPendingInvalidationsLocked(set0);
            }
        }
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    public final Function2 getComposable() {
        return this.composable;
    }

    @Override  // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        synchronized(this.lock) {
            return this.invalidations.getSize$runtime_release() > 0;
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        synchronized(this.lock) {
            return this.composer.getHasPendingChanges$runtime_release();
        }
    }

    public final boolean getPendingInvalidScopes$runtime_release() {
        return this.pendingInvalidScopes;
    }

    public final CoroutineContext getRecomposeContext() {
        return this._recomposeContext == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : this._recomposeContext;
    }

    public final InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl0, Object object0) {
        Intrinsics.checkNotNullParameter(recomposeScopeImpl0, "scope");
        if(recomposeScopeImpl0.getDefaultsInScope()) {
            recomposeScopeImpl0.setDefaultsInvalid(true);
        }
        Anchor anchor0 = recomposeScopeImpl0.getAnchor();
        if(anchor0 == null || !this.slotTable.ownsAnchor(anchor0) || !anchor0.getValid() || anchor0.toIndexFor(this.slotTable) < 0) {
            return InvalidationResult.IGNORED;
        }
        if(this.isComposing() && this.composer.tryImminentInvalidation$runtime_release(recomposeScopeImpl0, object0)) {
            return InvalidationResult.IMMINENT;
        }
        if(object0 == null) {
            this.invalidations.set(recomposeScopeImpl0, null);
        }
        else {
            CompositionKt.addValue(this.invalidations, recomposeScopeImpl0, object0);
        }
        this.parent.invalidate$runtime_release(this);
        return this.isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized(this.lock) {
            Object[] arr_object = this.slotTable.getSlots();
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                Object object1 = arr_object[v1];
                RecomposeScopeImpl recomposeScopeImpl0 = object1 instanceof RecomposeScopeImpl ? ((RecomposeScopeImpl)object1) : null;
                if(recomposeScopeImpl0 != null) {
                    recomposeScopeImpl0.invalidate();
                }
            }
        }
    }

    private final void invalidateScopeOfLocked(Object object0) {
        IdentityScopeMap identityScopeMap0 = this.observations;
        int v = identityScopeMap0.find(object0);
        if(v >= 0) {
            for(Object object1: identityScopeMap0.scopeSetAt(v)) {
                RecomposeScopeImpl recomposeScopeImpl0 = (RecomposeScopeImpl)object1;
                if(recomposeScopeImpl0.invalidateForResult(object0) == InvalidationResult.IMMINENT) {
                    this.observationsProcessed.add(object0, recomposeScopeImpl0);
                }
            }
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.isComposing$runtime_release();
    }

    @Override  // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.disposed;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public boolean observesAnyOf(Set set0) {
        Intrinsics.checkNotNullParameter(set0, "values");
        for(Object object0: set0) {
            if(this.observations.contains(object0) || this.derivedStates.contains(object0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        this.composer.prepareCompose$runtime_release(function00);
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        synchronized(this.lock) {
            this.drainPendingModificationsForCompositionLocked();
            IdentityArrayMap identityArrayMap0 = this.takeInvalidations();
            boolean z = this.composer.recompose$runtime_release(identityArrayMap0);
            if(!z) {
                this.drainPendingModificationsLocked();
            }
            return z;
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(Set set0) {
        Set set1;
        Intrinsics.checkNotNullParameter(set0, "values");
        do {
            Object object0 = this.pendingModifications.get();
            if((object0 == null ? true : Intrinsics.areEqual(object0, CompositionKt.PendingApplyNoModifications))) {
                set1 = set0;
            }
            else if(object0 instanceof Set) {
                set1 = new Set[]{((Set)object0), set0};
            }
            else {
                if(!(object0 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                }
                set1 = ArraysKt.plus(((Set[])object0), set0);
            }
        }
        while(!PainterModifier..ExternalSyntheticBackport0.m(this.pendingModifications, object0, set1));
        if(object0 == null) {
            synchronized(this.lock) {
                this.drainPendingModificationsLocked();
            }
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void recordReadOf(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "value");
        if(!this.getAreChildrenComposing()) {
            RecomposeScopeImpl recomposeScopeImpl0 = this.composer.getCurrentRecomposeScope$runtime_release();
            if(recomposeScopeImpl0 != null) {
                recomposeScopeImpl0.setUsed(true);
                this.observations.add(object0, recomposeScopeImpl0);
                if(object0 instanceof DerivedState) {
                    for(Object object1: ((DerivedState)object0).getDependencies()) {
                        this.derivedStates.add(((StateObject)object1), object0);
                    }
                }
                recomposeScopeImpl0.recordRead(object0);
            }
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "value");
        synchronized(this.lock) {
            this.invalidateScopeOfLocked(object0);
            IdentityScopeMap identityScopeMap0 = this.derivedStates;
            int v1 = identityScopeMap0.find(object0);
            if(v1 >= 0) {
                for(Object object2: identityScopeMap0.scopeSetAt(v1)) {
                    this.invalidateScopeOfLocked(((DerivedState)object2));
                }
            }
        }
    }

    public final void removeObservation$runtime_release(Object object0, RecomposeScopeImpl recomposeScopeImpl0) {
        Intrinsics.checkNotNullParameter(object0, "instance");
        Intrinsics.checkNotNullParameter(recomposeScopeImpl0, "scope");
        this.observations.remove(object0, recomposeScopeImpl0);
    }

    public final void setComposable(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "<set-?>");
        this.composable = function20;
    }

    @Override  // androidx.compose.runtime.Composition
    public void setContent(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "content");
        if(!this.disposed == 0) {
            throw new IllegalStateException("The composition is disposed");
        }
        this.composable = function20;
        this.parent.composeInitial$runtime_release(this, function20);
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z) {
        this.pendingInvalidScopes = z;
    }

    private final IdentityArrayMap takeInvalidations() {
        IdentityArrayMap identityArrayMap0 = this.invalidations;
        this.invalidations = new IdentityArrayMap(0, 1, null);
        return identityArrayMap0;
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable0) {
        Object[] arr_object = slotTable0.getSlots();
        Collection collection0 = new ArrayList();
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            Object object0 = arr_object[v1];
            RecomposeScopeImpl recomposeScopeImpl0 = object0 instanceof RecomposeScopeImpl ? ((RecomposeScopeImpl)object0) : null;
            if(recomposeScopeImpl0 != null) {
                collection0.add(recomposeScopeImpl0);
            }
        }
        int v2 = ((List)collection0).size();
        if(v2 - 1 >= 0) {
            for(int v = 0; true; ++v) {
                RecomposeScopeImpl recomposeScopeImpl1 = (RecomposeScopeImpl)((List)collection0).get(v);
                Anchor anchor0 = recomposeScopeImpl1.getAnchor();
                if(anchor0 != null && !slotTable0.slotsOf$runtime_release(anchor0.toIndexFor(slotTable0)).contains(recomposeScopeImpl1)) {
                    throw new IllegalStateException(("Misaligned anchor " + anchor0 + " in scope " + recomposeScopeImpl1 + " encountered, scope found at " + ArraysKt.indexOf(slotTable0.getSlots(), recomposeScopeImpl1)).toString());
                }
                if(v + 1 > v2 - 1) {
                    break;
                }
            }
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized(this.lock) {
            if(!this.isComposing()) {
                this.slotTable.verifyWellFormed();
                this.validateRecomposeScopeAnchors(this.slotTable);
            }
        }
    }
}

