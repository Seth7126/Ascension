// 函数: luaopen_string
// 地址: 0xd80f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

lua_createtable(arg1, 0, 0xe)
luaL_setfuncs(arg1, &data_1d7800, 0)
lua_createtable(arg1, 0, 1)
lua_pushlstring(arg1, &data_1bfacb, 0)
lua_pushvalue(arg1, 0xfffffffe)
lua_setmetatable(arg1, 0xfffffffe)
lua_settop(arg1, 0xfffffffe)
lua_pushvalue(arg1, 0xfffffffe)
lua_setfield(arg1, 0xfffffffe, "__index")
lua_settop(arg1, 0xfffffffe)
return 1
