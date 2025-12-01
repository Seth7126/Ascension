// 函数: sub_c6c9c
// 地址: 0xc6c9c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r5 = 0
int32_t r8 = arg1

if (lua_type(arg1, 1) == 8)
    r8 = lua_tothread(arg1, 1)
    r5 = 1

int32_t r7 = r5 | 2
char* s = luaL_optlstring(arg1, r7, "flnStu", 0)
int32_t result
void var_88

if (lua_isnumber(arg1, r5 + 1) == 0)
    if (lua_type(arg1, r5 + 1) != 6)
        result = luaL_argerror(arg1, r5 + 1, "function or level expected")
    else
        lua_pushfstring(arg1, 0x1c04b4, s)
        s = lua_tolstring(arg1, 0xffffffff, 0)
        lua_pushvalue(arg1, r5 + 1)
        lua_xmove(arg1, r8, 1)
    label_c6dc4:
        
        if (lua_getinfo(r8, s, &var_88) == 0)
            result = luaL_argerror(arg1, r7, "invalid option")
        else
            lua_createtable(arg1, 0, 2)
            
            if (strchr(s, 0x53) != 0)
                int32_t var_78
                lua_pushstring(arg1, var_78)
                lua_setfield(arg1, 0xfffffffe, "source")
                void var_64
                lua_pushstring(arg1, &var_64)
                lua_setfield(arg1, 0xfffffffe, "short_src")
                int32_t var_70
                lua_pushinteger(arg1, var_70)
                lua_setfield(arg1, 0xfffffffe, "linedefined")
                int32_t var_6c
                lua_pushinteger(arg1, var_6c)
                lua_setfield(arg1, 0xfffffffe, "lastlinedefined")
                int32_t var_7c
                lua_pushstring(arg1, var_7c)
                lua_setfield(arg1, 0xfffffffe, "what")
            
            if (strchr(s, 0x6c) != 0)
                int32_t var_74
                lua_pushinteger(arg1, var_74)
                lua_setfield(arg1, 0xfffffffe, "currentline")
            
            if (strchr(s, 0x75) != 0)
                char var_68
                lua_pushinteger(arg1, zx.d(var_68))
                lua_setfield(arg1, 0xfffffffe, "nups")
                char var_67
                lua_pushinteger(arg1, zx.d(var_67))
                lua_setfield(arg1, 0xfffffffe, "nparams")
                char var_66
                lua_pushboolean(arg1, sx.d(var_66))
                lua_setfield(arg1, 0xfffffffe, "isvararg")
            
            if (strchr(s, 0x6e) != 0)
                int32_t var_84
                lua_pushstring(arg1, var_84)
                lua_setfield(arg1, 0xfffffffe, "name")
                int32_t var_80
                lua_pushstring(arg1, var_80)
                lua_setfield(arg1, 0xfffffffe, "namewhat")
            
            if (strchr(s, 0x74) != 0)
                char var_65
                lua_pushboolean(arg1, sx.d(var_65))
                lua_setfield(arg1, 0xfffffffe, "istailcall")
            
            if (strchr(s, 0x4c) != 0)
                if (r8 == arg1)
                    lua_pushvalue(arg1, 0xfffffffe)
                    lua_remove(arg1, 0xfffffffd)
                else
                    lua_xmove(r8, arg1, 1)
                
                lua_setfield(arg1, 0xfffffffe, "activelines")
            
            result = 1
            
            if (strchr(s, 0x66) != 0)
                if (r8 == arg1)
                    lua_pushvalue(arg1, 0xfffffffe)
                    lua_remove(arg1, 0xfffffffd)
                else
                    lua_xmove(r8, arg1, 1)
                
                lua_setfield(arg1, 0xfffffffe, "func")
else
    if (lua_getstack(r8, lua_tointegerx(arg1, r5 + 1, 0), &var_88) != 0)
        goto label_c6dc4
    
    lua_pushnil(arg1)
    result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
