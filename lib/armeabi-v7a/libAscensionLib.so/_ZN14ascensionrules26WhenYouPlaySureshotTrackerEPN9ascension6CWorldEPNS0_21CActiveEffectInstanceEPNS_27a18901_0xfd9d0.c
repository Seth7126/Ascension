// 函数: _ZN14ascensionrules26WhenYouPlaySureshotTrackerEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfd9d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 0x14 && *(arg3 + 0x4c) == *(arg2 + 0x14))
    void* r5_1 = *(*(arg3 + 0x50) + 0xc)
    
    if (*(r5_1 + 0x88) == 1 && ascension::CCard::IsCardFaction(r5_1) != 0)
        int32_t temp0_1 = 0
        int32_t i = strcasecmp(r5_1 + 4, "Sureshot Tracker")
        
        while (i != 0)
            i u>>= 1
            temp0_1 += 1
        
        return (0x20 - temp0_1) u>> 5

return 0
