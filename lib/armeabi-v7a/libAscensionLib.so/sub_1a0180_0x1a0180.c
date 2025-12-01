// 函数: sub_1a0180
// 地址: 0x1a0180
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char* r2 = *arg1
int32_t r3 = arg1[1]
int32_t result

if (r2 == r3 || zx.d(*r2) != 0x72)
    result = 0
else
    r2 = &r2[1]
    result = 4
    *arg1 = r2

if (r2 == r3)
    return result

if (zx.d(*r2) == 0x56)
    r2 = &r2[1]
    *arg1 = r2
    result |= 2

if (r2 == r3)
    return result

jump(0x1a01b6)
