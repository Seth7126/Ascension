package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000F\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0096\u0002J\u001B\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\b\u0010\f\u001A\u0004\u0018\u00010\rH\u0086\u0002R\u0014\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/platform/ValueElementSequence;", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "()V", "elements", "", "iterator", "", "set", "", "name", "", "value", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ValueElementSequence implements Sequence {
    public static final int $stable = 8;
    private final List elements;

    static {
    }

    public ValueElementSequence() {
        this.elements = new ArrayList();
    }

    @Override  // kotlin.sequences.Sequence
    public Iterator iterator() {
        return this.elements.iterator();
    }

    public final void set(String s, Object object0) {
        Intrinsics.checkNotNullParameter(s, "name");
        ValueElement valueElement0 = new ValueElement(s, object0);
        this.elements.add(valueElement0);
    }
}

