// 函数: _ZN14ascensionrules40MayPutAcquiredHeroOnTopOfDeckOncePerTurnEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x104964
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 6 && ascension::CWorld::HasPlayedActiveEffect(arg1) == 0
        && *(*(arg2 + 0x10) + 0xc) == *(arg3 + 0x4c))
    int32_t r0_3 = *(arg3 + 0x50)
    result = 1
    
    if (r0_3 s>= 1)
        int32_t r7_1 = 0
        int32_t r4_1 = 0
        
        do
            int32_t* r1_3 = *(arg3 + 0x54)
            
            if (*(*(*(r1_3 + r7_1) + 0xc) + 0x88) == 1)
                int32_t var_28_1 = 0
                ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::AddAcquireLocation(
                    r1_3.b + r7_1.b, 2, 0, (*(arg2 + 8)).b)
                r0_3 = *(arg3 + 0x50)
            
            r4_1 += 1
            r7_1 += 0x44
        while (r4_1 s< r0_3)

return result
