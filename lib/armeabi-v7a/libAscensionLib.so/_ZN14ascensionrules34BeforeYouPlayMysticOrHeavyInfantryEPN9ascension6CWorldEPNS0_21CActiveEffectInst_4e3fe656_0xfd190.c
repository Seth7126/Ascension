// 函数: _ZN14ascensionrules34BeforeYouPlayMysticOrHeavyInfantryEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfd190
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 0x13)
    if (*(arg3 + 0x4c) != *(arg2 + 0x14))
        return 0
    
    void* r1_1 = *(arg3 + 0x50)
    
    if (r1_1 != 0)
        void* r2 = *(r1_1 + 0xc)
        
        if (*(r2 + 0x88) == 1 && *(r2 + 0x8c) == 0)
            if (strcasecmp(r2 + 0x44, "Mystic") == 0)
                return 1
            
            int32_t temp0 = 0
            int32_t i = strcasecmp(r2 + 0x44, "Heavy Infantry")
            
            while (i != 0)
                i u>>= 1
                temp0 += 1
            
            return (0x20 - temp0) u>> 5

return 0
