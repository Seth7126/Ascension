package com.androidnative.gms.plus.models;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.androidnative.gms.utils.AnUtility;
import com.google.android.gms.plus.PlusOneButton.OnPlusOneClickListener;
import com.google.android.gms.plus.PlusOneButton;
import com.unity3d.player.UnityPlayer;

public class AN_PlusButton {
    public static final String CONTROLLER_LISTNER_NAME = "AN_PlusButtonsManager";
    private boolean IsGravityDependent;
    private boolean IsShowed;
    private static final int PLUS_ONE_REQUEST_CODE;
    private int _annotation;
    private int _gravity;
    private int _id;
    private int _size;
    private String _url;
    private int _x;
    private int _y;
    private LinearLayout layout;
    private PlusOneButton p;

    public AN_PlusButton(int v, String s, int v1, int v2) {
        this.IsShowed = true;
        this.IsGravityDependent = false;
        this._id = v;
        this._size = v1;
        this._url = s;
        this._annotation = v2;
        this.InitNewButton();
        this.Show();
    }

    public void Hide() {
        if(this.layout.getParent() != null) {
            this.IsShowed = false;
            this.RemoveLayout();
        }
    }

    public void InitNewButton() {
        PlusOneButton plusOneButton0 = new PlusOneButton(AnUtility.GetApplicationContex());
        this.p = plusOneButton0;
        plusOneButton0.setSize(this._size);
        this.p.setAnnotation(this._annotation);
        this.p.initialize(this._url, new PlusOneButton.OnPlusOneClickListener() {
            public void onPlusOneClick(Intent intent0) {
                Log.d("AndroidNative", "onPlusOneClick");
                UnityPlayer.UnitySendMessage("AN_PlusButtonsManager", "OnPlusClicked", Integer.toString(AN_PlusButton.this._id));
                AnUtility.GetLauncherActivity().startActivityForResult(intent0, 0);
            }
        });
        LinearLayout linearLayout0 = new LinearLayout(AnUtility.GetApplicationContex());
        this.layout = linearLayout0;
        linearLayout0.addView(((View)this.p), new RelativeLayout.LayoutParams(-2, -2));
    }

    public void Refresh() {
        this.RemoveLayout();
        this.InitNewButton();
        if(this.IsGravityDependent) {
            Log.d("AndroidNative", "AN_PlusButton: setGravity after Refeshr");
            this.setGravity(this._gravity);
        }
        else {
            Log.d("AndroidNative", "AN_PlusButton: SetPosition Refeshr");
            this.SetPosition(this._x, this._y);
        }
        Log.d("AndroidNative", "AN_PlusButton: Restoring visual state IsShowed = " + this.IsShowed);
        if(this.IsShowed) {
            this.Show();
            return;
        }
        this.Hide();
    }

    private void RemoveLayout() {
        ((ViewGroup)this.layout.getParent()).removeView(this.layout);
    }

    public void SetPosition(int v, int v1) {
        this._x = v;
        this._y = v1;
        this.IsGravityDependent = false;
        this.layout.setGravity(0x30);
        this.layout.setX(((float)v));
        this.layout.setY(((float)v1));
    }

    public void Show() {
        if(this.layout.getParent() == null) {
            this.IsShowed = true;
            AnUtility.GetLauncherActivity().addContentView(this.layout, new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public void setGravity(int v) {
        this._gravity = v;
        this.IsGravityDependent = true;
        this.layout.setGravity(v);
    }
}

