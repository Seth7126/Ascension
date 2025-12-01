// 函数: luaL_checkunsigned
// 地址: 0xc0e34
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_28
int32_t result = lua_tounsignedx(arg1, arg2, &var_28)

if (var_28 == 0)
    luaL_argerror(arg1, arg2, 
        lua_pushfstring(arg1, "%s expected, got %s", lua_typename(arg1, 3), 
            lua_typename(arg1, lua_type(arg1, arg2))))

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
