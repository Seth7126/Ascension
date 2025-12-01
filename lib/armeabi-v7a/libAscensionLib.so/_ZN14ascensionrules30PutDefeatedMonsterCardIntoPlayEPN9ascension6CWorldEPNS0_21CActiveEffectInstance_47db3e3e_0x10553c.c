// 函数: _ZN14ascensionrules30PutDefeatedMonsterCardIntoPlayEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x10553c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 8)
    return 0

if (*(arg3 + 0x50) s>= 1)
    int32_t r7_1 = 0
    int32_t i = 0
    
    do
        int32_t* r0_16 = *(arg3 + 0x54)
        int32_t r5_1 = *(r0_16 + r7_1)
        
        if (*(arg2 + 0x10) == r5_1)
            if (*(arg1 + 0x30) u> 3)
                *(arg2 + 8)
                ascension::CEventQueryCardDefeatAttributes::DefeatCardEntry::AddDefeatLocation(
                    r0_16 + r7_1, 5)
            else if (r5_1 == ascension::CWorld::GetCenterRowCard(arg1))
            label_105620:
                *(arg2 + 8)
                ascension::CEventQueryCardDefeatAttributes::DefeatCardEntry::AddDefeatLocation(
                    *(arg3 + 0x54) + r7_1, 5)
            else
                if (r5_1 == ascension::CWorld::GetCenterRowCard(arg1))
                    goto label_105620
                
                if (r5_1 == ascension::CWorld::GetCenterRowCard(arg1))
                    goto label_105620
                
                if (r5_1 == ascension::CWorld::GetCenterRowCard(arg1))
                    goto label_105620
                
                if (r5_1 == ascension::CWorld::GetCenterRowCard(arg1))
                    goto label_105620
                
                if (r5_1 == ascension::CWorld::GetCenterRowCard(arg1))
                    goto label_105620
                
                if (r5_1 == ascension::CWorld::GetCenterRowCard(arg1))
                    goto label_105620
        
        i += 1
        r7_1 += 0x34
    while (i s< *(arg3 + 0x50))

return 1
