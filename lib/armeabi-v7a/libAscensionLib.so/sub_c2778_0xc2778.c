// 函数: sub_c2778
// 地址: 0xc2778
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = luaL_checkoption(arg1, 1, "collect", &data_1d7310)
int32_t r0_2 = luaL_optinteger(arg1, 2, 0)
int32_t r7 = *(&data_1d1288 + (r0 << 2))
int32_t r0_4 = lua_gc(arg1, r7, r0_2)

if (r7 == 9 || r7 == 5)
    lua_pushboolean(arg1, r0_4)
    return 1

if (r7 != 3)
    lua_pushinteger(arg1, r0_4)
    return 1

int32_t r0_8 = lua_gc(arg1, 4, 0)
int128_t q0
q0:8.d = r0_4
q0.d = r0_8
int128_t q1
q1.q = 0x3f50000000000000
unimplemented  {vcvt.f64.s32 d0, s0}
unimplemented  {vcvt.f64.s32 d1, s2}
unimplemented  {vmla.f64 d1, d0, d2}
unimplemented  {vmov r2, r3, d1}
lua_pushnumber(arg1)
lua_pushinteger(arg1, r0_8)
return 2
