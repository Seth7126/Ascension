package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\b\u0004\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0012\u001A\u00028\u0000H!¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001A\u00028\u00008Ç\u0002¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\nR \u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\fX\u0080\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\r\u0010\b\u001A\u0004\b\u000E\u0010\u000F\u0082\u0001\u0001\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/CompositionLocal;", "T", "", "defaultFactory", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "current", "getCurrent$annotations", "()V", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "defaultValueHolder", "Landroidx/compose/runtime/LazyValueHolder;", "getDefaultValueHolder$runtime_release$annotations", "getDefaultValueHolder$runtime_release", "()Landroidx/compose/runtime/LazyValueHolder;", "provided", "Landroidx/compose/runtime/State;", "value", "provided$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class CompositionLocal {
    private final LazyValueHolder defaultValueHolder;

    private CompositionLocal(Function0 function00) {
        this.defaultValueHolder = new LazyValueHolder(function00);
    }

    public CompositionLocal(Function0 function00, DefaultConstructorMarker defaultConstructorMarker0) {
        this(function00);
    }

    public final Object getCurrent(Composer composer0, int v) {
        ComposerKt.sourceInformationMarkerStart(composer0, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object object0 = composer0.consume(this);
        ComposerKt.sourceInformationMarkerEnd(composer0);
        return object0;
    }

    public static void getCurrent$annotations() {
    }

    public final LazyValueHolder getDefaultValueHolder$runtime_release() {
        return this.defaultValueHolder;
    }

    public static void getDefaultValueHolder$runtime_release$annotations() {
    }

    public abstract State provided$runtime_release(Object arg1, Composer arg2, int arg3);
}

