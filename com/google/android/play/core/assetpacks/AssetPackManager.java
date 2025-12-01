package com.google.android.play.core.assetpacks;

import android.app.Activity;
import androidx.activity.result.ActivityResultLauncher;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Map;

public interface AssetPackManager {
    AssetPackStates cancel(List arg1);

    void clearListeners();

    Task fetch(List arg1);

    AssetLocation getAssetLocation(String arg1, String arg2);

    AssetPackLocation getPackLocation(String arg1);

    Map getPackLocations();

    Task getPackStates(List arg1);

    void registerListener(AssetPackStateUpdateListener arg1);

    Task removePack(String arg1);

    Task showCellularDataConfirmation(Activity arg1);

    boolean showCellularDataConfirmation(ActivityResultLauncher arg1);

    void unregisterListener(AssetPackStateUpdateListener arg1);
}

