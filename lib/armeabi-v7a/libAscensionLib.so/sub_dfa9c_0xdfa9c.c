// 函数: sub_dfa9c
// 地址: 0xdfa9c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r5 = arg1[4]
void* const r0 = *(r5 + 0x1c)
int32_t r6 = *(r0 - 4)
int32_t r1 = r6 & 0x3f

if (r1 - 6 u<= 0x1c)
    r0 = *(r5 + 0x18)
    
    switch (r1)
        case 6, 7, 0xc, 0xd, 0xe, 0xf, 0x10, 0x11, 0x12, 0x13, 0x15
            int32_t r1_1 = arg1[2]
            arg1[2] = r1_1 - 0x10
            int32_t r7_1 = *(r1_1 - 0xc)
            void* r0_1 = r0 + (0xff0 & r6 u>> 2)
            *r0_1 = *(r1_1 - 0x10)
            *(r0_1 + 4) = r7_1
            *(r0_1 + 8) = *(r1_1 - 8)
            return r0_1
        case 0x16
            int32_t r1_5 = arg1[2]
            int32_t r3_5 = *(r1_5 - 0xc)
            int32_t r7_4 = *(r1_5 - 8)
            *(r1_5 - 0x30) = *(r1_5 - 0x10)
            *(r1_5 - 0x2c) = r3_5
            *(r1_5 - 0x28) = r7_4
            void* r1_6 = r1_5 - 0x20 - (r0 + (0x1ff0 & r6 u>> 0x13))
            
            if (r1_6 s>= 0x11)
                arg1[2] = r1_5 - 0x20
                sub_df3a0(arg1, r1_6 u>> 4)
            
            int32_t r0_9 = arg1[2]
            int32_t r7_5 = *(r0_9 - 0xc)
            int32_t* r2_10 = *(r5 + 0x18) + (0xff0 & r6 u>> 2)
            *r2_10 = *(r0_9 - 0x10)
            r2_10[1] = r7_5
            r2_10[2] = *(r0_9 - 8)
            r0 = *(r5 + 4)
            arg1[2] = r0
        case 0x18, 0x19, 0x1a
            int32_t r2_4 = arg1[2]
            int32_t r3_2 = *(r2_4 - 8)
            uint32_t r8_1
            
            if (r3_2 == 0)
                r8_1 = 1
            else if (r3_2 != 1)
                r8_1 = 0
            else
                int32_t temp0_1 = 0
                uint32_t i = *(r2_4 - 0x10)
                
                while (i != 0)
                    i u>>= 1
                    temp0_1 += 1
                
                r8_1 = (0x20 - temp0_1) u>> 5
            
            uint32_t r7_2 = r8_1 ^ 1
            arg1[2] = r2_4 - 0x10
            
            if (r1 == 0x1a && *(sub_dc704(arg1, r0 + (0x1ff0 & r6 u>> 0x13), 0xe) + 8) == 0)
                r7_2 = r8_1
            
            r0 = r6 u>> 6 & 0xff
            
            if (r7_2 != r0)
                int32_t r0_6 = *(r5 + 0x1c) + 4
                *(r5 + 0x1c) = r0_6
                return r0_6
        case 0x1d
            r0 = 0x7fc000
            
            if ((r6 & 0x7fc000) != 0)
                r0 = *(r5 + 4)
                arg1[2] = r0
        case 0x22
            r0 = *(r5 + 4)
            arg1[2] = r0

return r0
