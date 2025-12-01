// 函数: NetworkGetGamePlayerTimers
// 地址: 0x19ab80
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r3 = *s_pNetworkClientManager
int32_t r2 = *(r3 + 0xdc)
int32_t r3_2 = *(r3 + 0xe0) - r2

if (r3_2 s>= 1)
    int32_t i = 0
    
    do
        void* r4_1 = *(r2 + (i << 2))
        
        if (*(r4_1 + 4) == arg1)
            int32_t result = *(r4_1 + 0xd4)
            
            if (result s>= 1)
                void* r5_1 = r4_1 + 0x20
                int16_t* r6_2 = arg2 + 0xa
                int32_t r8_1 = 0
                
                do
                    *(r6_2 - 0xa) = *(r5_1 - 0xc)
                    int32_t r10_1 = *r5_1
                    
                    if ((zx.d(*(r4_1 + 0xd8)) & 1 << (r8_1 & 0xff)) == 0)
                        *r6_2 = 0
                    else
                        *r6_2 = 1
                        time_t r0_1 = time(nullptr)
                        result = *(r4_1 + 0xd4)
                        int32_t r1_3 = r0_1 - *(r4_1 + 0xa1c)
                        
                        if (r10_1 u<= r1_3)
                            r10_1 = r1_3
                        
                        r10_1 -= r1_3
                    
                    r8_1 += 1
                    r5_1 += 0x30
                    uint32_t r1_6 = r10_1 u/ 0x3c
                    *(r6_2 - 6) = (r10_1 u/ 0xe10).w
                    *(r6_2 - 2) = r10_1.w - (((r1_6 << 4) - r10_1 u/ 0x3c) << 2).w
                    *(r6_2 - 4) = r1_6.w - (r1_6 u/ 0x3c * 0x3c).w
                    r6_2 = &r6_2[6]
                while (r8_1 s< result)
            
            return result
        
        i += 1
    while (i s< r3_2 s>> 2)

return 0
