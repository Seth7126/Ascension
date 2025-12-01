// 函数: lua_xmove
// 地址: 0xbc400
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg1 == arg2)
    return 

int32_t r12_1 = *(arg1 + 8)
int64_t* r3_1 = r12_1 - (arg3 << 4)
*(arg1 + 8) = r3_1

if (arg3 s< 1)
    return 

int32_t* r4_1 = *(arg2 + 8)
*(arg2 + 8) = &r4_1[4]
int32_t r6_1
int32_t r7_1
r7_1:r6_1 = *r3_1
*r4_1 = r6_1
r4_1[1] = r7_1
r4_1[2] = *(r12_1 + ((0 - arg3) << 4) + 8)

if (arg3 == 1)
    return 

int32_t i_1 = arg3 - 1
int32_t r3_4 = 0x18
int32_t i

do
    int32_t* r7_2 = *(arg2 + 8)
    i = i_1
    i_1 -= 1
    int32_t* r6_2 = *(arg1 + 8)
    *(arg2 + 8) = &r7_2[4]
    int32_t r4_2
    int32_t r5_4
    r5_4:r4_2 = *(r6_2 + r3_4 - 8)
    *r7_2 = r4_2
    r7_2[1] = r5_4
    int32_t r6_3 = *(r6_2 + r3_4)
    r3_4 += 0x10
    r7_2[2] = r6_3
while (i != 1)
