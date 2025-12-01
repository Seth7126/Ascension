// 函数: sub_d680c
// 地址: 0xd680c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10
int32_t var_c = r10
int32_t r0 = *__stack_chk_guard
int32_t* r5 = arg1[0xc]
sub_c4d34(r5, arg2)
sub_cea80(arg1)

if (arg1[4] != 0x120)
    int32_t* r0_11
    int32_t* r1_3
    int32_t r2_1
    int32_t r4_1
    r0_11, r1_3, r2_1, r4_1 = sub_d6ecc(arg1, 0x120)
    return sub_d68b8(r0_11, r1_3, r2_1, r10) __tailcall

void* r7_1 = arg1[6]
sub_cea80(arg1)
int32_t r0_6 = sub_c4370(arg1[0xc], r7_1)
int32_t var_30 = 0xffffffff
int32_t var_2c = 0xffffffff
int32_t var_40 = 4
int32_t var_38 = r0_6
sub_c5568(r5, arg2, &var_40)
int32_t r0_8 = *__stack_chk_guard

if (r0_8 == r0)
    return r0_8 - r0

__stack_chk_fail()
noreturn
