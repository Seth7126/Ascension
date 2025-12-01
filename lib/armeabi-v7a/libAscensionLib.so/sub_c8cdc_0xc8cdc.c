// 函数: sub_c8cdc
// 地址: 0xc8cdc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int16_t r7 = *(arg1 + 0x26)
int32_t result = 0
int32_t var_12c = *(arg1 + 0x40)
*(arg1 + 0x40) = &var_12c
void env

if (setjmp(&env) == 0)
    arg2(arg1, arg3)

int32_t r0_5 = var_12c
*(arg1 + 0x26) = r7
*(arg1 + 0x40) = r0_5

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
