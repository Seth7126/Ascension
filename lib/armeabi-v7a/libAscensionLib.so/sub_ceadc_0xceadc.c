// 函数: sub_ceadc
// 地址: 0xceadc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r11
int32_t var_8 = r11
int32_t* r11_1 = &var_8
int64_t* var_38 = arg2
int32_t* r8 = &arg1[0xe]
int32_t r9 = 0
int32_t r4 = 0x4801
int32_t r0 = *__stack_chk_guard
*(arg1[0xf] + 4) = 0

while (true)
    int32_t __c = *arg1
    int32_t* r0_19
    int32_t r3_1
    uint32_t __c_3
    char const* const r1_80
    int32_t r2_33
    char const* const r3_16
    uint32_t __c_2
    void* const __s
    int64_t q0
    bool cond:34_1
    
    if (__c + 1 u<= 0x7f)
        switch (__c)
            case 9, 0xb, 0xc, 0x20
                int32_t* r0_5 = *r8
                int32_t r1_1 = *r0_5
                *r0_5 = r1_1 - 1
                
                if (r1_1 != 0)
                    char* r1 = r0_5[1]
                    r0_5[1] = &r1[1]
                    *arg1 = zx.d(*r1)
                    continue
                else
                    *arg1 = sub_e0ffc(r0_5)
                    continue
            case 0xa, 0xd
                r4, r9, r11_1, q0 = sub_d03c8(arg1, r8)
                continue
            case 0x22, 0x27
                char** r4_1 = arg1[0xf]
                int32_t r1_8 = r4_1[1]
                int32_t r2_10 = r4_1[2]
                r3_1 = r1_8 + 1
                char* r0_20
                
                if (r3_1 u<= r2_10)
                    r0_20 = *r4_1
                else
                    if (r2_10 u>= 0x7ffffffe)
                    label_d029c:
                        r0_19 = sub_ce79c(arg1, "lexical element too long", nullptr, arg3, r3_1)
                    label_d02a0:
                        sub_d14b4(r0_19)
                        noreturn
                    
                    r0_19 = arg1[0xd]
                    
                    if (0xfffffffe == r2_10 << 1)
                        goto label_d02a0
                    
                    int32_t r5_2
                    r0_20, r4_1, r5_2, r8 = sub_d14cc(r0_19, *r4_1, r2_10, r2_10 << 1)
                    r1_8 = r4_1[1]
                    *r4_1 = r0_20
                    r3_1 = r1_8 + 1
                    r4_1[2] = r5_2
                
                r4_1[1] = r3_1
                r0_20[r1_8] = __c.b
            label_cef88:
                int32_t* r0_31 = *r8
                int32_t r1_16 = *r0_31
                *r0_31 = r1_16 - 1
                
                if (r1_16 == 0)
                    __c_2 = sub_e0ffc(r0_31)
                else
                    char* r1_17 = r0_31[1]
                    r0_31[1] = &r1_17[1]
                    __c_2 = zx.d(*r1_17)
                
                *arg1 = __c_2
                
                if (__c_2 == __c)
                label_cf618:
                    char** r4_6 = arg1[0xf]
                    int32_t r1_45 = r4_6[1]
                    int32_t r2_39 = r4_6[2]
                    r3_1 = r1_45 + 1
                    char* r0_66
                    
                    if (r3_1 u<= r2_39)
                        r0_66 = *r4_6
                    else
                        if (r2_39 u>= 0x7ffffffe)
                            goto label_d029c
                        
                        r0_19 = arg1[0xd]
                        
                        if (0xfffffffe == r2_39 << 1)
                            goto label_d02a0
                        
                        int32_t r5_9
                        r0_66, r4_6, r5_9, r8 = sub_d14cc(r0_19, *r4_6, r2_39, r2_39 << 1)
                        r1_45 = r4_6[1]
                        *r4_6 = r0_66
                        r3_1 = r1_45 + 1
                        r4_6[2] = r5_9
                    
                    r4_6[1] = r3_1
                    r0_66[r1_45] = __c.b
                    int32_t* r0_70 = *r8
                    int32_t r1_51 = *r0_70
                    *r0_70 = r1_51 - 1
                    uint32_t r0_71
                    
                    if (r1_51 == 0)
                        r0_71 = sub_e0ffc(r0_70)
                    else
                        char* r1_52 = r0_70[1]
                        r0_70[1] = &r1_52[1]
                        r0_71 = zx.d(*r1_52)
                    
                    int32_t* r1_59 = arg1[0xf]
                    int32_t* r5_12 = arg1[0xd]
                    *arg1 = r0_71
                    int64_t* r4_8 = var_38
                    void* r6_1 = sub_d7eb4(r5_12, *r1_59 + 1, r1_59[1] - 2)
                    void** r0_81 = r5_12[2]
                    r5_12[2] = &r0_81[4]
                    *r0_81 = r6_1
                    r0_81[2] = zx.d(*(r6_1 + 4)) | 0x40
                    int32_t* r0_84 = sub_daf38(r5_12, *(arg1[0xc] + 4), r5_12[2] - 0x10, r4_8, 
                        r5_12, r6_1, arg1, r11_1)
                    
                    if (r0_84[2] == 0)
                        r0_84[2] = 1
                        *r0_84 = 1
                        
                        if (*(r5_12[3] + 0xc) s>= 1)
                            sub_cc158(r5_12)
                    else
                        r6_1 = r0_84[4]
                    
                    r5_12[2] -= 0x10
                    *r4_8 = r6_1
                    break
                
                while (true)
                    if (__c_2 s<= 0x5b)
                        if (__c_2 == 0xffffffff)
                            break
                        
                        cond:34_1 = __c_2 == 0xa
                        
                        if (__c_2 != 0xa)
                            cond:34_1 = __c_2 == 0xd
                        
                        if (__c_2 == 0xa || __c_2 == 0xd)
                            r1_80 = "unfinished string"
                            goto label_cfebc
                    else if (__c_2 == 0x5c)
                        int32_t* r0_34 = *r8
                        int32_t r1_19 = *r0_34
                        *r0_34 = r1_19 - 1
                        
                        if (r1_19 == 0)
                            __c_2 = sub_e0ffc(r0_34)
                        else
                            char* r1_20 = r0_34[1]
                            r0_34[1] = &r1_20[1]
                            __c_2 = zx.d(*r1_20)
                        
                        *arg1 = __c_2
                        uint32_t __c_6
                        
                        if (__c_2 + 1 u<= 0x7b)
                            __c_6 = 7
                            
                            switch (__c_2)
                                case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0xb, 0xc, 0xe, 0xf, 0x10, 0x11, 
                                        0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, 0x1b, 
                                        0x1c, 0x1d, 0x1e, 0x1f, 0x20, 0x21, 0x23, 0x24, 0x25, 0x26, 
                                        0x28, 0x29, 0x2a, 0x2b, 0x2c, 0x2d, 0x2e, 0x2f, 0x30, 0x31, 
                                        0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x3a, 0x3b, 
                                        0x3c, 0x3d, 0x3e, 0x3f, 0x40, 0x41, 0x42, 0x43, 0x44, 0x45, 
                                        0x46, 0x47, 0x48, 0x49, 0x4a, 0x4b, 0x4c, 0x4d, 0x4e, 0x4f, 
                                        0x50, 0x51, 0x52, 0x53, 0x54, 0x55, 0x56, 0x57, 0x58, 0x59, 
                                        0x5a, 0x5b, 0x5d, 0x5e, 0x5f, 0x60, 0x63, 0x64, 0x65, 0x67, 
                                        0x68, 0x69, 0x6a, 0x6b, 0x6c, 0x6d, 0x6f, 0x70, 0x71, 0x73, 
                                        0x75, 0x77, 0x79
                                    goto label_cf2cc
                                case 0xa, 0xd
                                    r11_1 = sub_d03c8(arg1, r8)
                                    __c_6 = 0xa
                                label_cf470:
                                    uint8_t** r7_1 = arg1[0xf]
                                    int32_t r1_18 = r7_1[1]
                                    int32_t r2_32 = r7_1[2]
                                    r3_1 = r1_18 + 1
                                    uint8_t* r0_33
                                    
                                    if (r3_1 u<= r2_32)
                                        r0_33 = *r7_1
                                    else
                                        if (r2_32 u>= 0x7ffffffe)
                                            goto label_d029c
                                        
                                        r0_19 = arg1[0xd]
                                        
                                        if (0xfffffffe == r2_32 << 1)
                                            goto label_d02a0
                                        
                                        int32_t r5_5
                                        r0_33, r5_5, r8, __c_6 =
                                            sub_d14cc(r0_19, *r7_1, r2_32, r2_32 << 1)
                                        r1_18 = r7_1[1]
                                        *r7_1 = r0_33
                                        r3_1 = r1_18 + 1
                                        r7_1[2] = r5_5
                                    
                                    r7_1[1] = r3_1
                                    r0_33[r1_18] = __c_6.b
                                    __c_2 = *arg1
                                case 0x22, 0x27, 0x5c
                                    __c_6 = __c_2
                                label_cf43c:
                                    int32_t* r0_58 = *r8
                                    int32_t r1_35 = *r0_58
                                    *r0_58 = r1_35 - 1
                                    uint32_t r0_59
                                    
                                    if (r1_35 == 0)
                                        r0_59 = sub_e0ffc(r0_58)
                                    else
                                        char* r1_36 = r0_58[1]
                                        r0_58[1] = &r1_36[1]
                                        r0_59 = zx.d(*r1_36)
                                    
                                    *arg1 = r0_59
                                    goto label_cf470
                                case 0x61
                                    goto label_cf43c
                                case 0x62
                                    __c_6 = 8
                                    goto label_cf43c
                                case 0x66
                                    __c_6 = 0xc
                                    goto label_cf43c
                                case 0x6e
                                    __c_6 = 0xa
                                    goto label_cf43c
                                case 0x72
                                    __c_6 = 0xd
                                    goto label_cf43c
                                case 0x74
                                    __c_6 = 9
                                    goto label_cf43c
                                case 0x76
                                    __c_6 = 0xb
                                    goto label_cf43c
                                case 0x78
                                    __c_3 = 0x78
                                    int32_t* r0_40 = *r8
                                    int32_t r1_23 = *r0_40
                                    *r0_40 = r1_23 - 1
                                    uint32_t r0_41
                                    
                                    if (r1_23 == 0)
                                        r0_41 = sub_e0ffc(r0_40)
                                    else
                                        char* r1_24 = r0_40[1]
                                        r0_40[1] = &r1_24[1]
                                        r0_41 = zx.d(*r1_24)
                                    
                                    *arg1 = r0_41
                                    uint32_t var_30_1 = r0_41
                                    
                                    if ((zx.d(*(r0_41 + 0x1d12b5)) & 0x10) == 0)
                                        goto label_cfedc
                                    
                                    int32_t r0_54 = sub_d2920(r0_41)
                                    int32_t* r0_55 = *r8
                                    int32_t r1_31 = *r0_55
                                    *r0_55 = r1_31 - 1
                                    uint32_t r0_56
                                    
                                    if (r1_31 == 0)
                                        r0_56 = sub_e0ffc(r0_55)
                                    else
                                        char* r1_32 = r0_55[1]
                                        r0_55[1] = &r1_32[1]
                                        r0_56 = zx.d(*r1_32)
                                    
                                    *arg1 = r0_56
                                    uint32_t var_2c_1 = r0_56
                                    
                                    if ((zx.d(*(r0_56 + 0x1d12b5)) & 0x10) == 0)
                                        r2_33 = 3
                                        goto label_cfeec
                                    
                                    __c_6 = sub_d2920(r0_56) + (r0_54 << 4)
                                    goto label_cf43c
                                case 0x7a
                                    int32_t* r0_39 = *r8
                                    int32_t r1_21 = *r0_39
                                    *r0_39 = r1_21 - 1
                                    
                                    if (r1_21 == 0)
                                        __c_2 = sub_e0ffc(r0_39)
                                    else
                                        char* r1_22 = r0_39[1]
                                        r0_39[1] = &r1_22[1]
                                        __c_2 = zx.d(*r1_22)
                                    
                                    *arg1 = __c_2
                                    
                                    while ((zx.d(*(__c_2 + 0x1d12b5)) & 8) != 0)
                                        if (__c_2 != 0xd && __c_2 != 0xa)
                                            int32_t* r0_50 = *r8
                                            int32_t r1_27 = *r0_50
                                            *r0_50 = r1_27 - 1
                                            
                                            if (r1_27 == 0)
                                                __c_2 = sub_e0ffc(r0_50)
                                            else
                                                char* r1_28 = r0_50[1]
                                                r0_50[1] = &r1_28[1]
                                                __c_2 = zx.d(*r1_28)
                                            
                                            *arg1 = __c_2
                                        else
                                            r11_1 = sub_d03c8(arg1, r8)
                                            __c_2 = *arg1
                            
                            if (__c_2 == __c)
                                goto label_cf618
                            
                            continue
                        
                    label_cf2cc:
                        int32_t temp2_1 = zx.d(*(__c_2 + 0x1d12b5)) & 2
                        cond:34_1 = temp2_1 == 0
                        
                        if (temp2_1 == 0)
                            goto label_cfed4
                        
                        __c_3 = __c_2
                        int32_t* r0_44 = *r8
                        int32_t r1_25 = *r0_44
                        *r0_44 = r1_25 - 1
                        uint32_t r0_45
                        
                        if (r1_25 == 0)
                            r0_45 = sub_e0ffc(r0_44)
                        else
                            char* r1_26 = r0_44[1]
                            r0_44[1] = &r1_26[1]
                            r0_45 = zx.d(*r1_26)
                        
                        *arg1 = r0_45
                        __c_6 = __c_2 - 0x30
                        r2_33 = 1
                        
                        if ((zx.d(*(r0_45 + 0x1d12b5)) & 2) != 0)
                            uint32_t var_30_2 = r0_45
                            int32_t* r1_40 = *r8
                            int32_t r2_34 = *r1_40
                            *r1_40 = r2_34 - 1
                            uint32_t r0_61
                            
                            if (r2_34 == 0)
                                r0_61 = sub_e0ffc(r1_40)
                            else
                                char* r0_60 = r1_40[1]
                                r1_40[1] = &r0_60[1]
                                r0_61 = zx.d(*r0_60)
                            
                            *arg1 = r0_61
                            __c_6 = r0_45 + __c_6 * 0xa - 0x30
                            r2_33 = 2
                            
                            if ((zx.d(*(r0_61 + 0x1d12b5)) & 2) != 0)
                                uint32_t var_2c_2 = r0_61
                                int32_t* r1_43 = *r8
                                int32_t r2_36 = *r1_43
                                *r1_43 = r2_36 - 1
                                uint32_t r0_64
                                
                                if (r2_36 == 0)
                                    r0_64 = sub_e0ffc(r1_43)
                                else
                                    char* r0_63 = r1_43[1]
                                    r1_43[1] = &r0_63[1]
                                    r0_64 = zx.d(*r0_63)
                                
                                __c_6 = r0_61 + __c_6 * 0xa - 0x30
                                *arg1 = r0_64
                                r2_33 = 3
                        
                        if (__c_6 s< 0x100)
                            goto label_cf470
                        
                        r3_16 = "decimal escape too large"
                        goto label_cff04
                    
                    uint8_t** r4_3 = arg1[0xf]
                    int32_t r1_15 = r4_3[1]
                    int32_t r2_38 = r4_3[2]
                    r3_1 = r1_15 + 1
                    uint8_t* r0_30
                    
                    if (r3_1 u<= r2_38)
                        r0_30 = *r4_3
                    else
                        if (r2_38 u>= 0x7ffffffe)
                            goto label_d029c
                        
                        r0_19 = arg1[0xd]
                        
                        if (0xfffffffe == r2_38 << 1)
                            goto label_d02a0
                        
                        int32_t r5_7
                        r0_30, r4_3, r5_7, r8 = sub_d14cc(r0_19, *r4_3, r2_38, r2_38 << 1)
                        r1_15 = r4_3[1]
                        *r4_3 = r0_30
                        r3_1 = r1_15 + 1
                        r4_3[2] = r5_7
                    
                    r4_3[1] = r3_1
                    r0_30[r1_15] = __c_2.b
                    goto label_cef88
                
            label_cff18:
                __s, q0 = sub_ce79c(arg1, "unfinished string", 0x11e, arg3)
            label_cff1c:
                *arg1 = __c_2
            label_cff30:
                
                while (true)
                    uint32_t __c_5 = 0
                    
                    if (__c_2 != 0)
                        if (memchr(__s, __c_2, 3) == 0)
                            __c_5 = __c_2
                        else
                            int32_t* r4_14 = arg1[0xf]
                            int32_t r1_111 = r4_14[1]
                            int32_t r2_86 = r4_14[2]
                            r3_1 = r1_111 + 1
                            uint8_t* r0_146
                            
                            if (r3_1 u<= r2_86)
                                r0_146 = *r4_14
                            else
                                if (r2_86 u>= 0x7ffffffe)
                                    goto label_d029c
                                
                                r0_19 = arg1[0xd]
                                
                                if (0xfffffffe == r2_86 << 1)
                                    goto label_d02a0
                                
                                __c = r2_86 << 1
                                r0_146, r4_14, __c_5, r8, __s, q0 =
                                    sub_d14cc(r0_19, *r4_14, r2_86, __c)
                                r1_111 = r4_14[1]
                                *r4_14 = r0_146
                                r3_1 = r1_111 + 1
                                r4_14[2] = __c
                            
                            r4_14[1] = r3_1
                            r0_146[r1_111] = __c_2.b
                            int32_t* r0_147 = *r8
                            int32_t r1_113 = *r0_147
                            *r0_147 = r1_113 - 1
                            
                            if (r1_113 == 0)
                                __c_2 = sub_e0ffc(r0_147)
                            else
                                char* r1_114 = r0_147[1]
                                r0_147[1] = &r1_114[1]
                                __c_2 = zx.d(*r1_114)
                            
                            *arg1 = __c_2
                            
                            if (__c_2 != 0)
                                if (memchr(0x1c0b6f, __c_2, 3) == 0)
                                    __c_5 = __c_2
                                else
                                    uint8_t** r4_15 = arg1[0xf]
                                    int32_t r1_116 = r4_15[1]
                                    int32_t r2_89 = r4_15[2]
                                    r3_1 = r1_116 + 1
                                    uint8_t* r0_150
                                    
                                    if (r3_1 u<= r2_89)
                                        r0_150 = *r4_15
                                    else
                                        if (r2_89 u>= 0x7ffffffe)
                                            goto label_d029c
                                        
                                        r0_19 = arg1[0xd]
                                        
                                        if (0xfffffffe == r2_89 << 1)
                                            goto label_d02a0
                                        
                                        int32_t r5_25
                                        r0_150, r4_15, r5_25, r8, __s, q0 =
                                            sub_d14cc(r0_19, *r4_15, r2_89, r2_89 << 1)
                                        r1_116 = r4_15[1]
                                        *r4_15 = r0_150
                                        r3_1 = r1_116 + 1
                                        r4_15[2] = r5_25
                                    
                                    r4_15[1] = r3_1
                                    r0_150[r1_116] = __c_2.b
                                    int32_t* r0_151 = *r8
                                    int32_t r1_118 = *r0_151
                                    *r0_151 = r1_118 - 1
                                    
                                    if (r1_118 == 0)
                                        __c_5 = sub_e0ffc(r0_151)
                                    else
                                        char* r1_119 = r0_151[1]
                                        r0_151[1] = &r1_119[1]
                                        __c_5 = zx.d(*r1_119)
                                    
                                    *arg1 = __c_5
                    
                    int32_t* r7_3 = arg1[0xf]
                    int32_t r1_120 = r7_3[1]
                    int32_t r2_92 = r7_3[2]
                    r3_1 = r1_120 + 1
                    
                    if (__c_5 != 0x2e && (zx.d(*(__c_5 + 0x1d12b5)) & 0x10) == 0)
                        char* r0_158
                        int64_t* r4_17
                        
                        if (r3_1 u<= r2_92)
                            r0_158 = *r7_3
                            r4_17 = var_38
                        else
                            if (r2_92 u>= 0x7ffffffe)
                                goto label_d029c
                            
                            r0_19 = arg1[0xd]
                            
                            if (0xfffffffe == r2_92 << 1)
                                goto label_d02a0
                            
                            int32_t r5_27
                            r0_158, r4_17, r5_27, r8, q0 =
                                sub_d14cc(r0_19, *r7_3, r2_92, r2_92 << 1)
                            r1_120 = r7_3[1]
                            *r7_3 = r0_158
                            r3_1 = r1_120 + 1
                            r7_3[2] = r5_27
                        
                        r7_3[1] = r3_1
                        r0_158[r1_120] = 0
                        int32_t* r1_125 = arg1[0xf]
                        char* r0_159 = *r1_125
                        int32_t r1_126 = r1_125[1]
                        int32_t r1_129
                        
                        if (r1_126 == 0)
                            r1_129 = 0xffffffff
                        else
                            char r2_95 = arg1[0x13].b
                            bool cond:41_1
                            
                            do
                                if (zx.d((r0_159 - 1)[r1_126]) == 0x2e)
                                    (r0_159 - 1)[r1_126] = r2_95
                                
                                cond:41_1 = r1_126 != 1
                                r1_126 -= 1
                            while (cond:41_1)
                            int32_t* r1_127 = arg1[0xf]
                            r0_159 = *r1_127
                            r1_129 = r1_127[1] - 1
                        
                        uint32_t r0_161
                        int64_t q0_1
                        r0_161, q0_1 = sub_d2950(r0_159, r1_129, r4_17, q0)
                        
                        if (r0_161 == 0)
                            int32_t* r3_22 = arg1[0xf]
                            uint32_t r1_130 = zx.d(arg1[0x13].b)
                            arg1[0x13].b = 0x2e
                            char* r0_162 = *r3_22
                            int32_t r3_23 = r3_22[1]
                            int32_t r1_133
                            
                            if (r3_23 == 0)
                                r1_133 = 0xffffffff
                            else
                                bool cond:47_1
                                
                                do
                                    __c = zx.d((r0_162 - 1)[r3_23])
                                    
                                    if (__c == r1_130)
                                        (r0_162 - 1)[r3_23] = 0x2e
                                    
                                    cond:47_1 = r3_23 != 1
                                    r3_23 -= 1
                                while (cond:47_1)
                                char** r1_131 = arg1[0xf]
                                r0_162 = *r1_131
                                r1_133 = r1_131[1] - 1
                            
                            uint32_t r0_164 = sub_d2950(r0_162, r1_133, r4_17, q0_1)
                            
                            if (r0_164 == 0)
                                sub_d0a18(arg1, arg1[0x13].b, 0x2e)
                                void* r0_171
                                int16_t r1_136
                                int32_t r12
                                int32_t lr
                                r0_171, r1_136, r12, lr =
                                    sub_ce79c(arg1, "malformed number", 0x11f, arg3)
                                
                                if (r0_164 == 0)
                                    *arg3 = r1_136
                                    r0_171 = &data_d02d8 & r0_171 s>> (r12 & 0xff)
                                    
                                    if ((r0_171 & ror.d(r4_17, 0x1d)) == 0)
                                        r0_171 = &data_d02e0 & lr u>> (r12 & 0xff)
                                        
                                        if ((r0_171 & r12 << 0x1d) == 0
                                                && (r0_171 & ror.d(r8, (&data_d02d4 - __c) & 0xff))
                                                == 0 && (r0_171 & r12 << 0x1e) == 0)
                                            r0_171 = &data_d02f4 & &var_38 s>> 0x18
                                            
                                            if ((r0_171 & ror.d(r12, 0x1a)) == 0)
                                                void* r0_172 = &data_d0300 & r12 << 3
                                                *(&data_d02d4 - __c) =
                                                    (sx.d(*r0_172)):(r0_172 - r4_17)
                                                jump(&data_d0308 - __c)
                                
                                return sub_d0328(r0_171) __tailcall
                        
                        break
                    
                    uint8_t* r0_156
                    
                    if (r3_1 u<= r2_92)
                        r0_156 = *r7_3
                    else
                        if (r2_92 u>= 0x7ffffffe)
                            goto label_d029c
                        
                        r0_19 = arg1[0xd]
                        
                        if (0xfffffffe == r2_92 << 1)
                            goto label_d02a0
                        
                        __c = r2_92 << 1
                        r0_156, __c_5, r8, __s, q0 = sub_d14cc(r0_19, *r7_3, r2_92, __c)
                        r1_120 = r7_3[1]
                        *r7_3 = r0_156
                        r3_1 = r1_120 + 1
                        r7_3[2] = __c
                    
                    r7_3[1] = r3_1
                    r0_156[r1_120] = __c_5.b
                    int32_t* r0_157 = *r8
                    int32_t r1_122 = *r0_157
                    *r0_157 = r1_122 - 1
                    
                    if (r1_122 != 0)
                        char* r1_123 = r0_157[1]
                        r0_157[1] = &r1_123[1]
                        __c_2 = zx.d(*r1_123)
                        goto label_cff1c
                    
                    uint32_t __c_4 = sub_e0ffc(r0_157)
                    __c_2 = __c_4
                    *arg1 = __c_4
                
                break
            case 0x2d
                int32_t* r0_8 = *r8
                int32_t r1_2 = *r0_8
                *r0_8 = r1_2 - 1
                uint32_t r0_9
                
                if (r1_2 == 0)
                    r0_9 = sub_e0ffc(r0_8)
                else
                    char* r1_3 = r0_8[1]
                    r0_8[1] = &r1_3[1]
                    r0_9 = zx.d(*r1_3)
                
                *arg1 = r0_9
                
                if (r0_9 != 0x2d)
                    break
                
                int32_t* r0_10 = *r8
                int32_t r1_4 = *r0_10
                *r0_10 = r1_4 - 1
                uint32_t r0_11
                
                if (r1_4 == 0)
                    r0_11 = sub_e0ffc(r0_10)
                else
                    char* r1_5 = r0_10[1]
                    r0_10[1] = &r1_5[1]
                    r0_11 = zx.d(*r1_5)
                
                *arg1 = r0_11
                
                if (r0_11 == 0x5b)
                    int32_t r0_13
                    r0_13, q0 = sub_d047c(arg1)
                    *(arg1[0xf] + 4) = r9
                    
                    if (r0_13 s<= 0xffffffff)
                        r0_11 = *arg1
                    else
                        sub_d0600(arg1, nullptr, r0_13)
                        *(arg1[0xf] + 4) = r9
                        continue
                
                while (r0_11 + 1 u> 0xe || (r4 & 1 << ((r0_11 + 1) & 0xff)) == 0)
                    int32_t* r0_18 = *r8
                    int32_t r1_7 = *r0_18
                    *r0_18 = r1_7 - 1
                    
                    if (r1_7 != 0)
                        char* r1_6 = r0_18[1]
                        r0_18[1] = &r1_6[1]
                        r0_11 = zx.d(*r1_6)
                        *arg1 = r0_11
                    else
                        r0_11 = sub_e0ffc(r0_18)
                        *arg1 = r0_11
                
                continue
            case 0x2e
                int32_t* r4_7 = arg1[0xf]
                int32_t r1_49 = r4_7[1]
                int32_t r2_42 = r4_7[2]
                r3_1 = r1_49 + 1
                char* r0_69
                
                if (r3_1 u<= r2_42)
                    r0_69 = *r4_7
                else
                    if (r2_42 u>= 0x7ffffffe)
                        goto label_d029c
                    
                    r0_19 = arg1[0xd]
                    
                    if (0xfffffffe == r2_42 << 1)
                        goto label_d02a0
                    
                    int32_t r5_11
                    r0_69, r4_7, r5_11, r8, q0 = sub_d14cc(r0_19, *r4_7, r2_42, r2_42 << 1)
                    r1_49 = r4_7[1]
                    *r4_7 = r0_69
                    r3_1 = r1_49 + 1
                    r4_7[2] = r5_11
                
                r4_7[1] = r3_1
                r0_69[r1_49] = 0x2e
                int32_t* r0_102 = *r8
                int32_t r1_76 = *r0_102
                *r0_102 = r1_76 - 1
                
                if (r1_76 == 0)
                    __c = sub_e0ffc(r0_102)
                else
                    char* r1_77 = r0_102[1]
                    r0_102[1] = &r1_77[1]
                    __c = zx.d(*r1_77)
                
                *arg1 = __c
                void* r0_108
                
                if (__c != 0)
                    r0_108 = memchr(&data_1bff98, __c, 2)
                
                if (__c == 0 || r0_108 == 0)
                    if ((zx.d(*(__c + 0x1d12b5)) & 2) == 0)
                        break
                    
                    goto label_cfacc
                
                char** r4_10 = arg1[0xf]
                int32_t r1_84 = r4_10[1]
                int32_t r2_67 = r4_10[2]
                r3_1 = r1_84 + 1
                char* r0_109
                
                if (r3_1 u<= r2_67)
                    r0_109 = *r4_10
                else
                    if (r2_67 u>= 0x7ffffffe)
                        goto label_d029c
                    
                    r0_19 = arg1[0xd]
                    
                    if (0xfffffffe == r2_67 << 1)
                        goto label_d02a0
                    
                    int32_t r5_17
                    r0_109, r4_10, r5_17, r8 = sub_d14cc(r0_19, *r4_10, r2_67, r2_67 << 1)
                    r1_84 = r4_10[1]
                    *r4_10 = r0_109
                    r3_1 = r1_84 + 1
                    r4_10[2] = r5_17
                
                r4_10[1] = r3_1
                r0_109[r1_84] = __c.b
                int32_t* r0_125 = *r8
                int32_t r1_101 = *r0_125
                *r0_125 = r1_101 - 1
                uint32_t __c_1
                
                if (r1_101 == 0)
                    __c_1 = sub_e0ffc(r0_125)
                else
                    char* r1_102 = r0_125[1]
                    r0_125[1] = &r1_102[1]
                    __c_1 = zx.d(*r1_102)
                
                *arg1 = __c_1
                
                if (__c_1 == 0)
                    break
                
                if (memchr(&data_1bff98, __c_1, 2) == 0)
                    break
                
                uint8_t** r4_13 = arg1[0xf]
                int32_t r1_104 = r4_13[1]
                int32_t r2_82 = r4_13[2]
                r3_1 = r1_104 + 1
                uint8_t* r0_135
                
                if (r3_1 u<= r2_82)
                    r0_135 = *r4_13
                else
                    if (r2_82 u>= 0x7ffffffe)
                        goto label_d029c
                    
                    r0_19 = arg1[0xd]
                    
                    if (0xfffffffe == r2_82 << 1)
                        goto label_d02a0
                    
                    int32_t r5_23
                    r0_135, r4_13, r5_23, r8 = sub_d14cc(r0_19, *r4_13, r2_82, r2_82 << 1)
                    r1_104 = r4_13[1]
                    *r4_13 = r0_135
                    r3_1 = r1_104 + 1
                    r4_13[2] = r5_23
                
                r4_13[1] = r3_1
                r0_135[r1_104] = __c_1.b
                int32_t* r0_136 = *r8
                int32_t r1_106 = *r0_136
                *r0_136 = r1_106 - 1
                uint32_t r0_137
                
                if (r1_106 == 0)
                    r0_137 = sub_e0ffc(r0_136)
                else
                    char* r1_107 = r0_136[1]
                    r0_136[1] = &r1_107[1]
                    r0_137 = zx.d(*r1_107)
                
                *arg1 = r0_137
                break
            case 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39
            label_cfacc:
                int32_t* r4_11 = arg1[0xf]
                int32_t r1_86 = r4_11[1]
                int32_t r2_68 = r4_11[2]
                r3_1 = r1_86 + 1
                char* r0_112
                
                if (r3_1 u<= r2_68)
                    r0_112 = *r4_11
                else
                    if (r2_68 u>= 0x7ffffffe)
                        goto label_d029c
                    
                    r0_19 = arg1[0xd]
                    
                    if (0xfffffffe == r2_68 << 1)
                        goto label_d02a0
                    
                    int32_t r5_19
                    r0_112, r4_11, r5_19, r8, q0 = sub_d14cc(r0_19, *r4_11, r2_68, r2_68 << 1)
                    r1_86 = r4_11[1]
                    *r4_11 = r0_112
                    r3_1 = r1_86 + 1
                    r4_11[2] = r5_19
                
                r4_11[1] = r3_1
                r0_112[r1_86] = __c.b
                int32_t* r0_113 = *r8
                int32_t r1_88 = *r0_113
                *r0_113 = r1_88 - 1
                
                if (r1_88 == 0)
                    __c_2 = sub_e0ffc(r0_113)
                else
                    char* r1_89 = r0_113[1]
                    r0_113[1] = &r1_89[1]
                    __c_2 = zx.d(*r1_89)
                
                *arg1 = __c_2
                __s = &data_1c0b66
                
                if (__c != 0x30 || __c_2 == 0)
                    goto label_cff30
                
                if (memchr(0x1c0b69, __c_2, 3) == 0)
                    goto label_cff30
                
                int32_t* r4_12 = arg1[0xf]
                int32_t r1_91 = r4_12[1]
                int32_t r2_71 = r4_12[2]
                r3_1 = r1_91 + 1
                uint8_t* r0_116
                
                if (r3_1 u<= r2_71)
                    r0_116 = *r4_12
                else
                    if (r2_71 u>= 0x7ffffffe)
                        goto label_d029c
                    
                    r0_19 = arg1[0xd]
                    
                    if (0xfffffffe == r2_71 << 1)
                        goto label_d02a0
                    
                    int32_t r5_21
                    r0_116, r4_12, r5_21, r8, q0 = sub_d14cc(r0_19, *r4_12, r2_71, r2_71 << 1)
                    r1_91 = r4_12[1]
                    *r4_12 = r0_116
                    r3_1 = r1_91 + 1
                    r4_12[2] = r5_21
                
                r4_12[1] = r3_1
                r0_116[r1_91] = __c_2.b
                int32_t* r0_117 = *r8
                int32_t r1_93 = *r0_117
                *r0_117 = r1_93 - 1
                
                if (r1_93 == 0)
                    __c_2 = sub_e0ffc(r0_117)
                else
                    char* r1_94 = r0_117[1]
                    r0_117[1] = &r1_94[1]
                    __c_2 = zx.d(*r1_94)
                
                __s = &data_1c0b6c
                goto label_cff1c
            case 0x3a
                int32_t* r0_76 = *r8
                int32_t r1_57 = *r0_76
                *r0_76 = r1_57 - 1
                uint32_t r0_77
                
                if (r1_57 == 0)
                    r0_77 = sub_e0ffc(r0_76)
                else
                    char* r1_58 = r0_76[1]
                    r0_76[1] = &r1_58[1]
                    r0_77 = zx.d(*r1_58)
                
                *arg1 = r0_77
                
                if (r0_77 == 0x3a)
                    int32_t* r0_123 = *r8
                    int32_t r1_99 = *r0_123
                    *r0_123 = r1_99 - 1
                    uint32_t r0_124
                    
                    if (r1_99 == 0)
                        r0_124 = sub_e0ffc(r0_123)
                    else
                        char* r1_100 = r0_123[1]
                        r0_123[1] = &r1_100[1]
                        r0_124 = zx.d(*r1_100)
                    
                    *arg1 = r0_124
                
                break
            case 0x3c
                int32_t* r0_74 = *r8
                int32_t r1_55 = *r0_74
                *r0_74 = r1_55 - 1
                uint32_t r0_75
                
                if (r1_55 == 0)
                    r0_75 = sub_e0ffc(r0_74)
                else
                    char* r1_56 = r0_74[1]
                    r0_74[1] = &r1_56[1]
                    r0_75 = zx.d(*r1_56)
                
                *arg1 = r0_75
                
                if (r0_75 == 0x3d)
                    int32_t* r0_121 = *r8
                    int32_t r1_97 = *r0_121
                    *r0_121 = r1_97 - 1
                    uint32_t r0_122
                    
                    if (r1_97 == 0)
                        r0_122 = sub_e0ffc(r0_121)
                    else
                        char* r1_98 = r0_121[1]
                        r0_121[1] = &r1_98[1]
                        r0_122 = zx.d(*r1_98)
                    
                    *arg1 = r0_122
                
                break
            case 0x3d
                int32_t* r0_67 = *r8
                int32_t r1_47 = *r0_67
                *r0_67 = r1_47 - 1
                uint32_t r0_68
                
                if (r1_47 == 0)
                    r0_68 = sub_e0ffc(r0_67)
                else
                    char* r1_48 = r0_67[1]
                    r0_67[1] = &r1_48[1]
                    r0_68 = zx.d(*r1_48)
                
                *arg1 = r0_68
                
                if (r0_68 == 0x3d)
                    int32_t* r0_105 = *r8
                    int32_t r1_81 = *r0_105
                    *r0_105 = r1_81 - 1
                    uint32_t r0_106
                    
                    if (r1_81 == 0)
                        r0_106 = sub_e0ffc(r0_105)
                    else
                        char* r1_82 = r0_105[1]
                        r0_105[1] = &r1_82[1]
                        r0_106 = zx.d(*r1_82)
                    
                    *arg1 = r0_106
                
                break
            case 0x3e
                int32_t* r0_25 = *r8
                int32_t r1_12 = *r0_25
                *r0_25 = r1_12 - 1
                uint32_t r0_26
                
                if (r1_12 == 0)
                    r0_26 = sub_e0ffc(r0_25)
                else
                    char* r1_13 = r0_25[1]
                    r0_25[1] = &r1_13[1]
                    r0_26 = zx.d(*r1_13)
                
                *arg1 = r0_26
                
                if (r0_26 == 0x3d)
                    int32_t* r0_103 = *r8
                    int32_t r1_78 = *r0_103
                    *r0_103 = r1_78 - 1
                    uint32_t r0_104
                    
                    if (r1_78 == 0)
                        r0_104 = sub_e0ffc(r0_103)
                    else
                        char* r1_79 = r0_103[1]
                        r0_103[1] = &r1_79[1]
                        r0_104 = zx.d(*r1_79)
                    
                    *arg1 = r0_104
                
                break
            case 0x5b
                int32_t r0_28 = sub_d047c(arg1)
                
                if (r0_28 s>= 0)
                    sub_d0600(arg1, var_38, r0_28)
                    break
                
                cond:34_1 = r0_28 == 0xffffffff
                
                if (r0_28 == 0xffffffff)
                    break
                
                r1_80 = "invalid long string delimiter"
            label_cfebc:
                sub_ce79c(arg1, r1_80, 0x121, arg3)
            label_cfed4:
                char* r0_140 = sub_d09b0(arg1, arg1, 1, "invalid escape sequence")
                
                if (cond:34_1)
                    *r0_140
                
            label_cfedc:
                r2_33 = 2
            label_cfeec:
                r3_16 = "hexadecimal digit expected"
            label_cff04:
                __c, __c_2, r8, r11_1 = sub_d09b0(arg1, &__c_3, r2_33, r3_16)
                goto label_cff18
            case 0x7e
                int32_t* r0_72 = *r8
                int32_t r1_53 = *r0_72
                *r0_72 = r1_53 - 1
                uint32_t r0_73
                
                if (r1_53 == 0)
                    r0_73 = sub_e0ffc(r0_72)
                else
                    char* r1_54 = r0_72[1]
                    r0_72[1] = &r1_54[1]
                    r0_73 = zx.d(*r1_54)
                
                *arg1 = r0_73
                
                if (r0_73 == 0x3d)
                    int32_t* r0_119 = *r8
                    int32_t r1_95 = *r0_119
                    *r0_119 = r1_95 - 1
                    uint32_t r0_120
                    
                    if (r1_95 == 0)
                        r0_120 = sub_e0ffc(r0_119)
                    else
                        char* r1_96 = r0_119[1]
                        r0_119[1] = &r1_96[1]
                        r0_120 = zx.d(*r1_96)
                    
                    *arg1 = r0_120
                
                break
            case 0xffffffff
                break
    void* const r4_2 = &data_1d12b4
    
    if ((zx.d(*(__c + 0x1d12b5)) & 1) != 0)
        int32_t r9_1 = 0xfffffffe
        
        do
            char** r7_2 = arg1[0xf]
            int32_t r1_66 = r7_2[1]
            int32_t r2_55 = r7_2[2]
            r3_1 = r1_66 + 1
            char* r0_90
            
            if (r3_1 u<= r2_55)
                r0_90 = *r7_2
            else
                if (r2_55 u>= 0x7ffffffe)
                    goto label_d029c
                
                r0_19 = arg1[0xd]
                
                if (r9_1 == r2_55 << 1)
                    goto label_d02a0
                
                int32_t r5_14
                r0_90, r4_2, r5_14, r8, r9_1 = sub_d14cc(r0_19, *r7_2, r2_55, r2_55 << 1)
                r1_66 = r7_2[1]
                *r7_2 = r0_90
                r3_1 = r1_66 + 1
                r7_2[2] = r5_14
            
            r7_2[1] = r3_1
            r0_90[r1_66] = __c.b
            int32_t* r0_91 = *r8
            int32_t r1_68 = *r0_91
            *r0_91 = r1_68 - 1
            
            if (r1_68 == 0)
                __c = sub_e0ffc(r0_91)
            else
                char* r1_69 = r0_91[1]
                r0_91[1] = &r1_69[1]
                __c = zx.d(*r1_69)
            
            *arg1 = __c
        while ((zx.d(*(r4_2 + __c + 1)) & 3) != 0)
        
        void** r0_95 = arg1[0xf]
        int32_t* r5_15 = arg1[0xd]
        void* r6_2 = sub_d7eb4(r5_15, *r0_95, r0_95[1])
        void** r0_98 = r5_15[2]
        r5_15[2] = &r0_98[4]
        *r0_98 = r6_2
        r0_98[2] = zx.d(*(r6_2 + 4)) | 0x40
        int32_t* r0_101 =
            sub_daf38(r5_15, *(arg1[0xc] + 4), r5_15[2] - 0x10, r4_2, r5_15, r6_2, arg1, r11_1)
        int64_t* r4_9
        
        if (r0_101[2] == 0)
            r4_9 = var_38
            r0_101[2] = 1
            *r0_101 = 1
            
            if (*(r5_15[3] + 0xc) s>= 1)
                sub_cc158(r5_15)
        else
            r6_2 = r0_101[4]
            r4_9 = var_38
        
        r5_15[2] -= 0x10
        *r4_9 = r6_2
        zx.d(*(r6_2 + 4)) == 4 && zx.d(*(r6_2 + 6)) == 0
    else
        int32_t* r0_23 = *r8
        int32_t r1_10 = *r0_23
        *r0_23 = r1_10 - 1
        uint32_t r0_24
        
        if (r1_10 == 0)
            r0_24 = sub_e0ffc(r0_23)
        else
            char* r1_11 = r0_23[1]
            r0_23[1] = &r1_11[1]
            r0_24 = zx.d(*r1_11)
        
        *arg1 = r0_24
    
    break

if (*__stack_chk_guard != r0)
    __stack_chk_fail()
    noreturn

*(r11_1 - 0x1c)
*(r11_1 - 0x18)
*(r11_1 - 0x14)
*(r11_1 - 0x10)
*(r11_1 - 0xc)
*(r11_1 - 8)
*(r11_1 - 4)
*r11_1
jump(r11_1[1])
