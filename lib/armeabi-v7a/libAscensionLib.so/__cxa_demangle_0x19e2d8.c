// 函数: __cxa_demangle
// 地址: 0x19e2d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r7
int32_t var_8 = r7
int32_t r6
int32_t var_c = r6
int32_t r5
int32_t var_10 = r5
int32_t r4
int32_t var_14 = r4
void var_11f0
void* sp = &var_11f0
int32_t r0 = *__stack_chk_guard
void* result_1

if (arg1 != 0)
    result_1 = arg2

if (arg1 != 0 && (arg2 == 0 || arg3 != 0))
    char* r0_3 = &arg1[strlen(arg1)]
    char* var_11c0 = arg1
    void var_11ac
    void* var_11b8_1 = &var_11ac
    void* var_11b4_1 = &var_11ac
    void* var_112c
    int32_t* var_11b0_1 = &var_112c
    void var_1120
    var_112c = &var_1120
    void* var_1128_1 = &var_1120
    void* var_10a0
    int32_t* var_1124_1 = &var_10a0
    void var_1094
    var_10a0 = &var_1094
    void* var_109c_1 = &var_1094
    void* var_1074
    int32_t* var_1098_1 = &var_1074
    void var_1068
    var_1074 = &var_1068
    void* var_1070_1 = &var_1068
    int16_t var_1058
    int16_t* var_106c_1 = &var_1058
    var_1058 = 1
    char var_1056_1 = 0
    int32_t var_1050 = 0
    int32_t* var_50_1 = &var_1050
    int32_t var_104c_1 = 0
    int32_t var_11d4_1 = 0xffffffff
    int32_t var_11d0_1 = 0xffffffff
    int32_t r6_5
    void* r0_10
    void* r9_1
    
    if (sub_19e5e0(&var_11c0, "_Z", 0x1cfd55) == 0)
        int32_t r0_12
        int32_t r1_3
        int32_t r2
        void* r3
        r0_12, r1_3, r2, r3 = sub_19e5e0(&var_11c0, "___Z", &data_1cfd56[4])
        
        if (r0_12 == 0)
            r9_1 = sub_19ec40(&var_11c0, r1_3, r2, r3, &var_1050)
            
            if (r0_3 == var_11c0 && r9_1 != 0)
            label_19e464:
                int32_t r6_4
                
                if (result_1 == 0)
                    r6_4 = 0x400
                    void* result_3 = malloc(0x400)
                    
                    if (result_3 != 0)
                        result_1 = result_3
                        goto label_19e484
                    
                    result_1 = nullptr
                    r6_5 = 0xffffffff
                else
                    r6_4 = *arg3
                label_19e484:
                    void* result_2 = result_1
                    int32_t var_11dc_1 = 0
                    int32_t var_11d8_1 = r6_4
                    sub_19e510(r9_1, &result_2)
                    sub_19e536(&result_2, 0)
                    
                    if (arg3 != 0)
                        *arg3 = var_11dc_1
                    
                    result_1 = result_2
                    r6_5 = 0
            else
                r6_5 = 0xfffffffe
        else
            void* r0_14 = sub_19e634(&var_11c0)
            void* var_11c4 = r0_14
            
            if (r0_14 != 0)
                if (sub_19e5e0(&var_11c0, "_block_invoke", &data_1cfd5b[0xd]) == 0)
                    goto label_19e45a
                
                char* r0_17 = var_11c0
                int32_t r6_3
                
                if (r0_17 == r0_3 || zx.d(*r0_17) != 0x5f)
                    r6_3 = 0
                else
                    r6_3 = 1
                    var_11c0 = &r0_17[1]
                
                r9_1 = nullptr
                char* var_11cc
                sub_19ebc4(&var_11cc, &var_11c0, 0)
                int32_t var_11c8
                
                if (r6_3 != 0 && var_11cc == var_11c8)
                    goto label_19e45e
                
                if (r0_3 != var_11c0)
                    goto label_19e45a
                
                r0_10 = sub_19ec20(&var_11c0, "invocation function for block in ", &var_11c4)
                goto label_19e3d4
            
        label_19e45a:
            r9_1 = nullptr
        label_19e45e:
            
            if (r9_1 != 0)
                goto label_19e464
            
            r6_5 = 0xfffffffe
    else
        void* r0_7 = sub_19e634(&var_11c0)
        r9_1 = r0_7
        
        if (r0_7 == 0)
            r6_5 = 0xfffffffe
        else
            char* r4_1 = var_11c0
            
            if (r0_3 == r4_1)
                goto label_19e45e
            
            if (zx.d(*r4_1) == 0x2e)
                r0_10 = sub_19fbde(&var_1050, 0x14)
                *r0_10 =
                    &_vtable_for_(anonymous namespace)::DotSuffix{for `(anonymous namespace)::Node'}
                *(r0_10 + 4) = 0x1010101
                *(r0_10 + 8) = r9_1
                *(r0_10 + 0xc) = r4_1
                *(r0_10 + 0x10) = r0_3
                var_11c0 = r0_3
            label_19e3d4:
                r9_1 = r0_10
                goto label_19e45e
            
            r6_5 = 0xfffffffe
    
    if (arg4 != 0)
        *arg4 = r6_5
    
    sub_19e550(&var_11c0)
    
    if (r6_5 != 0)
        result_1 = nullptr
else
    if (arg4 != 0)
        *arg4 = 0xfffffffd
    
    result_1 = nullptr

int32_t r1_11 = *__stack_chk_guard
void* result = r1_11 - r0

if (r1_11 == r0)
    result = result_1
    sp = &var_14

if (r1_11 != r0)
    __stack_chk_fail()
    noreturn

*sp
*(sp + 4)
*(sp + 8)
*(sp + 0xc)
return result
