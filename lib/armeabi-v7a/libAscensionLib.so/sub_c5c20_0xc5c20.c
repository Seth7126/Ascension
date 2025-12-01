// 函数: sub_c5c20
// 地址: 0xc5c20
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t __saved_r11_2
int32_t __saved_r11_1 = __saved_r11_2
int32_t __saved_r10_1
int32_t __saved_r10 = __saved_r10_1
int32_t __saved_r8_1
int32_t __saved_r8 = __saved_r8_1
int32_t __saved_r7_1
int32_t __saved_r7 = __saved_r7_1
int32_t __saved_r6_1
int32_t __saved_r6 = __saved_r6_1
int32_t __saved_r5_1
int32_t __saved_r5 = __saved_r5_1
int32_t __saved_r4_1
int32_t __saved_r4 = __saved_r4_1
int32_t __saved_r11
int32_t* r11 = &__saved_r11

if (arg2 u<= 0xe)
    int32_t* r5 = arg1
    int32_t* r8 = arg3
    uint32_t var_28_1
    int32_t* r0
    int32_t* r0_6
    int32_t r0_14
    int32_t r1_1
    int32_t r1_7
    int32_t r2_5
    int32_t r3_3
    uint32_t r4_1
    int32_t i_2
    int32_t r12_2
    int64_t* pc
    bool cond:2_1
    
    switch (arg2)
        case 0, 1, 2, 3, 4, 5
            r1_1 = arg2 + 0xd
            r0 = r5
        label_c5ca0:
            *(r11 - 0x18)
            *(r11 - 0x14)
            *(r11 - 0x10)
            *(r11 - 0xc)
            *(r11 - 8)
            *(r11 - 4)
            *r11
            r11[1]
            return sub_c593c(r0, r1_1, r8, arg4) __tailcall
        case 6
            int32_t r0_17
            int32_t r1_20
            r1_20:r0_17 = *(arg4 + 0x10)
            
            if (r0_17 != r1_20)
                r5, pc = sub_c4c4c(r5, arg4)
            else
                sub_c471c(r5, arg4)
            
            if (*arg4 == 0xb)
                int32_t r2_15 = *(*r5 + 0xc)
                int32_t* r0_23 = r2_15 + (arg4[2] << 2)
                int32_t r1_28 = *r0_23
                
                if ((r1_28 & 0x3f) == 0x16)
                    if (*r8 == 6)
                        int32_t r3_9 = r8[2]
                        
                        if ((r3_9 & 0x100) == 0 && r3_9 s>= zx.d(*(r5 + 0x2e)))
                            r5[0xc].b -= 1
                            int32_t* r2_20 = r2_15 + (arg4[2] << 2)
                            r1_28 = *r2_20
                            r0_23 = r2_20
                    
                    *r0_23 = (r1_28 & 0x7fffff) | r8[2] << 0x17
                    *r8 = 0xb
                    int32_t r0_24 = arg4[2]
                    r8[2] = r0_24
                    return r0_24
            
            sub_c471c(r5, arg4)
            
            if (*arg4 == 6)
                int32_t r0_27 = arg4[2]
                
                if ((r0_27 & 0x100) == 0 && r0_27 s>= zx.d(*(r5 + 0x2e)))
                    r5[0xc].b -= 1
            
            void* r1_32 = *r5
            uint32_t r2_17 = zx.d(r5[0xc].b)
            
            if (r2_17 u>= zx.d(*(r1_32 + 0x4e)))
                cond:2_1 = r2_17 == 0xf9
                
                if (r2_17 u>= 0xf9)
                    goto label_c6040
                
                *(r1_32 + 0x4e) = r2_17.b + 1
            
            r5[0xc].b = r2_17.b + 1
            r8, r11 = sub_c48c0(r5, arg4, 0xffffffff + zx.d(r2_17.b + 1), pc)
            r0 = r5
            r1_1 = 0x16
            goto label_c5ca0
        case 7, 8, 9
            r4_1 = sub_c4d64(r5, r8)
            uint32_t r0_10 = sub_c4d64(r5, arg4)
            
            if (*arg4 == 6)
                int32_t r1_11 = arg4[2]
                
                if ((r1_11 & 0x100) == 0 && r1_11 s>= zx.d(*(r5 + 0x2e)))
                    r5[0xc].b -= 1
            
            r1_7 = arg2 + 0x11
            
            if (*r8 == 6)
                int32_t r2_7 = r8[2]
                
                if ((r2_7 & 0x100) == 0 && r2_7 s>= zx.d(*(r5 + 0x2e)))
                    r5[0xc].b -= 1
            
            var_28_1 = r0_10
            r0_6 = r5
            r2_5 = 1
            goto label_c5d6c
        case 0xa, 0xb, 0xc
            r4_1 = sub_c4d64(r5, r8)
            uint32_t r0_5 = sub_c4d64(r5, arg4)
            
            if (*arg4 == 6)
                int32_t r1_6 = arg4[2]
                
                if ((r1_6 & 0x100) == 0 && r1_6 s>= zx.d(*(r5 + 0x2e)))
                    r5[0xc].b -= 1
            
            r1_7 = arg2 + 0xe
            
            if (*r8 == 6)
                int32_t r2_3 = r8[2]
                
                if ((r2_3 & 0x100) == 0 && r2_3 s>= zx.d(*(r5 + 0x2e)))
                    r5[0xc].b -= 1
            
            uint32_t r2_4 = r0_5
            
            if (r1_7 != 0x18)
                r2_4 = r4_1
                r4_1 = r0_5
            
            var_28_1 = r2_4
            r2_5 = r1_7 - 0x18
            
            if (r1_7 != 0x18)
                r2_5 = 1
            
            r0_6 = r5
        label_c5d6c:
            int32_t r0_11
            r0_11, r11 = sub_c63d0(r0_6, r1_7, r2_5, r4_1, var_28_1)
            r8[2] = r0_11
            *r8 = 0xa
        case 0xd
            sub_c471c(r5, arg4)
            r12_2 = r8[5]
            
            if (r12_2 == 0xffffffff)
                goto label_c5fd4
            
            int32_t i = arg4[5]
            
            if (i == 0xffffffff)
                arg4[5] = r12_2
            label_c5fd4:
                int32_t r0_30 = *arg4
                int32_t r1_34 = arg4[1]
                int32_t r2_19 = arg4[2]
                int32_t r3_11 = arg4[3]
                int32_t r5_3 = arg4[4]
                int32_t r7_3 = arg4[5]
                *r8 = r0_30
                r8[1] = r1_34
                r8[2] = r2_19
                r8[3] = r3_11
                r8[4] = r5_3
                r8[5] = r7_3
                return r0_30
            
            r0_14 = *(*r5 + 0xc)
            
            do
                r3_3 = *(r0_14 + (i << 2))
                i_2 = i
                i = 0xfffe0001 + (r3_3 u>> 0xe)
                
                if (i != 0xffffffff)
                    i = i_2 + i + 1
            while (i != 0xffffffff)
            
        label_c5e30:
            int32_t r1_16 = not.d(i_2)
            int32_t r1_17 = r12_2 + r1_16
            int32_t r2_8 = r1_17
            
            if (r12_2 + r1_16 s< 0)
                r2_8 = 0 - r1_17
            
            cond:2_1 = r2_8 == &__elf_symbol_table[0xfe1]
            
            if (r2_8 s< &__elf_symbol_table[0xfe1])
                *(r0_14 + (i_2 << 2)) = (0x7fffc000 + (r1_17 << 0xe)) | (r3_3 & 0x3fff)
                goto label_c5fd4
            
            sub_ce78c(r5[3], "control structure too long", pc, r2_8, r3_3)
        label_c6040:
            int32_t* r0_38
            int32_t r1_36
            int32_t r2_21
            r0_38, r1_36, r2_21 = sub_ce78c(r5[3], "function or expression too complex", pc)
            
            if (cond:2_1)
                jump(r5 * r2_21)
            
            return sub_c604c(r0_38, r1_36) __tailcall
        case 0xe
            sub_c471c(r5, arg4)
            r12_2 = r8[4]
            
            if (r12_2 == 0xffffffff)
                goto label_c5fd4
            
            int32_t i_1 = arg4[4]
            
            if (i_1 == 0xffffffff)
                arg4[4] = r12_2
                goto label_c5fd4
            
            r0_14 = *(*r5 + 0xc)
            
            do
                r3_3 = *(r0_14 + (i_1 << 2))
                i_2 = i_1
                i_1 = 0xfffe0001 + (r3_3 u>> 0xe)
                
                if (i_1 != 0xffffffff)
                    i_1 = i_2 + i_1 + 1
            while (i_1 != 0xffffffff)
            
            goto label_c5e30

*(r11 - 0x18)
*(r11 - 0x14)
*(r11 - 0x10)
*(r11 - 0xc)
*(r11 - 8)
*(r11 - 4)
*r11
jump(r11[1])
