// 函数: sub_c68a0
// 地址: 0xc68a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = sub_c678c(arg1, lua_tothread(arg1, 0xfff0b9d7), lua_gettop(arg1))

if (result s> 0xffffffff)
    return result

if (lua_isstring(arg1, 0xffffffff) != 0)
    luaL_where(arg1, 1)
    lua_insert(arg1, 0xfffffffe)
    lua_concat(arg1, 2)

return lua_error(arg1) __tailcall
