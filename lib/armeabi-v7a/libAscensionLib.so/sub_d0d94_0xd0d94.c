// 函数: sub_d0d94
// 地址: 0xd0d94
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r0_2
int32_t r1
r0_2, r1 = luaL_checknumber(arg1, 1)
int32_t var_18
frexpl(r0_2, r1, &var_18)
lua_pushnumber(arg1)
lua_pushinteger(arg1, var_18)

if (*__stack_chk_guard == r0)
    return 2

__stack_chk_fail()
noreturn
