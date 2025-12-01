// 函数: _ZN14ascensionrules37TriggerIfNotScryerOfLidlessEyeDiscardEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfe29c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg1 + 0x30) u>= 0x13)
    if (*(arg3 + 4) != 0x1a)
        return 0
    
    int32_t* r0_3 = *(arg3 + 0x50)
    
    if (r0_3 != 0 && strcasecmp((*(*r0_3 + 0xc))(), "Scryer of the Lidless Eye") == 0)
        int32_t* r7_1 = *(arg3 + 0x54)
        
        if (r7_1 != *(arg3 + 0x58))
            core::CCardInstance* r8_1 = *(arg3 + 0x4c)
            
            while (true)
                int32_t r2 = *r7_1
                r7_1 = &r7_1[1]
                
                if (ascension::CWorld::QueryCardFaction(arg1, r8_1, r2) == 0)
                    return 1
                
                if (r7_1 == *(arg3 + 0x58))
                    return 0
        
        return 0

return 1
