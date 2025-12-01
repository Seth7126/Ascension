package androidx.profileinstaller;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import jeb.synthetic.TWR;

public class DeviceProfileWriter {
    public static class ExistingProfileState {
        private final boolean mCurExists;
        private final long mCurLength;
        private final boolean mRefExists;
        private final long mRefLength;

        ExistingProfileState(long v, long v1, boolean z, boolean z1) {
            this.mCurLength = v;
            this.mRefLength = v1;
            this.mCurExists = z;
            this.mRefExists = z1;
        }

        public long getCurLength() {
            return this.mCurLength;
        }

        public long getRefLength() {
            return this.mRefLength;
        }

        public boolean hasCurFile() {
            return this.mCurExists;
        }

        public boolean hasRefFile() {
            return this.mRefExists;
        }
    }

    public interface SkipStrategy {
        boolean shouldSkip(long arg1, ExistingProfileState arg2);
    }

    private final AssetManager mAssetManager;
    private final File mCurProfile;
    private final byte[] mDesiredVersion;
    private boolean mDeviceSupportsAotProfile;
    private final DiagnosticsCallback mDiagnostics;
    private final Executor mExecutor;
    private Map mProfile;
    private final String mProfileSourceLocation;
    private final File mRefProfile;
    private byte[] mTranscodedProfile;

    public DeviceProfileWriter(AssetManager assetManager0, Executor executor0, DiagnosticsCallback profileInstaller$DiagnosticsCallback0, String s, File file0, File file1) {
        this.mDeviceSupportsAotProfile = false;
        this.mAssetManager = assetManager0;
        this.mExecutor = executor0;
        this.mDiagnostics = profileInstaller$DiagnosticsCallback0;
        this.mProfileSourceLocation = s;
        this.mCurProfile = file0;
        this.mRefProfile = file1;
        this.mDesiredVersion = DeviceProfileWriter.desiredVersion();
    }

    private void assertDeviceAllowsProfileInstallerAotWritesCalled() {
        if(!this.mDeviceSupportsAotProfile) {
            throw new IllegalStateException("This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public DeviceProfileWriter copyProfileOrRead(SkipStrategy deviceProfileWriter$SkipStrategy0) {
        FileOutputStream fileOutputStream0;
        byte[] arr_b1;
        FileInputStream fileInputStream0;
        AssetFileDescriptor assetFileDescriptor0;
        this.assertDeviceAllowsProfileInstallerAotWritesCalled();
        byte[] arr_b = this.mDesiredVersion;
        if(arr_b == null) {
            return this;
        }
        try {
            assetFileDescriptor0 = this.mAssetManager.openFd(this.mProfileSourceLocation);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            goto label_36;
        }
        catch(IOException iOException0) {
            goto label_39;
        }
        catch(IllegalStateException illegalStateException0) {
            goto label_42;
        }
        try {
            fileInputStream0 = assetFileDescriptor0.createInputStream();
        }
        catch(Throwable throwable0) {
            goto label_31;
        }
        try {
            arr_b1 = ProfileTranscoder.readHeader(fileInputStream0);
            if(!Arrays.equals(arr_b, arr_b1) == 0) {
                if(!deviceProfileWriter$SkipStrategy0.shouldSkip(assetFileDescriptor0.getLength(), this.generateExistingProfileStateFromFileSystem())) {
                    fileOutputStream0 = new FileOutputStream(this.mCurProfile);
                    goto label_10;
                }
                goto label_18;
            }
            goto label_22;
        }
        catch(Throwable throwable1) {
            goto label_26;
        }
        try {
        label_10:
            ProfileTranscoder.writeHeader(fileOutputStream0, arr_b);
            Encoding.writeAll(fileInputStream0, fileOutputStream0);
            goto label_16;
        }
        catch(Throwable throwable2) {
            try {
                TWR.safeClose$NT(fileOutputStream0, throwable2);
                throw throwable2;
            label_16:
                fileOutputStream0.close();
                this.mDiagnostics.onResultReceived(1, null);
            label_18:
                if(fileInputStream0 != null) {
                    goto label_19;
                }
                goto label_20;
            }
            catch(Throwable throwable1) {
                goto label_26;
            }
        }
        try {
        label_19:
            fileInputStream0.close();
        }
        catch(Throwable throwable0) {
            goto label_31;
        }
        try {
        label_20:
            assetFileDescriptor0.close();
            return this;
        }
        catch(FileNotFoundException fileNotFoundException0) {
            goto label_36;
        }
        catch(IOException iOException0) {
            goto label_39;
        }
        catch(IllegalStateException illegalStateException0) {
            goto label_42;
        }
        try {
        label_22:
            this.mProfile = ProfileTranscoder.readProfile(fileInputStream0, arr_b1);
            if(fileInputStream0 != null) {
                goto label_28;
            }
            goto label_33;
        }
        catch(Throwable throwable1) {
            try {
            label_26:
                TWR.safeClose$NT(fileInputStream0, throwable1);
                throw throwable1;
            label_28:
                fileInputStream0.close();
                goto label_33;
            }
            catch(Throwable throwable0) {
            }
        }
        try {
        label_31:
            TWR.safeClose$NT(assetFileDescriptor0, throwable0);
            throw throwable0;
        label_33:
            assetFileDescriptor0.close();
        }
        catch(FileNotFoundException fileNotFoundException0) {
        label_36:
            this.mDiagnostics.onResultReceived(6, fileNotFoundException0);
        }
        catch(IOException iOException0) {
        label_39:
            this.mDiagnostics.onResultReceived(7, iOException0);
        }
        catch(IllegalStateException illegalStateException0) {
        label_42:
            this.mDiagnostics.onResultReceived(8, illegalStateException0);
        }
        return this;
    }

    private static byte[] desiredVersion() {
        if(Build.VERSION.SDK_INT < 24) {
            return null;
        }
        switch(Build.VERSION.SDK_INT) {
            case 24: 
            case 25: {
                return ProfileVersion.V001_N;
            }
            case 26: 
            case 27: {
                return ProfileVersion.V005_O;
            }
            case 28: 
            case 29: 
            case 30: {
                return ProfileVersion.V010_P;
            }
            default: {
                return null;
            }
        }
    }

    public boolean deviceAllowsProfileInstallerAotWrites() {
        if(this.mDesiredVersion == null) {
            this.result(3, Build.VERSION.SDK_INT);
            return false;
        }
        if(!this.mCurProfile.canWrite()) {
            this.result(4, null);
            return false;
        }
        this.mDeviceSupportsAotProfile = true;
        return true;
    }

    private ExistingProfileState generateExistingProfileStateFromFileSystem() {
        return new ExistingProfileState(this.mCurProfile.length(), this.mRefProfile.length(), this.mCurProfile.exists(), this.mRefProfile.exists());
    }

    // 检测为 Lambda 实现
    void lambda$result$0$androidx-profileinstaller-DeviceProfileWriter(int v, Object object0) [...]

    private void result(int v, Object object0) {
        DeviceProfileWriter..ExternalSyntheticLambda0 deviceProfileWriter$$ExternalSyntheticLambda00 = () -> this.mDiagnostics.onResultReceived(v, object0);
        this.mExecutor.execute(deviceProfileWriter$$ExternalSyntheticLambda00);
    }

    public DeviceProfileWriter transcodeIfNeeded() {
        Map map0 = this.mProfile;
        byte[] arr_b = this.mDesiredVersion;
        if(map0 != null && arr_b != null) {
            this.assertDeviceAllowsProfileInstallerAotWritesCalled();
            try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
                ProfileTranscoder.writeHeader(byteArrayOutputStream0, arr_b);
                if(!ProfileTranscoder.transcodeAndWriteBody(byteArrayOutputStream0, arr_b, map0)) {
                    this.mDiagnostics.onResultReceived(5, null);
                    this.mProfile = null;
                    return this;
                }
                this.mTranscodedProfile = byteArrayOutputStream0.toByteArray();
            }
            catch(IOException iOException0) {
                this.mDiagnostics.onResultReceived(7, iOException0);
            }
            catch(IllegalStateException illegalStateException0) {
                this.mDiagnostics.onResultReceived(8, illegalStateException0);
            }
            this.mProfile = null;
        }
        return this;
    }

    public void writeIfNeeded(SkipStrategy deviceProfileWriter$SkipStrategy0) {
        byte[] arr_b = this.mTranscodedProfile;
        if(arr_b == null) {
            return;
        }
        this.assertDeviceAllowsProfileInstallerAotWritesCalled();
        ExistingProfileState deviceProfileWriter$ExistingProfileState0 = this.generateExistingProfileStateFromFileSystem();
        if(!deviceProfileWriter$SkipStrategy0.shouldSkip(((long)arr_b.length), deviceProfileWriter$ExistingProfileState0)) {
            try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b); FileOutputStream fileOutputStream0 = new FileOutputStream(this.mCurProfile)) {
                Encoding.writeAll(byteArrayInputStream0, fileOutputStream0);
                this.result(1, null);
            }
            catch(FileNotFoundException fileNotFoundException0) {
                this.result(6, fileNotFoundException0);
            }
            catch(IOException iOException0) {
                this.result(7, iOException0);
            }
            finally {
                this.mTranscodedProfile = null;
                this.mProfile = null;
            }
        }
    }
}

