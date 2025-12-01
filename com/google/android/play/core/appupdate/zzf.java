package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.play.core.common.IntentSenderForResultStarter;

final class zzf implements IntentSenderForResultStarter {
    final Activity zza;

    zzf(zzg zzg0, Activity activity0) {
        this.zza = activity0;
        super();
    }

    @Override  // com.google.android.play.core.common.IntentSenderForResultStarter
    public final void startIntentSenderForResult(IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) throws IntentSender.SendIntentException {
        this.zza.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3, bundle0);
    }
}

