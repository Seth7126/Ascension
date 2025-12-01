// 函数: _ZNSt6__ndk16__sortIRPFbRKN9ascension18EndGamePlayerScoreES4_EPS2_EEvT0_S9_T_
// 地址: 0xfbd94
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::EndGamePlayerScore* r10 = arg2
ascension::EndGamePlayerScore* r6 = arg1

while (true)
    void* __offset(ascension::EndGamePlayerScore, -0x8) r8_1 = r10 - 8
    void* __offset(ascension::EndGamePlayerScore, -0x10) r0_1 = r10 - 0x10
    ascension::EndGamePlayerScore* var_30_1 = r10
    
    while (true)
        int32_t r1_2 = r10 - r6
        ascension::EndGamePlayerScore* r4_1 = r6
        int32_t r0_3 = r1_2 s>> 3
        int32_t r0_62
        
        if (r0_3 u<= 5)
            r0_62 = jump_table_fc2b8[r0_3]
            int32_t r0_73
            int32_t r1_43
            void* __offset(ascension::EndGamePlayerScore, 0x8) r8_2
            
            switch (r0_62)
                case 0x18
                    r0_62 = (*arg3)(r10 - 8, r4_1)
                    
                    if (r0_62 != 0)
                        int32_t r0_68 = *r4_1
                        int32_t r1_39 = *(r4_1 + 4)
                        int32_t r3_16 = *(r10 - 4)
                        *r4_1 = *(r10 - 8)
                        *(r4_1 + 4) = r3_16
                        *(r10 - 8) = r0_68
                        *(r10 - 4) = r1_39
                        return r0_68
                case 0x64
                    int32_t r0_71 = (*arg3)(r4_1 + 8, r4_1)
                    r8_2 = r10 - 8
                    r0_62 = (*arg3)(r8_2, r4_1 + 8)
                    
                    if (r0_71 != 0)
                        int32_t r2_42 = *r4_1
                        r1_43 = *(r4_1 + 4)
                        
                        if (r0_62 != 0)
                            r0_73 = *r8_2
                            int32_t r3_17 = *(r8_2 + 4)
                            *r4_1 = r0_73
                            *(r4_1 + 4) = r3_17
                            *r8_2 = r2_42
                            *(r8_2 + 4) = r1_43
                            return r0_73
                        
                        int32_t r3_26 = *(r4_1 + 0xc)
                        *r4_1 = *(r4_1 + 8)
                        *(r4_1 + 4) = r3_26
                        *(r4_1 + 0xc) = r1_43
                        *(r4_1 + 8) = r2_42
                        r0_62 = (*arg3)(r8_2, r4_1 + 8)
                        
                        if (r0_62 != 0)
                            r0_73 = *(r4_1 + 8)
                            r1_43 = *(r4_1 + 0xc)
                            int32_t r3_27 = *(r8_2 + 4)
                            *(r4_1 + 8) = *r8_2
                            *(r4_1 + 0xc) = r3_27
                        label_fc4d0:
                            *r8_2 = r0_73
                            *(r8_2 + 4) = r1_43
                            return r0_73
                    else if (r0_62 != 0)
                        int32_t r0_84 = *(r4_1 + 8)
                        int32_t r1_53 = *(r4_1 + 0xc)
                        int32_t r3_24 = *(r8_2 + 4)
                        *(r4_1 + 8) = *r8_2
                        *(r4_1 + 0xc) = r3_24
                        *r8_2 = r0_84
                        *(r8_2 + 4) = r1_53
                        r0_62 = (*arg3)(r4_1 + 8, r4_1)
                        
                        if (r0_62 != 0)
                            r0_62 = *r4_1
                            int32_t r1_55 = *(r4_1 + 4)
                            int32_t r3_25 = *(r4_1 + 0xc)
                            *r4_1 = *(r4_1 + 8)
                            *(r4_1 + 4) = r3_25
                            *(r4_1 + 8) = r0_62
                            *(r4_1 + 0xc) = r1_55
                case 0xb8
                    return std::__ndk1::__sort4<bool (*&)(ascension::EndGamePlayerScore const&, ascension::EndGamePlayerScore const&), ascension::EndGamePlayerScore*>(
                        r4_1, r4_1 + 8, r4_1 + 0x10, r10 - 8, arg3)
                case 0xd8
                    r8_2 = r4_1 + 8
                    std::__ndk1::__sort4<bool (*&)(ascension::EndGamePlayerScore const&, ascension::EndGamePlayerScore const&), ascension::EndGamePlayerScore*>(
                        r4_1, r8_2, r4_1 + 0x10, r4_1 + 0x18, arg3)
                    r0_62 = (*arg3)(r10 - 8, r4_1 + 0x18)
                    
                    if (r0_62 != 0)
                        int32_t r0_78 = *(r4_1 + 0x18)
                        int32_t r1_47 = *(r4_1 + 0x1c)
                        int32_t r3_20 = *(r10 - 4)
                        *(r4_1 + 0x18) = *(r10 - 8)
                        *(r4_1 + 0x1c) = r3_20
                        *(r10 - 8) = r0_78
                        *(r10 - 4) = r1_47
                        r0_62 = (*arg3)(r4_1 + 0x18, r4_1 + 0x10)
                        
                        if (r0_62 != 0)
                            int32_t r0_80 = *(r4_1 + 0x10)
                            int32_t r1_49 = *(r4_1 + 0x14)
                            int32_t r3_21 = *(r4_1 + 0x1c)
                            *(r4_1 + 0x10) = *(r4_1 + 0x18)
                            *(r4_1 + 0x14) = r3_21
                            *(r4_1 + 0x18) = r0_80
                            *(r4_1 + 0x1c) = r1_49
                            r0_62 = (*arg3)(r4_1 + 0x10, r8_2)
                            
                            if (r0_62 != 0)
                                int32_t r0_82 = *r8_2
                                int32_t r1_51 = *(r8_2 + 4)
                                int32_t r3_22 = *(r4_1 + 0x14)
                                *r8_2 = *(r4_1 + 0x10)
                                *(r8_2 + 4) = r3_22
                                *(r4_1 + 0x10) = r0_82
                                *(r4_1 + 0x14) = r1_51
                                r0_62 = (*arg3)(r8_2, r4_1)
                                
                                if (r0_62 != 0)
                                    r0_73 = *r4_1
                                    r1_43 = *(r4_1 + 4)
                                    int32_t r3_23 = *(r8_2 + 4)
                                    *r4_1 = *r8_2
                                    *(r4_1 + 4) = r3_23
                                    goto label_fc4d0
        else
            if (r1_2 s<= 0xf7)
                return std::__ndk1::__insertion_sort_3<bool (*&)(ascension::EndGamePlayerScore const&, ascension::EndGamePlayerScore const&), ascension::EndGamePlayerScore*>(
                    r4_1, r10, arg3) __tailcall
            
            void* r6_1 = r4_1 + (0xfffffff8 & (r0_3 + (r0_3 u>> 0x1f)) << 2)
            uint32_t var_28_1
            
            if (r1_2 s< 0x1f39)
                int32_t r0_23 = (*arg3)(r6_1, r4_1)
                int32_t r0_25 = (*arg3)(r8_1, r6_1)
                
                if (r0_23 == 0)
                    var_28_1 = 0
                    
                    if (r0_25 != 0)
                        int32_t r0_27 = *r6_1
                        int32_t r1_16 = *(r6_1 + 4)
                        int32_t r3_7 = *(r8_1 + 4)
                        *r6_1 = *r8_1
                        *(r6_1 + 4) = r3_7
                        *r8_1 = r0_27
                        *(r8_1 + 4) = r1_16
                        var_28_1 = 1
                        
                        if ((*arg3)(r6_1, r4_1) != 0)
                            int32_t r0_30 = *r4_1
                            int32_t r1_18 = *(r4_1 + 4)
                            int32_t r3_8 = *(r6_1 + 4)
                            *r4_1 = *r6_1
                            *(r4_1 + 4) = r3_8
                            *r6_1 = r0_30
                            *(r6_1 + 4) = r1_18
                            var_28_1 = 2
                else
                    int32_t r2_15 = *r4_1
                    int32_t r1_15 = *(r4_1 + 4)
                    
                    if (r0_25 == 0)
                        int32_t r3_9 = *(r6_1 + 4)
                        *r4_1 = *r6_1
                        *(r4_1 + 4) = r3_9
                        *(r6_1 + 4) = r1_15
                        *r6_1 = r2_15
                        var_28_1 = 1
                        
                        if ((*arg3)(r8_1, r6_1) != 0)
                            int32_t r0_35 = *r6_1
                            int32_t r1_20 = *(r6_1 + 4)
                            int32_t r3_10 = *(r8_1 + 4)
                            *r6_1 = *r8_1
                            *(r6_1 + 4) = r3_10
                            *r8_1 = r0_35
                            *(r8_1 + 4) = r1_20
                            var_28_1 = 2
                    else
                        int32_t r3_6 = *(r8_1 + 4)
                        *r4_1 = *r8_1
                        *(r4_1 + 4) = r3_6
                        *r8_1 = r2_15
                        *(r8_1 + 4) = r1_15
                        var_28_1 = 1
            else
                int32_t r0_5 = 0xfffffff8 & (r0_3 + (r0_3 s>> 0x1f u>> 0x1e)) << 1
                void* r9_1 = r4_1 + r0_5
                void* r7_1 = r6_1 + r0_5
                var_28_1 = std::__ndk1::__sort4<bool (*&)(ascension::EndGamePlayerScore const&, ascension::EndGamePlayerScore const&), ascension::EndGamePlayerScore*>(
                    r4_1, r9_1, r6_1, r7_1, arg3)
                
                if ((*arg3)(r8_1, r7_1) != 0)
                    int32_t r0_10 = *r7_1
                    int32_t r1_6 = *(r7_1 + 4)
                    int32_t r3_2 = *(r8_1 + 4)
                    *r7_1 = *r8_1
                    *(r7_1 + 4) = r3_2
                    *r8_1 = r0_10
                    *(r8_1 + 4) = r1_6
                    uint32_t r0_21
                    
                    if ((*arg3)(r7_1, r6_1) == 0)
                        r0_21 = var_28_1 + 1
                    else
                        int32_t r0_13 = *r6_1
                        int32_t r1_8 = *(r6_1 + 4)
                        int32_t r3_3 = *(r7_1 + 4)
                        *r6_1 = *r7_1
                        *(r6_1 + 4) = r3_3
                        *r7_1 = r0_13
                        *(r7_1 + 4) = r1_8
                        
                        if ((*arg3)(r6_1, r9_1) == 0)
                            r0_21 = var_28_1 + 2
                        else
                            int32_t r0_16 = *r9_1
                            int32_t r1_10 = *(r9_1 + 4)
                            int32_t r3_4 = *(r6_1 + 4)
                            *r9_1 = *r6_1
                            *(r9_1 + 4) = r3_4
                            *r6_1 = r0_16
                            *(r6_1 + 4) = r1_10
                            
                            if ((*arg3)(r9_1, r4_1) == 0)
                                r0_21 = var_28_1 + 3
                            else
                                int32_t r0_19 = *r4_1
                                int32_t r1_12 = *(r4_1 + 4)
                                int32_t r3_5 = *(r9_1 + 4)
                                *r4_1 = *r9_1
                                *(r4_1 + 4) = r3_5
                                *r9_1 = r0_19
                                *(r9_1 + 4) = r1_12
                                r0_21 = var_28_1 + 4
                    
                    var_28_1 = r0_21
            
            void* __offset(ascension::EndGamePlayerScore, -0x8) r7_3
            
            if ((*arg3)(r4_1, r6_1) == 0)
                void* __offset(ascension::EndGamePlayerScore, -0x10) r7_4 = r0_1
                
                while (true)
                    if (r4_1 == r7_4)
                        r0_62 = (*arg3)(r4_1, r8_1)
                        void* __offset(ascension::EndGamePlayerScore, 0x8) r7_6 = r4_1 + 8
                        
                        if (r0_62 == 0)
                            if (r7_6 == r8_1)
                                goto label_fc4e4
                            
                            r7_6 = r4_1 + 0x10
                            
                            while (true)
                                r0_62 = (*arg3)(r4_1, r7_6 - 8)
                                
                                if (r0_62 != 0)
                                    break
                                
                                r7_6 += 8
                                
                                if (r10 == r7_6)
                                    return r0_62
                            
                            r0_62 = *(r7_6 - 8)
                            int32_t r1_34 = *(r7_6 - 4)
                            int32_t r3_14 = *(r8_1 + 4)
                            *(r7_6 - 8) = *r8_1
                            *(r7_6 - 4) = r3_14
                            *r8_1 = r0_62
                            *(r8_1 + 4) = r1_34
                        
                        if (r7_6 == r8_1)
                            goto label_fc4e4
                        
                        while (true)
                            r6 = r7_6 - 8
                            int32_t i
                            
                            do
                                r6 += 8
                                i = (*arg3)(r4_1, r6)
                            while (i == 0)
                            r7_6 = r6 + 8
                            int32_t i_1
                            
                            do
                                r8_1 -= 8
                                i_1 = (*arg3)(r4_1, r8_1)
                            while (i_1 != 0)
                            
                            if (r6 u>= r8_1)
                                break
                            
                            int32_t r0_64 = *r6
                            int32_t r1_35 = *(r6 + 4)
                            int32_t r3_15 = *(r8_1 + 4)
                            *r6 = *r8_1
                            *(r6 + 4) = r3_15
                            *r8_1 = r0_64
                            *(r8_1 + 4) = r1_35
                        
                        r0_62 = 4
                        goto label_fc280
                    
                    int32_t r0_41 = (*arg3)(r7_4, r6_1)
                    r7_4 -= 8
                    
                    if (r0_41 != 0)
                        r7_3 = r7_4 + 8
                        int32_t r1_23 = *r4_1
                        int32_t r2_23 = *(r4_1 + 4)
                        int32_t r3_11 = *(r7_3 + 4)
                        *r4_1 = *r7_3
                        *(r4_1 + 4) = r3_11
                        *r7_3 = r1_23
                        *(r7_3 + 4) = r2_23
                        var_28_1 += 1
                        break
            else
                r7_3 = r8_1
            
            void* __offset(ascension::EndGamePlayerScore, 0x8) r9_2 = r4_1 + 8
            
            if (r9_2 u< r7_3)
                void* r10_1
                
                while (true)
                    r10_1 = r9_2 - 8
                    int32_t i_2
                    
                    do
                        r10_1 += 8
                        i_2 = (*arg3)(r10_1, r6_1)
                    while (i_2 != 0)
                    r9_2 = r10_1 + 8
                    int32_t i_3
                    
                    do
                        r7_3 -= 8
                        i_3 = (*arg3)(r7_3, r6_1)
                    while (i_3 == 0)
                    
                    if (r10_1 u> r7_3)
                        break
                    
                    int32_t r0_45 = *r10_1
                    int32_t r1_24 = *(r10_1 + 4)
                    
                    if (r6_1 == r10_1)
                        r6_1 = r7_3
                    
                    int32_t r3_12 = *(r7_3 + 4)
                    *r10_1 = *r7_3
                    *(r10_1 + 4) = r3_12
                    *r7_3 = r0_45
                    *(r7_3 + 4) = r1_24
                    var_28_1 += 1
                
                r9_2 = r10_1
                r10 = var_30_1
                
                if (r9_2 != r6_1)
                    goto label_fc120
            else if (r9_2 != r6_1)
            label_fc120:
                
                if ((*arg3)(r6_1, r9_2) == 0)
                    goto label_fc154
                
                int32_t r0_52 = *r9_2
                int32_t r1_28 = *(r9_2 + 4)
                int32_t r3_13 = *(r6_1 + 4)
                *r9_2 = *r6_1
                *(r9_2 + 4) = r3_13
                *r6_1 = r0_52
                *(r6_1 + 4) = r1_28
                
                if (var_28_1 != 0xffffffff)
                    goto label_fc19c
                
                goto label_fc168
            
        label_fc154:
            
            if (var_28_1 != 0)
            label_fc19c:
                
                if (r9_2 - r4_1 s< r10 - r9_2)
                    std::__ndk1::__sort<bool (*&)(ascension::EndGamePlayerScore const&, ascension::EndGamePlayerScore const&), ascension::EndGamePlayerScore*>(
                        r4_1, r9_2, arg3)
                    r6 = r9_2 + 8
                    continue
                
                std::__ndk1::__sort<bool (*&)(ascension::EndGamePlayerScore const&, ascension::EndGamePlayerScore const&), ascension::EndGamePlayerScore*>(
                    r9_2 + 8, r10, arg3)
                r10 = r9_2
                r6 = r4_1
                break
            else
            label_fc168:
                int32_t r0_57 = std::__ndk1::__insertion_sort_incomplete<bool (*&)(ascension::EndGamePlayerScore const&, ascension::EndGamePlayerScore const&), ascension::EndGamePlayerScore*>(
                    r4_1, r9_2, arg3)
                r6 = r9_2 + 8
                
                if (std::__ndk1::__insertion_sort_incomplete<bool (*&)(ascension::EndGamePlayerScore const&, ascension::EndGamePlayerScore const&), ascension::EndGamePlayerScore*>(
                        r6, r10, arg3) != 0)
                    r0_62 = 2
                    
                    if (r0_57 == 0)
                        r10 = r9_2
                    else
                        r0_62 = 1
                    
                    r6 = r4_1
                    
                    if (r0_62 u<= 4)
                    label_fc280:
                        
                        if ((0x15 & 1 << (r0_62 & 0xff)) != 0)
                            break
                else
                    if (r0_57 == 0)
                        goto label_fc19c
                    
                    continue
        
    label_fc4e4:
        return r0_62
