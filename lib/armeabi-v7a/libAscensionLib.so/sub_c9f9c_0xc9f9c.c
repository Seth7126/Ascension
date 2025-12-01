// 函数: sub_c9f9c
// 地址: 0xc9f9c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
arg1[9].w += 1
int32_t r2
int32_t var_20 = r2
int32_t var_58 = arg2
int32_t r3
int32_t var_24 = r3
int32_t var_48 = 0
int32_t var_40 = 0
int32_t var_3c = 0
int32_t var_34 = 0
int32_t var_30 = 0
int32_t var_28 = 0
int32_t var_54 = 0
int32_t var_4c = 0
sub_c9e5c(arg1, sub_ca0b8, &var_58, arg1[2] - arg1[7], arg1[0x11])
int32_t r0_7
int32_t* r4_1
r0_7, r4_1 = sub_d14cc(arg1, var_54, var_4c, 0)
int32_t var_54_1 = r0_7
int32_t var_4c_1 = 0
void* r4_4
int32_t result
r4_4, result = sub_d14cc(
    sub_d14cc(sub_d14cc(r4_1, var_48, var_40 << 1, 0), var_3c, var_34 << 4, 0), var_30, 
    var_28 << 4, 0)
*(r4_4 + 0x24) -= 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
