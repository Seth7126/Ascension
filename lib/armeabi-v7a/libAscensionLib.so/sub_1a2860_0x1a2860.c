// 函数: sub_1a2860
// 地址: 0x1a2860
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *__stack_chk_guard
void* r1_1 = *(arg1 + 8)

if (*(arg1 + 0xc) + 1 - r1_1 u>= 0x11)
    int32_t var_58
    int32_t* r0_3 = &var_58
    int32_t i = 0
    int32_t* r3_1 = &var_58
    
    while (i != 0x10)
        void* r4_1 = r1_1 + i
        uint32_t r5_1 = zx.d(*(r1_1 + i))
        i += 2
        uint32_t r4_2 = zx.d(*(r4_1 + 1))
        
        if (r5_1 - 0x30 u>= 0xa)
            r5_1 += 9
        
        char r6_3 = -0x57
        
        if (r4_2 - 0x30 u< 0xa)
            r6_3 = -0x30
        
        *r3_1 = r6_3 + r4_2.b + (r5_1 << 4).b
        r3_1 += 1
    
    void var_51
    
    for (void* i_1 = &var_51; r0_3 u< i_1; i_1 -= 1)
        char r2_1 = *r0_3
        *r0_3 = *i_1
        r0_3 += 1
        *i_1 = r2_1
    
    char var_50[0x2c]
    __aeabi_memclr8(&var_50, 0x28)
    int32_t var_60_1 = var_58
    sub_19fca4(arg2, &var_50, &var_50[snprintf(&var_50, 0x28, "%LaL")])

int32_t r1_3 = *__stack_chk_guard

if (r1_3 == r1)
    return r1_3 - r1

__stack_chk_fail()
noreturn
