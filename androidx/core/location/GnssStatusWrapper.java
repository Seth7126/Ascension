package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build.VERSION;
import androidx.core.util.Preconditions;

class GnssStatusWrapper extends GnssStatusCompat {
    private final GnssStatus mWrapped;

    GnssStatusWrapper(GnssStatus gnssStatus0) {
        this.mWrapped = (GnssStatus)Preconditions.checkNotNull(gnssStatus0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof GnssStatusWrapper ? this.mWrapped.equals(((GnssStatusWrapper)object0).mWrapped) : false;
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int v) {
        return this.mWrapped.getAzimuthDegrees(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int v) {
        if(Build.VERSION.SDK_INT < 30) {
            throw new UnsupportedOperationException();
        }
        return this.mWrapped.getBasebandCn0DbHz(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int v) {
        if(Build.VERSION.SDK_INT < 26) {
            throw new UnsupportedOperationException();
        }
        return this.mWrapped.getCarrierFrequencyHz(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int v) {
        return this.mWrapped.getCn0DbHz(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int v) {
        return this.mWrapped.getConstellationType(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int v) {
        return this.mWrapped.getElevationDegrees(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        return this.mWrapped.getSatelliteCount();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public int getSvid(int v) {
        return this.mWrapped.getSvid(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int v) {
        return this.mWrapped.hasAlmanacData(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int v) {
        return Build.VERSION.SDK_INT < 30 ? false : this.mWrapped.hasBasebandCn0DbHz(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int v) {
        return Build.VERSION.SDK_INT < 26 ? false : this.mWrapped.hasCarrierFrequencyHz(v);
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int v) {
        return this.mWrapped.hasEphemerisData(v);
    }

    @Override
    public int hashCode() {
        return this.mWrapped.hashCode();
    }

    @Override  // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int v) {
        return this.mWrapped.usedInFix(v);
    }
}

