// 函数: GetInstanceList
// 地址: 0x1900a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t i = 0
uint32_t r2 = *s_pWorldData
int32_t r3 = *__stack_chk_guard

if (r2 != 0)
    int32_t r6_1 = *(r2 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
    int32_t* var_40
    void* var_34
    
    if (r6_1 != 0 && arg1 - 1 u<= 0x19)
        switch (arg1)
            case 1
                int32_t r0_2 = *(r6_1 + 0x18)
                int32_t r1 = *(r6_1 + 0x1c)
                
                if (r1 != r0_2)
                    i = (r1 - r0_2) s>> 2
                    int32_t r1_2 = 0
                    
                    do
                        arg3[r1_2] = zx.d(*(*(r0_2 + (r1_2 << 2)) + 8))
                        r1_2 += 1
                    while (r1_2 u< i)
            case 3
                void* r0_11 = ascension::CWorld::GetPlayerByIndex(r6_1)
                void* r4_1 = *(r0_11 + 0x84)
                core::CCardInstance** r6_2 = nullptr
                void* var_30_1 = nullptr
                var_34 = nullptr
                void* var_2c_1 = nullptr
                int32_t r0_12 = *(r4_1 + 0xc)
                int32_t r1_13 = *(r4_1 + 0x10)
                uint32_t r1_14 = r1_13 - r0_12
                core::CCardInstance** r0_13 = nullptr
                
                if (r1_13 != r0_12)
                    int32_t r7_1 = r1_14 s>> 2
                    
                    if (r7_1 u>= 0x40000000)
                        std::__ndk1::__vector_base_common<true>::__throw_length_error()
                    label_190d3c:
                        std::__ndk1::__vector_base_common<true>::__throw_length_error()
                    label_190d44:
                        std::__ndk1::__vector_base_common<true>::__throw_length_error()
                    label_190d4c:
                        int32_t r0_121 =
                            std::__ndk1::__vector_base_common<true>::__throw_length_error()
                        void* r0_122 = var_34
                        
                        if (r0_122 != 0)
                            void* var_30_5 = r0_122
                            operator delete(r0_122)
                        
                        sub_1a86c0(r0_121)
                        noreturn
                    
                    void* r0_15 = operator new(r1_14)
                    var_34 = r0_15
                    r6_2 = r0_15
                    var_30_1 = r0_15
                    var_2c_1 = r0_15 + (r7_1 << 2)
                    int32_t r1_15 = *(r4_1 + 0xc)
                    int32_t r7_2 = *(r4_1 + 0x10) - r1_15
                    r0_13 = r6_2
                    
                    if (r7_2 s>= 1)
                        __aeabi_memcpy4(r0_13, r1_15, r7_2)
                        void* r1_16 = r6_2 + r7_2
                        r0_13 = r6_2
                        var_30_1 = r1_16
                        r6_2 = r1_16
                
                var_40 = ascension::CCard::SortCardInstanceByFaction
                std::__ndk1::__sort<bool (*&)(core::CCardInstance const*, core::CCardInstance const*), core::CCardInstance**>(
                    r0_13, r6_2, &var_40)
                int32_t* r0_18 = *(r0_11 + 0x184)
                
                if (r0_18 != 0)
                    var_40 = r0_18
                    
                    if (var_30_1 u>= var_2c_1)
                        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance*>(
                            &var_34)
                    else
                        *var_30_1 = r0_18
                        var_30_1 += 4
                
                void* r0_117 = var_34
                
                if (r0_117 == var_30_1)
                    i = 0xffffffff
                else
                    void* r6_8 = nullptr
                    i = 0xffffffff
                    void* r3_11 = r0_117
                    
                    do
                        void* r4_7 = *r3_11
                        void* r7_8 = *(r4_7 + 0xc)
                        
                        if (r6_8 == 0 || r7_8 != r6_8 || *(r6_8 + 0x8c) != 0)
                            void* r2_41 = &arg3[i]
                            i += 2
                            *(r2_41 + 4) = zx.d(*(r4_7 + 8))
                            r6_8 = r7_8
                            arg3[i] = 1
                        else
                            arg3[i] += 1
                        
                        r3_11 += 4
                    while (var_30_1 != r3_11)
                
                if (r0_117 != 0)
                    void* var_30_3 = r0_117
                    operator delete(r0_117)
            case 4
                void* r1_30 = *(ascension::CWorld::GetPlayerByIndex(r6_1) + 0x38)
                int32_t r0_30 = *(r1_30 + 0xc)
                int32_t r1_31 = *(r1_30 + 0x10)
                
                if (r1_31 != r0_30)
                    i = (r1_31 - r0_30) s>> 2
                    int32_t r1_33 = 0
                    
                    do
                        arg3[r1_33] = zx.d(*(*(r0_30 + (r1_33 << 2)) + 8))
                        r1_33 += 1
                    while (r1_33 u< i)
            case 5
                void* r1_26 = *(ascension::CWorld::GetPlayerByIndex(r6_1) + 0x3c)
                int32_t r0_27 = *(r1_26 + 0xc)
                int32_t r1_27 = *(r1_26 + 0x10)
                
                if (r1_27 != r0_27)
                    i = (r1_27 - r0_27) s>> 2
                    int32_t r1_29 = 0
                    
                    do
                        arg3[r1_29] = zx.d(*(*(r0_27 + (r1_29 << 2)) + 8))
                        r1_29 += 1
                    while (r1_29 u< i)
            case 6
                void* r1_9 = *(ascension::CWorld::GetPlayerByIndex(r6_1) + 0x40)
                int32_t r0_7 = *(r1_9 + 0xc)
                int32_t r1_10 = *(r1_9 + 0x10)
                
                if (r1_10 != r0_7)
                    i = (r1_10 - r0_7) s>> 2
                    int32_t r1_12 = 0
                    
                    do
                        arg3[r1_12] = zx.d(*(*(r0_7 + (r1_12 << 2)) + 8))
                        r1_12 += 1
                    while (r1_12 u< i)
            case 7
                void* r1_19 = *(ascension::CWorld::GetPlayerByIndex(r6_1) + 0x44)
                
                if (r1_19 != 0)
                    int32_t r0_23 = *(r1_19 + 0xc)
                    int32_t r1_20 = *(r1_19 + 0x10)
                    
                    if (r1_20 != r0_23)
                        i = (r1_20 - r0_23) s>> 2
                        int32_t r1_22 = 0
                        
                        do
                            arg3[r1_22] = zx.d(*(*(r0_23 + (r1_22 << 2)) + 8))
                            r1_22 += 1
                        while (r1_22 u< i)
            case 8
                int32_t r0_31 = *(r6_1 + 0xa30)
                int32_t r1_34 = *(r6_1 + 0xa34)
                
                if (r1_34 != r0_31)
                    i = (r1_34 - r0_31) s>> 2
                    int32_t r1_36 = 0
                    
                    do
                        void* r3_6 = *(r0_31 + (r1_36 << 2))
                        uint32_t r2_22 = 0
                        
                        if (r3_6 != 0)
                            r2_22 = zx.d(*(r3_6 + 8))
                        
                        arg3[r1_36] = r2_22
                        r1_36 += 1
                    while (r1_36 u< i)
            case 0xa
                void* r0_33 = ascension::CWorld::GetPlayerByIndex(r6_1)
                
                if (r0_33 != 0)
                    int32_t r1_37 = *(r0_33 + 0x48)
                    i = 0
                    int32_t r2_23 = *(r0_33 + 0x4c)
                    
                    if (r2_23 != r1_37)
                        i = 0
                        
                        do
                            void* r7_3 = *(r1_37 + (i << 2))
                            uint32_t r3_7 = 0
                            
                            if (r7_3 != 0)
                                r3_7 = zx.d(*(r7_3 + 8))
                            
                            arg3[i] = r3_7
                            i += 1
                        while (i u< (r2_23 - r1_37) s>> 2)
                    
                    int32_t r1_38 = *(r0_33 + 0x60)
                    int32_t r3_8 = *(r0_33 + 0x64)
                    
                    if (r3_8 != r1_38)
                        int32_t i_1 = 0
                        
                        do
                            void* r4_2 = *(r1_38 + (i_1 << 2))
                            uint32_t r6_3 = 0
                            
                            if (r4_2 != 0)
                                r6_3 = zx.d(*(r4_2 + 8))
                            
                            arg3[i + i_1] = r6_3
                            i_1 += 1
                        while (i_1 u< (r3_8 - r1_38) s>> 2)
                        
                        i += i_1
                    
                    int32_t r1_39 = *(r0_33 + 0x54)
                    int32_t r2_27 = *(r0_33 + 0x58)
                    
                    if (r2_27 != r1_39)
                        int32_t i_2 = 0
                        
                        do
                            void* r6_4 = *(r1_39 + (i_2 << 2))
                            uint32_t r7_5 = 0
                            
                            if (r6_4 != 0)
                                r7_5 = zx.d(*(r6_4 + 8))
                            
                            arg3[i + i_2] = r7_5
                            i_2 += 1
                        while (i_2 u< (r2_27 - r1_39) s>> 2)
                        
                        i += i_2
            case 0xb
                uint32_t r4_3 = 0
                void* r0_39 = ascension::CWorld::GetCenterRowCard(r6_1)
                uint32_t r1_51 = 0
                
                if (r0_39 != 0)
                    r1_51 = zx.d(*(r0_39 + 8))
                
                *arg3 = r1_51
                void* r0_41 = ascension::CWorld::GetCenterRowCard(r6_1)
                
                if (r0_41 != 0)
                    r4_3 = zx.d(*(r0_41 + 8))
                
                arg3[1] = r4_3
                void* r0_43 = ascension::CWorld::GetCenterRowCard(r6_1)
                uint32_t r1_54 = 0
                
                if (r0_43 != 0)
                    r1_54 = zx.d(*(r0_43 + 8))
                
                arg3[2] = r1_54
                uint32_t r4_4 = 0
                void* r0_45 = ascension::CWorld::GetCenterRowCard(r6_1)
                
                if (r0_45 != 0)
                    r4_4 = zx.d(*(r0_45 + 8))
                
                arg3[3] = r4_4
                void* r0_47 = ascension::CWorld::GetCenterRowCard(r6_1)
                uint32_t r1_57 = 0
                
                if (r0_47 != 0)
                    r1_57 = zx.d(*(r0_47 + 8))
                
                arg3[4] = r1_57
                uint32_t r4_5 = 0
                void* r0_49 = ascension::CWorld::GetCenterRowCard(r6_1)
                
                if (r0_49 != 0)
                    r4_5 = zx.d(*(r0_49 + 8))
                
                arg3[5] = r4_5
                void* r0_51 = ascension::CWorld::GetCenterRowCard(r6_1)
                i = 7
                uint32_t r0_52
                
                if (r0_51 != 0)
                    r0_52 = zx.d(*(r0_51 + 8))
                else
                    r0_52 = 0
                
                arg3[6] = r0_52
            case 0xc
                void* r1_46 = *(r6_1 + 0xa4c)
                int32_t r0_37 = *(r1_46 + 0xc)
                int32_t r1_47 = *(r1_46 + 0x10)
                
                if (r1_47 != r0_37)
                    i = (r1_47 - r0_37) s>> 2
                    int32_t r1_49 = 0
                    
                    do
                        arg3[r1_49] = zx.d(*(*(r0_37 + (r1_49 << 2)) + 8))
                        r1_49 += 1
                    while (r1_49 u< i)
            case 0x12
                int32_t r0_4 = *(r6_1 + 0xb80)
                int32_t r1_6 = *(r6_1 + 0xb84)
                
                if (r1_6 != r0_4)
                    i = (r1_6 - r0_4) s>> 3
                    int32_t r1_8 = 0
                    
                    do
                        arg3[r1_8] = zx.d(*(*(r0_4 + (r1_8 << 3)) + 8))
                        r1_8 += 1
                    while (r1_8 u< i)
            case 0x13
                int32_t r0_24 = *(r6_1 + 0xbd8)
                int32_t r1_23 = *(r6_1 + 0xbdc)
                
                if (r1_23 != r0_24)
                    i = (r1_23 - r0_24) s>> 3
                    int32_t r1_25 = 0
                    
                    do
                        int32_t* r3_3 = r0_24 + (r1_25 << 3)
                        uint32_t r2_16 = zx.d(*(*r3_3 + 8))
                        arg3[r1_25] = r2_16
                        int32_t r3_4 = r3_3[1]
                        
                        if (r3_4 == 9)
                            arg3[r1_25] = 0x5000 + r2_16
                        else if (r3_4 == 0xc)
                            arg3[r1_25] = 0x6000 + r2_16
                        
                        r1_25 += 1
                    while (r1_25 u< i)
            case 0x15
                void* r0_8 = *(r6_1 + 0xa6c)
                
                if (r0_8 != 0)
                    i = 1
                    *arg3 = zx.d(*(r0_8 + 8))
            case 0x16
                int32_t r0_3 = *(r6_1 + 0xa70)
                int32_t r1_3 = *(r6_1 + 0xa74)
                
                if (r1_3 != r0_3)
                    i = (r1_3 - r0_3) s>> 2
                    int32_t r1_5 = 0
                    
                    do
                        arg3[r1_5] = zx.d(*(*(r0_3 + (r1_5 << 2)) + 8))
                        r1_5 += 1
                    while (r1_5 u< i)
            case 0x17
                int32_t r0_35 = *(r6_1 + 0xac8)
                int32_t r1_40 = *(r6_1 + 0xacc)
                
                if (r1_40 != r0_35)
                    i = (r1_40 - r0_35) s>> 3
                    int32_t r1_42 = 0
                    
                    do
                        arg3[r1_42] = zx.d(*(*(r0_35 + (r1_42 << 3)) + 8))
                        r1_42 += 1
                    while (r1_42 u< i)
            case 0x18
                int32_t r0_36 = *(r6_1 + 0xb9c)
                int32_t r1_43 = *(r6_1 + 0xba0)
                
                if (r1_43 != r0_36)
                    i = (r1_43 - r0_36) s>> 3
                    int32_t r1_45 = 0
                    
                    do
                        arg3[r1_45] = zx.d(*(*(r0_36 + (r1_45 << 3)) + 8))
                        r1_45 += 1
                    while (r1_45 u< i)
            case 0x19
                void* r0_55 = ascension::CWorld::GetPlayerByIndex(r6_1)
                
                if (r0_55 != 0)
                    i = 0
                    void* var_30_2 = nullptr
                    var_34 = nullptr
                    int32_t var_2c_2 = 0
                    int32_t r0_56 = *(r0_55 + 0x48)
                    int32_t r1_63 = *(r0_55 + 0x4c)
                    uint32_t r0_57 = r1_63 - r0_56
                    
                    if (r1_63 != r0_56)
                        int32_t r4_6 = r0_57 s>> 2
                        
                        if (r4_6 u>= 0x40000000)
                            goto label_190d3c
                        
                        void* r0_58 = operator new(r0_57)
                        var_34 = r0_58
                        void* r7_6 = r0_58
                        var_30_2 = r0_58
                        void* var_2c_3 = r0_58 + (r4_6 << 2)
                        int32_t r1_64 = *(r0_55 + 0x48)
                        int32_t r6_6 = *(r0_55 + 0x4c) - r1_64
                        void* r6_7
                        
                        if (r6_6 s< 1)
                            r6_7 = r7_6
                            
                            if (r7_6 != r6_7)
                            label_19087c:
                                i = 0
                                
                                while (true)
                                    void* r7_9 = *r6_7
                                    int32_t r9_1 = 0
                                    int32_t* i_3 = *(r7_9 + 0x20)
                                    
                                    if (i_3 != *(r7_9 + 0x24))
                                        r9_1 = 0
                                        
                                        do
                                            int32_t r0_66 =
                                                GameOptionManager::IsSelectableInstanceID(
                                                (*(s_InterfaceContext + 8)).w, zx.d(*(*i_3 + 8)))
                                            bool cond:11_1 = r0_66 != 0
                                            
                                            if (r0_66 != 0)
                                                r0_66 = 1
                                            
                                            r9_1 |= r0_66
                                            
                                            if (cond:11_1)
                                                break
                                            
                                            i_3 = &i_3[1]
                                        while (i_3 != *(r7_9 + 0x24))
                                    
                                    int32_t temp0_1 = 0
                                    uint32_t i_4 = GameOptionManager::IsSelectableInstanceID(
                                        (*(s_InterfaceContext + 8)).w, zx.d(*(r7_9 + 8)))
                                    
                                    while (i_4 != 0)
                                        i_4 u>>= 1
                                        temp0_1 += 1
                                    
                                    if ((not.d(r9_1) & (0x20 - temp0_1) u>> 5) != 0)
                                        r6_7 += 4
                                        
                                        if (var_30_2 == r6_7)
                                            break
                                    else
                                        arg3[i] = zx.d(*(r7_9 + 8))
                                        
                                        if (var_30_2 != r6_7 + 4)
                                            __aeabi_memmove4(r6_7)
                                        
                                        void* r0_75 = r6_7 + ((var_30_2 - (r6_7 + 4)) s>> 2 << 2)
                                        var_30_2 = r0_75
                                        i += 1
                                        
                                        if (r0_75 == r6_7)
                                            break
                        else
                            __aeabi_memcpy4(r7_6, r1_64, r6_6)
                            void* r0_62 = r7_6 + r6_6
                            r6_7 = r7_6
                            var_30_2 = r0_62
                            
                            if (r0_62 != r6_7)
                                goto label_19087c
                    
                    void* var_3c_1 = nullptr
                    var_40 = nullptr
                    int32_t var_38_1 = 0
                    int32_t r0_77 = *(r0_55 + 0x54)
                    int32_t r1_71 = *(r0_55 + 0x58)
                    uint32_t r0_78 = r1_71 - r0_77
                    
                    if (r1_71 != r0_77)
                        int32_t r4_9 = r0_78 s>> 2
                        
                        if (r4_9 u>= 0x40000000)
                            goto label_190d44
                        
                        int32_t* r0_79 = operator new(r0_78)
                        var_40 = r0_79
                        var_3c_1 = r0_79
                        void* var_38_2 = &r0_79[r4_9]
                        int32_t r1_72 = *(r0_55 + 0x54)
                        int32_t r6_11 = *(r0_55 + 0x58) - r1_72
                        int32_t* r9_2
                        
                        if (r6_11 s< 1)
                            r9_2 = r0_79
                            
                            if (r0_79 != r9_2)
                            label_1909e0:
                                
                                while (true)
                                    void* r7_12 = *r9_2
                                    int32_t r4_10 = 0
                                    int32_t* i_5 = *(r7_12 + 0x3c)
                                    
                                    if (i_5 != *(r7_12 + 0x40))
                                        r4_10 = 0
                                        
                                        do
                                            int32_t r0_86 =
                                                GameOptionManager::IsSelectableInstanceID(
                                                (*(s_InterfaceContext + 8)).w, zx.d(*(*i_5 + 8)))
                                            bool cond:13_1 = r0_86 != 0
                                            
                                            if (r0_86 != 0)
                                                r0_86 = 1
                                            
                                            r4_10 |= r0_86
                                            
                                            if (cond:13_1)
                                                break
                                            
                                            i_5 = &i_5[1]
                                        while (i_5 != *(r7_12 + 0x40))
                                    
                                    int32_t temp0_2 = 0
                                    uint32_t i_6 = GameOptionManager::IsSelectableInstanceID(
                                        (*(s_InterfaceContext + 8)).w, zx.d(*(r7_12 + 8)))
                                    
                                    while (i_6 != 0)
                                        i_6 u>>= 1
                                        temp0_2 += 1
                                    
                                    if ((not.d(r4_10) & (0x20 - temp0_2) u>> 5) != 0)
                                        r9_2 = &r9_2[1]
                                        
                                        if (var_3c_1 == r9_2)
                                            break
                                    else
                                        arg3[i] = zx.d(*(r7_12 + 8))
                                        
                                        if (var_3c_1 != &r9_2[1])
                                            __aeabi_memmove4(r9_2)
                                        
                                        void* r0_95 = &r9_2[(var_3c_1 - &r9_2[1]) s>> 2]
                                        var_3c_1 = r0_95
                                        i += 1
                                        
                                        if (r0_95 == r9_2)
                                            break
                        else
                            __aeabi_memcpy4(r0_79, r1_72, r6_11)
                            void* r0_83 = r0_79 + r6_11
                            r9_2 = r0_79
                            var_3c_1 = r0_83
                            
                            if (r0_83 != r9_2)
                                goto label_1909e0
                    
                    void* r6_12 = nullptr
                    void* var_48_1 = nullptr
                    void* var_4c_1 = nullptr
                    int32_t var_44_1 = 0
                    int32_t r0_97 = *(r0_55 + 0x60)
                    int32_t r1_79 = *(r0_55 + 0x64)
                    uint32_t r0_98 = r1_79 - r0_97
                    
                    if (r1_79 != r0_97)
                        int32_t r4_12 = r0_98 s>> 2
                        
                        if (r4_12 u>= 0x40000000)
                            goto label_190d4c
                        
                        void* r0_99 = operator new(r0_98)
                        var_4c_1 = r0_99
                        r6_12 = r0_99
                        var_48_1 = r0_99
                        void* var_44_2 = r0_99 + (r4_12 << 2)
                        int32_t r1_80 = *(r0_55 + 0x60)
                        int32_t r7_13 = *(r0_55 + 0x64) - r1_80
                        int32_t* r7_14
                        
                        if (r7_13 s< 1)
                            r7_14 = r6_12
                            
                            if (r6_12 != r7_14)
                            label_190b5c:
                                
                                while (true)
                                    void* r4_13 = *r7_14
                                    
                                    if (GameOptionManager::IsSelectableInstanceID(
                                            (*(s_InterfaceContext + 8)).w, zx.d(*(r4_13 + 8))) == 0)
                                        r6_12 = var_48_1
                                        r7_14 = &r7_14[1]
                                        
                                        if (r6_12 == r7_14)
                                            break
                                    else
                                        arg3[i] = zx.d(*(r4_13 + 8))
                                        
                                        if (var_48_1 != &r7_14[1])
                                            __aeabi_memmove4(r7_14)
                                        
                                        r6_12 = &r7_14[(var_48_1 - &r7_14[1]) s>> 2]
                                        var_48_1 = r6_12
                                        i += 1
                                        
                                        if (r6_12 == r7_14)
                                            break
                        else
                            __aeabi_memcpy4(r6_12, r1_80, r7_13)
                            void* r0_104 = r6_12 + r7_13
                            r7_14 = r6_12
                            var_48_1 = r0_104
                            r6_12 = r0_104
                            
                            if (r6_12 != r7_14)
                                goto label_190b5c
                    
                    void* r10_1 = var_34
                    
                    if (r10_1 != var_30_2)
                        uint32_t* r1_83 = &arg3[i]
                        int32_t* r3_12 = r10_1
                        
                        do
                            void* r7_15 = *r3_12
                            r3_12 = &r3_12[1]
                            *r1_83 = zx.d(*(r7_15 + 8))
                            r1_83 = &r1_83[1]
                        while (var_30_2 != r3_12)
                        
                        i = i + ((var_30_2 - 4 - r10_1) u>> 2) + 1
                    
                    int32_t* r9_3 = var_4c_1
                    
                    if (r9_3 != r6_12)
                        uint32_t* r0_111 = &arg3[i]
                        int32_t* r2_55 = r9_3
                        
                        do
                            void* r3_13 = *r2_55
                            r2_55 = &r2_55[1]
                            *r0_111 = zx.d(*(r3_13 + 8))
                            r0_111 = &r0_111[1]
                        while (r6_12 != r2_55)
                        
                        i = i + ((r6_12 - 4 - r9_3) u>> 2) + 1
                    
                    int32_t* r7_17 = var_40
                    void* r0_112 = var_3c_1
                    int32_t* r6_13
                    
                    if (r7_17 == r0_112)
                        r6_13 = r0_112
                    else
                        r6_13 = r7_17
                        
                        while (true)
                            void* r1_87 = *r6_13
                            
                            if (*(*(*(r1_87 + 0x10) + 0xc) + 0x88) != 3)
                                arg3[i] = zx.d(*(r1_87 + 8))
                                
                                if (r0_112 != &r6_13[1])
                                    __aeabi_memmove4(r6_13)
                                
                                r0_112 = &r6_13[(r0_112 - &r6_13[1]) s>> 2]
                                void* var_3c_2 = r0_112
                                i += 1
                                
                                if (r6_13 == r0_112)
                                    break
                            else
                                r6_13 = &r6_13[1]
                                
                                if (r6_13 == r0_112)
                                    break
                    
                    if (r6_13 != r7_17)
                        uint32_t* r0_114 = &arg3[i]
                        int32_t* r2_60 = r7_17
                        
                        do
                            void* r3_15 = *r2_60
                            r2_60 = &r2_60[1]
                            *r0_114 = zx.d(*(r3_15 + 8))
                            r0_114 = &r0_114[1]
                        while (r6_13 != r2_60)
                        
                        i = i + ((r6_13 - r7_17 - 4) u>> 2) + 1
                    
                    if (r9_3 != 0)
                        int32_t* var_48_2 = r9_3
                        operator delete(r9_3)
                    
                    if (r7_17 != 0)
                        int32_t* var_3c_3 = r7_17
                        operator delete(r7_17)
                    
                    if (r10_1 != 0)
                        void* var_30_4 = r10_1
                        operator delete(r10_1)
            case 0x1a
                int32_t r0_53 = *(r6_1 + 0xa7c)
                int32_t r1_60 = *(r6_1 + 0xa80)
                
                if (r1_60 != r0_53)
                    i = (r1_60 - r0_53) s>> 2
                    int32_t r1_62 = 0
                    
                    do
                        arg3[r1_62] = zx.d(*(*(r0_53 + (r1_62 << 2)) + 8))
                        r1_62 += 1
                    while (r1_62 u< i)

if (*__stack_chk_guard == r3)
    return i

__stack_chk_fail()
noreturn
