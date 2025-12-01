// 函数: GetGamePlayerTimer
// 地址: 0x189688
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r1 = *s_pWorldData

if (r1 != 0)
    int32_t r2_1 = *(r1 + 0xd4)
    
    if (r2_1 s>= 1)
        int32_t r7_1 = 0
        int32_t r3_1 = 0
        
        do
            void* r6_1 = r1 + r7_1
            
            if (*(r6_1 + 0x14) == arg1)
                *arg2 = arg1
                int32_t r6_2 = *(r6_1 + 0x20)
                
                if ((zx.d(*(r1 + 0xd8)) & 1 << (r3_1 & 0xff)) == 0)
                    *(arg2 + 0xa) = 0
                else
                    *(arg2 + 0xa) = 1
                    time_t r0_1 = time(nullptr)
                    uint32_t r0_2 = *s_pWorldData
                    int32_t r1_2 = r0_1 - *(r0_2 + 0xa1c)
                    arg1 = *(r0_2 + r7_1 + 0x14)
                    
                    if (r6_2 u<= r1_2)
                        r6_2 = r1_2
                    
                    r6_2 -= r1_2
                
                *arg2 = arg1
                uint32_t r2_6 = r6_2 u/ 0x3c
                arg2[1].w = (r6_2 u/ 0xe10).w
                arg2[2].w = r6_2.w - (((r2_6 << 4) - r6_2 u/ 0x3c) << 2).w
                *(arg2 + 6) = r2_6.w - (r2_6 u/ 0x3c * 0x3c).w
                return 0xc
            
            r3_1 += 1
            r7_1 += 0x30
        while (r3_1 s< r2_1)

arg2[2].w = 0
*arg2 = 0
arg2[1] = 0
return 0xc
