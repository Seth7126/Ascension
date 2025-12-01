// 函数: luaL_addvalue
// 地址: 0xc1188
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r4 = arg1[3]
int32_t var_28
int32_t r0_2 = lua_tolstring(r4, 0xffffffff, &var_28)

if (*arg1 != &arg1[4])
    lua_insert(r4, 0xfffffffe)

luaL_addlstring(arg1, r0_2, var_28)
int32_t r1_1 = 0xfffffffe

if (*arg1 == &arg1[4])
    r1_1 = 0xffffffff

lua_remove(r4, r1_1)
int32_t r0_8 = *__stack_chk_guard

if (r0_8 == r0)
    return r0_8 - r0

__stack_chk_fail()
noreturn
