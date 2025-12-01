package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.FunctionN;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J(\u0010\u0011\u001A\u0004\u0018\u00010\t2\u0016\u0010\u0012\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0013\"\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u00032\u0006\u0010\u0016\u001A\u00020\u0003H\u0002J\u0010\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u001AH\u0002J\b\u0010\u001B\u001A\u00020\u0018H\u0002J\u000E\u0010\u001C\u001A\u00020\u00182\u0006\u0010\u001D\u001A\u00020\tR\u0010\u0010\b\u001A\u0004\u0018\u00010\tX\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001A\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0010\u0010\r\u001A\u0004\u0018\u00010\u000EX\u0082\u000E¢\u0006\u0002\n\u0000R\u0016\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u000E\u0018\u00010\u0010X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001E"}, d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaNImpl;", "Landroidx/compose/runtime/internal/ComposableLambdaN;", "key", "", "tracked", "", "arity", "(IZI)V", "_block", "", "getArity", "()I", "getKey", "scope", "Landroidx/compose/runtime/RecomposeScope;", "scopes", "", "invoke", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "realParamCount", "params", "trackRead", "", "composer", "Landroidx/compose/runtime/Composer;", "trackWrite", "update", "block", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    private Object _block;
    private final int arity;
    private final int key;
    private RecomposeScope scope;
    private List scopes;
    private final boolean tracked;

    public ComposableLambdaNImpl(int v, boolean z, int v1) {
        this.key = v;
        this.tracked = z;
        this.arity = v1;
    }

    @Override  // kotlin.jvm.functions.FunctionN
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override  // kotlin.jvm.functions.FunctionN
    public Object invoke(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "args");
        int v = this.realParamCount(arr_object.length);
        Object object0 = arr_object[v];
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.Composer");
        }
        Object[] arr_object1 = ArraysKt.slice(arr_object, RangesKt.until(0, arr_object.length - 1)).toArray(new Object[0]);
        if(arr_object1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object object1 = arr_object[arr_object.length - 1];
        if(object1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        int v1 = (int)(((Integer)object1));
        Composer composer0 = ((Composer)object0).startRestartGroup(this.key);
        this.trackRead(composer0);
        int v2 = composer0.changed(this) ? ComposableLambdaKt.differentBits(v) : ComposableLambdaKt.sameBits(v);
        Object object2 = this._block;
        if(object2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        }
        SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
        spreadBuilder0.addSpread(arr_object1);
        spreadBuilder0.add(((int)(v1 | v2)));
        Object object3 = ((FunctionN)object2).invoke(spreadBuilder0.toArray(new Object[spreadBuilder0.size()]));
        ScopeUpdateScope scopeUpdateScope0 = composer0.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(v, this) {
                final Object[] $args;
                final int $realParams;

                {
                    this.$args = arr_object;
                    this.$realParams = v;
                    ComposableLambdaNImpl.this = composableLambdaNImpl0;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    Intrinsics.checkNotNullParameter(composer0, "nc");
                    IntRange intRange0 = RangesKt.until(0, this.$realParams);
                    Object[] arr_object = ArraysKt.slice(this.$args, intRange0).toArray(new Object[0]);
                    if(arr_object == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    Object object0 = this.$args[this.$realParams + 1];
                    if(object0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    int v1 = (int)(((Integer)object0));
                    IntRange intRange1 = RangesKt.until(this.$realParams + 2, this.$args.length);
                    Object[] arr_object1 = ArraysKt.slice(this.$args, intRange1).toArray(new Object[0]);
                    if(arr_object1 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    SpreadBuilder spreadBuilder0 = new SpreadBuilder(4);
                    spreadBuilder0.addSpread(arr_object);
                    spreadBuilder0.add(composer0);
                    spreadBuilder0.add(((int)(v1 | 1)));
                    spreadBuilder0.addSpread(arr_object1);
                    Object[] arr_object2 = spreadBuilder0.toArray(new Object[spreadBuilder0.size()]);
                    ComposableLambdaNImpl.this.invoke(arr_object2);
                }
            });
        }
        return object3;
    }

    private final int realParamCount(int v) {
        int v1 = v - 2;
        for(int v2 = 1; v2 * 10 < v1; ++v2) {
            --v1;
        }
        return v1;
    }

    private final void trackRead(Composer composer0) {
        if(this.tracked) {
            RecomposeScope recomposeScope0 = composer0.getRecomposeScope();
            if(recomposeScope0 != null) {
                composer0.recordUsed(recomposeScope0);
                if(ComposableLambdaKt.replacableWith(this.scope, recomposeScope0)) {
                    this.scope = recomposeScope0;
                    return;
                }
                List list0 = this.scopes;
                if(list0 == null) {
                    List list1 = new ArrayList();
                    this.scopes = list1;
                    list1.add(recomposeScope0);
                    return;
                }
                int v = list0.size();
                if(v > 0) {
                    for(int v1 = 0; true; ++v1) {
                        if(ComposableLambdaKt.replacableWith(((RecomposeScope)list0.get(v1)), recomposeScope0)) {
                            list0.set(v1, recomposeScope0);
                            return;
                        }
                        if(v1 + 1 >= v) {
                            break;
                        }
                    }
                }
                list0.add(recomposeScope0);
            }
        }
    }

    private final void trackWrite() {
        if(this.tracked) {
            RecomposeScope recomposeScope0 = this.scope;
            if(recomposeScope0 != null) {
                recomposeScope0.invalidate();
                this.scope = null;
            }
            List list0 = this.scopes;
            if(list0 != null) {
                int v = list0.size();
                if(v > 0) {
                    for(int v1 = 0; true; ++v1) {
                        ((RecomposeScope)list0.get(v1)).invalidate();
                        if(v1 + 1 >= v) {
                            break;
                        }
                    }
                }
                list0.clear();
            }
        }
    }

    public final void update(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "block");
        if(!Intrinsics.areEqual(object0, this._block)) {
            boolean z = this._block == null;
            this._block = (FunctionN)object0;
            if(!z) {
                this.trackWrite();
            }
        }
    }
}

