// 函数: sub_c3098
// 地址: 0xc3098
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = lua_type(arg1, 2)
luaL_checktype(arg1, 1, 5)

if (r0 != 0 && r0 != 5)
    luaL_argerror(arg1, 2, "nil or table expected")

if (luaL_getmetafield(arg1, 1, "__metatable") != 0)
    return luaL_error(arg1, "cannot change a protected metatable") __tailcall

lua_settop(arg1, 2)
lua_setmetatable(arg1, 1)
return 1
