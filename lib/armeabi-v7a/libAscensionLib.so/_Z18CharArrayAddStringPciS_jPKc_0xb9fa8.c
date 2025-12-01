// 函数: _Z18CharArrayAddStringPciS_jPKc
// 地址: 0xb9fa8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6 = arg1 - arg3 + arg2

if (arg1 != arg3)
    int32_t r4_1 = sx.d(*arg1)
    int32_t r5_1 = r4_1 & 0xe0
    *arg3 = r5_1.b | arg4.b
    arg4 = (r5_1 + 0x20) | (r4_1 & 0x1f)

*arg1 = arg4.b
strncpy(&arg3[1], arg5, r6 - 1)
*(&arg3[1 + r6] - 2) = 0
void* result = &arg3[strlen(&arg3[1]) + 2]
*result = 0
return result
