// 函数: sub_d0e54
// 地址: 0xd0e54
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

unimplemented  {vpush {d8}}
int32_t r0
int32_t r1
r0, r1 = luaL_checknumber(arg1, 1)
int32_t r0_2 = lua_type(arg1, 2)

if (r0_2 s<= 0)
    logl(r0, r1)
    unimplemented  {vmov d0, r0, r1}
else
    int32_t r0_4
    int32_t r1_1
    r0_4, r1_1 = luaL_checknumber(arg1, 2)
    unimplemented  {vmov.f64 d0, #1.000000e+01}
    unimplemented  {vmov d1, r0, r1}
    unimplemented  {vcmp.f64 d1, d0}
    unimplemented  {vmrs apsr_nzcv, fpscr}
    
    if (r0_2 != 0)
        logl(r0, r1)
        unimplemented  {vmov d8, r0, r1}
        logl(r0_4, r1_1)
        unimplemented  {vmov d0, r0, r1}
    else
        log10l(r0, r1)
        unimplemented  {vmov d0, r0, r1}

unimplemented  {vmov r2, r3, d0}
lua_pushnumber(arg1)
unimplemented  {vpop {d8}}
return 1
