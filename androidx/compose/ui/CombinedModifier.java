package androidx.compose.ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0001¢\u0006\u0002\u0010\u0004J\u001C\u0010\u0005\u001A\u00020\u00062\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u001C\u0010\n\u001A\u00020\u00062\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0013\u0010\u000B\u001A\u00020\u00062\b\u0010\f\u001A\u0004\u0018\u00010\rH\u0096\u0002J5\u0010\u000E\u001A\u0002H\u000F\"\u0004\b\u0000\u0010\u000F2\u0006\u0010\u0010\u001A\u0002H\u000F2\u0018\u0010\u0011\u001A\u0014\u0012\u0004\u0012\u0002H\u000F\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u000F0\u0012H\u0016¢\u0006\u0002\u0010\u0013J5\u0010\u0014\u001A\u0002H\u000F\"\u0004\b\u0000\u0010\u000F2\u0006\u0010\u0010\u001A\u0002H\u000F2\u0018\u0010\u0011\u001A\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u000F\u0012\u0004\u0012\u0002H\u000F0\u0012H\u0016¢\u0006\u0002\u0010\u0013J\b\u0010\u0015\u001A\u00020\u0016H\u0016J\b\u0010\u0017\u001A\u00020\u0018H\u0016R\u000E\u0010\u0003\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0002\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/CombinedModifier;", "Landroidx/compose/ui/Modifier;", "outer", "inner", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)V", "all", "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", "any", "equals", "other", "", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class CombinedModifier implements Modifier {
    public static final int $stable;
    private final Modifier inner;
    private final Modifier outer;

    static {
    }

    public CombinedModifier(Modifier modifier0, Modifier modifier1) {
        Intrinsics.checkNotNullParameter(modifier0, "outer");
        Intrinsics.checkNotNullParameter(modifier1, "inner");
        super();
        this.outer = modifier0;
        this.inner = modifier1;
    }

    @Override  // androidx.compose.ui.Modifier
    public boolean all(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        return this.outer.all(function10) && this.inner.all(function10);
    }

    @Override  // androidx.compose.ui.Modifier
    public boolean any(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        return this.outer.any(function10) || this.inner.any(function10);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof CombinedModifier && Intrinsics.areEqual(this.outer, ((CombinedModifier)object0).outer) && Intrinsics.areEqual(this.inner, ((CombinedModifier)object0).inner);
    }

    @Override  // androidx.compose.ui.Modifier
    public Object foldIn(Object object0, Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "operation");
        Object object1 = this.outer.foldIn(object0, function20);
        return this.inner.foldIn(object1, function20);
    }

    @Override  // androidx.compose.ui.Modifier
    public Object foldOut(Object object0, Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "operation");
        Object object1 = this.inner.foldOut(object0, function20);
        return this.outer.foldOut(object1, function20);
    }

    @Override
    public int hashCode() {
        return this.outer.hashCode() + this.inner.hashCode() * 0x1F;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }

    @Override
    public String toString() {
        return "[" + ((String)this.foldIn("", androidx.compose.ui.CombinedModifier.toString.1.INSTANCE)) + ']';

        @Metadata(d1 = {"\u0000\u000E\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001A\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\n"}, d2 = {"", "acc", "Landroidx/compose/ui/Modifier$Element;", "element", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.CombinedModifier.toString.1 extends Lambda implements Function2 {
            public static final androidx.compose.ui.CombinedModifier.toString.1 INSTANCE;

            static {
                androidx.compose.ui.CombinedModifier.toString.1.INSTANCE = new androidx.compose.ui.CombinedModifier.toString.1();
            }

            androidx.compose.ui.CombinedModifier.toString.1() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((String)object0), ((Element)object1));
            }

            public final String invoke(String s, Element modifier$Element0) {
                Intrinsics.checkNotNullParameter(s, "acc");
                Intrinsics.checkNotNullParameter(modifier$Element0, "element");
                return s.length() == 0 ? s + ", " + modifier$Element0 : modifier$Element0.toString();
            }
        }

    }
}

