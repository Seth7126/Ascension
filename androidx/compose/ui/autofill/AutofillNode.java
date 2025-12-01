package androidx.compose.ui.autofill;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001C2\u00020\u0001:\u0001\u001CB7\u0012\u000E\b\u0002\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001A\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\u0010\u000BJ\u0013\u0010\u0018\u001A\u00020\u00192\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001B\u001A\u00020\u0013H\u0016R\u0017\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001A\u00020\u0013¢\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0015R\u001F\u0010\u0007\u001A\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode;", "", "autofillTypes", "", "Landroidx/compose/ui/autofill/AutofillType;", "boundingBox", "Landroidx/compose/ui/geometry/Rect;", "onFill", "Lkotlin/Function1;", "", "", "(Ljava/util/List;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)V", "getAutofillTypes", "()Ljava/util/List;", "getBoundingBox", "()Landroidx/compose/ui/geometry/Rect;", "setBoundingBox", "(Landroidx/compose/ui/geometry/Rect;)V", "id", "", "getId", "()I", "getOnFill", "()Lkotlin/jvm/functions/Function1;", "equals", "", "other", "hashCode", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AutofillNode {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001A\u00020\u0004H\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode$Companion;", "", "()V", "previousId", "", "generateId", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        private final int generateId() {
            synchronized(this) {
                AutofillNode.previousId = 1;
                return 0;
            }
        }
    }

    public static final int $stable;
    public static final Companion Companion;
    private final List autofillTypes;
    private Rect boundingBox;
    private final int id;
    private final Function1 onFill;
    private static int previousId;

    static {
        AutofillNode.Companion = new Companion(null);
        AutofillNode.$stable = 8;
    }

    public AutofillNode(List list0, Rect rect0, Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "autofillTypes");
        super();
        this.autofillTypes = list0;
        this.boundingBox = rect0;
        this.onFill = function10;
        this.id = AutofillNode.Companion.generateId();
    }

    public AutofillNode(List list0, Rect rect0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            list0 = CollectionsKt.emptyList();
        }
        if((v & 2) != 0) {
            rect0 = null;
        }
        this(list0, rect0, function10);
    }

    public static final int access$getPreviousId$cp() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AutofillNode)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.autofillTypes, ((AutofillNode)object0).autofillTypes)) {
            return false;
        }
        return Intrinsics.areEqual(this.boundingBox, ((AutofillNode)object0).boundingBox) ? Intrinsics.areEqual(this.onFill, ((AutofillNode)object0).onFill) : false;
    }

    public final List getAutofillTypes() {
        return this.autofillTypes;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final int getId() {
        return this.id;
    }

    public final Function1 getOnFill() {
        return this.onFill;
    }

    @Override
    public int hashCode() {
        int v = this.autofillTypes.hashCode();
        int v1 = 0;
        int v2 = this.boundingBox == null ? 0 : this.boundingBox.hashCode();
        Function1 function10 = this.onFill;
        if(function10 != null) {
            v1 = function10.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    public final void setBoundingBox(Rect rect0) {
        this.boundingBox = rect0;
    }
}

