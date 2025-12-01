package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

class Utils {
    private static final Pattern API_KEY_FORMAT = null;
    private static final String APP_ID_IDENTIFICATION_SUBSTRING = ":";
    public static final long AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS;

    static {
        Utils.AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS = TimeUnit.HOURS.toSeconds(1L);
        Utils.API_KEY_FORMAT = Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    public long currentTimeInSecs() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    // 去混淆评级： 低(20)
    public boolean isAuthTokenExpired(PersistedInstallationEntry persistedInstallationEntry0) {
        return TextUtils.isEmpty(persistedInstallationEntry0.getAuthToken()) ? true : persistedInstallationEntry0.getTokenCreationEpochInSecs() + persistedInstallationEntry0.getExpiresInSecs() < this.currentTimeInSecs() + Utils.AUTH_TOKEN_EXPIRATION_BUFFER_IN_SECS;
    }

    static boolean isValidApiKeyFormat(String s) {
        return Utils.API_KEY_FORMAT.matcher(s).matches();
    }

    static boolean isValidAppIdFormat(String s) {
        return s.contains(":");
    }
}

