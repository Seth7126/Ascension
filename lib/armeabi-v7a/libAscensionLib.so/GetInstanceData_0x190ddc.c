// 函数: GetInstanceData
// 地址: 0x190ddc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r2 = *s_pWorldData
int32_t r1 = *__stack_chk_guard
int32_t result

if (r2 == 0)
    __aeabi_memclr(arg3, arg4, r2)
    result = 0
else
    r2 += *(s_InterfaceContext + 0x10) * 0x34
    ascension::CPlayer* r6_2 = *(r2 + 0x124)
    
    if (r6_2 == 0)
        __aeabi_memclr(arg3, arg4, r2)
        result = 0
    else
        result = 0
        
        switch (arg1)
            case 0
                int32_t r3 = 0
                *arg3 = zx.d(*(r6_2 + 0xa2c))
                *(arg3 + 4) = *(r6_2 + 0xb18)
                uint32_t r0_3 = 0
                void* r2_1 = *(r6_2 + 0xb20)
                
                if (r2_1 != 0)
                    r3 = *(r2_1 + 0xc)
                
                *(arg3 + 8) = r3
                *(arg3 + 0xc) = *(*(r6_2 + 0xa3c) + 0x18)
                *(arg3 + 0x10) = *(*(r6_2 + 0xa4c) + 0x18)
                void* r2_6 = *(r6_2 + 0xa6c)
                
                if (r2_6 != 0)
                    r0_3 = zx.d(*(r2_6 + 8))
                
                *(arg3 + 0x14) = r0_3
                *(arg3 + 0x18) = *(r6_2 + 0xb0c)
                *(arg3 + 0x1c) = *(r6_2 + 0xb40)
                *(arg3 + 0x20) = *(r6_2 + 0xb44)
                *(arg3 + 0x24) = *(r6_2 + 0xb48)
                *(arg3 + 0x28) = *(r6_2 + 0xb4c)
                *(arg3 + 0x2c) = *(r6_2 + 0xb50)
                *(arg3 + 0x30) = *(r6_2 + 0xb54)
                int32_t var_38_1 = 1
                char var_2a
                bool var_29
                ascension::CWorld::GetCenterRowDayNight(r6_2, *(s_InterfaceContext + 0xc), &var_29, 
                    &var_2a)
                uint32_t r0_12 = zx.d(var_29)
                *(arg3 + 0x34) = r0_12
                int32_t r1_3 = 4
                
                if (zx.d(var_2a) != 0)
                    r0_12 |= 2
                    *(arg3 + 0x34) = r0_12
                
                if (zx.d(*(r6_2 + 0xb29)) == 0)
                    r1_3 = 8
                
                if (zx.d(*(r6_2 + 0xb29)) != 0 || zx.d(*(r6_2 + 0xb2a)) != 0)
                    r0_12 |= r1_3
                    *(arg3 + 0x34) = r0_12
                
                result = 0x38
                
                if (zx.d(*(r6_2 + 0xb2b)) != 0)
                    *(arg3 + 0x34) = r0_12 | 0x10
            case 1
                void* r0_19 = core::CWorldBase::GetInstanceByID(r6_2)
                
                if (r0_19 != 0)
                    result = 8
                    *(arg3 + 4) = *(r0_19 + 0xc)
            case 2
                int32_t r0_22 = core::CWorldBase::GetInstanceByID(r6_2)
                
                if (r0_22 != 0)
                    result = 0
                    core::CCardInstance* r0_23 = __dynamic_cast(r0_22, 
                        _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
                    
                    if (r0_23 != 0)
                        FillCardData(arg3, *(r0_23 + 0xc), r0_23)
                        result = 0x318
            case 9
                int32_t* r0_26 = ascension::CWorld::GetCenterRowCardStackList(r6_2)
                
                if (r0_26 != 0)
                    result = 0x3c
                    __aeabi_memclr(arg3, 0x3c)
                    int16_t r1_12 = 0
                    
                    if (*(r6_2 + 0xb10) s> arg2)
                        r1_12 = 1
                    
                    arg3[1] = r1_12
                    int32_t* r0_29 = *r0_26
                    int32_t r1_13 = r0_26[1]
                    
                    if (r0_29 != r1_13)
                        do
                            void* r2_12 = *r0_29
                            
                            if (r2_12 != 0)
                                int32_t r3_2 = r0_29[1]
                                
                                if (r3_2 u<= 3)
                                    int16_t r2_13
                                    void* r3_5
                                    
                                    switch (r3_2)
                                        case 0
                                            int32_t r3_4 = sx.d(arg3[2])
                                            r2_13 = *(r2_12 + 8)
                                            arg3[2] = r3_4.w + 1
                                            r3_5 = &arg3[3 + r3_4]
                                        case 1
                                            int32_t r3_6 = sx.d(arg3[0xa])
                                            r2_13 = *(r2_12 + 8)
                                            arg3[0xa] = r3_6.w + 1
                                            r3_5 = &arg3[0xb + r3_6]
                                        case 2
                                            int32_t r3_7 = sx.d(arg3[6])
                                            r2_13 = *(r2_12 + 8)
                                            arg3[6] = r3_7.w + 1
                                            r3_5 = &arg3[7 + r3_7]
                                        case 3
                                            int32_t r3_8 = sx.d(arg3[0xe])
                                            r2_13 = *(r2_12 + 8)
                                            arg3[0xe] = r3_8.w + 1
                                            r3_5 = &arg3[0xf + r3_8]
                                    
                                    *r3_5 = r2_13
                            
                            r0_29 = &r0_29[2]
                        while (r1_13 != r0_29)
            case 0xa
                int32_t r0_31 = core::CWorldBase::GetInstanceByID(r6_2)
                
                if (r0_31 != 0)
                    result = 0
                    void* r0_32 = __dynamic_cast(r0_31, _typeinfo_for_core::CInstance, 
                        _typeinfo_for_ascension::CCardInPlayInstance, 0)
                    
                    if (r0_32 != 0)
                        *arg3 = *(r0_32 + 8)
                        int16_t r0_35 = *(*(r0_32 + 0x10) + 8)
                        *(arg3 + 8) = 0
                        arg3[8] = 0
                        *(arg3 + 0xc) = 0
                        arg3[1] = r0_35
                        *(arg3 + 4) = 0
                        void* r0_37 = *(*(r0_32 + 0x10) + 0xc)
                        int16_t r10_1 = 1
                        
                        if (strcasecmp(r0_37 + 4, "Nethersnare") == 0)
                            arg3[8] = r10_1
                        else if (strcasecmp(r0_37 + 4, "Dreamer's Glass") == 0)
                            arg3[8] = r10_1
                        else if (strcasecmp(r0_37 + 4, "Smoke Tyrant") == 0)
                            arg3[8] = r10_1
                        else if (strcasecmp(r0_37 + 4, "Akam, the Genie") == 0)
                            arg3[8] = 2
                        else if (strcasecmp(r0_37 + 4, "Soul Collector") == 0)
                            arg3[8] = 3
                        
                        void* r0_49 = __dynamic_cast(r0_32, 
                            _typeinfo_for_ascension::CCardInPlayInstance, 
                            _typeinfo_for_ascension::CConstructInstance, 0)
                        
                        if (r0_49 != 0)
                            int32_t r1_17 = *(r0_49 + 0x4c)
                            
                            if (r1_17 - *(r0_49 + 0x48) == 4 && zx.d(*(r0_37 + 0xcb)) != 0)
                                arg3[2] = *(*(r1_17 - 4) + 8)
                            
                            int32_t* r1_20 = *(r0_49 + 0x3c)
                            int32_t r0_50 = *(r0_49 + 0x40)
                            
                            if (r1_20 != r0_50)
                                void* r1_21 = &r1_20[1]
                                arg3[4] = *(*r1_20 + 8)
                                arg3[3] = 1
                                
                                if (r1_21 != r0_50)
                                    do
                                        int32_t r3_9 = sx.d(arg3[3])
                                        void* r2_22 = *r1_21
                                        r1_21 += 4
                                        int16_t r2_23 = *(r2_22 + 8)
                                        arg3[3] = r3_9.w + 1
                                        arg3[4 + r3_9] = r2_23
                                    while (r0_50 != r1_21)
                        
                        int32_t* r0_51 = *(r0_32 + 0x20)
                        result = 0x12
                        int32_t r1_22 = *(r0_32 + 0x24)
                        
                        if (r0_51 != r1_22)
                            do
                                int32_t r3_11 = sx.d(arg3[3])
                                void* r2_24 = *r0_51
                                r0_51 = &r0_51[1]
                                int16_t r2_25 = *(r2_24 + 8)
                                arg3[3] = r3_11.w + 1
                                arg3[4 + r3_11] = r2_25
                            while (r1_22 != r0_51)

if (*__stack_chk_guard == r1)
    return result

__stack_chk_fail()
noreturn
