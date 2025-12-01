// 函数: _ZN14ascensionrules39MaySpendPowerToAcquireMechanaConstructsEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x1051d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 6)
    core::CCardInstance* r6_1 = *(arg3 + 0x4c)
    
    if (*(arg2 + 0x14) == r6_1)
        if (*(arg3 + 0x50) s>= 1)
            int32_t r7_1 = 0
            int32_t i = 0
            
            do
                void* r2_1 = *(*(arg3 + 0x54) + r7_1)
                
                if (*(*(r2_1 + 0xc) + 0x88) == 2
                        && ascension::CWorld::QueryCardFaction(arg1, r6_1, r2_1) != 0)
                    *(*(arg3 + 0x54) + r7_1 + 0x18) = 1
                
                i += 1
                r7_1 += 0x44
            while (i s< *(arg3 + 0x50))
        
        return 1

return 0
