package androidx.compose.ui.platform;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001A\u00020\n¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u001C\u0010\r\u001A\u0004\u0018\u00010\u0001X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "properties", "Landroidx/compose/ui/platform/ValueElementSequence;", "getProperties", "()Landroidx/compose/ui/platform/ValueElementSequence;", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class InspectorInfo {
    public static final int $stable = 8;
    private String name;
    private final ValueElementSequence properties;
    private Object value;

    static {
    }

    public InspectorInfo() {
        this.properties = new ValueElementSequence();
    }

    public final String getName() {
        return this.name;
    }

    public final ValueElementSequence getProperties() {
        return this.properties;
    }

    public final Object getValue() {
        return this.value;
    }

    public final void setName(String s) {
        this.name = s;
    }

    public final void setValue(Object object0) {
        this.value = object0;
    }
}

