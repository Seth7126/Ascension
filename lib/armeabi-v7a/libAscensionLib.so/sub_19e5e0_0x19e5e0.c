// 函数: sub_19e5e0
// 地址: 0x19e5e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6
int32_t var_c = r6
int32_t r5
int32_t var_10 = r5
int32_t r4
int32_t var_14 = r4
int32_t __saved_r7
int32_t* var_24 = &__saved_r7
int32_t var_28 = r6
int32_t var_2c = r5
int32_t var_30 = r4
int32_t r0 = *__stack_chk_guard
int32_t r4_1 = *arg1
int32_t r0_1 = arg1[1]
var_2c = r4_1
int32_t var_28_1 = r0_1
int32_t result

if (sub_19f488(&var_2c, arg2, arg3) == 0)
    result = 0
else
    *arg1 = arg3 - arg2 + r4_1
    result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
