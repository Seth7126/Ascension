// 函数: sub_c4198
// 地址: 0xc4198
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = arg1[5]
*arg1
void* r4_1
int32_t r5_1
void* r6_1
r4_1, r5_1, r6_1 = sub_c4008(arg1, arg1[7], r2, 0xff, r2)
int32_t r1_2 = *(r4_1 + 0x14)
*(r4_1 + 0x1c) = 0xffffffff
int32_t r0_1

if (r1_2 s>= *(r6_1 + 0x30))
    char const* const var_1c_1 = "opcodes"
    r0_1 = sub_d1388(*(*(r4_1 + 0xc) + 0x34), *(r6_1 + 0xc), r6_1 + 0x30, 4, 0x7ffffffd)
    *(r6_1 + 0xc) = r0_1
    r1_2 = *(r4_1 + 0x14)
else
    r0_1 = *(r6_1 + 0xc)

*(r0_1 + (r1_2 << 2)) = r5_1
int32_t r1_4 = *(r4_1 + 0x14)
int32_t r0_5

if (r1_4 s>= *(r6_1 + 0x34))
    char const* const var_1c_2 = "opcodes"
    r0_5 = sub_d1388(*(*(r4_1 + 0xc) + 0x34), *(r6_1 + 0x14), r6_1 + 0x34, 4, 0x7ffffffd)
    *(r6_1 + 0x14) = r0_5
    r1_4 = *(r4_1 + 0x14)
else
    r0_5 = *(r6_1 + 0x14)

*(r0_5 + (r1_4 << 2)) = *(*(r4_1 + 0xc) + 8)
int32_t result = *(r4_1 + 0x14)
*(r4_1 + 0x14) = result + 1
return result
