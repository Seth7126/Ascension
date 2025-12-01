// 函数: GetGameAuctionInsightState
// 地址: 0x18a128
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r12 = *s_pWorldData

if (r12 != 0)
    int32_t r2_1 = *(r12 + 0xd4)
    
    if (r2_1 s>= 1)
        int32_t* r3_1 = r12 + 0x14
        int32_t r0 = 0
        
        do
            if (*r3_1 == arg1)
                int32_t r0_3 = *(r12 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                if (r0_3 != 0)
                    void* r0_4 = ascension::CWorld::GetPlayerByIndex(r0_3)
                    
                    if (r0_4 != 0)
                        int32_t* r0_5 = *(r0_4 + 0xb0)
                        *arg2 = zx.d(*(*r0_5 + 8))
                        arg2[1] = r0_5[1]
                        int32_t r2_2 = r0_5[3]
                        int32_t r3_2 = r0_5[4]
                        int32_t r4_3 = r0_5[5]
                        arg2[2] = r0_5[2]
                        arg2[3] = r2_2
                        arg2[4] = r3_2
                        arg2[5] = r4_3
                        int32_t r2_3 = r0_5[7]
                        int32_t r3_3 = r0_5[8]
                        int32_t r4_5 = r0_5[9]
                        arg2[6] = r0_5[6]
                        arg2[7] = r2_3
                        arg2[8] = r3_3
                        arg2[9] = r4_5
                        int32_t r1_6 = r0_5[0xa]
                        int32_t r2_4 = r0_5[0xb]
                        int32_t r3_5 = r0_5[0xc]
                        arg2[0xd] = r0_5[0xd]
                        arg2[0xa] = r1_6
                        arg2[0xb] = r2_4
                        arg2[0xc] = r3_5
                        return 0x38
                
                break
            
            r0 += 1
            r3_1 = &r3_1[0xc]
        while (r0 s< r2_1)

*arg2 = 0
arg2[1] = 0
__builtin_memset(&arg2[6], 0, 0x20)
return 0x38
