// 函数: sub_d507c
// 地址: 0xd507c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10
int32_t var_c = r10
int32_t* r4 = arg1

if (arg1[4] == arg2)
    return sub_cea80(r4) __tailcall

int64_t* pc

if (r4[1] == arg4)
    arg2, arg3, r4, pc = sub_d6ecc(r4, arg2)

int32_t* r8 = r4[0xd]
int32_t r0_6 = sub_ce70c(r4, arg2)
sub_ce70c(r4, arg3)
int32_t var_28 = arg4
int32_t* r0_12
int32_t r1_3
int32_t r9_1
int32_t lr_1
r0_12, r1_3, r9_1, lr_1 =
    sub_ce78c(r4, sub_d2f3c(r8, "%s expected (to close %s at line %d)", r0_6), pc)
return sub_d510c(r0_12, r1_3, r10) __tailcall
