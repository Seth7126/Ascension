// 函数: sub_19ec40
// 地址: 0x19ec40
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* var_c = arg5
void* result_12
void* result_15 = result_12
void* result_11
void* result_14 = result_11
int32_t __saved_r7
int32_t* var_24 = &__saved_r7
void* result_2 = result_12
void* result_1 = result_11
void* var_34 = arg4
int32_t var_38 = arg3
int32_t r0 = *__stack_chk_guard
result_1 = nullptr
char* r2 = *arg1
void* r1 = arg1[1]
int32_t r0_1 = r1 - r2
void* result
struct (anonymous namespace)::Node::(anonymous namespace)::ElaboratedTypeSpefType::VTable** result_3
void* result_13

if (r1 == r2)
label_19f006:
    result_3 = sub_1a4874(arg1)
label_19f00a:
    result_13 = result_3
    result_1 = result_3
label_19f00e:
    
    if (result_13 == 0)
        result = nullptr
    else
        sub_19f9dc(&arg1[0x25], &result_1)
        result = result_1
else
    uint32_t r3 = zx.d(*r2)
    
    if (r3 - 0x41 u> 0x39)
        goto label_19f006
    
    void* result_4
    void* const r1_9
    struct (anonymous namespace)::Node::(anonymous namespace)::LValueReferenceType::VTable* const 
        r1_11
    char const* const r1_18
    char r2_2
    char const* const r3_4
    char const* const r3_5
    int32_t r5_2
    void* r5_3
    char const* const r6
    char const* const r6_1
    
    switch (r3)
        case 0x41
            if (r2 == r1)
            label_19f422:
                result_13 = nullptr
            label_19f424:
                result_1 = result_13
                goto label_19f00e
            
            *arg1 = &r2[1]
            struct (anonymous namespace)::Node::(anonymous namespace)::ArrayType::VTable** result_16
            int32_t r1_6
            void* result_8
            void* r3_3
            
            if (r1 == &r2[1] || zx.d(r2[1]) - 0x30 u> 9)
                if (&r2[1] != r1 && zx.d(r2[1]) == 0x5f)
                    *arg1 = &r2[2]
                    int32_t r0_90 = sub_19ec40(arg1)
                    result_13 = nullptr
                    
                    if (r0_90 != 0)
                        void* result_17 = sub_19fbde(&arg1[0x5c], 0x14)
                        *result_17 = &_vtable_for_(anonymous namespace)::ArrayType{for `(anonymous namespace)::Node'}
                        *(result_17 + 4) = 0x100000f
                        *(result_17 + 8) = r0_90
                        *(result_17 + 0xc) = 0
                        *(result_17 + 0x10) = 0
                        result_13 = result_17
                    
                    goto label_19f424
                
                void* result_18 = sub_1a09b8(arg1)
                
                if (result_18 == 0)
                    goto label_19f422
                
                char* r0_93 = *arg1
                
                if (r0_93 == arg1[1])
                    goto label_19f422
                
                uint32_t r1_31 = zx.d(*r0_93)
                
                if (r1_31 != 0x5f)
                    goto label_19f422
                
                *arg1 = &r0_93[1]
                int32_t r0_96 = sub_19ec40(arg1, r1_31)
                
                if (r0_96 == 0)
                    goto label_19f422
                
                result_16 = sub_19fbde(&arg1[0x5c], 0x14)
                r1_6 = r0_96
                result_8 = result_18
                r3_3 = nullptr
                result_13 = result_16
            else
                result_13 = nullptr
                sub_19ebc4(&result_2, arg1, 0)
                char* r0_6 = *arg1
                
                if (r0_6 == arg1[1])
                    goto label_19f424
                
                uint32_t r1_5 = zx.d(*r0_6)
                
                if (r1_5 != 0x5f)
                    goto label_19f422
                
                *arg1 = &r0_6[1]
                int32_t r0_9 = sub_19ec40(arg1, r1_5)
                
                if (r0_9 == 0)
                    goto label_19f422
                
                result_16 = sub_19fbde(&arg1[0x5c], 0x14)
                result_8 = result_2
                r3_3 = arg5
                r1_6 = r0_9
                result_13 = result_16
                
                if (r3_3 == 0)
                    result_8 += 1
                    r3_3 += 1
            
            sub_1a4c50(result_16, r1_6, result_8, r3_3)
            goto label_19f424
        case 0x42, 0x45, 0x48, 0x49, 0x4a, 0x4c, 0x4e, 0x51, 0x57, 0x58, 0x59, 0x5a, 0x5b, 0x5c, 
                0x5d, 0x5e, 0x5f, 0x60, 0x6b, 0x70, 0x71
            goto label_19f006
        case 0x43
            *arg1 = &r2[1]
            int32_t r0_13 = sub_19ec40(arg1)
            
            if (r0_13 == 0)
                result = nullptr
            else
                r5_2 = r0_13
                result_4 = sub_19fbde(&arg1[0x5c], 0x14)
                r3_4 = " complex"
                r6 = &data_1d05bd[8]
            label_19ee86:
                *result_4 = &_vtable_for_(anonymous namespace)::PostfixQualifiedType{for `(anonymous namespace)::Node'}
                *(result_4 + 4) = 0x1010105
                *(result_4 + 8) = r5_2
                *(result_4 + 0xc) = r3_4
                *(result_4 + 0x10) = r6
            label_19ef96:
                result_1 = result_4
                sub_19f9dc(&arg1[0x25], &result_1)
                result = result_1
        case 0x44
            if (r0_1 u< 2)
                result = nullptr
            else
                int32_t r1_7 = zx.d(r2[1]) - 0x4f
                result = nullptr
                char const* const r1_23
                char const* const r1_24
                char const* const r1_28
                
                switch (r1_7)
                    case 0, 0x20, 0x28, 0x29
                        result_3 = sub_1a44d4(arg1, arg5)
                        goto label_19f00a
                    case 5, 0x25
                        result_3 = sub_1a0370(arg1, r1_7, r2)
                        goto label_19f00a
                    case 0x12
                        *arg1 = &r2[2]
                        result = sub_1a085e(arg1, "auto")
                    case 0x14
                        r1_24 = "decltype(auto)"
                    label_19f286:
                        *arg1 = &r2[2]
                        result = sub_1a3840(arg1, r1_24)
                    case 0x15
                        r1_28 = "decimal64"
                    label_19f278:
                        *arg1 = &r2[2]
                        result = sub_1a37c4(arg1, r1_28)
                    case 0x16
                        *arg1 = &r2[2]
                        result = sub_1a37a8(arg1, "decimal128")
                    case 0x17
                        r1_28 = "decimal32"
                        goto label_19f278
                    case 0x19
                        r1_28 = "decimal16"
                        goto label_19f278
                    case 0x1a
                        r1_23 = "char32_t"
                    label_19f2c0:
                        *arg1 = &r2[2]
                        result = sub_1a4858(arg1, r1_23)
                    case 0x1f
                        r1_24 = "std::nullptr_t"
                        goto label_19f286
                    case 0x21
                        *arg1 = &r2[2]
                        void* result_7 = sub_19ec40(arg1, r1_7)
                        result_2 = result_7
                        
                        if (result_7 != 0)
                            result_4 = sub_1a24f8(arg1, &result_2)
                            goto label_19ef96
                        
                        result = nullptr
                    case 0x24
                        r1_23 = "char16_t"
                        goto label_19f2c0
                    case 0x27
                        if (sub_19e5e0(arg1, "Dv", 0x1d0609) == 0)
                            goto label_19f422
                        
                        char* r0_104 = *arg1
                        int32_t r1_35 = arg1[1]
                        struct 
                            (anonymous namespace)::Node::(anonymous namespace)::VectorType::VTable**
                             result_19
                        int32_t r1_39
                        void* result_10
                        void* r3_7
                        
                        if (r1_35 == r0_104 || zx.d(*r0_104 - 0x31) u> 8)
                            uint32_t r1_38
                            
                            if (r0_104 != r1_35)
                                r1_38 = zx.d(*r0_104)
                            
                            if (r0_104 == r1_35 || r1_38 != 0x5f)
                                void* result_20 = sub_1a09b8(arg1)
                                
                                if (result_20 == 0)
                                    goto label_19f422
                                
                                char* r0_115 = *arg1
                                
                                if (r0_115 == arg1[1])
                                    goto label_19f422
                                
                                uint32_t r1_41 = zx.d(*r0_115)
                                
                                if (r1_41 != 0x5f)
                                    goto label_19f422
                                
                                *arg1 = &r0_115[1]
                                int32_t r0_118 = sub_19ec40(arg1, r1_41)
                                
                                if (r0_118 == 0)
                                    goto label_19f422
                                
                                result_19 = sub_19fbde(&arg1[0x5c], 0x18)
                                result_13 = result_19
                                r1_39 = r0_118
                                result_10 = result_20
                                r3_7 = nullptr
                            else
                                *arg1 = &r0_104[1]
                                int32_t r0_112 = sub_19ec40(arg1, r1_38)
                                
                                if (r0_112 == 0)
                                    goto label_19f422
                                
                                result_19 = sub_19fbde(&arg1[0x5c], 0x18)
                                result_13 = result_19
                                r1_39 = r0_112
                                result_10 = 1
                                r3_7 = 1
                        else
                            result_13 = nullptr
                            sub_19ebc4(&result_2, arg1, 0)
                            char* r0_106 = *arg1
                            uint32_t r1_37 = arg1[1]
                            
                            if (r0_106 == r1_37)
                                goto label_19f424
                            
                            if (zx.d(*r0_106) != 0x5f)
                                goto label_19f422
                            
                            *arg1 = &r0_106[1]
                            
                            if (&r0_106[1] != r1_37)
                                r1_37 = zx.d(r0_106[1])
                                
                                if (r1_37 == 0x70)
                                    *arg1 = &r0_106[2]
                                    result_13 = sub_19fbde(&arg1[0x5c], 0x18)
                                    void* result_9 = result_2
                                    void* r3_6 = arg5
                                    *(result_13 + 0x14) = 1
                                    
                                    if (r3_6 == 0)
                                        result_9 += 1
                                        r3_6 += 1
                                    
                                    *result_13 = &_vtable_for_(anonymous namespace)::VectorType{for `(anonymous namespace)::Node'}
                                    *(result_13 + 4) = 0x101011a
                                    *(result_13 + 8) = 0
                                    *(result_13 + 0xc) = result_9
                                    *(result_13 + 0x10) = r3_6
                                    goto label_19f424
                            
                            int32_t r0_121 = sub_19ec40(arg1, r1_37)
                            
                            if (r0_121 == 0)
                                goto label_19f422
                            
                            result_19 = sub_19fbde(&arg1[0x5c], 0x18)
                            result_10 = result_2
                            r3_7 = arg5
                            result_13 = result_19
                            r1_39 = r0_121
                            
                            if (r3_7 == 0)
                                result_10 += 1
                                r3_7 += 1
                        
                        sub_1a4c20(result_19, r1_39, result_10, r3_7)
                        goto label_19f424
        case 0x46
            result_3 = sub_1a44d4(arg1, arg5)
            goto label_19f00a
        case 0x47
            *arg1 = &r2[1]
            int32_t r0_19 = sub_19ec40(arg1)
            
            if (r0_19 != 0)
                r5_2 = r0_19
                result_4 = sub_19fbde(&arg1[0x5c], 0x14)
                r3_4 = " imaginary"
                r6 = &data_1d05c6[0xa]
                goto label_19ee86
            
            result = nullptr
        case 0x4b, 0x56, 0x72
            r1 = __clz(r3 - 0x72) u>> 5
            
            if (r0_1 u> r1)
                arg5 = 1
                
                if (r3 == 0x72)
                    arg5 = 2
                
                if (zx.d(*(r2 + r1)) == 0x56)
                    r1 = arg5
            
            if (r0_1 u> r1)
                r3 = zx.d(*(r2 + r1))
                
                if (r3 == 0x4b)
                    r1 += 1
            
            if (r0_1 u<= r1)
                result_3 = sub_1a4704(arg1, r1, r2, r3, arg5)
                goto label_19f00a
            
            r3 = zx.d(*(r2 + r1))
            
            if (r3 == 0x46)
                result_3 = sub_1a44d4(arg1, arg5)
                goto label_19f00a
            
            if (r3 != 0x44)
                result_3 = sub_1a4704(arg1, r1, r2, r3, arg5)
                goto label_19f00a
            
            r1 += 1
            
            if (r0_1 u<= r1)
                result_3 = sub_1a4704(arg1, r1, r2, r3, arg5)
                goto label_19f00a
            
            uint32_t r0_2 = zx.d(*(r2 + r1))
            r1 = r0_2 - 0x6f
            
            if (r1 u> 9)
                if (r0_2 == 0x4f)
                    result_3 = sub_1a44d4(arg1, arg5)
                    goto label_19f00a
                
                result_3 = sub_1a4704(arg1, r1, r2, r3, arg5)
                goto label_19f00a
            
            r1 = 1 << r1
            
            if ((r1 & 0x301) != 0 || r0_2 == 0x4f)
                result_3 = sub_1a44d4(arg1, arg5)
                goto label_19f00a
            
            result_3 = sub_1a4704(arg1, r1, 0x301, r3, arg5)
            goto label_19f00a
        case 0x4d
            if (r2 == r1)
                goto label_19f422
            
            *arg1 = &r2[1]
            int32_t r0_23 = sub_19ec40(arg1)
            
            if (r0_23 == 0)
                goto label_19f422
            
            void* r0_25 = sub_19ec40(arg1)
            
            if (r0_25 == 0)
                goto label_19f422
            
            result_13 = sub_19fbde(&arg1[0x5c], 0x10)
            *(result_13 + 5) = *(r0_25 + 5)
            *(result_13 + 4) = 0xe
            *(result_13 + 6) = 0x101
            *result_13 = &_vtable_for_(anonymous namespace)::PointerToMemberType{for `(anonymous namespace)::Node'}
            *(result_13 + 8) = r0_23
            *(result_13 + 0xc) = r0_25
            goto label_19f424
        case 0x4f
            *arg1 = &r2[1]
            void* r0_30 = sub_19ec40(arg1)
            
            if (r0_30 != 0)
                r5_3 = r0_30
                result_4 = sub_19fbde(&arg1[0x5c], 0xc)
                *(result_4 + 5) = *(r5_3 + 5)
                r1_9 = &data_1ddf90
                r2_2 = 0xd
            label_19ef30:
                r1_11 = r1_9 + 8
                *(result_4 + 4) = r2_2
                *(result_4 + 6) = 0x101
                goto label_19ef92
            
            result = nullptr
        case 0x50
            *arg1 = &r2[1]
            void* r0_34 = sub_19ec40(arg1)
            
            if (r0_34 != 0)
                r5_3 = r0_34
                result_4 = sub_19fbde(&arg1[0x5c], 0xc)
                r1_9 = &data_1ddf28
                *(result_4 + 5) = *(r5_3 + 5)
                r2_2 = 0xb
                goto label_19ef30
            
            result = nullptr
        case 0x52
            *arg1 = &r2[1]
            void* r0_38 = sub_19ec40(arg1)
            
            if (r0_38 != 0)
                r5_3 = r0_38
                result_4 = sub_19fbde(&arg1[0x5c], 0xc)
                *(result_4 + 5) = *(r5_3 + 5)
                *(result_4 + 4) = 0xc
                *(result_4 + 6) = 0x101
                r1_11 = &_vtable_for_(anonymous namespace)::LValueReferenceType{for `(anonymous namespace)::Node'}
            label_19ef92:
                *result_4 = r1_11
                *(result_4 + 8) = r5_3
                goto label_19ef96
            
            result = nullptr
        case 0x53
            if (r0_1 u< 2)
                goto label_19f006
            
            uint32_t r0_40 = zx.d(r2[1])
            
            if (r0_40 == 0 || r0_40 == 0x74)
                goto label_19f006
            
            result = sub_19fd40(arg1)
            result_2 = result
            
            if (result != 0 && zx.d(arg1[0x5a].b) != 0)
                char* r1_13 = *arg1
                
                if (arg1[1] != r1_13 && zx.d(*r1_13) == 0x49)
                    void* r0_43 = sub_19fe78(arg1, 0)
                    var_34 = r0_43
                    
                    if (r0_43 != 0)
                        result_4 = sub_1a0150(arg1, &result_2, &var_34)
                        goto label_19ef96
                    
                    result = nullptr
        case 0x54
            int32_t r0_45
            
            if (r0_1 u>= 2)
                r0_45 = zx.d(r2[1]) - 0x65
            
            if (r0_1 u>= 2 && r0_45 u<= 0x10
                    && (1 << r0_45 & &__elf_symbol_table[0x3e1].st_name:1) != 0)
                goto label_19f006
            
            void* result_5 = sub_1a01e4(arg1)
            result_1 = result_5
            
            if (result_5 == 0)
                result = nullptr
            else if (zx.d(arg1[0x5a].b) == 0)
                sub_19f9dc(&arg1[0x25], &result_1)
                result = result_1
            else
                char* r0_83 = *arg1
                
                if (arg1[1] == r0_83 || zx.d(*r0_83) != 0x49)
                    sub_19f9dc(&arg1[0x25], &result_1)
                    result = result_1
                else
                    void* result_6 = sub_19fe78(arg1, 0)
                    result_2 = result_6
                    
                    if (result_6 != 0)
                        result_4 = sub_1a0150(arg1, &result_1, &result_2)
                        goto label_19ef96
                    
                    result = nullptr
        case 0x55
            result_3 = sub_1a4704(arg1, r1, r2, r3, arg5)
            goto label_19f00a
        case 0x61
            *arg1 = &r2[1]
            result = sub_1a3824(arg1, "signed char")
        case 0x62
            r1_18 = "bool"
        label_19f10e:
            *arg1 = &r2[1]
            result = sub_1a085e(arg1, r1_18)
        case 0x63
            r1_18 = "char"
            goto label_19f10e
        case 0x64
            *arg1 = &r2[1]
            result = sub_19fbde(&arg1[0x5c], 0x10)
            r3_5 = "double"
            r6_1 = &data_1d0546[6]
        label_19f166:
            *result =
                &_vtable_for_(anonymous namespace)::NameType{for `(anonymous namespace)::Node'}
            *(result + 4) = 0x1010107
            *(result + 8) = r3_5
            *(result + 0xc) = r6_1
        case 0x65
            *arg1 = &r2[1]
            result = sub_1a3824(arg1, "long double")
        case 0x66
            *arg1 = &r2[1]
            result = sub_1a2550(arg1, "float")
        case 0x67
            *arg1 = &r2[1]
            result = sub_1a37a8(arg1, "__float128")
        case 0x68
            *arg1 = &r2[1]
            result = sub_1a483c(arg1, "unsigned char")
        case 0x69
            *arg1 = &r2[1]
            result = sub_1a01c8(arg1, &data_1d04ff)
        case 0x6a
            *arg1 = &r2[1]
            result = sub_1a385c(arg1, "unsigned int")
        case 0x6c
            r1_18 = "long"
            goto label_19f10e
        case 0x6d
            *arg1 = &r2[1]
            result = sub_1a483c(arg1, "unsigned long")
        case 0x6e
            *arg1 = &r2[1]
            result = sub_1a4858(arg1, "__int128")
        case 0x6f
            *arg1 = &r2[1]
            result = sub_1a3808(arg1, "unsigned __int128")
        case 0x73
            *arg1 = &r2[1]
            result = sub_1a2550(arg1, "short")
        case 0x74
            *arg1 = &r2[1]
            result = sub_1a3840(arg1, "unsigned short")
        case 0x75
            *arg1 = &r2[1]
            sub_1a3ecc(&result_2, arg1)
            
            if (result_2 == arg5)
                result = nullptr
            else
                result = sub_1a3248(arg1, &result_2)
        case 0x76
            r1_18 = "void"
            goto label_19f10e
        case 0x77
            *arg1 = &r2[1]
            result = sub_19fbde(&arg1[0x5c], 0x10)
            r3_5 = "wchar_t"
            r6_1 = &data_1cff83[7]
            goto label_19f166
        case 0x78
            *arg1 = &r2[1]
            result = sub_1a37c4(arg1, "long long")
        case 0x79
            *arg1 = &r2[1]
            result = sub_19fbde(&arg1[0x5c], 0x10)
            r3_5 = "unsigned long long"
            r6_1 = &data_1d052d[0x12]
            goto label_19f166
        case 0x7a
            *arg1 = &r2[1]
            result = sub_1a01c8(arg1, &data_1c0a4c)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
