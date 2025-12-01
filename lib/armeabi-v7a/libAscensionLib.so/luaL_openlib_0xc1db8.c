// 函数: luaL_openlib
// 地址: 0xc1db8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int128_t q0
q0.q = 0x407f600000000000
unimplemented  {vmov r2, r3, d0}
luaL_checkversion_()

if (arg2 != 0)
    int32_t r2 = 0
    
    if (arg3 != 0 && *arg3 != 0)
        r2 = 0
        int32_t i
        
        do
            i = arg3[2 + r2 * 2]
            r2 += 1
        while (i != 0)
    
    luaL_pushmodule(arg1, arg2, r2)
    lua_insert(arg1, not.d(arg4))

if (arg3 == 0)
    return lua_settop(arg1, not.d(arg4)) __tailcall

return luaL_setfuncs(arg1, arg3, arg4) __tailcall
