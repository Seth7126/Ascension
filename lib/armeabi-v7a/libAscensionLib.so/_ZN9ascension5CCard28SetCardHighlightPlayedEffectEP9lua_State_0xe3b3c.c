// 函数: _ZN9ascension5CCard28SetCardHighlightPlayedEffectEP9lua_State
// 地址: 0xe3b3c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

unimplemented  {vpush {d8, d9, d10}}
void* r0 = lua_touserdata(arg1, 1)
lua_tonumberx(arg1, 2, 0)
unimplemented  {vmov d8, r0, r1}
lua_tonumberx(arg1, 3, 0)
unimplemented  {vmov d9, r0, r1}
lua_tonumberx(arg1, 4, 0)
unimplemented  {vmov d10, r0, r1}
lua_tonumberx(arg1, 5, 0)
unimplemented  {vmov d0, r0, r1}
*(r0 + 0x3cc) = 1
unimplemented  {vcvt.f32.f64 s2, d8}
unimplemented  {vcvt.f32.f64 s4, d9}
unimplemented  {vcvt.f32.f64 s6, d10}
unimplemented  {vcvt.f32.f64 s0, d0}
int96_t entry_q0
*(r0 + 0x3d0) = entry_q0:8.d
int96_t entry_q1
*(r0 + 0x3d4) = entry_q1.d
*(r0 + 0x3d8) = entry_q1:8.d
*(r0 + 0x3dc) = entry_q0.d
unimplemented  {vpop {d8, d9, d10}}
return 0
