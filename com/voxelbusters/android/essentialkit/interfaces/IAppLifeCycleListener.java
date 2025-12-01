package com.voxelbusters.android.essentialkit.interfaces;

public interface IAppLifeCycleListener {
    void onApplicationPause();

    void onApplicationQuit();

    void onApplicationResume();
}

