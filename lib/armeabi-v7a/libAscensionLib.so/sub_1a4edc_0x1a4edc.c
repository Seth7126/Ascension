// 函数: sub_1a4edc
// 地址: 0x1a4edc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *__stack_chk_guard
void* r0 = *(arg1 + 8)
int32_t result

if (zx.d(*(r0 + 4)) != 7)
    result = 0
else
    int32_t r0_1 = *(r0 + 0xc)
    int32_t var_20 = *(r0 + 8)
    int32_t var_1c_1 = r0_1
    char const* const var_28 = "objc_object"
    char const* const var_24_1 = &data_1d0646[0xb]
    result = sub_1a2cac(&var_20, &var_28)

if (*__stack_chk_guard == r1)
    return result

__stack_chk_fail()
noreturn
