// 函数: luaL_where
// 地址: 0xc0618
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void var_80
int32_t r0_2 = lua_getstack(arg1, arg2, &var_80)

if (r0_2 != 0)
    lua_getinfo(arg1, 0x1bfdd2, &var_80)

int32_t var_6c
void var_5c

if (r0_2 == 0 || var_6c s< 1)
    lua_pushlstring(arg1, &data_1bfacb, 0)
else
    lua_pushfstring(arg1, "%s:%d: ", &var_5c, var_6c)
int32_t r0_6 = *__stack_chk_guard

if (r0_6 == r0)
    return r0_6 - r0

__stack_chk_fail()
noreturn
