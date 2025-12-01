// 函数: sub_d1aec
// 地址: 0xd1aec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

luaL_checktype(arg1, 1, 5)

if (lua_getmetatable(arg1, 1) == 0)
    lua_createtable(arg1, 0, 1)
    lua_pushvalue(arg1, 0xffffffff)
    lua_setmetatable(arg1, 1)

lua_rawgeti(arg1, 0xfff0b9d8, 2)
lua_setfield(arg1, 0xfffffffe, "__index")
return 0
