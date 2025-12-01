package com.voxelbusters.android.essentialkit.features.notificationservices.datatypes;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat.BigPictureStyle;
import androidx.core.app.NotificationCompat.Builder;
import androidx.core.app.NotificationManagerCompat;
import com.voxelbusters.android.essentialkit.common.annotations.SkipInCodeGenerator;
import com.voxelbusters.android.essentialkit.features.notificationservices.INotificationServices.INotificationReceivedListener;
import com.voxelbusters.android.essentialkit.features.notificationservices.NotificationLauncher;
import com.voxelbusters.android.essentialkit.features.notificationservices.NotificationServices;
import com.voxelbusters.android.essentialkit.features.notificationservices.NotificationStore;
import com.voxelbusters.android.essentialkit.utilities.ApplicationUtil;
import com.voxelbusters.android.essentialkit.utilities.Logger;
import com.voxelbusters.android.essentialkit.utilities.ResourcesUtil;
import com.voxelbusters.android.essentialkit.utilities.StringUtil;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

public class Notification implements Parcelable, Serializable {
    @SkipInCodeGenerator
    public static final Parcelable.Creator CREATOR = null;
    private final int DEFAULT_PERSISTENCE_ID;
    public static final String PAYLOAD = "notification-payload";
    private final String PROJECT_ASSETS_EXPECTED_FOLDER;
    private final String TAG;
    public int badge;
    public String bigPicture;
    public String channelId;
    public String contentText;
    public String contentTitle;
    public String id;
    public boolean isLaunchNotification;
    public boolean isRemoteNotification;
    public String largeIcon;
    private int persistenceId;
    public NotificationImportance priority;
    public String soundFileName;
    public String tag;
    public String tickerText;
    public NotificationTrigger trigger;
    public JSONObject userInfo;

    static {
        Notification.CREATOR = new Parcelable.Creator() {
            public Notification createFromParcel(Parcel parcel0) {
                return new Notification(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            public Notification[] newArray(int v) {
                return new Notification[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        };
    }

    @SkipInCodeGenerator
    protected Notification(Parcel parcel0) {
        this.TAG = "[Native Plugins : Notification]";
        this.PROJECT_ASSETS_EXPECTED_FOLDER = "Assets/StreamingAssets";
        this.DEFAULT_PERSISTENCE_ID = 0x6F;
        this.priority = NotificationImportance.Default;
        boolean z = false;
        this.isLaunchNotification = false;
        this.isRemoteNotification = false;
        this.id = parcel0.readString();
        this.contentTitle = parcel0.readString();
        this.tickerText = parcel0.readString();
        this.contentText = parcel0.readString();
        this.badge = parcel0.readInt();
        this.soundFileName = parcel0.readString();
        this.bigPicture = parcel0.readString();
        this.tag = parcel0.readString();
        this.largeIcon = parcel0.readString();
        this.channelId = parcel0.readString();
        NotificationImportance[] arr_notificationImportance = NotificationImportance.values();
        this.priority = arr_notificationImportance[parcel0.readInt()];
        this.isLaunchNotification = parcel0.readByte() != 0;
        if(parcel0.readByte() != 0) {
            z = true;
        }
        this.isRemoteNotification = z;
        this.persistenceId = parcel0.readInt();
        NotificationTrigger notificationTrigger0 = null;
        try {
            this.userInfo = parcel0.readByte() == 0 ? null : new JSONObject(parcel0.readString());
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        if(parcel0.readByte() != 0) {
            notificationTrigger0 = (NotificationTrigger)parcel0.readValue(NotificationTrigger.class.getClassLoader());
        }
        this.trigger = notificationTrigger0;
    }

    public Notification(String s) {
        this.TAG = "[Native Plugins : Notification]";
        this.PROJECT_ASSETS_EXPECTED_FOLDER = "Assets/StreamingAssets";
        this.DEFAULT_PERSISTENCE_ID = 0x6F;
        this.priority = NotificationImportance.Default;
        this.isLaunchNotification = false;
        this.isRemoteNotification = false;
        this.id = s;
        this.persistenceId = new Random().nextInt();
    }

    private void copyFile(Context context0, String s, String s1) {
        AssetManager assetManager0 = context0.getAssets();
        try {
            InputStream inputStream0 = assetManager0.open(s);
            FileOutputStream fileOutputStream0 = new FileOutputStream(s1 + "/" + s);
            byte[] arr_b = new byte[0x400];
            int v;
            while((v = inputStream0.read(arr_b)) != -1) {
                fileOutputStream0.write(arr_b, 0, v);
            }
            inputStream0.close();
            fileOutputStream0.flush();
            fileOutputStream0.close();
        }
        catch(Exception exception0) {
            Logger.debug(("[Notifications] " + exception0.getMessage()));
        }
    }

    @Override  // android.os.Parcelable
    @SkipInCodeGenerator
    public int describeContents() {
        return 0;
    }

    public void dispatch(Context context0) {
        Builder notificationCompat$Builder0;
        Object object0 = context0.getSystemService("notification");
        Logger.debug(("Dispatching notification : " + this));
        NotificationSettings notificationSettings0 = NotificationStore.getSettings(context0);
        if(Build.VERSION.SDK_INT >= 26) {
            if(((NotificationChannel)Notification.getNotificationChannel(context0, "com.playdekgames.android.Ascension")) != null) {
                ((NotificationManager)object0).deleteNotificationChannel("com.playdekgames.android.Ascension");
            }
            NotificationChannel notificationChannel0 = new NotificationChannel("com.playdekgames.android.ascension-general-channel", "General", this.getPriority());
            notificationChannel0.setShowBadge(false);
            if(!StringUtil.isNullOrEmpty(this.soundFileName)) {
                AudioAttributes audioAttributes0 = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
                notificationChannel0.setSound(Uri.parse(("android.resource://com.playdekgames.android.Ascension/raw/" + StringUtil.getFileNameWithoutExtension(this.soundFileName.toLowerCase()))), audioAttributes0);
            }
            ((NotificationManager)object0).createNotificationChannel(notificationChannel0);
        }
        ApplicationUtil.getApplicationName(context0);
        int v = ApplicationUtil.getAppState(context0);
        boolean z = notificationSettings0.isNotificationDisplayAllowedInForeground();
        NotificationManagerCompat.from(context0).areNotificationsEnabled();
        switch(v) {
            case 1: {
                if(z) {
                    goto label_19;
                }
                break;
            }
            case 2: 
            case 3: {
            label_19:
                Intent intent0 = new Intent(context0, NotificationLauncher.class);
                intent0.setPackage("com.playdekgames.android.Ascension");
                intent0.setFlags(0x24000000);
                intent0.putExtra("notification-payload", Notification.toJson(context0, this).toString());
                int v1 = Build.VERSION.SDK_INT <= 30 ? 0x48000000 : 0x4C000000;
                PendingIntent pendingIntent0 = PendingIntent.getActivity(context0.getApplicationContext(), ((int)System.currentTimeMillis()), intent0, v1);
                android.app.Notification notification0 = null;
                try {
                    notificationCompat$Builder0 = new Builder(context0, "com.playdekgames.android.ascension-general-channel");
                }
                catch(Throwable throwable0) {
                    Builder notificationCompat$Builder1 = new Builder(context0, null);
                    if(Build.VERSION.SDK_INT >= 26) {
                        Logger.error(("Make sure you are compiling with minimum 26.0.1 support libraries." + throwable0));
                    }
                    notificationCompat$Builder0 = notificationCompat$Builder1;
                }
                if(notificationSettings0.isVibrationAllowed()) {
                    notificationCompat$Builder0.setDefaults(6);
                }
                else {
                    notificationCompat$Builder0.setDefaults(4);
                }
                int v2 = context0.getApplicationInfo().icon;
                if(v2 == 0) {
                    v2 = ResourcesUtil.getColorResourceId(context0, "ESSENTIAL_KIT_COLOR_BLACK");
                }
                notificationCompat$Builder0.setSmallIcon(v2);
                if(notificationSettings0.isCustomIconAllowed()) {
                    notificationCompat$Builder0.setSmallIcon(ResourcesUtil.getDrawableResourceId(context0, "app_icon_custom_white"));
                    notificationCompat$Builder0.setColor(Color.parseColor(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_ACCENT_COLOR")));
                }
                Bitmap bitmap0 = this.loadBitmap(context0, this.largeIcon);
                if(bitmap0 != null) {
                    notificationCompat$Builder0.setLargeIcon(bitmap0);
                }
                notificationCompat$Builder0.setWhen(System.currentTimeMillis());
                notificationCompat$Builder0.setAutoCancel(true);
                notificationCompat$Builder0.setContentIntent(pendingIntent0);
                Bitmap bitmap1 = this.loadBitmap(context0, this.bigPicture);
                if(bitmap1 != null) {
                    notificationCompat$Builder0.setStyle(new BigPictureStyle().bigPicture(bitmap1));
                }
                if(!StringUtil.isNullOrEmpty(this.contentTitle) || !StringUtil.isNullOrEmpty(this.contentText)) {
                    Logger.error("Alerts off. Notification type set doesn\'t have Alert type to display a notification");
                }
                else {
                    Logger.warning("No data for content text to show in notification bar!");
                    if(ApplicationUtil.isDebugBuild(context0)) {
                        notificationCompat$Builder0.setContentText("No Message!!!");
                    }
                    notification0 = notificationCompat$Builder0.build();
                }
                if(notification0 != null) {
                    ((NotificationManager)object0).notify(this.tag, (StringUtil.isNullOrEmpty(this.tag) ? this.persistenceId : 0x6F), notification0);
                    NotificationStore.saveActiveNotification(context0, this);
                }
            }
        }
        if(v == 1) {
            INotificationReceivedListener iNotificationServices$INotificationReceivedListener0 = NotificationServices.listener;
            if(iNotificationServices$INotificationReceivedListener0 != null) {
                iNotificationServices$INotificationReceivedListener0.onNotificationReceived(this);
            }
        }
    }

    public static Notification fromJson(Context context0, JSONObject jSONObject0) {
        Logger.debug(("From Json : " + jSONObject0.toString()));
        String s = jSONObject0.optString(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_NOTIFICATION_IDENTIFIER_KEY"), "");
        if(StringUtil.isNullOrEmpty(s)) {
            s = "1763089181544";
        }
        Notification notification0 = new Notification(s);
        notification0.contentTitle = jSONObject0.optString(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_CONTENT_TITLE_KEY"), "");
        notification0.contentText = jSONObject0.optString(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_CONTENT_TEXT_KEY"), "");
        notification0.tag = jSONObject0.optString(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_TAG_KEY"), "");
        notification0.tickerText = jSONObject0.optString(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_TICKER_TEXT_KEY"), "");
        notification0.badge = jSONObject0.optInt(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_BADGE_KEY"), 0);
        notification0.soundFileName = jSONObject0.optString(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_SOUND_FILE_NAME_KEY"), "");
        notification0.bigPicture = jSONObject0.optString(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_BIG_PICTURE"), "");
        notification0.largeIcon = jSONObject0.optString(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_LARGE_ICON"), "");
        notification0.channelId = jSONObject0.optString(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_CHANNEL_ID_KEY"), "");
        NotificationImportance[] arr_notificationImportance = NotificationImportance.values();
        notification0.priority = arr_notificationImportance[jSONObject0.optInt(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_PRIORITY_KEY"), NotificationImportance.Default.ordinal())];
        notification0.persistenceId = jSONObject0.optInt(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_PERSISTENCE_ID_KEY"), ((int)System.currentTimeMillis()));
        String s1 = jSONObject0.optString(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_USER_INFO_KEY"));
        if(!StringUtil.isNullOrEmpty(s1)) {
            try {
                notification0.userInfo = new JSONObject(s1);
            }
            catch(JSONException jSONException0) {
                Logger.error("User info needs to be of dictionary type");
                jSONException0.printStackTrace();
            }
        }
        JSONObject jSONObject1 = jSONObject0.optJSONObject("trigger");
        if(jSONObject1 != null && jSONObject1.optString("type", "TIME_INTERVAL").equals("TIME_INTERVAL")) {
            notification0.trigger = TimeIntervalNotificationTrigger.fromJson(jSONObject1);
        }
        return notification0;
    }

    private static Object getNotificationChannel(Context context0, String s) {
        List list0 = ((NotificationManager)context0.getSystemService("notification")).getNotificationChannels();
        if(list0 != null) {
            for(int v = 0; v < list0.size(); ++v) {
                NotificationChannel notificationChannel0 = (NotificationChannel)list0.get(v);
                if(notificationChannel0.getName().equals(s)) {
                    return notificationChannel0;
                }
            }
        }
        return null;
    }

    public String getPersistenceId() {
        return String.valueOf(this.persistenceId);
    }

    private int getPriority() {
        int v = com.voxelbusters.android.essentialkit.features.notificationservices.datatypes.Notification.3.$SwitchMap$com$voxelbusters$android$essentialkit$features$notificationservices$datatypes$NotificationImportance[this.priority.ordinal()];
        int v1 = 1;
        if(v != 1 && v != 2) {
            v1 = 4;
            switch(v) {
                case 3: {
                    break;
                }
                case 4: {
                    return 5;
                }
                default: {
                    return 3;
                }
            }
        }
        return v1;
    }

    public boolean hasDateTimeTrigger() {
        return this.trigger != null && this.trigger instanceof TimeIntervalNotificationTrigger;
    }

    public boolean hasLocationTrigger() {
        return this.trigger != null && this.trigger instanceof LocationNotificationTrigger;
    }

    private Bitmap loadBitmap(Context context0, String s) {
        Bitmap bitmap0 = null;
        if(!StringUtil.isNullOrEmpty(s)) {
            try {
                if(s.startsWith("http")) {
                    return BitmapFactory.decodeStream(new URL(s).openStream());
                }
                InputStream inputStream0 = ResourcesUtil.getStreamFromAssets(context0, s);
                bitmap0 = BitmapFactory.decodeStream(inputStream0);
                inputStream0.close();
            }
            catch(IOException iOException0) {
                Logger.error(String.format("%s not found", s));
                iOException0.printStackTrace();
            }
            return bitmap0;
        }
        return null;
    }

    private void playCustomNotificationSound(Context context0, String s, String s1) {
        if(Build.VERSION.SDK_INT >= 26) {
            Logger.warning("Returning as notification channel will handle playing this sound for devices >= oreo");
            return;
        }
        if(!StringUtil.isNullOrEmpty(s)) {
            try {
                AssetFileDescriptor assetFileDescriptor0 = context0.getAssets().openFd(s);
                MediaPlayer mediaPlayer0 = new MediaPlayer();
                mediaPlayer0.setDataSource(assetFileDescriptor0.getFileDescriptor(), assetFileDescriptor0.getStartOffset(), assetFileDescriptor0.getLength());
                mediaPlayer0.setAudioStreamType(5);
                mediaPlayer0.prepare();
                mediaPlayer0.start();
                mediaPlayer0.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override  // android.media.MediaPlayer$OnCompletionListener
                    public void onCompletion(MediaPlayer mediaPlayer0) {
                        mediaPlayer0.release();
                    }
                });
                assetFileDescriptor0.close();
            }
            catch(Exception exception0) {
                Logger.debug(("Expecting " + s + " in Assets/StreamingAssets"));
                exception0.printStackTrace();
            }
        }
    }

    public static JSONObject toJson(Context context0, Notification notification0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_NOTIFICATION_IDENTIFIER_KEY"), notification0.id);
            jSONObject0.put(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_CONTENT_TITLE_KEY"), notification0.contentTitle);
            jSONObject0.put(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_CONTENT_TEXT_KEY"), notification0.contentText);
            jSONObject0.put(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_TICKER_TEXT_KEY"), notification0.tickerText);
            jSONObject0.put(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_TAG_KEY"), notification0.tag);
            jSONObject0.put(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_BADGE_KEY"), notification0.badge);
            jSONObject0.put(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_SOUND_FILE_NAME_KEY"), notification0.soundFileName);
            jSONObject0.put(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_BIG_PICTURE"), notification0.bigPicture);
            jSONObject0.put(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_LARGE_ICON"), notification0.largeIcon);
            jSONObject0.put(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_CHANNEL_ID_KEY"), notification0.channelId);
            jSONObject0.put(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_PRIORITY_KEY"), notification0.priority.ordinal());
            jSONObject0.put(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_PERSISTENCE_ID_KEY"), notification0.persistenceId);
            jSONObject0.put(ResourcesUtil.getString(context0, "NOTIFICATION_SERVICES_USER_INFO_KEY"), notification0.userInfo);
            NotificationTrigger notificationTrigger0 = notification0.trigger;
            if(notificationTrigger0 != null) {
                if(!(notificationTrigger0 instanceof TimeIntervalNotificationTrigger)) {
                    throw new Exception("Not implemented yet");
                }
                JSONObject jSONObject1 = notificationTrigger0.toJson();
                jSONObject1.put("type", "TIME_INTERVAL");
                jSONObject0.put("trigger", jSONObject1);
                return jSONObject0;
            }
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return jSONObject0;
    }

    @Override
    @SkipInCodeGenerator
    public String toString() {
        return "id : " + this.id + "\n" + ("contentTitle : " + this.contentTitle) + "\n" + ("contentText : " + this.contentText) + "\n" + ("tickerText : " + this.tickerText) + "\n" + ("badge : " + this.badge) + "\n" + ("soundFileName : " + this.soundFileName) + "\n" + ("bigPicture : " + this.bigPicture) + "\n" + ("tag : " + this.tag) + "\n" + ("largeIcon : " + this.largeIcon) + "\n" + ("priority : " + this.priority.name()) + "\n" + ("isLaunchNotification : " + this.isLaunchNotification) + "\n" + ("isRemoteNotification : " + this.isRemoteNotification) + "\n" + ("persistenceId : " + this.persistenceId) + "\n" + ("trigger : " + this.trigger) + "\n" + ("userInfo : " + this.userInfo) + "\n";
    }

    @Override  // android.os.Parcelable
    @SkipInCodeGenerator
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.id);
        parcel0.writeString(this.contentTitle);
        parcel0.writeString(this.tickerText);
        parcel0.writeString(this.contentText);
        parcel0.writeInt(this.badge);
        parcel0.writeString(this.soundFileName);
        parcel0.writeString(this.bigPicture);
        parcel0.writeString(this.tag);
        parcel0.writeString(this.largeIcon);
        parcel0.writeString(this.channelId);
        parcel0.writeInt(this.priority.ordinal());
        parcel0.writeByte(((byte)this.isLaunchNotification));
        parcel0.writeByte(((byte)this.isRemoteNotification));
        parcel0.writeInt(this.persistenceId);
        if(this.userInfo == null) {
            parcel0.writeByte(0);
        }
        else {
            parcel0.writeByte(1);
            parcel0.writeString(this.userInfo.toString());
        }
        if(this.trigger == null) {
            parcel0.writeByte(0);
            return;
        }
        parcel0.writeByte(1);
        parcel0.writeValue(this.trigger);
    }
}

