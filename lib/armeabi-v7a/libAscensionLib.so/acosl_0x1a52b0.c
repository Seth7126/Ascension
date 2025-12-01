// 函数: acosl
// 地址: 0x1a52b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int64_t var_10 = arg3.q
int64_t var_18 = arg3:8.q
int32_t r2 = arg2 & 0x7fffffff
int128_t q0
q0.q = arg2:arg1

if (r2 u< 0x3ff00000)
    int128_t q1
    
    if (r2 u> 0x3fdfffff)
        arg3.q = 0x3f80000000000000
        bool v_1 = add_overflow(arg2, 1)
        int128_t q2
        
        if (arg2 == 0xffffffff || arg2 + 1 s< 0 != v_1)
            q0.q = q0.q f+ 0.0078125
            q0:8.q = 0x3f00000000000000
            q0.q = q0.q f* 3.0517578125e-05
            q0:8.q = 0x3de10dfd
            q1.q = 0xefe07501
            unimplemented  {vmla.f64.F64 d2, d0, d1}
            q0:8.q = 0x8228b568
            unimplemented  {vmla.f64.F64 d1, d0, d2}
            q1:8.q = 0xb8c5b12e
            q2.q = 0x66c1b8d
            unimplemented  {vmla.f64.F64 d4, d0, d3}
            q1.q = 0xc1550e88
            unimplemented  {vmla.f64.F64 d2, d0, d1}
            q1:8.q = 0x2ae59c59
            unimplemented  {vmla.f64.F64 d3, d0, d4}
            q2:8.q = 0xd61203eb
            unimplemented  {vmla.f64.F64 d5, d0, d2}
            q2.q = 0x3a271c8a
            unimplemented  {vmla.f64.F64 d4, d0, d3}
            unimplemented  {vsqrt.f64.F64 d1, d0}
            q1.q = 0x55555555
            unimplemented  {vmla.f64.F64 d2, d0, d5}
            unimplemented  {vmla.f64.F64 d8, d0, d4}
            arg3:8.q = q0.q f* 7.0733193015706889e-315
            unimplemented  {vcmpe.f64.F64 d1, d1}
            unimplemented  {vmrs apsr_nzcv, fpscr}
            
            if (v_1)
                int32_t r0_5
                uint32_t r1_3
                r1_3:r0_5 = q0.q
                int32_t r0_6
                int32_t r1_4
                r0_6, r1_4, q0 = sqrtl(r0_5, r1_3)
                q0:8.q = r1_4:r0_6
            
            q0.q = arg3:8.q f/ 0.0078125
            q1.q = data_1e40b8
            unimplemented  {vnmls.f64.F64 d2, d0, d1}
            q0.q = q0:8.q f+ q1.q
            q0.q = q0.q f+ q0.q
            q0:8.q = 0x54442d18
            q0.q = 6.984873502635735e-315 f- q0.q
        else
            q0.q = 0.0078125 f- q0.q
            q0:8.q = 0x3f00000000000000
            arg3:8.q = q0.q f* 3.0517578125e-05
            unimplemented  {vsqrt.f64.F64 d0, d9}
            unimplemented  {vcmpe.f64.F64 d0, d0}
            unimplemented  {vmrs apsr_nzcv, fpscr}
            
            if (v_1)
                int32_t r0_1
                uint32_t r1
                r1:r0_1 = arg3:8.q
                int32_t r0_2
                int32_t r1_1
                r0_2, r1_1, q0 = sqrtl(r0_1, r1)
                q0.q = r1_1:r0_2
            
            q0:8.q = 0xdfdf709
            int32_t r0_3
            int32_t r1_2
            r1_2:r0_3 = q0.q
            q1.q = 0x7501b288
            q1:8.q = 0xb8c5b12e
            unimplemented  {vmla.f64.F64 d2, d9, d1}
            q0:8.q = 0x8228b568
            unimplemented  {vmla.f64.F64 d1, d9, d2}
            q2.q = 0x66c1b8d
            q1.q = 0xc1550e88
            unimplemented  {vmla.f64.F64 d4, d9, d3}
            unimplemented  {vmla.f64.F64 d2, d9, d1}
            q1:8.q = 0x2ae59c59
            q0:8.q = 0xd61203eb
            unimplemented  {vmla.f64.F64 d3, d9, d4}
            unimplemented  {vmla.f64.F64 d1, d9, d2}
            q2.q = 0x3a271c8a
            q1.q = 0x55555555
            unimplemented  {vmla.f64.F64 d4, d9, d3}
            unimplemented  {vmla.f64.F64 d2, d9, d1}
            q0:8.q = r1_2:0
            unimplemented  {vmla.f64.F64 d8, d9, d4}
            q1.q = arg3:8.q f* 7.0733193015706889e-315
            unimplemented  {vmls.f64.F64 d9, d1, d1}
            q1:8.q = q0.q f+ q0:8.q
            q1.q = q1.q f/ 0.0078125
            q1:8.q = arg3:8.q f/ q1:8.q
            unimplemented  {vmla.f64.F64 d3, d2, d0}
            q0.q = q1:8.q f+ q0:8.q
            q0.q = q0.q f+ q0.q
    else if (r2 u> 0x3c600000)
        q0:8.q = q0.q f* q0.q
        q1.q = 0xdfdf709
        q1:8.q = 0x7501b288
        unimplemented  {vmla.f64.F64 d3, d1, d2}
        q1.q = 0xb5688f3b
        unimplemented  {vmla.f64.F64 d2, d1, d3}
        unimplemented  {vmla.f64.F64 d5, d1, d4}
        q1:8.q = 0xe884455
        unimplemented  {vmla.f64.F64 d3, d1, d2}
        unimplemented  {vmla.f64.F64 d4, d1, d5}
        q1.q = 0x3eb6f7d
        unimplemented  {vmla.f64.F64 d2, d1, d3}
        unimplemented  {vmla.f64.F64 d5, d1, d4}
        q1:8.q = 0x55555555
        unimplemented  {vmla.f64.F64 d3, d1, d2}
        unimplemented  {vmla.f64.F64 d4, d1, d5}
        q0:8.q = q0:8.q f* 7.0733193015706889e-315
        q0:8.q = q0:8.q f/ 0.0078125
        q1.q = data_1e40b8
        unimplemented  {vmls.f64.F64 d2, d1, d0}
        q0:8.q = 0x54442d18
        q0.q = q1.q f- q0.q
        q0.q = q0.q f+ q0:8.q
    else
        q0.q = 0x21fb5444
        q0:8.q = data_1e40b8
        q0.q = q0:8.q f+ 2.8167632854085806e-315
else if ((arg1 | (r2 - 0x3ff00000)) != 0)
    q0.q = q0.q f- q0.q
    q0.q = q0.q f/ q0.q
else if (arg2 s<= 0)
    q0:8.q = 0x54442d18
    q0.q = data_1e40b8
    q0.q = q0.q f+ q0.q
    q0.q = q0.q f+ q0:8.q
else
    q0.q = 0

int32_t result
int32_t r1_5
r1_5:result = q0.q
arg3.q = var_18
arg3:8.q = var_10
return result
