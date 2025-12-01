// 函数: luaL_getmetafield
// 地址: 0xc18f8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (lua_getmetatable() == 0)
    return 0

lua_pushstring(arg1, arg3)
lua_rawget(arg1, 0xfffffffe)

if (lua_type(arg1, 0xffffffff) == 0)
    lua_settop(arg1, 0xfffffffd)
    return 0

lua_remove(arg1, 0xfffffffe)
return 1
