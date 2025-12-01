// 函数: sub_d0f14
// 地址: 0xd0f14
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

unimplemented  {vpush {d8}}
int32_t r0 = lua_gettop()
int32_t r6 = 1
luaL_checknumber(arg1, 1)
unimplemented  {vmov d8, r0, r1}
bool cond:0 = r0 s> 2

if (r0 s>= 2)
    do
        r6 += 1
        luaL_checknumber(arg1, r6)
        unimplemented  {vmov d0, r0, r1}
        unimplemented  {vcmpe.f64 d0, d8}
        unimplemented  {vmrs apsr_nzcv, fpscr}
        
        if (cond:0)
            unimplemented  {vmovgt.f64 q4, #2.000000e+00}
        
        cond:0 = r0 s> r6
    while (r0 != r6)

unimplemented  {vmov r2, r3, d8}
lua_pushnumber(arg1)
unimplemented  {vpop {d8}}
return 1
