// 函数: sub_d2304
// 地址: 0xd2304
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* s = luaL_checklstring(arg1, 1, 0)
int32_t r0_3 = lua_gettop(arg1)
luaL_pushmodule(arg1, s, 1)
lua_getfield(arg1, 0xffffffff, "_NAME")
int32_t r0_7 = lua_type(arg1, 0xffffffff)
lua_settop(arg1, 0xfffffffe)

if (r0_7 == 0)
    lua_pushvalue(arg1, 0xffffffff)
    lua_setfield(arg1, 0xfffffffe, 0x1c0eec)
    lua_pushstring(arg1, s)
    lua_setfield(arg1, 0xfffffffe, "_NAME")
    char* r0_14 = strrchr(s, 0x2e)
    void* s_1 = s
    
    if (r0_14 != 0)
        s_1 = &r0_14[1]
    
    lua_pushlstring(arg1, s, s_1 - s)
    lua_setfield(arg1, 0xfffffffe, "_PACKAGE")

lua_pushvalue(arg1, 0xffffffff)
void var_88

if (lua_getstack(arg1, 1, &var_88) == 0)
    luaL_error(arg1, "'module' not called from a Lua function")
else if (lua_getinfo(arg1, 0x1bff96, &var_88) == 0)
    luaL_error(arg1, "'module' not called from a Lua function")
else if (lua_iscfunction(arg1, 0xffffffff) != 0)
    luaL_error(arg1, "'module' not called from a Lua function")

lua_pushvalue(arg1, 0xfffffffe)
int32_t r6_1 = 1
lua_setupvalue(arg1, 0xfffffffe, 1)
lua_settop(arg1, 0xfffffffe)

if (r0_3 s>= 2)
    do
        r6_1 += 1
        
        if (lua_type(arg1, r6_1) == 6)
            lua_pushvalue(arg1, r6_1)
            lua_pushvalue(arg1, 0xfffffffe)
            lua_callk(arg1, 1, 0, 0, 0)
    while (r0_3 != r6_1)

if (*__stack_chk_guard == r0)
    return 1

__stack_chk_fail()
noreturn
