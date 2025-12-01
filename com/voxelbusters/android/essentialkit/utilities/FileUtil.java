package com.voxelbusters.android.essentialkit.utilities;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.exifinterface.media.ExifInterface;
import com.voxelbusters.android.essentialkit.common.interfaces.IMonitorFileResultListener;
import com.voxelbusters.android.essentialkit.features.sharingservices.FileAttachment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class FileUtil {
    public static final int IMAGE_QUALITY = 100;

    private static void createDirectoriesIfUnAvailable(String s) {
        File file0 = new File(s);
        if(!file0.exists()) {
            file0.mkdirs();
        }
    }

    public static Uri createLocalCacheFileUri(Context context0, byte[] arr_b, int v, String s, String s1) {
        String s2 = FileUtil.getSavedFile(arr_b, v, ApplicationUtil.getLocalCacheDirectory(context0, s), s1, false);
        if(!StringUtil.isNullOrEmpty(s2)) {
            Uri uri0 = FileProvider.getUriForFile(context0, ApplicationUtil.getFileProviderAuthorityName(context0), new File(s2));
            context0.grantUriPermission("com.playdekgames.android.Ascension", uri0, 3);
            return uri0;
        }
        return null;
    }

    private static void createPathIfUnAvailable(File file0, File file1) {
        if(!file1.exists()) {
            try {
                file0.mkdirs();
                file1.createNewFile();
            }
            catch(IOException iOException0) {
                Logger.error("Creating file failed!");
                iOException0.printStackTrace();
            }
        }
    }

    public static void deleteFileAttachments(Context context0, List list0) {
        if(list0 != null) {
            for(Object object0: list0) {
                context0.getContentResolver().delete(((FileAttachment)object0).uri, null, null);
            }
        }
    }

    private static ExifInfo getBitmapOrientation(Context context0, Uri uri0) {
        boolean z;
        int v = 0;
        try {
            z = true;
            int v1 = new ExifInterface(context0.getContentResolver().openInputStream(uri0)).getAttributeInt("Orientation", 1);
            if(v1 == 0) {
                return new ExifInfo(((float)FileUtil.getOrientationFromMediaStore(context0, uri0)), false);
            }
            switch(v1) {
                case 2: {
                    return new ExifInfo(((float)v), z);
                }
                case 3: {
                    z = v;
                    v = 180;
                    return new ExifInfo(180.0f, z);
                }
                case 4: {
                    v = 1;
                    z = v;
                    v = 180;
                    return new ExifInfo(180.0f, z);
                }
                case 5: {
                    v = 1;
                    z = v;
                    v = 90;
                    return new ExifInfo(90.0f, z);
                }
                case 6: {
                    z = v;
                    v = 90;
                    return new ExifInfo(90.0f, z);
                }
                case 7: {
                    v = 1;
                    z = v;
                    v = 270;
                    return new ExifInfo(270.0f, z);
                }
                case 8: {
                    z = v;
                    v = 270;
                    return new ExifInfo(270.0f, z);
                }
                default: {
                    Logger.debug(("Unknown Orientation in Exif : " + v1));
                }
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        z = false;
        return new ExifInfo(((float)v), z);
    }

    public static File getLocalFile(Context context0, String s, String s1) {
        return new File(ApplicationUtil.getLocalCacheDirectory(context0, s), s1);
    }

    public static String getMimeType(byte[] arr_b, int v) {
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(arr_b, 0, v, bitmapFactory$Options0);
        return bitmapFactory$Options0.outMimeType;
    }

    public static int getOrientationFromMediaStore(Context context0, Uri uri0) {
        String[] arr_s = {"_data", "orientation"};
        Cursor cursor0 = context0.getContentResolver().query(uri0, arr_s, null, null, null);
        if(cursor0 != null && cursor0.getColumnCount() != 0) {
            cursor0.moveToFirst();
            int v = cursor0.getInt(cursor0.getColumnIndex(arr_s[1]));
            cursor0.close();
            return v;
        }
        return 0;
    }

    public static String getSavedFile(byte[] arr_b, int v, File file0, String s, boolean z) {
        return FileUtil.getSavedFile(arr_b, v, file0, s, z, true);
    }

    private static String getSavedFile(byte[] arr_b, int v, File file0, String s, boolean z, boolean z1) {
        FileUtil.createDirectoriesIfUnAvailable(file0.getAbsolutePath());
        File file1 = new File(file0, s);
        if(file1.exists()) {
            file1.delete();
            try {
                file1.createNewFile();
            }
            catch(IOException iOException0) {
                iOException0.printStackTrace();
            }
        }
        if(z1) {
            file1.setReadable(true, false);
            file1.setWritable(true, false);
        }
        try {
            FileOutputStream fileOutputStream0 = new FileOutputStream(file1);
            if(arr_b != null) {
                fileOutputStream0.write(arr_b);
            }
            fileOutputStream0.close();
            String s1 = file1.getAbsolutePath();
            return s1 == null || !z ? s1 : "file://" + s1;
        }
        catch(FileNotFoundException fileNotFoundException0) {
            fileNotFoundException0.printStackTrace();
            return null;
        }
        catch(IOException iOException1) {
            iOException1.printStackTrace();
            return null;
        }
    }

    private static float getScaleFactor(int sizeRequired, int width, int height) {
        if(height > 0 && width > 0 && sizeRequired > 0 && (width > sizeRequired || height > sizeRequired)) {
            return ((float)width) / (((float)height) * 1.0f) > 1.0f ? ((float)sizeRequired) / (((float)width) * 1.0f) : ((float)sizeRequired) / (((float)height) * 1.0f);
        }
        return 1.0f;
    }

    public static String getScaledImagePathFromBitmap(Bitmap bitmap0, File file0, String s, float f) {
        return FileUtil.getScaledImagePathFromBitmap(bitmap0, file0, s, f, new ExifInfo(0.0f, false));
    }

    public static String getScaledImagePathFromBitmap(Bitmap bitmap0, File file0, String s, float f, ExifInfo exifInfo0) {
        String s1 = null;
        if(bitmap0 == null) {
            return null;
        }
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        if(v == 0 || v1 == 0) {
            Logger.error("Width and height should be greater than zero. Returning null reference");
        }
        else {
            Matrix matrix0 = new Matrix();
            matrix0.postScale(f, f);
            matrix0.postRotate(exifInfo0.getRotation());
            matrix0.postScale((exifInfo0.isFlipped() ? -1.0f : 1.0f), 1.0f);
            try {
                s1 = FileUtil.saveBitmap(Bitmap.createBitmap(bitmap0, 0, 0, v, v1, matrix0, true), file0, s, true);
            }
            catch(Throwable throwable0) {
                Logger.error(("Error while creating bitmap" + throwable0));
            }
        }
        if(!bitmap0.isRecycled()) {
            bitmap0.recycle();
        }
        return s1;
    }

    public static Uri getUriFromFile(Context context0, File file0) {
        Uri uri0 = null;
        try {
            uri0 = FileProvider.getUriForFile(context0, ApplicationUtil.getFileProviderAuthorityName(context0), file0);
            context0.grantUriPermission("com.playdekgames.android.Ascension", uri0, 3);
            System.out.println("Uri : " + uri0);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return uri0;
    }

    public static void limitImageToMaxResolution(Context context0, int v, Uri uri0, File file0) {
        int v3;
        try {
            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inJustDecodeBounds = true;
            InputStream inputStream0 = context0.getContentResolver().openInputStream(uri0);
            BitmapFactory.decodeStream(inputStream0, null, bitmapFactory$Options0);
            int v1 = bitmapFactory$Options0.outWidth;
            int v2 = bitmapFactory$Options0.outHeight;
            if(v1 <= v && v2 <= v) {
                v3 = 1;
            }
            else {
                v3 = (int)Math.floor(((float)v1) / ((float)v));
                int v4 = (int)Math.floor(((float)v2) / ((float)v));
                if(v3 <= 1 && v4 <= 1) {
                    v3 = 1;
                }
                else if(v4 > v3) {
                    v3 = v4;
                }
            }
            bitmapFactory$Options0.inSampleSize = Math.max(v3 / 2 * 2, 1);
            inputStream0.close();
            bitmapFactory$Options0.inJustDecodeBounds = false;
            InputStream inputStream1 = context0.getContentResolver().openInputStream(uri0);
            Bitmap bitmap0 = BitmapFactory.decodeStream(inputStream1, null, bitmapFactory$Options0);
            if(bitmap0 != null) {
                float f = FileUtil.getScaleFactor(v, bitmap0.getWidth(), bitmap0.getHeight());
                FileUtil.getScaledImagePathFromBitmap(bitmap0, file0.getParentFile(), file0.getName(), f, FileUtil.getBitmapOrientation(context0, uri0));
            }
            inputStream1.close();
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
        }
    }

    public static byte[] loadFile(Context context0, Uri uri0) {
        try {
            InputStream inputStream0 = context0.getContentResolver().openInputStream(uri0);
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byte[] arr_b = new byte[0x400];
            int v;
            while((v = inputStream0.read(arr_b)) != -1) {
                byteArrayOutputStream0.write(arr_b, 0, v);
            }
            return byteArrayOutputStream0.toByteArray();
        }
        catch(Exception exception0) {
            Logger.error(exception0.getMessage());
            return null;
        }
    }

    public static void monitorFile(String s, IMonitorFileResultListener iMonitorFileResultListener0) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                File file0 = new File(s);
                while(!file0.exists()) {
                    try {
                        Thread.sleep(10L);
                    }
                    catch(InterruptedException interruptedException0) {
                        interruptedException0.printStackTrace();
                    }
                }
                if(iMonitorFileResultListener0 != null) {
                    Logger.debug(("monitorFile : " + file0.getAbsolutePath()));
                    IMonitorFileResultListener iMonitorFileResultListener0 = iMonitorFileResultListener0;
                    boolean z = file0.exists();
                    if(!file0.exists()) {
                        file0 = null;
                    }
                    iMonitorFileResultListener0.onResult(z, file0);
                }
            }
        }).start();
    }

    public static String saveBitmap(Bitmap bitmap0, File file0, String s, boolean z) {
        Throwable throwable1;
        IOException iOException1;
        FileOutputStream fileOutputStream0;
        File file1 = new File(file0, s);
        FileUtil.createPathIfUnAvailable(file0, file1);
        try {
            fileOutputStream0 = null;
            fileOutputStream0 = new FileOutputStream(file1);
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            goto label_17;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_28;
        }
        try {
            if(bitmap0.hasAlpha()) {
                bitmap0.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream0);
            }
            else {
                bitmap0.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream0);
            }
            goto label_38;
        }
        catch(IOException iOException1) {
            try {
            label_17:
                Logger.error(("Error creating scaled bitmap " + iOException1.getMessage()));
                iOException1.printStackTrace();
                if(z) {
                    goto label_20;
                }
                goto label_23;
            }
            catch(Throwable throwable1) {
                goto label_28;
            }
            try {
            label_20:
                if(!bitmap0.isRecycled()) {
                    bitmap0.recycle();
                    System.gc();
                }
            label_23:
                if(fileOutputStream0 != null) {
                    fileOutputStream0.flush();
                    fileOutputStream0.close();
                }
            }
            catch(IOException iOException2) {
                iOException2.printStackTrace();
                return file1.getAbsolutePath();
            }
            return file1.getAbsolutePath();
        }
        catch(Throwable throwable1) {
        }
        try {
        label_28:
            if(z && !bitmap0.isRecycled()) {
                bitmap0.recycle();
                System.gc();
            }
            if(fileOutputStream0 != null) {
                fileOutputStream0.flush();
                fileOutputStream0.close();
            }
        }
        catch(IOException iOException3) {
            iOException3.printStackTrace();
        }
        throw throwable1;
        try {
        label_38:
            if(z && !bitmap0.isRecycled()) {
                bitmap0.recycle();
                System.gc();
            }
            fileOutputStream0.flush();
            fileOutputStream0.close();
            return file1.getAbsolutePath();
        }
        catch(IOException iOException2) {
        }
        iOException2.printStackTrace();
        return file1.getAbsolutePath();
    }
}

