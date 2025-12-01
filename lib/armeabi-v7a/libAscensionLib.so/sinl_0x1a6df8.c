// 函数: sinl
// 地址: 0x1a6df8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int128_t q0
q0:8.q = arg2:arg1
int32_t r1 = *__stack_chk_guard
int32_t r1_1 = arg2 & 0x7fffffff

if (r1_1 u<= 0x3fe921fb)
    q0.d = fconvert.d(q0:8.q)
    int32_t result
    
    if (q0.d != 0 || r1_1 u>= 0x3e500000)
        int32_t var_48_1 = 0
        result = sub_1a7cd8(arg1, arg2, 0)
        
        if (*__stack_chk_guard == r1)
            return result
    else
    label_1a70ae:
        
        if (*__stack_chk_guard == r1)
            int32_t r1_14
            r1_14:result = q0:8.q
            return result
    __stack_chk_fail()
    noreturn

if (r1_1 u< 0x7ff00000)
    int32_t r0_7
    int32_t r1_11
    int32_t r0_2
    int32_t r1_8
    int128_t q1
    
    if (r1_1 u> 0x400f6a7a)
        if (r1_1 u<= 0x401c463b)
            if (r1_1 u<= 0x4015fdbc)
                if (r1_1 == 0x4012d97c)
                    goto label_1a6f34
                
                if (arg2 s< 1)
                    q0.q = 0x7f300000
                    q1.q = q0:8.q f+ 1.054263045560139e-314
                    q0:8.q = 0xa79394ca
                    goto label_1a7064
                
                q0.q = 0x7f300000
                q1.q = q0:8.q f+ 1.054263045560139e-314
                q0:8.q = 0xa79394ca
                goto label_1a7000
            
            if (r1_1 == 0x401921fb)
                goto label_1a6f34
            
            if (arg2 s< 1)
                q0.q = 0x21fb5440
                q1.q = q0:8.q f+ 2.8167632656459547e-315
                q0:8.q = 0xb4611a62
            else
                q0.q = 0x21fb5440
                q1.q = q0:8.q f+ 2.8167632656459547e-315
                q0:8.q = 0xb4611a62
            
            q0.q = q1.q f+ q0:8.q
            q1.q = q1.q f- q0.q
            q0:8.q = q1.q f+ q0:8.q
            goto label_1a7096
        
        if (r1_1 u<= 0x413921fa)
            goto label_1a6f34
        
        q0:8.q = 0
        q0.q = (r1_1 - ((0xfffffbea + (r1_1 u>> 0x14)) << 0x14)):arg1
        int32_t i = 0
        void var_30
        
        while (i != 0x10)
            q1.d = fconvert.d(q0.q)
            void* r3_3 = &var_30 + i
            i += 8
            q1.q = fconvert.s(q1.d)
            q0.q = q0.q f- q1.q
            q0.q = q0.q f* q0:8.q
            *r3_3 = q1.q
        
        int32_t var_20
        int32_t* r0 = &var_20
        int32_t i_2 = 4
        var_20 = q0.q
        int32_t i_1
        
        do
            q0.q = *r0
            r0 -= 8
            i_1 = i_2
            i_2 -= 1
            unimplemented  {vcmp.f64.F64 d0, #0}
            unimplemented  {vmrs apsr_nzcv, fpscr}
        while (i_1 == 1)
        int32_t var_40
        int128_t q4
        int128_t q5
        int128_t q6
        int128_t q7
        r0_2, q0 =
            sub_1a7708(&var_30, &var_40, 0xfffffbea + (r1_1 u>> 0x14), i_2, q4, q5, q6, q7, 1)
        q0.q = var_40
        int32_t var_38
        
        if (arg2 s<= 0xffffffff)
            q0:8.q = var_38
            r0_2 = 0 - r0_2
            q0.q = fneg(q0.q)
            q0:8.q = fneg(q0:8.q)
        else
            q0:8.q = var_38
    label_1a6fd2:
        int32_t r0_5 = r0_2 & 3
        
        if (r0_5 == 2)
        label_1a7042:
            int32_t r0_8
            int32_t r1_9
            r1_9:r0_8 = q0.q
            int32_t r2_13
            int32_t r3_6
            r3_6:r2_13 = q0:8.q
            int32_t var_48_2 = 1
            r0_7, r1_8, q0 = sub_1a7cd8(r0_8, r1_9, r2_13)
            r1_11 = r1_8 ^ 0x80000000
        else
            if (r0_5 == 1)
                goto label_1a7070
            
            if (r0_5 != 0)
                goto label_1a700c
            
        label_1a7096:
            int32_t r0_10
            int32_t r1_12
            r1_12:r0_10 = q0.q
            int32_t r2_15
            int32_t r3_8
            r3_8:r2_15 = q0:8.q
            int32_t var_48_3 = 1
            r0_7, r1_11, q0 = sub_1a7cd8(r0_10, r1_12, r2_15)
    else
        if ((arg2 & 0xfffff) == &(*__elf_hash_table.chains)[0x68b]:3)
        label_1a6f34:
            q0.q = 0x6dc9c883
            q1.q = 0
            unimplemented  {vmla.f64.F64 d2, d1, d0}
            q0.q = 0
            q1:8.q = 0.0 + 0.0
            q0.q = 0x54400000
            double q2
            q2.d = fconvert.d(q1:8.q)
            unimplemented  {vmla.f64.F64 d1, d3, d0}
            q0.q = 0x1a626331
            q1.q = q1:8.q f* 2.1870089377310881e-315
            q0.q = q0:8.q f- q1.q
            int32_t r0_3
            int32_t r2_8
            r2_8:r0_3 = q0.q
            r0_2 = q2.d
            
            if ((r1_1 u>> 0x14) - (r2_8 u>> 0x14 & 0x7ff) s>= 0x11)
                q0.q = 0x1a600000
                q0.q = q1:8.q f* 2.1862358979183226e-315
                q2 = q0:8.q f- q0.q
                q0:8.q = q0:8.q f- q2
                q1.q = q0:8.q f- q0.q
                q0.q = 0x198a2e03
                unimplemented  {vnmls.f64.F64 d2, d3, d0}
                q0.q = q2 f- q1.q
                int32_t r2_10
                int32_t r3_4
                r3_4:r2_10 = q0.q
                
                if ((r1_1 u>> 0x14) - (r3_4 u>> 0x14 & 0x7ff) s< 0x32)
                    q0:8.q = q2
                else
                    q0.q = 0x2e000000
                    q0.q = q1:8.q f* 3.8129611868907237e-315
                    q0:8.q = q2 f- q0.q
                    q1.q = q2 f- q0:8.q
                    q1.q = q1.q f- q0.q
                    q0.q = 0x252049c1
                    unimplemented  {vnmls.f64.F64 d2, d3, d0}
                    q0.q = q0:8.q f- q1.q
            
            q0:8.q = q0:8.q f- q0.q
            q0:8.q = q0:8.q f- q1.q
            goto label_1a6fd2
        
        if (r1_1 u> 0x4002d97c)
            if (arg2 s< 1)
                q0.q = 0x21fb5440
                q1.q = q0:8.q f+ 2.8167632656459547e-315
                q0:8.q = 0xb4611a62
            else
                q0.q = 0x54400000
                q1.q = q0:8.q f+ 6.983521304250945e-315
                q0:8.q = 0x1a626331
            
            q0.q = q1.q f+ q0:8.q
            q1.q = q1.q f- q0.q
            q0:8.q = q1.q f+ q0:8.q
            goto label_1a7042
        
        if (arg2 s< 1)
            q0.q = 0x54400000
            q1.q = q0:8.q f+ 6.983521304250945e-315
            q0:8.q = 0x1a626331
        label_1a7000:
            q0.q = q1.q f+ q0:8.q
            q1.q = q1.q f- q0.q
            q0:8.q = q1.q f+ q0:8.q
        label_1a700c:
            int32_t r0_6
            int32_t r1_7
            r1_7:r0_6 = q0.q
            r0_7, r1_8, q0 = sub_1a7660(r0_6, r1_7)
            r1_11 = r1_8 ^ 0x80000000
        else
            q0.q = 0x21fb5440
            q1.q = q0:8.q f+ 2.8167632656459547e-315
            q0:8.q = 0xb4611a62
        label_1a7064:
            q0.q = q1.q f+ q0:8.q
            q1.q = q1.q f- q0.q
            q0:8.q = q1.q f+ q0:8.q
        label_1a7070:
            int32_t r0_9
            int32_t r1_10
            r1_10:r0_9 = q0.q
            r0_7, r1_11, q0 = sub_1a7660(r0_9, r1_10)
    q0:8.q = r1_11:r0_7
else
    q0:8.q = q0:8.q f- q0:8.q

goto label_1a70ae
