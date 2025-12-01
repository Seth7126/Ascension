// 函数: sub_1a8a74
// 地址: 0x1a8a74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r5_1 = ((*(*arg1 + 0xc))(arg1, 0xffffffff) & 0xfffffffe) - arg2
int32_t var_24

if (sub_1a8e30(arg1[1], r5_1, &var_24) == 0 || var_24 == 0)
    arg1[0x60].b = 1
else if (sub_1a8e74(arg1, r5_1, &var_24) == 0)
    arg1[0x60].b = 1

int32_t r1_2 = *__stack_chk_guard

if (r1_2 == r0)
    return r1_2 - r0

__stack_chk_fail()
noreturn
