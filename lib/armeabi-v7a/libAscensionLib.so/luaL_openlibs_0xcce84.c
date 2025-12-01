// 函数: luaL_openlibs
// 地址: 0xcce84
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

luaL_requiref(arg1, 0x1bfff1, luaopen_base, 1)
lua_settop(arg1, 0xfffffffe)
luaL_requiref(arg1, "package", luaopen_package, 1)
lua_settop(arg1, 0xfffffffe)
luaL_requiref(arg1, "coroutine", luaopen_coroutine, 1)
lua_settop(arg1, 0xfffffffe)
luaL_requiref(arg1, "table", luaopen_table, 1)
lua_settop(arg1, 0xfffffffe)
luaL_requiref(arg1, 0x1c080b, luaopen_io, 1)
lua_settop(arg1, 0xfffffffe)
luaL_requiref(arg1, 0x1c080e, luaopen_os, 1)
lua_settop(arg1, 0xfffffffe)
luaL_requiref(arg1, "string", luaopen_string, 1)
lua_settop(arg1, 0xfffffffe)
luaL_requiref(arg1, "bit32", luaopen_bit32, 1)
lua_settop(arg1, 0xfffffffe)
luaL_requiref(arg1, "math", luaopen_math, 1)
lua_settop(arg1, 0xfffffffe)
luaL_requiref(arg1, "debug", luaopen_debug, 1)
lua_settop(arg1, 0xfffffffe)
luaL_getsubtable(arg1, 0xfff0b9d8, "_PRELOAD")
return lua_settop(arg1, 0xfffffffe) __tailcall
