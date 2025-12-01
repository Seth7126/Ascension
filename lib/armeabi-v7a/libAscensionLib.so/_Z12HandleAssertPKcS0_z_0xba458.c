// 函数: _Z12HandleAssertPKcS0_z
// 地址: 0xba458
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *__stack_chk_guard
int32_t r3
int32_t var_4 = r3
int32_t entry_arg
int32_t arg = entry_arg
int32_t* var_430 = &arg
printf("Assertion failure: ", r1)
char str[0x3fc]
vsprintf(&str, arg2, &arg)
printf("%s", &str)

if (*__stack_chk_guard == r1)
    return 1

__stack_chk_fail()
noreturn
