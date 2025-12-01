package com.unity3d.player;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;

public class UnityPlayerActivity extends Activity implements IUnityPlayerLifecycleEvents {
    protected UnityPlayer mUnityPlayer;

    @Override  // android.app.Activity
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return keyEvent0.getAction() == 2 ? this.mUnityPlayer.injectEvent(keyEvent0) : super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.app.Activity
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.mUnityPlayer.configurationChanged(configuration0);
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        this.requestWindowFeature(1);
        super.onCreate(bundle0);
        String s = this.updateUnityCommandLineArguments(this.getIntent().getStringExtra("unity"));
        this.getIntent().putExtra("unity", s);
        UnityPlayer unityPlayer0 = new UnityPlayer(this, this);
        this.mUnityPlayer = unityPlayer0;
        this.setContentView(unityPlayer0);
        this.mUnityPlayer.requestFocus();
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        this.mUnityPlayer.destroy();
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        return this.mUnityPlayer.injectEvent(motionEvent0);
    }

    @Override  // android.app.Activity
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        return this.mUnityPlayer.injectEvent(keyEvent0);
    }

    @Override  // android.app.Activity
    public boolean onKeyUp(int v, KeyEvent keyEvent0) {
        return this.mUnityPlayer.injectEvent(keyEvent0);
    }

    @Override  // android.app.Activity
    public void onLowMemory() {
        super.onLowMemory();
        this.mUnityPlayer.lowMemory();
    }

    @Override  // android.app.Activity
    protected void onNewIntent(Intent intent0) {
        this.setIntent(intent0);
        this.mUnityPlayer.newIntent(intent0);
    }

    @Override  // android.app.Activity
    protected void onPause() {
        super.onPause();
        MultiWindowSupport.saveMultiWindowMode(this);
        if(MultiWindowSupport.isInMultiWindowMode(this)) {
            return;
        }
        this.mUnityPlayer.pause();
    }

    @Override  // android.app.Activity
    protected void onResume() {
        super.onResume();
        if(MultiWindowSupport.isInMultiWindowMode(this) && !MultiWindowSupport.isMultiWindowModeChangedToTrue(this)) {
            return;
        }
        this.mUnityPlayer.resume();
    }

    @Override  // android.app.Activity
    protected void onStart() {
        super.onStart();
        if(!MultiWindowSupport.isInMultiWindowMode(this)) {
            return;
        }
        this.mUnityPlayer.resume();
    }

    @Override  // android.app.Activity
    protected void onStop() {
        super.onStop();
        if(!MultiWindowSupport.isInMultiWindowMode(this)) {
            return;
        }
        this.mUnityPlayer.pause();
    }

    @Override  // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        return this.mUnityPlayer.injectEvent(motionEvent0);
    }

    @Override  // android.app.Activity
    public void onTrimMemory(int v) {
        super.onTrimMemory(v);
        if(v == 15) {
            this.mUnityPlayer.lowMemory();
        }
    }

    @Override  // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerQuitted() {
    }

    @Override  // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerUnloaded() {
        this.moveTaskToBack(true);
    }

    @Override  // android.app.Activity
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.mUnityPlayer.windowFocusChanged(z);
    }

    protected String updateUnityCommandLineArguments(String s) {
        return s;
    }
}

