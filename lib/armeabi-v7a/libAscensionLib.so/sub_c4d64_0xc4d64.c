// 函数: sub_c4d64
// 地址: 0xc4d64
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = arg1
int32_t* r4 = arg2
int32_t r0 = *__stack_chk_guard
int32_t r0_1
int32_t r1
r1:r0_1 = *(arg2 + 0x10)

if (r0_1 != r1)
    r4, r5 = sub_c4c4c(r5, r4)
else
    sub_c471c(r5, r4)

int32_t r0_4 = *r4
uint32_t result
int64_t var_48
int64_t var_38
int32_t r0_7

if (r0_4 - 1 u>= 3)
    if (r0_4 == 5)
        int64_t q0_1 = *(r4 + 8)
        var_48 = q0_1
        unimplemented  {vcmp.f64 d0, #0.000000}
        int32_t* r6_1 = *(r5[3] + 0x34)
        unimplemented  {vmrs apsr_nzcv, fpscr}
        int32_t var_30_2 = 3
        var_38 = q0_1
        
        if (r0_4 - 5 s< 0 || r0_4 s> 5)
            r0_7 = sub_c43c8(r5, &var_38, &var_38)
        else
            void** r8_1 = r6_1[2]
            r6_1[2] = &r8_1[4]
            void* r0_15 = sub_d7eb4(r6_1, &var_48, 8)
            *r8_1 = r0_15
            r8_1[2] = zx.d(*(r0_15 + 4)) | 0x40
            r0_7 = sub_c43c8(r5, r6_1[2] - 0x10, &var_38)
            r6_1[2] -= 0x10
        
        *r4 = 4
        r4[2] = r0_7
        
        if (r0_7 s> 0xff)
            result = sub_c4c4c(r5, r4)
        else
            result = r0_7 | 0x100
    else if (r0_4 != 4)
        result = sub_c4c4c(r5, r4)
    else
        r0_7 = r4[2]
        
        if (r0_7 s<= 0xff)
            result = r0_7 | 0x100
        else
            result = sub_c4c4c(r5, r4)
else if (r5[8] s> 0xff)
    result = sub_c4c4c(r5, r4)
else
    int32_t* r0_6
    int32_t* r1_5
    void** r2_1
    
    if (r0_4 != 1)
        int32_t temp0_1 = 0
        uint32_t i = r0_4 - 2
        
        while (i != 0)
            i u>>= 1
            temp0_1 += 1
        
        int32_t var_30_3 = 1
        r1_5 = &var_38
        var_38.d = (0x20 - temp0_1) u>> 5
        r0_6 = r5
        r2_1 = &var_38
    else
        int32_t var_40_1 = 0
        r2_1 = &var_48
        int32_t var_30_1 = 0x45
        r1_5 = &var_38
        var_38.d = r5[1]
        r0_6 = r5
    
    r0_7 = sub_c43c8(r0_6, r1_5, r2_1)
    *r4 = 4
    r4[2] = r0_7
    result = r0_7 | 0x100

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
