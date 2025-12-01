// 函数: sub_1a44d4
// 地址: 0x1a44d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* var_c = arg2
void* r5
void* var_10 = r5
int32_t r4
int32_t var_14 = r4
int32_t __saved_r7
int32_t* var_28 = &__saved_r7
void* var_2c = arg2
void* var_30 = r5
int32_t var_34 = r4
int32_t r3
int32_t var_38 = r3
int32_t r2
int32_t var_3c = r2
int32_t r1
int32_t var_40 = r1
int32_t r0 = *__stack_chk_guard
int32_t r0_2 = sub_1a0180(arg1)
void* result
struct (anonymous namespace)::Node::(anonymous namespace)::DynamicExceptionSpec::VTable** r11_1

if (sub_19e5e0(arg1, "Do", 0x1d05d3) == 0)
    if (sub_19e5e0(arg1, "DO", 0x1d05df) == 0)
        int32_t r0_16
        int32_t r2_1
        void* r3_1
        r0_16, r2_1, r3_1 = sub_19e5e0(arg1, "Dw", 0x1d05e2)
        
        if (r0_16 == 0)
            r11_1 = nullptr
        else
            arg2 = &arg1[2]
            int32_t r8_1 = (*(arg2 + 4) - *arg2) s>> 2
            
            while (true)
                char* r0_20 = *arg1
                uint32_t r1_5 = arg1[1]
                
                if (r0_20 != r1_5)
                    r1_5 = zx.d(*r0_20)
                    
                    if (r1_5 == 0x45)
                        *arg1 = &r0_20[1]
                        sub_19fa46(&var_30, arg1, r8_1)
                        r11_1 = sub_19fbde(&arg1[0x5c], 0x10)
                        void* r2_3 = var_30
                        *r11_1 = &_vtable_for_(anonymous namespace)::DynamicExceptionSpec{for `(anonymous namespace)::Node'}
                        r11_1[1] = 0x1010112
                        r11_1[2] = r2_3
                        r11_1[3] = var_2c
                        break
                
                void* r0_22 = sub_19ec40(arg1, r1_5, r2_1, r3_1, arg2)
                var_30 = r0_22
                
                if (r0_22 == 0)
                    goto label_1a4672_2
                
                r2_1, r3_1 = sub_19f9dc(arg2, &var_30)
        
        goto label_1a45d8
    
    void* r0_10 = sub_1a09b8(arg1)
    
    if (r0_10 == 0)
    labelid_8:
        result = nullptr
    else
        char* r0_11 = *arg1
        
        if (r0_11 != arg1[1] && zx.d(*r0_11) == 0x45)
            *arg1 = &r0_11[1]
            r11_1 = sub_19fbde(&arg1[0x5c], 0xc)
            *r11_1 =
                &_vtable_for_(anonymous namespace)::NoexceptSpec{for `(anonymous namespace)::Node'}
            r11_1[1] = 0x1010111
            r11_1[2] = r0_10
            goto label_1a45d8
        
    label_1a4672:
        result = nullptr
else
    r11_1 = sub_1a4858(arg1, "noexcept")
label_1a45d8:
    void* r3_3 = sub_19e5e0(arg1, "Dx", 0x1d05e5)
    char* r0_28 = *arg1
    uint32_t r1_7 = arg1[1]
    
    if (r0_28 == r1_7 || zx.d(*r0_28) != 0x46)
    label_1a4672_1:
        result = nullptr
    else
        *arg1 = &r0_28[1]
        
        if (&r0_28[1] != r1_7)
            r1_7 = zx.d(r0_28[1])
            
            if (r1_7 == 0x59)
                *arg1 = &r0_28[2]
        
        void* r0_31 = sub_19ec40(arg1, r1_7, &r0_28[1], r3_3, arg2)
        
        if (r0_31 == 0)
        label_1a4672_2:
            result = nullptr
        else
            int32_t r0_34 = (arg1[3] - arg1[2]) s>> 2
            
            while (true)
                char* r0_38 = *arg1
                char r4_2
                
                if (r0_38 == arg1[1])
                label_1a465a:
                    
                    if (sub_19e5e0(arg1, "RE", 0x1d05e8) != 0)
                        r4_2 = 1
                    else
                        int32_t r0_43
                        int32_t r1_13
                        int32_t r2_6
                        void* r3_4
                        r0_43, r1_13, r2_6, r3_4 = sub_19e5e0(arg1, "OE", 0x1d05eb)
                        
                        if (r0_43 == 0)
                            void* r0_36 = sub_19ec40(arg1, r1_13, r2_6, r3_4, 0x1d05e6)
                            var_30 = r0_36
                            
                            if (r0_36 == 0)
                                goto label_1a4672_2
                            
                            sub_19f9dc(&arg1[2], &var_30)
                            continue
                        else
                            r4_2 = 2
                else
                    if (zx.d(*r0_38) != 0x45)
                        if (zx.d(*r0_38) != 0x76)
                            goto label_1a465a
                        
                        *arg1 = &r0_38[1]
                        continue
                    
                    r4_2 = 0
                    *arg1 = &r0_38[1]
                
                sub_19fa46(&var_30, arg1, r0_34)
                result = sub_19fbde(&arg1[0x5c], 0x20)
                void* r3_5 = var_30
                *result = &_vtable_for_(anonymous namespace)::FunctionType{for `(anonymous namespace)::Node'}
                *(result + 4) = &__elf_header.type
                *(result + 8) = r0_31
                *(result + 0xc) = r3_5
                *(result + 0x10) = var_2c
                *(result + 0x14) = r0_2
                *(result + 0x18) = r4_2
                *(result + 0x1c) = r11_1
                break

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
