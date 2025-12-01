// 函数: sub_19f4bc
// 地址: 0x19f4bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r6
void* var_c = r6
void* result_9
void* result_10 = result_9
int32_t r4
int32_t var_14 = r4
int32_t __saved_r7
int32_t* var_28 = &__saved_r7
char* var_2c = r6
void* result_2 = result_9
int32_t var_34 = r4
int32_t r3
int32_t var_38 = r3
void** result_1 = arg3
void* var_40 = arg2
int32_t r0 = *__stack_chk_guard
char* r0_1 = *arg1
int32_t r1 = arg1[1]

if (r0_1 != r1 && zx.d(*r0_1) == 0x4c)
    r0_1 = &r0_1[1]
    *arg1 = r0_1

void* result

if (r1 == r0_1)
label_19f5ba:
    int32_t r0_19 = sub_19e5e0(arg1, "StL", 0x1d04bf)
    int32_t r0_21
    
    if (r0_19 == 0)
        r0_21 = sub_19e5e0(arg1, "St", 0x1cfeaa)
    
    if (r0_19 == 0 && r0_21 == 0)
        result = sub_1a0594(arg1, arg2, arg2)
        result_1 = result
        
        if (result != 0)
            goto label_19f60a
        
    labelid_4:
        result = nullptr
    else
        int32_t r0_23 = sub_1a0594(arg1, arg2, arg2)
        
        if (r0_23 == 0)
            result = nullptr
            result_1 = nullptr
        else
            result = sub_19fbde(&arg1[0x5c], 0xc)
            *result = &_vtable_for_(anonymous namespace)::StdQualifiedName{for `(anonymous namespace)::Node'}
            *(result + 4) = 0x1010122
            *(result + 8) = r0_23
            result_1 = result
        label_19f60a:
            char* r1_7 = *arg1
            
            if (arg1[1] != r1_7 && zx.d(*r1_7) == 0x49)
                sub_19f9dc(&arg1[0x25], &result_1)
            label_19f626:
                void* r1_10 = arg2
                
                if (arg2 != 0)
                    r1_10 = 1
                
                void* r0_28 = sub_19fe78(arg1, r1_10)
                var_2c = r0_28
                
                if (r0_28 == 0)
                labelid_4:
                    result = nullptr
                else
                    if (arg2 != 0)
                        *(arg2 + 1) = 1
                    
                    result = sub_1a0150(arg1, &result_1, &var_2c)
else
    uint32_t r3_1 = zx.d(*r0_1)
    
    if (r3_1 == 0x5a)
        if (r0_1 == r1)
        labelid_4:
            result = nullptr
        else
            *arg1 = &r0_1[1]
            char* r0_10 = sub_19e634(arg1)
            var_2c = r0_10
            
            if (r0_10 == 0)
            labelid_4:
                result = nullptr
            else
                char* r0_11 = *arg1
                int32_t r1_4 = arg1[1]
                
                if (r0_11 == r1_4 || zx.d(*r0_11) != 0x45)
                labelid_4:
                    result = nullptr
                else
                    *arg1 = &r0_11[1]
                    
                    if (&r0_11[1] == r1_4)
                    label_19f830:
                        void** result_7 = sub_19f4bc(arg1, arg2)
                        result_1 = result_7
                        
                        if (result_7 == 0)
                        labelid_4:
                            result = nullptr
                        else
                            *arg1 = sub_1a404a(*arg1, arg1[1])
                            result = sub_1a40b0(arg1, &var_2c, &result_1)
                    else if (zx.d(r0_11[1]) != 0x73)
                        if (zx.d(r0_11[1]) != 0x64)
                            goto label_19f830
                        
                        *arg1 = &r0_11[2]
                        sub_19ebc4(&result_1, arg1, 1)
                        char* r0_65 = *arg1
                        
                        if (r0_65 == arg1[1] || zx.d(*r0_65) != 0x5f)
                        labelid_4:
                            result = nullptr
                        else
                            *arg1 = &r0_65[1]
                            void** result_6 = sub_19f4bc(arg1, arg2)
                            result_1 = result_6
                            
                            if (result_6 != 0)
                                result = sub_1a40b0(arg1, &var_2c, &result_1)
                            else
                            labelid_4:
                                result = nullptr
                    else
                        *arg1 = &r0_11[2]
                        *arg1 = sub_1a404a(&r0_11[2], r1_4)
                        int32_t r0_15 = sub_1a3840(arg1, "string literal")
                        result = sub_19fbde(&arg1[0x5c], 0x10)
                        *result = &_vtable_for_(anonymous namespace)::LocalName{for `(anonymous namespace)::Node'}
                        *(result + 4) = 0x1010119
                        *(result + 8) = r0_10
                        *(result + 0xc) = r0_15
    else if (r3_1 == 0x53)
        if (r1 - r0_1 u>= 2 && zx.d(r0_1[1]) == 0x74)
            goto label_19f5ba
        
        void** result_3 = sub_19fd40(arg1)
        result_1 = result_3
        
        if (result_3 == 0)
        labelid_4:
            result = nullptr
        else
            char* r0_31 = *arg1
            
            if (arg1[1] != r0_31 && zx.d(*r0_31) == 0x49)
                goto label_19f626
            
        label_19f850:
            result = nullptr
    else
        if (r3_1 != 0x4e)
            goto label_19f5ba
        
        var_2c = arg2
        
        if (r0_1 == r1)
        label_19f850_1:
            result = nullptr
        else
            uint32_t r1_1 = zx.d(*r0_1)
            
            if (r1_1 != 0x4e)
            label_19f850_2:
                result = nullptr
            else
                *arg1 = &r0_1[1]
                int32_t r0_4 = sub_1a0180(arg1, r1_1)
                
                if (arg2 != 0)
                    *(arg2 + 4) = r0_4
                
                char* r0_5 = *arg1
                
                if (r0_5 == arg1[1])
                label_19f682:
                    
                    if (arg2 != 0)
                        *(arg2 + 8) = 0
                else if (zx.d(*r0_5) != 0x4f)
                    if (zx.d(*r0_5) != 0x52)
                        goto label_19f682
                    
                    *arg1 = &r0_5[1]
                    
                    if (arg2 != 0)
                        *(arg2 + 8) = 1
                else
                    *arg1 = &r0_5[1]
                    
                    if (arg2 != 0)
                        *(arg2 + 8) = 2
                
                result_2 = nullptr
                int32_t* var_38_1 = arg1
                result_1 = &result_2
                int32_t* var_34_1 = &var_2c
                
                if (sub_19e5e0(arg1, "St", 0x1cfeaa) != 0)
                    result_2 = sub_1a01c8(arg1, 0x1cfeab)
                
                int32_t* r9_1 = &var_40
                
                while (true)
                    char* r0_38 = *arg1
                    int32_t r1_14 = arg1[1]
                    
                    if (r0_38 != r1_14)
                        if (zx.d(*r0_38) == 0x45)
                            *arg1 = &r0_38[1]
                            result = result_2
                            
                            if (result == 0)
                                goto label_19f850_2
                            
                            int32_t r1_29 = arg1[0x26]
                            
                            if (arg1[0x25] == r1_29)
                                goto label_19f850_2
                            
                            arg1[0x26] = r1_29 - 4
                            break
                        
                        if (zx.d(*r0_38) == 0x4c)
                            r0_38 = &r0_38[1]
                            *arg1 = r0_38
                    
                    if (r0_38 != r1_14 && zx.d(*r0_38) == 0x4d)
                        *arg1 = &r0_38[1]
                        
                        if (result_2 == 0)
                            goto label_19f850_2
                        
                        continue
                    
                    void* r1_15 = r1_14 - r0_38
                    int32_t r0_42
                    
                    if (r1_14 == r0_38)
                    label_19f794:
                        r0_42, r9_1 = sub_1a0594(arg1, var_2c, &arg1[0x25])
                    label_19f798:
                        
                        if (r0_42 == 0)
                            goto label_19f850_2
                        
                        sub_1a0324(&result_1, r0_42)
                    else
                        uint32_t r2_9 = zx.d(*r0_38)
                        
                        if (r2_9 == 0x43)
                        label_19f7b0:
                            
                            if (result_2 == 0)
                                goto label_19f850_2
                            
                            void* r0_59 = sub_1a03ec(arg1, &result_2, var_2c)
                            
                            if (r0_59 == 0)
                                goto label_19f850_2
                            
                            sub_1a0324(&result_1, r0_59)
                            void* result_5 = sub_1a0500(arg1, result_2, r6)
                            result_2 = result_5
                            
                            if (result_5 == 0)
                                goto label_19f850_2
                        else
                            if (r2_9 == 0x44)
                                if (r1_15 u< 2)
                                    goto label_19f7b0
                                
                                int32_t r1_17 = zx.d(r0_38[1]) | 0x20
                                
                                if (r1_17 == 0x74)
                                    r0_42 = sub_1a0370(arg1, r1_17, r2_9)
                                    goto label_19f798
                                
                                if (zx.d(r0_38[1]) != 0x43)
                                    goto label_19f7b0
                                
                                goto label_19f794
                            
                            if (r2_9 != 0x49)
                                if (r2_9 != 0x53)
                                    if (r2_9 != 0x54)
                                        goto label_19f794
                                    
                                    r0_42 = sub_1a01e4(arg1)
                                    goto label_19f798
                                
                                if (r1_15 u< 2 || zx.d(r0_38[1]) != 0x74)
                                    void* r0_49 = sub_19fd40(arg1)
                                    var_40 = r0_49
                                    
                                    if (r0_49 == 0)
                                        goto label_19f850_2
                                    
                                    r6 = r0_49
                                    sub_1a0324(&result_1, r6)
                                    
                                    if (result_2 == r6)
                                        continue
                                    else
                                        sub_19f9dc(&arg1[0x25], r9_1)
                                        continue
                                
                                goto label_19f794
                            
                            char* r1_18 = var_2c
                            
                            if (r1_18 != 0)
                                r1_18 = 1
                            
                            void* r0_45 = sub_19fe78(arg1, r1_18)
                            void* result_8 = result_2
                            var_40 = r0_45
                            
                            if (r0_45 == 0)
                                goto label_19f850_2
                            
                            if (result_8 == 0)
                                goto label_19f850_2
                            
                            void* result_4 = sub_1a0150(arg1, &result_2, r9_1)
                            char* r1_20 = var_2c
                            result_2 = result_4
                            
                            if (r1_20 != 0)
                                r1_20[1] = 1
                    sub_19f9dc(&arg1[0x25], &result_2)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
