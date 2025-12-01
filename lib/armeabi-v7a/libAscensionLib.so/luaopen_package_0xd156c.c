// 函数: luaopen_package
// 地址: 0xd156c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

luaL_getsubtable(arg1, 0xfff0b9d8, "_CLIBS")
lua_createtable(arg1, 0, 1)
lua_pushcclosure(arg1, sub_d1858, 0)
lua_setfield(arg1, 0xfffffffe, "__gc")
lua_setmetatable(arg1, 0xfffffffe)
lua_createtable(arg1, 0, 3)
luaL_setfuncs(arg1, &data_1d76b0, 0)
lua_createtable(arg1, 4, 0)
lua_pushvalue(arg1, 0xfffffffe)
lua_pushcclosure(arg1, sub_d1dc4, 1)
lua_rawseti(arg1, 0xfffffffe, 1)
lua_pushvalue(arg1, 0xfffffffe)
lua_pushcclosure(arg1, sub_d1e48, 1)
lua_rawseti(arg1, 0xfffffffe, 2)
lua_pushvalue(arg1, 0xfffffffe)
lua_pushcclosure(arg1, sub_d1f7c, 1)
lua_rawseti(arg1, 0xfffffffe, 3)
lua_pushvalue(arg1, 0xfffffffe)
lua_pushcclosure(arg1, sub_d20b0, 1)
lua_rawseti(arg1, 0xfffffffe, 4)
lua_setfield(arg1, 0xfffffffe, "searchers")
sub_d18b0(arg1, "path", "LUA_PATH_5_2", "LUA_PATH", 
    "/usr/local/share/lua/5.2/?.lua;/usr/local/share/lua/5.2/?/init.lua;/usr/local/lib/lua/5.2/?.lua;"
"/usr/local/lib/lua/5.2/?/init.lua;./?.lua")
sub_d18b0(arg1, "cpath", "LUA_CPATH_5_2", "LUA_CPATH", 
    "/usr/local/lib/lua/5.2/?.so;/usr/local/lib/lua/5.2/loadall.so;./?.so")
lua_pushlstring(arg1, "/\n;\n?\n!\n-\n", 0xa)
lua_setfield(arg1, 0xfffffffe, "config")
luaL_getsubtable(arg1, 0xfff0b9d8, "_LOADED")
lua_setfield(arg1, 0xfffffffe, "loaded")
luaL_getsubtable(arg1, 0xfff0b9d8, "_PRELOAD")
lua_setfield(arg1, 0xfffffffe, "preload")
lua_rawgeti(arg1, 0xfff0b9d8, 2)
lua_pushvalue(arg1, 0xfffffffe)
luaL_setfuncs(arg1, &data_1d76d0, 1)
lua_settop(arg1, 0xfffffffe)
return 1
