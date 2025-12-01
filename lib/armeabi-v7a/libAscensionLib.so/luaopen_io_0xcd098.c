// 函数: luaopen_io
// 地址: 0xcd098
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

lua_createtable(arg1, 0, 0xb)
luaL_setfuncs(arg1, &data_1d747c, 0)
luaL_newmetatable(arg1, "FILE*")
lua_pushvalue(arg1, 0xffffffff)
lua_setfield(arg1, 0xfffffffe, "__index")
luaL_setfuncs(arg1, &data_1d74dc, 0)
lua_settop(arg1, 0xfffffffe)
void* r0_7 = lua_newuserdata(arg1, 8)
*(r0_7 + 4) = 0
luaL_setmetatable(arg1, "FILE*")
*r0_7 = __sF
*(r0_7 + 4) = sub_ce66c
lua_pushvalue(arg1, 0xffffffff)
lua_setfield(arg1, 0xfff0b9d8, "_IO_input")
lua_setfield(arg1, 0xfffffffe, "stdin")
int32_t (** r0_13)() = lua_newuserdata(arg1, 8)
r0_13[1] = 0
luaL_setmetatable(arg1, "FILE*")
*r0_13 = __sF + 0x54
r0_13[1] = sub_ce66c
lua_pushvalue(arg1, 0xffffffff)
lua_setfield(arg1, 0xfff0b9d8, "_IO_output")
lua_setfield(arg1, 0xfffffffe, "stdout")
int32_t (** r0_20)() = lua_newuserdata(arg1, 8)
r0_20[1] = 0
luaL_setmetatable(arg1, "FILE*")
*r0_20 = __sF + 0xa8
r0_20[1] = sub_ce66c
lua_setfield(arg1, 0xfffffffe, "stderr")
return 1
