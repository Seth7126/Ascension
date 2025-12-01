package com.voxelbusters.android.essentialkit.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.voxelbusters.android.essentialkit.common.annotations.SkipInCodeGenerator;
import java.io.Serializable;

public class Point implements Parcelable, Serializable {
    @SkipInCodeGenerator
    public static final Parcelable.Creator CREATOR;
    double x;
    double y;

    static {
        Point.CREATOR = new Parcelable.Creator() {
            public Point createFromParcel(Parcel parcel0) {
                return new Point(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            public Point[] newArray(int v) {
                return new Point[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        };
    }

    public Point(double f, double f1) {
        this.x = f;
        this.y = f1;
    }

    protected Point(Parcel parcel0) {
        this.x = parcel0.readDouble();
        this.y = parcel0.readDouble();
    }

    @Override  // android.os.Parcelable
    @SkipInCodeGenerator
    public int describeContents() {
        return 0;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override  // android.os.Parcelable
    @SkipInCodeGenerator
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeDouble(this.x);
        parcel0.writeDouble(this.y);
    }
}

