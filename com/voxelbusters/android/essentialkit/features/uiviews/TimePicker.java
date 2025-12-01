package com.voxelbusters.android.essentialkit.features.uiviews;

import android.app.Activity;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.app.TimePickerDialog;
import com.voxelbusters.android.essentialkit.common.annotations.RunOnUiThread;
import com.voxelbusters.android.essentialkit.common.interfaces.IFeature;
import java.util.Calendar;

public class TimePicker implements IFeature {
    private Activity context;
    private TimePickerDialog dialog;

    public TimePicker(Activity activity0) {
        this.context = activity0;
    }

    @Override  // com.voxelbusters.android.essentialkit.common.interfaces.IFeature
    public String getFeatureName() {
        return "Time Picker";
    }

    @RunOnUiThread
    public void setListener(ITimePickerListener iUiViews$ITimePickerListener0) {
        Calendar calendar0 = Calendar.getInstance();
        this.dialog = new TimePickerDialog(this.context, new TimePickerDialog.OnTimeSetListener() {
            @Override  // android.app.TimePickerDialog$OnTimeSetListener
            public void onTimeSet(android.widget.TimePicker timePicker0, int v, int v1) {
                System.out.println("On Time Set");
                ITimePickerListener iUiViews$ITimePickerListener0 = iUiViews$ITimePickerListener0;
                if(iUiViews$ITimePickerListener0 != null) {
                    iUiViews$ITimePickerListener0.onSuccess(v, v1);
                }
            }
        }, calendar0.get(11), calendar0.get(12), true);
    }

    public void setValue(int v, int v1) {
        this.dialog.updateTime(v, v1);
    }

    @RunOnUiThread
    public void show() {
        this.dialog.show();
    }
}

