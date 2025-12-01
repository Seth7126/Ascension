// 函数: sub_d2950
// 地址: 0xd2950
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t x_1 = arg2
int32_t r0 = *__stack_chk_guard
uint32_t result = 0

if (strpbrk(arg1, "nN") == 0)
    char* endptr
    void* endptr_1
    
    if (strpbrk(arg1, "xX") == 0)
        strtod(arg1, &endptr)
        endptr_1 = endptr
    label_d2bf0:
        unimplemented  {vmov d0, r0, r1}
        *arg3 = arg4
        
        if (endptr_1 != arg1)
            if ((zx.d(*(zx.d(*endptr_1) + 0x1d12b5)) & 8) != 0)
                do
                    endptr_1 += 1
                while ((zx.d(*(zx.d(*endptr_1) + 0x1d12b5)) & 8) != 0)
                
                endptr = endptr_1
            
            int32_t temp0_1 = 0
            uint32_t i = endptr_1 - &arg1[x_1]
            
            while (i != 0)
                i u>>= 1
                temp0_1 += 1
            
            result = (0x20 - temp0_1) u>> 5
    else
        endptr = arg1
        char* r5_1 = arg1
        uint32_t r0_5
        
        do
            r0_5 = zx.d(*r5_1)
            r5_1 = &r5_1[1]
        while ((zx.d(*(r0_5 + 0x1d12b5)) & 8) != 0)
        
        int32_t r12_1
        
        if (r0_5 == 0x2b)
            r12_1 = 0
        else if (r0_5 != 0x2d)
            r5_1 -= 1
            r12_1 = 0
        else
            r12_1 = 1
        
        if (zx.d(*r5_1) == 0x30 && (zx.d(r5_1[1]) | 0x20) == 0x78)
            int32_t x = x_1
            endptr_1 = &r5_1[2]
            uint32_t r0_10 = zx.d(*endptr_1)
            uint32_t r6 = zx.d(*(r0_10 + 0x1d12b5))
            int32_t r2_3 = 0
            int32_t r3_1
            
            if ((r6 & 0x10) != 0)
                unimplemented  {vmov.f64 d0, #1.600000e+01}
                r3_1 = 0
                int128_t q1
                q1.q = 0
                
                do
                    int32_t r4_2 = r0_10 - 0x30
                    
                    if ((r6 & 2) == 0)
                        r4_2 = (r0_10 | 0x20) - 0x57
                    
                    void* r0_12 = &r5_1[r3_1]
                    r3_1 += 1
                    arg4:8.d = r4_2
                    unimplemented  {vcvt.f64.s32 d1, s2}
                    r0_10 = zx.d(*(r0_12 + 3))
                    r6 = zx.d(*(r0_10 + 0x1d12b5))
                    unimplemented  {vmla.f64 d1, d2, d0}
                    unimplemented  {vmov.f64 q1, #2.125000e+00}
                while ((r6 & 0x10) != 0)
                
                endptr_1 = &r5_1[r3_1 + 2]
                
                if (r0_10 == 0x2e)
                    goto label_d2ab4
                
                unimplemented  {vmov.f64 q0, #2.125000e+00}
            else
                arg4 = 0
                r3_1 = 0
                
                if (r0_10 == 0x2e)
                label_d2ab4:
                    uint32_t r0_13 = zx.d(*(endptr_1 + 1))
                    uint32_t r6_4 = zx.d(*(r0_13 + 0x1d12b5))
                    
                    if ((r6_4 & 0x10) != 0)
                        unimplemented  {vmov.f64 d2, #1.600000e+01}
                        r2_3 = 0
                        
                        do
                            int32_t r5_4 = r0_13 - 0x30
                            
                            if ((r6_4 & 2) == 0)
                                r5_4 = (r0_13 | 0x20) - 0x57
                            
                            void* r0_15 = endptr_1 + r2_3
                            r2_3 += 1
                            arg4.d = r5_4
                            unimplemented  {vcvt.f64.s32 d0, s0}
                            r0_13 = zx.d(*(r0_15 + 2))
                            r6_4 = zx.d(*(r0_13 + 0x1d12b5))
                            unimplemented  {vmla.f64 d0, d1, d2}
                            unimplemented  {vmov.f64 q0, #2.000000e+00}
                        while ((r6_4 & 0x10) != 0)
                        
                        endptr_1 = endptr_1 + r2_3 + 1
                    else
                        endptr_1 += 1
                        unimplemented  {vmov.f64 q0, #2.125000e+00}
                else
                    unimplemented  {vmov.f64 q0, #2.125000e+00}
            
            x_1 = x
            
            if ((r2_3 | r3_1) == 0)
                goto label_d2b68
            
            endptr = endptr_1
            uint32_t exp = zx.d(*endptr_1) | 0x20
            
            if (exp != 0x70)
                endptr = endptr_1
            else
                void* endptr_2 = endptr_1 + 1
                exp = zx.d(*endptr_2)
                
                if (exp == 0x2b)
                    endptr_2 = endptr_1 + 2
                else if (exp == 0x2d)
                    endptr_2 = endptr_1 + 2
                
                uint32_t exp_1 = zx.d(*endptr_2)
                
                if ((zx.d(*(exp_1 + 0x1d12b5)) & 2) != 0)
                    int32_t r6_8 = 0
                    
                    do
                        endptr_2 += 1
                        exp = zx.d(*endptr_2)
                        r6_8 = (exp_1 << 0xfffffffc s>> 0x18) + r6_8 * 0xa - 0x30
                        exp_1 = exp
                    while ((zx.d(*(exp + 0x1d12b5)) & 2) != 0)
                    
                    endptr_1 = endptr_2
                    x_1 = x
                    endptr = endptr_1
                else
                    x_1 = x
            
            unimplemented  {vneg.f64 d1, d0}
            
            if (r12_1 == 0)
                unimplemented  {vmoveq.f64 q0, #2.000000e+00}
            
            unimplemented  {vmov r0, r1, d1}
            ldexp(x, exp)
            goto label_d2bf0
        
    label_d2b68:
        result = 0
        *arg3 = 0
        *(arg3 + 4) = 0

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
