// 函数: sub_1a761c
// 地址: 0x1a761c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = (arg2 - 1) & arg2
int32_t r4 = arg2

if (r3 != 0)
    r3 = 1

if (arg2 != 0)
    r4 = 1

if (arg2 << 0x1e != 0 || r3 == r4)
    return 0x16

int32_t r0_4 = memalign(arg2, arg3)
*arg1 = r0_4

if (r0_4 == 0)
    return *__errno()

return 0
