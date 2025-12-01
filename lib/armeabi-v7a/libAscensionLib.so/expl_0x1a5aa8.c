// 函数: expl
// 地址: 0x1a5aa8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = arg2 & 0x7fffffff
int128_t q0
q0.q = arg2:arg1
uint32_t r2 = arg2 u>> 0x1f
int128_t q1

if (r3 u< 0x40862e42)
    int32_t r0_2
    
    if (r3 u>= 0x3fd62e43)
        if (r3 u> 0x3ff0a2b1)
        label_1a5b74:
            q0:8.q = 0x652b82fe
            q1:8.q = 0x2e42fee0
            q1.q = *(&data_1d5380 + (r2 << 3))
            unimplemented  {vmla.f64.F64 d2, d0, d1}
            q0:8.d = fconvert.d(q1.q)
            r0_2 = q0:8.d
            q1.q = fconvert.s(q0:8.d)
            q0:8.q = 0x39ef3579
            q0:8.q = q1.q f* 4.8022099019037595e-315
            q1.q = q1.q f* q1:8.q
        else
            q1.q = *(&data_1d5360 + (r2 << 3))
            r0_2 = (r2 ^ 1) - r2
            q0:8.q = "v<y5"[r2 * 2]
        
        q1.q = q0.q f- q1.q
        q0.q = q1.q f- q0:8.q
        goto label_1a5bb0
    
    q0:8.q = 0
    
    if (r3 u<= 0x3e2fffff)
        q1.q = data_1e40d0
        q1:8.q = q1.q f+ q0.q
        q1.q = 0x3f80000000000000
        unimplemented  {vcmpe.f64.F64 d3, d2}
        unimplemented  {vmrs apsr_nzcv, fpscr}
    
    if (r3 u> 0x3e2fffff || r3 s<= 0x3e2fffff)
        r0_2 = 0
        q1.q = 0
    label_1a5bb0:
        int32_t r1_2 = 0x7e700000
        
        if (r0_2 s> 0xfffffc02)
            r1_2 = 0x3ff00000
        
        q1:8.q = 0x376972be
        unimplemented  {vmla.f64.F64 d5, d4, d3}
        q1:8.q = 0x566aaf25
        unimplemented  {vmla.f64.F64 d3, d4, d5}
        unimplemented  {vmla.f64.F64 d5, d4, d3}
        int128_t q3
        q3.q = 0x55555555
        unimplemented  {vmla.f64.F64 d6, d4, d5}
        q1:8.q = q0.q
        unimplemented  {vmls.f64.F64 d3, d4, d6}
        double q2 = q0.q f* q1:8.q
        
        if (r0_2 == 0)
            q0:8.q = -0x4000000000000000
            q0:8.q = q1:8.q f+ -2.0
            q0:8.q = q2 f/ q0:8.q
            q0.q = q0.q f- q0:8.q
            q0:8.q = 0x3f80000000000000
            q0:8.q = q0.q f+ 0.0078125
        else
            q1:8.q = 2.0 f- q1:8.q
            q1:8.q = 0x4000000000000000 f/ q1:8.q
            q0:8.q = q0:8.q f- q1:8.q
            q0:8.q = q1.q f- q0:8.q
            q0:8.q = q0:8.q f+ 0.0078125
            q0.q = (r1_2 + (r0_2 << 0x14)):0
            
            if (r0_2 s< 0xfffffc03)
                q0.q = q0:8.q f* q0.q
                q0:8.q = data_1e40d8
                q0:8.q = q0.q f* q0:8.q
            else if (r0_2 != 0x400)
                q0:8.q = q0:8.q f* q0.q
            else
                q0.q = q0:8.q f+ q0:8.q
                q0:8.q = 0
                q0:8.q = q0.q f* q0:8.q
    else
        q0:8.q = q0.q f+ 0.0078125
else if (r3 u< 0x7ff00000)
    q0:8.q = 0xfefa39ef
    unimplemented  {vcmpe.f64.F64 d0, d1}
    unimplemented  {vmrs apsr_nzcv, fpscr}
    
    if (r3 s<= 0x7ff00000)
        q0:8.q = 0x4910d52d
        unimplemented  {vcmpe.f64.F64 d0, d1}
        unimplemented  {vmrs apsr_nzcv, fpscr}
        
        if (r3 - 0x7ff00000 s>= 0)
            goto label_1a5b74
        
        q0.q = data_1e40d8
        q0:8.q = data_1e40d8
        q0:8.q = q0.q f* q0:8.q
    else
        q0.q = data_1e40d0
        q0:8.q = data_1e40d0
        q0:8.q = q0.q f* q0:8.q
else
    q0:8.q = q0.q f+ q0.q
    q1.q = 0
    
    if (r2 == 0)
        q1.q = q0.q
    
    if ((arg1 | (arg2 & 0xfffff)) == 0)
        q0:8.q = q1.q
int32_t result
int32_t r1_4
r1_4:result = q0:8.q
return result
