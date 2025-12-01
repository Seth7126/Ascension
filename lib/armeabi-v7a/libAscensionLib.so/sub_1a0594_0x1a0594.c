// 函数: sub_1a0594
// 地址: 0x1a0594
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6
int32_t var_c = r6
int32_t var_10 = arg3
void* r4
void* var_14 = r4
int32_t __saved_r7
int32_t* var_24 = &__saved_r7
int32_t var_28 = r6
void* var_30 = r4
int32_t* sp = &var_30
int32_t r0 = *__stack_chk_guard
char* r0_1 = *arg1
void* r0_13
void* r5_1

if (arg1[1] == r0_1)
label_1a0622:
    
    if (sub_19e5e0(arg1, "DC", 0x1d041d) == 0)
        r0_13 = sub_1a32a4(arg1, arg2)
    label_1a068e:
        r5_1 = r0_13
    label_1a0690:
        
        if (r5_1 != 0)
        label_1a0694:
            void* r1_10 = *__stack_chk_guard
            void* r0_28 = r1_10 - r0
            bool cond:0 = r1_10 == r0
            
            if (r1_10 == r0)
                r0_28 = arg1
                r1_10 = r5_1
                sp = &var_14
            
            if (not(cond:0))
                jump(sub_1a06b0)
            
            *sp
            sp[1]
            sp[3]
            sp[4]
            return sub_1a0500(r0_28, r1_10, sp[2]) __tailcall
    else
        int32_t r8_1 = (arg1[3] - arg1[2]) s>> 2
        
        while (true)
            void* r0_19 = sub_1a31a4(arg1)
            var_30 = r0_19
            
            if (r0_19 == 0)
                break
            
            sub_19f9dc(&arg1[2], &var_30)
            char* r0_21 = *arg1
            
            if (r0_21 != arg1[1])
                if (zx.d(*r0_21) == 0x45)
                    *arg1 = &r0_21[1]
                    sub_19fa46(&var_30, arg1, r8_1)
                    r5_1 = sub_19fbde(&arg1[0x5c], 0x10)
                    void* r2_3 = var_30
                    *r5_1 = &_vtable_for_(anonymous namespace)::StructuredBindingName{for `(anonymous namespace)::Node'}
                    *(r5_1 + 4) = 0x1010129
                    *(r5_1 + 8) = r2_3
                    *(r5_1 + 0xc) = arg3
                    goto label_1a0694
else
    uint32_t r0_2 = zx.d(*r0_1)
    
    if (r0_2 != 0x55)
        if (zx.d(r0_2.b - 0x31) u> 8)
            goto label_1a0622
        
        r0_13 = sub_1a31a4(arg1)
        goto label_1a068e
    
    if (sub_19e5e0(arg1, "Ut", 0x1d0420) != 0)
        r5_1 = nullptr
        sub_19ebc4(&var_30, arg1, 0)
        char* r0_6 = *arg1
        
        if (r0_6 != arg1[1])
            if (zx.d(*r0_6) != 0x5f)
                r5_1 = nullptr
            else
                *arg1 = &r0_6[1]
                r5_1 = sub_19fbde(&arg1[0x5c], 0x10)
                void* r2_1 = var_30
                *r5_1 = &_vtable_for_(anonymous namespace)::UnnamedTypeName{for `(anonymous namespace)::Node'}
                *(r5_1 + 4) = 0x1010127
                *(r5_1 + 8) = r2_1
                *(r5_1 + 0xc) = arg3
        
        goto label_1a0690
    
    if (sub_19e5e0(arg1, "Ul", 0x1d0423) != 0)
        char r10_1 = *(arg1 + 0x16a)
        *(arg1 + 0x16a) = 1
        int32_t r0_33
        int32_t r2_5
        void* r3_4
        r0_33, r2_5, r3_4 = sub_19e5e0(arg1, "vE", 0x1d0426)
        int32_t r6_4
        void* r8_2
        
        if (r0_33 == 0)
            uint32_t r1_13 = arg1[3]
            int32_t r8_3 = (r1_13 - arg1[2]) s>> 2
            
            while (true)
                void* r0_40 = sub_19ec40(arg1, r1_13, r2_5, r3_4, &arg1[2])
                var_30 = r0_40
                
                if (r0_40 == 0)
                    goto label_1a0784
                
                r2_5, r3_4 = sub_19f9dc(&arg1[2], &var_30)
                char* r0_42 = *arg1
                r1_13 = arg1[1]
                
                if (r0_42 != r1_13)
                    r1_13 = zx.d(*r0_42)
                    
                    if (r1_13 == 0x45)
                        *arg1 = &r0_42[1]
                        sub_19fa46(&var_30, arg1, r8_3)
                        r8_2 = var_30
                        r6_4 = arg3
                        break
        else
            r8_2 = nullptr
            r6_4 = 0
        
        r5_1 = nullptr
        sub_19ebc4(&var_30, arg1, 0)
        char* r0_46 = *arg1
        
        if (r0_46 != arg1[1])
            if (zx.d(*r0_46) != 0x5f)
            label_1a0784:
                r5_1 = nullptr
            else
                *arg1 = &r0_46[1]
                r5_1 = sub_19fbde(&arg1[0x5c], 0x18)
                void* r0_50 = var_30
                *r5_1 = &_vtable_for_(anonymous namespace)::ClosureTypeName{for `(anonymous namespace)::Node'}
                *(r5_1 + 4) = 0x1010128
                *(r5_1 + 8) = r8_2
                *(r5_1 + 0xc) = r6_4
                *(r5_1 + 0x10) = r0_50
                *(r5_1 + 0x14) = arg3
        
        *(arg1 + 0x16a) = r10_1
        goto label_1a0690

if (*__stack_chk_guard == r0)
    return 0

__stack_chk_fail()
noreturn
