// 函数: sub_dbf20
// 地址: 0xdbf20
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5 = lua_gettop()
lua_createtable(arg1, r5, 1)
lua_pushinteger(arg1, r5)
lua_setfield(arg1, 0xfffffffe, 0x1bfd8d)

if (r5 s>= 1)
    lua_pushvalue(arg1, 1)
    lua_rawseti(arg1, 0xfffffffe, 1)
    lua_replace(arg1, 1)
    
    if (r5 != 1)
        bool cond:0_1
        
        do
            lua_rawseti(arg1, 1, r5)
            cond:0_1 = r5 s> 2
            r5 -= 1
        while (cond:0_1)

return 1
