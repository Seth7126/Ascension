// 函数: sub_dbc74
// 地址: 0xdbc74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t var_440
int32_t r0_2 = luaL_optlstring(arg1, 2, &data_1bfacb, &var_440)
luaL_checktype(arg1, 1, 5)
int32_t r7 = luaL_optinteger(arg1, 3, 1)
int32_t r0_9

if (lua_type(arg1, 4) s<= 0)
    r0_9 = luaL_len(arg1, 1)
else
    r0_9 = luaL_checkinteger(arg1, 4)

void var_43c
luaL_buffinit(arg1, &var_43c)

if (r7 s< r0_9)
    do
        lua_rawgeti(arg1, 1, r7)
        
        if (lua_isstring(arg1, 0xffffffff) == 0)
            luaL_error(arg1, "invalid value (%s) at index %d in table for 'concat'", 
                lua_typename(arg1, lua_type(arg1, 0xffffffff)), r7)
        
        luaL_addvalue(&var_43c)
        luaL_addlstring(&var_43c, r0_2, var_440)
        r7 += 1
    while (r0_9 != r7)
    
    goto label_dbdb4

if (r7 == r0_9)
label_dbdb4:
    lua_rawgeti(arg1, 1, r0_9)
    
    if (lua_isstring(arg1, 0xffffffff) == 0)
        luaL_error(arg1, "invalid value (%s) at index %d in table for 'concat'", 
            lua_typename(arg1, lua_type(arg1, 0xffffffff)), r0_9)
    
    luaL_addvalue(&var_43c)

luaL_pushresult(&var_43c)

if (*__stack_chk_guard == r0)
    return 1

__stack_chk_fail()
noreturn
