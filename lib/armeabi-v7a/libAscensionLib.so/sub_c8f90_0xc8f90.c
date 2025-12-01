// 函数: sub_c8f90
// 地址: 0xc8f90
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t (* const r9)() = __stack_chk_guard
int32_t r0 = *__stack_chk_guard
int32_t r6 = arg1[0xd]

if (r6 != 0 && zx.d(*(arg1 + 0x29)) != 0)
    void* r7_1 = arg1[4]
    int32_t r0_2 = arg1[2]
    int32_t r5_1 = arg1[7]
    int32_t r3_1 = arg1[6]
    int32_t r10_1 = *(r7_1 + 4)
    int32_t r8_1 = r0_2 - r5_1
    int32_t r2
    int32_t var_78_1 = r2
    int32_t var_8c = arg2
    void* var_2c_1 = r7_1
    
    if (r3_1 - r0_2 s< 0x150)
        int32_t r2_1 = arg1[8]
        
        if (r2_1 s> 0xf4240)
            sub_c89f0(arg1, "stack overflow", sub_c8d68(arg1, sub_c8c5c(arg1, 6) + 0xc8))
            noreturn
        
        int32_t r1_1 = 0xf4240
        
        if (0xf4240 s> r2_1 << 1)
            r1_1 = r2_1 << 1
        
        if (r1_1 s< 0x19 + (r8_1 s>> 4))
            r1_1 = 0x19 + (r8_1 s>> 4)
        
        if (r1_1 s> 0xf4240)
            sub_c89f0(arg1, "stack overflow", sub_c8d68(arg1, 0xf4240 + 0xc8))
            noreturn
        
        r9 = sub_c8d68(arg1, r1_1)
        r0_2 = arg1[2]
    
    *(r7_1 + 4) = r0_2 + 0x140
    *(arg1 + 0x29) = 0
    *(r7_1 + 0x12) |= 2
    r6(arg1, &var_8c)
    int32_t r0_9 = arg1[7]
    *(arg1 + 0x29) = 1
    *(r7_1 + 4) = r0_9 + r10_1 - r5_1
    arg1[2] = r0_9 + r8_1
    *(r7_1 + 0x12) &= 0xfd

int32_t r0_13 = *r9

if (r0_13 == r0)
    return r0_13 - r0

__stack_chk_fail()
noreturn
