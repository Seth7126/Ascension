// 函数: _ZNSt6__ndk118__insertion_sort_3IRPFbRKN9ascension18EndGamePlayerScoreES4_EPS2_EEvT0_S9_T_
// 地址: 0xfc680
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r0_2 = (*arg3)(arg1 + 8, arg1)
int32_t r0_4 = (*arg3)(arg1 + 0x10, arg1 + 8)
ascension::EndGamePlayerScore* r5_1

if (r0_2 == 0)
    r5_1 = arg2
    
    if (r0_4 != 0)
        int32_t r0_6 = *(arg1 + 8)
        int32_t r1_3 = *(arg1 + 0xc)
        int32_t r3_2 = *(arg1 + 0x14)
        *(arg1 + 8) = *(arg1 + 0x10)
        *(arg1 + 0xc) = r3_2
        *(arg1 + 0x10) = r0_6
        *(arg1 + 0x14) = r1_3
        
        if ((*arg3)(arg1 + 8, arg1) != 0)
            int32_t r0_9 = *arg1
            int32_t r1_5 = *(arg1 + 4)
            int32_t r3_3 = *(arg1 + 0xc)
            *arg1 = *(arg1 + 8)
            *(arg1 + 4) = r3_3
            *(arg1 + 8) = r0_9
            *(arg1 + 0xc) = r1_5
else
    int32_t r2_2 = *arg1
    int32_t r1_2 = *(arg1 + 4)
    
    if (r0_4 == 0)
        int32_t r3_4 = *(arg1 + 0xc)
        *arg1 = *(arg1 + 8)
        *(arg1 + 4) = r3_4
        *(arg1 + 0xc) = r1_2
        *(arg1 + 8) = r2_2
        r5_1 = arg2
        
        if ((*arg3)(arg1 + 0x10, arg1 + 8) != 0)
            int32_t r0_13 = *(arg1 + 8)
            int32_t r1_7 = *(arg1 + 0xc)
            int32_t r3_5 = *(arg1 + 0x14)
            *(arg1 + 8) = *(arg1 + 0x10)
            *(arg1 + 0xc) = r3_5
            *(arg1 + 0x10) = r0_13
            *(arg1 + 0x14) = r1_7
    else
        int32_t r3_1 = *(arg1 + 0x14)
        *arg1 = *(arg1 + 0x10)
        *(arg1 + 4) = r3_1
        *(arg1 + 0x10) = r2_2
        *(arg1 + 0x14) = r1_2
        r5_1 = arg2

void* __offset(ascension::EndGamePlayerScore, 0x18) r0_14 = arg1 + 0x18

if (r0_14 != r5_1)
    int32_t r9_1 = 0
    
    do
        if ((*arg3)() != 0)
            int32_t r1_8 = *(r0_14 + 4)
            int32_t r5_2 = r9_1
            int32_t var_30 = *r0_14
            void* r0_21
            
            while (true)
                void* r0_17 = arg1 + r5_2
                int32_t r2_9 = *(r0_17 + 0x14)
                *(r0_17 + 0x18) = *(r0_17 + 0x10)
                *(r0_17 + 0x1c) = r2_9
                
                if (r5_2 == 0xfffffff0)
                    r0_21 = arg1
                    break
                
                r5_2 -= 8
                
                if ((*arg3)(&var_30, r0_17 + 8) == 0)
                    r0_21 = arg1 + r5_2 + 0x18
                    break
            
            *r0_21 = var_30
            *(r0_21 + 4) = r1_8
            r5_1 = arg2
        
        r0_14 += 8
        r9_1 += 8
    while (r0_14 != r5_1)

int32_t r0_22 = *__stack_chk_guard

if (r0_22 == r0)
    return r0_22 - r0

__stack_chk_fail()
noreturn
