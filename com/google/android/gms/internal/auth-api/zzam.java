package com.google.android.gms.internal.auth-api;

import com.google.android.gms.common.Feature;

public final class zzam {
    public static final Feature zzcz;
    public static final Feature zzda;
    private static final Feature zzdb;
    private static final Feature zzdc;
    private static final Feature zzdd;
    private static final Feature zzde;
    private static final Feature zzdf;
    public static final Feature[] zzdg;

    static {
        Feature feature0 = new Feature("auth_api_credentials_begin_sign_in", 4L);
        zzam.zzcz = feature0;
        Feature feature1 = new Feature("auth_api_credentials_sign_out", 2L);
        zzam.zzda = feature1;
        Feature feature2 = new Feature("auth_api_credentials_authorize", 1L);
        zzam.zzdb = feature2;
        Feature feature3 = new Feature("auth_api_credentials_revoke_access", 1L);
        zzam.zzdc = feature3;
        Feature feature4 = new Feature("auth_api_credentials_save_password", 3L);
        zzam.zzdd = feature4;
        Feature feature5 = new Feature("auth_api_credentials_get_sign_in_intent", 3L);
        zzam.zzde = feature5;
        Feature feature6 = new Feature("auth_api_credentials_save_account_linking_token", 2L);
        zzam.zzdf = feature6;
        zzam.zzdg = new Feature[]{feature0, feature1, feature2, feature3, feature4, feature5, feature6};
    }
}

