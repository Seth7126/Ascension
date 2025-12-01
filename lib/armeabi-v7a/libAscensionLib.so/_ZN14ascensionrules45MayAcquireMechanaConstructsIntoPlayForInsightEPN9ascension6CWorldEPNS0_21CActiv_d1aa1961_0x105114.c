// 函数: _ZN14ascensionrules45MayAcquireMechanaConstructsIntoPlayForInsightEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x105114
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 6)
    core::CCardInstance* r7_1 = *(arg3 + 0x4c)
    
    if (*(arg2 + 0x14) == r7_1)
        if (*(arg3 + 0x50) s>= 1)
            int32_t r5_1 = 0
            int32_t i = 0
            
            do
                void* r2 = *(*(arg3 + 0x54) + r5_1)
                
                if (*(*(r2 + 0xc) + 0x88) == 2
                        && ascension::CWorld::QueryCardFaction(arg1, r7_1, r2) != 0)
                    int32_t var_28_1 = 0
                    ascension::CEventQueryCardAcquireAttributes::AcquireCardEntry::AddAcquireLocation(
                        (*(arg3 + 0x54)).b + r5_1.b, 4, 1, (*(arg2 + 8)).b)
                
                i += 1
                r5_1 += 0x44
            while (i s< *(arg3 + 0x50))
        
        return 1

return 0
