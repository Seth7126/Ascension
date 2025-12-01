package androidx.compose.ui.text.input;

import androidx.compose.ui.draw.PainterModifier..ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001D2\u00020\u0001:\u0001\u001DB:\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001A\u00020\b\u0012\b\b\u0002\u0010\t\u001A\u00020\nø\u0001\u0000¢\u0006\u0002\u0010\u000BJE\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001A\u00020\u00032\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001A\u00020\u001AH\u0016J\b\u0010\u001B\u001A\u00020\u001CH\u0016R\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u001C\u0010\u0004\u001A\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u000E\u0010\u000FR\u001C\u0010\t\u001A\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u0011\u0010\u000FR\u001C\u0010\u0007\u001A\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001A\u0004\b\u0012\u0010\u000FR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\r\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions;", "", "singleLine", "", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "autoCorrect", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "(ZIZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAutoCorrect", "()Z", "getCapitalization-IUNYP9k", "()I", "I", "getImeAction-eUduSuo", "getKeyboardType-PjHm6EE", "getSingleLine", "copy", "copy-uxg59PA", "(ZIZII)Landroidx/compose/ui/text/input/ImeOptions;", "equals", "other", "hashCode", "", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ImeOptions {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/input/ImeOptions;", "getDefault", "()Landroidx/compose/ui/text/input/ImeOptions;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final ImeOptions getDefault() {
            return ImeOptions.Default;
        }
    }

    public static final Companion Companion;
    private static final ImeOptions Default;
    private final boolean autoCorrect;
    private final int capitalization;
    private final int imeAction;
    private final int keyboardType;
    private final boolean singleLine;

    static {
        ImeOptions.Companion = new Companion(null);
        ImeOptions.Default = new ImeOptions(false, 0, false, 0, 0, 0x1F, null);
    }

    private ImeOptions(boolean z, int v, boolean z1, int v1, int v2) {
        this.singleLine = z;
        this.capitalization = v;
        this.autoCorrect = z1;
        this.keyboardType = v1;
        this.imeAction = v2;
    }

    public ImeOptions(boolean z, int v, boolean z1, int v1, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 8) != 0) {
            v1 = 1;
        }
        if((v3 & 16) != 0) {
            v2 = 1;
        }
        this(((v3 & 1) == 0 ? z : false), v, ((v3 & 4) == 0 ? z1 : true), v1, v2, null);
    }

    public ImeOptions(boolean z, int v, boolean z1, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(z, v, z1, v1, v2);
    }

    public final ImeOptions copy-uxg59PA(boolean z, int v, boolean z1, int v1, int v2) {
        return new ImeOptions(z, v, z1, v1, v2, null);
    }

    public static ImeOptions copy-uxg59PA$default(ImeOptions imeOptions0, boolean z, int v, boolean z1, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            z = imeOptions0.singleLine;
        }
        if((v3 & 2) != 0) {
            v = imeOptions0.getCapitalization-IUNYP9k();
        }
        if((v3 & 4) != 0) {
            z1 = imeOptions0.autoCorrect;
        }
        if((v3 & 8) != 0) {
            v1 = imeOptions0.getKeyboardType-PjHm6EE();
        }
        if((v3 & 16) != 0) {
            v2 = imeOptions0.getImeAction-eUduSuo();
        }
        return imeOptions0.copy-uxg59PA(z, v, z1, v1, v2);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ImeOptions)) {
            return false;
        }
        if(this.singleLine != ((ImeOptions)object0).singleLine) {
            return false;
        }
        if(!KeyboardCapitalization.equals-impl0(this.getCapitalization-IUNYP9k(), ((ImeOptions)object0).getCapitalization-IUNYP9k())) {
            return false;
        }
        if(this.autoCorrect != ((ImeOptions)object0).autoCorrect) {
            return false;
        }
        return KeyboardType.equals-impl0(this.getKeyboardType-PjHm6EE(), ((ImeOptions)object0).getKeyboardType-PjHm6EE()) ? ImeAction.equals-impl0(this.getImeAction-eUduSuo(), ((ImeOptions)object0).getImeAction-eUduSuo()) : false;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    public final int getCapitalization-IUNYP9k() {
        return this.capitalization;
    }

    public final int getImeAction-eUduSuo() {
        return this.imeAction;
    }

    public final int getKeyboardType-PjHm6EE() {
        return this.keyboardType;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @Override
    public int hashCode() {
        return (((PainterModifier..ExternalSyntheticBackport0.m(this.singleLine) * 0x1F + this.getCapitalization-IUNYP9k()) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.autoCorrect)) * 0x1F + this.getKeyboardType-PjHm6EE()) * 0x1F + this.getImeAction-eUduSuo();
    }

    @Override
    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + KeyboardCapitalization.toString-impl(this.getCapitalization-IUNYP9k()) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + KeyboardType.toString-impl(this.getKeyboardType-PjHm6EE()) + ", imeAction=" + ImeAction.toString-impl(this.getImeAction-eUduSuo()) + ')';
    }
}

