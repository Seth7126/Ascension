// 函数: sub_1a8e30
// 地址: 0x1a8e30
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3
int32_t var_14_1 = r3
int32_t* var_18 = arg3
int32_t r1 = *__stack_chk_guard
var_18 = nullptr
int32_t r0_1 = __gnu_Unwind_Find_exidx(arg2, &var_18)
int32_t* r1_2 = var_18
*arg3 = r0_1
arg3[1] = r1_2

if (r0_1 != 0)
    r0_1 = 1

if (r1_2 != 0)
    r1_2 = 1

if (*__stack_chk_guard == r1)
    return r0_1 & r1_2

__stack_chk_fail()
noreturn
