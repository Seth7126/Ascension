package com.voxelbusters.android.essentialkit.common;

import com.voxelbusters.android.essentialkit.common.annotations.SkipInCodeGenerator;
import com.voxelbusters.android.essentialkit.utilities.Logger;

@SkipInCodeGenerator
public class ByteBuffer {
    private byte[] bytes;

    public ByteBuffer(byte[] arr_b) {
        this.bytes = arr_b;
    }

    public byte[] getBytes() {
        Logger.debug(("Get bytes : " + this.bytes + " Size : " + this.size()));
        return this.bytes;
    }

    public int size() {
        return this.bytes == null ? 0 : this.bytes.length;
    }
}

