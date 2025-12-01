package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import androidx.core.content.ContextCompat;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import java.util.concurrent.atomic.AtomicBoolean;

public class DataCollectionConfigStorage {
    public static final String DATA_COLLECTION_DEFAULT_ENABLED = "firebase_data_collection_default_enabled";
    private static final String FIREBASE_APP_PREFS = "com.google.firebase.common.prefs:";
    private final Context applicationContext;
    private final AtomicBoolean dataCollectionDefaultEnabled;
    private final Publisher publisher;
    private final SharedPreferences sharedPreferences;

    public DataCollectionConfigStorage(Context context0, String s, Publisher publisher0) {
        this.applicationContext = DataCollectionConfigStorage.directBootSafe(context0);
        this.sharedPreferences = context0.getSharedPreferences("com.google.firebase.common.prefs:" + s, 0);
        this.publisher = publisher0;
        this.dataCollectionDefaultEnabled = new AtomicBoolean(this.readAutoDataCollectionEnabled());
    }

    private static Context directBootSafe(Context context0) {
        return Build.VERSION.SDK_INT < 24 || ContextCompat.isDeviceProtectedStorage(context0) ? context0 : ContextCompat.createDeviceProtectedStorageContext(context0);
    }

    public boolean isEnabled() {
        return this.dataCollectionDefaultEnabled.get();
    }

    private boolean readAutoDataCollectionEnabled() {
        if(this.sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            return this.sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager0 = this.applicationContext.getPackageManager();
            if(packageManager0 != null) {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.playdekgames.android.Ascension", 0x80);
                return applicationInfo0 == null || applicationInfo0.metaData == null || !applicationInfo0.metaData.containsKey("firebase_data_collection_default_enabled") ? true : applicationInfo0.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return true;
    }

    public void setEnabled(boolean z) {
        if(this.dataCollectionDefaultEnabled.compareAndSet(!z, z)) {
            this.sharedPreferences.edit().putBoolean("firebase_data_collection_default_enabled", z).apply();
            DataCollectionDefaultChange dataCollectionDefaultChange0 = new DataCollectionDefaultChange(z);
            Event event0 = new Event(DataCollectionDefaultChange.class, dataCollectionDefaultChange0);
            this.publisher.publish(event0);
        }
    }
}

