package com.voxelbusters.android.essentialkit.features.notificationservices.datatypes;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.voxelbusters.android.essentialkit.common.annotations.MustIncludeInCodeGenerator;
import com.voxelbusters.android.essentialkit.common.annotations.SkipInCodeGenerator;
import java.io.Serializable;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

@MustIncludeInCodeGenerator
public class TimeIntervalNotificationTrigger extends NotificationTrigger implements Parcelable, Serializable {
    @SkipInCodeGenerator
    public static final Parcelable.Creator CREATOR;
    private long startTimestamp;
    public long timeInterval;

    static {
        TimeIntervalNotificationTrigger.CREATOR = new Parcelable.Creator() {
            public TimeIntervalNotificationTrigger createFromParcel(Parcel parcel0) {
                return new TimeIntervalNotificationTrigger(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            public TimeIntervalNotificationTrigger[] newArray(int v) {
                return new TimeIntervalNotificationTrigger[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        };
    }

    public TimeIntervalNotificationTrigger(long v, boolean z) {
        this.repeat = z;
        this.timeInterval = v;
        this.startTimestamp = System.currentTimeMillis();
    }

    protected TimeIntervalNotificationTrigger(Parcel parcel0) {
        this.startTimestamp = parcel0.readLong();
        this.timeInterval = parcel0.readLong();
        this.repeat = parcel0.readInt() == 1;
    }

    @Override  // android.os.Parcelable
    @SkipInCodeGenerator
    public int describeContents() {
        return 0;
    }

    public static TimeIntervalNotificationTrigger fromJson(JSONObject jSONObject0) {
        boolean z = jSONObject0.optBoolean("repeat", false);
        long v = jSONObject0.optLong("timeInterval", 0L);
        long v1 = jSONObject0.optLong("startTimestamp", 0L);
        TimeIntervalNotificationTrigger timeIntervalNotificationTrigger0 = new TimeIntervalNotificationTrigger(v, z);
        timeIntervalNotificationTrigger0.startTimestamp = v1;
        return timeIntervalNotificationTrigger0;
    }

    public Date getNextTriggerDate() {
        return new Date(this.startTimestamp + this.timeInterval);
    }

    @Override  // com.voxelbusters.android.essentialkit.features.notificationservices.datatypes.NotificationTrigger
    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject0 = super.toJson();
        jSONObject0.put("timeInterval", this.timeInterval);
        jSONObject0.put("startTimestamp", this.startTimestamp);
        jSONObject0.put("repeat", this.repeat);
        return jSONObject0;
    }

    public void updateStartTimestamp(long v) {
        this.startTimestamp = v;
    }

    @Override  // android.os.Parcelable
    @SkipInCodeGenerator
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.startTimestamp);
        parcel0.writeLong(this.timeInterval);
        parcel0.writeInt(((int)this.repeat));
    }
}

