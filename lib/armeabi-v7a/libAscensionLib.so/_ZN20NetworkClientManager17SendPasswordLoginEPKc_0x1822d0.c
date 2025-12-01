// 函数: _ZN20NetworkClientManager17SendPasswordLoginEPKc
// 地址: 0x1822d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (zx.d(*(*(arg1 + 4) + 0x18)) != 0 && zx.d(arg1[0xe]) != 0 && zx.d(arg1[0x4f]) != 0)
    int32_t var_1b4_1 = 0
    int32_t var_1b8 = 0xabababab
    int32_t var_1b0_1 = 0xc1
    int32_t var_1ac_1 = 1
    int32_t var_1a8_1 = 0
    void var_1a4
    __aeabi_memcpy(&var_1a4, &arg1[0xe], 0x41)
    char str
    sprintf(&str, "pd%-14s", &arg1[0x4f])
    uint32_t r5_1 = zx.d(str)
    int32_t r0_7
    int32_t r3_1
    
    if (r5_1 == 0)
        r3_1 = 0x1505
        r0_7 = 0
    else
        void var_12b
        void* r1_2 = &var_12b
        r0_7 = 0
        r3_1 = 0x1505
        uint32_t i
        
        do
            int32_t r3_2
            int32_t r7_1
            r7_1:r3_2 = mulu.dp.d(r3_1, 0x21)
            i = zx.d(*r1_2)
            r1_2 += 1
            int32_t r7_2 = r5_1 << 0xfffffffc s>> 0x18
            r3_1 = r3_2 + r7_2
            r5_1 = i
            r0_7 = adc.d(r7_1 + r0_7 * 0x21, r7_2 s>> 0x1f, r3_2 + r7_2 u< r3_2)
        while (i != 0)
    
    int32_t var_163_1 = r3_1
    char var_159_1 = 0
    int16_t var_15b_1 = 0x4e45
    int32_t var_150_1 = 2
    int32_t var_15f_1 = r0_7
    char* entry_r1
    char var_14c[0x1f]
    
    if (entry_r1 == 0)
        var_14c[0] = 0
    else
        strncpy(&var_14c, entry_r1, 0x20)
        char var_12d_1 = 0
    int32_t* r0_11 = *(arg1 + 4)
    *(arg1 + 0x90) = 0
    (*(*r0_11 + 8))(r0_11, &var_1b8, 0x8c)

int32_t r0_12 = *__stack_chk_guard

if (r0_12 == r0)
    return r0_12 - r0

__stack_chk_fail()
noreturn
