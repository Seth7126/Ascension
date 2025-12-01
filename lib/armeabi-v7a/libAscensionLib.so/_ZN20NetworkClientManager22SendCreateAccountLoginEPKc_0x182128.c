// 函数: _ZN20NetworkClientManager22SendCreateAccountLoginEPKc
// 地址: 0x182128
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (zx.d(*(*(arg1 + 4) + 0x18)) != 0 && zx.d(arg1[0xe]) != 0 && zx.d(arg1[0x4f]) != 0
        && zx.d(arg1[0x6e]) != 0)
    int32_t var_1d8_1 = 0
    int32_t var_1dc = 0xaaaaaaaa
    int32_t var_1d4_1 = 0xc1
    int32_t var_1cc_1 = 0
    int32_t var_1d0_1 = 1
    void var_187
    __aeabi_memcpy(&var_187, &arg1[0x6e], 0x1f)
    void var_1c8
    __aeabi_memcpy(&var_1c8, &arg1[0xe], 0x41)
    char str
    sprintf(&str, "pd%-14s", &arg1[0x4f])
    uint32_t r5_1 = zx.d(str)
    int32_t r0_11
    int32_t r1_4
    
    if (r5_1 == 0)
        r1_4 = 0x1505
        r0_11 = 0
    else
        void var_12b
        void* r2_2 = &var_12b
        r0_11 = 0
        r1_4 = 0x1505
        uint32_t i
        
        do
            int32_t r1_5
            int32_t r6_3
            r6_3:r1_5 = mulu.dp.d(r1_4, 0x21)
            i = zx.d(*r2_2)
            r2_2 += 1
            int32_t r6_4 = r5_1 << 0xfffffffc s>> 0x18
            r1_4 = r1_5 + r6_4
            r5_1 = i
            r0_11 = adc.d(r6_3 + r0_11 * 0x21, r6_4 s>> 0x1f, r1_5 + r6_4 u< r1_5)
        while (i != 0)
    
    int32_t var_15c_1 = 0
    int32_t var_160_1 = 0
    int32_t var_168_1 = r1_4
    int16_t var_158_1 = 0x4e45
    char var_156_1 = 0
    int32_t var_150_1 = 2
    int32_t var_164_1 = r0_11
    char* entry_r1
    char var_14c[0x1f]
    
    if (entry_r1 == 0)
        var_14c[0] = 0
    else
        strncpy(&var_14c, entry_r1, 0x20)
        char var_12d_1 = 0
    int32_t* r0_15 = *(arg1 + 4)
    *(arg1 + 0x90) = 0
    (*(*r0_15 + 8))(r0_15, &var_1dc, 0xb0)

int32_t r0_5 = *__stack_chk_guard

if (r0_5 == r0)
    return r0_5 - r0

__stack_chk_fail()
noreturn
