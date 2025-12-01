// 函数: luaL_setfuncs
// 地址: 0xc1f58
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int128_t q0
q0.q = 0x407f600000000000
int32_t* r6 = arg2
unimplemented  {vmov r2, r3, d0}
luaL_checkversion_()

if (lua_checkstack(arg1, arg3 + 0x14) == 0)
    luaL_error(arg1, "stack overflow (%s)", "too many upvalues")

while (*r6 != 0)
    if (arg3 s>= 1)
        int32_t i_1 = arg3
        int32_t i
        
        do
            lua_pushvalue(arg1, 0 - arg3)
            i = i_1
            i_1 -= 1
        while (i != 1)
    
    lua_pushcclosure(arg1, r6[1], arg3)
    lua_setfield(arg1, 0xfffffffe - arg3, *r6)
    r6 = &r6[2]

return lua_settop(arg1, not.d(arg3)) __tailcall
