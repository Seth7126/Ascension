// 函数: sub_19f8b0
// 地址: 0x19f8b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* r5
void* var_10 = r5
int32_t r4
int32_t var_14 = r4
int32_t __saved_r7
int32_t* var_24 = &__saved_r7
void* var_2c = r5
int32_t var_30 = r4
int32_t r0 = *__stack_chk_guard
char* r0_1 = *arg1
int32_t r1 = arg1[1]
void* r2 = r1 - r0_1
uint32_t entry_r3

if (r1 != r0_1)
    entry_r3 = zx.d(*r0_1)
    void* result
    
    if (entry_r3 == 0x4a)
        int32_t r3_1 = arg1[3]
        int32_t r2_2 = arg1[2]
        void* r0_7 = &r0_1[1]
        *arg1 = r0_7
        
        while (true)
            if (r0_7 != r1 && zx.d(*r0_7) == 0x45)
                *arg1 = r0_7 + 1
                sub_19fa46(&var_2c, arg1, (r3_1 - r2_2) s>> 2)
                result = sub_19fbde(&arg1[0x5c], 0x10)
                void* r3_3 = var_2c
                *result = &_vtable_for_(anonymous namespace)::TemplateArgumentPack{for `(anonymous namespace)::Node'}
                *(result + 4) = 0x101011c
                *(result + 8) = r3_3
                *(result + 0xc) = arg2
                goto label_19f976
            
            void* r0_10 = sub_19f8b0(arg1)
            var_2c = r0_10
            
            if (r0_10 == 0)
                break
            
            sub_19f9dc(&arg1[2], &var_2c)
            r0_7 = *arg1
            r1 = arg1[1]
        
        goto label_19f96e
    
    if (entry_r3 == 0x4c)
        if (r2 u>= 2 && zx.d(r0_1[1]) == 0x5a)
            *arg1 = &r0_1[2]
            result = sub_19e634(arg1)
            goto label_19f958
        
        int32_t r1_10 = *__stack_chk_guard
        int32_t* r0_14 = r1_10 - r0
        
        if (r1_10 == r0)
            r0_14 = arg1
        
        if (r1_10 == r0)
            return sub_1a1c18(r0_14, r1_10, r2, entry_r3, arg2) __tailcall
        
        jump(0x19f9a2)
    
    if (entry_r3 == 0x58)
        *arg1 = &r0_1[1]
        result = sub_1a09b8(arg1)
    label_19f958:
        
        if (result == 0)
        label_19f96e:
            result = nullptr
        else
            char* r1_6 = *arg1
            
            if (r1_6 == arg1[1] || zx.d(*r1_6) != 0x45)
                goto label_19f96e
            
            *arg1 = &r1_6[1]
        
    label_19f976:
        
        if (*__stack_chk_guard == r0)
            return result
        
        __stack_chk_fail()
        noreturn

int32_t r1_1 = *__stack_chk_guard
int32_t* r0_5 = r1_1 - r0

if (r1_1 == r0)
    r0_5 = arg1

if (r1_1 == r0)
    return sub_19ec40(r0_5, r1_1, r2, entry_r3, arg2) __tailcall

jump(0x19f906)
