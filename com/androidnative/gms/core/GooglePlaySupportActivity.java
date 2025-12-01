package com.androidnative.gms.core;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.util.Log;
import com.unity3d.player.UnityPlayer;

public class GooglePlaySupportActivity extends Activity {
    private static final String BRIDGED_ACCOUNT_KEY = "BRIDGED_ACCOUNT_KEY";
    private static final String BRIDGED_INTENT_KEY = "BRIDGED_INTENT";
    private static final String BRIDGED_REQUEST_CODE_KEY = "BRIDGED_REQUEST_CODE_KEY";
    public static final int BRIDJET_INTENT_REQUEST = 100;
    public static final int GOOGLE_PLAY_CONNECTION = 101;
    public static final int GOOGLE_PLAY_CONNECTION_RESOLUTION = 102;
    private static final String REQUEST_TYPE_CODE = "REQUEST_TYPE_CODE";
    public static final int UNDEFINED = -1;
    private static Intent c_Data = null;
    private static int c_RequestCode = -1;
    private static int c_ResultCode = -1;
    public static GooglePlaySupportActivity currentInstance;
    private int requestCode;
    private boolean resultWasSet;
    private int typeCode;

    static {
    }

    public GooglePlaySupportActivity() {
        this.resultWasSet = false;
    }

    public static Intent CreateIntent() {
        return new Intent(UnityPlayer.currentActivity, GooglePlaySupportActivity.class);
    }

    public static void FinishActivity() {
        GooglePlaySupportActivity googlePlaySupportActivity0 = GooglePlaySupportActivity.currentInstance;
        if(googlePlaySupportActivity0 != null) {
            googlePlaySupportActivity0.finish();
            GooglePlaySupportActivity.currentInstance = null;
        }
    }

    public static void PlayServiceReconnectFinished() {
        if(GooglePlaySupportActivity.c_RequestCode == -1 && GooglePlaySupportActivity.c_ResultCode == -1) {
            return;
        }
        GameClientManager.GetInstance().onActivityResult(GooglePlaySupportActivity.c_RequestCode, GooglePlaySupportActivity.c_ResultCode, GooglePlaySupportActivity.c_Data);
        GooglePlaySupportActivity.c_RequestCode = -1;
        GooglePlaySupportActivity.c_ResultCode = -1;
        GooglePlaySupportActivity.c_Data = null;
    }

    public static void StartProxy(Intent intent0) {
        UnityPlayer.currentActivity.startActivity(intent0);
    }

    @Override  // android.app.Activity
    protected void onActivityResult(int v, int v1, Intent intent0) {
        Log.d("AndroidNative", "GooglePlaySupportActivity::onActivityResult");
        this.resultWasSet = true;
        try {
            GooglePlaySupportActivity.c_RequestCode = v;
            GooglePlaySupportActivity.c_ResultCode = v1;
            GooglePlaySupportActivity.c_Data = intent0;
            GameClientManager.GetInstance().onActivityResultDiconnectCheck(GooglePlaySupportActivity.c_RequestCode, GooglePlaySupportActivity.c_ResultCode, GooglePlaySupportActivity.c_Data);
            if(!GameClientManager.GetInstance().IsWaitingForReconnect()) {
                GooglePlaySupportActivity.PlayServiceReconnectFinished();
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "GooglePlaySupportActivity::onActivityResult Error: " + exception0.getMessage());
        }
        super.onActivityResult(v, v1, intent0);
        this.finish();
    }

    @Override  // android.app.Activity
    protected void onStart() {
        Log.d("AndroidNative", "GooglePlaySupportActivity::onStart");
        int v = this.getIntent().getIntExtra("REQUEST_TYPE_CODE", 100);
        this.typeCode = v;
        switch(v) {
            case 100: {
                this.requestCode = this.getIntent().getIntExtra("BRIDGED_REQUEST_CODE_KEY", 0);
                this.startActivityForResult(((Intent)this.getIntent().getParcelableExtra("BRIDGED_INTENT")), this.requestCode);
                break;
            }
            case 101: {
                Log.d("AndroidNative", "GooglePlaySupportActivity onStart typeCode:GOOGLE_PLAY_CONNECTION");
                GooglePlaySupportActivity.currentInstance = this;
                String s = this.getIntent().getStringExtra("BRIDGED_ACCOUNT_KEY");
                GameClientManager.GetInstance().mHelper.StartSignRequest(s, this);
                break;
            }
            case 102: {
                this.requestCode = this.getIntent().getIntExtra("BRIDGED_REQUEST_CODE_KEY", 0);
                if(GameClientManager.GetInstance().mHelper == null) {
                    Log.d("AndroidNative", "GooglePlaySupportActivity GOOGLE_PLAY_CONNECTION_RESOLUTION mHelper is null");
                    this.finish();
                }
                else {
                    GameClientManager gameClientManager0 = GameClientManager.GetInstance();
                    try {
                        gameClientManager0.mHelper.connectionToResolve.startResolutionForResult(this, this.requestCode);
                    }
                    catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                        intentSender$SendIntentException0.printStackTrace();
                    }
                }
            }
        }
        super.onStart();
    }

    @Override  // android.app.Activity
    protected void onStop() {
        Log.d("AndroidNative", "GooglePlaySupportActivity::onStop");
        if(!this.resultWasSet) {
            Log.d("AndroidNative", "Submiting result on activity stop");
            GameClientManager.GetInstance().onActivityResult(this.requestCode, 0, null);
        }
        super.onStop();
    }

    public static void startProxyForGPConnection(String s) {
        Intent intent0 = GooglePlaySupportActivity.CreateIntent();
        intent0.putExtra("REQUEST_TYPE_CODE", 101);
        intent0.putExtra("BRIDGED_ACCOUNT_KEY", s);
        GooglePlaySupportActivity.StartProxy(intent0);
    }

    public static void startProxyForGPReolution(int v) {
        Intent intent0 = GooglePlaySupportActivity.CreateIntent();
        intent0.putExtra("REQUEST_TYPE_CODE", 102);
        intent0.putExtra("BRIDGED_REQUEST_CODE_KEY", v);
        GooglePlaySupportActivity.StartProxy(intent0);
    }

    public static void startProxyForResult(Intent intent0, int v) {
        Intent intent1 = GooglePlaySupportActivity.CreateIntent();
        intent1.putExtra("REQUEST_TYPE_CODE", 100);
        intent1.putExtra("BRIDGED_REQUEST_CODE_KEY", v);
        intent1.putExtra("BRIDGED_INTENT", intent0);
        GooglePlaySupportActivity.StartProxy(intent1);
    }
}

