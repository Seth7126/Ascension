// 函数: sub_1a7cd8
// 地址: 0x1a7cd8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int128_t q0
q0.q = arg2:arg1
int128_t q1
q1.q = 0x57b1fe7d
q1:8.q = 0x19c161d5
q0:8.q = q0.q f* q0.q
unimplemented  {vmla.f64.F64 d3, d1, d2}
int128_t q2
q2.q = 0x5acfd57c
q2:8.q = 0x8a2b9ceb
q1.q = 0x1110f8a6
unimplemented  {vmla.f64.F64 d5, d1, d4}
unimplemented  {vmla.f64.F64 d2, d1, d3}
q1:8.q = q0:8.q f* q0:8.q f* q0:8.q
unimplemented  {vmla.f64.F64 d2, d3, d5}
q1:8.q = q0:8.q f* q0.q

if (arg3 == 0)
    q2.q = 0x55555549
    unimplemented  {vmla.f64.F64 d4, d1, d2}
    unimplemented  {vmla.f64.F64 d0, d3, d4}
else
    q2:8.q = 0x3f00000000000000
    r2
    r3
    q2.q = r3:r2
    q2:8.q = q2.q f* q2:8.q
    unimplemented  {vmls.f64.F64 d5, d3, d2}
    unimplemented  {vnmls.f64.F64 d4, d1, d5}
    q0:8.q = 0x55555555
    unimplemented  {vmla.f64.F64 d4, d3, d1}
    q0.q = q0.q f- q2.q

int32_t result
int32_t r1
r1:result = q0.q
return result
