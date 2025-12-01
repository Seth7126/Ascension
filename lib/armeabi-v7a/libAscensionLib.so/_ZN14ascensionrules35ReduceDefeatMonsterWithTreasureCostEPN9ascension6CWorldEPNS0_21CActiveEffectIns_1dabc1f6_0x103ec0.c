// 函数: _ZN14ascensionrules35ReduceDefeatMonsterWithTreasureCostEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x103ec0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 8 && *(arg3 + 0x4c) == *(arg2 + 0x14))
    result = 1
    
    if (*(arg3 + 0x50) s>= 1)
        int32_t i = 0
        
        do
            int32_t* r0 = *(arg3 + 0x54)
            
            if (*(r0 + i * 0x34 + 4) == 7)
                void* r8_1 = r0[i * 0xd]
                
                if (*(*(r8_1 + 0xc) + 0x88) == 3)
                    for (int32_t j = 0; j != 7; j += 1)
                        int32_t* r0_4 = ascension::CWorld::GetCenterRowCardStackList(arg1)
                        
                        if (r0_4 != 0)
                            int32_t r1_6 = *r0_4
                            int32_t* k = r0_4[1]
                            
                            while (r1_6 != k)
                                k -= 8
                                
                                if (*k == r8_1)
                                    for (; r1_6 != k; k -= 8)
                                        if (*(k - 4) == 3)
                                            void* r0_6 = *(arg3 + 0x54) + i * 0x34
                                            *(r0_6 + 0xc) -= arg4
                                            break
                                    
                                    break
            
            i += 1
        while (i s< *(arg3 + 0x50))
        
        return 1

return result
