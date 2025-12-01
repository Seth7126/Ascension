// 函数: _ZN9ascension5CCard17SetCardImageSmallEP9lua_State
// 地址: 0xe3964
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = lua_touserdata(arg1, 1)
char* r0_2 = lua_tolstring(arg1, 2, 0)
int32_t r0_4
int32_t r1
r0_4, r1 = lua_tonumberx(arg1, 3, 0)
int32_t var_2c = r0_4
int32_t var_30 = r1
int32_t r0_6
int32_t r1_1
r0_6, r1_1 = lua_tonumberx(arg1, 4, 0)
int32_t r0_8
int32_t r1_2
r0_8, r1_2 = lua_tonumberx(arg1, 5, 0)
int32_t r0_10
int32_t r1_3
r0_10, r1_3 = lua_tonumberx(arg1, 6, 0)
strncpy(r0 + 0x230, r0_2, 0x40)
unimplemented  {vmov d1, r7, r6}
unimplemented  {vmov d2, r8, r9}
unimplemented  {vmov d3, r5, r10}
unimplemented  {vcvt.f32.f64 s2, d1}
unimplemented  {vmov d0, r0, r1}
unimplemented  {vcvt.f32.f64 s4, d2}
*(r0 + 0x26f) = 0
unimplemented  {vcvt.f32.f64 s0, d0}
unimplemented  {vcvt.f32.f64 s6, d3}
int96_t entry_q0
*(r0 + 0x274) = entry_q0.d
*(r0 + 0x278) = entry_q0:8.d
int96_t entry_q1
*(r0 + 0x27c) = entry_q1.d
*(r0 + 0x280) = entry_q1:8.d
return 0
