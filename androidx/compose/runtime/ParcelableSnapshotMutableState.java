package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000F*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001\u000FB\u001B\u0012\u0006\u0010\u0004\u001A\u00028\u0000\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001A\u00020\tH\u0016J\u0018\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\tH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Landroidx/compose/runtime/SnapshotMutableStateImpl;", "Landroid/os/Parcelable;", "value", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ParcelableSnapshotMutableState extends SnapshotMutableStateImpl implements Parcelable {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u000E\u0010\u0007\u001A\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000B"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "getCREATOR$annotations", "PolicyNeverEquals", "", "PolicyReferentialEquality", "PolicyStructuralEquality", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static void getCREATOR$annotations() {
        }
    }

    public static final Parcelable.Creator CREATOR = null;
    public static final Companion Companion = null;
    private static final int PolicyNeverEquals = 0;
    private static final int PolicyReferentialEquality = 2;
    private static final int PolicyStructuralEquality = 1;

    static {
        ParcelableSnapshotMutableState.Companion = new Companion(null);
        ParcelableSnapshotMutableState.CREATOR = new ParcelableSnapshotMutableState.Companion.CREATOR.1();
    }

    public ParcelableSnapshotMutableState(Object object0, SnapshotMutationPolicy snapshotMutationPolicy0) {
        Intrinsics.checkNotNullParameter(snapshotMutationPolicy0, "policy");
        super(object0, snapshotMutationPolicy0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1;
        Intrinsics.checkNotNullParameter(parcel0, "parcel");
        parcel0.writeValue(this.getValue());
        SnapshotMutationPolicy snapshotMutationPolicy0 = this.getPolicy();
        if(Intrinsics.areEqual(snapshotMutationPolicy0, SnapshotStateKt.neverEqualPolicy())) {
            v1 = 0;
        }
        else if(Intrinsics.areEqual(snapshotMutationPolicy0, SnapshotStateKt.structuralEqualityPolicy())) {
            v1 = 1;
        }
        else if(Intrinsics.areEqual(snapshotMutationPolicy0, SnapshotStateKt.referentialEqualityPolicy())) {
            v1 = 2;
        }
        else {
            throw new IllegalStateException("Only known types of MutableState\'s SnapshotMutationPolicy are supported");
        }
        parcel0.writeInt(v1);
    }
}

