// 函数: sub_1a01e4
// 地址: 0x1a01e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6
int32_t var_c = r6
int32_t r5
int32_t var_10 = r5
int32_t __saved_r7
int32_t* var_28 = &__saved_r7
int32_t var_2c = r6
int32_t var_30 = r5
int32_t r0 = *__stack_chk_guard
char* r1 = *arg1
int32_t r2 = arg1[1]
int32_t result

if (r1 == r2)
    result = 0
else
    result = 0
    
    if (zx.d(*r1) == 0x54)
        void* r1_1 = &r1[1]
        *arg1 = r1_1
        var_2c = 0
        int32_t r5_1
        
        if (r1_1 == r2 || zx.d(*r1_1) != 0x5f)
            if (sub_1a07fe(arg1, &var_2c) != 0)
                result = 0
            else
                r5_1 = var_2c + 1
                var_2c = r5_1
                r1_1 = *arg1
                
                if (r1_1 != arg1[1] && zx.d(*r1_1) == 0x5f)
                    goto label_1a023c
                
                result = 0
        else
            r5_1 = 0
        label_1a023c:
            uint32_t r0_7 = zx.d(*(arg1 + 0x16a))
            *arg1 = r1_1 + 1
            
            if (r0_7 != 0)
                result = sub_1a085e(arg1, "auto")
            else if (zx.d(*(arg1 + 0x169)) == 0)
                int32_t r0_17 = arg1[0x48]
                
                if (r5_1 u>= (arg1[0x49] - r0_17) s>> 2)
                    result = 0
                else
                    result = *(r0_17 + (r5_1 << 2))
            else
                void* r0_11 = sub_19fbde(&arg1[0x5c], 0x14)
                *r0_11 = &_vtable_for_(anonymous namespace)::ForwardTemplateReference{for `(anonymous namespace)::Node'}
                *(r0_11 + 4) = 0x202021f
                *(r0_11 + 8) = r5_1
                *(r0_11 + 0xc) = 0
                *(r0_11 + 0x10) = 0
                void** r0_12 = arg1[0x54]
                
                if (r0_12 == arg1[0x55])
                    void* r8_1 = arg1[0x53]
                    void* r10_1 = r0_12 - r8_1
                    void* r9_1
                    
                    if (&arg1[0x56] == r8_1)
                        r9_1 = malloc(r10_1 << 1)
                        
                        if (r10_1 != 0)
                            __aeabi_memmove4(r9_1, r8_1, r10_1)
                        
                        arg1[0x53] = r9_1
                    else
                        void* r0_16 = realloc(r8_1, r10_1 << 1)
                        r9_1 = r0_16
                        arg1[0x53] = r0_16
                    
                    r0_12 = r9_1 + (r10_1 s>> 2 << 2)
                    arg1[0x54] = r0_12
                    arg1[0x55] = r9_1 + (r10_1 s>> 1 << 2)
                
                arg1[0x54] = &r0_12[1]
                *r0_12 = r0_11
                result = *(arg1[0x54] - 4)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
