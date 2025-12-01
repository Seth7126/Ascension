package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0012\u0012\u0006\u0010\u0003\u001A\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0016\u001A\u00020\u00172\u001D\u0010\u0018\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001A\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0002\b\u001BH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001C\u0010\u001DR\u0016\u0010\u0003\u001A\u00020\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u001E"}, d2 = {"Landroidx/compose/runtime/SkippableUpdater;", "T", "", "composer", "Landroidx/compose/runtime/Composer;", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "equals", "", "other", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", "toString", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "update", "", "block", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Lkotlin/ExtensionFunctionType;", "update-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class SkippableUpdater {
    private final Composer composer;

    private SkippableUpdater(Composer composer0) {
        this.composer = composer0;
    }

    public static final SkippableUpdater box-impl(Composer composer0) {
        return new SkippableUpdater(composer0);
    }

    public static Composer constructor-impl(Composer composer0) {
        Intrinsics.checkNotNullParameter(composer0, "composer");
        return composer0;
    }

    @Override
    public boolean equals(Object object0) {
        return SkippableUpdater.equals-impl(this.unbox-impl(), object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(Composer composer0, Object object0) {
        return object0 instanceof SkippableUpdater ? Intrinsics.areEqual(composer0, ((SkippableUpdater)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(Composer composer0, Composer composer1) {
        return Intrinsics.areEqual(composer0, composer1);
    }

    public static void getComposer$annotations() {
    }

    @Override
    public int hashCode() {
        return SkippableUpdater.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(Composer composer0) {
        return composer0.hashCode();
    }

    @Override
    public String toString() {
        return "SkippableUpdater(composer=" + this.unbox-impl() + ')';
    }

    public static String toString-impl(Composer composer0) [...] // Inlined contents

    public final Composer unbox-impl() {
        return this.composer;
    }

    public static final void update-impl(Composer composer0, Function1 function10) {
        Intrinsics.checkNotNullParameter(composer0, "arg0");
        Intrinsics.checkNotNullParameter(function10, "block");
        composer0.startReplaceableGroup(509942095);
        function10.invoke(Updater.box-impl(Updater.constructor-impl(composer0)));
        composer0.endReplaceableGroup();
    }
}

