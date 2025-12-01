package androidx.compose.ui.semantics;

import androidx.compose.ui.draw.PainterModifier..ExternalSyntheticBackport0;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u001A\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0005\u00A2\u0006\u0002\u0010\u0006J\u0015\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0000H\u0000\u00A2\u0006\u0002\b\u0013J\u001D\u0010\u0014\u001A\u00020\b\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\u00150\u0004H\u0086\u0002J\u0006\u0010\u0017\u001A\u00020\u0000J\u0013\u0010\u0018\u001A\u00020\b2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0005H\u0096\u0002J\"\u0010\u001A\u001A\u0002H\u0015\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\u00150\u0004H\u0086\u0002\u00A2\u0006\u0002\u0010\u001BJ-\u0010\u001C\u001A\u0002H\u0015\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u0002H\u00150\u001E\u00A2\u0006\u0002\u0010\u001FJ1\u0010 \u001A\u0004\u0018\u0001H\u0015\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\u00150\u00042\u000E\u0010\u001D\u001A\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00150\u001E\u00A2\u0006\u0002\u0010\u001FJ\b\u0010!\u001A\u00020\"H\u0016J!\u0010#\u001A\u001A\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030$H\u0096\u0002J\u0015\u0010%\u001A\u00020\u00112\u0006\u0010&\u001A\u00020\u0000H\u0000\u00A2\u0006\u0002\b\'J*\u0010(\u001A\u00020\u0011\"\u0004\b\u0000\u0010\u00152\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\u00150\u00042\u0006\u0010)\u001A\u0002H\u0015H\u0096\u0002\u00A2\u0006\u0002\u0010*J\b\u0010+\u001A\u00020,H\u0016R\u001A\u0010\u0007\u001A\u00020\bX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000BR\u001A\u0010\f\u001A\u00020\bX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000BR \u0010\u000E\u001A\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000FX\u0082\u0004\u00A2\u0006\u0002\n\u0000\u00A8\u0006-"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "()V", "isClearingSemantics", "", "()Z", "setClearingSemantics", "(Z)V", "isMergingSemanticsOfDescendants", "setMergingSemanticsOfDescendants", "props", "", "collapsePeer", "", "peer", "collapsePeer$ui_release", "contains", "T", "key", "copy", "equals", "other", "get", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "getOrElse", "defaultValue", "Lkotlin/Function0;", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrElseNullable", "hashCode", "", "iterator", "", "mergeChild", "child", "mergeChild$ui_release", "set", "value", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V", "toString", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable, KMappedMarker {
    public static final int $stable = 8;
    private boolean isClearingSemantics;
    private boolean isMergingSemanticsOfDescendants;
    private final Map props;

    static {
    }

    public SemanticsConfiguration() {
        this.props = new LinkedHashMap();
    }

    public final void collapsePeer$ui_release(SemanticsConfiguration semanticsConfiguration0) {
        Intrinsics.checkNotNullParameter(semanticsConfiguration0, "peer");
        if(semanticsConfiguration0.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if(semanticsConfiguration0.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        for(Object object0: semanticsConfiguration0.props.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey0 = (SemanticsPropertyKey)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            if(!this.props.containsKey(semanticsPropertyKey0)) {
                this.props.put(semanticsPropertyKey0, object1);
            }
            else if(object1 instanceof AccessibilityAction) {
                Object object2 = this.props.get(semanticsPropertyKey0);
                if(object2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                }
                Map map0 = this.props;
                String s = ((AccessibilityAction)object2).getLabel();
                if(s == null) {
                    s = ((AccessibilityAction)object1).getLabel();
                }
                Function function0 = ((AccessibilityAction)object2).getAction();
                if(function0 == null) {
                    function0 = ((AccessibilityAction)object1).getAction();
                }
                map0.put(semanticsPropertyKey0, new AccessibilityAction(s, function0));
            }
        }
    }

    public final boolean contains(SemanticsPropertyKey semanticsPropertyKey0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyKey0, "key");
        return this.props.containsKey(semanticsPropertyKey0);
    }

    public final SemanticsConfiguration copy() {
        SemanticsConfiguration semanticsConfiguration0 = new SemanticsConfiguration();
        semanticsConfiguration0.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        semanticsConfiguration0.isClearingSemantics = this.isClearingSemantics;
        semanticsConfiguration0.props.putAll(this.props);
        return semanticsConfiguration0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SemanticsConfiguration)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.props, ((SemanticsConfiguration)object0).props)) {
            return false;
        }
        return this.isMergingSemanticsOfDescendants == ((SemanticsConfiguration)object0).isMergingSemanticsOfDescendants ? this.isClearingSemantics == ((SemanticsConfiguration)object0).isClearingSemantics : false;
    }

    public final Object get(SemanticsPropertyKey semanticsPropertyKey0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyKey0, "key");
        Object object0 = this.props.get(semanticsPropertyKey0);
        if(object0 == null) {
            throw new IllegalStateException("Key not present: " + semanticsPropertyKey0 + " - consider getOrElse or getOrNull");
        }
        return object0;
    }

    public final Object getOrElse(SemanticsPropertyKey semanticsPropertyKey0, Function0 function00) {
        Intrinsics.checkNotNullParameter(semanticsPropertyKey0, "key");
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        Object object0 = this.props.get(semanticsPropertyKey0);
        return object0 == null ? function00.invoke() : object0;
    }

    public final Object getOrElseNullable(SemanticsPropertyKey semanticsPropertyKey0, Function0 function00) {
        Intrinsics.checkNotNullParameter(semanticsPropertyKey0, "key");
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        Object object0 = this.props.get(semanticsPropertyKey0);
        return object0 == null ? function00.invoke() : object0;
    }

    @Override
    public int hashCode() {
        return (this.props.hashCode() * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.isMergingSemanticsOfDescendants)) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.isClearingSemantics);
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final boolean isMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    @Override
    public Iterator iterator() {
        return this.props.entrySet().iterator();
    }

    public final void mergeChild$ui_release(SemanticsConfiguration semanticsConfiguration0) {
        Intrinsics.checkNotNullParameter(semanticsConfiguration0, "child");
        for(Object object0: semanticsConfiguration0.props.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey0 = (SemanticsPropertyKey)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            Object object2 = semanticsPropertyKey0.merge(this.props.get(semanticsPropertyKey0), object1);
            if(object2 != null) {
                this.props.put(semanticsPropertyKey0, object2);
            }
        }
    }

    @Override  // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public void set(SemanticsPropertyKey semanticsPropertyKey0, Object object0) {
        Intrinsics.checkNotNullParameter(semanticsPropertyKey0, "key");
        this.props.put(semanticsPropertyKey0, object0);
    }

    public final void setClearingSemantics(boolean z) {
        this.isClearingSemantics = z;
    }

    public final void setMergingSemanticsOfDescendants(boolean z) {
        this.isMergingSemanticsOfDescendants = z;
    }

    @Override
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.isMergingSemanticsOfDescendants) {
            stringBuilder0.append("mergeDescendants=true");
            s = ", ";
        }
        else {
            s = "";
        }
        if(this.isClearingSemantics) {
            stringBuilder0.append(s);
            stringBuilder0.append("isClearingSemantics=true");
            s = ", ";
        }
        for(Object object0: this.props.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey0 = (SemanticsPropertyKey)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            stringBuilder0.append(s);
            stringBuilder0.append(semanticsPropertyKey0.getName());
            stringBuilder0.append(" : ");
            stringBuilder0.append(object1);
            s = ", ";
        }
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + "{ " + stringBuilder0 + " }";
    }
}

