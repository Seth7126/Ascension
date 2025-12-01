// 函数: sub_da604
// 地址: 0xda604
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg1 + 0x14) s<= arg2)
    int32_t r0_3 = *(arg1 + 0x10)
    
    if (arg2 != 0)
        return luaL_error(r0_3, "invalid capture index") __tailcall
    
    int32_t r3_3 = arg4 - arg3
    return lua_pushlstring(r0_3, arg3, r3_3, r3_3) __tailcall

void* r6 = arg1 + (arg2 << 3)
int32_t r4 = *(r6 + 0x1c)
int32_t r0_1
int32_t r1

if (r4 == 0xffffffff)
    luaL_error(*(arg1 + 0x10), "unfinished capture")
    r1 = *(r6 + 0x18)
    r0_1 = *(arg1 + 0x10)
else
    r0_1 = *(arg1 + 0x10)
    r1 = *(r6 + 0x18)
    
    if (r4 == 0xfffffffe)
        int32_t r2 = *(arg1 + 4)
        return lua_pushinteger(r0_1, r1 + 1 - r2, r2) __tailcall

return lua_pushlstring(r0_1, r1, r4) __tailcall
