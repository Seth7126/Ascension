// 函数: sub_1a8d3c
// 地址: 0x1a8d3c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r7
int32_t var_8 = r7
int32_t r5
int32_t var_c = r5
int32_t r4
int32_t var_10 = r4
int32_t r3
int32_t var_14_1 = r3
int32_t var_18 = arg3
int32_t var_1c = arg2
int32_t* var_20 = arg1
int32_t* sp = &var_20
int32_t r0 = *__stack_chk_guard
var_1c = 0
var_18 = 0
uint32_t result = sub_1a7fa8(arg1, sub_1a7f58(arg1[0x5e], &var_1c, &var_18), var_1c, var_18)
int32_t r2_2 = *__stack_chk_guard

if (r2_2 == r0)
    result = __clz(result - 8) u>> 5
    sp = &var_10

if (r2_2 != r0)
    __stack_chk_fail()
    noreturn

*sp
sp[1]
sp[2]
return result
