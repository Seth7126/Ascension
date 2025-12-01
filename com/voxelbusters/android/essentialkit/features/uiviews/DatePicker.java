package com.voxelbusters.android.essentialkit.features.uiviews;

import android.app.Activity;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.DatePickerDialog;
import com.voxelbusters.android.essentialkit.common.annotations.RunOnUiThread;
import com.voxelbusters.android.essentialkit.common.interfaces.IFeature;
import java.util.Calendar;
import java.util.Date;

public class DatePicker implements IFeature {
    private Activity context;
    private DatePickerDialog dialog;

    public DatePicker(Activity activity0) {
        this.context = activity0;
    }

    @Override  // com.voxelbusters.android.essentialkit.common.interfaces.IFeature
    public String getFeatureName() {
        return "Date Picker";
    }

    @RunOnUiThread
    public void setListener(IDatePickerListener iUiViews$IDatePickerListener0) {
        Calendar calendar0 = Calendar.getInstance();
        this.dialog = new DatePickerDialog(this.context, new DatePickerDialog.OnDateSetListener() {
            @Override  // android.app.DatePickerDialog$OnDateSetListener
            public void onDateSet(android.widget.DatePicker datePicker0, int v, int v1, int v2) {
                System.out.println("On Date Set");
                IDatePickerListener iUiViews$IDatePickerListener0 = iUiViews$IDatePickerListener0;
                if(iUiViews$IDatePickerListener0 != null) {
                    iUiViews$IDatePickerListener0.onSuccess(v, v1, v2);
                }
            }
        }, calendar0.get(1), calendar0.get(2), calendar0.get(5));
    }

    @RunOnUiThread
    public void setMaxValue(Date date0) {
        this.dialog.getDatePicker().setMaxDate(date0.getTime());
    }

    @RunOnUiThread
    public void setMinValue(Date date0) {
        this.dialog.getDatePicker().setMinDate(date0.getTime());
    }

    @RunOnUiThread
    public void setValue(int v, int v1, int v2) {
        this.dialog.getDatePicker().updateDate(v, v1, v2);
    }

    @RunOnUiThread
    public void show() {
        this.dialog.show();
    }
}

