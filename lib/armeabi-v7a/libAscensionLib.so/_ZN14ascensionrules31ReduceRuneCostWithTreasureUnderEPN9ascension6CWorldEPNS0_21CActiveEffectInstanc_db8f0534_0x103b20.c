// 函数: _ZN14ascensionrules31ReduceRuneCostWithTreasureUnderEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0x103b20
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (*(arg3 + 4) == 6)
    int32_t r2_1 = *(arg3 + 0x4c)
    
    if (*(arg2 + 0x14) == r2_1 && *(arg1 + 0xb20) == r2_1)
        result = 1
        
        if (*(arg3 + 0x50) s>= 1)
            int32_t i = 0
            
            do
                int32_t r0 = *(arg3 + 0x54)
                int32_t r6_1 = i * 0x11
                
                if (*(r0 + (r6_1 << 2) + 4) == 7)
                    int32_t r8_1 = *(r0 + (r6_1 << 2))
                    
                    for (int32_t j = 0; j != 7; j += 1)
                        int32_t* r0_2 = ascension::CWorld::GetCenterRowCardStackList(arg1)
                        
                        if (r0_2 != 0)
                            int32_t r1_6 = *r0_2
                            int32_t* k = r0_2[1]
                            
                            while (r1_6 != k)
                                k -= 8
                                
                                if (*k == r8_1)
                                    for (; r1_6 != k; k -= 8)
                                        if (*(k - 4) == 3)
                                            void* r0_4 = *(arg3 + 0x54) + (r6_1 << 2)
                                            *(r0_4 + 0xc) -= arg4
                                            break
                                    
                                    break
                
                i += 1
            while (i s< *(arg3 + 0x50))
            
            return 1

return result
