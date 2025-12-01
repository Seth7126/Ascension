// 函数: sub_e0ffc
// 地址: 0xe0ffc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_18
char* r0_2
int32_t r2_1
r0_2, r2_1 = arg1[2](arg1[4], arg1[3], &var_18)

if (r0_2 != 0)
    r2_1 = var_18

uint32_t result = 0xffffffff

if (r0_2 != 0 && r2_1 != 0)
    *arg1 = r2_1 - 1
    arg1[1] = &r0_2[1]
    result = zx.d(*r0_2)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
