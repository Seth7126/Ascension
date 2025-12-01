// 函数: sub_db934
// 地址: 0xdb934
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r7
int32_t var_18 = r7
int32_t r6
int32_t var_1c = r6
int32_t r5
int32_t var_20 = r5
int32_t r4
int32_t var_24 = r4
unimplemented  {vpush {d8, d9}}
int32_t r6_1 = *(arg1 + 0x1c)
int32_t r0

if (r6_1 != 0)
    r0 = *(arg1 + 0xc)

int32_t r5_1

if (r6_1 == 0 || *(r0 + (r6_1 << 4) - 8) != 0)
    int32_t r8 = *(arg1 + 0x10)
    
    if (r8 != &data_1d1540)
        unimplemented  {vmov.f64 d8, #1.000000e+00}
        int32_t r0_1 = r6_1 + 1
        r5_1 = r6_1
        
        while (true)
            int32_t r7_1 = r0_1
            int32_t var_30
            int32_t var_2c
            void* const r0_3
            double q0
            
            if (r0_1 - 1 u>= r6_1)
                q0.d = r7_1
                unimplemented  {vcvt.f64.s32 d9, s0}
                var_30.q = arg3:8.q f+ arg3.q
                int32_t r1_5 = var_2c + var_30
                int32_t r0_5
                
                if (r1_5 s<= 0xffffffff)
                    r0_5 = r1_5 * 2
                    
                    if (r1_5 != neg.d(r1_5))
                        r0_5 = 0 - r1_5
                else
                    r0_5 = r1_5
                
                r0_3 = r8 + (__aeabi_idivmod(r0_5, 
                    (1 | 0xffffffff << zx.d(*(arg1 + 7))) ^ 0xfffffffe, 0xffffffff) << 5)
                
                while (true)
                    int32_t r1_10 = *(r0_3 + 0x18)
                    
                    if (r1_10 == 3)
                        *(r0_3 + 0x10)
                        unimplemented  {vcmp.f64 d0, d9}
                        unimplemented  {vmrs apsr_nzcv, fpscr}
                        
                        if (r1_10 == 3)
                            break
                    
                    r0_3 = *(r0_3 + 0x1c)
                    
                    if (r0_3 == 0)
                        r0_3 = &data_1d13d0
                        break
            else
                r0_3 = *(arg1 + 0xc) + ((r0_1 - 1) << 4)
            
            if (*(r0_3 + 8) == 0)
                if (r7_1 - r5_1 u>= 2)
                    do
                        int32_t r1_20 = r7_1 + r5_1
                        uint32_t r10_1 = r1_20 u>> 1
                        void* const r0_14
                        
                        if (0xffffffff + (r1_20 u>> 1) u>= r6_1)
                            q0.d = r10_1
                            unimplemented  {vcvt.f64.s32 d9, s0}
                            var_30.q = arg3:8.q f+ arg3.q
                            int32_t r1_23 = var_2c + var_30
                            int32_t r0_16
                            
                            if (r1_23 s<= 0xffffffff)
                                r0_16 = r1_23 * 2
                                
                                if (r1_23 != neg.d(r1_23))
                                    r0_16 = 0 - r1_23
                            else
                                r0_16 = r1_23
                            
                            r0_14 = r8 + (__aeabi_idivmod(r0_16, 
                                (1 | 0xffffffff << zx.d(*(arg1 + 7))) ^ 0xfffffffe, 0xfffffffe) << 5)
                            
                            while (true)
                                int32_t r1_28 = *(r0_14 + 0x18)
                                
                                if (r1_28 == 3)
                                    *(r0_14 + 0x10)
                                    unimplemented  {vcmp.f64 d0, d9}
                                    unimplemented  {vmrs apsr_nzcv, fpscr}
                                    
                                    if (r1_28 == 3)
                                        break
                                
                                r0_14 = *(r0_14 + 0x1c)
                                
                                if (r0_14 == 0)
                                    r0_14 = &data_1d13d0
                                    break
                        else
                            r0_14 = *(arg1 + 0xc) + ((0xffffffff + (r1_20 u>> 1)) << 4)
                        
                        if (*(r0_14 + 8) != 0)
                            r5_1 = r10_1
                        else
                            r7_1 = r10_1
                    while (r7_1 - r5_1 u> 1)
                
                break
            
            r0_1 = r7_1 << 1
            r5_1 = r7_1
            
            if (r0_1 u>= 0x7ffffffe)
                int32_t r9_1 = 1
                void* const r0_8
                
                do
                    if (r9_1 - 1 u>= r6_1)
                        q0.d = r9_1
                        unimplemented  {vcvt.f64.s32 d9, s0}
                        var_30.q = arg3:8.q f+ arg3.q
                        int32_t r1_12 = var_2c + var_30
                        int32_t r0_10
                        
                        if (r1_12 s<= 0xffffffff)
                            r0_10 = r1_12 * 2
                            
                            if (r1_12 != neg.d(r1_12))
                                r0_10 = 0 - r1_12
                        else
                            r0_10 = r1_12
                        
                        r0_8 = r8 + (__aeabi_idivmod(r0_10, 
                            (1 | 0xffffffff << zx.d(*(arg1 + 7))) ^ 0xfffffffe, 1) << 5)
                        
                        while (true)
                            int32_t r1_17 = *(r0_8 + 0x18)
                            
                            if (r1_17 == 3)
                                *(r0_8 + 0x10)
                                unimplemented  {vcmp.f64 d0, d9}
                                unimplemented  {vmrs apsr_nzcv, fpscr}
                                
                                if (r1_17 == 3)
                                    break
                            
                            r0_8 = *(r0_8 + 0x1c)
                            
                            if (r0_8 == 0)
                                r0_8 = &data_1d13d0
                                break
                    else
                        r0_8 = *(arg1 + 0xc) + ((r9_1 - 1) << 4)
                    
                    r9_1 += 1
                while (*(r0_8 + 8) != 0)
                break
else if (r6_1 u>= 2)
    r5_1 = 0
    
    do
        int32_t r1_18 = r5_1 + r6_1
        int32_t r2_1 = r1_18 u>> 1
        
        if (*(r0 + (r2_1 << 4) - 8) != 0)
            r5_1 = r2_1
        else
            r6_1 = r1_18 u>> 1
    while (r6_1 - r5_1 u> 1)
unimplemented  {vpop {d8, d9}}
jump(arg2)
