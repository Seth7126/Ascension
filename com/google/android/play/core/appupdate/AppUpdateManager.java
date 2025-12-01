package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.IntentSender.SendIntentException;
import androidx.activity.result.ActivityResultLauncher;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallStateUpdatedListener;

public interface AppUpdateManager {
    Task completeUpdate();

    Task getAppUpdateInfo();

    void registerListener(InstallStateUpdatedListener arg1);

    Task startUpdateFlow(AppUpdateInfo arg1, Activity arg2, AppUpdateOptions arg3);

    @Deprecated
    boolean startUpdateFlowForResult(AppUpdateInfo arg1, int arg2, Activity arg3, int arg4) throws IntentSender.SendIntentException;

    @Deprecated
    boolean startUpdateFlowForResult(AppUpdateInfo arg1, int arg2, IntentSenderForResultStarter arg3, int arg4) throws IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(AppUpdateInfo arg1, Activity arg2, AppUpdateOptions arg3, int arg4) throws IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(AppUpdateInfo arg1, ActivityResultLauncher arg2, AppUpdateOptions arg3);

    boolean startUpdateFlowForResult(AppUpdateInfo arg1, IntentSenderForResultStarter arg2, AppUpdateOptions arg3, int arg4) throws IntentSender.SendIntentException;

    void unregisterListener(InstallStateUpdatedListener arg1);
}

