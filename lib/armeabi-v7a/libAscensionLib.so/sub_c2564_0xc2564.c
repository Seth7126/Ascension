// 函数: sub_c2564
// 地址: 0xc2564
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 != 0 && lua_type(arg1, 0xffffffff) == 5)
    lua_pushnil(arg1)
    
    if (lua_next(arg1, 0xfffffffe) != 0)
        int32_t i
        
        do
            if (lua_type(arg1, 0xfffffffe) == 4)
                if (lua_rawequal(arg1, arg2, 0xffffffff) != 0)
                    lua_settop(arg1, 0xfffffffe)
                    return 1
                
                if (sub_c2564(arg1, arg2, arg3 - 1) != 0)
                    lua_remove(arg1, 0xfffffffe)
                    lua_pushlstring(arg1, &data_1bff98, 1)
                    lua_insert(arg1, 0xfffffffe)
                    lua_concat(arg1, 3)
                    return 1
            
            lua_settop(arg1, 0xfffffffe)
            i = lua_next(arg1, 0xfffffffe)
        while (i != 0)

return 0
