// 函数: asinl
// 地址: 0x1a5560
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int64_t var_18 = arg3.q
int64_t var_20 = arg3:8.q
int64_t var_28 = arg4.q
int64_t var_30 = arg4:8.q
int32_t r5 = arg2 & 0x7fffffff
int128_t q0
q0.q = arg2:arg1
int128_t q1

if (r5 u< 0x3ff00000)
    bool v_1 = add_overflow(r5, 0xc0200000)
    
    if (r5 u>= 0x3fe00000)
        arg3.q = 0x3f80000000000000
        q0.q = fabs(q0.q)
        q0.q = 0.0078125 f- q0.q
        q0:8.q = 0x3f00000000000000
        arg3:8.q = q0.q f* 3.0517578125e-05
        q0.q = 0xdfdf709
        q0:8.q = 0x7501b288
        unimplemented  {vmla.f64.F64 d1, d9, d0}
        q0.q = 0xb5688f3b
        unimplemented  {vmla.f64.F64 d0, d9, d1}
        q1.q = 0xb12e9282
        q1:8.q = 0x1b8d0159
        q0:8.q = 0xe884455
        unimplemented  {vmla.f64.F64 d3, d9, d2}
        unimplemented  {vmla.f64.F64 d1, d9, d0}
        q1.q = 0x9c598ac8
        int128_t q2
        q2.q = 0x3eb6f7d
        unimplemented  {vmla.f64.F64 d2, d9, d3}
        unimplemented  {vmla.f64.F64 d4, d9, d1}
        unimplemented  {vsqrt.f64.F64 d0, d9}
        arg4.q = 0x1c8a2d4b
        arg4:8.q = 0x55555555
        unimplemented  {vmla.f64.F64 d10, d9, d2}
        unimplemented  {vmla.f64.F64 d11, d9, d4}
        unimplemented  {vcmpe.f64.F64 d0, d0}
        unimplemented  {vmrs apsr_nzcv, fpscr}
        
        if (v_1)
            int32_t r0_1
            uint32_t r1_1
            r1_1:r0_1 = arg3:8.q
            int32_t r0_2
            int32_t r1_2
            r0_2, r1_2, q0 = sqrtl(r0_1, r1_1)
            q0.q = r1_2:r0_2
        
        unimplemented  {vmla.f64.F64 d8, d9, d10}
        q0:8.q = arg3:8.q f* 7.0733193015706889e-315
        
        if (r5 u< 0x3fef3333)
            int32_t r0_4
            int32_t r1_4
            r1_4:r0_4 = q0.q
            q0:8.q = q0:8.q f/ 0.0078125
            q1.q = r1_4:0
            unimplemented  {vmls.f64.F64 d9, d2, d2}
            q1:8.q = q0.q f+ q1.q
            q1:8.q = arg3:8.q f/ q1:8.q
            q1:8.q = q1:8.q f+ q1:8.q
            q0.q = q0.q f+ q0.q
            q1:8.q = 4.2340057039723026e-315 f- q1:8.q
            unimplemented  {vnmls.f64.F64 d3, d1, d0}
            q0.q = q1.q f+ q1.q
            q0:8.q = 0x21fb5444
            q0.q = 2.8167632854085806e-315 f- q0.q
            q0.q = q0.q f- q1:8.q
            q0.q = q0.q f+ q0:8.q
        else
            q0:8.q = q0:8.q f/ 0.0078125
            unimplemented  {vmla.f64.F64 d0, d1, d0}
            q0:8.q = 0x33145c07
            q0.q = q0.q f+ q0.q
            q0.q = q0.q f+ q0:8.q
            q0:8.q = 0x54442d18
            q0.q = 6.984873502635735e-315 f- q0.q
        
        q0:8.q = fneg(q0.q)
        
        if (arg2 s> 0)
            q0:8.q = q0.q
        
        int32_t r0_6
        int32_t r1_5
        r1_5:r0_6 = q0:8.q
        arg3.q = var_30
        arg3:8.q = var_28
        arg4.q = var_20
        arg4:8.q = var_18
        return r0_6
    
    q0:8.q = 0xe43c8800
    q1.q = q0.q f+ 1.8918624478879224e-314
    q0:8.q = 0x3f80000000000000
    unimplemented  {vcmpe.f64.F64 d2, d1}
    unimplemented  {vmrs apsr_nzcv, fpscr}
    
    if (r5 == 0x3fe00000 || r5 - 0x3fe00000 s< 0 != v_1 || r5 u>= 0x3e500000)
        q1.q = q0.q f* q0.q
        q1:8.q = 0x3de10dfd
        unimplemented  {vmla.f64.F64 d4, d2, d3}
        q1:8.q = 0x8228b568
        unimplemented  {vmla.f64.F64 d3, d2, d4}
        int128_t q3
        q3.q = 0x66c1b8d
        unimplemented  {vmla.f64.F64 d6, d2, d5}
        unimplemented  {vmla.f64.F64 d4, d2, d3}
        unimplemented  {vmla.f64.F64 d5, d2, d6}
        q1:8.q = 0xd61203eb
        unimplemented  {vmla.f64.F64 d3, d2, d4}
        q3.q = 0x3a271c8a
        unimplemented  {vmla.f64.F64 d6, d2, d5}
        unimplemented  {vmla.f64.F64 d4, d2, d3}
        unimplemented  {vmla.f64.F64 d1, d2, d6}
        q1.q = q1.q f* 7.0733193015706889e-315
        q0:8.q = q1.q f/ 0.0078125
        unimplemented  {vmla.f64.F64 d0, d1, d0}
else if ((arg1 | (0xc0100000 + r5)) == 0)
    q0:8.q = 0xa6263314
    q1.q = 0x21fb5444
    q0:8.q = q0.q f* 1.3772185113807312e-314
    unimplemented  {vmla.f64.F64 d1, d0, d2}
    q0.q = q0:8.q
else
    q0.q = q0.q f- q0.q
    q0.q = q0.q f/ q0.q
int32_t r0_3
int32_t r1_3
r1_3:r0_3 = q0.q
arg3.q = var_30
arg3:8.q = var_28
arg4.q = var_20
arg4:8.q = var_18
return r0_3
