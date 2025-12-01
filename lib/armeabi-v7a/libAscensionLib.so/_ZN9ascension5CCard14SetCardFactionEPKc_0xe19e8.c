// 函数: _ZN9ascension5CCard14SetCardFactionEPKc
// 地址: 0xe19e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* entry___s2
int32_t r0 = strcasecmp("none", entry___s2)

if (r0 != 0)
    char r0_2 = 1
    
    if (strcasecmp("Enlightened", entry___s2) != 0)
        if (strcasecmp("Lifebound", entry___s2) == 0)
            r0_2 = 2
        else if (strcasecmp("Mechana", entry___s2) == 0)
            r0_2 = 3
        else
            int32_t r0_5 = strcasecmp("Void", entry___s2)
            
            if (r0_5 != 0)
                return r0_5
            
            r0_2 = 4
    
    r0 = *(arg1 + 0x8c) | 1 << zx.d(r0_2)
    *(arg1 + 0x8c) = r0

return r0
