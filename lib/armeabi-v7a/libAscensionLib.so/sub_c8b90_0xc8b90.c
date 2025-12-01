// 函数: sub_c8b90
// 地址: 0xc8b90
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* r1_1 = arg1[4]

if ((zx.d(*(r1_1 + 0x12)) & 1) != 0)
    void* r0_4 = *(**r1_1 + 0xc)
    int32_t r2_1 = *(r0_4 + 0x14)
    
    if (r2_1 != 0)
        *(r2_1 + r1_1[7] - *(r0_4 + 0xc) - 4)
    
    void* r0_5 = *(r0_4 + 0x24)
    int16_t var_58
    
    if (r0_5 == 0)
        var_58 = 0x3f
    else
        sub_d2f94(&var_58, r0_5 + 0x10, 0x3c)
    
    int32_t r1
    int32_t var_60_1 = r1
    sub_d2f3c(arg1, "%s:%d: %s", &var_58)

int32_t r0_8 = *__stack_chk_guard

if (r0_8 == r0)
    return r0_8 - r0

__stack_chk_fail()
noreturn
