// 函数: _ZN14ascensionrules30ReduceMechanaConstructRuneCostEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x1039f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 6)
    core::CCardInstance* r5_1 = *(arg3 + 0x4c)
    
    if (*(arg2 + 0x14) == r5_1)
        result = 1
        
        if (*(arg3 + 0x50) s>= 1)
            int32_t r4_1 = 0
            int32_t i = 0
            
            do
                void* r2 = *(*(arg3 + 0x54) + r4_1)
                
                if (*(*(r2 + 0xc) + 0x88) == 2
                        && ascension::CWorld::QueryCardFaction(arg1, r5_1, r2) != 0)
                    void* r0_9 = *(arg3 + 0x54) + r4_1
                    *(r0_9 + 0xc) -= arg4
                
                i += 1
                r4_1 += 0x44
            while (i s< *(arg3 + 0x50))

return result
