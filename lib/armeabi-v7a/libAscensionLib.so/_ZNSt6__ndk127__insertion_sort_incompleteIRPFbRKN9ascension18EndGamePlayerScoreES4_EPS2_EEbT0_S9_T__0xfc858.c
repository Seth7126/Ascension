// 函数: _ZNSt6__ndk127__insertion_sort_incompleteIRPFbRKN9ascension18EndGamePlayerScoreES4_EPS2_EEbT0_S9_T_
// 地址: 0xfc858
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint8_t result = 1
int32_t r0 = *__stack_chk_guard
int32_t r0_2 = (arg2 - arg1) s>> 3
int32_t r0_9
bool (* r2)(ascension::EndGamePlayerScore const&, ascension::EndGamePlayerScore const&)
void* __offset(ascension::EndGamePlayerScore, 0x8) r4_1
void* __offset(ascension::EndGamePlayerScore, 0x10) r8_1

if (r0_2 u> 5)
    int32_t r0_25 = (*arg3)(arg1 + 8, arg1)
    int32_t r0_27 = (*arg3)(arg1 + 0x10, arg1 + 8)
    
    if (r0_25 != 0)
        int32_t r2_14 = *arg1
        int32_t r1_14 = *(arg1 + 4)
        
        if (r0_27 == 0)
            int32_t r3_13 = *(arg1 + 0xc)
            *arg1 = *(arg1 + 8)
            *(arg1 + 4) = r3_13
            *(arg1 + 0xc) = r1_14
            *(arg1 + 8) = r2_14
            
            if ((*arg3)(arg1 + 0x10, arg1 + 8) != 0)
                int32_t r0_42 = *(arg1 + 8)
                r1_14 = *(arg1 + 0xc)
                int32_t r3_14 = *(arg1 + 0x14)
                *(arg1 + 8) = *(arg1 + 0x10)
                *(arg1 + 0xc) = r3_14
                *(arg1 + 0x10) = r0_42
                *(arg1 + 0x14) = r1_14
        else
            int32_t r3_7 = *(arg1 + 0x14)
            *arg1 = *(arg1 + 0x10)
            *(arg1 + 4) = r3_7
            *(arg1 + 0x10) = r2_14
            *(arg1 + 0x14) = r1_14
    else if (r0_27 != 0)
        int32_t r0_31 = *(arg1 + 8)
        int32_t r1_16 = *(arg1 + 0xc)
        int32_t r3_9 = *(arg1 + 0x14)
        *(arg1 + 8) = *(arg1 + 0x10)
        *(arg1 + 0xc) = r3_9
        *(arg1 + 0x10) = r0_31
        *(arg1 + 0x14) = r1_16
        
        if ((*arg3)(arg1 + 8, arg1) != 0)
            int32_t r0_34 = *arg1
            int32_t r1_18 = *(arg1 + 4)
            int32_t r3_10 = *(arg1 + 0xc)
            *arg1 = *(arg1 + 8)
            *(arg1 + 4) = r3_10
            *(arg1 + 8) = r0_34
            *(arg1 + 0xc) = r1_18
    
    void* __offset(ascension::EndGamePlayerScore, 0x18) r0_43 = arg1 + 0x18
    
    if (r0_43 == arg2)
    label_fcc08:
        result = 1
    else
        int32_t r8_2 = 0
        int32_t r9 = 0
        
        while (true)
            if ((*arg3)() != 0)
                int32_t r1_23 = *(r0_43 + 4)
                int32_t r5_2 = r8_2
                int32_t var_30 = *r0_43
                void* r0_50
                
                while (true)
                    void* r0_46 = arg1 + r5_2
                    int32_t r2_24 = *(r0_46 + 0x14)
                    *(r0_46 + 0x18) = *(r0_46 + 0x10)
                    *(r0_46 + 0x1c) = r2_24
                    
                    if (r5_2 == 0xfffffff0)
                        r0_50 = arg1
                        break
                    
                    r5_2 -= 8
                    
                    if ((*arg3)(&var_30, r0_46 + 8) == 0)
                        r0_50 = arg1 + r5_2 + 0x18
                        break
                
                r9 += 1
                *r0_50 = var_30
                *(r0_50 + 4) = r1_23
                
                if (r9 == 8)
                    int32_t temp0_34 = 0
                    void* i = r0_43 + 8 - arg2
                    
                    while (i != 0)
                        i u>>= 1
                        temp0_34 += 1
                    
                    result = ((0x20 - temp0_34) u>> 5).b
                    break
            
            r0_43 += 8
            r8_2 += 8
            
            if (r0_43 == arg2)
                goto label_fcc08
else
    switch (r0_2)
        case 2
            r2 = *arg3
            r4_1 = arg2 - 8
        label_fc9e8:
            
            if (r2(r4_1, arg1) != 0)
                int32_t r0_23 = *arg1
                int32_t r1_11 = *(arg1 + 4)
                int32_t r3_6 = *(r4_1 + 4)
                *arg1 = *r4_1
                *(arg1 + 4) = r3_6
                *r4_1 = r0_23
                *(r4_1 + 4) = r1_11
        case 3
            r4_1 = arg1 + 8
            int32_t r0_6 = (*arg3)(r4_1, arg1)
            r8_1 = arg2 - 8
            r0_9 = (*arg3)(r8_1, r4_1)
            
            if (r0_6 == 0)
                goto label_fc9b4
            
            int32_t r2_3 = *arg1
            int32_t r1_2 = *(arg1 + 4)
            
            if (r0_9 == 0)
                int32_t r3_11 = *(r4_1 + 4)
                *arg1 = *r4_1
                *(arg1 + 4) = r3_11
                *(r4_1 + 4) = r1_2
                *r4_1 = r2_3
                
                if ((*arg3)(r8_1, r4_1) != 0)
                    int32_t r0_38 = *r4_1
                    int32_t r1_20 = *(r4_1 + 4)
                    int32_t r3_12 = *(r8_1 + 4)
                    *r4_1 = *r8_1
                    *(r4_1 + 4) = r3_12
                    *r8_1 = r0_38
                    *(r8_1 + 4) = r1_20
            else
                int32_t r3_1 = *(r8_1 + 4)
                *arg1 = *r8_1
                *(arg1 + 4) = r3_1
                *r8_1 = r2_3
                *(r8_1 + 4) = r1_2
        case 4
            std::__ndk1::__sort4<bool (*&)(ascension::EndGamePlayerScore const&, ascension::EndGamePlayerScore const&), ascension::EndGamePlayerScore*>(
                arg1, arg1 + 8, arg1 + 0x10, arg2 - 8, arg3)
        case 5
            r8_1 = arg1 + 0x10
            std::__ndk1::__sort4<bool (*&)(ascension::EndGamePlayerScore const&, ascension::EndGamePlayerScore const&), ascension::EndGamePlayerScore*>(
                arg1, arg1 + 8, r8_1, arg1 + 0x18, arg3)
            
            if ((*arg3)(arg2 - 8, arg1 + 0x18) != 0)
                int32_t r0_15 = *(arg1 + 0x18)
                int32_t r1_5 = *(arg1 + 0x1c)
                int32_t r3_3 = *(arg2 - 4)
                *(arg1 + 0x18) = *(arg2 - 8)
                *(arg1 + 0x1c) = r3_3
                *(arg2 - 8) = r0_15
                *(arg2 - 4) = r1_5
                
                if ((*arg3)(arg1 + 0x18, r8_1) != 0)
                    int32_t r0_18 = *r8_1
                    int32_t r1_7 = *(r8_1 + 4)
                    int32_t r3_4 = *(arg1 + 0x1c)
                    *r8_1 = *(arg1 + 0x18)
                    *(r8_1 + 4) = r3_4
                    *(arg1 + 0x18) = r0_18
                    *(arg1 + 0x1c) = r1_7
                    r4_1 = arg1 + 8
                    r0_9 = (*arg3)(r8_1, r4_1)
                label_fc9b4:
                    
                    if (r0_9 != 0)
                        int32_t r0_20 = *r4_1
                        int32_t r1_9 = *(r4_1 + 4)
                        int32_t r3_5 = *(r8_1 + 4)
                        *r4_1 = *r8_1
                        *(r4_1 + 4) = r3_5
                        *r8_1 = r0_20
                        *(r8_1 + 4) = r1_9
                        r2 = *arg3
                        goto label_fc9e8

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
