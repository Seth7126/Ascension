package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0013\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B$\u0012\u0018\b\u0002\u0010\u0003\u001A\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\f\u001A\u00020\r¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0010\u001A\u00020\u00112\b\u0010\u0012\u001A\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000BJ\r\u0010\u0017\u001A\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001A\u001A\u00020\u0011¢\u0006\u0004\b\u001B\u0010\u0019J\r\u0010\u001C\u001A\u00028\u0000¢\u0006\u0004\b\u001D\u0010\u001EJ\r\u0010\u001F\u001A\u00028\u0000¢\u0006\u0004\b \u0010\u001EJ\u0015\u0010!\u001A\u00020\u00112\u0006\u0010\"\u001A\u00028\u0000¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010$\u001A\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010\'R\u001E\u0010\u0003\u001A\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001A\u00020\t8F¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B\u0088\u0001\u0003\u0092\u0001\u0012\u0012\u0004\u0012\u0002H\u00010\u0004j\b\u0012\u0004\u0012\u0002H\u0001`\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/vector/Stack;", "T", "", "backing", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "constructor-impl", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "size", "", "getSize-impl", "(Ljava/util/ArrayList;)I", "clear", "", "clear-impl", "(Ljava/util/ArrayList;)V", "equals", "", "other", "equals-impl", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "(Ljava/util/ArrayList;)Z", "isNotEmpty", "isNotEmpty-impl", "peek", "peek-impl", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "pop", "pop-impl", "push", "value", "push-impl", "toString", "", "toString-impl", "(Ljava/util/ArrayList;)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
final class Stack {
    private final ArrayList backing;

    private Stack(ArrayList arrayList0) {
        this.backing = arrayList0;
    }

    public static final Stack box-impl(ArrayList arrayList0) {
        return new Stack(arrayList0);
    }

    public static final void clear-impl(ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(arrayList0, "arg0");
        arrayList0.clear();
    }

    public static ArrayList constructor-impl(ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(arrayList0, "backing");
        return arrayList0;
    }

    public static ArrayList constructor-impl$default(ArrayList arrayList0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            arrayList0 = new ArrayList();
        }
        return Stack.constructor-impl(arrayList0);
    }

    @Override
    public boolean equals(Object object0) {
        return Stack.equals-impl(this.unbox-impl(), object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(ArrayList arrayList0, Object object0) {
        return object0 instanceof Stack ? Intrinsics.areEqual(arrayList0, ((Stack)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(ArrayList arrayList0, ArrayList arrayList1) {
        return Intrinsics.areEqual(arrayList0, arrayList1);
    }

    public static final int getSize-impl(ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(arrayList0, "arg0");
        return arrayList0.size();
    }

    @Override
    public int hashCode() {
        return Stack.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(ArrayList arrayList0) {
        return arrayList0.hashCode();
    }

    public static final boolean isEmpty-impl(ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(arrayList0, "arg0");
        return arrayList0.isEmpty();
    }

    public static final boolean isNotEmpty-impl(ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(arrayList0, "arg0");
        return !Stack.isEmpty-impl(arrayList0);
    }

    public static final Object peek-impl(ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(arrayList0, "arg0");
        return arrayList0.get(Stack.getSize-impl(arrayList0) - 1);
    }

    public static final Object pop-impl(ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(arrayList0, "arg0");
        return arrayList0.remove(Stack.getSize-impl(arrayList0) - 1);
    }

    public static final boolean push-impl(ArrayList arrayList0, Object object0) {
        Intrinsics.checkNotNullParameter(arrayList0, "arg0");
        return arrayList0.add(object0);
    }

    @Override
    public String toString() {
        return "Stack(backing=" + this.unbox-impl() + ')';
    }

    public static String toString-impl(ArrayList arrayList0) [...] // Inlined contents

    public final ArrayList unbox-impl() {
        return this.backing;
    }
}

