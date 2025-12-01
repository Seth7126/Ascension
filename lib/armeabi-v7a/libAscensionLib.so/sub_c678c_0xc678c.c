// 函数: sub_c678c
// 地址: 0xc678c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char const* const r1_5

if (lua_checkstack(arg2, arg3) == 0)
    r1_5 = "too many arguments to resume"
label_c687c:
    lua_pushlstring(arg1, r1_5, 0x1c)
else
    int32_t r0_3 = lua_status()
    int32_t r0_5
    
    if (r0_3 == 0)
        r0_5 = lua_gettop(arg2)
    
    if (r0_3 == 0 && r0_5 == 0)
        r1_5 = "cannot resume dead coroutine"
        goto label_c687c
    
    lua_xmove(arg1, arg2, arg3)
    
    if (lua_resume(arg2, arg1, arg3) u> 1)
        lua_xmove(arg2, arg1, 1)
    else
        int32_t result = lua_gettop(arg2)
        
        if (lua_checkstack(arg1, result + 1) != 0)
            lua_xmove(arg2, arg1, result)
            return result
        
        lua_settop(arg2, not.d(result))
        lua_pushlstring(arg1, "too many results to resume", 0x1a)
return 0xffffffff
