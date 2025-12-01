// 函数: sub_d20b0
// 地址: 0xd20b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0
char* s = luaL_checklstring(arg1, 1, 0)
char* r0 = strchr(s, 0x2e)

if (r0 != 0)
    lua_pushlstring(arg1, s, r0 - s)
    int32_t r0_3 = lua_tolstring(arg1, 0xffffffff, 0)
    lua_getfield(arg1, 0xfff0b9d7, "cpath")
    char* r0_6 = lua_tolstring(arg1, 0xffffffff, 0)
    
    if (r0_6 == 0)
        luaL_error(arg1, "'package.%s' must be a string", "cpath")
    
    char* r0_9 = sub_d1c34(arg1, r0_3, r0_6, ".", &data_1c0e1b)
    result = 1
    
    if (r0_9 != 0)
        int32_t r0_11 = sub_d2244(arg1, r0_9, s)
        
        if (r0_11 == 0)
            lua_pushstring(arg1, r0_9)
            return 2
        
        if (r0_11 != 2)
            return luaL_error(arg1, "error loading module '%s' from file '%s':\n\t%s", 
                lua_tolstring(arg1, 1, 0), r0_9, lua_tolstring(arg1, 0xffffffff, 0))
        
        lua_pushfstring(arg1, "\n\tno module '%s' in file '%s'", s, r0_9)

return result
