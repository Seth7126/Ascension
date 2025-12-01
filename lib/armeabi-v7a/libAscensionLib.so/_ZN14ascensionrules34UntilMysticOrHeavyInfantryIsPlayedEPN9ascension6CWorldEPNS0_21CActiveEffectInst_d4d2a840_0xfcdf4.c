// 函数: _ZN14ascensionrules34UntilMysticOrHeavyInfantryIsPlayedEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfcdf4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 0x14)
    if (*(arg3 + 0x4c) != *(arg2 + 0x14))
        return 0
    
    void* r1_1 = *(arg3 + 0x50)
    
    if (r1_1 != 0)
        char* __s1 = *(r1_1 + 0xc) + 0x44
        
        if (strcasecmp(__s1, "Mystic") == 0)
            return 1
        
        int32_t temp0_1 = 0
        int32_t i = strcasecmp(__s1, "Heavy Infantry")
        
        while (i != 0)
            i u>>= 1
            temp0_1 += 1
        
        return (0x20 - temp0_1) u>> 5

return 0
