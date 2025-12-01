// 函数: sub_19fe78
// 地址: 0x19fe78
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r5 = arg2
int32_t var_28 = *__stack_chk_guard
char* r0_1 = *arg1
int32_t r1 = arg1[1]
void* result

if (r0_1 == r1 || zx.d(*r0_1) != 0x49)
    result = nullptr
else
    void* r0_2 = &r0_1[1]
    *arg1 = r0_2
    int32_t (__convention("cdecl")* const var_7c_1)() = __stack_chk_guard
    
    if (r5 != 0)
        arg1[0x49] = arg1[0x48]
    
    void* r11_1 = &arg1[0x49]
    void var_48
    void* r6_1 = &var_48
    void* var_5c_1 = &var_48
    void* var_78_1 = r11_1
    int32_t r2_5 = (arg1[3] - arg1[2]) s>> 2
    int32_t var_68_1 = r5
    int32_t* var_64_1 = &var_28
    
    while (true)
        void* var_54
        void* var_50
        
        if (r0_2 != r1 && zx.d(*r0_2) == 0x45)
            *arg1 = r0_2 + 1
            sub_19fa46(&var_54, arg1, r2_5)
            result = sub_19fbde(&arg1[0x5c], 0x10)
            void* r3_8 = var_54
            *result =
                &_vtable_for_(anonymous namespace)::TemplateArgs{for `(anonymous namespace)::Node'}
            *(result + 4) = 0x101011e
            *(result + 8) = r3_8
            *(result + 0xc) = var_50
            break
        
        if (r5 == 0)
            void* r0_7 = sub_19f8b0(arg1, r6_1)
            var_54 = r0_7
            
            if (r0_7 != 0)
                sub_19f9dc(&arg1[2], &var_54)
            label_1a00ce:
                r0_2 = *arg1
                r1 = arg1[1]
                continue
        else
            var_54 = r6_1
            void* var_50_1 = r6_1
            int32_t* var_4c_1 = var_64_1
            void* r5_1 = arg1[0x48]
            int32_t* var_50_2
            int32_t* r1_1
            
            if (r5_1 == &arg1[0x4b])
                int32_t r1_3 = *r11_1
                void* r9_1 = r1_3 - r5_1
                r1_1 = r6_1
                
                if (r1_3 != r5_1)
                    __aeabi_memcpy4(r6_1, &arg1[0x4b], r9_1)
                    r1_1 = (r9_1 & 0xfffffffc) + &var_54 + 0xc
                
                var_50_2 = r1_1
                *r11_1 = r5_1
            else
                var_54 = r5_1
                r1_1 = arg1[0x4a]
                var_50_2 = arg1[0x49]
                var_4c_1 = r1_1
                arg1[0x48] = &arg1[0x4b]
                arg1[0x49] = &arg1[0x4b]
                arg1[0x4a] = &arg1[0x53]
            
            void* r0_13 = sub_19f8b0(arg1, r6_1, r1_1)
            void* var_58 = r0_13
            void* r9_2 = r0_13
            void* r3_2 = var_54
            void* r0_14 = arg1[0x48]
            
            if (r3_2 == var_5c_1)
                void* r1_7
                
                if (r0_14 == &arg1[0x4b])
                    r1_7 = var_5c_1
                else
                    free(r0_14)
                    arg1[0x48] = &arg1[0x4b]
                    arg1[0x49] = &arg1[0x4b]
                    arg1[0x4a] = &arg1[0x53]
                    r0_14 = &arg1[0x4b]
                    r3_2 = var_54
                    r1_7 = r3_2
                
                void* r0_20
                void* r1_9
                
                if (var_50_2 == r3_2)
                    r0_20 = nullptr
                    r1_9 = &arg1[0x4b]
                else
                    __aeabi_memmove4(r0_14, r1_7, var_50_2 - r3_2)
                    r3_2 = var_54
                    r1_9 = arg1[0x48]
                    r0_20 = var_50_2 - r3_2
                
                *r11_1 = r0_20 + r1_9
                var_50 = r3_2
            else
                arg1[0x48] = r3_2
                
                if (r0_14 == &arg1[0x4b])
                    arg1[0x49] = var_50_2
                    arg1[0x4a] = var_4c_1
                    var_54 = var_5c_1
                    var_50 = var_5c_1
                    int32_t* var_4c_3 = var_64_1
                else
                    var_54 = r0_14
                    int32_t r2_9 = arg1[0x4a]
                    arg1[0x49] = var_50_2
                    arg1[0x4a] = var_4c_1
                    var_50 = r0_14
                    int32_t var_4c_2 = r2_9
            
            if (r9_2 != 0)
                sub_19f9dc(&arg1[2], &var_58)
                
                if (zx.d(*(r9_2 + 4)) == 0x1c)
                    int32_t* r6_2 = *(r9_2 + 8)
                    int32_t r5_2 = *(r9_2 + 0xc)
                    r9_2 = sub_19fbde(&arg1[0x5c], 0x10)
                    int32_t* r2_12 = r6_2
                    *r9_2 = &_vtable_for_(anonymous namespace)::ParameterPack{for `(anonymous namespace)::Node'}
                    *(r9_2 + 4) = 0x202021b
                    *(r9_2 + 8) = r6_2
                    int32_t r0_26 = r5_2 << 2
                    int32_t r1_11 = r0_26
                    *(r9_2 + 0xc) = r5_2
                    void* r3_4
                    
                    do
                        if (r1_11 == 0)
                            *(r9_2 + 6) = 1
                            break
                        
                        r3_4 = *r2_12
                        r2_12 = &r2_12[1]
                        r1_11 -= 4
                    while (zx.d(*(r3_4 + 6)) == 1)
                    int32_t r1_12 = r0_26
                    int32_t* r2_13 = r6_2
                    void* r3_6
                    
                    do
                        if (r1_12 == 0)
                            *(r9_2 + 7) = 1
                            break
                        
                        r3_6 = *r2_13
                        r2_13 = &r2_13[1]
                        r1_12 -= 4
                    while (zx.d(*(r3_6 + 7)) == 1)
                    void* r1_13
                    
                    do
                        if (r0_26 == 0)
                            *(r9_2 + 5) = 1
                            break
                        
                        r1_13 = *r6_2
                        r6_2 = &r6_2[1]
                        r0_26 -= 4
                    while (zx.d(*(r1_13 + 5)) == 1)
                
                void** r0_34 = arg1[0x49]
                
                if (r0_34 == arg1[0x4a])
                    void* r10_1 = arg1[0x48]
                    void* r6_3 = r0_34 - r10_1
                    int32_t r1_16 = r6_3 << 1
                    void* r11_2
                    
                    if (&arg1[0x4b] == r10_1)
                        r11_2 = malloc(r1_16)
                        
                        if (r6_3 != 0)
                            __aeabi_memmove4(r11_2, r10_1, r6_3)
                    else
                        r11_2 = realloc(r10_1, r1_16)
                    
                    r0_34 = r11_2 + (r6_3 s>> 2 << 2)
                    arg1[0x48] = r11_2
                    arg1[0x49] = r0_34
                    r11_1 = var_78_1
                    arg1[0x4a] = r11_2 + (r6_3 s>> 1 << 2)
                
                *r11_1 = &r0_34[1]
                *r0_34 = r9_2
                sub_19e5b0(&var_54)
                r6_1 = var_5c_1
                r5 = var_68_1
                goto label_1a00ce
            
            sub_19e5b0(&var_54)
        
        result = nullptr
        break

if (*__stack_chk_guard == var_28)
    return result

__stack_chk_fail()
noreturn
