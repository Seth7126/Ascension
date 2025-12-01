package androidx.compose.ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012J\u001C\u0010\u0002\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J\u001C\u0010\u0007\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J5\u0010\b\u001A\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001A\u0002H\t2\u0018\u0010\u000B\u001A\u0014\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ5\u0010\u000E\u001A\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001A\u0002H\t2\u0018\u0010\u000B\u001A\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ\u0011\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\u0000H\u0096\u0004¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "all", "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", "Companion", "Element", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface Modifier {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001C\u0010\u0003\u001A\u00020\u00042\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\u001C\u0010\b\u001A\u00020\u00042\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J5\u0010\t\u001A\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000B\u001A\u0002H\n2\u0018\u0010\f\u001A\u0014\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000EJ5\u0010\u000F\u001A\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000B\u001A\u0002H\n2\u0018\u0010\f\u001A\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000EJ\u0011\u0010\u0010\u001A\u00020\u00012\u0006\u0010\u0011\u001A\u00020\u0001H\u0096\u0004J\b\u0010\u0012\u001A\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "()V", "all", "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", "toString", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion implements Modifier {
        static final Companion $$INSTANCE;

        static {
            Companion.$$INSTANCE = new Companion();
        }

        @Override  // androidx.compose.ui.Modifier
        public boolean all(Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return true;
        }

        @Override  // androidx.compose.ui.Modifier
        public boolean any(Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "predicate");
            return false;
        }

        @Override  // androidx.compose.ui.Modifier
        public Object foldIn(Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(function20, "operation");
            return object0;
        }

        @Override  // androidx.compose.ui.Modifier
        public Object foldOut(Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(function20, "operation");
            return object0;
        }

        @Override  // androidx.compose.ui.Modifier
        public Modifier then(Modifier modifier0) {
            Intrinsics.checkNotNullParameter(modifier0, "other");
            return modifier0;
        }

        @Override
        public String toString() {
            return "Modifier";
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static Modifier then(Modifier modifier0, Modifier modifier1) {
            Intrinsics.checkNotNullParameter(modifier0, "this");
            Intrinsics.checkNotNullParameter(modifier1, "other");
            return modifier1 != Modifier.Companion ? new CombinedModifier(modifier0, modifier1) : modifier0;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u001C\u0010\u0006\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J5\u0010\u0007\u001A\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001A\u0002H\b2\u0018\u0010\n\u001A\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b0\u000BH\u0016¢\u0006\u0002\u0010\fJ5\u0010\r\u001A\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001A\u0002H\b2\u0018\u0010\n\u001A\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u000BH\u0016¢\u0006\u0002\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", "all", "", "predicate", "Lkotlin/Function1;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public interface Element extends Modifier {
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
        public static final class androidx.compose.ui.Modifier.Element.DefaultImpls {
            public static boolean all(Element modifier$Element0, Function1 function10) {
                Intrinsics.checkNotNullParameter(modifier$Element0, "this");
                Intrinsics.checkNotNullParameter(function10, "predicate");
                return ((Boolean)function10.invoke(modifier$Element0)).booleanValue();
            }

            public static boolean any(Element modifier$Element0, Function1 function10) {
                Intrinsics.checkNotNullParameter(modifier$Element0, "this");
                Intrinsics.checkNotNullParameter(function10, "predicate");
                return ((Boolean)function10.invoke(modifier$Element0)).booleanValue();
            }

            public static Object foldIn(Element modifier$Element0, Object object0, Function2 function20) {
                Intrinsics.checkNotNullParameter(modifier$Element0, "this");
                Intrinsics.checkNotNullParameter(function20, "operation");
                return function20.invoke(object0, modifier$Element0);
            }

            public static Object foldOut(Element modifier$Element0, Object object0, Function2 function20) {
                Intrinsics.checkNotNullParameter(modifier$Element0, "this");
                Intrinsics.checkNotNullParameter(function20, "operation");
                return function20.invoke(modifier$Element0, object0);
            }

            public static Modifier then(Element modifier$Element0, Modifier modifier0) {
                Intrinsics.checkNotNullParameter(modifier$Element0, "this");
                Intrinsics.checkNotNullParameter(modifier0, "other");
                return DefaultImpls.then(modifier$Element0, modifier0);
            }
        }

        @Override  // androidx.compose.ui.Modifier
        boolean all(Function1 arg1);

        @Override  // androidx.compose.ui.Modifier
        boolean any(Function1 arg1);

        @Override  // androidx.compose.ui.Modifier
        Object foldIn(Object arg1, Function2 arg2);

        @Override  // androidx.compose.ui.Modifier
        Object foldOut(Object arg1, Function2 arg2);
    }

    public static final Companion Companion;

    static {
        Modifier.Companion = Companion.$$INSTANCE;
    }

    boolean all(Function1 arg1);

    boolean any(Function1 arg1);

    Object foldIn(Object arg1, Function2 arg2);

    Object foldOut(Object arg1, Function2 arg2);

    Modifier then(Modifier arg1);
}

