// 函数: sub_1a8dd0
// 地址: 0x1a8dd0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t var_c = arg7
int32_t var_10 = arg6
int32_t var_14 = arg5
int32_t __saved_r7
int32_t* var_24 = &__saved_r7
struct Dl_info var_34
var_34.dli_saddr = arg7
var_34.dli_sname = arg6
var_34.dli_fbase = arg5
var_34.dli_fname = arg4
int32_t r0 = *__stack_chk_guard
int32_t r0_2 = dladdr(arg2, &var_34)
char const* dli_sname

if (r0_2 != 0)
    dli_sname = var_34.dli_sname

int32_t result

if (r0_2 == 0 || dli_sname == 0)
    result = 0
else
    snprintf(arg3, arg4, 0x1bfc41, dli_sname, arg3)
    *arg8 = arg2 - var_34.dli_saddr
    result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
