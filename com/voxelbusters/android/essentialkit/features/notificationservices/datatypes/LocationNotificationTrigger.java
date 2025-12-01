package com.voxelbusters.android.essentialkit.features.notificationservices.datatypes;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.voxelbusters.android.essentialkit.common.Point;
import com.voxelbusters.android.essentialkit.common.annotations.MustIncludeInCodeGenerator;
import com.voxelbusters.android.essentialkit.common.annotations.SkipInCodeGenerator;
import java.io.Serializable;

@MustIncludeInCodeGenerator
public class LocationNotificationTrigger extends NotificationTrigger implements Parcelable, Serializable {
    @SkipInCodeGenerator
    public static final Parcelable.Creator CREATOR;
    private Point locationCoordinate;
    private boolean notifyOnEntry;
    private boolean notifyOnExit;
    private float radius;

    static {
        LocationNotificationTrigger.CREATOR = new Parcelable.Creator() {
            public LocationNotificationTrigger createFromParcel(Parcel parcel0) {
                return new LocationNotificationTrigger(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            public LocationNotificationTrigger[] newArray(int v) {
                return new LocationNotificationTrigger[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        };
    }

    public LocationNotificationTrigger(double f, double f1, float f2, boolean z) {
        this.locationCoordinate = new Point(f, f1);
        this.radius = f2;
        this.repeat = z;
    }

    protected LocationNotificationTrigger(Parcel parcel0) {
        this.locationCoordinate = (Point)parcel0.readValue(Point.class.getClassLoader());
        this.radius = parcel0.readFloat();
        boolean z = true;
        this.notifyOnEntry = parcel0.readByte() != 0;
        if(parcel0.readByte() == 0) {
            z = false;
        }
        this.notifyOnExit = z;
    }

    public void build() {
    }

    @Override  // android.os.Parcelable
    @SkipInCodeGenerator
    public int describeContents() {
        return 0;
    }

    public Point getLocationCoordinate() {
        return this.locationCoordinate;
    }

    public float getRadius() {
        return this.radius;
    }

    public boolean isNotifyOnEntry() {
        return this.notifyOnEntry;
    }

    public boolean isNotifyOnExit() {
        return this.notifyOnExit;
    }

    public void setNotifyOnEntry(boolean z) {
        this.notifyOnEntry = z;
    }

    public void setNotifyOnExit(boolean z) {
        this.notifyOnExit = z;
    }

    @Override  // android.os.Parcelable
    @SkipInCodeGenerator
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeValue(this.locationCoordinate);
        parcel0.writeFloat(this.radius);
        parcel0.writeByte(((byte)this.notifyOnEntry));
        parcel0.writeByte(((byte)this.notifyOnExit));
    }
}

