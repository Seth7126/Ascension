// 函数: sub_daa54
// 地址: 0xdaa54
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r11
int32_t var_8 = r11
int32_t r7
int32_t var_18 = r7
int32_t r6
int32_t var_1c = r6
int32_t r5
int32_t var_20 = r5
int32_t r4
int32_t var_24 = r4
int32_t* r11_1 = &var_8
unimplemented  {vpush {d8, d9}}
int32_t r5_1 = arg4
int32_t (* const r10)() = __stack_chk_guard
int32_t r0 = *__stack_chk_guard
int32_t r9 = *(arg2 + 0x1c)
uint32_t r4_1 = zx.d(*(arg2 + 7))
int32_t r0_1 = *(arg2 + 0x10)

if (r9 s>= arg3)
label_daafc:
    int32_t r9_1
    double q0_1
    int128_t q4_1
    r9_1, q0_1, q4_1 = sub_dad30(arg1, arg2, r5_1)
    
    if (r9_1 s<= arg3)
        goto label_dac5c
    
    unimplemented  {vmov.f64 d8, #1.000000e+00}
    int32_t r0_8 = arg3
    *(arg2 + 0x1c) = arg3
    
    while (true)
        void* r5_2 = *(arg2 + 0xc) + (r0_8 << 4)
        
        if (*(r5_2 + 8) == 0)
            r0_8 += 1
            
            if (r0_8 == r9_1)
                break
        else
            void* r0_9 = r5_2
            double var_40
            
            if (r0_8 u>= *(arg2 + 0x1c))
                q0_1.d = r0_8 + 1
                unimplemented  {vcvt.f64.s32 d9, s0}
                var_40 = q4_1:8.q f+ q4_1.q
                int32_t r1_6 = var_40:4.d + var_40.d
                int32_t r0_11
                
                if (r1_6 s<= 0xffffffff)
                    r0_11 = r1_6 * 2
                    
                    if (r1_6 != neg.d(r1_6))
                        r0_11 = 0 - r1_6
                else
                    r0_11 = r1_6
                
                int32_t r1_10 = __aeabi_idivmod(r0_11, 
                    (1 | 0xffffffff << zx.d(*(arg2 + 7))) ^ 0xfffffffe, 0xfffffffe, 1, r0_1, arg1)
                r0_9 = *(arg2 + 0x10) + (r1_10 << 5)
                
                while (true)
                    int32_t r1_11 = *(r0_9 + 0x18)
                    
                    if (r1_11 == 3)
                        *(r0_9 + 0x10)
                        unimplemented  {vcmp.f64 d0, d9}
                        unimplemented  {vmrs apsr_nzcv, fpscr}
                        
                        if (r1_11 == 3)
                            break
                    
                    r0_9 = *(r0_9 + 0x1c)
                    
                    if (r0_9 == 0)
                        goto label_dabf8
            
            if (r0_9 == &data_1d13d0)
                q0_1.d = r0_8 + 1
                unimplemented  {vcvt.f64.s32 d9, s0}
            label_dabf8:
                int32_t var_38_1 = 3
                var_40 = q4_1:8.q
                r0_9 = sub_db070(arg1, arg2, &var_40, r4_1, r5_2, arg2, arg3, r0_8 + 1, r9_1, 
                    r5_2 + 8, r11_1)
            
            int32_t r2_4
            int32_t r3_1
            r3_1:r2_4 = *r5_2
            *r0_9 = r2_4
            *(r0_9 + 4) = r3_1
            *(r0_9 + 8) = *(r5_2 + 8)
            r0_8 += 1
            
            if (r0_8 == r9_1)
                break
    
    if (arg3 + 1 u< 0x10000000)
        int32_t r0_16
        r0_16, r4_1, q4_1 = sub_d14cc(arg1, *(arg2 + 0xc), r9_1 << 4, arg3 << 4)
        *(arg2 + 0xc) = r0_16
        r10 = __stack_chk_guard
    label_dac5c:
        int32_t r8_1 = 1 << r4_1
        
        if (r4_1 != 0x1f)
            int32_t* r5_3 = r0_1 + (r8_1 << 5) - 0x10
            int32_t i = r8_1 + 1
            
            do
                if (*(r5_3 - 8) != 0)
                    int32_t* r0_20 = sub_db788(arg2, r5_3, r10, q4_1)
                    
                    if (r0_20 == &data_1d13d0)
                        r0_20 = sub_db070(arg1, arg2, r5_3, &data_1d13d0, r5_3, arg2, i, r8_1, 
                            r0_1, r10, r11_1)
                    
                    int32_t r2_7 = *(r5_3 - 0xc)
                    *r0_20 = *(r5_3 - 0x10)
                    r0_20[1] = r2_7
                    r0_20[2] = *(r5_3 - 8)
                
                i -= 1
                r5_3 -= 0x20
            while (i s> 1)
        
        if (r0_1 != &data_1d1540)
            sub_d14cc(arg1, r0_1, r8_1 << 5, 0)
        
        if (*__stack_chk_guard == r0)
            unimplemented  {vpopeq {d8, d9}}
            jump(arg5)
        
        __stack_chk_fail()
        noreturn
else if (arg3 + 1 u< 0x10000000)
    int32_t r0_4
    r0_4, r4_1, r5_1 = sub_d14cc(arg1, *(arg2 + 0xc), r9 << 4, arg3 << 4)
    int32_t r2_1 = *(arg2 + 0x1c)
    *(arg2 + 0xc) = r0_4
    
    if (r2_1 s< arg3)
        int32_t i_2 = arg3 - r2_1
        int32_t* r0_6 = r0_4 + (r2_1 << 4) + 8
        int32_t i_1
        
        do
            *r0_6 = 0
            r0_6 = &r0_6[4]
            i_1 = i_2
            i_2 -= 1
        while (i_1 != 1)
    
    *(arg2 + 0x1c) = arg3
    goto label_daafc

sub_d14b4(arg1)
noreturn
