// 函数: sub_1a7660
// 地址: 0x1a7660
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int128_t q0
q0.q = arg2:arg1
int128_t q1
q1.q = 0xbe8838d4
q1:8.q = 0xbdb4b1c4
q0:8.q = q0.q f* q0.q
unimplemented  {vmla.f64.F64 d3, d1, d2}
int128_t q2
q2.q = 0x19cb1590
q2:8.q = 0x16c15177
unimplemented  {vmla.f64.F64 d5, d1, d4}
double q3 = q0:8.q f* q0:8.q
q1.q = 0x809c52ad
unimplemented  {vmla.f64.F64 d2, d1, d3}
q1:8.q = q3 * q3
q2.q = 0x5555554c
unimplemented  {vmla.f64.F64 d4, d1, d5}
q1.q = q1:8.q f* 1.0660594898239033e-314
unimplemented  {vmla.f64.F64 d2, d1, d4}
q1:8.q = 0x3f00000000000000
q1:8.q = q0:8.q f* 3.0517578125e-05
q2.q = 0x3f80000000000000
q0:8.q = q0:8.q f* q1.q
q2:8.q = 0.0078125 f- q1:8.q
r2
r3
q1.q = r3:r2
unimplemented  {vmls.f64.F64 d1, d0, d2}
q0.q = 0.0078125 f- q2:8.q
q0.q = q0.q f- q1:8.q
q0.q = q0.q f+ q0:8.q
q0.q = q2:8.q f+ q0.q
int32_t result
int32_t r1
r1:result = q0.q
return result
