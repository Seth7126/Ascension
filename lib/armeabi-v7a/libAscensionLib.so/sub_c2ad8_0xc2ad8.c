// 函数: sub_c2ad8
// 地址: 0xc2ad8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_28
int32_t r0_2 = lua_tolstring(arg1, 1, &var_28)
int32_t r0_4 = luaL_optlstring(arg1, 3, 0x1c013b, 0)
int32_t r0_6 = lua_type(arg1, 4)
int32_t r5 = r0_6 + 1

if (r0_6 != 0xffffffff)
    r5 = 4

if (r0_2 != 0)
    int32_t r0_8 = luaL_optlstring(arg1, 2, r0_2, 0)
    
    if (luaL_loadbufferx(arg1, r0_2, var_28, r0_8, r0_4) == 0)
        goto label_c2c10
    
    goto label_c2b84

int32_t r0_17 = luaL_optlstring(arg1, 2, "=(load)", 0)
luaL_checktype(arg1, 1, 6)
lua_settop(arg1, 5)
int32_t result

if (lua_load(arg1, sub_c3590, 0, r0_17, r0_4) != 0)
label_c2b84:
    lua_pushnil(arg1)
    lua_insert(arg1, 0xfffffffe)
    result = 2
else
label_c2c10:
    
    if (r0_6 == 0xffffffff)
        result = 1
    else
        lua_pushvalue(arg1, r5)
        result = 1
        
        if (lua_setupvalue(arg1, 0xfffffffe, 1) == 0)
            lua_settop(arg1, 0xfffffffe)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
