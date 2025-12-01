// 函数: sub_d83c0
// 地址: 0xd83c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 1
int32_t r0 = *__stack_chk_guard
luaL_checktype(arg1, 1, 6)
lua_settop(arg1, 1)
void var_434
luaL_buffinit(arg1, &var_434)

if (lua_dump(arg1, sub_d9630, &var_434) == 0)
    luaL_pushresult(&var_434)
else
    result = luaL_error(arg1, "unable to dump given function")

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
