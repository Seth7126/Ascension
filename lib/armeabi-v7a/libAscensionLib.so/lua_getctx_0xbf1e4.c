// 函数: lua_getctx
// 地址: 0xbf1e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r2 = *(arg1 + 0x10)

if ((zx.d(*(r2 + 0x12)) & 8) == 0)
    return 0

if (arg2 != 0)
    *arg2 = *(r2 + 0x18)

return zx.d(*(r2 + 0x25))
