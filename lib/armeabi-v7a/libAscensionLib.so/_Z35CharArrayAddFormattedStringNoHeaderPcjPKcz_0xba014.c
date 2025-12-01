// 函数: _Z35CharArrayAddFormattedStringNoHeaderPcjPKcz
// 地址: 0xba014
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t entry_arg
int32_t arg = entry_arg
int32_t* var_1c = &arg
vsnprintf(arg1, arg2, arg3, &arg)
void* result = &arg1[strlen(arg1) + 1]
*result = 0

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
