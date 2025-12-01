package com.androidnative.gcm;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import java.net.URL;

public class PictureLoadingTask extends AsyncTask {
    private PictureLoadingTaskListener _listener;

    private PictureLoadingTask() {
        this._listener = null;
    }

    public PictureLoadingTask(PictureLoadingTaskListener pictureLoadingTaskListener0) {
        this._listener = pictureLoadingTaskListener0;
    }

    protected Bitmap doInBackground(String[] arr_s) {
        String s = arr_s[0];
        try {
            return BitmapFactory.decodeStream(new URL(s).openStream());
        }
        catch(Exception exception0) {
            Log.d("AndroidNative", "Big Picture Loading Error " + exception0.getMessage());
            exception0.printStackTrace();
            return null;
        }
    }

    @Override  // android.os.AsyncTask
    protected Object doInBackground(Object[] arr_object) {
        return this.doInBackground(((String[])arr_object));
    }

    protected void onPostExecute(Bitmap bitmap0) {
        PictureLoadingTaskListener pictureLoadingTaskListener0 = this._listener;
        if(pictureLoadingTaskListener0 != null) {
            pictureLoadingTaskListener0.onPictureLoaded(bitmap0);
        }
    }

    @Override  // android.os.AsyncTask
    protected void onPostExecute(Object object0) {
        this.onPostExecute(((Bitmap)object0));
    }
}

