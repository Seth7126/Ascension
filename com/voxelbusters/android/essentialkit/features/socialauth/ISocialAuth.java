package com.voxelbusters.android.essentialkit.features.socialauth;

public class ISocialAuth {
    public interface IFetchServerCredentials {
        void onFailure(String arg1);

        void onSuccess(String arg1, String arg2, String arg3);
    }

}

