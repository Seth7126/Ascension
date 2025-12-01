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
public class CalendarNotificationTrigger extends NotificationTrigger implements Parcelable, Serializable {
    @SkipInCodeGenerator
    public static final Parcelable.Creator CREATOR;
    private final int UNDEFINED;
    private CalendarType calendarType;
    private int day;
    private int hour;
    private int minute;
    private int month;
    private int nanosecond;
    private int second;
    private long startTimestamp;
    public long timeInterval;
    private int weekOfMonth;
    private int weekOfYear;
    private int weekday;
    private int year;

    static {
        CalendarNotificationTrigger.CREATOR = new Parcelable.Creator() {
            public CalendarNotificationTrigger createFromParcel(Parcel parcel0) {
                return new CalendarNotificationTrigger(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            public CalendarNotificationTrigger[] newArray(int v) {
                return new CalendarNotificationTrigger[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        };
    }

    protected CalendarNotificationTrigger(Parcel parcel0) {
        this.UNDEFINED = -1;
        this.calendarType = CalendarType.Default;
        this.year = -1;
        this.month = -1;
        this.day = -1;
        this.hour = -1;
        this.minute = -1;
        this.second = -1;
        this.nanosecond = -1;
        this.weekday = -1;
        this.weekOfMonth = -1;
        this.weekOfYear = -1;
        this.startTimestamp = parcel0.readLong();
        this.timeInterval = parcel0.readLong();
        this.repeat = parcel0.readInt() == 1;
    }

    public CalendarNotificationTrigger(CalendarType calendarType0, boolean z) {
        this.UNDEFINED = -1;
        this.calendarType = CalendarType.Default;
        this.year = -1;
        this.month = -1;
        this.day = -1;
        this.hour = -1;
        this.minute = -1;
        this.second = -1;
        this.nanosecond = -1;
        this.weekday = -1;
        this.weekOfMonth = -1;
        this.weekOfYear = -1;
        this.repeat = z;
        this.startTimestamp = System.currentTimeMillis();
    }

    @Override  // android.os.Parcelable
    @SkipInCodeGenerator
    public int describeContents() {
        return 0;
    }

    public static CalendarNotificationTrigger fromJson(JSONObject jSONObject0) {
        boolean z = jSONObject0.optBoolean("repeat", false);
        jSONObject0.optLong("timeInterval", 0L);
        long v = jSONObject0.optLong("startTimestamp", 0L);
        CalendarNotificationTrigger calendarNotificationTrigger0 = new CalendarNotificationTrigger(CalendarType.Default, z);
        calendarNotificationTrigger0.startTimestamp = v;
        return calendarNotificationTrigger0;
    }

    public Date getNextTriggerDate() {
        return new Date(this.startTimestamp + this.timeInterval);
    }

    public void setYear(int v) {
        this.year = v;
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

