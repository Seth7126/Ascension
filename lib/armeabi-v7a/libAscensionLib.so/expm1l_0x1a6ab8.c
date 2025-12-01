// 函数: expm1l
// 地址: 0x1a6ab8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = arg2 & 0x7fffffff
int128_t q0
q0.q = arg2:arg1
int32_t r2 = arg2 & 0x80000000
int128_t q1

if (r3 u< 0x4043687a)
    int32_t r0_1
    
    if (r3 u>= 0x3fd62e43)
        if (r3 u> 0x3ff0a2b1)
        label_1a6b6e:
            q0:8.q = 0x3f00000000000000
            q1.q = -0x4100000000000000
            
            if (r2 == 0)
                q1.q = 0x3f00000000000000
            
            q0:8.q = 0x1547652b
            unimplemented  {vmla.f64.F64 d2, d0, d1}
            q0:8.d = fconvert.d(q1.q)
            r0_1 = q0:8.d
            q1.q = 0x2e42fee0
            q0:8.q = fconvert.s(q0:8.d)
            unimplemented  {vmla.f64.F64 d0, d1, d2}
            q1.q = 0x39ef3579
            q1.q = q0:8.q f* 4.8022099019037595e-315
        else
            if (r2 != 0)
                q0:8.q = 0xfee00000
                r0_1 = 0xffffffff
                q1.q = 0x35793c76
            else
                q0:8.q = 0xfee00000
                r0_1 = 1
                q1.q = 0x39ef3579
            
            q0.q = q0.q f+ q0:8.q
        
        q0:8.q = q0.q f- q1.q
        q0.q = q0.q f- q0:8.q
        q1:8.q = q0.q f- q1.q
        goto label_1a6bc8
    
    if (r3 u> 0x3c8fffff)
        q0:8.q = q0.q
        r0_1 = 0
    label_1a6bc8:
        q1.q = 0x3f00000000000000
        int128_t q2
        q2:8.q = q0:8.q f* 3.0517578125e-05
        q2.q = q0:8.q f* q2:8.q
        q0.q = 0xfdb76e09
        unimplemented  {vmla.f64.F64 d6, d4, d0}
        q0.q = 0xce199eaa
        unimplemented  {vmla.f64.F64 d0, d4, d6}
        unimplemented  {vmla.f64.F64 d6, d4, d0}
        unimplemented  {vmla.f64.F64 d7, d4, d6}
        q0.q = 0x3f80000000000000
        unimplemented  {vmla.f64.F64 d6, d4, d7}
        unimplemented  {vmls.f64.F64 d7, d5, d6}
        q2:8.q = 0x40c0000000000000
        unimplemented  {vmls.f64.F64 d5, d1, d7}
        q2:8.q = (0.0078125 - 32.0) / 8192.0
        q2:8.q = q2.q f* q2:8.q
        
        if (r0_1 == 0)
            unimplemented  {vnmls.f64.F64 d4, d1, d5}
            q0:8.q = q0:8.q f- q2.q
        else
            q2:8.q = q2:8.q f- q1:8.q
            unimplemented  {vnmls.f64.F64 d3, d1, d5}
            q1:8.q = q1:8.q f- q2.q
            
            if (r0_1 == 1)
                q2.q = -0x4180000000000000
                unimplemented  {vcmpe.f64.F64 d1, d4}
                unimplemented  {vmrs apsr_nzcv, fpscr}
                
                if (r0_1 - 1 s>= 0)
                    q0:8.q = q0:8.q f- q1:8.q
                    q0:8.q = q0:8.q f+ q0:8.q
                    q0:8.q = q0:8.q f+ 0.0078125
                else
                    q0.q = q0:8.q f+ 3.0517578125e-05
                    q0.q = q1:8.q f- q0.q
                    q0:8.q = -0x4000000000000000
                    q0:8.q = q0.q f* q0:8.q
            else if (r0_1 != 0xffffffff)
                q1.q = (0x3ff00000 + (r0_1 << 0x14)):0
                
                if (r0_1 + 1 u< 0x3a)
                    if (r0_1 s> 0x13)
                        q2.q = (0x3ff00000 - (r0_1 << 0x14)):0
                        q1:8.q = q1:8.q f+ q2.q
                        q0:8.q = q0:8.q f- q1:8.q
                        q0.q = q0:8.q f+ 0.0078125
                    else
                        q0.q = q1:8.q f- q0:8.q
                        q0:8.q = (0x3ff00000 - (0x200000 u>> r0_1)):0
                        q0.q = q0:8.q f- q0.q
                    
                    q0:8.q = q0.q f* q1.q
                else
                    q0:8.q = q0:8.q f- q1:8.q
                    q0.q = q0:8.q f+ 0.0078125
                    q0:8.q = q0.q f+ q0.q
                    q1:8.q = 0
                    q0.q = q0.q f* q1.q
                    q0:8.q = q0:8.q f* 0.0
                    
                    if (r0_1 == 0x400)
                        q0.q = q0:8.q
                    
                    q0:8.q = q0.q f+ -0.0078125
            else
                q0.q = q0:8.q f- q1:8.q
                q0:8.q = -0x4100000000000000
                unimplemented  {vmla.f64.F64 d1, d0, d2}
    else
        q0:8.q = data_1e40e0
        q1.q = data_1e40e0
        q0:8.q = q0:8.q f+ q0.q
        q1.q = q1.q f+ q0.q
        q0:8.q = q0:8.q f- q1.q
        q0:8.q = q0.q f- q0:8.q
else
    bool cond:0_1 = r3 - 0x40862e42 s>= 0
    
    if (r3 u< 0x40862e42)
    label_1a6b54:
        q0:8.q = 0xc2f8f359
        q0:8.q = q0.q f+ 1.6161357275175407e-314
        unimplemented  {vcmpe.f64.F64 d1, #0}
        unimplemented  {vmrs apsr_nzcv, fpscr}
        
        if (cond:0_1 || r2 == 0)
            goto label_1a6b6e
        
        q0:8.q = -0x4080000000000000
    else
        cond:0_1 = r3 - 0x7ff00000 s>= 0
        
        if (r3 u< 0x7ff00000)
            q0:8.q = 0xfefa39ef
            unimplemented  {vcmpe.f64.F64 d0, d1}
            unimplemented  {vmrs apsr_nzcv, fpscr}
            
            if (r3 s<= 0x7ff00000)
                goto label_1a6b54
            
            q0.q = data_1e40e0
            q0:8.q = data_1e40e0
            q0:8.q = q0.q f* q0:8.q
        else
            q0:8.q = q0.q f+ q0.q
            q1.q = -0x4080000000000000
            
            if (r2 == 0)
                q1.q = q0.q
            
            if ((arg1 | (arg2 & 0xfffff)) == 0)
                q0:8.q = q1.q
int32_t result
int32_t r1_3
r1_3:result = q0:8.q
return result
