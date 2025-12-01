// 函数: logl
// 地址: 0x1a5d08
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int128_t q0
q0.q = arg2:arg1
int32_t r0_2

if (arg2 s>= 0x100000)
    r0_2 = 0
label_1a5d38:
    
    if (arg2 s< 0x7ff00000)
        int32_t r2_2
        int32_t r3_1
        r2_2:r3_1 = q0.q
        int32_t r2_4 = arg2 & 0xfffff
        q0.q = -0x4080000000000000
        int32_t r1_1 = (arg2 + 2) & 0xfffff
        q0:8.q = (0x3ff00000 ^ (((0x95f64 + r2_4) & 0x100000) + r2_4)):r3_1
        q0.q = q0:8.q f+ -0.0078125
        int128_t q1
        
        if (r1_1 u> 2)
            q0:8.q = 0x4000000000000000
            q0:8.q = q0.q f+ 2.0
            q0:8.q = q0.q f/ q0:8.q
            q1.q = q0:8.q f* q0:8.q
            q1:8.q = 0xdf3e5244
            unimplemented  {vmla.f64.F64 d5, d4, d3}
            q1:8.q = 0x94229359
            unimplemented  {vmla.f64.F64 d3, d4, d5}
            int128_t q3
            q3.q = 0xd078c69f
            q3:8.q = 0x1d8e78af
            unimplemented  {vmla.f64.F64 d7, d4, d6}
            unimplemented  {vmla.f64.F64 d5, d4, d3}
            q3.q = 0x9997fa04
            unimplemented  {vmla.f64.F64 d6, d4, d7}
            q1:8.q = q1.q f* 7.0733196078913893e-315
            unimplemented  {vmla.f64.F64 d3, d4, d6}
            q1.d = r0_2 + (arg2 s>> 0x14) + ((0x95f64 + r2_4) u>> 0x14) - 0x3ff
            q1.q = fconvert.s(q1.d)
            
            if ((("es39CStateProcessDestroyEvenOrOddConstructsE" - r2_4) | (r2_4 - 0x6147a)) s>= 1)
                double q2 = q0.q f* q0.q f* 3.0517578125e-05
                
                if (r0_2 + (arg2 s>> 0x14) + ((0x95f64 + r2_4) u>> 0x14) == 0x3ff)
                    q1.q = q2 f+ q1:8.q
                    unimplemented  {vmls.f64.F64 d4, d1, d2}
                    q0.q = q0.q f- q2
                else
                    q1:8.q = q2 f+ q1:8.q
                    q0:8.q = q0:8.q f* q1:8.q
                    q1:8.q = 0x39ef3579
                    unimplemented  {vmla.f64.F64 d1, d2, d3}
                    q0:8.q = q2 f- q0:8.q
                label_1a5e82:
                    q0.q = q0:8.q f- q0.q
                    q0:8.q = 0x2e42fee0
                    unimplemented  {vnmls.f64.F64 d0, d2, d1}
            else if (r0_2 + (arg2 s>> 0x14) + ((0x95f64 + r2_4) u>> 0x14) == 0x3ff)
                q1.q = q0.q f- q1:8.q
                unimplemented  {vmls.f64.F64 d0, d1, d2}
            else
                q1:8.q = q0.q f- q1:8.q
                unimplemented  {vmla.f64.F64 d4, d1, d3}
                q0.q = q1.q f* 4.8022099019037595e-315 f- q0.q
                q0:8.q = 0x2e42fee0
                unimplemented  {vnmls.f64.F64 d0, d2, d1}
        else
            unimplemented  {vcmp.f64.F64 d0, #0}
            unimplemented  {vmrs apsr_nzcv, fpscr}
            
            if (r1_1 != 2)
                q0:8.q = 0x3f00000000000000
                q1.q = 0x55555555
                unimplemented  {vmla.f64.F64 d1, d0, d2}
                q1.q = q0.q f* q0.q
                q0:8.q = q1.q f* 3.0517578125e-05
                
                if (r0_2 + (arg2 s>> 0x14) + ((0x95f64 + r2_4) u>> 0x14) != 0x3ff)
                    q1.d = r0_2 + (arg2 s>> 0x14) + ((0x95f64 + r2_4) u>> 0x14) - 0x3ff
                    q1:8.q = 0x39ef3579
                    q1.q = fconvert.s(q1.d)
                    unimplemented  {vmla.f64.F64 d1, d2, d3}
                    goto label_1a5e82
                
                q0.q = q0.q f- q0:8.q
            else if (r0_2 + (arg2 s>> 0x14) + ((0x95f64 + r2_4) u>> 0x14) == 0x3ff)
                q0.q = 0
            else
                q0.d = r0_2 + (arg2 s>> 0x14) + ((0x95f64 + r2_4) u>> 0x14) - 0x3ff
                q1.q = 0xfee00000
                q0:8.q = fconvert.s(q0.d)
                q0.q = 0x35793c76
                q0.q = q0:8.q f* 4.4324495767241345e-315
                unimplemented  {vmla.f64.F64 d0, d1, d2}
    else
        q0.q = q0.q f+ q0.q
else if ((arg1 | (arg2 & 0x7fffffff)) == 0)
    q0.q = 0
    q0:8.q = data_1f5b28
    q0.q = q0.q f/ q0:8.q
else
    if (arg2 s> 0xffffffff)
        q0:8.q = 0
        q0.q = q0.q f* 0.0
        int32_t r0_1
        arg2:r0_1 = q0.q
        r0_2 = 0xffffffca
        goto label_1a5d38
    
    q0.q = q0.q f- q0.q
    q0:8.q = 0
    q0.q = q0.q f/ q0:8.q
int32_t result
int32_t r1_4
r1_4:result = q0.q
return result
