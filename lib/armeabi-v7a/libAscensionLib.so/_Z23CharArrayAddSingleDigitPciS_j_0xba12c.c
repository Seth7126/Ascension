// 函数: _Z23CharArrayAddSingleDigitPciS_j
// 地址: 0xba12c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char r1_1

if (arg1 == arg3)
    r1_1 = 6
else
    char r1 = *arg1
    r1_1 = r1 + 0x20
    *arg3 = (r1 & 0xe0) | 6

*arg1 = r1_1
arg3[1] = arg4.b + 0x30
arg3[2] = 0
void* result = &arg3[strlen(&arg3[1]) + 2]
*result = 0
return result
