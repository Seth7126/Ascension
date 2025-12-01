package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.LoaderManager.LoaderCallbacks;
import androidx.loader.content.Loader;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zzan;
import java.util.Set;

public class SignInHubActivity extends FragmentActivity {
    final class zzc implements LoaderCallbacks {
        private final SignInHubActivity zzcx;

        private zzc() {
        }

        zzc(zzy zzy0) {
        }

        @Override  // androidx.loader.app.LoaderManager$LoaderCallbacks
        public final Loader onCreateLoader(int v, Bundle bundle0) {
            Set set0 = GoogleApiClient.getAllClients();
            return new zzf(SignInHubActivity.this, set0);
        }

        @Override  // androidx.loader.app.LoaderManager$LoaderCallbacks
        public final void onLoadFinished(Loader loader0, Object object0) {
            Void void0 = (Void)object0;
            int v = SignInHubActivity.this.zzcv;
            Intent intent0 = SignInHubActivity.this.zzcw;
            SignInHubActivity.this.setResult(v, intent0);
            SignInHubActivity.this.finish();
        }

        @Override  // androidx.loader.app.LoaderManager$LoaderCallbacks
        public final void onLoaderReset(Loader loader0) {
        }
    }

    private static boolean zzcr;
    private boolean zzcs;
    private SignInConfiguration zzct;
    private boolean zzcu;
    private int zzcv;
    private Intent zzcw;

    static {
    }

    public SignInHubActivity() {
        this.zzcs = false;
    }

    @Override  // android.app.Activity
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        return true;
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onActivityResult(int v, int v1, Intent intent0) {
        if(this.zzcs) {
            return;
        }
        this.setResult(0);
        if(v == 0xA002) {
            if(intent0 != null) {
                SignInAccount signInAccount0 = (SignInAccount)intent0.getParcelableExtra("signInAccount");
                if(signInAccount0 != null && signInAccount0.getGoogleSignInAccount() != null) {
                    GoogleSignInAccount googleSignInAccount0 = signInAccount0.getGoogleSignInAccount();
                    zzo.zzd(this).zzc(this.zzct.zzp(), ((GoogleSignInAccount)zzan.checkNotNull(googleSignInAccount0)));
                    intent0.removeExtra("signInAccount");
                    intent0.putExtra("googleSignInAccount", googleSignInAccount0);
                    this.zzcu = true;
                    this.zzcv = v1;
                    this.zzcw = intent0;
                    this.zzr();
                    return;
                }
                if(intent0.hasExtra("errorCode")) {
                    int v2 = intent0.getIntExtra("errorCode", 8);
                    if(v2 == 13) {
                        v2 = 0x30D5;
                    }
                    this.zzc(v2);
                    return;
                }
            }
            this.zzc(8);
        }
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.finish();
        Intent intent0 = this.getIntent();
        String s = (String)zzan.checkNotNull(intent0.getAction());
        if("com.google.android.gms.auth.NO_IMPL".equals(s)) {
            this.zzc(12500);
            return;
        }
        if(!s.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !s.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String s1 = intent0.getAction();
            Log.e("AuthSignInClient", (s1.length() == 0 ? new String("Unknown action: ") : "Unknown action: " + s1));
            this.finish();
            return;
        }
        SignInConfiguration signInConfiguration0 = (SignInConfiguration)((Bundle)zzan.checkNotNull(intent0.getBundleExtra("config"))).getParcelable("config");
        if(signInConfiguration0 == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            this.setResult(0);
            this.finish();
            return;
        }
        this.zzct = signInConfiguration0;
        if(bundle0 == null) {
            if(SignInHubActivity.zzcr) {
                this.setResult(0);
                this.zzc(0x30D6);
                return;
            }
            SignInHubActivity.zzcr = true;
            Intent intent1 = new Intent(s);
            if(s.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                intent1.setPackage("com.google.android.gms");
            }
            else {
                intent1.setPackage("com.playdekgames.android.Ascension");
            }
            intent1.putExtra("config", this.zzct);
            try {
                this.startActivityForResult(intent1, 0xA002);
            }
            catch(ActivityNotFoundException unused_ex) {
                this.zzcs = true;
                Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                this.zzc(17);
            }
            return;
        }
        boolean z = bundle0.getBoolean("signingInGoogleApiClients");
        this.zzcu = z;
        if(z) {
            this.zzcv = bundle0.getInt("signInResultCode");
            this.zzcw = (Intent)zzan.checkNotNull(((Intent)bundle0.getParcelable("signInResultData")));
            this.zzr();
        }
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putBoolean("signingInGoogleApiClients", this.zzcu);
        if(this.zzcu) {
            bundle0.putInt("signInResultCode", this.zzcv);
            bundle0.putParcelable("signInResultData", this.zzcw);
        }
    }

    private final void zzc(int v) {
        Status status0 = new Status(v);
        Intent intent0 = new Intent();
        intent0.putExtra("googleSignInStatus", status0);
        this.setResult(0, intent0);
        this.finish();
        SignInHubActivity.zzcr = false;
    }

    private final void zzr() {
        this.getSupportLoaderManager().initLoader(0, null, new zzc(this, null));
        SignInHubActivity.zzcr = false;
    }
}

