// 函数: _ZN9ascension5CCard17SetCardImageLargeEP9lua_State
// 地址: 0xe3724
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

unimplemented  {vpush {d8, d9, d10, d11}}
void* r0 = lua_touserdata(arg1, 1)
char* r0_2 = lua_tolstring(arg1, 2, 0)
int32_t r0_4
int32_t r1
r0_4, r1 = lua_tonumberx(arg1, 3, 0)
int32_t var_30 = r0_4
int32_t var_34 = r1
int32_t r0_6
int32_t r1_1
r0_6, r1_1 = lua_tonumberx(arg1, 4, 0)
int32_t var_38 = r0_6
int32_t r0_8
int32_t r1_2
r0_8, r1_2 = lua_tonumberx(arg1, 5, 0)
int32_t r0_10
int32_t r1_3
r0_10, r1_3 = lua_tonumberx(arg1, 6, 0)
strncpy(r0 + 0x188, r0_2, 0x40)
unimplemented  {vmov d2, r8, r9}
unimplemented  {vmov d3, r6, r10}
unimplemented  {vcvt.f32.f64 s20, d2}
unimplemented  {vmov d0, r0, r1}
unimplemented  {vcvt.f32.f64 s22, d3}
bool cond:0 = *(r0 + 0x88) != 7
unimplemented  {vmov d1, r0, r5}
unimplemented  {vcvt.f32.f64 s16, d0}
*(r0 + 0x1c7) = 0
unimplemented  {vcvt.f32.f64 s18, d1}
int96_t entry_q4
*(r0 + 0x1cc) = entry_q4.d
*(r0 + 0x1d0) = entry_q4:8.d
int96_t entry_q5
*(r0 + 0x1d4) = entry_q5.d
*(r0 + 0x1d8) = entry_q5:8.d

if (cond:0)
    strncpy(r0 + 0x2d8, r0_2, 0x40)
    *(r0 + 0x317) = 0
else
    sprintf(r0 + 0x2d8, "%s_V", r0_2)

*(r0 + 0x317) = 0
*(r0 + 0x31c) = entry_q4.d
*(r0 + 0x320) = entry_q4:8.d
*(r0 + 0x324) = entry_q5.d
*(r0 + 0x328) = entry_q5:8.d
unimplemented  {vpop {d8, d9, d10, d11}}
int32_t entry_r4
jump(entry_r4)
