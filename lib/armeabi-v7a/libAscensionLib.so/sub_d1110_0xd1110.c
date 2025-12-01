// 函数: sub_d1110
// 地址: 0xd1110
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
unimplemented  {vpush {d8, d9, d10}}
int32_t r0 = lrand48()
int128_t q0
q0:8.q = 0x41dfffffffc00000
int32_t r1 = (r0 * 0x40000001) s>> 0x20
q0.d = r0 - ((r1 s>> 0x1d) + (r1 u>> 0x1f)) * 0x7fffffff
unimplemented  {vcvt.f64.s32 d0, s0}
int128_t q4
q4.q = q0.q f/ q0:8.q
int32_t r0_3 = lua_gettop(arg1)

if (r0_3 == 2)
    luaL_checknumber(arg1, 1)
    unimplemented  {vmov d9, r0, r1}
    luaL_checknumber(arg1, 2)
    unimplemented  {vmov d10, r0, r1}
    unimplemented  {vcmpe.f64 d9, d10}
    unimplemented  {vmrs apsr_nzcv, fpscr}
    
    if (r0_3 u> 2)
        luaL_argerror(arg1, 2, "interval is empty")
    
    q0.q = arg3 f- q4:8.q
    unimplemented  {vmov.f64 d1, #1.000000e+00}
    q0.q = q0.q f+ q0:8.q
    q0.q = q4.q f* q0.q
    unimplemented  {vmov r0, r1, d0}
    floor(arg2)
    unimplemented  {vmov d0, r0, r1}
    q0.q = q4:8.q f+ q0.q
    unimplemented  {vmov r2, r3, d0}
else if (r0_3 == 1)
    luaL_checknumber(arg1, 1)
    unimplemented  {vmov.f64 d9, #1.000000e+00}
    unimplemented  {vmov d10, r0, r1}
    unimplemented  {vcmpe.f64 d10, d9}
    unimplemented  {vmrs apsr_nzcv, fpscr}
    
    if (r0_3 s< 1)
        luaL_argerror(arg1, 1, "interval is empty")
    
    q0.q = q4.q f* arg3
    unimplemented  {vmov r0, r1, d0}
    floor(arg2)
    unimplemented  {vmov d0, r0, r1}
    q0.q = q0.q f+ q4:8.q
    unimplemented  {vmov r2, r3, d0}
else
    if (r0_3 != 0)
        unimplemented  {vpop {d8, d9, d10}}
        return luaL_error(arg1, "wrong number of arguments") __tailcall
    
    unimplemented  {vmov r2, r3, d8}

lua_pushnumber(arg1)
unimplemented  {vpop {d8, d9, d10}}
return 1
