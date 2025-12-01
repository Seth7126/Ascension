// 函数: luaL_requiref
// 地址: 0xc20ac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
lua_pushcclosure(arg1, arg3, 0)
lua_pushstring(arg1, arg2)
lua_callk(arg1, 1, 1, 0, 0)
luaL_getsubtable(arg1, 0xfff0b9d8, "_LOADED")
lua_pushvalue(arg1, 0xfffffffe)
lua_setfield(arg1, 0xfffffffe, arg2)
int32_t result = lua_settop(arg1, 0xfffffffe)

if (arg4 == 0)
    return result

lua_pushvalue(arg1, 0xffffffff)
return lua_setglobal(arg1, arg2) __tailcall
