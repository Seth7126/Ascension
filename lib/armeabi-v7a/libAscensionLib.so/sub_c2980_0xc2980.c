// 函数: sub_c2980
// 地址: 0xc2980
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

luaL_checkany(arg1, 1)

if (lua_getmetatable(arg1, 1) == 0)
    lua_pushnil(arg1)
    return 1

luaL_getmetafield(arg1, 1, "__metatable")
return 1
