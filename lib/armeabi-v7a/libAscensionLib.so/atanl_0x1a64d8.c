// 函数: atanl
// 地址: 0x1a64d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = arg2 & 0x7fffffff
int128_t q0
q0.q = arg2:arg1

if (r2 u< 0x44100000)
    int32_t r0
    
    if (r2 u>= 0x3fdc0000)
        q0.q = fabs(q0.q)
        
        if (r2 u>= 0x3ff30000)
            if (r2 u>= 0x40038000)
                q0:8.q = -0x4080000000000000
                r0 = 3
                q0.q = q0:8.q f/ q0.q
            else
                q0:8.q = 0x3fc0000000000000
                r0 = 2
                unimplemented  {vmla.f64.F64 d2, d0, d1}
                q0:8.q = -0x4040000000000000
                q0.q = q0.q f+ -0.125
                q0.q = q0.q f/ 0.0078125
        else if (r2 u>= 0x3fe60000)
            q0:8.q = 0x3f80000000000000
            r0 = 1
            q0:8.q = q0.q f+ 0.0078125
            q0.q = q0.q f+ -0.0078125
            q0.q = q0.q f/ q0:8.q
        else
            r0 = 0
            q0:8.q = 0x4000000000000000
            q0.q = q0.q f+ 2.0
            q0:8.q = -0x4080000000000000 + -0.0078125
            q0.q = q0:8.q f/ q0.q
        
        goto label_1a65aa
    
    q0:8.q = 0xe43c8800
    r0 = 0xffffffff
    q0:8.q = q0.q f+ 1.8918624478879224e-314
    unimplemented  {vcmpe.f64.F64 d1, d2}
    unimplemented  {vmrs apsr_nzcv, fpscr}
    
    if (r2 s<= 0x3fdc0000 || r2 u>= 0x3e400000)
    label_1a65aa:
        double q1 = q0.q f* q0.q
        q0:8.q = q1 * q1
        int128_t q2
        q2.q = 0x7b4b2476
        unimplemented  {vmla.f64.F64 d4, d1, d3}
        q2:8.q = 0xb4442c6a
        int128_t q3
        q3.q = 0xde2d52de
        unimplemented  {vmla.f64.F64 d6, d1, d5}
        unimplemented  {vmla.f64.F64 d3, d1, d4}
        q2:8.q = 0xb0f2af74
        q2.q = 0x45cdc54c
        unimplemented  {vmla.f64.F64 d5, d1, d6}
        unimplemented  {vmla.f64.F64 d4, d1, d3}
        q3.q = 0x71c6fe23
        unimplemented  {vmla.f64.F64 d6, d1, d5}
        unimplemented  {vmla.f64.F64 d3, d1, d4}
        q2:8.q = 0x99999998
        q2.q = 0x55555555
        unimplemented  {vmla.f64.F64 d4, d1, d3}
        unimplemented  {vmla.f64.F64 d5, d1, d6}
        q0:8.q = q0:8.q f* q2:8.q
        q0:8.q = q0:8.q f+ 0x49249200 * 7.0733193015706889e-315
        
        if (r0 s<= 0xffffffff)
            unimplemented  {vmls.f64.F64 d0, d0, d1}
        else
            unimplemented  {vnmls.f64.F64 d2, d0, d1}
            q0.q = *(&data_1d53b0 + (r0 << 3)) f- q0.q
            q0:8.q = *(&data_1d5390 + (r0 << 3))
            q0.q = q0:8.q f- q0.q
            q0:8.q = fneg(q0.q)
            
            if (arg2 s< 0)
                q0.q = q0:8.q
else if (r2 u> 0x7ff00000 || (arg1 != 0 && r2 == 0x7ff00000))
    q0.q = q0.q f+ q0.q
else
    q0.q = 0x33145c07
    
    if (arg2 s< 1)
        q0:8.q = 0x54442d18
        q0.q = 6.984873502635735e-315 - 4.2340057039723026e-315
    else
        q0:8.q = 0x21fb5444
        q0.q = 4.2340057039723026e-315 + 2.8167632854085806e-315

int32_t result
int32_t r1
r1:result = q0.q
return result
