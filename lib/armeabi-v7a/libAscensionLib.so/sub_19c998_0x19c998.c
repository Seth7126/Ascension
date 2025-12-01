// 函数: sub_19c998
// 地址: 0x19c998
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
__aeabi_memclr8(arg1, 0x18)
int32_t r10 = arg2 & 1
arg1[6] = 3

if (r10 == 0)
    if (arg2 << 0x1e s< 0)
        if ((arg2 & 0xc) != 0xc)
            goto label_19ca02
        
        arg1[6] = 2
    else
        arg1[6] = 3
else if ((arg2 & 0xe) != 0)
    arg1[6] = 3
else
label_19ca02:
    void* r0_8
    int32_t r2
    r0_8, r2 = sub_1a8728(arg5)
    void* var_2c = r0_8
    
    if (r0_8 == 0)
        arg1[6] = 8
    else
        char* r6_1 = r0_8
        int32_t (__convention("cdecl")* const var_54_1)() = __stack_chk_guard
        arg1[3] = r0_8
        int32_t r0_10 = sub_19ccbc(arg5, 0xf, r2)
        int32_t r0_12 = sub_1a875c(arg5)
        var_2c = &r6_1[1]
        int32_t r0_15 = sub_19cee8(&var_2c, zx.d(*r6_1))
        char* r2_1 = var_2c
        void* r1_2 = &r2_1[1]
        var_2c = r1_2
        
        if (r0_15 == 0)
            r0_15 = r0_12
        
        void* r0_19
        
        if (zx.d(*r2_1) == 0xff)
            r0_19 = nullptr
        else
            void* r0_18 = sub_19cf90(&var_2c)
            r1_2 = var_2c
            r0_19 = r0_18 + r1_2
        
        var_2c = r1_2 + 1
        int32_t r5_2 = (r0_10 & 0xfffffffe) + not.d(r0_12)
        uint32_t r6_3 = zx.d(*r1_2)
        void* r0_22 = sub_19cf90(&var_2c)
        void* r1_3 = var_2c
        void* var_30 = r1_3
        void* r0_23 = r0_22 + r1_3
        int32_t r0_30
        void* r0_32
        
        while (true)
            if (r1_3 u< r0_23)
                int32_t r0_26 = sub_19cee8(&var_30, r6_3)
                int32_t r0_28 = sub_19cee8(&var_30, r6_3)
                r0_30 = sub_19cee8(&var_30, r6_3)
                r0_32 = sub_19cf90(&var_30)
                bool cond:3_1 = r0_26 u>= r5_2
                
                if (r0_26 u<= r5_2)
                    cond:3_1 = r5_2 u>= r0_28 + r0_26
                
                if (not(cond:3_1))
                    break
                
                if (r5_2 u>= r0_26)
                    r1_3 = var_30
                    continue
            
        label_19cc96:
            sub_19ccf4(arg3, arg4)
            noreturn
        
        int32_t r0_43
        int32_t* r1_11
        
        if (r0_30 == 0)
            r1_11 = arg1
            r0_43 = 8
        else
            int32_t r2_2 = r0_30 + r0_15
            
            if (r0_32 != 0)
                void* r9_3 = r0_32 + r0_23 - 1
                int32_t r10_2 = arg2 & 8
                void* var_34 = r9_3
                uint32_t r0_37 = __clz((arg2 & 4) + r10) u>> 5
                void* var_5c_2 = &arg4[0x16]
                
                while (true)
                    int32_t r0_51
                    int32_t r3
                    r0_51, r3 = sub_19d024(&var_34)
                    void* var_38
                    
                    if (r0_51 s>= 1)
                        if (r0_19 == 0)
                            goto label_19cc96
                        
                        void* r0_53 = r0_19 - (r0_51 << 2)
                        int32_t* r1_13 = *r0_53
                        int32_t* r0_54
                        
                        if (r1_13 != 0)
                            r0_54 = *(r1_13 + r0_53)
                        
                        if (r1_13 == 0 || r0_54 == 0)
                            if (r0_37 == 0)
                                goto label_19cc3a
                            
                            if (r10_2 == 0)
                                goto label_19cc96
                            
                            goto label_19cb5e
                        
                        if (arg3 == 0)
                            goto label_19cb5e
                        
                        void* r1_16 = *arg4
                        void* r1_19 = var_5c_2
                        
                        if (((r1_16 ^ 0x432b2b01) | (*(r1_16 + 4) ^ 0x434c4e47)) == 0)
                            r1_19 = *(arg4 - 0x28)
                        
                        var_38 = r1_19
                        
                        if (r1_19 == 0)
                            sub_19ccf4(1, arg4)
                            noreturn
                        
                        int32_t r1_22 = *(arg4 - 0x24)
                        
                        if (r1_22 == 0)
                            sub_19ccf4(1, arg4)
                            noreturn
                        
                        if ((*(*r0_54 + 0x10))(r0_54, r1_22, &var_38) == 0)
                            goto label_19cb5e
                        
                        if (r10 == 0)
                            goto label_19cb48
                        
                        *arg1 = r0_51
                        arg1[1] = r0_51 s>> 0x1f
                        arg1[2] = r9_3
                        void* r0_72 = var_38
                        arg1[4] = r2_2
                        arg1[5] = r0_72
                        arg1[6] = 6
                        goto label_19c9dc
                    
                    if (r0_51 s<= 0xffffffff)
                        if (arg3 == 0)
                            if (r0_37 == 0)
                                goto label_19cc3a
                            
                            if (r10_2 != 0)
                                goto label_19cb5e
                            
                            sub_19ccf4(0, arg4)
                            noreturn
                        
                        void* r0_61 = *arg4
                        void* r4_3 = var_5c_2
                        
                        if (((r0_61 ^ 0x432b2b01) | (*(r0_61 + 4) ^ 0x434c4e47)) == 0)
                            r4_3 = *(arg4 - 0x28)
                        
                        bool cond:5_1 = r4_3 != 0
                        
                        if (r4_3 != 0)
                            r3 = *(arg4 - 0x24)
                            cond:5_1 = r3 != 0
                        
                        if (not(cond:5_1))
                            sub_19ccf4(1, arg4)
                            noreturn
                        
                        int32_t r6_4 = r0_51 s>> 0x1f
                        
                        if (sub_19cfb8(r0_51, r6_4, r0_19, r3, r4_3, arg4) == 0)
                            goto label_19cb5e
                        
                        if (r10 != 0)
                            arg1[4] = r2_2
                            arg1[5] = r4_3
                            arg1[6] = 6
                            *arg1 = r0_51
                            arg1[1] = r6_4
                            arg1[2] = r9_3
                            goto label_19c9dc
                        
                    label_19cb48:
                        
                        if (r10_2 != 0)
                            goto label_19cb5e
                        
                        sub_19ccf4(1, arg4)
                        noreturn
                    
                    if ((arg2 & 6) == 2)
                    label_19cc3a:
                        arg1[4] = r2_2
                        *arg1 = r0_51
                        arg1[1] = r0_51 s>> 0x1f
                        arg1[2] = r9_3
                        
                        if (((*arg4 ^ 0x432b2b01) | (arg4[1] ^ 0x434c4e47)) == 0)
                            var_5c_2 = *(arg4 - 0x28)
                        
                        arg1[5] = var_5c_2
                        arg1[6] = 6
                        goto label_19c9dc
                    
                label_19cb5e:
                    void* r4_2 = var_34
                    var_38 = r4_2
                    int32_t r0_49 = sub_19d024(&var_38)
                    
                    if (r0_49 == 0)
                        break
                    
                    r9_3 = r4_2 + r0_49
                    var_34 = r9_3
                
                r1_11 = arg1
                r0_43 = 8
            else if ((arg2 & 6) != 2)
                r1_11 = arg1
                r0_43 = 8
            else
                r1_11 = arg1
                *r1_11 = 0
                r1_11[1] = 0
                r0_43 = 6
                r1_11[4] = r2_2
        
        r1_11[6] = r0_43

label_19c9dc:
int32_t r1 = *__stack_chk_guard

if (r1 == r0)
    return r1 - r0

__stack_chk_fail()
noreturn
