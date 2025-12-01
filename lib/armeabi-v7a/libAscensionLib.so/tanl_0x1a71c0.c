// 函数: tanl
// 地址: 0x1a71c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int128_t q0
q0.q = arg2:arg1
int32_t r1 = *__stack_chk_guard
int32_t r1_1 = arg2 & 0x7fffffff

if (r1_1 u<= 0x3fe921fb)
    q0:8.d = fconvert.d(q0.q)
    int32_t result
    
    if (q0:8.d != 0 || r1_1 u>= 0x3e400000)
        int32_t var_50_1 = 1
        result = sub_1a7d88(arg1, arg2, 0, 0)
        
        if (*__stack_chk_guard == r1)
            return result
    else
    label_1a741e:
        
        if (*__stack_chk_guard == r1)
            int32_t r1_10
            r1_10:result = q0.q
            return result
    __stack_chk_fail()
    noreturn

if (r1_1 u< 0x7ff00000)
    int32_t r0
    int128_t q1
    
    if (r1_1 u<= 0x400f6a7a)
        if ((arg2 & 0xfffff) != &(*__elf_hash_table.chains)[0x68b]:3)
            if (r1_1 u> 0x4002d97c)
                if (arg2 s< 1)
                    q0:8.q = 0x54400000
                    r0 = 0xfffffffe
                    q1.q = 0x1a626331
                else
                    q0:8.q = 0x54400000
                    r0 = 2
                    q1.q = 0xb4611a62
            else if (arg2 s< 1)
                q0:8.q = 0x21fb5440
                r0 = 0xffffffff
                q1.q = 0xb4611a62
            else
                q0:8.q = 0x21fb5440
                r0 = 1
                q1.q = 0x1a626331
            
            goto label_1a73ec
        
    label_1a72f6:
        q0:8.q = 0x5f306dc9
        q1.q = 0
        unimplemented  {vmla.f64.F64 d2, d0, d1}
        q0:8.q = 0
        q1:8.q = 0.0 + 0.0
        q0:8.q = 0x21fb5440
        double q2
        q2.d = fconvert.d(q1:8.q)
        unimplemented  {vmla.f64.F64 d0, d3, d1}
        q0:8.q = 0xb4611a62
        q1.q = q1:8.q f* 1.4951723987999167e-314
        q0:8.q = q0.q f- q1.q
        int32_t r0_3
        int32_t r2_8
        r2_8:r0_3 = q0:8.q
        r0 = q2.d
        
        if ((r1_1 u>> 0x14) - (r2_8 u>> 0x14 & 0x7ff) s>= 0x11)
            q0:8.q = 0xb4611a60
            q0:8.q = q1:8.q f* 1.4951723978117855e-314
            q2 = q0.q f- q0:8.q
            q0.q = q0.q f- q2
            q1.q = q0.q f- q0:8.q
            q0.q = 0x2e037073
            unimplemented  {vnmls.f64.F64 d2, d3, d0}
            q0:8.q = q2 f- q1.q
            int32_t r2_10
            int32_t r3_4
            r3_4:r2_10 = q0:8.q
            
            if ((r1_1 u>> 0x14) - (r3_4 u>> 0x14 & 0x7ff) s< 0x32)
                q0.q = q2
            else
                q0.q = 0x198a2e00
                q0:8.q = q1:8.q f* 2.1170028346938537e-315
                q0.q = q2 f- q0:8.q
                q1.q = q2 f- q0.q
                q1.q = q1.q f- q0:8.q
                q0:8.q = 0x839a2520
                unimplemented  {vnmls.f64.F64 d2, d3, d1}
                q0:8.q = q0.q f- q1.q
        
        q0.q = q0.q f- q0:8.q
        q0.q = q0.q f- q1.q
    else if (r1_1 u> 0x401c463b)
        if (r1_1 u<= 0x413921fa)
            goto label_1a72f6
        
        q0:8.q = 0
        q0.q = (r1_1 - ((0xfffffbea + (r1_1 u>> 0x14)) << 0x14)):arg1
        int32_t i = 0
        void var_38
        
        while (i != 0x10)
            q1.d = fconvert.d(q0.q)
            void* r3_3 = &var_38 + i
            i += 8
            q1.q = fconvert.s(q1.d)
            q0.q = q0.q f- q1.q
            q0.q = q0.q f* q0:8.q
            *r3_3 = q1.q
        
        int32_t var_28
        int32_t* r0_1 = &var_28
        int32_t i_2 = 4
        var_28 = q0.q
        int32_t i_1
        
        do
            q0.q = *r0_1
            r0_1 -= 8
            i_1 = i_2
            i_2 -= 1
            unimplemented  {vcmp.f64.F64 d0, #0}
            unimplemented  {vmrs apsr_nzcv, fpscr}
        while (i_1 == 1)
        int32_t var_48
        int128_t q4
        int128_t q5
        int128_t q6
        int128_t q7
        r0, q0 = sub_1a7708(&var_38, &var_48, 0xfffffbea + (r1_1 u>> 0x14), i_2, q4, q5, q6, q7, 1)
        q0:8.q = var_48
        int32_t var_40
        
        if (arg2 s<= 0xffffffff)
            q0.q = var_40
            r0 = 0 - r0
            q0:8.q = fneg(q0:8.q)
            q0.q = fneg(q0.q)
        else
            q0.q = var_40
    else
        if (r1_1 u<= 0x4015fdbc)
            if (r1_1 == 0x4012d97c)
                goto label_1a72f6
            
            if (arg2 s< 1)
                q0:8.q = 0xd97c7f30
                r0 = 0xfffffffd
                q1.q = 0xe91a793
            else
                q0:8.q = 0xd97c7f30
                r0 = 3
                q1.q = 0xa79394ca
            
            goto label_1a73ec
        
        if (r1_1 == 0x401921fb)
            goto label_1a72f6
        
        if (arg2 s< 1)
            q0:8.q = 0x54400000
            r0 = 0xfffffffc
            q1.q = 0x1a626331
        else
            q0:8.q = 0x21fb5440
            r0 = 4
            q1.q = 0x1a626331
        
    label_1a73ec:
        q0.q = q0.q f+ q0:8.q
        q0:8.q = q0.q f+ q1.q
        q0.q = q0.q f- q0:8.q
        q0.q = q0.q f+ q1.q
    int32_t r1_7
    int32_t r4_1
    r1_7:r4_1 = q0:8.q
    int32_t r2_12
    int32_t r3_5
    r3_5:r2_12 = q0.q
    int32_t var_50_2 = 1 - (2 & r0 << 1)
    int32_t r0_8
    int32_t r1_8
    r0_8, r1_8, q0 = sub_1a7d88(r4_1, r1_7, r2_12, r3_5)
    q0.q = r1_8:r0_8
else
    q0.q = q0.q f- q0.q

goto label_1a741e
