// 函数: sub_db070
// 地址: 0xdb070
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

while (true)
    void* sp
    int32_t lr
    *(sp - 4) = lr
    *(sp - 8) = arg11
    *(sp - 0xc) = arg10
    *(sp - 0x10) = arg9
    *(sp - 0x14) = arg8
    *(sp - 0x18) = arg7
    *(sp - 0x1c) = arg6
    *(sp - 0x20) = arg5
    *(sp - 0x24) = arg4
    unimplemented  {vpush {d8}}
    *(sp - 0x34) = *__stack_chk_guard
    int32_t r0_1 = arg3[2]
    int128_t q0
    
    if (r0_1 == 3)
        q0.q = *arg3
        unimplemented  {vcmpe.f64 d0, d0}
        unimplemented  {vmrs apsr_nzcv, fpscr}
        
        if (add_overflow(r0_1, 0xfffffffd))
            sub_c89f0(arg1, "table index is NaN", arg3)
            noreturn
    else if (r0_1 == 0)
        sub_c89f0(arg1, "table index is nil", arg3)
        noreturn
    
    *(sp - 0xb4) = arg2
    int32_t* r0_4
    r0_4, q0 = sub_db4d8(arg2, arg3)
    int32_t* r7 = r0_4
    
    if (r7 != &data_1d1540 && r7[2] == 0)
    label_db43c:
        void* r1_20 = *(sp - 0xb4)
        int32_t r0_32 = *arg3
        r7[5] = arg3[1]
        r7[4] = r0_32
        r7[6] = arg3[2]
        
        if ((zx.d(arg3[2].b) & 0x40) != 0 && (zx.d(*(*arg3 + 5)) & 3) != 0
                && (zx.d(*(r1_20 + 5)) & 4) != 0)
            sub_cafb8(arg1, r1_20)
        
        goto label_db480
    
    void* r0_6 = *(sp - 0xb4)
    int32_t* r8 = *(r0_6 + 0x10)
    int32_t* r1_1 = *(r0_6 + 0x14)
label_db10c:
    
    if (r1_1 u> r8)
        int32_t* r4 = r1_1 - 0x20
        *(r0_6 + 0x14) = r4
        bool cond:0_1 = *(r1_1 - 8) != 0
        r1_1 = r4
        
        if (cond:0_1)
            goto label_db10c
        
        void* r0_7 = sub_db4d8(r0_6, &r7[4])
        
        if (r0_7 == r7)
            r4[7] = r7[7]
            r7[7] = r4
            r7 = r4
        else
            void* r1_4
            
            do
                r1_4 = r0_7
                r0_7 = *(r0_7 + 0x1c)
            while (r0_7 != r7)
            
            *(r1_4 + 0x1c) = r4
            int32_t r2 = r7[1]
            int32_t r3_1 = r7[2]
            int32_t r6 = r7[3]
            *r4 = *r7
            r4[1] = r2
            r4[2] = r3_1
            r4[3] = r6
            int32_t r2_1 = r7[5]
            int32_t r3_2 = r7[6]
            int32_t r6_1 = r7[7]
            r4[4] = r7[4]
            r4[5] = r2_1
            r4[6] = r3_2
            r4[7] = r6_1
            r7[2] = 0
            r7[7] = 0
        
        goto label_db43c
    
    *(sp - 0xb8) = arg1
    __aeabi_memclr8(sp - 0xa8, 0x7c)
    void* r12_1 = *(sp - 0xb4)
    int32_t lr_1 = 0
    int32_t r4_2 = 1
    int32_t r1_7 = 1
    int32_t i = 0
    int32_t r5_1 = *(r12_1 + 0x1c)
    
    do
        int32_t r0_11 = r1_7
        
        if (r1_7 s> r5_1)
            r0_11 = r5_1
            
            if (r4_2 s> r5_1)
                break
        
        int32_t r6_2 = 0
        
        if (r4_2 s<= r0_11)
            r6_2 = 0
            int32_t r3_4 = r4_2
            bool cond:4_1
            
            do
                r4_2 = r3_4 + 1
                
                if (*(*(r12_1 + 0xc) - 8 + (r3_4 << 4)) != 0)
                    r6_2 += 1
                
                cond:4_1 = r3_4 s< r0_11
                r3_4 = r4_2
            while (cond:4_1)
        
        lr_1 += r6_2
        r1_7 <<= 1
        *(sp - 0xa8 + (i << 2)) += r6_2
        i += 1
    while (i u< 0x1f)
    
    uint32_t r0_15 = zx.d(*(r12_1 + 7))
    int128_t q4
    q4.q = 0x4338000000000000
    int32_t r3_6 = 0
    int32_t r9 = 1 + (0xffffffff << (r0_15 & 0xff))
    int32_t r10_1 = 0xfffffff8 - (0xffffffff << r0_15 << 5)
    int32_t r6_3 = 0
    int32_t r7_2 = lr_1
    
    while (true)
        void* r0_17 = r8 + r10_1
        
        if (*(r0_17 - 0x10) != 0)
            int32_t r2_2 = *(r8 + r10_1)
            int32_t r1_9 = 0
            
            if (r2_2 == 3)
                q0.q = *(r0_17 - 8)
                q0:8.q = q0.q f+ 6755399441055744.0
                *(sp - 0xb0) = q0:8.q
                int32_t r0_18 = *(sp - 0xb0)
                q0:8.d = r0_18
                unimplemented  {vcvt.f64.s32 d1, s2}
                unimplemented  {vcmp.f64 d0, d1}
                unimplemented  {vmrs apsr_nzcv, fpscr}
                
                if (r2_2 == 3 && (r0_18 == 0x40000000 || r0_18 - 1 u< 0x3fffffff))
                    int32_t r0_19 = sub_d2814(r0_18)
                    r12_1 = *(sp - 0xb4)
                    lr_1 = r7_2
                    *(sp - 0xa8 + (r0_19 << 2)) += 1
                    r1_9 = 1
            
            r6_3 += r1_9
            r3_6 += 1
        
        if (r9 == 0)
            break
        
        r9 += 1
        r8 = *(r12_1 + 0x10)
        r10_1 -= 0x20
    
    int32_t r0_20 = arg3[2]
    int32_t r6_4 = r6_3 + lr_1
    int32_t r8_1 = 0
    int32_t r1_13 = 0
    
    if (r0_20 == 3)
        q0.q = *arg3
        r1_13 = 0
        q0:8.q = q0.q f+ 6755399441055744.0
        *(sp - 0xb0) = q0:8.q
        int32_t r0_21 = *(sp - 0xb0)
        q0:8.d = r0_21
        unimplemented  {vcvt.f64.s32 d1, s2}
        unimplemented  {vcmp.f64 d0, d1}
        unimplemented  {vmrs apsr_nzcv, fpscr}
        
        if (r0_20 == 3)
            r1_13 = 0
            
            if (r0_21 == 0x40000000 || r0_21 - 1 u< 0x3fffffff)
                int32_t r0_22 = sub_d2814(r0_21)
                r12_1 = *(sp - 0xb4)
                lr_1 = r7_2
                *(sp - 0xa8 + (r0_22 << 2)) += 1
                r1_13 = 1
    
    int32_t r0_23 = r6_4 + r1_13
    void* r5_3 = sp - 0xa8
    int32_t r2_7 = 0
    
    if (r0_23 s>= 1)
        int32_t r1_16 = 1
        int32_t r6_5 = 0
        r2_7 = 0
        r8_1 = 0
        int32_t r3_7 = 0
        
        do
            int32_t r7_3 = *r5_3
            
            if (r7_3 s>= 1)
                r3_7 += r7_3
                
                if (r3_7 s> r6_5)
                    r2_7 = r1_16
                    r8_1 = r3_7
            
            if (r3_7 == r0_23)
                break
            
            r6_5 = r1_16 & 0x7fffffff
            r5_3 += 4
            r1_16 <<= 1
        while (r6_5 s< r0_23)
    
    int32_t* r6_6 = *(sp - 0xb8)
    sub_daa54(r6_6, r12_1, r2_7, lr_1 + r3_6 + 1 - r8_1, r8_1)
    
    if (sub_db788(r12_1, arg3, r3_6, q4) != &data_1d13d0)
    label_db480:
        
        if (*__stack_chk_guard != *(sp - 0x34))
            __stack_chk_fail()
            noreturn
        
        unimplemented  {vpopeq {d8}}
        *(sp - 0x2c)
        *(sp - 0x28)
        *(sp - 0x24)
        *(sp - 0x20)
        *(sp - 0x1c)
        *(sp - 0x18)
        *(sp - 0x14)
        *(sp - 0x10)
        jump(*(sp - 0xc))
    
    if (*__stack_chk_guard != *(sp - 0x34))
        __stack_chk_fail()
        noreturn
    
    arg1 = r6_6
    arg2 = *(sp - 0xb4)
    unimplemented  {vpop {d8}}
    arg4 = *(sp - 0x2c)
    arg5 = *(sp - 0x28)
    arg6 = *(sp - 0x24)
    arg7 = *(sp - 0x20)
    arg8 = *(sp - 0x1c)
    arg9 = *(sp - 0x18)
    arg10 = *(sp - 0x14)
    arg11 = *(sp - 0x10)
    lr = *(sp - 0xc)
    sp -= 8
