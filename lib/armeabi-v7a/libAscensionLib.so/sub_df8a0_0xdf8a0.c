// 函数: sub_df8a0
// 地址: 0xdf8a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r7 = arg3
int32_t r0 = *__stack_chk_guard
int32_t r0_1 = arg3[1].d

if (r0_1 == 3)
    goto label_df91c

if ((r0_1 & 0xf) != 4)
label_df994:
    int32_t* r0_13 = sub_dc704(arg1, r7, arg5)
    
    if (r0_13[2] == 0)
        r0_13 = sub_dc704(arg1, arg4, arg5)
        
        if (r0_13[2] == 0)
            sub_c8a60(arg1, r7, arg4)
            noreturn
    
    int32_t* r1_6 = arg1[2]
    int32_t r6_2 = arg1[7]
    arg1[2] = &r1_6[4]
    int32_t r3 = r0_13[1]
    *r1_6 = *r0_13
    r1_6[1] = r3
    r1_6[2] = r0_13[2]
    int32_t* r0_16 = arg1[2]
    arg1[2] = &r0_16[4]
    int32_t r2_6 = r7[1]
    *r0_16 = *r7
    r0_16[1] = r2_6
    r0_16[2] = r7[2]
    int32_t* r0_17 = arg1[2]
    arg1[2] = &r0_17[4]
    int32_t r2_7 = *(arg4 + 4)
    *r0_17 = *arg4
    r0_17[1] = r2_7
    r0_17[2] = arg4[1].d
    sub_c9774(arg1, arg1[2] - 0x30, 1, zx.d(*(arg1[4] + 0x12)) & 1, arg5)
    int32_t r0_20 = arg1[2]
    void* r1_15 = arg1[7]
    arg1[2] = r0_20 - 0x10
    int32_t r3_2 = *(r0_20 - 0xc)
    void* r1_16 = r1_15 + arg2 - r6_2
    *r1_16 = *(r0_20 - 0x10)
    *(r1_16 + 4) = r3_2
    *(r1_16 + 8) = *(r0_20 - 8)
else
    void* r0_3 = *r7
    int64_t var_30
    int64_t q0
    
    if (sub_d2950(r0_3 + 0x10, *(r0_3 + 0xc), &var_30, q0) == 0)
        goto label_df994
    
    q0 = var_30
    int32_t var_38_1 = 3
    int64_t var_40 = q0
label_df91c:
    int32_t r0_6 = arg4[1].d
    int64_t* r6_1
    
    if (r0_6 != 3)
        if ((r0_6 & 0xf) != 4)
            goto label_df994
        
        void* r0_8 = *arg4
        r6_1 = &var_30
        
        if (sub_d2950(r0_8 + 0x10, *(r0_8 + 0xc), &var_30, q0) == 0)
            goto label_df994
        
        goto label_df968
    
    r6_1 = arg4
label_df968:
    unimplemented  {vmov r2, r3, d1}
    int32_t __saved_r11
    int64_t q0_1 = sub_d2860(arg5 - 6, &__saved_r11, *r6_1)
    unimplemented  {vmov d0, r0, r1}
    arg2[1].d = 3
    *arg2 = q0_1

int32_t r0_22 = *__stack_chk_guard

if (r0_22 == r0)
    return r0_22 - r0

__stack_chk_fail()
noreturn
