// 函数: luaL_newmetatable
// 地址: 0xc07dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

lua_getfield(arg1, 0xfff0b9d8, arg2)

if (lua_type(arg1, 0xffffffff) != 0)
    return 0

lua_settop(arg1, 0xfffffffe)
lua_createtable(arg1, 0, 0)
lua_pushvalue(arg1, 0xffffffff)
lua_setfield(arg1, 0xfff0b9d8, arg2)
return 1
