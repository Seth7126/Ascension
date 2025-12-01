// 函数: sub_c3590
// 地址: 0xc3590
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
luaL_checkstack(arg1, 2, "too many nested functions")
lua_pushvalue(arg1, 1)
lua_callk(arg1, 0, 1, 0, 0)

if (lua_type(arg1, 0xffffffff) == 0)
    lua_settop(arg1, 0xfffffffe)
    *arg3 = 0
    return 0

if (lua_isstring(arg1, 0xffffffff) == 0)
    luaL_error(arg1, "reader function must return a string")

lua_replace(arg1, 5)
return lua_tolstring(arg1, 5, arg3) __tailcall
