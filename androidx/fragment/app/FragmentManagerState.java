package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.ArrayList;

final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    ArrayList mActive;
    ArrayList mAdded;
    BackStackState[] mBackStack;
    int mNextFragmentIndex;
    String mPrimaryNavActiveWho;

    static {
        FragmentManagerState.CREATOR = new Parcelable.Creator() {
            public FragmentManagerState createFromParcel(Parcel parcel0) {
                return new FragmentManagerState(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            public FragmentManagerState[] newArray(int v) {
                return new FragmentManagerState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        };
    }

    public FragmentManagerState() {
        this.mPrimaryNavActiveWho = null;
    }

    public FragmentManagerState(Parcel parcel0) {
        this.mPrimaryNavActiveWho = null;
        this.mActive = parcel0.createTypedArrayList(FragmentState.CREATOR);
        this.mAdded = parcel0.createStringArrayList();
        this.mBackStack = (BackStackState[])parcel0.createTypedArray(BackStackState.CREATOR);
        this.mPrimaryNavActiveWho = parcel0.readString();
        this.mNextFragmentIndex = parcel0.readInt();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeTypedList(this.mActive);
        parcel0.writeStringList(this.mAdded);
        parcel0.writeTypedArray(this.mBackStack, v);
        parcel0.writeString(this.mPrimaryNavActiveWho);
        parcel0.writeInt(this.mNextFragmentIndex);
    }
}

