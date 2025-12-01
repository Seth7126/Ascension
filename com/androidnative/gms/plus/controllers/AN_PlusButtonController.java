package com.androidnative.gms.plus.controllers;

import android.util.Log;
import com.androidnative.gms.plus.models.AN_PlusButton;
import java.util.HashMap;

public class AN_PlusButtonController {
    private static HashMap buttons;

    static {
        AN_PlusButtonController.buttons = new HashMap();
    }

    public static void createPlusButton(int v, String s, int v1, int v2) {
        Log.d("AndroidNative", "created: " + v);
        AN_PlusButton aN_PlusButton0 = new AN_PlusButton(v, s, v1, v2);
        AN_PlusButtonController.buttons.put(v, aN_PlusButton0);
    }

    public static void hide(int v) {
        if(AN_PlusButtonController.buttons.containsKey(v)) {
            ((AN_PlusButton)AN_PlusButtonController.buttons.get(v)).Hide();
            return;
        }
        Log.d("AndroidNative", "AN_PlusButtonController hide: Button with id : " + v + " not found");
    }

    public static void refresh(int v) {
        if(AN_PlusButtonController.buttons.containsKey(v)) {
            ((AN_PlusButton)AN_PlusButtonController.buttons.get(v)).Refresh();
            return;
        }
        Log.d("AndroidNative", "AN_PlusButtonControllerrefresh : Button with id: " + v + " not found");
    }

    public static void setGravity(int v, int v1) {
        if(AN_PlusButtonController.buttons.containsKey(v1)) {
            ((AN_PlusButton)AN_PlusButtonController.buttons.get(v1)).setGravity(v);
            return;
        }
        Log.d("AndroidNative", "AN_PlusButtonController setGravity: Button with id: " + v1 + " not found");
    }

    public static void setPosition(int v, int v1, int v2) {
        if(AN_PlusButtonController.buttons.containsKey(v2)) {
            Log.d("AndroidNative", "SetPosition");
            ((AN_PlusButton)AN_PlusButtonController.buttons.get(v2)).SetPosition(v, v1);
            return;
        }
        Log.d("AndroidNative", "AN_PlusButtonController setPosition: Button with id: " + v2 + " not found");
    }

    public static void show(int v) {
        if(AN_PlusButtonController.buttons.containsKey(v)) {
            ((AN_PlusButton)AN_PlusButtonController.buttons.get(v)).Show();
            return;
        }
        Log.d("AndroidNative", "AN_PlusButtonController show: Button with id: " + v + " not found");
    }
}

