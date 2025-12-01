package com.voxelbusters.android.essentialkit.features.notificationservices.datatypes;

import com.voxelbusters.android.essentialkit.common.annotations.MustIncludeInCodeGenerator;
import com.voxelbusters.android.essentialkit.utilities.StringUtil;
import org.json.JSONException;
import org.json.JSONObject;

@MustIncludeInCodeGenerator
public class NotificationBuilder {
    private Notification notification;

    public NotificationBuilder(String s) {
        this.notification = new Notification(s);
    }

    public Notification build() {
        return this.notification;
    }

    public void setBadge(int v) {
        this.notification.badge = v;
    }

    public void setBigPicture(String s) {
        this.notification.bigPicture = s;
    }

    public void setBody(String s) {
        Notification notification0 = this.notification;
        notification0.contentText = StringUtil.fromBase64EncodedString(s);
    }

    public void setLargeIcon(String s) {
        this.notification.largeIcon = s;
    }

    public void setSoundFileName(String s) {
        this.notification.soundFileName = s;
    }

    public void setTag(String s) {
        this.notification.tag = s;
    }

    public void setTitle(String s) {
        Notification notification0 = this.notification;
        notification0.contentTitle = StringUtil.fromBase64EncodedString(s);
    }

    public void setTrigger(LocationNotificationTrigger locationNotificationTrigger0) {
        this.notification.trigger = locationNotificationTrigger0;
    }

    public void setTrigger(TimeIntervalNotificationTrigger timeIntervalNotificationTrigger0) {
        this.notification.trigger = timeIntervalNotificationTrigger0;
    }

    public void setUserInfo(String s) {
        try {
            Notification notification0 = this.notification;
            notification0.userInfo = new JSONObject(s);
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
    }
}

