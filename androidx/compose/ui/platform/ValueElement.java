package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u000B\u001A\u0004\u0018\u00010\u0001HÆ\u0003J\u001F\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001A\u00020\u000E2\b\u0010\u000F\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/ValueElement;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "getName", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ValueElement {
    public static final int $stable = 8;
    private final String name;
    private final Object value;

    static {
    }

    public ValueElement(String s, Object object0) {
        Intrinsics.checkNotNullParameter(s, "name");
        super();
        this.name = s;
        this.value = object0;
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final ValueElement copy(String s, Object object0) {
        Intrinsics.checkNotNullParameter(s, "name");
        return new ValueElement(s, object0);
    }

    public static ValueElement copy$default(ValueElement valueElement0, String s, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            s = valueElement0.name;
        }
        if((v & 2) != 0) {
            object0 = valueElement0.value;
        }
        return valueElement0.copy(s, object0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ValueElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.name, ((ValueElement)object0).name) ? Intrinsics.areEqual(this.value, ((ValueElement)object0).value) : false;
    }

    public final String getName() {
        return this.name;
    }

    public final Object getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {
        int v = this.name.hashCode();
        return this.value == null ? v * 0x1F : v * 0x1F + this.value.hashCode();
    }

    @Override
    public String toString() {
        return "ValueElement(name=" + this.name + ", value=" + this.value + ')';
    }
}

