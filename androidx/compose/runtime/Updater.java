package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0005\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0002H\u00D6\u0003\u00A2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u000FH\u00D6\u0001\u00A2\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0012\u001A\u00020\u00132\u0017\u0010\u0014\u001A\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0015\u00A2\u0006\u0002\b\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001A\u00020\u00132\u0017\u0010\u0014\u001A\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0015\u00A2\u0006\u0002\b\u0016\u00A2\u0006\u0004\b\u001A\u0010\u0018JI\u0010\u001B\u001A\u00020\u0013\"\u0004\b\u0001\u0010\u001C2\u0006\u0010\u001D\u001A\u0002H\u001C2,\u0010\u0014\u001A(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H\u001C\u00A2\u0006\f\b\u001F\u0012\b\b \u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\u00130\u001E\u00A2\u0006\u0002\b\u0016\u00A2\u0006\u0004\b!\u0010\"JK\u0010\u001B\u001A\u00020\u00132\u0006\u0010\u001D\u001A\u00020\u000F2.\b\b\u0010\u0014\u001A(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\u001F\u0012\b\b \u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\u00130\u001E\u00A2\u0006\u0002\b\u0016H\u0086\b\u00F8\u0001\u0001\u00A2\u0006\u0004\b!\u0010#J\u0010\u0010$\u001A\u00020%H\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\'JI\u0010(\u001A\u00020\u0013\"\u0004\b\u0001\u0010\u001C2\u0006\u0010\u001D\u001A\u0002H\u001C2,\u0010\u0014\u001A(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H\u001C\u00A2\u0006\f\b\u001F\u0012\b\b \u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\u00130\u001E\u00A2\u0006\u0002\b\u0016\u00A2\u0006\u0004\b)\u0010\"JK\u0010(\u001A\u00020\u00132\u0006\u0010\u001D\u001A\u00020\u000F2.\b\b\u0010\u0014\u001A(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b\u001F\u0012\b\b \u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\u00130\u001E\u00A2\u0006\u0002\b\u0016H\u0086\b\u00F8\u0001\u0001\u00A2\u0006\u0004\b)\u0010#R\u0016\u0010\u0003\u001A\u00020\u00048\u0000X\u0081\u0004\u00A2\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0004\u00F8\u0001\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u009920\u0001\u00A8\u0006*"}, d2 = {"Landroidx/compose/runtime/Updater;", "T", "", "composer", "Landroidx/compose/runtime/Composer;", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "equals", "", "other", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", "init", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "init-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "reconcile", "reconcile-impl", "set", "V", "value", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "set-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "(Landroidx/compose/runtime/Composer;ILkotlin/jvm/functions/Function2;)V", "toString", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "update", "update-impl", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class Updater {
    private final Composer composer;

    private Updater(Composer composer0) {
        this.composer = composer0;
    }

    public static final Updater box-impl(Composer composer0) {
        return new Updater(composer0);
    }

    public static Composer constructor-impl(Composer composer0) {
        Intrinsics.checkNotNullParameter(composer0, "composer");
        return composer0;
    }

    @Override
    public boolean equals(Object object0) {
        return Updater.equals-impl(this.unbox-impl(), object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(Composer composer0, Object object0) {
        return object0 instanceof Updater ? Intrinsics.areEqual(composer0, ((Updater)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(Composer composer0, Composer composer1) {
        return Intrinsics.areEqual(composer0, composer1);
    }

    public static void getComposer$annotations() {
    }

    @Override
    public int hashCode() {
        return Updater.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(Composer composer0) {
        return composer0.hashCode();
    }

    public static final void init-impl(Composer composer0, Function1 function10) {
        Intrinsics.checkNotNullParameter(composer0, "arg0");
        Intrinsics.checkNotNullParameter(function10, "block");
        if(composer0.getInserting()) {
            Function2 function20 = new Function2(function10) {
                final Function1 $block;

                {
                    this.$block = function10;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(object0, ((Unit)object1));
                    return Unit.INSTANCE;
                }

                public final void invoke(Object object0, Unit unit0) {
                    Intrinsics.checkNotNullParameter(unit0, "it");
                    this.$block.invoke(object0);
                }
            };
            composer0.apply(Unit.INSTANCE, function20);
        }
    }

    public static final void reconcile-impl(Composer composer0, Function1 function10) {
        Intrinsics.checkNotNullParameter(composer0, "arg0");
        Intrinsics.checkNotNullParameter(function10, "block");
        Function2 function20 = new Function2(function10) {
            final Function1 $block;

            {
                this.$block = function10;
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(object0, ((Unit)object1));
                return Unit.INSTANCE;
            }

            public final void invoke(Object object0, Unit unit0) {
                Intrinsics.checkNotNullParameter(unit0, "it");
                this.$block.invoke(object0);
            }
        };
        composer0.apply(Unit.INSTANCE, function20);
    }

    public static final void set-impl(Composer composer0, int v, Function2 function20) {
        Intrinsics.checkNotNullParameter(composer0, "arg0");
        Intrinsics.checkNotNullParameter(function20, "block");
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v)) {
            composer0.updateRememberedValue(v);
            composer0.apply(v, function20);
        }
    }

    public static final void set-impl(Composer composer0, Object object0, Function2 function20) {
        Intrinsics.checkNotNullParameter(composer0, "arg0");
        Intrinsics.checkNotNullParameter(function20, "block");
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), object0)) {
            composer0.updateRememberedValue(object0);
            composer0.apply(object0, function20);
        }
    }

    @Override
    public String toString() {
        return "Updater(composer=" + this.unbox-impl() + ')';
    }

    public static String toString-impl(Composer composer0) [...] // Inlined contents

    public final Composer unbox-impl() {
        return this.composer;
    }

    public static final void update-impl(Composer composer0, int v, Function2 function20) {
        Intrinsics.checkNotNullParameter(composer0, "arg0");
        Intrinsics.checkNotNullParameter(function20, "block");
        boolean z = composer0.getInserting();
        if(z || !Intrinsics.areEqual(composer0.rememberedValue(), v)) {
            composer0.updateRememberedValue(v);
            if(!z) {
                composer0.apply(v, function20);
            }
        }
    }

    public static final void update-impl(Composer composer0, Object object0, Function2 function20) {
        Intrinsics.checkNotNullParameter(composer0, "arg0");
        Intrinsics.checkNotNullParameter(function20, "block");
        boolean z = composer0.getInserting();
        if(z || !Intrinsics.areEqual(composer0.rememberedValue(), object0)) {
            composer0.updateRememberedValue(object0);
            if(!z) {
                composer0.apply(object0, function20);
            }
        }
    }
}

