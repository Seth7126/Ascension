package com.voxelbusters.android.essentialkit.helpers;

import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.Html.ImageGetter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class HtmlImageGetter implements Html.ImageGetter {
    class AsyncImageDownloader extends AsyncTask {
        URL url;
        UrlDrawable urlDrawable;

        public AsyncImageDownloader(String s, UrlDrawable htmlImageGetter$UrlDrawable0) {
            try {
                this.url = new URL(s);
            }
            catch(MalformedURLException malformedURLException0) {
                malformedURLException0.printStackTrace();
            }
            this.urlDrawable = htmlImageGetter$UrlDrawable0;
        }

        protected Drawable doInBackground(Void[] arr_void) {
            try {
                return Drawable.createFromStream(this.url.openStream(), null);
            }
            catch(IOException iOException0) {
                iOException0.printStackTrace();
                return null;
            }
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.doInBackground(((Void[])arr_object));
        }

        protected void onPostExecute(Drawable drawable0) {
            this.urlDrawable.innerDrawable = drawable0;
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object object0) {
            this.onPostExecute(((Drawable)object0));
        }
    }

    class UrlDrawable extends BitmapDrawable {
        protected Drawable innerDrawable;

        private UrlDrawable() {
        }

        UrlDrawable(com.voxelbusters.android.essentialkit.helpers.HtmlImageGetter.1 htmlImageGetter$10) {
        }

        @Override  // android.graphics.drawable.BitmapDrawable
        public void draw(Canvas canvas0) {
            Drawable drawable0 = this.innerDrawable;
            if(drawable0 != null) {
                drawable0.draw(canvas0);
            }
        }
    }

    UrlDrawable urlDrawable;

    @Override  // android.text.Html$ImageGetter
    public Drawable getDrawable(String s) {
        try {
            this.urlDrawable = new UrlDrawable(this, null);
            new AsyncImageDownloader(this, s, this.urlDrawable).execute(new Void[0]);
            return this.urlDrawable;
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            return null;
        }
    }

    class com.voxelbusters.android.essentialkit.helpers.HtmlImageGetter.1 {
    }

}

