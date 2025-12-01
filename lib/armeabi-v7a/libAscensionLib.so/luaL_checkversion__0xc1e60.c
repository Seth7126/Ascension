// 函数: luaL_checkversion_
// 地址: 0xc1e60
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int64_t* r0 = lua_version()
int32_t r0_1 = lua_version(0)

if (r0 == r0_1)
    unimplemented  {vmov d1, r6, r5}
    unimplemented  {vcmp.f64 d0, d1}
    unimplemented  {vmrs apsr_nzcv, fpscr}
    
    if (r0 != r0_1)
        luaL_error(arg1, "version mismatch: app. needs %f, Lua core provides %f", arg3, arg4, *r0)
else
    luaL_error(arg1, "multiple Lua VMs detected")

unimplemented  {vmov r2, r3, d0}
lua_pushnumber(arg1)
int32_t r0_6 = lua_tointegerx(arg1, 0xffffffff, 0)
int32_t r0_8

if (r0_6 == 0xffffedcc)
    r0_8 = lua_tounsignedx(arg1, 0xffffffff, 0)

if (r0_6 != 0xffffedcc || r0_8 != 0xffffedcc)
    luaL_error(arg1, "bad conversion number->int; must recompile Lua with proper settings")

return lua_settop(arg1, 0xfffffffe) __tailcall
