// 函数: _ZNSt6__ndk16__sortIRPFbP13AvailableGameS2_EPS2_EEvT0_S7_T_
// 地址: 0x18683c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
AvailableGame** r10 = arg2
AvailableGame** r7 = arg1

while (true)
    AvailableGame** r8_1 = r10 - 4
    void* r0_1 = r10 - 8
    AvailableGame** var_2c_1 = r10
    
    while (true)
        int32_t r1_2 = r10 - r7
        AvailableGame** r5_1 = r7
        int32_t r0_3 = r1_2 s>> 2
        AvailableGame* r0_40
        
        if (r0_3 u<= 5)
            r0_40 = jump_table_186c60[r0_3]
            AvailableGame* r0_47
            
            switch (r0_40)
                case 0x38
                    r0_40 = (*arg3)(*(r10 - 4), *r5_1)
                    
                    if (r0_40 != 0)
                        r0_47 = *r5_1
                        *r5_1 = *(r10 - 4)
                        *(r10 - 4) = r0_47
                        return r0_47
                case 0x60
                    int32_t r0_49 = (*arg3)(r5_1[1], *r5_1)
                    r0_40 = (*arg3)(*(r10 - 4), r5_1[1])
                    
                    if (r0_49 != 0)
                        AvailableGame* r1_34 = *r5_1
                        
                        if (r0_40 != 0)
                            AvailableGame* r0_51 = *(r10 - 4)
                            *r5_1 = r0_51
                            *(r10 - 4) = r1_34
                            return r0_51
                        
                        *r5_1 = r5_1[1]
                        r5_1[1] = r1_34
                        r0_40 = (*arg3)(*(r10 - 4))
                        
                        if (r0_40 != 0)
                            r0_47 = r5_1[1]
                            r5_1[1] = *(r10 - 4)
                            *(r10 - 4) = r0_47
                            return r0_47
                    else if (r0_40 != 0)
                        int32_t r0_57 = r5_1[1]
                        r5_1[1] = *(r10 - 4)
                        *(r10 - 4) = r0_57
                        int32_t r0_59 = (*arg3)(r5_1[1], *r5_1)
                        
                        if (r0_59 != 0)
                            int32_t* temp0_1 = r5_1
                            r0_59 = *temp0_1
                            *r5_1 = temp0_1[1]
                            r5_1[1] = r0_59
                        
                        return r0_59
                case 0xac
                    return std::__ndk1::__sort4<bool (*&)(AvailableGame*, AvailableGame*), AvailableGame**>(
                        r5_1, &r5_1[1], &r5_1[2], r10 - 4, arg3)
                case 0xcc
                    return std::__ndk1::__sort5<bool (*&)(AvailableGame*, AvailableGame*), AvailableGame**>(
                        r5_1, &r5_1[1], &r5_1[2], &r5_1[3], r10 - 4, arg3)
        else
            if (r1_2 s<= 0x7b)
                return std::__ndk1::__insertion_sort_3<bool (*&)(AvailableGame*, AvailableGame*), AvailableGame**>(
                    r5_1, r10, arg3) __tailcall
            
            void* r7_1 = r5_1 + (0xfffffffc & (r0_3 + (r0_3 u>> 0x1f)) << 1)
            uint32_t r9_1
            
            if (r1_2 s< 0xf9d)
                int32_t r0_11 = (*arg3)(*r7_1, *r5_1)
                int32_t r0_13 = (*arg3)(*r8_1, *r7_1)
                
                if (r0_11 == 0)
                    r9_1 = 0
                    
                    if (r0_13 != 0)
                        AvailableGame* r0_31 = *r7_1
                        *r7_1 = *r8_1
                        *r8_1 = r0_31
                        r9_1 = 1
                        
                        if ((*arg3)(*r7_1, *r5_1) != 0)
                            AvailableGame* r0_34 = *r5_1
                            *r5_1 = *r7_1
                            *r7_1 = r0_34
                            r9_1 = 2
                else
                    AvailableGame* r1_8 = *r5_1
                    
                    if (r0_13 == 0)
                        *r5_1 = *r7_1
                        *r7_1 = r1_8
                        r9_1 = 1
                        
                        if ((*arg3)(*r8_1) != 0)
                            AvailableGame* r0_38 = *r7_1
                            *r7_1 = *r8_1
                            *r8_1 = r0_38
                            r9_1 = 2
                    else
                        r9_1 = 1
                        *r5_1 = *r8_1
                        *r8_1 = r1_8
            else
                int32_t r0_5 = (r0_3 + (r0_3 s>> 0x1f u>> 0x1e)) & 0xfffffffc
                r9_1 = std::__ndk1::__sort5<bool (*&)(AvailableGame*, AvailableGame*), AvailableGame**>(
                    r5_1, r5_1 + r0_5, r7_1, r7_1 + r0_5, r8_1, arg3)
            
            void* r10_1
            
            if ((*arg3)(*r5_1, *r7_1) == 0)
                void* r10_2 = r0_1
                
                while (true)
                    if (r5_1 == r10_2)
                        int32_t* r4_3 = r5_1
                        void* r4_4 = &r4_3[1]
                        r0_40 = (*arg3)(*r4_3, *r8_1)
                        
                        if (r0_40 == 0)
                            r10 = var_2c_1
                            
                            if (r4_4 == r8_1)
                                goto label_186c7c
                            
                            r4_4 = &r5_1[2]
                            
                            while (true)
                                r0_40 = (*arg3)(*r5_1, *(r4_4 - 4))
                                
                                if (r0_40 != 0)
                                    break
                                
                                r4_4 += 4
                                
                                if (r10 == r4_4)
                                    return r0_40
                            
                            r0_40 = *(r4_4 - 4)
                            *(r4_4 - 4) = *r8_1
                            *r8_1 = r0_40
                            
                            if (r4_4 == r8_1)
                                goto label_186c7c
                        else
                            r10 = var_2c_1
                            
                            if (r4_4 == r8_1)
                                goto label_186c7c
                        
                        while (true)
                            r7 = r4_4 - 4
                            int32_t i
                            
                            do
                                r7 = &r7[1]
                                i = (*arg3)(*r5_1, *r7)
                            while (i == 0)
                            r4_4 = &r7[1]
                            int32_t i_1
                            
                            do
                                r8_1 -= 4
                                i_1 = (*arg3)(*r5_1, *r8_1)
                            while (i_1 != 0)
                            
                            if (r7 u>= r8_1)
                                break
                            
                            AvailableGame* r0_42 = *r7
                            *r7 = *r8_1
                            *r8_1 = r0_42
                        
                        r0_40 = 4
                        goto label_186c28
                    
                    int32_t r0_15 = *r10_2
                    r10_2 -= 4
                    
                    if ((*arg3)(r0_15, *r7_1) != 0)
                        r10_1 = r10_2 + 4
                        r9_1 += 1
                        AvailableGame* r0_17 = *r5_1
                        *r5_1 = *r10_1
                        *r10_1 = r0_17
                        break
            else
                r10_1 = r8_1
            
            void* r4_2 = &r5_1[1]
            
            if (r4_2 u>= r10_1)
                r10 = var_2c_1
                
                if (r4_2 != r7_1)
                label_186a48:
                    
                    if ((*arg3)(*r7_1, *r4_2) != 0)
                        r9_1 += 1
                        int32_t r0_25 = *r4_2
                        *r4_2 = *r7_1
                        *r7_1 = r0_25
            else
                uint32_t r0_18 = r9_1
                void* r9_2 = r4_2
                
                while (true)
                    r4_2 = r9_2 - 4
                    int32_t i_2
                    
                    do
                        r4_2 += 4
                        i_2 = (*arg3)(*r4_2, *r7_1)
                    while (i_2 != 0)
                    r9_2 = r4_2 + 4
                    int32_t i_3
                    
                    do
                        r10_1 -= 4
                        i_3 = (*arg3)(*r10_1, *r7_1)
                    while (i_3 == 0)
                    
                    if (r4_2 u> r10_1)
                        break
                    
                    int32_t r0_19 = *r4_2
                    
                    if (r7_1 == r4_2)
                        r7_1 = r10_1
                    
                    *r4_2 = *r10_1
                    *r10_1 = r0_19
                    r0_18 += 1
                
                r10 = var_2c_1
                r9_1 = r0_18
                
                if (r4_2 != r7_1)
                    goto label_186a48
            
            if (r9_1 != 0)
            label_186ab0:
                
                if (r4_2 - r5_1 s< r10 - r4_2)
                    std::__ndk1::__sort<bool (*&)(AvailableGame*, AvailableGame*), AvailableGame**>(
                        r5_1, r4_2, arg3)
                    r7 = r4_2 + 4
                    continue
                
                std::__ndk1::__sort<bool (*&)(AvailableGame*, AvailableGame*), AvailableGame**>(
                    r4_2 + 4, r10, arg3)
                r10 = r4_2
                r7 = r5_1
                break
            else
                int32_t r0_27 = std::__ndk1::__insertion_sort_incomplete<bool (*&)(AvailableGame*, AvailableGame*), AvailableGame**>(
                    r5_1, r4_2, arg3)
                r7 = r4_2 + 4
                
                if (std::__ndk1::__insertion_sort_incomplete<bool (*&)(AvailableGame*, AvailableGame*), AvailableGame**>(
                        r7, r10, arg3) != 0)
                    r0_40 = 2
                    
                    if (r0_27 == 0)
                        r10 = r4_2
                    else
                        r0_40 = 1
                    
                    r7 = r5_1
                    
                    if (r0_40 u<= 4)
                    label_186c28:
                        
                        if ((0x15 & 1 << (r0_40 & 0xff)) != 0)
                            break
                else
                    if (r0_27 == 0)
                        goto label_186ab0
                    
                    continue
        
    label_186c7c:
        return r0_40
