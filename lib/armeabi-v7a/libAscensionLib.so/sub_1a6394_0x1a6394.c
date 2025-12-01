// 函数: sub_1a6394
// 地址: 0x1a6394
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
int32_t result_1 = arg3
int32_t* sp = &result_1
int128_t q0
q0.q = arg2:arg1
int32_t r2 = *__stack_chk_guard
sub_1a63e8(&result_1)
int32_t result = result_1
int32_t r2_1 = *__stack_chk_guard
int32_t r1_1 = r2_1 - r2

if (r2_1 == r2)
    result = 0x3ff00000 + ((result + arg3) << 0x14)
    r1_1 = 0

if (r2_1 == r2)
    int128_t q0_1
    q0_1:8.q = result:r1_1
    q0_1.q = q0_1.q f* q0_1:8.q
    int32_t r1_2
    r1_2:result = q0_1.q
    sp = &var_10

if (r2_1 != r2)
    __stack_chk_fail()
    noreturn

*sp
sp[1]
sp[2]
return result
