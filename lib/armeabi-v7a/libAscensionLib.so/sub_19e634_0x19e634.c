// 函数: sub_19e634
// 地址: 0x19e634
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
char* r0_1 = *arg1
int32_t r1 = arg1[1]
void* r3 = r1 - r0_1
void* result
int16_t var_3c
int32_t var_38
uint32_t entry_r2

if (r1 == r0_1)
label_19e6d8:
    result = nullptr
    int32_t* var_2c = arg1
    var_38 = 0
    int16_t* r6_3 = &var_3c
    var_3c = 0
    char var_34 = 0
    int32_t r0_13 = (arg1[0x54] - arg1[0x53]) s>> 2
    void* result_1 = sub_19f4bc(arg1, &var_3c, entry_r2)
    void* result_2 = result_1
    
    if (result_1 != 0)
        result = result_1
        int32_t r0_15 = arg1[0x53]
        int32_t r2_2 = (arg1[0x54] - r0_15) s>> 2
        int32_t r3_3 = r0_13
        
        while (r3_3 u< r2_2)
            r6_3 = *(r0_15 + (r3_3 << 2))
            int32_t r5_1 = arg1[0x48]
            int32_t r1_6 = *(r6_3 + 8)
            
            if (r1_6 u>= (arg1[0x49] - r5_1) s>> 2)
                goto label_19eb52_2
            
            r3_3 += 1
            *(r6_3 + 0xc) = *(r5_1 + (r1_6 << 2))
        
        arg1[0x54] = r0_15 + (r0_13 << 2)
        
        if (sub_19f88c(&var_2c) == 0)
            void* r9_1 = nullptr
            void* var_44 = nullptr
            int32_t r0_20
            int32_t r2_3
            void* r3_4
            r0_20, r2_3, r3_4 = sub_19e5e0(arg1, "Ua9enable_ifI", &data_1cfd8b[0xd])
            void* var_4c
            
            if (r0_20 != 0)
                int32_t r0_23 = (arg1[3] - arg1[2]) s>> 2
                
                while (true)
                    char* r0_25 = *arg1
                    uint32_t r1_10 = arg1[1]
                    
                    if (r0_25 != r1_10)
                        r1_10 = zx.d(*r0_25)
                        
                        if (r1_10 == 0x45)
                            *arg1 = &r0_25[1]
                            sub_19fa46(&var_4c, arg1, r0_23)
                            void* r0_57 = sub_19fbde(&arg1[0x5c], 0x10)
                            r2_3 = 0x1010109
                            r3_4 = var_4c
                            int16_t* var_48
                            r6_3 = var_48
                            *r0_57 = &_vtable_for_(anonymous namespace)::EnableIfAttr{for `(anonymous namespace)::Node'}
                            *(r0_57 + 4) = 0x1010109
                            *(r0_57 + 8) = r3_4
                            *(r0_57 + 0xc) = r6_3
                            var_44 = r0_57
                            break
                    
                    void* r0_27
                    r0_27, r9_1 = sub_19f8b0(arg1, &arg1[2], r1_10)
                    var_4c = r0_27
                    
                    if (r0_27 == 0)
                        goto label_19eb52_2
                    
                    sub_19f9dc(&arg1[2], &var_4c)
            
            uint32_t r1_16 = zx.d(var_3c.b)
            uint32_t r0_58 = zx.d(var_3c:1.b)
            void* var_50 = r9_1
            void* r0_60
            
            if (r1_16 == 0 && r0_58 != 0)
                r0_60, r2_3, r3_4 = sub_19ec40(arg1, r1_16, r2_3, r3_4, r6_3)
                var_50 = r0_60
            
            if (r1_16 == 0 && r0_58 != 0 && r0_60 == 0)
            labelid_7:
                result = nullptr
            else
                char* r0_61 = *arg1
                int32_t* var_60_1
                int32_t* var_5c_1
                char* var_58_1
                int32_t* r0_63
                int32_t* r1_19
                int32_t* r2_7
                int32_t* r3_5
                
                if (r0_61 == arg1[1] || zx.d(*r0_61) != 0x76)
                    int32_t r1_20 = arg1[3]
                    int32_t r0_66 = (r1_20 - arg1[2]) s>> 2
                    int32_t i
                    
                    do
                        void* r0_68 = sub_19ec40(arg1, r1_20, r2_3, r3_4, &arg1[2])
                        var_4c = r0_68
                        
                        if (r0_68 == 0)
                            goto label_19eb52_2
                        
                        sub_19f9dc(&arg1[2], &var_4c)
                        i, r1_20, r2_3, r3_4 = sub_19f88c(&var_2c)
                    while (i == 0)
                    sub_19fa46(&var_4c, arg1, r0_66)
                    r1_19 = &var_50
                    r2_7 = &result_2
                    var_60_1 = &var_44
                    var_5c_1 = &var_38
                    r0_63 = arg1
                    r3_5 = &var_4c
                    var_58_1 = &var_34
                else
                    *arg1 = &r0_61[1]
                    r1_19 = &var_50
                    var_4c = nullptr
                    int32_t var_48_1 = 0
                    var_60_1 = &var_44
                    var_5c_1 = &var_38
                    r2_7 = &result_2
                    var_58_1 = &var_34
                    r3_5 = &var_4c
                    r0_63 = arg1
                
                result = sub_19fa68(r0_63, r1_19, r2_7, r3_5, var_60_1, var_5c_1, var_58_1)
else
    entry_r2 = zx.d(*r0_1)
    char const* const r2_1
    char const* const r3_2
    void* r6_2
    
    if (entry_r2 != 0x47)
        if (entry_r2 != 0x54)
            goto label_19e6d8
        
        if (r3 u< 2)
        label_19e838:
            *arg1 = &r0_1[1]
            uint32_t r8_1
            
            if (r1 != &r0_1[1])
                r8_1 = __clz(zx.d(r0_1[1]) - 0x76) u>> 5
            else
                r8_1 = 0
            
            if (sub_19facc(arg1) != 0)
            labelid_7:
                result = nullptr
            else
                void* r0_44 = sub_19e634(arg1)
                
                if (r0_44 == 0)
                labelid_7:
                    result = nullptr
                else
                    result = sub_19fbde(&arg1[0x5c], 0x14)
                    *result = &_vtable_for_(anonymous namespace)::SpecialName{for `(anonymous namespace)::Node'}
                    *(result + 4) = 0x1010115
                    char const* const r0_47
                    char const* const r1_12
                    
                    if (r8_1 == 0)
                        r0_47 = "non-virtual thunk to "
                        r1_12 = &data_1cfe47[0x15]
                    else
                        r0_47 = "virtual thunk to "
                        r1_12 = &data_1cfe35[0x11]
                    
                    *(result + 8) = r0_47
                    *(result + 0xc) = r1_12
                    *(result + 0x10) = r0_44
        else
            void* r3_1 = zx.d(r0_1[1])
            
            if (r3_1 - 0x53 u<= 4)
                switch (r3_1)
                    case 0x53
                        *arg1 = &r0_1[2]
                        void* r0_35 = sub_19ec40(arg1, r1, &r0_1[1], r3_1, r3_1 - 0x53)
                        
                        if (r0_35 != 0)
                            r6_2 = r0_35
                            result = sub_19fbde(&arg1[0x5c], 0x14)
                            r2_1 = "typeinfo name for "
                            r3_2 = &data_1cfdbc[0x12]
                            goto label_19eb3c
                        
                    labelid_7:
                        result = nullptr
                    case 0x54
                        *arg1 = &r0_1[2]
                        void* r0_77 = sub_19ec40(arg1, r1, &r0_1[1], r3_1, r3_1 - 0x53)
                        
                        if (r0_77 != 0)
                            r6_2 = r0_77
                            result = sub_19fbde(&arg1[0x5c], 0x14)
                            r2_1 = "VTT for "
                            r3_2 = &data_1cfda5[8]
                            goto label_19eb3c
                        
                    labelid_7:
                        result = nullptr
                    case 0x55
                        goto label_19e838
                    case 0x56
                        *arg1 = &r0_1[2]
                        void* r0_82 = sub_19ec40(arg1, r1, &r0_1[1], r3_1, r3_1 - 0x53)
                        
                        if (r0_82 != 0)
                            r6_2 = r0_82
                            result = sub_19fbde(&arg1[0x5c], 0x14)
                            r2_1 = "vtable for "
                            r3_2 = &data_1cfd99[0xb]
                            goto label_19eb3c
                        
                    labelid_7:
                        result = nullptr
                    case 0x57
                        *arg1 = &r0_1[2]
                        result = nullptr
                        void* r0_87 = sub_19f4bc(arg1, nullptr, &r0_1[1])
                        var_3c.d = r0_87
                        
                        if (r0_87 != 0)
                            result = sub_19ec20(arg1, "thread-local wrapper routine for ", &var_3c)
            else if (r3_1 == 0x43)
                *arg1 = &r0_1[2]
                void* r0_91 = sub_19ec40(arg1, r1, &r0_1[1], r3_1, r3_1 - 0x53)
                
                if (r0_91 == 0)
                labelid_7:
                    result = nullptr
                else
                    int32_t r2_10
                    void* r3_6
                    r2_10, r3_6 = sub_19ebc4(&var_3c, arg1, 1)
                    char* r0_93 = var_3c.d
                    int32_t r1_24 = var_38
                    bool cond:5_1 = r0_93 == r1_24
                    
                    if (r0_93 != r1_24)
                        r0_93 = *arg1
                        cond:5_1 = r0_93 == arg1[1]
                    
                    if (cond:5_1)
                    labelid_7:
                        result = nullptr
                    else
                        uint32_t r1_26 = zx.d(*r0_93)
                        
                        if (r1_26 != 0x5f)
                        labelid_7:
                            result = nullptr
                        else
                            *arg1 = &r0_93[1]
                            void* r0_96 = sub_19ec40(arg1, r1_26, r2_10, r3_6, r0_91)
                            
                            if (r0_96 == 0)
                            labelid_7:
                                result = nullptr
                            else
                                result = sub_19fbde(&arg1[0x5c], 0x10)
                                *result = &_vtable_for_(anonymous namespace)::CtorVtableSpecialName{for `(anonymous namespace)::Node'}
                                *(result + 4) = 0x1010116
                                *(result + 8) = r0_96
                                *(result + 0xc) = r0_91
            else if (r3_1 == 0x48)
                *arg1 = &r0_1[2]
                result = nullptr
                void* r0_101 = sub_19f4bc(arg1, nullptr, &r0_1[1])
                
                if (r0_101 != 0)
                    r6_2 = r0_101
                    result = sub_19fbde(&arg1[0x5c], 0x14)
                    r2_1 = "thread-local initialization routine for "
                    r3_2 = &data_1cfe0c[0x28]
                    goto label_19eb3c
            else if (r3_1 == 0x49)
                *arg1 = &r0_1[2]
                void* r0_106 = sub_19ec40(arg1, r1, &r0_1[1], r3_1, r3_1 - 0x53)
                
                if (r0_106 != 0)
                    r6_2 = r0_106
                    result = sub_19fbde(&arg1[0x5c], 0x14)
                    r2_1 = "typeinfo for "
                    r3_2 = &data_1cfdae[0xd]
                    goto label_19eb3c
                
            labelid_7:
                result = nullptr
            else
                if (r3_1 != 0x63)
                    goto label_19e838
                
                *arg1 = &r0_1[2]
                
                if (sub_19facc(arg1) != 0)
                labelid_7:
                    result = nullptr
                else if (sub_19facc(arg1) != 0)
                labelid_7:
                    result = nullptr
                else
                    void* r0_8 = sub_19e634(arg1)
                    
                    if (r0_8 != 0)
                        r6_2 = r0_8
                        result = sub_19fbde(&arg1[0x5c], 0x14)
                        r2_1 = "covariant return thunk to "
                        r3_2 = &data_1cfdcf[0x1a]
                        goto label_19eb3c
                    
                labelid_7:
                    result = nullptr
    else if (r3 u< 2)
    label_19eb52:
        result = nullptr
    else
        uint32_t r1_11 = zx.d(r0_1[1])
        
        if (r1_11 == 0x52)
            *arg1 = &r0_1[2]
            result = nullptr
            void* r0_50 = sub_19f4bc(arg1, nullptr, entry_r2)
            
            if (r0_50 != 0)
                r6_2 = r0_50
                int32_t r0_52 = sub_19fb7c(arg1, &var_3c)
                char* r1_14 = *arg1
                
                if (r1_14 != arg1[1] && zx.d(*r1_14) == 0x5f)
                    *arg1 = &r1_14[1]
                label_19e9be:
                    result = sub_19fbde(&arg1[0x5c], 0x14)
                    r2_1 = "reference temporary for "
                    r3_2 = &data_1cfe71[0x18]
                    goto label_19eb3c
                
                if (r0_52 != 0)
                    goto label_19e9be
                
            label_19eb52_1:
                result = nullptr
        else if (r1_11 != 0x56)
        label_19eb52_2:
            result = nullptr
        else
            *arg1 = &r0_1[2]
            result = nullptr
            void* r0_30 = sub_19f4bc(arg1, nullptr, entry_r2)
            
            if (r0_30 != 0)
                r6_2 = r0_30
                result = sub_19fbde(&arg1[0x5c], 0x14)
                r2_1 = "guard variable for "
                r3_2 = &data_1cfe5d[0x13]
            label_19eb3c:
                *result = &_vtable_for_(anonymous namespace)::SpecialName{for `(anonymous namespace)::Node'}
                *(result + 4) = 0x1010115
                *(result + 8) = r2_1
                *(result + 0xc) = r3_2
                *(result + 0x10) = r6_2

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
