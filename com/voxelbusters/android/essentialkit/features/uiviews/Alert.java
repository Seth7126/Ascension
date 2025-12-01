package com.voxelbusters.android.essentialkit.features.uiviews;

import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View.OnClickListener;
import android.view.View;
import com.voxelbusters.android.essentialkit.common.annotations.RunOnUiThread;
import com.voxelbusters.android.essentialkit.common.interfaces.IFeature;
import com.voxelbusters.android.essentialkit.utilities.Logger;
import java.util.ArrayList;

public class Alert implements IFeature {
    class ButtonInfo {
        public View.OnClickListener callback;
        public boolean isCancelType;
        public String text;

        public ButtonInfo(String s, boolean z, View.OnClickListener view$OnClickListener0) {
            this.text = s;
            this.isCancelType = z;
            this.callback = view$OnClickListener0;
        }
    }

    private ArrayList buttons;
    private Context context;
    private AlertDialog dialog;
    private IButtonClickListener listener;
    private String message;
    private String title;

    public Alert(Context context0) {
        this.context = context0;
    }

    public void addButton(String s, boolean z) {
        if(this.buttons == null) {
            this.buttons = new ArrayList();
        }
        this.buttons.add(new ButtonInfo(this, s, z, new View.OnClickListener() {
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                int v = Alert.this.buttons.size();
                Logger.debug(("Button Index : " + v + "  buttons final : " + (Alert.this.buttons.size() - 1)));
                if(Alert.this.listener != null) {
                    Alert.this.listener.onClick(v);
                }
            }
        }));
    }

    @RunOnUiThread
    public void dismiss() {
        if(this.dialog != null && this.dialog.isShowing()) {
            this.dialog.dismiss();
            this.dialog = null;
        }
    }

    @Override  // com.voxelbusters.android.essentialkit.common.interfaces.IFeature
    public String getFeatureName() {
        return "Alert View";
    }

    public String getMessage() {
        return this.message;
    }

    private int getThemeStyle() [...] // Inlined contents

    public String getTitle() {
        return this.title;
    }

    public void setMessage(String s) {
        this.message = s;
    }

    public void setTitle(String s) {
        this.title = s;
    }

    @RunOnUiThread
    public void show(IButtonClickListener iUiViews$IButtonClickListener0) {
        this.listener = iUiViews$IButtonClickListener0;
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(new ContextThemeWrapper(this.context, 0x1030239));
        alertDialog$Builder0.setTitle(this.title);
        alertDialog$Builder0.setMessage(this.message);
        alertDialog$Builder0.setCancelable(false);
        if(this.buttons != null) {
            for(int v = 0; v < this.buttons.size(); ++v) {
                ButtonInfo alert$ButtonInfo0 = (ButtonInfo)this.buttons.get(v);
                switch(-1 - v) {
                    case -3: {
                        alertDialog$Builder0.setNeutralButton(alert$ButtonInfo0.text, null);
                        break;
                    }
                    case -2: {
                        alertDialog$Builder0.setNegativeButton(alert$ButtonInfo0.text, null);
                        break;
                    }
                    case -1: {
                        alertDialog$Builder0.setPositiveButton(alert$ButtonInfo0.text, null);
                        break;
                    }
                    default: {
                        Logger.error("Only max 3 buttons are allowed");
                    }
                }
            }
        }
        AlertDialog alertDialog0 = alertDialog$Builder0.create();
        this.dialog = alertDialog0;
        alertDialog0.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override  // android.content.DialogInterface$OnShowListener
            public void onShow(DialogInterface dialogInterface0) {
                if(Alert.this.buttons != null) {
                    for(int v = 0; v < Alert.this.buttons.size(); ++v) {
                        Alert.this.dialog.getButton(-1 - v).setOnClickListener(new View.OnClickListener() {
                            @Override  // android.view.View$OnClickListener
                            public void onClick(View view0) {
                                Logger.debug(("Button Index : " + v + "  buttons final : " + (Alert.this.buttons.size() - 1)));
                                if(com.voxelbusters.android.essentialkit.features.uiviews.Alert.2.this.val$listener != null) {
                                    com.voxelbusters.android.essentialkit.features.uiviews.Alert.2.this.val$listener.onClick(v);
                                }
                            }
                        });
                    }
                }
            }
        });
        this.dialog.show();
    }
}

