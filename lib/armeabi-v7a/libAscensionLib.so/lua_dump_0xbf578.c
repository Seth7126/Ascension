// 函数: lua_dump
// 地址: 0xbf578
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *(arg1 + 8)

if (*(r1 - 8) != 0x46)
    return 1

return sub_ca26c(arg1, *(*(r1 - 0x10) + 0xc), arg2, arg3, 0)
