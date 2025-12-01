// 函数: sub_1a1c18
// 地址: 0x1a1c18
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
char* r5
char* var_10 = r5
int32_t __saved_r7
int32_t* var_28 = &__saved_r7
char* var_30 = r5
int32_t r0 = *__stack_chk_guard
char* r5_1 = *arg1
void* r6 = arg1[1]
void* result

if (r5_1 == r6 || zx.d(*r5_1) != 0x4c)
label_1a2022:
    result = nullptr
label_1a202a:
    
    if (*__stack_chk_guard == r0)
        return result
    
    __stack_chk_fail()
    noreturn

*arg1 = &r5_1[1]

if (r6 != &r5_1[1])
    arg2 = zx.d(r5_1[1]) - 0x54
    
    if (arg2 u> 0x25)
        goto label_1a1ce2
    
    result = nullptr
    void* const r1_6
    void* const r1_25
    void* r9_2
    void* r10_2
    
    switch (arg2)
        case 0
            goto label_1a202a
        case 1, 2, 3, 4, 5, 6, 7, 8, 9, 0xa, 0xc, 0x13, 0x17, 0x1c, 0x1d, 0x1e, 0x21, 0x22
            goto label_1a1ce2
        case 0xb
            if (sub_19e5e0(arg1, "_Z", 0x1cfd55) == 0)
                goto label_1a2022
            
            result = sub_19e634(arg1)
            
            if (result == 0)
                goto label_1a2022
            
            char* r1 = *arg1
            
            if (r1 == arg1[1] || zx.d(*r1) != 0x45)
                goto label_1a2022
            
            *arg1 = &r1[1]
            goto label_1a202a
        case 0xd
            *arg1 = &r5_1[2]
            
            if (*__stack_chk_guard != r0)
                __stack_chk_fail()
                noreturn
            
            return sub_1a256c(arg1, "signed char", &data_1cff93[0xb], arg5) __tailcall
        case 0xe
            char* r0_17
            
            if (sub_19e5e0(arg1, "b0E", 0x1cff8e) == 0)
                if (sub_19e5e0(arg1, "b1E", 0x1cff92) == 0)
                    goto label_1a2022
                
                r0_17 = 1
            else
                r0_17 = nullptr
            
            var_30 = r0_17
            result = sub_1a25f0(arg1, &var_30)
            goto label_1a202a
        case 0xf
            *arg1 = &r5_1[2]
            
            if (*__stack_chk_guard != r0)
                __stack_chk_fail()
                noreturn
            
            return sub_1a256c(arg1, "char", &data_1c141e[4], arg5) __tailcall
        case 0x10
            r9_2 = &r5_1[2]
            *arg1 = r9_2
            
            if (r6 - r9_2 u< 0x11)
                goto label_1a2022
            
            r10_2 = &r5_1[0x12]
            int32_t r4_1 = 0
            int32_t i
            
            do
                if (r4_1 == 0x10)
                    *arg1 = r10_2
                    
                    if (r10_2 == r6)
                        goto label_1a2022
                    
                    if (zx.d(*r10_2) != 0x45)
                        goto label_1a2022
                    
                    *arg1 = &r5_1[0x13]
                    result = sub_19fbde(&arg1[0x5c], 0x10)
                    r1_25 = &data_1dd3fc
                    goto label_1a2014
                
                i = isxdigit(zx.d(*(r9_2 + r4_1)))
                r4_1 += 1
                result = nullptr
            while (i != 0)
            goto label_1a202a
        case 0x11
            r9_2 = &r5_1[2]
            *arg1 = r9_2
            
            if (r6 - r9_2 u< 0x11)
                goto label_1a2022
            
            r10_2 = &r5_1[0x12]
            int32_t r4_2 = 0
            int32_t i_1
            
            do
                if (r4_2 == 0x10)
                    *arg1 = r10_2
                    
                    if (r10_2 == r6)
                        goto label_1a2022
                    
                    if (zx.d(*r10_2) != 0x45)
                        goto label_1a2022
                    
                    *arg1 = &r5_1[0x13]
                    result = sub_19fbde(&arg1[0x5c], 0x10)
                    r1_25 = &data_1dd430
                    goto label_1a2014
                
                i_1 = isxdigit(zx.d(*(r9_2 + r4_2)))
                r4_2 += 1
                result = nullptr
            while (i_1 != 0)
            goto label_1a202a
        case 0x12
            r9_2 = &r5_1[2]
            *arg1 = r9_2
            
            if (r6 - r9_2 u< 9)
                goto label_1a2022
            
            r10_2 = &r5_1[0xa]
            int32_t r4_3 = 0
            int32_t i_2
            
            do
                if (r4_3 == 8)
                    *arg1 = r10_2
                    
                    if (r10_2 == r6)
                        goto label_1a2022
                    
                    if (zx.d(*r10_2) != 0x45)
                        goto label_1a2022
                    
                    *arg1 = &r5_1[0xb]
                    result = sub_19fbde(&arg1[0x5c], 0x10)
                    r1_25 = &data_1dd3c8
                label_1a2014:
                    *result = r1_25 + 8
                    *(result + 4) = 0x101012a
                    *(result + 8) = r9_2
                    *(result + 0xc) = r10_2
                    goto label_1a202a
                
                i_2 = isxdigit(zx.d(*(r9_2 + r4_3)))
                r4_3 += 1
                result = nullptr
            while (i_2 != 0)
            goto label_1a202a
        case 0x14
            *arg1 = &r5_1[2]
            
            if (*__stack_chk_guard != r0)
                __stack_chk_fail()
                noreturn
            
            return sub_1a256c(arg1, "unsigned char", &data_1cff9f[0xd], arg5) __tailcall
        case 0x15
            *arg1 = &r5_1[2]
            
            if (*__stack_chk_guard != r0)
                __stack_chk_fail()
                noreturn
            
            return sub_1a256c(arg1, &data_1bfacb, &data_1bfacb, arg5) __tailcall
        case 0x16
            *arg1 = &r5_1[2]
            
            if (*__stack_chk_guard != r0)
                __stack_chk_fail()
                noreturn
            
            r1_6 = &data_1cffc2
        case 0x18
            *arg1 = &r5_1[2]
            
            if (*__stack_chk_guard != r0)
                __stack_chk_fail()
                noreturn
            
            r1_6 = &data_1cffc4
        case 0x19
            *arg1 = &r5_1[2]
            
            if (*__stack_chk_guard != r0)
                __stack_chk_fail()
                noreturn
            
            r1_6 = &data_1cffc6
        label_1a1f48:
            return sub_1a256c(arg1, r1_6, r1_6 + 2, arg5) __tailcall
        case 0x1a
            *arg1 = &r5_1[2]
            
            if (*__stack_chk_guard != r0)
                __stack_chk_fail()
                noreturn
            
            return sub_1a256c(arg1, "__int128", &data_1cffd0[8], arg5) __tailcall
        case 0x1b
            *arg1 = &r5_1[2]
            
            if (*__stack_chk_guard != r0)
                __stack_chk_fail()
                noreturn
            
            return sub_1a256c(arg1, "unsigned __int128", &data_1cffd9[0x11], arg5) __tailcall
        case 0x1f
            *arg1 = &r5_1[2]
            
            if (*__stack_chk_guard != r0)
                __stack_chk_fail()
                noreturn
            
            return sub_1a256c(arg1, "short", &data_1cffad[5], arg5) __tailcall
        case 0x20
            *arg1 = &r5_1[2]
            
            if (*__stack_chk_guard != r0)
                __stack_chk_fail()
                noreturn
            
            return sub_1a256c(arg1, "unsigned short", &data_1cffb3[0xe], arg5) __tailcall
        case 0x23
            *arg1 = &r5_1[2]
            
            if (*__stack_chk_guard != r0)
                __stack_chk_fail()
                noreturn
            
            return sub_1a256c(arg1, "wchar_t", &data_1cff83[7], arg5) __tailcall
        case 0x24
            *arg1 = &r5_1[2]
            
            if (*__stack_chk_guard != r0)
                __stack_chk_fail()
                noreturn
            
            r1_6 = &data_1cffc9
            goto label_1a1f48
        case 0x25
            *arg1 = &r5_1[2]
            
            if (*__stack_chk_guard != r0)
                __stack_chk_fail()
                noreturn
            
            return sub_1a256c(arg1, &data_1cffcc, &data_1cffcf, arg5) __tailcall
    
    return sub_1a256c(arg1, r1_6, r1_6 + 1, arg5) __tailcall

label_1a1ce2:
void* result_2 = sub_19ec40(arg1, arg2, arg3, arg4, r6)

if (result_2 == 0)
    goto label_1a2022

void* result_1 = result_2
void* result_3 = nullptr
sub_19ebc4(&var_30, arg1, 0)
char* r0_9 = *arg1
char* r10_1 = var_30

if (r0_9 != arg1[1])
    if (zx.d(*r0_9) != 0x45)
        result_3 = nullptr
    else
        result_3 = 1
        *arg1 = &r0_9[1]

if (r10_1 == arg5)
    if (result_3 == 0)
        result_1 = result_3
    
    result = result_1
    goto label_1a202a

if (result_3 == 0)
    goto label_1a2022

result = sub_19fbde(&arg1[0x5c], 0x14)
*result = &_vtable_for_(anonymous namespace)::IntegerCastExpr{for `(anonymous namespace)::Node'}
*(result + 4) = 0x101012a
*(result + 8) = result_1
*(result + 0xc) = r10_1
*(result + 0x10) = arg5
goto label_1a202a
