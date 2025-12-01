package com.google.android.gms.games.internal;

import com.google.android.gms.internal.games.zzfx;
import com.google.android.gms.internal.games.zzfy;

public final class zzd {
    public static final String zzda;
    public static final String zzdb;
    public static final String zzdc;
    public static final String zzdd;
    private static final String[] zzde;
    private static final String[] zzdf;

    static {
        char[] arr_c = {'¯', '«', ' ', '¸', '\u009E', '³', '®', '¦', '¤', '³', '§', '¤', '±', '\u009E', '¥', '±', '¨', '¤', '­', '£', '\u009E', '²', '³', ' ', '³', '´', '²'};
        for(int v = 0; v < 27; ++v) {
            arr_c[v] = (char)(arr_c[v] - 0x3F);
        }
        zzd.zzda = "play_together_friend_status";
        char[] arr_c1 = {'¯', '«', ' ', '¸', '\u009E', '³', '®', '¦', '¤', '³', '§', '¤', '±', '\u009E', '­', '¨', '¢', 'ª', '­', ' ', '¬', '¤'};
        for(int v1 = 0; v1 < 22; ++v1) {
            arr_c1[v1] = (char)(arr_c1[v1] - 0x3F);
        }
        zzd.zzdb = "play_together_nickname";
        char[] arr_c2 = {'¯', '«', ' ', '¸', '\u009E', '³', '®', '¦', '¤', '³', '§', '¤', '±', '\u009E', '¨', '­', 'µ', '¨', '³', ' ', '³', '¨', '®', '­', '\u009E', '­', '¨', '¢', 'ª', '­', ' ', '¬', '¤'};
        for(int v2 = 0; v2 < 33; ++v2) {
            arr_c2[v2] = (char)(arr_c2[v2] - 0x3F);
        }
        zzd.zzdc = "play_together_invitation_nickname";
        char[] arr_c3 = {'­', '¨', '¢', 'ª', '­', ' ', '¬', '¤', '\u009E', ' ', '¡', '´', '²', '¤', '\u009E', '±', '¤', '¯', '®', '±', '³', '\u009E', '³', '®', 'ª', '¤', '­'};
        for(int v3 = 0; v3 < 27; ++v3) {
            arr_c3[v3] = (char)(arr_c3[v3] - 0x3F);
        }
        zzd.zzdd = "nickname_abuse_report_token";
        zzfy zzfy0 = zzfy.zza("external_player_id", "profile_icon_image_id", "profile_hi_res_image_id", "profile_icon_image_uri", "profile_icon_image_url", "profile_hi_res_image_uri", new String[]{"profile_hi_res_image_url", "profile_name", "last_updated", "is_in_circles", "has_all_public_acls", "has_debug_access", "is_profile_visible", "current_xp_total", "current_level", "current_level_min_xp", "current_level_max_xp", "next_level", "next_level_max_xp", "last_level_up_timestamp", "player_title", "most_recent_external_game_id", "most_recent_game_name", "most_recent_activity_timestamp", "most_recent_game_icon_id", "most_recent_game_icon_uri", "most_recent_game_hi_res_id", "most_recent_game_hi_res_uri", "most_recent_game_featured_id", "most_recent_game_featured_uri", "gamer_tag", "real_name", "banner_image_landscape_id", "banner_image_landscape_uri", "banner_image_landscape_url", "banner_image_portrait_id", "banner_image_portrait_uri", "banner_image_portrait_url", "total_unlocked_achievements", "play_together_friend_status", "play_together_nickname", "play_together_invitation_nickname", "profile_creation_timestamp", "nickname_abuse_report_token", "friends_list_visibility"});
        zzfy zzfy1 = zzfy.zza("gamer_friend_status", "gamer_friend_update_timestamp", "is_muted");
        zzd.zzde = (String[])zzfy0.toArray(new String[0]);
        zzd.zzdf = (String[])((zzfx)((zzfx)new zzfx().zza(zzfy1)).zza(zzfy0)).zzct().toArray(new String[0]);
    }
}

