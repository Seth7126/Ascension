// 函数: _ZN14ascensionrules31WhenTrophyOwnerDefeatsGrowmitesEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfe9ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 0x1b)
    int32_t lr_1 = *(arg3 + 0x4c)
    
    if (lr_1 == *(*(arg2 + 0x10) + 0xc) && *(arg2 + 0x14) == lr_1)
        void* r2 = *(*(arg3 + 0x50) + 0xc)
        
        if (*(r2 + 0x88) != 3)
            return 0
        
        int32_t temp0 = 0
        int32_t i = strcmp(r2 + 4, "Growmites")
        
        while (i != 0)
            i u>>= 1
            temp0 += 1
        
        return (0x20 - temp0) u>> 5

return 0
