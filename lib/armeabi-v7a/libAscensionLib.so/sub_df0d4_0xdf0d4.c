// 函数: sub_df0d4
// 地址: 0xdf0d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r1 = arg2[2] & 0x3f

if (r1 u<= 0x16)
    int32_t r0_1 = 1
    void* r1_3
    void* r2
    
    switch (r1)
        case 0
            return r0_1
        case 3
            int128_t q0
            q0.q = *arg3
            q0:8.q = *arg2
            unimplemented  {vcmp.f64 d1, d0}
            unimplemented  {vmrs apsr_nzcv, fpscr}
            
            if (r1 == 0x16)
                return 1
            
            return 0
        case 5
            r2 = *arg3
            r1_3 = *arg2
            
            if (r1_3 == r2)
                return r0_1
            
            if (arg1 == 0)
                return 0
            
        label_df1e4:
            int32_t* r0_10 = sub_df2e4(arg1, *(r1_3 + 8), *(r2 + 8))
            
            if (r0_10 == 0)
                return 0
            
            int32_t* r7_1 = arg1[2]
            int32_t r8_1 = arg1[7]
            arg1[2] = &r7_1[4]
            int32_t r2_2 = r0_10[1]
            *r7_1 = *r0_10
            r7_1[1] = r2_2
            r7_1[2] = r0_10[2]
            int32_t* r0_12 = arg1[2]
            arg1[2] = &r0_12[4]
            int32_t r2_3 = arg2[1]
            *r0_12 = *arg2
            r0_12[1] = r2_3
            r0_12[2] = arg2[2]
            int32_t* r0_13 = arg1[2]
            arg1[2] = &r0_13[4]
            int32_t r2_4 = arg3[1]
            *r0_13 = *arg3
            r0_13[1] = r2_4
            r0_13[2] = arg3[2]
            sub_c9774(arg1, arg1[2] - 0x30, 1, zx.d(*(arg1[4] + 0x12)) & 1, r8_1)
            int32_t r0_16 = arg1[2]
            void* r1_16 = arg1[7]
            arg1[2] = r0_16 - 0x10
            int32_t r3_2 = *(r0_16 - 0xc)
            void* r1_17 = r1_16 + r7_1 - r8_1
            *r1_17 = *(r0_16 - 0x10)
            *(r1_17 + 4) = r3_2
            *(r1_17 + 8) = *(r0_16 - 8)
            int32_t* r1_18 = arg1[2]
            r0_1 = r1_18[2]
            
            if (r0_1 == 0)
                return r0_1
            
            if (r0_1 != 1)
                return 1
            
            int32_t r0_18 = *r1_18
            
            if (r0_18 != 0)
                return 1
            
            return r0_18
        case 7
            r2 = *arg3
            r1_3 = *arg2
            
            if (r1_3 == r2)
                return r0_1
            
            if (arg1 == 0)
                return 0
            
            goto label_df1e4
        case 0x14
            return sub_d7c78(*arg2, *arg3) __tailcall

int32_t temp0_1 = 0
uint32_t i = *arg2 - *arg3

while (i != 0)
    i u>>= 1
    temp0_1 += 1

return (0x20 - temp0_1) u>> 5
