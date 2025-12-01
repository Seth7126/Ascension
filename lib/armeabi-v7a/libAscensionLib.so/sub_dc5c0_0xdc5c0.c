// 函数: sub_dc5c0
// 地址: 0xdc5c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (lua_type(arg1, 2) == 0)
    return lua_compare(arg1, arg2, arg3, 1) __tailcall

lua_pushvalue(arg1, 2)
lua_pushvalue(arg1, arg2 - 1)
lua_pushvalue(arg1, arg3 - 2)
lua_callk(arg1, 2, 1, 0, 0)
int32_t result = lua_toboolean(arg1, 0xffffffff)
lua_settop(arg1, 0xfffffffe)
return result
