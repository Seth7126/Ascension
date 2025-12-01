// 函数: ChecksumMemory
// 地址: 0xba40c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg2 == 0)
    return 0

char* r2 = arg1
int32_t result = 0
int32_t i

do
    uint32_t lr_1 = zx.d(*r2)
    r2 = &r2[1]
    i = arg2
    arg2 -= 1
    result = *(&data_1d0bd0 + (((result & 0xff) ^ lr_1) << 2)) ^ result u>> 8
while (i != 1)
return result
