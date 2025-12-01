// 函数: _Z16CharArrayGetSizePKc
// 地址: 0xba184
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char const* s = arg1

if (zx.d(*arg1) == 0)
    return 1

int32_t r5 = 0

do
    int32_t r0_3 = strlen(s) + 1
    r5 += r0_3
    s = &s[r0_3]
while (zx.d(*s) != 0)

return r5 + 1
