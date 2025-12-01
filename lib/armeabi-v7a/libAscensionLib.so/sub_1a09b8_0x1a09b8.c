// 函数: sub_1a09b8
// 地址: 0x1a09b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r9 = arg1
int32_t r0 = *__stack_chk_guard
char var_39 = sub_19e5e0(r9, "gs", 0x1cfec2)
char* r0_3 = *r9
uint32_t r1 = r9[1]
char* r2 = r1 - r0_3
void* result

if (r2 u>= 2)
    uint32_t r5_1 = zx.d(*r0_3)
    result = nullptr
    void* var_38
    void* var_30
    int32_t var_2c
    void* const r0_107
    struct (anonymous namespace)::Node::(anonymous namespace)::InitListExpr::VTable** result_1
    void* const r1_2
    void* const r1_18
    char const* const r2_4
    char const* const r2_20
    char const* const r3_3
    void* r4_2
    int32_t r4_6
    void* r4_7
    int32_t r6_2
    char const* const r6_8
    
    if (r5_1 - 0x4c u<= 0x28)
        switch (r5_1)
            case 0x4c
                result = sub_1a1c18(r9, r1, r2, r5_1 - 0x4c, 0x1cfec0)
            case 0x54
                result = sub_1a01e4(r9)
            case 0x61
                uint32_t r1_6 = zx.d(r0_3[1])
                
                if (r1_6 == 0x4e)
                    r1_2 = &data_1cfec8
                    goto label_1a15ac
                
                if (r1_6 == 0x53)
                    r1_2 = &data_1cfecb
                    goto label_1a1498
                
                void* r0_136
                
                if (r1_6 == 0x7a)
                    *r9 = &r0_3[2]
                    r0_136 = sub_1a09b8(r9)
                label_1a1340:
                    var_30 = r0_136
                    
                    if (r0_136 == 0)
                    labelid_4:
                        result = nullptr
                    else
                        result = sub_1a1be8(r9, "alignof (", &var_30)
                else
                    if (r1_6 == 0x64)
                        r1_18 = &data_1cfec6
                        goto label_1a1518
                    
                    if (r1_6 == 0x6e)
                        r1_2 = &data_1cfec6
                        goto label_1a1498
                    
                    if (r1_6 == 0x74)
                        *r9 = &r0_3[2]
                        r0_136 = sub_19ec40(r9, r1_6, r2, r5_1 - 0x4c, 0x1cfec0)
                        goto label_1a1340
                    
                    if (r1_6 == 0x61)
                        r1_2 = &data_1cfec3
                        goto label_1a15ac
                    
                labelid_4:
                    result = nullptr
            case 0x63
                uint32_t r1_4 = zx.d(r0_3[1])
                
                if (r1_4 == 0x76)
                    int32_t r0_85
                    int32_t r1_23
                    int32_t r2_12
                    void* r3_7
                    r0_85, r1_23, r2_12, r3_7 = sub_19e5e0(r9, "cv", 0x1d0071)
                    result = nullptr
                    
                    if (r0_85 != 0)
                        char r4_5 = r9[0x5a].b
                        r9[0x5a].b = 0
                        void* r0_87 = sub_19ec40(r9, r1_23, r2_12, r3_7, 0x1cfec0)
                        r9[0x5a].b = r4_5
                        
                        if (r0_87 == 0)
                        labelid_4:
                            result = nullptr
                        else
                            char* r1_24 = *r9
                            int32_t r0_88 = r9[1]
                            struct (anonymous namespace)::Node::(anonymous namespace)::ConversionExpr::VTable
                                ** result_2
                            
                            if (r1_24 == r0_88 || zx.d(*r1_24) != 0x5f)
                                int32_t r0_222 = sub_1a09b8(r9, r1_24)
                                
                                if (r0_222 == 0)
                                labelid_4:
                                    result = nullptr
                                else
                                    void* r0_224 = sub_19fbde(&r9[0x5c], 4)
                                    *r0_224 = r0_222
                                    result_2 = sub_19fbde(&r9[0x5c], 0x14)
                                    result = result_2
                                    sub_1a2e70(result_2, r0_87, r0_224, 1)
                            else
                                int32_t r3_8 = r9[3]
                                int32_t r2_14 = r9[2]
                                void* r1_25 = &r1_24[1]
                                *r9 = r1_25
                                
                                while (r1_25 == r0_88 || zx.d(*r1_25) != 0x45)
                                    void* r0_92 = sub_1a09b8(r9)
                                    var_30 = r0_92
                                    
                                    if (r0_92 == 0)
                                        goto label_1a09f0_2
                                    
                                    sub_19f9dc(&r9[2], &var_30)
                                    r1_25 = *r9
                                    r0_88 = r9[1]
                                
                                *r9 = r1_25 + 1
                                sub_19fa46(&var_30, r9, (r3_8 - r2_14) s>> 2)
                                result_2 = sub_19fbde(&r9[0x5c], 0x14)
                                result = result_2
                                sub_1a2e70(result_2, r0_87, var_30, var_2c)
                else if (r1_4 == 0x6c)
                    *r9 = &r0_3[2]
                    int32_t r0_73 = sub_1a09b8(r9, r1_4)
                    
                    if (r0_73 == 0)
                    labelid_4:
                        result = nullptr
                    else
                        int32_t r8_4 = (r9[3] - r9[2]) s>> 2
                        
                        while (true)
                            char* r0_77 = *r9
                            uint32_t r1_21 = r9[1]
                            
                            if (r0_77 != r1_21)
                                r1_21 = zx.d(*r0_77)
                                
                                if (r1_21 == 0x45)
                                    *r9 = &r0_77[1]
                                    sub_19fa46(&var_30, r9, r8_4)
                                    result = sub_19fbde(&r9[0x5c], 0x14)
                                    void* r2_33 = var_30
                                    *result = &_vtable_for_(anonymous namespace)::CallExpr{for `(anonymous namespace)::Node'}
                                    *(result + 4) = 0x101012a
                                    *(result + 8) = r0_73
                                    *(result + 0xc) = r2_33
                                    *(result + 0x10) = var_2c
                                    break
                            
                            void* r0_79 = sub_1a09b8(r9, r1_21)
                            var_30 = r0_79
                            
                            if (r0_79 == 0)
                                goto label_1a09f0_2
                            
                            sub_19f9dc(&r9[2], &var_30)
                else
                    if (r1_4 == 0x6d)
                        r1_2 = &data_1cfee2
                        goto label_1a1498
                    
                    if (r1_4 == 0x6f)
                        r1_18 = &data_1cfee4
                        goto label_1a1518
                    
                    if (r1_4 != 0x63)
                    labelid_4:
                        result = nullptr
                    else
                        *r9 = &r0_3[2]
                        void* r0_17 = sub_19ec40(r9, r1_4, r2, r5_1 - 0x4c, 0x1cfec0)
                        
                        if (r0_17 == 0)
                        labelid_4:
                            result = nullptr
                        else
                            r4_2 = r0_17
                            int32_t r0_19 = sub_1a09b8(r9)
                            
                            if (r0_19 != 0)
                                r6_2 = r0_19
                                result = sub_19fbde(&r9[0x5c], 0x18)
                                r2_4 = "const_cast"
                                r3_3 = &data_1cfed7[0xa]
                                goto label_1a14fa
                            
                        labelid_4:
                            result = nullptr
            case 0x64
                uint32_t r1_8 = zx.d(r0_3[1])
                result = nullptr
                
                if (r1_8 - 0x6c u> 0xa)
                    if (r1_8 == 0x56)
                        r1_2 = &data_1cfef8
                        goto label_1a15ac
                    
                    if (r1_8 == 0x65)
                        r1_18 = &data_1cfef3
                        goto label_1a1518
                    
                    if (r1_8 == 0x63)
                        *r9 = &r0_3[2]
                        void* r0_183 = sub_19ec40(r9, r1_8, r1_8 - 0x6c, r5_1 - 0x4c, 0x1cfec0)
                        
                        if (r0_183 == 0)
                        labelid_4:
                            result = nullptr
                        else
                            r4_2 = r0_183
                            int32_t r0_185 = sub_1a09b8(r9)
                            
                            if (r0_185 == 0)
                            labelid_4:
                                result = nullptr
                            else
                                r6_2 = r0_185
                                result = sub_19fbde(&r9[0x5c], 0x18)
                                r2_4 = "dynamic_cast"
                                r3_3 = &data_1cfee6[0xc]
                            label_1a14fa:
                                *result = &_vtable_for_(anonymous namespace)::CastExpr{for `(anonymous namespace)::Node'}
                                *(result + 4) = 0x101012a
                                *(result + 8) = r2_4
                                *(result + 0xc) = r3_3
                                *(result + 0x10) = r4_2
                                *(result + 0x14) = r6_2
                    else if (r1_8 == 0x61)
                        *r9 = &r0_3[2]
                        void* r0_65 = sub_1a09b8(r9)
                        var_30 = r0_65
                        
                        if (r0_65 == 0)
                        labelid_4:
                            result = nullptr
                        else
                            var_38.b = 1
                            result = sub_1a21c8(r9, &var_30, &var_39, &var_38)
                else
                    switch (r1_8)
                        case 0x6c
                            *r9 = &r0_3[2]
                            void* r0_34 = sub_1a09b8(r9)
                            result = nullptr
                            var_30 = r0_34
                            
                            if (r0_34 != 0)
                                var_38.b = 0
                                result = sub_1a21c8(r9, &var_30, &var_39, &var_38)
                        case 0x6e
                            result = sub_1a2204(r9)
                        case 0x73
                            *r9 = &r0_3[2]
                            void* r0_164 = sub_1a09b8(r9)
                            var_30 = r0_164
                            
                            if (r0_164 == 0)
                            labelid_4:
                                result = nullptr
                            else
                                void* r0_166 = sub_1a09b8(r9)
                                var_38 = r0_166
                                
                                if (r0_166 == 0)
                                labelid_4:
                                    result = nullptr
                                else
                                    result = sub_1a2398(r9, &var_30, &data_1cfef5, &var_38)
                        case 0x74
                            *r9 = &r0_3[2]
                            int32_t r0_170 = sub_1a09b8(r9)
                            
                            if (r0_170 == 0)
                            labelid_4:
                                result = nullptr
                            else
                                int32_t r0_172 = sub_1a09b8(r9)
                                
                                if (r0_172 == 0)
                                labelid_4:
                                    result = nullptr
                                else
                                    result = sub_19fbde(&r9[0x5c], 0x18)
                                    *result = &_vtable_for_(anonymous namespace)::MemberExpr{for `(anonymous namespace)::Node'}
                                    *(result + 4) = 0x101012a
                                    *(result + 8) = r0_170
                                    *(result + 0xc) = &data_1bff98
                                    *(result + 0x10) = &data_1bff99
                                    *(result + 0x14) = r0_172
                        case 0x76
                            r1_2 = &data_1c0e1b
                            goto label_1a1498
            case 0x65
                uint32_t r1_3 = zx.d(r0_3[1])
                
                if (r1_3 == 0x4f)
                    r1_2 = &data_1cfefd
                    goto label_1a15ac
                
                if (r1_3 == 0x71)
                    r1_2 = &data_1c0a50
                    goto label_1a15ac
                
                if (r1_3 == 0x6f)
                    r1_2 = &data_1cfefb
                    goto label_1a1498
                
            labelid_4:
                result = nullptr
            case 0x66
                uint32_t r3_4 = zx.d(r0_3[1])
                
                if (r3_4 == 0x70)
                    result = sub_1a208c(r9)
                else if (r2 u< 3 || r3_4 != 0x4c)
                label_1a0e64:
                    bool cond:4_1 = r0_3 == r1
                    
                    if (r0_3 != r1)
                        r2 = &r0_3[1]
                        *r9 = r2
                        cond:4_1 = r1 == r2
                    
                    if (cond:4_1)
                    labelid_4:
                        result = nullptr
                    else
                        uint32_t r6_4 = zx.d(*r2)
                        int32_t r5_2 = 1
                        
                        if (r6_4 == 0x4c)
                            goto label_1a0e90
                        
                        if (r6_4 == 0x72)
                        label_1a0e8a:
                            r5_2 = 0
                        label_1a0e90:
                            *r9 = &r0_3[2]
                            void* const var_40_1
                            void* const r0_62
                            void* r8_3
                            
                            if (sub_19e5e0(r9, "aa", 0x1d0001) == 0)
                                void* r0_228
                                
                                if (sub_19e5e0(r9, "an", 0x1d0004) != 0)
                                    r0_228 = &data_1cfec6
                                label_1a172e:
                                    var_40_1 = r0_228
                                    r8_3 = r0_228 + 1
                                    goto label_1a1736
                                
                                if (sub_19e5e0(r9, "aN", 0x1d0007) != 0)
                                    r0_62 = &data_1cfec8
                                    goto label_1a0ea8
                                
                                if (sub_19e5e0(r9, "aS", 0x1d000a) != 0)
                                    r0_228 = &data_1cfecb
                                    goto label_1a172e
                                
                                if (sub_19e5e0(r9, "cm", 0x1d000d) != 0)
                                    r0_228 = &data_1cfee2
                                    goto label_1a172e
                                
                                void* r0_262
                                
                                if (sub_19e5e0(r9, "ds", 0x1d0010) != 0)
                                    r0_262 = &data_1cfef5
                                label_1a18a6:
                                    var_40_1 = r0_262
                                    r8_3 = r0_262 + 2
                                    goto label_1a1736
                                
                                void* r0_265
                                
                                if (sub_19e5e0(r9, "dv", 0x1d0013) != 0)
                                    r0_265 = &data_1c0e1b
                                label_1a18c0:
                                    var_40_1 = r0_265
                                    r8_3 = r0_265 + 1
                                    goto label_1a1736
                                
                                if (sub_19e5e0(r9, "dV", 0x1d0016) != 0)
                                    r0_262 = &data_1cfef8
                                    goto label_1a18a6
                                
                                if (sub_19e5e0(r9, "eo", 0x1d0019) != 0)
                                    r0_265 = &data_1cfefb
                                    goto label_1a18c0
                                
                                if (sub_19e5e0(r9, "eO", 0x1d001c) != 0)
                                    r0_262 = &data_1cfefd
                                    goto label_1a18a6
                                
                                if (sub_19e5e0(r9, "eq", 0x1d001f) != 0)
                                    r0_262 = &data_1c0a50
                                    goto label_1a18a6
                                
                                if (sub_19e5e0(r9, "ge", 0x1d0022) != 0)
                                    r0_262 = &data_1c0a53
                                    goto label_1a18a6
                                
                                if (sub_19e5e0(r9, "gt", 0x1d0025) != 0)
                                    r0_265 = &data_1cff00
                                    goto label_1a18c0
                                
                                if (sub_19e5e0(r9, "le", 0x1d0028) != 0)
                                    r0_262 = &data_1c0a56
                                    goto label_1a18a6
                                
                                if (sub_19e5e0(r9, "ls", 0x1d002b) != 0)
                                    r0_262 = &data_1cff02
                                    goto label_1a18a6
                                
                                void* r0_284
                                
                                if (sub_19e5e0(r9, "lS", 0x1d002e) != 0)
                                    r0_284 = &data_1cff05
                                label_1a19ba:
                                    r8_3 = r0_284 + 3
                                    var_40_1 = r0_284
                                    goto label_1a1736
                                
                                if (sub_19e5e0(r9, "lt", 0x1d0031) != 0)
                                    r0_265 = &data_1cff09
                                    goto label_1a18c0
                                
                                if (sub_19e5e0(r9, "mi", 0x1d0034) != 0)
                                    r0_265 = &data_1c1b13
                                    goto label_1a18c0
                                
                                if (sub_19e5e0(r9, "mI", 0x1d0037) != 0)
                                    r0_262 = &data_1cff0b
                                    goto label_1a18a6
                                
                                if (sub_19e5e0(r9, "ml", 0x1d003a) != 0)
                                    r0_265 = &data_1cfef3
                                    goto label_1a18c0
                                
                                if (sub_19e5e0(r9, "mL", 0x1d003d) != 0)
                                    r0_262 = &data_1cff0e
                                    goto label_1a18a6
                                
                                if (sub_19e5e0(r9, "ne", 0x1d0040) != 0)
                                    r0_262 = &data_1cff11
                                    goto label_1a18a6
                                
                                if (sub_19e5e0(r9, "oo", 0x1d0043) != 0)
                                    r0_262 = &data_1cff21
                                    goto label_1a18a6
                                
                                if (sub_19e5e0(r9, "or", 0x1c0a30) != 0)
                                    r0_265 = &data_1cff24
                                    goto label_1a18c0
                                
                                if (sub_19e5e0(r9, "oR", 0x1d0046) != 0)
                                    r0_262 = &data_1cff26
                                    goto label_1a18a6
                                
                                if (sub_19e5e0(r9, "pl", 0x1d0049) != 0)
                                    r0_265 = &data_1cff2d
                                    goto label_1a18c0
                                
                                if (sub_19e5e0(r9, "pL", 0x1d004c) != 0)
                                    r0_262 = &data_1cff2f
                                    goto label_1a18a6
                                
                                if (sub_19e5e0(r9, "rm", 0x1d004f) != 0)
                                    r0_265 = &data_1c0f6d
                                    goto label_1a18c0
                                
                                if (sub_19e5e0(r9, "rM", 0x1d0052) != 0)
                                    r0_262 = &data_1cff49
                                    goto label_1a18a6
                                
                                if (sub_19e5e0(r9, "rs", 0x1d0055) != 0)
                                    r0_262 = &data_1cff4c
                                    goto label_1a18a6
                                
                                if (sub_19e5e0(r9, "rS", 0x1d0058) != 0)
                                    r0_284 = &data_1cff4f
                                    goto label_1a19ba
                                
                            labelid_4:
                                result = nullptr
                            else
                                r0_62 = &data_1cfec3
                            label_1a0ea8:
                                var_40_1 = r0_62
                                r8_3 = r0_62 + 2
                            label_1a1736:
                                int32_t r0_230 = sub_1a09b8(r9)
                                
                                if (r0_230 == 0)
                                labelid_4:
                                    result = nullptr
                                else
                                    bool cond:20_1 = r6_4 != 0x52
                                    int32_t r4_13 = r0_230
                                    
                                    if (r6_4 != 0x52)
                                        cond:20_1 = r6_4 != 0x4c
                                    
                                    int32_t r6_15
                                    
                                    if (cond:20_1)
                                        r6_15 = 0
                                    label_1a17f4:
                                        result = sub_19fbde(&r9[0x5c], 0x1c)
                                        *result = &_vtable_for_(anonymous namespace)::FoldExpr{for `(anonymous namespace)::Node'}
                                        *(result + 4) = 0x101012a
                                        *(result + 8) = r4_13
                                        *(result + 0xc) = r6_15
                                        *(result + 0x10) = var_40_1
                                        *(result + 0x14) = r8_3
                                        *(result + 0x18) = r5_2.b
                                    else
                                        int32_t r0_232 = sub_1a09b8(r9)
                                        
                                        if (r0_232 != 0)
                                            r6_15 = r0_232
                                            int32_t r0_233 = r4_13
                                            
                                            if (r5_2 != 0)
                                                r0_233 = r6_15
                                                r6_15 = r4_13
                                            
                                            r4_13 = r0_233
                                            goto label_1a17f4
                                        
                                    labelid_4:
                                        result = nullptr
                        else
                            if (r6_4 == 0x6c)
                                goto label_1a0e90
                            
                            if (r6_4 == 0x52)
                                goto label_1a0e8a
                            
                        labelid_4:
                            result = nullptr
                else
                    r2 = zx.d(r0_3[2]) - 0x30
                    
                    if (r2 u> 9)
                        goto label_1a0e64
                    
                    result = sub_1a208c(r9)
            case 0x67
                uint32_t r1_7 = zx.d(r0_3[1])
                
                if (r1_7 == 0x74)
                    r1_2 = &data_1cff00
                label_1a1498:
                    *r9 = &r0_3[2]
                    result = sub_1a213c(r9, r1_2, r1_2 + 1)
                else
                    if (r1_7 == 0x65)
                        r1_2 = &data_1c0a53
                        goto label_1a15ac
                    
                labelid_4:
                    result = nullptr
            case 0x69
                uint32_t r2_2 = zx.d(r0_3[1])
                
                if (r2_2 == 0x6c)
                    int32_t r3_6 = r9[3]
                    int32_t r2_9 = r9[2]
                    void* r0_67 = &r0_3[2]
                    *r9 = r0_67
                    
                    while (r0_67 == r1 || zx.d(*r0_67) != 0x45)
                        void* r0_70 = sub_1a23c8(r9)
                        var_30 = r0_70
                        
                        if (r0_70 == 0)
                            goto label_1a09f0_2
                        
                        sub_19f9dc(&r9[2], &var_30)
                        r0_67 = *r9
                        r1 = r9[1]
                    
                    *r9 = r0_67 + 1
                    sub_19fa46(&var_30, r9, (r3_6 - r2_9) s>> 2)
                    result_1 = sub_19fbde(&r9[0x5c], 0x14)
                    result = result_1
                    sub_1a3ab8(result_1, nullptr, var_30, var_2c)
                else if (r2_2 != 0x78)
                labelid_4:
                    result = nullptr
                else
                    *r9 = &r0_3[2]
                    int32_t r0_9 = sub_1a09b8(r9)
                    
                    if (r0_9 == 0)
                    labelid_4:
                        result = nullptr
                    else
                        int32_t r0_11 = sub_1a09b8(r9)
                        
                        if (r0_11 == 0)
                        labelid_4:
                            result = nullptr
                        else
                            result = sub_19fbde(&r9[0x5c], 0x10)
                            *result = &_vtable_for_(anonymous namespace)::ArraySubscriptExpr{for `(anonymous namespace)::Node'}
                            *(result + 4) = 0x101012a
                            *(result + 8) = r0_9
                            *(result + 0xc) = r0_11
            case 0x6c
                uint32_t r1_1 = zx.d(r0_3[1])
                
                if (r1_1 == 0x53)
                    r1_2 = &data_1cff05
                label_1a1202:
                    *r9 = &r0_3[2]
                    result = sub_1a213c(r9, r1_2, r1_2 + 3)
                else
                    if (r1_1 == 0x74)
                        r1_2 = &data_1cff09
                        goto label_1a1498
                    
                    if (r1_1 == 0x73)
                        r1_2 = &data_1cff02
                        goto label_1a15ac
                    
                    if (r1_1 == 0x65)
                        r1_2 = &data_1c0a56
                        goto label_1a15ac
                    
                labelid_4:
                    result = nullptr
            case 0x6d
                uint32_t r2_1 = zx.d(r0_3[1])
                
                if (r2_1 == 0x49)
                    r1_2 = &data_1cff0b
                label_1a15ac:
                    *r9 = &r0_3[2]
                    result = sub_1a213c(r9, r1_2, r1_2 + 2)
                else
                    if (r2_1 == 0x4c)
                        r1_2 = &data_1cff0e
                        goto label_1a15ac
                    
                    if (r2_1 == 0x6d)
                        *r9 = &r0_3[2]
                        
                        if (&r0_3[2] != r1)
                            r1 = zx.d(r0_3[2])
                            
                            if (r1 != 0x5f)
                                goto label_1a1406
                            
                            r1_18 = &data_1c1b15
                            goto label_1a11f4
                        
                    label_1a1406:
                        void* r0_161 = sub_1a09b8(r9, r1)
                        var_30 = r0_161
                        
                        if (r0_161 == 0)
                        labelid_4:
                            result = nullptr
                        else
                            result = sub_1a24cc(r9, &var_30, &data_1c1b15)
                    else
                        if (r2_1 == 0x6c)
                            r1_2 = &data_1cfef3
                            goto label_1a1498
                        
                        if (r2_1 == 0x69)
                            r1_2 = &data_1c1b13
                            goto label_1a1498
                        
                    labelid_4:
                        result = nullptr
            case 0x6e
                uint32_t r1_12 = zx.d(r0_3[1])
                
                if (r1_12 == 0x61)
                label_1a0e32:
                    char r0_54 = sub_19e5e0(r9, "gs", 0x1cfec2)
                    void* r0_55 = *r9
                    uint8_t r8_2
                    
                    if (r9[1] - r0_55 u< 2)
                        r8_2 = 0
                    else
                        r8_2 = (__clz(zx.d(*(r0_55 + 1)) - 0x61) u>> 5).b
                    
                    int32_t r0_122 = sub_19e5e0(r9, "nw", 0x1d02c0)
                    int32_t r0_124
                    
                    if (r0_122 == 0)
                        r0_124 = sub_19e5e0(r9, "na", 0x1d02c3)
                    
                    if (r0_122 == 0 && r0_124 == 0)
                    labelid_4:
                        result = nullptr
                    else
                        int32_t r4_8 = (r9[3] - r9[2]) s>> 2
                        char* r0_128
                        
                        while (true)
                            r0_128 = *r9
                            uint32_t r1_32 = r9[1]
                            
                            if (r0_128 != r1_32)
                                r1_32 = zx.d(*r0_128)
                                
                                if (r1_32 == 0x5f)
                                    break
                            
                            void* r0_130 = sub_1a09b8(r9, r1_32)
                            var_30 = r0_130
                            
                            if (r0_130 == 0)
                                goto label_1a09f0_2
                            
                            sub_19f9dc(&r9[2], &var_30)
                        
                        *r9 = &r0_128[1]
                        int32_t r1_42
                        int32_t r2_29
                        void* r3_12
                        r1_42, r2_29, r3_12 = sub_19fa46(&var_30, r9, r4_8)
                        void* r0_198 = sub_19ec40(r9, r1_42, r2_29, r3_12, &var_30)
                        
                        if (r0_198 == 0)
                        labelid_4:
                            result = nullptr
                        else if (sub_19e5e0(r9, "pi", 0x1c0b85) == 0)
                            char* r0_234 = *r9
                            
                            if (r0_234 == r9[1])
                            labelid_4:
                                result = nullptr
                            else
                                result = nullptr
                                
                                if (zx.d(*r0_234) == 0x45)
                                    *r9 = &r0_234[1]
                                    result = sub_1a3b60(sub_19fbde(&r9[0x5c], 0x20), var_30, 
                                        var_2c, r0_198, 0, 0, r0_54, r8_2)
                        else
                            int32_t r0_203 = (r9[3] - r9[2]) s>> 2
                            
                            while (true)
                                char* r0_205 = *r9
                                uint32_t r1_45 = r9[1]
                                
                                if (r0_205 != r1_45)
                                    r1_45 = zx.d(*r0_205)
                                    
                                    if (r1_45 == 0x45)
                                        *r9 = &r0_205[1]
                                        sub_19fa46(&var_38, r9, r0_203)
                                        result = sub_19fbde(&r9[0x5c], 0x20)
                                        int32_t var_34
                                        sub_1a3b60(result, var_30, var_2c, r0_198, var_38, var_34, 
                                            r0_54, r8_2)
                                        break
                                
                                void* r0_207 = sub_1a09b8(r9, r1_45)
                                var_38 = r0_207
                                
                                if (r0_207 == 0)
                                    goto label_1a09f0_2
                                
                                sub_19f9dc(&r9[2], &var_38)
                else
                    if (r1_12 == 0x65)
                        r1_2 = &data_1cff11
                        goto label_1a15ac
                    
                    if (r1_12 == 0x67)
                        r1_18 = &data_1c1b13
                        goto label_1a1518
                    
                    if (r1_12 == 0x74)
                        r1_18 = &data_1cff14
                        goto label_1a1518
                    
                    if (r1_12 == 0x78)
                        *r9 = &r0_3[2]
                        void* r0_118 = sub_1a09b8(r9)
                        
                        if (r0_118 != 0)
                            r4_7 = r0_118
                            result = sub_19fbde(&r9[0x5c], 0x1c)
                            r2_20 = "noexcept ("
                            r6_8 = &data_1cff16[0xa]
                            goto label_1a124a
                        
                    labelid_4:
                        result = nullptr
                    else
                        if (r1_12 == 0x77)
                            goto label_1a0e32
                        
                    labelid_4:
                        result = nullptr
            case 0x6f
                uint32_t r1_11 = zx.d(r0_3[1])
                
                if (r1_11 == 0x52)
                    r1_2 = &data_1cff26
                    goto label_1a15ac
                
                if (r1_11 == 0x72)
                    r1_2 = &data_1cff24
                    goto label_1a1498
                
                if (r1_11 == 0x6f)
                    r1_2 = &data_1cff21
                    goto label_1a15ac
                
                if (r1_11 == 0x6e)
                    result = sub_1a2204(r9)
                else
                labelid_4:
                    result = nullptr
            case 0x70
                uint32_t r3_2 = zx.d(r0_3[1])
                result = nullptr
                
                if (r3_2 - 0x6c u<= 8)
                    switch (r3_2)
                        case 0x6c
                            r1_2 = &data_1cff2d
                            goto label_1a1498
                        case 0x6d
                            r1_2 = &data_1cff29
                            goto label_1a1202
                        case 0x70
                            *r9 = &r0_3[2]
                            
                            if (&r0_3[2] == r1)
                            label_1a14a2:
                                void* r0_179 = sub_1a09b8(r9, r1)
                                var_30 = r0_179
                                
                                if (r0_179 == 0)
                                labelid_4:
                                    result = nullptr
                                else
                                    result = sub_1a24cc(r9, &var_30, &data_1cff32)
                            else
                                r1 = zx.d(r0_3[2])
                                
                                if (r1 != 0x5f)
                                    goto label_1a14a2
                                
                                r1_18 = &data_1cff32
                            label_1a11f4:
                                *r9 = &r0_3[3]
                                result = sub_1a2188(r9, r1_18, r1_18 + 2)
                        case 0x73
                            r1_18 = &data_1cff2d
                        label_1a1518:
                            *r9 = &r0_3[2]
                            result = sub_1a2188(r9, r1_18, r1_18 + 1)
                        case 0x74
                            *r9 = &r0_3[2]
                            void* r0_111 = sub_1a09b8(r9)
                            var_30 = r0_111
                            
                            if (r0_111 == 0)
                            labelid_4:
                                result = nullptr
                            else
                                void* r0_113 = sub_1a09b8(r9)
                                var_38 = r0_113
                                
                                if (r0_113 == 0)
                                labelid_4:
                                    result = nullptr
                                else
                                    result = sub_1a2398(r9, &var_30, &data_1cff35, &var_38)
                else if (r3_2 == 0x4c)
                    r1_2 = &data_1cff2f
                    goto label_1a15ac
            case 0x71
                uint32_t r1_5 = zx.d(r0_3[1])
                
                if (r1_5 != 0x75)
                labelid_4:
                    result = nullptr
                else
                    *r9 = &r0_3[2]
                    int32_t r0_24 = sub_1a09b8(r9, r1_5)
                    
                    if (r0_24 == 0)
                    labelid_4:
                        result = nullptr
                    else
                        int32_t r0_26 = sub_1a09b8(r9)
                        
                        if (r0_26 == 0)
                        labelid_4:
                            result = nullptr
                        else
                            int32_t r0_28 = sub_1a09b8(r9)
                            
                            if (r0_28 == 0)
                            labelid_4:
                                result = nullptr
                            else
                                result = sub_19fbde(&r9[0x5c], 0x14)
                                *result = &_vtable_for_(anonymous namespace)::ConditionalExpr{for `(anonymous namespace)::Node'}
                                *(result + 4) = 0x101012a
                                *(result + 8) = r0_24
                                *(result + 0xc) = r0_26
                                *(result + 0x10) = r0_28
            case 0x72
                uint32_t r1_10 = zx.d(r0_3[1])
                
                if (r1_10 == 0x4d)
                    r1_2 = &data_1cff49
                    goto label_1a15ac
                
                if (r1_10 == 0x53)
                    r1_2 = &data_1cff4f
                    goto label_1a1202
                
                if (r1_10 == 0x73)
                    r1_2 = &data_1cff4c
                    goto label_1a15ac
                
                if (r1_10 == 0x6d)
                    r1_2 = &data_1c0f6d
                    goto label_1a1498
                
                if (r1_10 != 0x63)
                labelid_4:
                    result = nullptr
                else
                    *r9 = &r0_3[2]
                    void* r0_41 = sub_19ec40(r9, r1_10, r2, r5_1 - 0x4c, 0x1cfec0)
                    
                    if (r0_41 == 0)
                    labelid_4:
                        result = nullptr
                    else
                        r4_2 = r0_41
                        int32_t r0_43 = sub_1a09b8(r9)
                        
                        if (r0_43 != 0)
                            r6_2 = r0_43
                            result = sub_19fbde(&r9[0x5c], 0x18)
                            r2_4 = "reinterpret_cast"
                            r3_3 = &data_1cff38[0x10]
                            goto label_1a14fa
                        
                    labelid_4:
                        result = nullptr
            case 0x73
                uint32_t r2_6 = zx.d(r0_3[1])
                
                if (r2_6 == 0x50)
                    int32_t r3_10 = r9[3]
                    void* r5_14 = &r9[2]
                    int32_t r2_24 = *r5_14
                    void* r0_147 = &r0_3[2]
                    *r9 = r0_147
                    
                    while (r0_147 == r1 || zx.d(*r0_147) != 0x45)
                        void* r0_150
                        r0_150, r9 = sub_19f8b0(r9, &var_30)
                        var_30 = r0_150
                        
                        if (r0_150 == 0)
                            goto label_1a09f0_2
                        
                        sub_19f9dc(r5_14, &var_30)
                        r0_147 = *r9
                        r1 = r9[1]
                    
                    *r9 = r0_147 + 1
                    sub_19fa46(&var_30, r9, (r3_10 - r2_24) s>> 2)
                    void* r0_211 = sub_19fbde(&r9[0x5c], 0x10)
                    void* r2_31 = var_30
                    *r0_211 = &_vtable_for_(anonymous namespace)::NodeArrayNode{for `(anonymous namespace)::Node'}
                    *(r0_211 + 4) = 0x1010100
                    *(r0_211 + 8) = r2_31
                    *(r0_211 + 0xc) = var_2c
                    result = sub_19fbde(&r9[0x5c], 0x1c)
                    *result = &_vtable_for_(anonymous namespace)::EnclosingExpr{for `(anonymous namespace)::Node'}
                    *(result + 4) = 0x101012a
                    *(result + 8) = "sizeof... ("
                    *(result + 0xc) = &data_1cff68[0xb]
                    *(result + 0x10) = r0_211
                    *(result + 0x14) = &data_1cfebe
                    *(result + 0x18) = &data_1cfebf
                else if (r2_6 == 0x5a)
                    *r9 = &r0_3[2]
                    
                    if (r1 == &r0_3[2])
                    labelid_4:
                        result = nullptr
                    else
                        uint32_t r0_155 = zx.d(r0_3[2])
                        
                        if (r0_155 == 0x66)
                            void* r0_239 = sub_1a208c(r9)
                            
                            if (r0_239 == 0)
                            labelid_4:
                                result = nullptr
                            else
                                r4_7 = r0_239
                                result = sub_19fbde(&r9[0x5c], 0x1c)
                                r2_20 = "sizeof... ("
                                r6_8 = &data_1cff68[0xb]
                            label_1a124a:
                                *result = &_vtable_for_(anonymous namespace)::EnclosingExpr{for `(anonymous namespace)::Node'}
                                *(result + 4) = 0x101012a
                                *(result + 8) = r2_20
                                *(result + 0xc) = r6_8
                                *(result + 0x10) = r4_7
                                *(result + 0x14) = &data_1cfebe
                                *(result + 0x18) = &data_1cfebf
                        else if (r0_155 != 0x54)
                        labelid_4:
                            result = nullptr
                        else
                            int32_t r0_157 = sub_1a01e4(r9)
                            
                            if (r0_157 != 0)
                                r4_6 = r0_157
                                result = sub_19fbde(&r9[0x5c], 0xc)
                                r0_107 = &data_1dd944
                                goto label_1a1198
                            
                        labelid_4:
                            result = nullptr
                else
                    void* r0_146
                    
                    if (r2_6 == 0x7a)
                        *r9 = &r0_3[2]
                        r0_146 = sub_1a09b8(r9)
                    label_1a13b6:
                        var_30 = r0_146
                        
                        if (r0_146 == 0)
                        labelid_4:
                            result = nullptr
                        else
                            result = sub_1a2520(r9, "sizeof (", &var_30)
                    else if (r2_6 == 0x70)
                        *r9 = &r0_3[2]
                        void* r0_139 = sub_1a09b8(r9)
                        var_30 = r0_139
                        
                        if (r0_139 == 0)
                        labelid_4:
                            result = nullptr
                        else
                            result = sub_1a24f8(r9, &var_30)
                    else if (r2_6 == 0x72)
                        result = sub_1a2204(r9)
                    else
                        if (r2_6 == 0x74)
                            *r9 = &r0_3[2]
                            r0_146 = sub_19ec40(r9, r1, r2_6, r5_1 - 0x4c, 0x1cfec0)
                            goto label_1a13b6
                        
                        if (r2_6 != 0x63)
                        labelid_4:
                            result = nullptr
                        else
                            *r9 = &r0_3[2]
                            void* r0_48 = sub_19ec40(r9, r1, r2_6, r5_1 - 0x4c, 0x1cfec0)
                            
                            if (r0_48 == 0)
                            labelid_4:
                                result = nullptr
                            else
                                r4_2 = r0_48
                                int32_t r0_50 = sub_1a09b8(r9)
                                
                                if (r0_50 != 0)
                                    r6_2 = r0_50
                                    result = sub_19fbde(&r9[0x5c], 0x18)
                                    r2_4 = "static_cast"
                                    r3_3 = &data_1cff53[0xb]
                                    goto label_1a14fa
                                
                            labelid_4:
                                result = nullptr
            case 0x74
                uint32_t r1_9 = zx.d(r0_3[1])
                
                if (r1_9 == 0x77)
                    *r9 = &r0_3[2]
                    int32_t r0_104 = sub_1a09b8(r9, r1_9)
                    
                    if (r0_104 == 0)
                    labelid_4:
                        result = nullptr
                    else
                        r4_6 = r0_104
                        result = sub_19fbde(&r9[0x5c], 0xc)
                        r0_107 = &data_1dd9ac
                    label_1a1198:
                        *result = r0_107 + 8
                        *(result + 4) = 0x101012a
                        *(result + 8) = r4_6
                else
                    void* r0_37
                    
                    if (r1_9 == 0x69)
                        *r9 = &r0_3[2]
                        r0_37 = sub_19ec40(r9, r1_9, r2, r5_1 - 0x4c, 0x1cfec0)
                    label_1a1000:
                        var_30 = r0_37
                        
                        if (r0_37 == 0)
                        labelid_4:
                            result = nullptr
                        else
                            result = sub_1a2520(r9, "typeid (", &var_30)
                    else if (r1_9 == 0x6c)
                        *r9 = &r0_3[2]
                        void* r0_95 = sub_19ec40(r9, r1_9, r2, r5_1 - 0x4c, 0x1cfec0)
                        
                        if (r0_95 == 0)
                        label_1a09f0:
                            result = nullptr
                        else
                            int32_t r8_6 = (r9[3] - r9[2]) s>> 2
                            
                            while (true)
                                char* r0_99 = *r9
                                uint32_t r1_29 = r9[1]
                                
                                if (r0_99 != r1_29)
                                    r1_29 = zx.d(*r0_99)
                                    
                                    if (r1_29 == 0x45)
                                        *r9 = &r0_99[1]
                                        sub_19fa46(&var_30, r9, r8_6)
                                        result_1 = sub_19fbde(&r9[0x5c], 0x14)
                                        break
                                
                                void* r0_101 = sub_1a23c8(r9, r1_29)
                                var_30 = r0_101
                                
                                if (r0_101 == 0)
                                    goto label_1a09f0_2
                                
                                sub_19f9dc(&r9[2], &var_30)
                            
                            result = result_1
                            sub_1a3ab8(result_1, r0_95, var_30, var_2c)
                    else if (r1_9 == 0x72)
                        *r9 = &r0_3[2]
                        result = sub_1a2550(r9, "throw")
                    else
                        if (r1_9 == 0x65)
                            *r9 = &r0_3[2]
                            r0_37 = sub_1a09b8(r9)
                            goto label_1a1000
                        
                    label_1a09f0_1:
                        result = nullptr
    else if (r5_1 - 0x31 u< 9)
        result = sub_1a2204(r9)
else
label_1a09f0_2:
    result = nullptr

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
