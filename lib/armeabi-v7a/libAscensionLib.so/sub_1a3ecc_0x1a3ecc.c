// 函数: sub_1a3ecc
// 地址: 0x1a3ecc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_20 = 0
int32_t r0_2 = sub_1a07fe(arg2, &var_20)
int32_t r0_3
int32_t r1_1

if (r0_2 == 0)
    r0_3 = *arg2
    r1_1 = var_20

if (r0_2 == 0 && arg2[1] - r0_3 u>= r1_1)
    int32_t r1_2 = r1_1 + r0_3
    *arg2 = r1_2
    *arg1 = r0_3
    arg1[1] = r1_2
else
    *arg1 = 0
    arg1[1] = 0

int32_t r1_3 = *__stack_chk_guard

if (r1_3 == r0)
    return r1_3 - r0

__stack_chk_fail()
noreturn
