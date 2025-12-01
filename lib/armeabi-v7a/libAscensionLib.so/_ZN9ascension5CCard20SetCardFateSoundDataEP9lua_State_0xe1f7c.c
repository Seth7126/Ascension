// 函数: _ZN9ascension5CCard20SetCardFateSoundDataEP9lua_State
// 地址: 0xe1f7c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = lua_touserdata(arg1, 1)
char* r0_2 = lua_tolstring(arg1, 2, 0)
int32_t r0_4 = lua_tointegerx(arg1, 3, 0)
int32_t r0_6
int32_t r1
r0_6, r1 = lua_tonumberx(arg1, 4, 0)
int32_t r0_8
int32_t r1_1
r0_8, r1_1 = lua_tonumberx(arg1, 5, 0)
int32_t r0_10
int32_t r1_2
r0_10, r1_2 = lua_tonumberx(arg1, 6, 0)
strncpy(r0 + 0x37c, r0_2, 0x40)
unimplemented  {vmov d0, r10, r7}
unimplemented  {vmov d1, r6, r8}
*(r0 + 0x3bb) = 0
unimplemented  {vmov d2, r5, r9}
unimplemented  {vcvt.f32.f64 s0, d0}
*(r0 + 0x3bc) = r0_4
unimplemented  {vcvt.f32.f64 s2, d1}
unimplemented  {vcvt.f32.f64 s4, d2}
int96_t entry_q0
*(r0 + 0x3c0) = entry_q0.d
*(r0 + 0x3c4) = entry_q0:8.d
int32_t entry_q1
*(r0 + 0x3c8) = entry_q1
return 0
