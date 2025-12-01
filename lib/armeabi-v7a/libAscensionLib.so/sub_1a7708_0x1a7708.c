// 函数: sub_1a7708
// 地址: 0x1a7708
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r7
int32_t var_8 = r7
int32_t r6
int32_t var_c = r6
int32_t r5
int32_t var_10 = r5
int32_t r4
int32_t var_14 = r4
int32_t r11
int32_t var_18 = r11
int32_t r10
int32_t var_1c = r10
int32_t r9
int32_t var_20 = r9
int32_t r8
int32_t var_24 = r8
int32_t* var_28 = &var_8
int64_t var_30 = arg5.q
int64_t var_38 = arg5:8.q
int64_t var_40 = arg6.q
int64_t var_48 = arg6:8.q
int64_t var_50 = arg7.q
int64_t var_58 = arg7:8.q
int64_t var_60 = arg8.q
int64_t var_68 = arg8:8.q
int32_t var_2d0
int32_t* sp = &var_2d0
int32_t (__convention("cdecl")* const var_2c4)() = __stack_chk_guard
int32_t i_13 = *(&data_1d53d8 + (arg9 << 2))
int32_t r0 = *__stack_chk_guard
int32_t r0_2 = __aeabi_idiv(arg3 - 3, 0x18)
int32_t r0_3 = r0_2 & not.d(r0_2 s>> 0x1f)
int32_t r0_5 = r0_3 + 1 - arg4
int128_t q0
q0.q = 0
int32_t i = 0
void* const var_2a8 = &data_1d53e8

for (; i s<= i_13 + arg4 - 1; i += 1)
    q0:8.q = q0.q
    
    if (r0_5 + i s>= 0)
        q0:8.d = *(&data_1d53e8 + (r0_5 << 2) + (i << 2))
        q0:8.q = fconvert.s(q0:8.d)

q0.q = 0
int32_t var_160[0x28]
void* r6_1 = &var_160[arg4 * 2] - 8
int32_t r1_2 = 0
int32_t r0_7 = r0_3 * -3
int32_t lr_2 = arg3 - 0x18 + (r0_7 << 3)
var_2d0 = r0_7 << 3
int32_t var_2a0[0x28]

while (r1_2 s<= i_13)
    q0:8.q = q0.q
    int32_t r2_1 = 0
    int64_t* r3_1 = arg1
    void* r0_9 = r6_1
    
    while (r2_1 s< arg4)
        *r0_9
        r0_9 -= 8
        *r3_1
        r3_1 = &r3_1[1]
        r2_1 += 1
        unimplemented  {vmla.f64.F64 d1, d3, d2}
    
    void* r0_10 = &var_2a0[r1_2 * 2]
    r6_1 += 8
    r1_2 += 1
    *r0_10 = q0:8.q

arg6:8.q = 0x3e00000000000000
void* const* var_2b4 = &var_2a8
arg7.q = -0x3f00000000000000
int32_t r0_13 = 0x17 - lr_2
int32_t i_9 = i_13
int32_t r0_14 = 0x18 - lr_2
int32_t var_2b0 = lr_2
arg5:8.q = 0x3f80000000000000
arg8.q = 0x3f00000000000000
arg5.q = 0
arg6.q = 0
arg7:8.q = 0
int32_t var_bc[0x14]
int32_t r1_11
int32_t r9_1
int32_t r10_2

while (true)
    int32_t i_1 = i_9
    q0.q = var_2a0[i_9 * 2]
    void* r0_16 = &var_2b4[i_9 * 2]
    int32_t (* r1_4)[0x14] = &var_bc
    
    while (i_1 s>= 1)
        q0:8.q = q0.q f* 0.0
        i_1 -= 1
        q0:8.d = fconvert.d(q0:8.q)
        q0:8.q = fconvert.s(q0:8.d)
        unimplemented  {vmla.f64.F64 d0, d1, d10}
        q0.d = fconvert.d(q0.q)
        int32_t r3_2 = q0.d
        q0.q = *r0_16
        r0_16 -= 8
        q0.q = q0.q f+ q0:8.q
        *r1_4 = r3_2
        r1_4 = &(*r1_4)[1]
    
    int32_t r0_17
    int32_t r1_5
    r1_5:r0_17 = q0.q
    int32_t r0_18
    int32_t r1_6
    r0_18, r1_6 = scalbn(var_2d0, r0_17)
    arg8:8.q = r1_6:r0_18
    q0.q = arg8:8.q f* arg6:8.q
    int32_t r0_20
    int32_t r1_8
    r0_20, r1_8 = floor()
    q0.q = r1_8:r0_20
    lr_2 = var_2b0
    unimplemented  {vmla.f64.F64 d15, d0, d12}
    q0.d = fconvert.d(arg8:8.q)
    int32_t r5_4 = q0.d
    q0.q = fconvert.s(q0.d)
    arg8:8.q = arg8:8.q f- q0.q
    bool n_2
    bool z_2
    bool v_1
    
    if (lr_2 s< 1)
        v_1 = add_overflow(lr_2, 0)
        
        if (lr_2 == 0)
            r1_11 = *(&var_bc[i_9] - 4) s>> 0x17
            goto label_1a78c0
        
        unimplemented  {vcmpe.f64.F64 d15, d14}
        unimplemented  {vmrs apsr_nzcv, fpscr}
        
        if (lr_2 s< 0 == v_1)
            r1_11 = 2
        label_1a78c4:
            int32_t var_2ac_1 = r1_11
            int32_t r0_23 = 0
            
            for (int32_t i_2 = 0; i_2 s< i_9; i_2 += 1)
                int32_t r2_4 = var_bc[i_2]
                
                if (r0_23 != 0)
                    var_bc[i_2] = 0xffffff - r2_4
                else if (r2_4 == 0)
                    r0_23 = 0
                else
                    r0_23 = 1
                    var_bc[i_2] = 0x1000000 - r2_4
            
            r1_11 = var_2ac_1
            r5_4 += 1
            void* r1_12
            
            if (lr_2 == 2)
                r1_12 = &var_bc[i_9]
                *(r1_12 - 4) &= 0x3fffff
                r1_11 = var_2ac_1
            else if (lr_2 == 1)
                r1_12 = &var_bc[i_9]
                *(r1_12 - 4) &= 0x7fffff
                r1_11 = var_2ac_1
            n_2 = r1_11 - 2 s< 0
            z_2 = r1_11 == 2
            v_1 = add_overflow(r1_11, 0xfffffffe)
            
            if (z_2)
                arg8:8.q = arg5:8.q f- arg8:8.q
                
                if (r0_23 != 0)
                    int32_t r0_27
                    int32_t r1_14
                    r0_27, r1_14 = scalbn()
                    q0.q = r1_14:r0_27
                    lr_2 = var_2b0
                    arg8:8.q = arg8:8.q f- q0.q
                
                r1_11 = 2
                n_2 = false
                z_2 = false
        else
            r1_11 = 0
            n_2 = false
            z_2 = true
    else
        void* r0_21 = &var_bc[i_9]
        int32_t r1_9 = *(r0_21 - 4)
        int32_t r2_3 = r1_9 s>> r0_14
        r5_4 += r2_3
        int32_t r1_10 = r1_9 - (r2_3 << r0_14)
        *(r0_21 - 4) = r1_10
        r1_11 = r1_10 s>> r0_13
    label_1a78c0:
        n_2 = r1_11 - 1 s< 0
        z_2 = r1_11 == 1
        v_1 = add_overflow(r1_11, 0xffffffff)
        
        if (n_2 == v_1)
            goto label_1a78c4
    
    unimplemented  {vcmp.f64.F64 d15, #0}
    unimplemented  {vmrs apsr_nzcv, fpscr}
    
    if (not(z_2))
        r10_2 = r5_4
        int32_t r0_30
        int32_t r1_26
        r0_30, r1_26 = scalbn()
        q0:8.q = 0
        q0.q = r1_26:r0_30
        unimplemented  {vcmpe.f64.F64 d0, d1}
        unimplemented  {vmrs apsr_nzcv, fpscr}
        int32_t r0_31
        
        if (n_2 == v_1)
            q0:8.q = q0.q f* 0.0
            r9_1 = arg9
            q0:8.d = fconvert.d(q0:8.q)
            r0_31 = q0:8.d
            q0:8.q = fconvert.s(q0:8.d)
            unimplemented  {vmla.f64.F64 d0, d1, d10}
            q0.d = fconvert.d(q0.q)
            var_bc[i_9] = q0.d
            i_9 += 1
        else
            q0.d = fconvert.d(q0.q)
            r9_1 = arg9
            r0_31 = q0.d
        
        var_bc[i_9] = r0_31
        break
    
    int32_t r0_28 = 0
    void var_c0
    
    for (int32_t i_3 = i_9; i_3 s> i_13; i_3 -= 1)
        r0_28 |= *(&var_c0 + (i_3 << 2))
    
    if (r0_28 != 0)
        r9_1 = arg9
        r10_2 = r5_4
        int32_t i_4
        
        do
            i_4 = *(&var_c0 + (i_9 << 2))
            i_9 -= 1
            lr_2 -= 0x18
        while (i_4 == 0)
        break
    
    void* r1_16 = &var_bc[i_13] - 4
    int32_t i_12 = i_9
    int32_t i_5
    
    do
        i_5 = *r1_16
        r1_16 -= 4
        i_12 += 1
    while (i_5 == 0)
    void* r6_3 = &var_160[(arg4 + i_9) * 2]
    
    while (i_9 s< i_12)
        int64_t* r5_5 = arg1
        q0.d = *(var_2a8 + ((r0_3 + i_9 + 1) << 2))
        q0.q = fconvert.s(q0.d)
        int32_t r3_8 = 0
        var_160[(i_9 + arg4) * 2] = q0.q
        void* r1_23 = r6_3
        q0.q = 0
        
        while (r3_8 s< arg4)
            q0:8.q = *r1_23
            r1_23 -= 8
            *r5_5
            r5_5 = &r5_5[1]
            r3_8 += 1
            unimplemented  {vmla.f64.F64 d0, d2, d1}
        
        void* r1_24 = &var_2a0[(i_9 + 1) * 2]
        r6_3 += 8
        i_9 += 1
        *r1_24 = q0.q
    
    i_9 = i_12

int32_t r0_33
int32_t r1_30
r0_33, r1_30 = scalbn()
q0.q = r1_30:r0_33
void* r0_34 = &var_2a0[i_9 * 2]
int32_t i_6 = i_9
void* r1_31 = r0_34

while (i_6 s> 0xffffffff)
    void* r3_9 = &var_bc[i_6]
    i_6 -= 1
    q0:8.d = *r3_9
    q0:8.q = fconvert.s(q0:8.d)
    q0:8.q = q0.q f* q0:8.q
    *r1_31 = q0:8.q
    r1_31 -= 8
    q0.q = q0.q f* 0.0

q0.q = 0
int32_t i_7 = i_9
int32_t var_200[0x2]

while (i_7 s>= 0)
    q0:8.q = q0.q
    int32_t r6_4 = i_9 - i_7
    int32_t r5_6 = 0
    int32_t* r2_14 = &data_1d54f0
    void* r1_32 = r0_34
    
    while (true)
        bool cond:4_1 = r5_6 s<= i_13
        
        if (r5_6 s<= i_13)
            cond:4_1 = r5_6 s<= r6_4
        
        if (not(cond:4_1))
            break
        
        *r1_32
        r1_32 += 8
        *r2_14
        r2_14 = &r2_14[2]
        r5_6 += 1
        unimplemented  {vmla.f64.F64 d1, d3, d2}
    
    r0_34 -= 8
    i_7 -= 1
    (&var_200)[r6_4][0] = q0:8.q

int32_t (__convention("cdecl")* const r3_10)()
int32_t var_1f8

if (r9_1 - 1 u< 2)
    r3_10 = var_2c4
    void* r0_37 = &(&var_200)[i_9]
    q0.q = 0
    int32_t i_8 = i_9
    
    while (i_8 s>= 0)
        q0:8.q = *r0_37
        r0_37 -= 8
        i_8 -= 1
        q0.q = q0.q f+ q0:8.q
    
    q0:8.q = fneg(q0.q)
    int32_t* r0_38 = &var_1f8
    int32_t r1_36 = 1
    
    if (r1_11 == 0)
        q0:8.q = q0.q
    
    *arg2 = q0:8.q
    q0:8.q = var_200[0]
    q0.q = q0:8.q f- q0.q
    
    while (r1_36 s<= i_9)
        q0:8.q = *r0_38
        r0_38 = &r0_38[2]
        r1_36 += 1
        q0.q = q0.q f+ q0:8.q
    
    q0:8.q = fneg(q0.q)
    
    if (r1_11 == 0)
        q0:8.q = q0.q
    
    arg2[2] = q0:8.q
else
    r3_10 = var_2c4
    
    if (r9_1 == 0)
        q0.q = 0
        void* r0_39 = &(&var_200)[i_9]
        
        while (i_9 s>= 0)
            q0:8.q = *r0_39
            r0_39 -= 8
            i_9 -= 1
            q0.q = q0.q f+ q0:8.q
        
        q0:8.q = fneg(q0.q)
        
        if (r1_11 == 0)
            q0:8.q = q0.q
        
        *arg2 = q0:8.q
    else if (r9_1 == 3)
        void* r0_36 = &(&var_200)[i_9]
        int32_t i_10 = i_9
        void* r1_34 = r0_36
        double q1
        
        while (i_10 s> 0)
            q0.q = *(r1_34 - 8)
            i_10 -= 1
            q0:8.q = *r1_34
            q1 = q0.q f+ q0:8.q
            q0.q = q0.q f- q1
            q0.q = q0:8.q f+ q0.q
            *(r1_34 - 8) = q1
            *r1_34 = q0.q
            r1_34 -= 8
        
        void* r1_35 = r0_36
        int32_t i_11 = i_9
        
        while (i_11 s> 1)
            q0.q = *(r1_35 - 8)
            i_11 -= 1
            q0:8.q = *r1_35
            q1 = q0.q f+ q0:8.q
            q0.q = q0.q f- q1
            q0.q = q0:8.q f+ q0.q
            *(r1_35 - 8) = q1
            *r1_35 = q0.q
            r1_35 -= 8
        
        q0.q = 0
        
        while (i_9 s>= 2)
            q0:8.q = *r0_36
            r0_36 -= 8
            i_9 -= 1
            q0.q = q0.q f+ q0:8.q
        
        q0:8.q = var_200[0]
        
        if (r1_11 == 0)
            q1 = var_1f8
        else
            q0:8.q = fneg(q0:8.q)
            q0.q = fneg(q0.q)
            q1 = fneg(var_1f8)
        
        *arg2 = q0:8.q
        arg2[2] = q1
        arg2[4] = q0.q
int32_t r1_37 = *r3_10
int32_t result = r1_37 - r0

if (r1_37 == r0)
    result = r10_2 & 7
    arg5.q = var_68
    arg5:8.q = var_60
    arg6.q = var_58
    arg6:8.q = var_50
    arg7.q = var_48
    arg7:8.q = var_40
    arg8.q = var_38
    arg8:8.q = var_30
    sp = &var_24

if (r1_37 != r0)
    __stack_chk_fail()
    noreturn

*sp
sp[1]
sp[2]
sp[3]
sp[4]
sp[5]
sp[6]
sp[7]
return result
