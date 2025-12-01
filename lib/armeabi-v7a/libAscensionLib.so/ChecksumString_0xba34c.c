// 函数: ChecksumString
// 地址: 0xba34c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t i = zx.d(*arg1)

if (i == 0)
    return 0

void* r2 = &arg1[1]
int32_t result = 0

do
    int32_t r3_1 = *(&data_1d0bd0 + ((zx.d(result.b) ^ zx.d(i.b)) << 2))
    i = zx.d(*r2)
    r2 += 1
    result = r3_1 ^ result u>> 8
while (i != 0)

return result
