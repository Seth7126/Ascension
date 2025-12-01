package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class zzc implements Runnable {
    private static final Logger zzcb;
    private final String zzcc;
    private final StatusPendingResult zzcd;

    static {
        zzc.zzcb = new Logger("RevokeAccessOperation", new String[0]);
    }

    private zzc(String s) {
        this.zzcc = Preconditions.checkNotEmpty(s);
        this.zzcd = new StatusPendingResult(null);
    }

    @Override
    public final void run() {
        Status status0;
        try {
            status0 = Status.RESULT_INTERNAL_ERROR;
            String s = String.valueOf(this.zzcc);
            HttpURLConnection httpURLConnection0 = (HttpURLConnection)new URL((s.length() == 0 ? new String("https://accounts.google.com/o/oauth2/revoke?token=") : "https://accounts.google.com/o/oauth2/revoke?token=" + s)).openConnection();
            httpURLConnection0.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int v = httpURLConnection0.getResponseCode();
            if(v == 200) {
                status0 = Status.RESULT_SUCCESS;
            }
            else {
                zzc.zzcb.e("Unable to revoke access!", new Object[0]);
            }
            zzc.zzcb.d("Response Code: " + v, new Object[0]);
        }
        catch(IOException iOException0) {
            String s1 = iOException0.toString();
            zzc.zzcb.e((s1.length() == 0 ? new String("IOException when revoking access: ") : "IOException when revoking access: " + s1), new Object[0]);
        }
        catch(Exception exception0) {
            String s2 = exception0.toString();
            zzc.zzcb.e((s2.length() == 0 ? new String("Exception when revoking access: ") : "Exception when revoking access: " + s2), new Object[0]);
        }
        this.zzcd.setResult(status0);
    }

    public static PendingResult zzf(String s) {
        if(s == null) {
            return PendingResults.immediateFailedResult(new Status(4), null);
        }
        zzc zzc0 = new zzc(s);
        new Thread(zzc0).start();
        return zzc0.zzcd;
    }
}

