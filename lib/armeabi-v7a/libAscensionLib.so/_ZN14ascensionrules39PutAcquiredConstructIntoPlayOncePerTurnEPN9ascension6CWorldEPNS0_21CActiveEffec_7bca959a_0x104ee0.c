// 函数: _ZN14ascensionrules39PutAcquiredConstructIntoPlayOncePerTurnEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x104ee0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 6 && ascension::CWorld::HasPlayedActiveEffect(arg1) == 0
        && *(arg2 + 0x14) == *(arg3 + 0x4c))
    int32_t r0_2 = *(arg3 + 0x50)
    
    if (r0_2 s>= 1)
        int32_t r6_1 = 0
        int32_t r7_1 = 0
        
        do
            int32_t* r1_3 = *(arg3 + 0x54)
            
            if (*(*(*(r1_3 + r6_1) + 0xc) + 0x88) == 2)
                int32_t var_28_1 = 1
                ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::AddAcquireLocation(
                    r1_3.b + r6_1.b, 4, 0, (*(arg2 + 8)).b)
                r0_2 = *(arg3 + 0x50)
            
            r7_1 += 1
            r6_1 += 0x44
        while (r7_1 s< r0_2)
    
    return 1

return 0
