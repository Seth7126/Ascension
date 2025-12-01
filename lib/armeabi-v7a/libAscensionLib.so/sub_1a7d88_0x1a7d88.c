// 函数: sub_1a7d88
// 地址: 0x1a7d88
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int128_t q0
q0:8.q = arg2:arg1
r3
q0.q = r3:arg3
int32_t r0 = arg2 & 0x7ffffff8
int128_t q1

if (r0 u>= 0x3fe59428)
    q1.q = fneg(q0.q)
    q1:8.q = fneg(q0:8.q)
    
    if (arg2 s< 0)
        q0.q = q1.q
    
    if (arg2 s< 0)
        q0:8.q = q1:8.q
    
    q1.q = 0xa6263314
    q1:8.q = 0x21fb5444
    q0.q = 1.3772185113807312e-314 f- q0.q
    q0:8.q = 2.8167632854085806e-315 f- q0:8.q
    q0:8.q = q0:8.q f+ q0.q
    q0.q = 0

q1.q = q0:8.q f* q0:8.q
q1:8.q = q1.q f* q1.q
int128_t q3
q3.q = 0x75cbdb60
q3:8.q = 0x7e88a037
unimplemented  {vmla.f64.F64 d5, d3, d4}
unimplemented  {vmla.f64.F64 d7, d3, d6}
q3.q = 0x44d8f2f2
unimplemented  {vmla.f64.F64 d4, d3, d5}
unimplemented  {vmla.f64.F64 d6, d3, d7}
q3:8.q = 0x6d22c956
unimplemented  {vmla.f64.F64 d5, d3, d4}
unimplemented  {vmla.f64.F64 d7, d3, d6}
q3.q = 0x64f48406
unimplemented  {vmla.f64.F64 d4, d3, d5}
unimplemented  {vmla.f64.F64 d6, d3, d7}
q3:8.q = 0x11111110
unimplemented  {vmla.f64.F64 d5, d3, d4}
unimplemented  {vmla.f64.F64 d7, d3, d6}
unimplemented  {vmla.f64.F64 d7, d2, d5}
q1:8.q = q0:8.q f* q1.q
unimplemented  {vmla.f64.F64 d4, d3, d7}
unimplemented  {vmla.f64.F64 d0, d2, d4}
q1.q = 0x55555555
unimplemented  {vmla.f64.F64 d0, d3, d2}
q1.q = q0:8.q f+ q0.q

if (r0 u>= 0x3fe59428)
    q1:8.d = arg4
    double q2 = q1.q f* q1.q
    q1:8.q = fconvert.s(q1:8.d)
    q1.q = q1.q f+ q1:8.q
    q1.q = q2 f/ q1.q
    q0.q = q1.q f- q0.q
    q0.q = q0:8.q f- q0.q
    q0.q = q0.q f+ q0.q
    q0:8.d = 1 - (2 & arg2 u>> 0x1e)
    q0.q = q1:8.q f- q0.q
    q0:8.q = fconvert.s(q0:8.d)
    q1.q = q0.q f* q0:8.q
else if (arg4 != 1)
    q1:8.q = -0x4080000000000000
    q1:8.q = -0.0078125 f/ q1.q
    int32_t r0_3
    int32_t r1
    r1:r0_3 = q1.q
    q1.q = q1:8.q
    q0:8.q = r1:0 f- q0:8.q
    unimplemented  {vmla.f64.F64 d5, d4, d2}
    q0.q = q0.q f- q0:8.q
    unimplemented  {vmla.f64.F64 d5, d0, d2}
    unimplemented  {vmla.f64.F64 d2, d3, d5}

int32_t result
int32_t r1_1
r1_1:result = q1.q
return result
