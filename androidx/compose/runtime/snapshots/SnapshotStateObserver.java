package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u0001*B.\u0012\'\u0010\u0002\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\u0010\tJ\b\u0010\u0018\u001A\u00020\u0005H\u0002J\u0006\u0010\u0019\u001A\u00020\u0005J\u000E\u0010\u0019\u001A\u00020\u00052\u0006\u0010\u001A\u001A\u00020\u0001J)\u0010\u001B\u001A\u00020\u00052!\u0010\u001C\u001A\u001D\u0012\u0013\u0012\u00110\u0001\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\u00150\u0003J,\u0010\u001D\u001A\b\u0012\u0004\u0012\u0002H\u001E0\f\"\b\b\u0000\u0010\u001E*\u00020\u00012\u0012\u0010\u001F\u001A\u000E\u0012\u0004\u0012\u0002H\u001E\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u001C\u0010 \u001A\u00020\u00052\f\u0010!\u001A\b\u0012\u0004\u0012\u00020\u00010\u000F2\u0006\u0010\"\u001A\u00020\u0010J?\u0010#\u001A\u00020\u0005\"\b\b\u0000\u0010\u001E*\u00020\u00012\u0006\u0010\u001A\u001A\u0002H\u001E2\u0012\u0010$\u001A\u000E\u0012\u0004\u0012\u0002H\u001E\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\u0002\u0010&J\u0006\u0010\'\u001A\u00020\u0005J\u0006\u0010(\u001A\u00020\u0005J\u0014\u0010)\u001A\u00020\u00052\f\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0018\u0010\n\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000BX\u0082\u0004\u00A2\u0006\u0002\n\u0000R&\u0010\r\u001A\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000F\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000EX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001A\u0004\u0018\u00010\u0012X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001A\b\u0012\u0002\b\u0003\u0018\u00010\fX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0014\u001A\u00020\u0015X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0016\u001A\u00020\u0015X\u0082\u000E\u00A2\u0006\u0002\n\u0000R/\u0010\u0002\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u00A8\u0006+"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "(Lkotlin/jvm/functions/Function1;)V", "applyMaps", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ApplyMap;", "applyObserver", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "currentMap", "isObserving", "", "isPaused", "readObserver", "callOnChanged", "clear", "scope", "clearIf", "predicate", "ensureMap", "T", "onChanged", "notifyChanges", "changes", "snapshot", "observeReads", "onValueChangedForScope", "block", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "start", "stop", "withNoObservations", "ApplyMap", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SnapshotStateObserver {
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001E\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0019\u0012\u0012\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000E\u0010\u0018\u001A\u00020\u00052\u0006\u0010\u0019\u001A\u00020\u0002J\u0014\u0010\u001A\u001A\u00020\u00052\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00020\u001CR\u001E\u0010\u0007\u001A\u0004\u0018\u00018\u0000X\u0086\u000E¢\u0006\u0010\n\u0002\u0010\f\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR!\u0010\r\u001A\u0012\u0012\u0004\u0012\u00020\u00020\u000Ej\b\u0012\u0004\u0012\u00020\u0002`\u000F¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u001D"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ApplyMap;", "T", "", "onChanged", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "currentScope", "getCurrentScope", "()Ljava/lang/Object;", "setCurrentScope", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "invalidated", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getInvalidated", "()Ljava/util/HashSet;", "map", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "getMap", "()Landroidx/compose/runtime/collection/IdentityScopeMap;", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "addValue", "value", "callOnChanged", "scopes", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class ApplyMap {
        private Object currentScope;
        private final HashSet invalidated;
        private final IdentityScopeMap map;
        private final Function1 onChanged;

        public ApplyMap(Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "onChanged");
            super();
            this.onChanged = function10;
            this.map = new IdentityScopeMap();
            this.invalidated = new HashSet();
        }

        public final void addValue(Object object0) {
            Intrinsics.checkNotNullParameter(object0, "value");
            Object object1 = this.currentScope;
            Intrinsics.checkNotNull(object1);
            this.map.add(object0, object1);
        }

        public final void callOnChanged(Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "scopes");
            for(Object object0: collection0) {
                this.getOnChanged().invoke(object0);
            }
        }

        public final Object getCurrentScope() {
            return this.currentScope;
        }

        public final HashSet getInvalidated() {
            return this.invalidated;
        }

        public final IdentityScopeMap getMap() {
            return this.map;
        }

        public final Function1 getOnChanged() {
            return this.onChanged;
        }

        public final void setCurrentScope(Object object0) {
            this.currentScope = object0;
        }
    }

    public static final int $stable = 8;
    private final MutableVector applyMaps;
    private final Function2 applyObserver;
    private ObserverHandle applyUnsubscribe;
    private ApplyMap currentMap;
    private boolean isObserving;
    private boolean isPaused;
    private final Function1 onChangedExecutor;
    private final Function1 readObserver;

    static {
    }

    public SnapshotStateObserver(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "onChangedExecutor");
        super();
        this.onChangedExecutor = function10;
        this.applyObserver = new Function2() {
            {
                SnapshotStateObserver.this = snapshotStateObserver0;
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((Set)object0), ((Snapshot)object1));
                return Unit.INSTANCE;
            }

            public final void invoke(Set set0, Snapshot snapshot0) {
                int v18;
                int v12;
                int v11;
                Object[] arr_object1;
                int v7;
                Intrinsics.checkNotNullParameter(set0, "applied");
                Intrinsics.checkNotNullParameter(snapshot0, "$noName_1");
                synchronized(SnapshotStateObserver.this.applyMaps) {
                    MutableVector mutableVector1 = SnapshotStateObserver.this.applyMaps;
                    int v1 = mutableVector1.getSize();
                    if(v1 > 0) {
                        Object[] arr_object = mutableVector1.getContent();
                        int v2 = 0;
                        int v3 = 0;
                        while(true) {
                            ApplyMap snapshotStateObserver$ApplyMap0 = (ApplyMap)arr_object[v2];
                            HashSet hashSet0 = snapshotStateObserver$ApplyMap0.getInvalidated();
                            IdentityScopeMap identityScopeMap0 = snapshotStateObserver$ApplyMap0.getMap();
                            for(Object object0: set0) {
                                int v4 = identityScopeMap0.find(object0);
                                if(v4 >= 0) {
                                    for(Object object1: identityScopeMap0.scopeSetAt(v4)) {
                                        hashSet0.add(object1);
                                        v3 = 1;
                                    }
                                }
                            }
                            if(!hashSet0.isEmpty() == 0) {
                                arr_object1 = arr_object;
                                v12 = v3;
                            }
                            else {
                                int v5 = identityScopeMap0.getSize();
                                if(v5 > 0) {
                                    int v6 = 0;
                                    v7 = 0;
                                    while(true) {
                                        int v8 = identityScopeMap0.getValueOrder()[v6];
                                        IdentityArraySet identityArraySet0 = identityScopeMap0.getScopeSets()[v8];
                                        Intrinsics.checkNotNull(identityArraySet0);
                                        int v9 = identityArraySet0.size();
                                        arr_object1 = arr_object;
                                        if(v9 > 0) {
                                            int v10 = 0;
                                            v11 = 0;
                                            while(true) {
                                                v12 = v3;
                                                Object object2 = identityArraySet0.getValues()[v10];
                                                if(object2 == null) {
                                                    break;
                                                }
                                                if(!hashSet0.contains(object2)) {
                                                    if(v11 != v10) {
                                                        identityArraySet0.getValues()[v11] = object2;
                                                    }
                                                    ++v11;
                                                }
                                                if(v10 + 1 >= v9) {
                                                    goto label_54;
                                                }
                                                ++v10;
                                                v3 = v12;
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                        }
                                        else {
                                            v12 = v3;
                                            v11 = 0;
                                        }
                                    label_54:
                                        int v13 = identityArraySet0.size();
                                        if(v11 < v13) {
                                            for(int v14 = v11; true; ++v14) {
                                                identityArraySet0.getValues()[v14] = null;
                                                if(v14 + 1 >= v13) {
                                                    break;
                                                }
                                            }
                                        }
                                        identityArraySet0.setSize(v11);
                                        if(identityArraySet0.size() > 0) {
                                            if(v7 != v6) {
                                                int v15 = identityScopeMap0.getValueOrder()[v7];
                                                identityScopeMap0.getValueOrder()[v7] = v8;
                                                identityScopeMap0.getValueOrder()[v6] = v15;
                                            }
                                            ++v7;
                                        }
                                        if(v6 + 1 >= v5) {
                                            break;
                                        }
                                        ++v6;
                                        arr_object = arr_object1;
                                        v3 = v12;
                                    }
                                }
                                else {
                                    arr_object1 = arr_object;
                                    v12 = v3;
                                    v7 = 0;
                                }
                                int v16 = identityScopeMap0.getSize();
                                if(v7 < v16) {
                                    for(int v17 = v7; true; ++v17) {
                                        identityScopeMap0.getValues()[identityScopeMap0.getValueOrder()[v17]] = null;
                                        if(v17 + 1 >= v16) {
                                            break;
                                        }
                                    }
                                }
                                identityScopeMap0.setSize(v7);
                            }
                            ++v2;
                            if(v2 >= v1) {
                                v18 = v12;
                                break;
                            }
                            arr_object = arr_object1;
                            v3 = v12;
                        }
                    }
                    else {
                        v18 = 0;
                    }
                }
                if(v18 != 0) {
                    SnapshotStateObserver.this.onChangedExecutor.invoke(new Function0() {
                        {
                            SnapshotStateObserver.this = snapshotStateObserver0;
                            super(0);
                        }

                        @Override  // kotlin.jvm.functions.Function0
                        public Object invoke() {
                            this.invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            SnapshotStateObserver.this.callOnChanged();
                        }
                    });
                }
            }
        };
        this.readObserver = new Function1() {
            {
                SnapshotStateObserver.this = snapshotStateObserver0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(object0);
                return Unit.INSTANCE;
            }

            public final void invoke(Object object0) {
                Intrinsics.checkNotNullParameter(object0, "state");
                if(!SnapshotStateObserver.this.isPaused) {
                    synchronized(SnapshotStateObserver.this.applyMaps) {
                        ApplyMap snapshotStateObserver$ApplyMap0 = SnapshotStateObserver.this.currentMap;
                        Intrinsics.checkNotNull(snapshotStateObserver$ApplyMap0);
                        snapshotStateObserver$ApplyMap0.addValue(object0);
                    }
                }
            }
        };
        this.applyMaps = new MutableVector(new ApplyMap[16], 0);
    }

    private final void callOnChanged() {
        MutableVector mutableVector0 = this.applyMaps;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                ApplyMap snapshotStateObserver$ApplyMap0 = (ApplyMap)arr_object[v1];
                HashSet hashSet0 = snapshotStateObserver$ApplyMap0.getInvalidated();
                Collection collection0 = hashSet0;
                if(!collection0.isEmpty() != 0) {
                    snapshotStateObserver$ApplyMap0.callOnChanged(collection0);
                    hashSet0.clear();
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void clear() {
        synchronized(this.applyMaps) {
            MutableVector mutableVector1 = this.applyMaps;
            int v1 = mutableVector1.getSize();
            if(v1 > 0) {
                Object[] arr_object = mutableVector1.getContent();
                int v2 = 0;
                while(true) {
                    ((ApplyMap)arr_object[v2]).getMap().clear();
                    ++v2;
                    if(v2 >= v1) {
                        break;
                    }
                }
            }
        }
    }

    public final void clear(Object object0) {
        Object[] arr_object1;
        int v9;
        int v5;
        Intrinsics.checkNotNullParameter(object0, "scope");
        synchronized(this.applyMaps) {
            MutableVector mutableVector1 = this.applyMaps;
            int v1 = mutableVector1.getSize();
            if(v1 > 0) {
                Object[] arr_object = mutableVector1.getContent();
                int v2 = 0;
                while(true) {
                    IdentityScopeMap identityScopeMap0 = ((ApplyMap)arr_object[v2]).getMap();
                    int v3 = identityScopeMap0.getSize();
                    if(v3 > 0) {
                        int v4 = 0;
                        v5 = 0;
                        while(true) {
                            int v6 = identityScopeMap0.getValueOrder()[v4];
                            IdentityArraySet identityArraySet0 = identityScopeMap0.getScopeSets()[v6];
                            Intrinsics.checkNotNull(identityArraySet0);
                            int v7 = identityArraySet0.size();
                            if(v7 > 0) {
                                int v8 = 0;
                                v9 = 0;
                                while(true) {
                                    arr_object1 = arr_object;
                                    Object object1 = identityArraySet0.getValues()[v8];
                                    if(object1 == null) {
                                        break;
                                    }
                                    if(object1 != object0) {
                                        if(v9 != v8) {
                                            identityArraySet0.getValues()[v9] = object1;
                                        }
                                        ++v9;
                                    }
                                    if(v8 + 1 >= v7) {
                                        goto label_36;
                                    }
                                    ++v8;
                                    arr_object = arr_object1;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                            else {
                                arr_object1 = arr_object;
                                v9 = 0;
                            }
                        label_36:
                            int v10 = identityArraySet0.size();
                            if(v9 < v10) {
                                for(int v11 = v9; true; ++v11) {
                                    identityArraySet0.getValues()[v11] = null;
                                    if(v11 + 1 >= v10) {
                                        break;
                                    }
                                }
                            }
                            identityArraySet0.setSize(v9);
                            if(identityArraySet0.size() > 0) {
                                if(v5 != v4) {
                                    int v12 = identityScopeMap0.getValueOrder()[v5];
                                    identityScopeMap0.getValueOrder()[v5] = v6;
                                    identityScopeMap0.getValueOrder()[v4] = v12;
                                }
                                ++v5;
                            }
                            if(v4 + 1 >= v3) {
                                break;
                            }
                            ++v4;
                            arr_object = arr_object1;
                        }
                    }
                    else {
                        arr_object1 = arr_object;
                        v5 = 0;
                    }
                    int v13 = identityScopeMap0.getSize();
                    if(v5 < v13) {
                        for(int v14 = v5; true; ++v14) {
                            identityScopeMap0.getValues()[identityScopeMap0.getValueOrder()[v14]] = null;
                            if(v14 + 1 >= v13) {
                                break;
                            }
                        }
                    }
                    identityScopeMap0.setSize(v5);
                    ++v2;
                    if(v2 >= v1) {
                        break;
                    }
                    arr_object = arr_object1;
                }
            }
        }
    }

    public final void clearIf(Function1 function10) {
        Object[] arr_object1;
        int v9;
        int v5;
        Intrinsics.checkNotNullParameter(function10, "predicate");
        synchronized(this.applyMaps) {
            MutableVector mutableVector1 = this.applyMaps;
            int v1 = mutableVector1.getSize();
            if(v1 > 0) {
                Object[] arr_object = mutableVector1.getContent();
                int v2 = 0;
                while(true) {
                    IdentityScopeMap identityScopeMap0 = ((ApplyMap)arr_object[v2]).getMap();
                    int v3 = identityScopeMap0.getSize();
                    if(v3 > 0) {
                        int v4 = 0;
                        v5 = 0;
                        while(true) {
                            int v6 = identityScopeMap0.getValueOrder()[v4];
                            IdentityArraySet identityArraySet0 = identityScopeMap0.getScopeSets()[v6];
                            Intrinsics.checkNotNull(identityArraySet0);
                            int v7 = identityArraySet0.size();
                            if(v7 > 0) {
                                int v8 = 0;
                                v9 = 0;
                                while(true) {
                                    arr_object1 = arr_object;
                                    Object object0 = identityArraySet0.getValues()[v8];
                                    if(object0 == null) {
                                        break;
                                    }
                                    if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                                        if(v9 != v8) {
                                            identityArraySet0.getValues()[v9] = object0;
                                        }
                                        ++v9;
                                    }
                                    if(v8 + 1 >= v7) {
                                        goto label_36;
                                    }
                                    ++v8;
                                    arr_object = arr_object1;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                            else {
                                arr_object1 = arr_object;
                                v9 = 0;
                            }
                        label_36:
                            int v10 = identityArraySet0.size();
                            if(v9 < v10) {
                                for(int v11 = v9; true; ++v11) {
                                    identityArraySet0.getValues()[v11] = null;
                                    if(v11 + 1 >= v10) {
                                        break;
                                    }
                                }
                            }
                            identityArraySet0.setSize(v9);
                            if(identityArraySet0.size() > 0) {
                                if(v5 != v4) {
                                    int v12 = identityScopeMap0.getValueOrder()[v5];
                                    identityScopeMap0.getValueOrder()[v5] = v6;
                                    identityScopeMap0.getValueOrder()[v4] = v12;
                                }
                                ++v5;
                            }
                            if(v4 + 1 >= v3) {
                                break;
                            }
                            ++v4;
                            arr_object = arr_object1;
                        }
                    }
                    else {
                        arr_object1 = arr_object;
                        v5 = 0;
                    }
                    int v13 = identityScopeMap0.getSize();
                    if(v5 < v13) {
                        for(int v14 = v5; true; ++v14) {
                            identityScopeMap0.getValues()[identityScopeMap0.getValueOrder()[v14]] = null;
                            if(v14 + 1 >= v13) {
                                break;
                            }
                        }
                    }
                    identityScopeMap0.setSize(v5);
                    ++v2;
                    if(v2 >= v1) {
                        break;
                    }
                    arr_object = arr_object1;
                }
            }
        }
    }

    private final ApplyMap ensureMap(Function1 function10) {
        int v1;
        MutableVector mutableVector0 = this.applyMaps;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            v1 = 0;
            while(true) {
                if(((ApplyMap)arr_object[v1]).getOnChanged() == function10) {
                    goto label_9;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        v1 = -1;
    label_9:
        if(v1 == -1) {
            ApplyMap snapshotStateObserver$ApplyMap0 = new ApplyMap(function10);
            this.applyMaps.add(snapshotStateObserver$ApplyMap0);
            return snapshotStateObserver$ApplyMap0;
        }
        return (ApplyMap)this.applyMaps.getContent()[v1];
    }

    public final void notifyChanges(Set set0, Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(set0, "changes");
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        this.applyObserver.invoke(set0, snapshot0);
    }

    public final void observeReads(Object object0, Function1 function10, Function0 function00) {
        ApplyMap snapshotStateObserver$ApplyMap1;
        int v7;
        int v4;
        Intrinsics.checkNotNullParameter(object0, "scope");
        Intrinsics.checkNotNullParameter(function10, "onValueChangedForScope");
        Intrinsics.checkNotNullParameter(function00, "block");
        ApplyMap snapshotStateObserver$ApplyMap0 = this.currentMap;
        boolean z = this.isPaused;
        synchronized(this.applyMaps) {
            snapshotStateObserver$ApplyMap1 = this.ensureMap(function10);
        }
        Object object1 = snapshotStateObserver$ApplyMap1.getCurrentScope();
        snapshotStateObserver$ApplyMap1.setCurrentScope(object0);
        this.currentMap = snapshotStateObserver$ApplyMap1;
        this.isPaused = false;
        if(this.isObserving) {
            function00.invoke();
        }
        else {
            try {
                this.isObserving = true;
                MutableVector mutableVector0 = this.applyMaps;
                synchronized(mutableVector0) {
                    IdentityScopeMap identityScopeMap0 = snapshotStateObserver$ApplyMap1.getMap();
                    int v2 = identityScopeMap0.getSize();
                    if(v2 > 0) {
                        v4 = 0;
                        for(int v3 = 0; true; ++v3) {
                            int v5 = identityScopeMap0.getValueOrder()[v3];
                            IdentityArraySet identityArraySet0 = identityScopeMap0.getScopeSets()[v5];
                            Intrinsics.checkNotNull(identityArraySet0);
                            int v6 = identityArraySet0.size();
                            if(v6 > 0) {
                                v7 = 0;
                                for(int v8 = 0; true; ++v8) {
                                    Object object2 = identityArraySet0.getValues()[v8];
                                    if(object2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    }
                                    if(object2 != object0) {
                                        if(v7 != v8) {
                                            identityArraySet0.getValues()[v7] = object2;
                                        }
                                        ++v7;
                                    }
                                    if(v8 + 1 >= v6) {
                                        break;
                                    }
                                }
                            }
                            else {
                                v7 = 0;
                            }
                            int v9 = identityArraySet0.size();
                            if(v7 < v9) {
                                for(int v10 = v7; true; ++v10) {
                                    identityArraySet0.getValues()[v10] = null;
                                    if(v10 + 1 >= v9) {
                                        break;
                                    }
                                }
                            }
                            identityArraySet0.setSize(v7);
                            if(identityArraySet0.size() > 0) {
                                if(v4 != v3) {
                                    int v11 = identityScopeMap0.getValueOrder()[v4];
                                    identityScopeMap0.getValueOrder()[v4] = v5;
                                    identityScopeMap0.getValueOrder()[v3] = v11;
                                }
                                ++v4;
                            }
                            if(v3 + 1 >= v2) {
                                break;
                            }
                        }
                    }
                    else {
                        v4 = 0;
                    }
                    int v12 = identityScopeMap0.getSize();
                    if(v4 < v12) {
                        for(int v13 = v4; true; ++v13) {
                            identityScopeMap0.getValues()[identityScopeMap0.getValueOrder()[v13]] = null;
                            if(v13 + 1 >= v12) {
                                break;
                            }
                        }
                    }
                    identityScopeMap0.setSize(v4);
                }
                Snapshot.Companion.observe(this.readObserver, null, function00);
                this.isObserving = false;
            }
            catch(Throwable throwable0) {
                this.isObserving = false;
                throw throwable0;
            }
        }
        this.currentMap = snapshotStateObserver$ApplyMap0;
        snapshotStateObserver$ApplyMap1.setCurrentScope(object1);
        this.isPaused = z;
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.Companion.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle0 = this.applyUnsubscribe;
        if(observerHandle0 != null) {
            observerHandle0.dispose();
        }
    }

    public final void withNoObservations(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        boolean z = this.isPaused;
        this.isPaused = true;
        try {
            function00.invoke();
            this.isPaused = z;
        }
        catch(Throwable throwable0) {
            this.isPaused = z;
            throw throwable0;
        }
    }
}

