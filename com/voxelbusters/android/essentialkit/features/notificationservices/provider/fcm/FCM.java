package com.voxelbusters.android.essentialkit.features.notificationservices.provider.fcm;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessaging;
import com.voxelbusters.android.essentialkit.features.notificationservices.INotificationServices.IRegisterRemoteNotificationsListener;
import com.voxelbusters.android.essentialkit.features.notificationservices.INotificationServices.IUnregisterRemoteNotificationServiceListener;
import com.voxelbusters.android.essentialkit.utilities.ApplicationUtil;
import com.voxelbusters.android.essentialkit.utilities.Logger;
import java.io.IOException;

public class FCM {
    private final String TAG;
    String cachedToken;
    private Context context;
    FirebaseMessaging service;

    public FCM(Context context0) {
        this.TAG = "[Native Plugins : FCM]";
        this.context = context0;
        try {
            FirebaseMessaging.getInstance().setAutoInitEnabled(false);
        }
        catch(Exception unused_ex) {
            Logger.error("Error when initialising Firebase cloud messaging. This can be due to not having proper google-service.json file");
        }
    }

    public void Unregister(IUnregisterRemoteNotificationServiceListener iNotificationServices$IUnregisterRemoteNotificationServiceListener0) {
        if(this.service != null) {
            this.unRegisterInBackground(iNotificationServices$IUnregisterRemoteNotificationServiceListener0);
        }
    }

    private void fetchToken(IRegisterRemoteNotificationsListener iNotificationServices$IRegisterRemoteNotificationsListener0) {
        FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new OnCompleteListener() {
            @Override  // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task0) {
                if(!task0.isSuccessful()) {
                    Logger.error(("getInstanceId failed : " + task0.getException()));
                    IRegisterRemoteNotificationsListener iNotificationServices$IRegisterRemoteNotificationsListener0 = iNotificationServices$IRegisterRemoteNotificationsListener0;
                    if(iNotificationServices$IRegisterRemoteNotificationsListener0 != null) {
                        iNotificationServices$IRegisterRemoteNotificationsListener0.onFailure(task0.getException().getMessage());
                    }
                    return;
                }
                String s = ((InstanceIdResult)task0.getResult()).getToken();
                FCM.this.cachedToken = s;
                Logger.debug(("Token : " + s));
                IRegisterRemoteNotificationsListener iNotificationServices$IRegisterRemoteNotificationsListener1 = iNotificationServices$IRegisterRemoteNotificationsListener0;
                if(iNotificationServices$IRegisterRemoteNotificationsListener1 != null) {
                    iNotificationServices$IRegisterRemoteNotificationsListener1.onSuccess(s);
                }
            }
        });
    }

    public boolean isAvailable() {
        return ApplicationUtil.isGooglePlayServicesAvailable(this.context);
    }

    public boolean isRegistered() {
        return this.cachedToken != null;
    }

    public void register(IRegisterRemoteNotificationsListener iNotificationServices$IRegisterRemoteNotificationsListener0) {
        this.service = FirebaseMessaging.getInstance();
        this.fetchToken(iNotificationServices$IRegisterRemoteNotificationsListener0);
    }

    private void unRegisterInBackground(IUnregisterRemoteNotificationServiceListener iNotificationServices$IUnregisterRemoteNotificationServiceListener0) {
        new AsyncTask() {
            @Override  // android.os.AsyncTask
            protected Object doInBackground(Object[] arr_object) {
                return this.doInBackground(((Void[])arr_object));
            }

            protected String doInBackground(Void[] arr_void) {
                String s;
                try {
                    FirebaseInstanceId.getInstance().deleteInstanceId();
                    IUnregisterRemoteNotificationServiceListener iNotificationServices$IUnregisterRemoteNotificationServiceListener0 = iNotificationServices$IUnregisterRemoteNotificationServiceListener0;
                    if(iNotificationServices$IUnregisterRemoteNotificationServiceListener0 != null) {
                        iNotificationServices$IUnregisterRemoteNotificationServiceListener0.onSuccess();
                    }
                    s = "SUCCESS";
                }
                catch(IOException iOException0) {
                    s = "FAILED : " + iOException0.getMessage();
                    IUnregisterRemoteNotificationServiceListener iNotificationServices$IUnregisterRemoteNotificationServiceListener1 = iNotificationServices$IUnregisterRemoteNotificationServiceListener0;
                    if(iNotificationServices$IUnregisterRemoteNotificationServiceListener1 != null) {
                        iNotificationServices$IUnregisterRemoteNotificationServiceListener1.onFailure(s);
                    }
                }
                FCM.this.cachedToken = null;
                return s;
            }
        }.execute(new Void[]{null, null, null});
    }
}

