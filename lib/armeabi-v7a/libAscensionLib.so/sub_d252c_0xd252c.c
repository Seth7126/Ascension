// 函数: sub_d252c
// 地址: 0xd252c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r0_2 = luaL_checklstring(arg1, 1, 0)
lua_settop(arg1, 1)
lua_getfield(arg1, 0xfff0b9d8, "_LOADED")
lua_getfield(arg1, 2, r0_2)

if (lua_toboolean(arg1, 0xffffffff) == 0)
    lua_settop(arg1, 0xfffffffe)
    void var_43c
    luaL_buffinit(arg1, &var_43c)
    lua_getfield(arg1, 0xfff0b9d7, "searchers")
    
    if (lua_type(arg1, 3) != 5)
        luaL_error(arg1, "'package.searchers' must be a table")
    
    int32_t r6_1 = 1
    
    while (true)
        lua_rawgeti(arg1, 3, r6_1)
        int32_t var_440
        
        if (lua_type(arg1, 0xffffffff) == 0)
            lua_settop(arg1, 0xfffffffe)
            luaL_pushresult(&var_43c)
            luaL_error(arg1, "module '%s' not found:%s", r0_2, lua_tolstring(arg1, 0xffffffff, 0), 
                var_440)
        
        lua_pushstring(arg1, r0_2)
        var_440 = 0
        lua_callk(arg1, 1, 2, 0, 0)
        
        if (lua_type(arg1, 0xfffffffe) == 6)
            break
        
        if (lua_isstring(arg1, 0xfffffffe) != 0)
            lua_settop(arg1, 0xfffffffe)
            luaL_addvalue(&var_43c)
            r6_1 += 1
        else
            lua_settop(arg1, 0xfffffffd)
            r6_1 += 1
    
    lua_pushstring(arg1, r0_2)
    lua_insert(arg1, 0xfffffffe)
    lua_callk(arg1, 2, 1, 0, 0)
    
    if (lua_type(arg1, 0xffffffff) != 0)
        lua_setfield(arg1, 2, r0_2)
    
    lua_getfield(arg1, 2, r0_2)
    
    if (lua_type(arg1, 0xffffffff) == 0)
        lua_pushboolean(arg1, 1)
        lua_pushvalue(arg1, 0xffffffff)
        lua_setfield(arg1, 2, r0_2)

if (*__stack_chk_guard == r0)
    return 1

__stack_chk_fail()
noreturn
