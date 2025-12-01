// 函数: lua_resume
// 地址: 0xc9810
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r4 = arg1
int16_t r7 = arg1[9].w

if (arg2 != 0)
    arg1 = zx.d(*(arg2 + 0x26))

r4[9].w = 0

if (arg2 != 0)
    arg1 += 1

int32_t r3 = r4[2]

if (arg2 == 0)
    arg1 = 1

*(r4 + 0x26) = arg1.w
int32_t result_1 = sub_c8cdc(r4, sub_c9a6c, r3 - (arg3 << 4))
int32_t result

if (result_1 == 0xffffffff)
    result = 2
else
    result = result_1
    
    if (result_1 u>= 2)
        int32_t i
        
        do
            void* j_1 = r4[4]
            
            if (j_1 == 0)
            label_c99d4:
                void** r6_2 = r4[2]
                *(r4 + 6) = result.b
                int32_t r0_22
                void* r0_19
                
                if (result == 6)
                    r0_19 = sub_d7eb4(r4, "error in error handling", 0x17)
                    *r6_2 = r0_19
                    r0_22 = zx.d(*(r0_19 + 4)) | 0x40
                else if (result != 4)
                    r0_22 = *(r6_2 - 8)
                    *r6_2 = (*(r6_2 - 0xc)):(*(r6_2 - 0x10))
                else
                    r0_19 = *(r4[3] + 0xb4)
                    *r6_2 = r0_19
                    r0_22 = zx.d(*(r0_19 + 4)) | 0x40
                r6_2[2] = r0_22
                void* r0_23 = r4[4]
                r4[2] = &r6_2[4]
                *(r0_23 + 4) = &r6_2[4]
                break
            
            while ((zx.d(*(j_1 + 0x12)) & 0x10) == 0)
                j_1 = *(j_1 + 8)
                
                if (j_1 == 0)
                    goto label_c99d4
            
            void** r6_1 = r4[7] + *(j_1 + 0x14)
            int32_t r9_2 = sub_cab68(r4, r6_1)
            int32_t r0_8
            void* r0_5
            
            if (result == 6)
                r0_5 = sub_d7eb4(r4, "error in error handling", 0x17)
                *r6_1 = r0_5
                r0_8 = zx.d(*(r0_5 + 4)) | 0x40
            else if (result != 4)
                int32_t r0_9 = r4[2]
                *r6_1 = (*(r0_9 - 0xc)):(*(r0_9 - 0x10))
                r0_8 = *(r0_9 - 8)
            else
                r0_5 = *(r4[3] + 0xb4)
                *r6_1 = r0_5
                r0_8 = zx.d(*(r0_5 + 4)) | 0x40
            r6_1[2] = r0_8
            void* r0_10 = &r6_1[4]
            r4[4] = j_1
            r4[2] = r0_10
            r4[9].w = 0
            *(r4 + 0x29) = *(j_1 + 0x24)
            void* j = j_1
            
            do
                void* r2_2 = *(j + 4)
                j = *(j + 8)
                
                if (r0_10 u< r2_2)
                    r0_10 = r2_2
            while (j != 0)
            
            void* r0_11 = r0_10 - r4[7]
            int32_t r1_7 = (r0_11 s>> 4)
                + ((1 + (r0_11 s>> 4) + ((1 + (r0_11 s>> 4)) s>> 0x1f u>> 0x1d)) s>> 3) + 0xb
            
            if (r1_7 s>= 0xf4240)
                r1_7 = 0xf4240
            
            bool cond:4_1 = r0_11 s< r9_2
            
            if (r0_11 s<= r9_2)
                cond:4_1 = r1_7 s< r4[8]
            
            if (cond:4_1)
                sub_c8d68(r4, r1_7)
            
            r4[0x11] = *(j_1 + 0x20)
            char r0_15 = *(j_1 + 0x12)
            *(j_1 + 0x25) = result.b
            *(j_1 + 0x12) = r0_15 | 0x20
            i = sub_c8cdc(r4, &data_c9c4c, 0)
            result = i
        while (i u> 1)

r4[9].w = r7
*(r4 + 0x26) -= 1
return result
