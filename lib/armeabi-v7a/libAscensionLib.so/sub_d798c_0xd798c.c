// 函数: sub_d798c
// 地址: 0xd798c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r7 = arg1[3]
void* r0_2
int32_t* r4_1
int32_t r5_1
int32_t* r8
r0_2, r4_1, r5_1, r8 = sub_d14cc(arg1, 0, 0, 0x280)
r4_1[7] = r0_2
r4_1[8] = 0x28
*(r0_2 + 0x18) = r5_1
*(r0_2 + 8) = r5_1
*(r0_2 + 0x28) = r5_1
*(r0_2 + 0x38) = r5_1
*(r0_2 + 0x48) = r5_1
*(r0_2 + 0x58) = r5_1
*(r0_2 + 0x68) = r5_1
*(r0_2 + 0x78) = r5_1
*(r0_2 + 0x88) = r5_1
*(r0_2 + 0x98) = r5_1
*(r0_2 + 0xa8) = r5_1
*(r0_2 + 0xb8) = r5_1
*(r0_2 + 0xc8) = r5_1
*(r0_2 + 0xd8) = r5_1
*(r0_2 + 0xe8) = r5_1
*(r0_2 + 0xf8) = r5_1
*(r0_2 + 0x108) = r5_1
*(r0_2 + 0x118) = r5_1
*(r0_2 + 0x128) = r5_1
*(r0_2 + 0x148) = r5_1
*(r0_2 + 0x138) = r5_1
*(r0_2 + 0x158) = r5_1
*(r0_2 + 0x168) = r5_1
*(r0_2 + 0x178) = r5_1
*(r0_2 + 0x188) = r5_1
*(r0_2 + 0x198) = r5_1
*(r0_2 + 0x1a8) = r5_1
*(r0_2 + 0x1b8) = r5_1
*(r0_2 + 0x1c8) = r5_1
*(r0_2 + 0x1d8) = r5_1
*(r0_2 + 0x1e8) = r5_1
*(r0_2 + 0x1f8) = r5_1
*(r0_2 + 0x208) = r5_1
*(r0_2 + 0x218) = r5_1
*(r0_2 + 0x228) = r5_1
*(r0_2 + 0x238) = r5_1
*(r0_2 + 0x248) = r5_1
*(r0_2 + 0x258) = r5_1
*(r0_2 + 0x278) = r5_1
*(r0_2 + 0x268) = r5_1
r4_1[6] = r0_2 + 0x230
r4_1[0x14] = r5_1
r4_1[0x15] = r5_1
*(r4_1 + 0x5a) = r5_1.b
r4_1[0x12] = r0_2
r4_1[2] = r0_2 + 0x10
*(r0_2 + 8) = r5_1
r4_1[4] = &r4_1[0x12]
r4_1[0x13] = r0_2 + 0x150
void* r0_5
int128_t q4
r0_5, q4 = sub_dafac(r4_1)
*(r7 + 0x28) = r0_5
*(r7 + 0x30) = 0x45
sub_daa54(r4_1, r0_5, 2, 0, r8)
int32_t var_30 = 0x48
int32_t* var_38 = r4_1
sub_dadf8(r4_1, r0_5, 1, &var_38, 0x45, q4, var_38)
void* r0_9
char r9_1
int128_t q4_1
r0_9, r9_1, q4_1 = sub_dafac(r4_1)
var_38 = r0_9
int32_t var_30_1 = 0x45
sub_dadf8(r4_1, r0_5, 2, &var_38, 0x45, q4_1, var_38)
sub_d7d88(r4_1, 0x20)
sub_dc66c(r4_1)
sub_ce6c4(r4_1)
void* r0_15 = sub_d7eb4(r4_1, "not enough memory", 0x11)
*(r7 + 0xb4) = r0_15
*(r0_15 + 5) |= 0x20
*(r7 + 0x3f) = r9_1
*(r7 + 0xb0) = lua_version(0)
int32_t r0_17 = *r8

if (r0_17 == r0)
    return r0_17 - r0

__stack_chk_fail()
noreturn
