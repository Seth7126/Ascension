// 函数: sub_c2c68
// 地址: 0xc2c68
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

luaL_checktype(arg1, 1, 5)
lua_settop(arg1, 2)

if (lua_next(arg1, 1) != 0)
    return 2

lua_pushnil(arg1)
return 1
