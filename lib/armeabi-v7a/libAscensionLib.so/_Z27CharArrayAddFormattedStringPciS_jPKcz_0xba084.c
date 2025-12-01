// 函数: _Z27CharArrayAddFormattedStringPciS_jPKcz
// 地址: 0xba084
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r4 = *__stack_chk_guard
char* r4_2

if (arg1 == arg3)
    r4_2 = arg3
else
    int32_t r4_1 = sx.d(*arg1)
    int32_t r5_1 = r4_1 & 0xe0
    *arg3 = r5_1.b | arg4.b
    arg4 = (r5_1 + 0x20) | (r4_1 & 0x1f)
    r4_2 = arg1

*r4_2 = arg4.b
void arg
void* var_20 = &arg
vsnprintf(&arg3[1], &arg1[arg2] - 1 - arg3, arg5, &arg)
void* result = &arg3[strlen(&arg3[1]) + 2]
*result = 0

if (*__stack_chk_guard == r4)
    return result

__stack_chk_fail()
noreturn
