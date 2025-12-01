// 函数: _ZNSt6__ndk127__insertion_sort_incompleteIRPFbP13AvailableGameS2_EPS2_EEbT0_S7_T_
// 地址: 0x187198
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_1 = (arg2 - arg1) s>> 2

if (r0_1 u> 5)
    int32_t r0_14 = (*arg3)(arg1[1], *arg1)
    void* r4_3 = &arg1[2]
    int32_t r0_16 = (*arg3)(*r4_3, arg1[1])
    
    if (r0_14 != 0)
        AvailableGame* r1_8 = *arg1
        
        if (r0_16 == 0)
            int32_t r0_30 = arg1[2]
            *arg1 = arg1[1]
            arg1[1] = r1_8
            
            if ((*arg3)(r0_30) != 0)
                int32_t r0_32 = arg1[1]
                arg1[1] = arg1[2]
                arg1[2] = r0_32
        else
            *arg1 = arg1[2]
            arg1[2] = r1_8
    else if (r0_16 != 0)
        AvailableGame* r1_13 = *arg1
        int32_t r2_8 = arg1[1]
        int32_t r0_23 = arg1[2]
        arg1[1] = r0_23
        arg1[2] = r2_8
        
        if ((*arg3)(r0_23, r1_13) != 0)
            int32_t* temp0_4 = arg1
            int32_t r0_25 = *temp0_4
            *arg1 = temp0_4[1]
            arg1[1] = r0_25
    
    void* r0_33 = &arg1[3]
    
    if (r0_33 != arg2)
        int32_t r10_1 = 0
        int32_t r9_2 = 0
        
        do
            void* r8_1 = r0_33
            
            if ((*arg3)(*r0_33, *r4_3) != 0)
                int32_t r4_4 = *r8_1
                int32_t r6_1 = r10_1
                void* r0_40
                
                while (true)
                    void* r0_36 = arg1 + r6_1
                    *(r0_36 + 0xc) = *(r0_36 + 8)
                    
                    if (r6_1 == 0xfffffff8)
                        r0_40 = arg1
                        break
                    
                    r6_1 -= 4
                    
                    if ((*arg3)(r4_4, *(r0_36 + 4)) == 0)
                        r0_40 = arg1 + r6_1 + 0xc
                        break
                
                r9_2 += 1
                *r0_40 = r4_4
                
                if (r9_2 == 8)
                    int32_t temp0_7 = 0
                    void* i = r8_1 + 4 - arg2
                    
                    while (i != 0)
                        i u>>= 1
                        temp0_7 += 1
                    
                    return ((0x20 - temp0_7) u>> 5).b
            
            r0_33 = r8_1 + 4
            r10_1 += 4
            r4_3 = r8_1
        while (r0_33 != arg2)
else
    switch (r0_1)
        case 2
            if ((*arg3)(*(arg2 - 4), *arg1) != 0)
                AvailableGame* r0_5 = *arg1
                *arg1 = *(arg2 - 4)
                *(arg2 - 4) = r0_5
        case 3
            int32_t r0_7 = (*arg3)(arg1[1], *arg1)
            int32_t r0_9 = (*arg3)(*(arg2 - 4), arg1[1])
            
            if (r0_7 != 0)
                AvailableGame* r1_4 = *arg1
                
                if (r0_9 == 0)
                    *arg1 = arg1[1]
                    arg1[1] = r1_4
                    
                    if ((*arg3)(*(arg2 - 4)) != 0)
                        int32_t r0_29 = arg1[1]
                        arg1[1] = *(arg2 - 4)
                        *(arg2 - 4) = r0_29
                else
                    *arg1 = *(arg2 - 4)
                    *(arg2 - 4) = r1_4
            else if (r0_9 != 0)
                int32_t r0_19 = arg1[1]
                arg1[1] = *(arg2 - 4)
                *(arg2 - 4) = r0_19
                
                if ((*arg3)(arg1[1], *arg1) != 0)
                    AvailableGame* r0_22 = *arg1
                    *arg1 = arg1[1]
                    arg1[1] = r0_22
        case 4
            std::__ndk1::__sort4<bool (*&)(AvailableGame*, AvailableGame*), AvailableGame**>(arg1, 
                &arg1[1], &arg1[2], arg2 - 4, arg3)
        case 5
            std::__ndk1::__sort5<bool (*&)(AvailableGame*, AvailableGame*), AvailableGame**>(arg1, 
                &arg1[1], &arg1[2], &arg1[3], arg2 - 4, arg3)

return 1
