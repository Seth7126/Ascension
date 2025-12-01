package com.voxelbusters.android.essentialkit.common.interfaces;

import com.voxelbusters.android.essentialkit.common.ByteBuffer;

public interface ILoadAssetListener {
    void onFailure(String arg1);

    void onSuccess(ByteBuffer arg1);
}

