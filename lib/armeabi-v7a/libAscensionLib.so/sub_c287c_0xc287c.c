// 函数: sub_c287c
// 地址: 0xc287c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = luaL_optlstring(arg1, 1, 0, 0)
lua_settop(arg1, 1)

if (luaL_loadfilex(arg1, r0, 0) != 0)
    return lua_error(arg1) __tailcall

lua_callk(arg1, 0, 0xffffffff, 0, sub_c3464)
return lua_gettop(arg1) - 1
