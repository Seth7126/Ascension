package com.google.android.play.core.assetpacks;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.assetpacks.model.a;
import java.util.Locale;

public class AssetPackException extends ApiException {
    AssetPackException(int v) {
        super(new Status(v, String.format(Locale.getDefault(), "Asset Pack Download Error(%d): %s", v, a.a(v))));
        if(v == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}

