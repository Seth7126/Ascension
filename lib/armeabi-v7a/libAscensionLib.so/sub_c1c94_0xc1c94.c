// 函数: sub_c1c94
// 地址: 0xc1c94
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* s = arg3

if (arg2 != 0)
    lua_pushvalue(arg1)

char* r7_1

do
    char* r0_2 = strchr(s, 0x2e)
    r7_1 = r0_2
    
    if (r0_2 == 0)
        r7_1 = s + strlen(s)
    
    int32_t r5_1 = r7_1 - s
    lua_pushlstring(arg1, s, r5_1)
    lua_rawget(arg1, 0xfffffffe)
    
    if (lua_type(arg1, 0xffffffff) == 0)
        lua_settop(arg1, 0xfffffffe)
        int32_t r2_1 = arg4
        
        if (zx.d(*r7_1) == 0x2e)
            r2_1 = 1
        
        lua_createtable(arg1, 0, r2_1)
        lua_pushlstring(arg1, s, r5_1)
        lua_pushvalue(arg1, 0xfffffffe)
        lua_settable(arg1, 0xfffffffc)
    else if (lua_type(arg1, 0xffffffff) != 5)
        lua_settop(arg1, 0xfffffffd)
        return s
    
    lua_remove(arg1, 0xfffffffe)
    s = &r7_1[1]
while (zx.d(*r7_1) == 0x2e)
return 0
