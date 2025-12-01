package androidx.compose.runtime;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001A\u00020\bH&J \u0010\t\u001A\u00020\b2\u0011\u0010\n\u001A\r\u0012\u0004\u0012\u00020\b0\u000B¢\u0006\u0002\b\fH&¢\u0006\u0002\u0010\rJ\b\u0010\u000E\u001A\u00020\bH&J\u0016\u0010\u000F\u001A\u00020\u00032\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00120\u0011H&J\u0016\u0010\u0013\u001A\u00020\b2\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\b0\u000BH&J\b\u0010\u0015\u001A\u00020\u0003H&J\u0016\u0010\u0016\u001A\u00020\b2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00120\u0011H&J\u0010\u0010\u0017\u001A\u00020\b2\u0006\u0010\u0018\u001A\u00020\u0012H&J\u0010\u0010\u0019\u001A\u00020\b2\u0006\u0010\u0018\u001A\u00020\u0012H&J\b\u0010\u001A\u001A\u00020\bH\'R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0005¨\u0006\u001B"}, d2 = {"Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Composition;", "hasPendingChanges", "", "getHasPendingChanges", "()Z", "isComposing", "applyChanges", "", "composeContent", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;)V", "invalidateAll", "observesAnyOf", "values", "", "", "prepareCompose", "block", "recompose", "recordModificationsOf", "recordReadOf", "value", "recordWriteOf", "verifyConsistent", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface ControlledComposition extends Composition {
    void applyChanges();

    void composeContent(Function2 arg1);

    boolean getHasPendingChanges();

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(Set arg1);

    void prepareCompose(Function0 arg1);

    boolean recompose();

    void recordModificationsOf(Set arg1);

    void recordReadOf(Object arg1);

    void recordWriteOf(Object arg1);

    @InternalComposeApi
    void verifyConsistent();
}

