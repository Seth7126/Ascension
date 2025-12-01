// 函数: sub_d7c78
// 地址: 0xd7c78
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg1 == arg2)
    return 1

uint32_t n = *(arg1 + 0xc)

if (n != *(arg2 + 0xc))
    return 0

int32_t temp0_1 = 0
int32_t i = memcmp(arg1 + 0x10, arg2 + 0x10, n)

while (i != 0)
    i u>>= 1
    temp0_1 += 1

return (0x20 - temp0_1) u>> 5
