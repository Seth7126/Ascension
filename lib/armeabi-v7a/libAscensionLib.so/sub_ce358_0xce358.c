// 函数: sub_ce358
// 地址: 0xce358
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* r0 = luaL_checkudata(arg1, 1, "FILE*")
int32_t r0_1 = r0[1]

if (r0_1 == 0)
    luaL_error(arg1, "attempt to use a closed file")

FILE* stream = *r0
int32_t r0_4 = luaL_checkoption(arg1, 2, 0x1c0984, &data_1d752c)
int96_t q0
q0.q = 0
unimplemented  {vmov r2, r3, d0}
luaL_optnumber(arg1, 3)
unimplemented  {vmov d0, r0, r1}
unimplemented  {vcvt.s32.f64 s2, d0}
unimplemented  {vcvt.f64.s32 d1, s2}
unimplemented  {vcmp.f64 d0, d1}
unimplemented  {vmrs apsr_nzcv, fpscr}

if (r0_1 != 0)
    luaL_argerror(arg1, 3, "not an integer in proper range")

if (fseek(stream, q0:8.d, *(&data_1d13b8 + (r0_4 << 2))) != 0)
    return luaL_fileresult(arg1, 0, 0) __tailcall

q0.d = ftell(stream)
unimplemented  {vcvt.f64.s32 d0, s0}
unimplemented  {vmov r2, r3, d0}
lua_pushnumber(arg1)
return 1
