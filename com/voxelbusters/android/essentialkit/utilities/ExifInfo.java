package com.voxelbusters.android.essentialkit.utilities;

class ExifInfo {
    private boolean isFlipped;
    private float rotation;

    public ExifInfo(float f, boolean z) {
        this.rotation = f;
        this.isFlipped = z;
    }

    public float getRotation() {
        return this.rotation;
    }

    public boolean isFlipped() {
        return this.isFlipped;
    }
}

