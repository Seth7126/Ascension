// 函数: sub_191e3c
// 地址: 0x191e3c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *__stack_chk_guard
int32_t r0_1 = *arg2
uint32_t r5 = zx.d(*(*s_InterfaceContext + 0x10))

if (r0_1 == 0x8000003)
    int32_t r0_7 = arg2[1] - 1
    
    if (r0_7 u> 0x42)
        goto label_191f5c
    
    int32_t* r0_17
    int32_t* r0_33
    int32_t* r0_36
    int32_t* r0_38
    int32_t* r0_50
    int32_t r1_44
    int32_t r1_71
    int32_t r1_78
    int32_t r1_88
    int32_t r1_498
    int32_t r2_17
    int32_t r2_28
    int32_t r2_37
    
    switch (r0_7)
        case 0
            if (r5 == 0)
                data_1f4e48 = 1
                int32_t* r2_5 = data_1f5894
                
                if (r2_5 != 0)
                    int32_t r0_10 = data_1f5898 + data_1f589c
                    int32_t* r1_13 = &r2_5[7]
                    
                    if (r1_13 u>= r0_10)
                        r1_13 = r2_5
                    else
                        r2_5[1] = 1
                        *r2_5 = 0x1c
                        data_1f5894 = r1_13
                        data_1f5890 += 1
                        int32_t r3_5 = 3
                        r2_5[2] = 3
                        int32_t r7_1 = arg2[2]
                        r2_5[4] = 0
                        r2_5[5] = 0
                        
                        if (r7_1 == 0)
                            r3_5 = 9
                        
                        r2_5[6] = 0
                        r2_5[3] = r3_5
                    
                    int32_t* r2_192 = &r1_13[3]
                    
                    if (r2_192 u>= r0_10)
                        r2_192 = r1_13
                    else
                        r1_13[1] = 0xa
                        *r1_13 = 0xc
                        data_1f5894 = r2_192
                        data_1f5890 += 1
                        r1_13[2] = arg2[2]
                    
                    if (&r2_192[7] u< r0_10)
                        r2_192[1] = 1
                        *r2_192 = 0x1c
                        data_1f5894 = &r2_192[7]
                        data_1f5890 += 1
                        r2_192[3] = 0
                        r2_192[2] = 1
                        r2_192[4] = 0
                        r2_192[5] = 0
                        r2_192[6] = 0x3e99999a
            
            goto label_191f5c
        case 1
            if (r5 == 0)
                int32_t* r6_6 = data_1f5894
                
                if (r6_6 != 0 && &r6_6[0xd] u< data_1f5898 + data_1f589c)
                    *r6_6 = 0x34
                    r6_6[1] = 0x12
                    data_1f5894 = &r6_6[0xd]
                    uint32_t r2_143 = *s_pWorldData
                    data_1f5890 += 1
                    uint32_t r0_229
                    
                    if (r2_143 == 0)
                        r0_229 = 0
                    else
                        r0_229 = *(r2_143 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                    
                    arg2[3]
                    void* r0_351 = core::CWorldBase::GetInstanceByID(r0_229)
                    void* r2_212 = *(r0_351 + 0xc)
                    r6_6[2] = arg2[2]
                    r6_6[3] = zx.d(*(r0_351 + 8))
                    r6_6[4] = arg2[4]
                    char* r1_471 = r2_212 + 0x32c
                    
                    if (zx.d(*r1_471) == 0)
                        r1_471 = r2_212 + 0x44
                    
                    strcpy(&r6_6[5], r1_471)
            
            if (r5 != 0)
                r5 = 1
            
            if (*__stack_chk_guard == r0)
                return HandleEventDefeatMonster(arg2[2], arg2[3], arg2[4], r5.b) __tailcall
        case 2
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                char r3_19 = *(s_localPlayerStats + 0xf6)
                char r2_76 = *(s_localPlayerStats + 0xda) & 0xe0
                void* r7_4 = *s_pWorldData + *(s_InterfaceContext + 0x10) * 0x34
                *(s_localPlayerStats + 4) = 0
                *(s_localPlayerStats + 8) = 0
                *(s_localPlayerStats + 0xc) = 0
                *(s_localPlayerStats + 0xd8) = 0
                *(s_localPlayerStats + 0xdc) = 0
                *(s_localPlayerStats + 0xe0) = 0
                *(s_localPlayerStats + 0xe4) = 0
                *(s_localPlayerStats + 0xe8) = 0
                *(s_localPlayerStats + 0xec) = 0
                *(s_localPlayerStats + 0xf8) = 0
                *(s_localPlayerStats + 0xfa) = 0
                *(s_localPlayerStats + 0xfe) = 0
                *(s_localPlayerStats + 0xda) = r2_76
                *(s_localPlayerStats + 0xf6) = r3_19 & 0xfc
                void* r2_78 = *(r7_4 + 0x124)
                
                if (*(r2_78 + 0xb24) != *(r2_78 + 0xb20))
                    *(s_localPlayerStats + 0xf0) = 0
                
                *(s_localPlayerStats + 0xf4) = 0
            
            goto label_191f5c
        case 3
            if (r5 == 0)
                int32_t* r0_222 = data_1f5894
                
                if (r0_222 != 0 && &r0_222[5] u< data_1f5898 + data_1f589c)
                    r0_222[1] = 0x13
                    *r0_222 = 0x14
                    data_1f5894 = &r0_222[5]
                    data_1f5890 += 1
                    r0_222[2] = arg2[2]
                    r0_222[3] = arg2[3]
                    r0_222[4] = arg2[4]
            
            if (r5 != 0)
                r5 = 1
            
            int32_t r2_59 = *__stack_chk_guard
            
            if (r2_59 == r0)
                return HandleEventAcquiredCard(arg2[2], arg2[3], r2_59 - r0, r5.b) __tailcall
        case 4
            if (arg2[4] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                uint32_t r0_56 = *s_pWorldData
                uint32_t r6_1
                
                if (r0_56 == 0)
                    r6_1 = 0
                else
                    r6_1 = *(r0_56 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                arg2[2]
                void* r0_247 = core::CWorldBase::GetInstanceByID(r6_1)
                arg2[3]
                void* r7_6 = *(r0_247 + 0xc)
                void* r0_249 = core::CWorldBase::GetInstanceByID(r6_1)
                
                if (r5 == 0 && strcasecmp(r7_6 + 4, "P.R.I.M.E.") == 0
                        && strcasecmp(*(r0_249 + 0xc) + 4, "Dream Machine") == 0)
                    int32_t* r0_254 = data_1f5894
                    
                    if (r0_254 != 0 && &r0_254[6] u< data_1f5898 + data_1f589c)
                        r0_254[1] = 0x25
                        *r0_254 = 0x18
                        data_1f5894 = &r0_254[6]
                        data_1f5890 += 1
                        r0_254[4] = 1
                        r0_254[5] = 0
                        r0_254[2] = 0xc
            
            goto label_191f5c
        case 5
            if (r5 == 0)
                uint32_t r0_115 = *s_pWorldData
                uint32_t r0_117
                
                if (r0_115 == 0)
                    r0_117 = 0
                else
                    r0_117 = *(r0_115 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                arg2[2]
                int32_t r0_314 = core::CWorldBase::GetInstanceByID(r0_117)
                
                if (r0_314 != 0)
                    void* r0_315 = __dynamic_cast(r0_314, _typeinfo_for_core::CInstance, 
                        _typeinfo_for_ascension::CCardInPlayInstance, 0)
                    
                    if (r0_315 != 0)
                        int32_t* r1_419 = data_1f5894
                        
                        if (r1_419 != 0 && &r1_419[6] u< data_1f5898 + data_1f589c)
                            r1_419[1] = 7
                            *r1_419 = 0x18
                            data_1f5894 = &r1_419[6]
                            data_1f5890 += 1
                            r1_419[2] = arg2[2]
                            r1_419[3] = zx.d(*(*(r0_315 + 0x10) + 8))
                            r1_419[4] = arg2[3]
                            r1_419[5] = arg2[4]
            
            goto label_191f5c
        case 6
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                if (zx.d(*(s_localPlayerStats + 0xf4)) == 0)
                    int32_t r1_183 = *(s_localPlayerStats + 0xf0)
                    *(s_localPlayerStats + 0xf4) = 1
                    *(s_localPlayerStats + 0xf0) = r1_183 + 1
                
                if (r5 == 0)
                    if (*(s_localPlayerStats + 0xf0) u>= 4)
                        uint32_t r0_127 = zx.d(*(*s_pWorldData + 0xe))
                        int32_t* r0_128
                        
                        if (r0_127 == 0x4000 || r0_127 == 1)
                            r0_128 = data_1f5894
                            
                            if (r0_128 != 0 && &r0_128[6] u< data_1f5898 + data_1f589c)
                                r0_128[1] = 0x25
                                *r0_128 = 0x18
                                data_1f5894 = &r0_128[6]
                                data_1f5890 += 1
                                r0_128[4] = 1
                                r0_128[5] = 0
                                r0_128[2] = 0x17
                        else if ((r0_127 & 2) != 0)
                            r0_128 = data_1f5894
                            
                            if (r0_128 != 0 && &r0_128[6] u< data_1f5898 + data_1f589c)
                                r0_128[1] = 0x25
                                *r0_128 = 0x18
                                data_1f5894 = &r0_128[6]
                                data_1f5890 += 1
                                r0_128[4] = 1
                                r0_128[5] = 0
                                r0_128[2] = 0x15
                    
                    if (arg2[3] != 0)
                        uint32_t r0_365 = *s_pWorldData
                        uint32_t r0_367
                        
                        if (r0_365 == 0)
                            r0_367 = 0
                        else
                            r0_367 = *(r0_365 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                        
                        int32_t r0_368 = core::CWorldBase::GetInstanceByID(r0_367)
                        
                        if (r0_368 != 0)
                            void* r0_369 = __dynamic_cast(r0_368, _typeinfo_for_core::CInstance, 
                                _typeinfo_for_core::CCardInstance, 0)
                            
                            if (r0_369 != 0
                                    && strcasecmp(*(r0_369 + 0xc) + 4, "Wandering Askara") == 0)
                                int32_t* r0_373 = data_1f5894
                                
                                if (r0_373 != 0 && &r0_373[6] u< data_1f5898 + data_1f589c)
                                    r0_373[1] = 0x25
                                    *r0_373 = 0x18
                                    data_1f5894 = &r0_373[6]
                                    data_1f5890 += 1
                                    r0_373[4] = 1
                                    r0_373[5] = 0
                                    r0_373[2] = 0x1e
            
            goto label_191f5c
        case 7
            if (r5 == 0)
                void* r5_3 = *(s_InterfaceContext + 0xc)
                
                if (arg2[2] == zx.d(*(r5_3 + 8)) && (zx.d(*(*s_pWorldData + 0xe)) & 2) != 0)
                    int32_t r1_144 = *(r5_3 + 0x48)
                    
                    if (*(r5_3 + 0x4c) != r1_144)
                        int32_t i = 0
                        int32_t r4_2 = 0
                        
                        do
                            int32_t temp0_1 = 0
                            int32_t j =
                                strcasecmp((*(**(r1_144 + (i << 2)) + 0xc))(), "Samael the Fallen")
                            
                            while (j != 0)
                                j u>>= 1
                                temp0_1 += 1
                            
                            r1_144 = *(r5_3 + 0x48)
                            i += 1
                            r4_2 |= (0x20 - temp0_1) u>> 5
                        while (i u< (*(r5_3 + 0x4c) - r1_144) s>> 2)
                        
                        if ((r4_2 & 1) != 0)
                            void* r5_4 = *(*(s_InterfaceContext + 0xc) + 0x84)
                            void* var_34_1 = nullptr
                            int32_t var_30_1 = 0
                            int32_t var_2c_1 = 0
                            int32_t r0_83 = *(r5_4 + 0xc)
                            int32_t r1_147 = *(r5_4 + 0x10)
                            uint32_t r0_84 = r1_147 - r0_83
                            
                            if (r1_147 != r0_83)
                                int32_t r6_2 = r0_84 s>> 2
                                
                                if (r6_2 u>= 0x40000000)
                                    sub_1a86c0(std::__ndk1::__vector_base_common<true>::__throw_length_error())
                                    noreturn
                                
                                int32_t* r0_85 = operator new(r0_84)
                                var_34_1 = r0_85
                                int32_t* r4_3 = r0_85
                                int32_t* var_30_2 = r0_85
                                void* var_2c_2 = &r0_85[r6_2]
                                int32_t r1_148 = *(r5_4 + 0xc)
                                int32_t r5_5 = *(r5_4 + 0x10) - r1_148
                                
                                if (r5_5 s> 0)
                                    __aeabi_memcpy4(r4_3, r1_148, r5_5)
                                    void* var_30_3 = r4_3 + r5_5
                                    
                                    if (r5_5 != 0)
                                        int32_t i_5 = r5_5 & 0xfffffffc
                                        int32_t r8_1 = 0
                                        int32_t i_1
                                        
                                        do
                                            char* __s1 = (*(**r4_3 + 0xc))()
                                            
                                            if (strcasecmp(__s1, "Bazu, Duke of Scorn") == 0)
                                                r8_1 |= 1
                                            else if (strcasecmp(__s1, "Doom Weeper") == 0)
                                                r8_1 |= 2
                                            else if (strcasecmp(__s1, "Fire Tyrant") == 0)
                                                r8_1 |= 4
                                            else if (strcasecmp(__s1, "Ravenous Gorph") == 0)
                                                r8_1 |= 8
                                            else if (strcasecmp(__s1, "Sordid Asp") == 0)
                                                r8_1 |= 0x10
                                            else if (strcasecmp(__s1, "Vaultbreaker Wurm") == 0)
                                                r8_1 |= 0x20
                                            
                                            i_1 = i_5
                                            i_5 -= 4
                                            r4_3 = &r4_3[1]
                                        while (i_1 != 4)
                                        
                                        if ((r8_1 & 0xff) == 0x3f)
                                            int32_t* r0_103 = data_1f5894
                                            
                                            if (r0_103 != 0
                                                    && &r0_103[6] u< data_1f5898 + data_1f589c)
                                                r0_103[1] = 0x25
                                                *r0_103 = 0x18
                                                data_1f5894 = &r0_103[6]
                                                data_1f5890 += 1
                                                r0_103[4] = 1
                                                r0_103[5] = 0
                                                r0_103[2] = 0x18
                            
                            if (var_34_1 != 0)
                                void* var_30_4 = var_34_1
                                operator delete(var_34_1)
            
            goto label_191f5c
        case 8
            if (r5 != 0)
                r5 = 1
            
            int32_t r2_88 = *__stack_chk_guard
            
            if (r2_88 == r0)
                return HandleEventHeroCardPutInPlay(arg2[2], arg2[3], r2_88 - r0, r5.b) __tailcall
        case 9, 0xa
            goto label_191f5c
        case 0xb
            if (r5 == 0 && arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)) && arg2[3] u>= 5)
                int32_t* r0_63 = data_1f5894
                
                if (r0_63 != 0 && &r0_63[6] u< data_1f5898 + data_1f589c)
                    r0_63[1] = 0x25
                    *r0_63 = 0x18
                    data_1f5894 = &r0_63[6]
                    data_1f5890 += 1
                    r0_63[4] = 1
                    r0_63[5] = 0
                    r0_63[2] = 0x1b
            
            goto label_191f5c
        case 0xc
            if (r5 == 0 && arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)) && arg2[3] u>= 0xa)
                int32_t* r0_110 = data_1f5894
                
                if (r0_110 != 0 && &r0_110[6] u< data_1f5898 + data_1f589c)
                    r0_110[1] = 0x25
                    *r0_110 = 0x18
                    data_1f5894 = &r0_110[6]
                    data_1f5890 += 1
                    r0_110[4] = 1
                    r0_110[5] = 0
                    r0_110[2] = 0x20
            
            goto label_191f5c
        case 0xd
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                int32_t r1_218 = *(s_localPlayerStats + 0xdc) + arg2[3]
                *(s_localPlayerStats + 0xdc) = r1_218
                
                if (r1_218 u>= 5 && r5 == 0)
                    int32_t* r0_146 = data_1f5894
                    
                    if (r0_146 != 0 && &r0_146[6] u< data_1f5898 + data_1f589c)
                        r0_146[1] = 0x25
                        *r0_146 = 0x18
                        data_1f5894 = &r0_146[6]
                        data_1f5890 += 1
                        r0_146[4] = 1
                        r0_146[5] = 0
                        r0_146[2] = 0x22
            
            goto label_191f5c
        case 0xe
            if (r5 == 0)
                int32_t* r0_134 = data_1f5894
                
                if (r0_134 != 0 && &r0_134[5] u< data_1f5898 + data_1f589c)
                    r0_134[1] = 0xc
                    *r0_134 = 0x14
                    data_1f5894 = &r0_134[5]
                    data_1f5890 += 1
                    r0_134[2] = arg2[2]
                    r0_134[3] = arg2[3]
                    r0_134[4] = arg2[4]
                
                if (arg2[3] != 0)
                    uint32_t r0_135 = *s_pWorldData
                    uint32_t r0_137
                    
                    if (r0_135 == 0)
                        r0_137 = 0
                    else
                        r0_137 = *(r0_135 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                    
                    void* r0_323 = core::CWorldBase::GetInstanceByID(r0_137)
                    
                    if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                        char* __s2_1 = *(r0_323 + 0xc) + 4
                        int32_t r0_333
                        
                        if (strcasecmp("Gemcatcher Spirit", __s2_1) == 0)
                            r0_333 = 0
                        label_19667c:
                            int32_t* r1_524 = data_1f5894
                            
                            if (r1_524 != 0 && &r1_524[6] u< data_1f5898 + data_1f589c)
                                r1_524[1] = 0x25
                                *r1_524 = 0x18
                                data_1f5894 = &r1_524[6]
                                data_1f5890 += 1
                                uint32_t r5_9 = 1 u>> (0x20 - r0_333)
                                int32_t r0_385 = 1 << r0_333
                                
                                if (r0_333 - 0x20 s>= 0)
                                    r0_385 = 0
                                    r5_9 = 1 << (r0_333 - 0x20)
                                
                                r1_524[4] = r0_385
                                r1_524[5] = r5_9
                                r1_524[2] = 0x24
                        else
                            if (strcasecmp("Toric, Devoted Disciple", __s2_1) == 0)
                                r0_333 = 1
                                goto label_19667c
                            
                            if (strcasecmp("Honiskrot Tribesman", __s2_1) == 0)
                                r0_333 = 2
                                goto label_19667c
                            
                            if (strcasecmp("Jakeb, Cobra Shaman", __s2_1) == 0)
                                r0_333 = 3
                                goto label_19667c
                            
                            if (strcasecmp("Scrap Scrabbler", __s2_1) == 0)
                                r0_333 = 4
                                goto label_19667c
                            
                            if (strcasecmp("Yolothian Monolith", __s2_1) == 0)
                                r0_333 = 5
                                goto label_19667c
                            
                            if (strcasecmp("Voidsworn Warrior", __s2_1) == 0)
                                r0_333 = 6
                                goto label_19667c
                            
                            if (strcasecmp("Azerax of the Black Watch", __s2_1) == 0)
                                r0_333 = 7
                                goto label_19667c
                            
                            if (strcasecmp("Erabus, the Exiled", __s2_1) == 0)
                                r0_333 = 8
                                goto label_19667c
                        int32_t r0_391
                        
                        if (strcasecmp("Dhartha's Trial", __s2_1) == 0)
                            r0_391 = 0
                        label_1967dc:
                            int32_t* r1_530 = data_1f5894
                            
                            if (r1_530 != 0 && &r1_530[6] u< data_1f5898 + data_1f589c)
                                r1_530[1] = 0x25
                                *r1_530 = 0x18
                                data_1f5894 = &r1_530[6]
                                data_1f5890 += 1
                                uint32_t r5_10 = 1 u>> (0x20 - r0_391)
                                int32_t r0_392 = 1 << r0_391
                                
                                if (r0_391 - 0x20 s>= 0)
                                    r0_392 = 0
                                    r5_10 = 1 << (r0_391 - 0x20)
                                
                                r1_530[4] = r0_392
                                r1_530[5] = r5_10
                                r1_530[2] = 0x3d
                        else
                            if (strcasecmp("Cetra's Trial", __s2_1) == 0)
                                r0_391 = 1
                                goto label_1967dc
                            
                            if (strcasecmp("Reysa's Trial", __s2_1) == 0)
                                r0_391 = 2
                                goto label_1967dc
                            
                            if (strcasecmp("Emri's Trial", __s2_1) == 0)
                                r0_391 = 3
                                goto label_1967dc
                            
                            if (strcasecmp("Xeron's Trial", __s2_1) == 0)
                                r0_391 = 4
                                goto label_1967dc
                        int32_t r0_400
                        
                        if (strcasecmp("Psyonic Apprentice", __s2_1) == 0)
                            r0_400 = 0
                        label_196960:
                            int32_t* r1_538 = data_1f5894
                            
                            if (r1_538 != 0 && &r1_538[6] u< data_1f5898 + data_1f589c)
                                r1_538[1] = 0x25
                                *r1_538 = 0x18
                                data_1f5894 = &r1_538[6]
                                int32_t r4_9 = 1 << r0_400
                                data_1f5890 += 1
                                uint32_t r5_11 = 1 u>> (0x20 - r0_400)
                                
                                if (r0_400 - 0x20 s>= 0)
                                    r5_11 = 1 << (r0_400 - 0x20)
                                    r4_9 = 0
                                
                                *(r1_538 + 0x10) = r5_11:r4_9
                                r1_538[2] = 0x4d
                        else
                            if (strcasecmp("Lychan Ranger", __s2_1) == 0)
                                r0_400 = 1
                                goto label_196960
                            
                            if (strcasecmp("Teletransmitter Blueprint", __s2_1) == 0)
                                r0_400 = 2
                                goto label_196960
                            
                            if (strcasecmp("Mechannon Blueprint", __s2_1) == 0)
                                r0_400 = 3
                                goto label_196960
                            
                            if (strcasecmp("Voidcycler Blueprint", __s2_1) == 0)
                                r0_400 = 4
                                goto label_196960
                            
                            if (strcasecmp("Ironheart Blueprint", __s2_1) == 0)
                                r0_400 = 5
                                goto label_196960
                            
                            if (strcasecmp("Demon Hunter", __s2_1) == 0)
                                r0_400 = 6
                                goto label_196960
            
            goto label_191f5c
        case 0xf
            if (r5 == 0 && arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                uint32_t r0_66 = *s_pWorldData
                uint32_t r0_68
                
                if (r0_66 == 0)
                    r0_68 = 0
                else
                    r0_68 = *(r0_66 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                arg2[3]
                
                if (strcasecmp(*(core::CWorldBase::GetInstanceByID(r0_68) + 0xc) + 4, 
                        "Yolocryx, the Guardian") == 0)
                    int32_t* r0_345 = data_1f5894
                    
                    if (r0_345 != 0 && &r0_345[6] u< data_1f5898 + data_1f589c)
                        r0_345[1] = 0x25
                        *r0_345 = 0x18
                        data_1f5894 = &r0_345[6]
                        data_1f5890 += 1
                        r0_345[4] = 1
                        r0_345[5] = 0
                        r0_345[2] = 0x25
            
            goto label_191f5c
        case 0x10
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                int32_t r1_228 = *(s_localPlayerStats + 4) + arg2[3]
                *(s_localPlayerStats + 4) = r1_228
                
                if (r1_228 u>= 0x14 && r5 == 0)
                    int32_t* r0_155 = data_1f5894
                    
                    if (r0_155 != 0 && &r0_155[6] u< data_1f5898 + data_1f589c)
                        r0_155[1] = 0x25
                        *r0_155 = 0x18
                        data_1f5894 = &r0_155[6]
                        data_1f5890 += 1
                        r0_155[4] = 1
                        r0_155[5] = 0
                        r0_155[2] = 0x27
            
            goto label_191f5c
        case 0x11
            if (r5 != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 0x14
            *r0_17 = 0x14
            data_1f5894 = &r0_17[5]
            data_1f5890 += 1
            r1_44 = arg2[2]
            r2_17 = 7
            goto label_196620
        case 0x12
            if (r5 != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 0x14
            *r0_17 = 0x14
            data_1f5894 = &r0_17[5]
            data_1f5890 += 1
            r1_44 = arg2[2]
            r2_17 = 8
            goto label_196620
        case 0x13
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                uint32_t r0_164 = *s_pWorldData
                ascension::CPlayer* r7_5
                
                if (r0_164 == 0)
                    r7_5 = nullptr
                else
                    r7_5 = *(r0_164 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                core::CCardInstance* r0_269 = core::CWorldBase::GetInstanceByID(r7_5)
                arg2[3]
                void* r0_271 = core::CWorldBase::GetInstanceByID(r7_5)
                
                if (strcasecmp("Adayu the Serene", *(r0_271 + 0xc) + 4) == 0)
                    arg2[4]
                    void* r0_274 = core::CWorldBase::GetInstanceByID(r7_5)
                    *(s_localPlayerStats + 0xc) |= *(*(r0_274 + 0xc) + 0x8c)
                    int32_t r0_279 = ascension::CWorld::QueryCardFaction(r7_5, r0_269, r0_274)
                    bool cond:15_1 = r0_279 != 0
                    
                    if (r0_279 != 0)
                        r0_279 = *(s_localPlayerStats + 0xc)
                    
                    if (cond:15_1)
                        *(s_localPlayerStats + 0xc) = r0_279 | 2
                    
                    int32_t r0_282 = ascension::CWorld::QueryCardFaction(r7_5, r0_269, r0_274)
                    bool cond:17_1 = r0_282 != 0
                    
                    if (r0_282 != 0)
                        r0_282 = *(s_localPlayerStats + 0xc)
                    
                    if (cond:17_1)
                        *(s_localPlayerStats + 0xc) = r0_282 | 4
                    
                    int32_t r0_285 = ascension::CWorld::QueryCardFaction(r7_5, r0_269, r0_274)
                    bool cond:19_1 = r0_285 != 0
                    
                    if (r0_285 != 0)
                        r0_285 = *(s_localPlayerStats + 0xc)
                    
                    if (cond:19_1)
                        *(s_localPlayerStats + 0xc) = r0_285 | 8
                    
                    if (ascension::CWorld::QueryCardFaction(r7_5, r0_269, r0_274) != 0)
                        *(s_localPlayerStats + 0xc) |= 0x10
                    
                    if (r5 == 0)
                        uint32_t i_2 = zx.d(*(s_localPlayerStats + 0xc))
                        
                        if (i_2 != 0)
                            int32_t r2_202 = 4
                            
                            do
                                r2_202 -= 1
                                i_2 &= i_2 - 1
                            while (i_2 != 0)
                            
                            if (r2_202 == 0)
                                int32_t* r0_346 = data_1f5894
                                
                                if (r0_346 != 0 && &r0_346[6] u< data_1f5898 + data_1f589c)
                                    r0_346[1] = 0x25
                                    *r0_346 = 0x18
                                    data_1f5894 = &r0_346[6]
                                    data_1f5890 += 1
                                    r0_346[4] = 1
                                    r0_346[5] = 0
                                    r0_346[2] = 0x28
                
                uint32_t r1_390 = zx.d(*(s_localPlayerStats + 0xd8))
                uint32_t r2_171
                
                if (r1_390 == 0)
                    r2_171 = 0
                label_1952f0:
                    void* r2_172 = s_localPlayerStats + (r2_171 << 3)
                    *(r2_172 + 0x10) = zx.d(*(r0_271 + 8))
                    *(s_localPlayerStats + 0xd8) = r1_390.w + 1
                    *(r2_172 + 0x14) = 1
                else
                    int32_t (* r3_35)() = s_localPlayerStats + 0x14
                    r2_171 = r1_390
                    int32_t r6_10 = 0
                    
                    do
                        if (*(r3_35 - 4) == zx.d(*(r0_271 + 8)))
                            int16_t r0_298 = *r3_35 + 1
                            *r3_35 = r0_298
                            
                            if (zx.d(r0_298) u>= 3 && r5 == 0)
                                int32_t* r0_300 = data_1f5894
                                
                                if (r0_300 != 0 && &r0_300[6] u< data_1f5898 + data_1f589c)
                                    r0_300[1] = 0x25
                                    *r0_300 = 0x18
                                    data_1f5894 = &r0_300[6]
                                    data_1f5890 += 1
                                    r0_300[4] = 1
                                    r0_300[5] = 0
                                    r0_300[2] = 0x2c
                            
                            goto label_191f5c
                        
                        r6_10 += 1
                        r3_35 += 8
                    while (r6_10 u< r1_390)
                    
                    if (r1_390 u<= 0x17)
                        goto label_1952f0
            
            goto label_191f5c
        case 0x14
            if (r5 == 0 && arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                uint32_t r0_48 = *s_pWorldData
                uint32_t r5_2
                
                if (r0_48 == 0)
                    r5_2 = 0
                else
                    r5_2 = *(r0_48 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                arg2[3]
                void* r0_335 = core::CWorldBase::GetInstanceByID(r5_2)
                arg2[4]
                
                if (strcasecmp("Canon Templar", 
                        *(core::CWorldBase::GetInstanceByID(r5_2) + 0xc) + 4) == 0
                        && strcasecmp("Adayu the Tormented", *(r0_335 + 0xc) + 4) == 0)
                    int32_t* r0_340 = data_1f5894
                    
                    if (r0_340 != 0 && &r0_340[6] u< data_1f5898 + data_1f589c)
                        r0_340[1] = 0x25
                        *r0_340 = 0x18
                        data_1f5894 = &r0_340[6]
                        data_1f5890 += 1
                        r0_340[4] = 1
                        r0_340[5] = 0
                        r0_340[2] = 0x2b
            
            goto label_191f5c
        case 0x15
            if (r5 == 0)
                int32_t* r1_190 = data_1f5894
                int32_t* r0_130
                
                if (r1_190 == 0)
                    r0_130 = nullptr
                else
                    r0_130 = &r1_190[5]
                    
                    if (r0_130 u>= data_1f5898 + data_1f589c)
                        r0_130 = r1_190
                    else
                        r1_190[1] = 0x14
                        *r1_190 = 0x14
                        data_1f5894 = r0_130
                        data_1f5890 += 1
                        int32_t r2_97 = arg2[2]
                        r1_190[3] = 6
                        r1_190[2] = r2_97
                        r1_190[4] = arg2[3]
                
                if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)) && r0_130 != 0
                        && &r0_130[6] u< data_1f5898 + data_1f589c)
                    r0_130[1] = 0x25
                    *r0_130 = 0x18
                    data_1f5894 = &r0_130[6]
                    data_1f5890 += 1
                    r0_130[2] = 0x2d
                    *(r0_130 + 0x10) = 0:(arg2[4])
            
            goto label_191f5c
        case 0x16
            if (r5 != 0)
                goto label_191f5c
            
            r0_38 = data_1f5894
            
            if (r0_38 == 0 || &r0_38[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_38[1] = 0x14
            *r0_38 = 0x14
            data_1f5894 = &r0_38[5]
            data_1f5890 += 1
            r1_88 = arg2[2]
            r2_37 = 3
        label_193598:
            r0_38[3] = r2_37
            r0_38[2] = r1_88
            r0_38[4] = 0
            goto label_191f5c
        case 0x17
            if (r5 != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 0x14
            *r0_17 = 0x14
            data_1f5894 = &r0_17[5]
            data_1f5890 += 1
            r1_44 = arg2[2]
            r2_17 = 4
            goto label_196620
        case 0x18
            if (r5 != 0)
                goto label_191f5c
            
            r0_38 = data_1f5894
            
            if (r0_38 == 0 || &r0_38[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_38[1] = 0x14
            *r0_38 = 0x14
            data_1f5894 = &r0_38[5]
            data_1f5890 += 1
            r1_88 = arg2[2]
            r2_37 = 2
            goto label_193598
        case 0x19
            if (r5 != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 0x14
            *r0_17 = 0x14
            data_1f5894 = &r0_17[5]
            data_1f5890 += 1
            r1_44 = arg2[2]
            r2_17 = 5
            goto label_196620
        case 0x1a
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                uint32_t r0_141 = *s_pWorldData
                uint32_t r0_143
                
                if (r0_141 == 0)
                    r0_143 = 0
                else
                    r0_143 = *(r0_141 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                arg2[3]
                ascension::CCard* r6_8 = *(core::CWorldBase::GetInstanceByID(r0_143) + 0xc)
                
                if (r5 == 0)
                    ProcessAquireDefeatAllAchievement(r6_8)
                
                if (arg2[4] == 0)
                    int32_t r0_265 = 0
                    
                    if (*(r6_8 + 0x88) == 9)
                        uint32_t r2_163 = zx.d(*(s_localPlayerStats + 0xda))
                        
                        if (r5 != 0 || (r2_163 & 0x20) == 0)
                            *(s_localPlayerStats + 0xda) = r2_163.b | 0x20
                        else
                            int32_t* r1_380 = data_1f5894
                            
                            if (r1_380 != 0 && &r1_380[6] u< data_1f5898 + data_1f589c)
                                r1_380[1] = 0x25
                                *r1_380 = 0x18
                                data_1f5894 = &r1_380[6]
                                data_1f5890 += 1
                                *(r1_380 + 0x10) = 0:1
                                r1_380[2] = 0x33
                                r0_265 = arg2[4]
                                
                                if (r0_265 != 0)
                                    r0_265 = 1
                    
                    if (r5 == 0 && r0_265 == 0 && strcasecmp("Pasythea, the Aegis", r6_8 + 4) == 0
                            && ascension::CPlayer::HasConstructInPlay(*(s_InterfaceContext + 0xc))
                            != 0)
                        int32_t* r0_350 = data_1f5894
                        
                        if (r0_350 != 0 && &r0_350[6] u< data_1f5898 + data_1f589c)
                            r0_350[1] = 0x25
                            *r0_350 = 0x18
                            data_1f5894 = &r0_350[6]
                            data_1f5890 += 1
                            r0_350[4] = 1
                            r0_350[5] = 0
                            r0_350[2] = 0x35
            
            goto label_191f5c
        case 0x1b
            if (r5 == 0)
                uint32_t r0_51 = *s_pWorldData
                uint32_t r0_53
                
                if (r0_51 == 0)
                    r0_53 = 0
                else
                    r0_53 = *(r0_51 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                arg2[3]
                int32_t r0_308 = core::CWorldBase::GetInstanceByID(r0_53)
                
                if (r0_308 != 0)
                    void* r0_309 = __dynamic_cast(r0_308, _typeinfo_for_core::CInstance, 
                        _typeinfo_for_core::CCardInstance, 0)
                    
                    if (r0_309 != 0 && *(*(r0_309 + 0xc) + 0x88) != 3 && arg2[4] u>= 0x14)
                        int32_t* r0_313 = data_1f5894
                        
                        if (r0_313 != 0 && &r0_313[6] u< data_1f5898 + data_1f589c)
                            r0_313[1] = 0x25
                            *r0_313 = 0x18
                            data_1f5894 = &r0_313[6]
                            data_1f5890 += 1
                            r0_313[4] = 1
                            r0_313[5] = 0
                            r0_313[2] = 0x37
            
            goto label_191f5c
        case 0x1c
            if (r5 == 0)
                int32_t* r0_37 = data_1f5894
                
                if (r0_37 != 0 && &r0_37[3] u< data_1f5898 + data_1f589c)
                    *r0_37 = 0xc
                    r0_37[1] = 0xb
                    data_1f5894 = &r0_37[3]
                    void* r2_34 = *(s_InterfaceContext + 0xc)
                    data_1f5890 += 1
                    int32_t r1_83
                    
                    if (r2_34 != 0)
                        r1_83 = *(r2_34 + 0xc)
                    else
                        r1_83 = 0
                    
                    r0_37[2] = r1_83
            
            goto label_191f5c
        case 0x1d
            if (r5 == 0)
                int32_t* r0_220 = data_1f5894
                
                if (r0_220 != 0 && &r0_220[5] u< data_1f5898 + data_1f589c)
                    r0_220[1] = 0x14
                    *r0_220 = 0x14
                    data_1f5894 = &r0_220[5]
                    data_1f5890 += 1
                    int32_t r1_306 = arg2[2]
                    r0_220[3] = 0
                    r0_220[2] = r1_306
                    r0_220[4] = arg2[3]
            
            if (arg2[2] != zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                goto label_191f5c
            
            int32_t r1_70 = *(s_localPlayerStats + 0xc)
            
            if (r5 != 0 || (r1_70 & 0x200) == 0)
                *(s_localPlayerStats + 0xc) = r1_70 | 0x100
                goto label_191f5c
            
            r0_33 = data_1f5894
            
            if (r0_33 == 0)
                goto label_191f5c
            
            r1_71 = data_1f589c
            r2_28 = data_1f5898
        label_192c88:
            
            if (&r0_33[6] u>= r2_28 + r1_71)
                goto label_191f5c
            
            r0_33[1] = 0x25
            *r0_33 = 0x18
            data_1f5894 = &r0_33[6]
            data_1f5890 += 1
            r0_33[4] = 1
            r0_33[5] = 0
            r0_33[2] = 0x38
            goto label_191f5c
        case 0x1e
            if (r5 == 0)
                int32_t* r0_221 = data_1f5894
                
                if (r0_221 != 0 && &r0_221[5] u< data_1f5898 + data_1f589c)
                    r0_221[1] = 0x14
                    *r0_221 = 0x14
                    data_1f5894 = &r0_221[5]
                    data_1f5890 += 1
                    int32_t r1_312 = arg2[2]
                    r0_221[3] = 1
                    r0_221[2] = r1_312
                    r0_221[4] = arg2[3]
            
            if (arg2[2] != zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                goto label_191f5c
            
            int32_t r1_116 = *(s_localPlayerStats + 0xc)
            
            if (r5 != 0 || (r1_116 & 0x100) == 0)
                *(s_localPlayerStats + 0xc) = r1_116 | 0x200
                goto label_191f5c
            
            r0_33 = data_1f5894
            
            if (r0_33 == 0)
                goto label_191f5c
            
            r1_71 = data_1f589c
            r2_28 = data_1f5898
            goto label_192c88
        case 0x1f
            if (r5 != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 0x14
            *r0_17 = 0x14
            data_1f5894 = &r0_17[5]
            data_1f5890 += 1
            r1_44 = arg2[2]
            r2_17 = 9
            goto label_196620
        case 0x20
            if (r5 != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[6] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 5
            *r0_17 = 0x18
            data_1f5894 = &r0_17[6]
            data_1f5890 += 1
            r0_17[2] = arg2[2]
            r0_17[3] = arg2[4]
        label_19662c:
            r0_17[4] = arg2[3]
            goto label_191f5c
        case 0x21
            if (r5 == 0)
                int32_t* r0_71 = data_1f5894
                
                if (r0_71 != 0 && &r0_71[4] u< data_1f5898 + data_1f589c)
                    r0_71[1] = 0xf
                    *r0_71 = 0x10
                    data_1f5894 = &r0_71[4]
                    data_1f5890 += 1
                    r0_71[2] = arg2[2]
                    r0_71[3] = arg2[4]
            
            goto label_191f5c
        case 0x22
            int32_t* r0_29
            
            if (r5 == 0)
                r0_29 = data_1f5894
                
                if (r0_29 != 0 && &r0_29[3] u< data_1f5898 + data_1f589c)
                    r0_29[1] = 0x18
                    *r0_29 = 0xc
                    data_1f5894 = &r0_29[3]
                    data_1f5890 += 1
                    r0_29[2] = 1
            else
                void* r0_27 = *s_pWorldData + *(s_InterfaceContext + 0x10) * 0x34
                *s_bShowLoadingOverlay = 0
                *(*(r0_27 + 0x124) + 0x10) = 0
                r0_29 = data_1f5894
                
                if (r0_29 != 0 && &r0_29[3] u< data_1f5898 + data_1f589c)
                    r0_29[1] = 0x23
                    *r0_29 = 0xc
                    data_1f5894 = &r0_29[3]
                    data_1f5890 += 1
                    r0_29[2] = 0x40000000
            data_1f4e48 = 1
            goto label_191f5c
        case 0x23
            if (r5 != 0)
                r5 = 1
            
            int32_t r2_42 = *__stack_chk_guard
            
            if (r2_42 == r0)
                return HandleEventContructPutInPlay(arg2[2], arg2[3], r2_42 - r0, r5.b) __tailcall
        case 0x24
            if (r5 == 0)
                int32_t* r5_6 = data_1f5894
                
                if (r5_6 != 0 && &r5_6[6] u< data_1f5898 + data_1f589c)
                    *r5_6 = 0x18
                    r5_6[1] = 0x10
                    data_1f5894 = &r5_6[6]
                    uint32_t r1_225 = *s_pWorldData
                    data_1f5890 += 1
                    uint32_t r6_4
                    
                    if (r1_225 == 0)
                        r6_4 = 0
                    else
                        r6_4 = *(r1_225 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                    
                    arg2[3]
                    void* r0_356 = core::CWorldBase::GetInstanceByID(r6_4)
                    arg2[2]
                    core::CCardInstance** r7_8 = *(r0_356 + 0xc)
                    ascension::CCard* r0_358 = core::CWorldBase::GetInstanceByID(r6_4)
                    r5_6[2] = arg2[2]
                    r5_6[3] = arg2[3]
                    
                    if (r7_8[0x23] == 0)
                        r5_6[4] = r7_8[0x21]
                        r5_6[5] = ascension::CPlayer::CountOwnedCards(r0_358, r7_8)
                    else
                        r5_6[4] = 0
                        r5_6[5] = 1
            
            goto label_191f5c
        case 0x25
            if (r5 == 0)
                int32_t* r5_7 = data_1f5894
                
                if (r5_7 != 0 && &r5_7[7] u< data_1f5898 + data_1f589c)
                    *r5_7 = 0x1c
                    r5_7[1] = 0x11
                    data_1f5894 = &r5_7[7]
                    uint32_t r1_279 = *s_pWorldData
                    data_1f5890 += 1
                    uint32_t r6_5
                    
                    if (r1_279 == 0)
                        r6_5 = 0
                    else
                        r6_5 = *(r1_279 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                    
                    arg2[3]
                    void* r0_361 = core::CWorldBase::GetInstanceByID(r6_5)
                    arg2[2]
                    core::CCardInstance** r7_9 = *(r0_361 + 0xc)
                    ascension::CCard* r0_363 = core::CWorldBase::GetInstanceByID(r6_5)
                    r5_7[2] = arg2[2]
                    r5_7[3] = arg2[3]
                    
                    if (r7_9[0x23] == 0)
                        r5_7[4] = r7_9[0x21]
                        r5_7[5] = ascension::CPlayer::CountOwnedCards(r0_363, r7_9)
                        r5_7[6] = 0
                    else
                        r5_7[4] = 0
                        r5_7[5] = 0
                        r5_7[6] = 0
            
            goto label_191f5c
        case 0x26
            if (r5 != 0)
                goto label_191f5c
            
            r0_36 = data_1f5894
            
            if (r0_36 == 0 || &r0_36[4] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_36[1] = 6
            *r0_36 = 0x10
            data_1f5894 = &r0_36[4]
            r1_78 = data_1f5890
        label_1943a8:
            data_1f5890 = r1_78 + 1
            r0_36[2] = arg2[2]
            r0_36[3] = arg2[3]
        label_191f5c:
            int32_t r0_4 = *__stack_chk_guard
            
            if (r0_4 == r0)
                return r0_4 - r0
        case 0x27
            uint32_t r0_131 = *s_pWorldData
            uint32_t r0_133
            
            if (r0_131 == 0)
                r0_133 = 0
            else
                r0_133 = *(r0_131 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
            
            if (arg2[2] != zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                goto label_191f5c
            
            arg2[3]
            int32_t r0_230 = core::CWorldBase::GetInstanceByID(r0_133)
            
            if (r0_230 == 0)
                goto label_191f5c
            
            void* r0_231 = __dynamic_cast(r0_230, _typeinfo_for_core::CInstance, 
                _typeinfo_for_ascension::CConstructAbilityInstance, 0)
            
            if (r0_231 == 0)
                goto label_191f5c
            
            if (strcasecmp(*(*(*(r0_231 + 0xc) + 0x10) + 0xc) + 4, "P.R.I.M.E. Directive") != 0)
                goto label_191f5c
            
            *(s_localPlayerStats + 0xf5) = 1
            
            if (r5 != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 0x14
            *r0_17 = 0x14
            data_1f5894 = &r0_17[5]
            data_1f5890 += 1
            r1_44 = arg2[2]
            r2_17 = 0xe
            goto label_196620
        case 0x28
            uint32_t r1_72 = zx.d(*(*(s_InterfaceContext + 0xc) + 8))
            
            if (arg2[2] == r1_72)
                int32_t r0_35 = arg2[3]
                
                if (r0_35 != r1_72)
                    int32_t r1_73 = *(s_localPlayerStats + 0x100)
                    int32_t r10_1
                    
                    if (r1_73 == 0)
                        r10_1 = 0
                        *(s_localPlayerStats + 0x100) = r0_35
                    else
                        r10_1 = 0
                        
                        if (r1_73 != r0_35)
                            int32_t r1_74 = *(s_localPlayerStats + 0x108)
                            
                            if (r1_74 == 0)
                                *(s_localPlayerStats + 0x108) = r0_35
                                r10_1 = 1
                            else
                                r10_1 = 1
                                
                                if (r1_74 != r0_35)
                                    int32_t r1_75 = *(s_localPlayerStats + 0x110)
                                    
                                    if (r1_75 == 0)
                                        *(s_localPlayerStats + 0x110) = r0_35
                                        r10_1 = 2
                                    else
                                        r10_1 = 0xffffffff
                                        
                                        if (r1_75 == r0_35)
                                            r10_1 = 2
                    
                    char r6_12 = 0
                    uint32_t r1_506 = *s_pWorldData
                    uint32_t r0_376 = 0
                    
                    if (r1_506 != 0)
                        r0_376 = r1_506 + *(s_InterfaceContext + 0x10) * 0x34
                    
                    arg2[4]
                    
                    if (r1_506 != 0)
                        r0_376 = *(r0_376 + 0x124)
                    
                    char* __s2_2 = *(core::CWorldBase::GetInstanceByID(r0_376) + 0xc) + 4
                    
                    if (strcasecmp("Nom Tribe Gremlin", __s2_2) == 0)
                        goto label_196420
                    
                    if (strcasecmp("Yuk Tribe Gremlin", __s2_2) == 0)
                        r6_12 = 1
                    label_196420:
                        int16_t i_4 =
                            *(s_localPlayerStats + (r10_1 << 3) + 0x104) | (1 << zx.d(r6_12)).w
                        *(s_localPlayerStats + (r10_1 << 3) + 0x104) = i_4
                        
                        if (r5 == 0 && zx.d(i_4) != 0)
                            uint32_t i_3 = zx.d(i_4)
                            int32_t r0_383 = 0
                            
                            do
                                r0_383 += 1
                                i_3 &= i_3 - 1
                            while (i_3 != 0)
                            
                            if (r0_383 u>= 3)
                                int32_t* r0_384 = data_1f5894
                                
                                if (r0_384 != 0 && &r0_384[6] u< data_1f5898 + data_1f589c)
                                    r0_384[1] = 0x25
                                    *r0_384 = 0x18
                                    data_1f5894 = &r0_384[6]
                                    data_1f5890 += 1
                                    r0_384[4] = 1
                                    r0_384[5] = 0
                                    r0_384[2] = 0x40
                    else if (strcasecmp("Bam Tribe Gremlins", __s2_2) == 0)
                        r6_12 = 2
                        goto label_196420
            
            goto label_191f5c
        case 0x29
            if (r5 == 0)
                int32_t* r0_30 = data_1f5894
                
                if (r0_30 != 0 && &r0_30[4] u< data_1f5898 + data_1f589c)
                    *r0_30 = 0x10
                    r0_30[1] = 0x2a
                    data_1f5894 = &r0_30[4]
                    void* r2_26 = *(s_InterfaceContext + 0xc)
                    data_1f5890 += 1
                    int32_t r1_67
                    
                    if (r2_26 != 0)
                        r1_67 = *(r2_26 + 0xc)
                    else
                        r1_67 = 0
                    
                    r0_30[2] = r1_67
                    r0_30[3] = arg2[3]
            
            goto label_191f5c
        case 0x2a
            if (r5 != 0)
                goto label_191f5c
            
            r0_50 = data_1f5894
            
            if (r0_50 == 0 || &r0_50[6] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_50[1] = 0xd
            *r0_50 = 0x18
            data_1f5894 = &r0_50[6]
            data_1f5890 += 1
            int32_t r2_49 = arg2[2]
            int32_t r1_111 = arg2[3]
            r0_50[3] = r1_111
            r0_50[2] = r2_49
            
            if (r2_49 == 0)
            label_19629c:
                r1_498 = 0
                r0_50[4] = 0
            label_1962a4:
                r0_50[5] = r1_498
                goto label_191f5c
            
            uint32_t r2_50 = *s_pWorldData
            void* const r2_52
            
            if (r2_50 == 0)
                r2_52 = nullptr
                
                if (r1_111 s< 0)
                    goto label_19629c
            else
                r2_52 = *(r2_50 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                if (r1_111 s< 0)
                    goto label_19629c
            
            int32_t r3_48 = *(r2_52 + 0xb80)
            
            if (r1_111 s>= (*(r2_52 + 0xb84) - r3_48) s>> 3)
                goto label_19629c
            
            int32_t* r3_49 = r3_48 + (r1_111 << 3)
            r0_50[4] = zx.d(*(*r3_49 + 8))
            r1_498 = r3_49[1]
            goto label_1962a4
        case 0x2b
            if (r5 != 0)
                goto label_191f5c
            
            r0_50 = data_1f5894
            
            if (r0_50 == 0 || &r0_50[6] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_50[1] = 0xe
            *r0_50 = 0x18
            data_1f5894 = &r0_50[6]
            data_1f5890 += 1
            int32_t r2_82 = arg2[2]
            int32_t r1_167 = arg2[3]
            r0_50[3] = r1_167
            r0_50[2] = r2_82
            
            if (r2_82 == 0)
                goto label_19629c
            
            uint32_t r2_83 = *s_pWorldData
            void* const r2_85
            
            if (r2_83 == 0)
                r2_85 = nullptr
                
                if (r1_167 s< 0)
                    goto label_19629c
            else
                r2_85 = *(r2_83 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                if (r1_167 s< 0)
                    goto label_19629c
            
            int32_t r3_50 = *(r2_85 + 0xbd8)
            
            if (r1_167 s>= (*(r2_85 + 0xbdc) - r3_50) s>> 3)
                goto label_19629c
            
            int32_t* r3_51 = r3_50 + (r1_167 << 3)
            uint32_t r2_224 = zx.d(*(*r3_51 + 8))
            r0_50[4] = r2_224
            r1_498 = r3_51[1]
            
            if (r1_498 == 9)
                r0_50[4] = 0x5000 + r2_224
            else if (r1_498 == 0xc)
                r0_50[4] = 0x6000 + r2_224
            
            goto label_1962a4
        case 0x2c
            if (r5 != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 0x14
            *r0_17 = 0x14
            data_1f5894 = &r0_17[5]
            data_1f5890 += 1
            r1_44 = arg2[2]
            r2_17 = 0xa
            goto label_196620
        case 0x2d
            if (r5 != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 0x14
            *r0_17 = 0x14
            data_1f5894 = &r0_17[5]
            data_1f5890 += 1
            r1_44 = arg2[2]
            r2_17 = 0xb
        label_196620:
            r0_17[3] = r2_17
            r0_17[2] = r1_44
            goto label_19662c
        case 0x2e
            if (r5 != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 0x14
            *r0_17 = 0x14
            data_1f5894 = &r0_17[5]
            data_1f5890 += 1
            r1_44 = arg2[2]
            r2_17 = 0xc
            goto label_196620
        case 0x2f
            if (r5 != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 0x14
            *r0_17 = 0x14
            data_1f5894 = &r0_17[5]
            data_1f5890 += 1
            r1_44 = arg2[2]
            r2_17 = 0xd
            goto label_196620
        case 0x30
            if (r5 != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 0x14
            *r0_17 = 0x14
            data_1f5894 = &r0_17[5]
            data_1f5890 += 1
            r1_44 = arg2[2]
            r2_17 = 0xf
            goto label_196620
        case 0x31
            if (r5 != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 0x14
            *r0_17 = 0x14
            data_1f5894 = &r0_17[5]
            data_1f5890 += 1
            r1_44 = arg2[2]
            r2_17 = 0x10
            goto label_196620
        case 0x32
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                uint32_t r0_120 = *s_pWorldData
                uint32_t r0_122
                
                if (r0_120 == 0)
                    r0_122 = 0
                else
                    r0_122 = *(r0_120 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                arg2[3]
                char* __s2 = *(core::CWorldBase::GetInstanceByID(r0_122) + 0xc) + 4
                char r6_7 = 4
                
                if (strcasecmp("Hedron Cannon", __s2) == 0)
                    *(s_localPlayerStats + 0xda) |= r6_7
                else if (strcasecmp("Hedron Cannon 10TH", __s2) == 0)
                    *(s_localPlayerStats + 0xda) |= r6_7
                else if (strcasecmp("Plasma Cannon", __s2) == 0)
                    *(s_localPlayerStats + 0xda) |= 8
                
                if (r5 == 0 && (zx.d(*(s_localPlayerStats + 0xda)) & 0x1c) == 0x1c)
                    int32_t* r0_261 = data_1f5894
                    
                    if (r0_261 != 0 && &r0_261[6] u< data_1f5898 + data_1f589c)
                        r0_261[1] = 0x25
                        *r0_261 = 0x18
                        data_1f5894 = &r0_261[6]
                        data_1f5890 += 1
                        r0_261[4] = 1
                        r0_261[5] = 0
                        r0_261[2] = 0x30
            
            goto label_191f5c
        case 0x33
            if (r5 == 0)
                uint32_t r0_23 = *s_pWorldData
                
                if (*(r0_23 + 0xf8) == 2)
                    int32_t* r5_1 = data_1f5894
                    
                    if (r5_1 != 0 && &r5_1[4] u< data_1f5898 + data_1f589c)
                        r5_1[1] = 0x27
                        *r5_1 = 0x10
                        data_1f5894 = &r5_1[4]
                        data_1f5890 += 1
                        int32_t r4_1 = arg2[2]
                        r5_1[2] = r4_1
                        int32_t r0_25
                        
                        if (r0_23 == 0)
                            r0_25 = 0
                        else
                            r0_25 = *(r0_23 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                        
                        void* r1_500 = *(r0_25 + 0xb24)
                        int32_t r0_375
                        
                        if ((r1_500 == 0 || *(r1_500 + 0xc) != r4_1) && *(r0_25 + 0xb0c) s<= 0)
                            *(r0_25 + 0x1c) - *(r0_25 + 0x18)
                            r0_375 = *(ascension::CWorld::GetPlayer(r0_25) + 0xc)
                        
                        if ((r1_500 == 0 || *(r1_500 + 0xc) != r4_1)
                                && (*(r0_25 + 0xb0c) s> 0 || r0_375 != r4_1))
                            r5_1[3] = 1
                        else
                            r5_1[3] = 0
            
            goto label_191f5c
        case 0x34
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                *(s_localPlayerStats + 0xf7) = 0
            
            goto label_191f5c
        case 0x35
            if (r5 == 0)
                int32_t* r0_238 = data_1f5894
                
                if (r0_238 != 0 && &r0_238[5] u< data_1f5898 + data_1f589c)
                    int32_t r1_339 = 0x14
                    *r0_238 = 0x14
                    r0_238[1] = 0x14
                    data_1f5894 = &r0_238[5]
                    data_1f5890 += 1
                    
                    if (arg2[3] != 1)
                        r1_339 = 0x15
                    
                    r0_238[3] = r1_339
            
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                uint32_t r1_291 = zx.d(*(s_localPlayerStats + 0xf6)) | zx.d(arg2[3].b)
                *(s_localPlayerStats + 0xf6) = r1_291.b
                
                if ((r1_291 & 3) == 3 && r5 == 0)
                    int32_t* r0_214 = data_1f5894
                    
                    if (r0_214 != 0 && &r0_214[6] u< data_1f5898 + data_1f589c)
                        r0_214[1] = 0x25
                        *r0_214 = 0x18
                        data_1f5894 = &r0_214[6]
                        data_1f5890 += 1
                        r0_214[4] = 1
                        r0_214[5] = 0
                        r0_214[2] = 0x42
            
            goto label_191f5c
        case 0x36
            if (r5 == 0)
                int32_t* r0_237 = data_1f5894
                
                if (r0_237 != 0 && &r0_237[5] u< data_1f5898 + data_1f589c)
                    *r0_237 = 0x14
                    r0_237[1] = 0x14
                    data_1f5894 = &r0_237[5]
                    data_1f5890 += 1
                    int32_t r1_336
                    
                    if (arg2[4] != 1)
                        r1_336 = 0x11
                    else
                        r1_336 = 0x12
                    
                    r0_237[3] = r1_336
            
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                *(s_localPlayerStats + 0xf6) |= 4
                
                if (arg2[4] == 1)
                    *(s_localPlayerStats + 0xf7) += 1
            
            goto label_191f5c
        case 0x37
            if (r5 != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 0x14
            *r0_17 = 0x14
            data_1f5894 = &r0_17[5]
            data_1f5890 += 1
            r1_44 = arg2[2]
            r2_17 = 0x17
            goto label_196620
        case 0x38
            if (r5 == 0)
                int32_t* r0_138 = data_1f5894
                
                if (r0_138 != 0 && &r0_138[5] u< data_1f5898 + data_1f589c)
                    *r0_138 = 0x14
                    r0_138[1] = 0x14
                    data_1f5894 = &r0_138[5]
                    data_1f5890 += 1
                    r0_138[3] = 0x13
            
            goto label_191f5c
        case 0x39
            int32_t* r0_320
            
            if (r5 == 0 && arg2[3] == 0)
                r0_320 = data_1f5894
            
            if (r5 == 0 && arg2[3] == 0 && r0_320 != 0 && &r0_320[5] u< data_1f5898 + data_1f589c)
                *r0_320 = 0x14
                r0_320[1] = 0x14
                data_1f5894 = &r0_320[5]
                data_1f5890 += 1
                r0_320[3] = 0x16
                
                if (r5 == 0)
                    goto label_193edc
            else if (r5 == 0)
            label_193edc:
                
                if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)) && arg2[3] == 1)
                    uint32_t r0_160 = *s_pWorldData
                    
                    if (zx.d(*(r0_160 + 0xe)) == 0x800 && zx.d(*(r0_160 + 0x10)) == 0)
                        int32_t* r0_162 = data_1f5894
                        
                        if (r0_162 != 0 && &r0_162[6] u< data_1f5898 + data_1f589c)
                            r0_162[1] = 0x25
                            *r0_162 = 0x18
                            data_1f5894 = &r0_162[6]
                            data_1f5890 += 1
                            r0_162[4] = 1
                            r0_162[5] = 0
                            r0_162[2] = 0x47
            
            goto label_191f5c
        case 0x3a
            if (r5 == 0)
                uint32_t r0_20 = *s_pWorldData
                uint32_t r0_22
                
                if (r0_20 == 0)
                    r0_22 = 0
                else
                    r0_22 = *(r0_20 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                arg2[3]
                int32_t r0_302 = core::CWorldBase::GetInstanceByID(r0_22)
                
                if (r0_302 != 0)
                    int32_t* r0_303 = __dynamic_cast(r0_302, _typeinfo_for_core::CInstance, 
                        _typeinfo_for_core::CCardInstance, 0)
                    
                    if (r0_303 != 0)
                        char* __s1_1 = (*(*r0_303 + 0xc))()
                        int32_t r0_307
                        
                        if (strcasecmp(__s1_1, "Randall, Umbral Sage") == 0)
                            r0_307 = 0x19
                        label_195db0:
                            int32_t* r1_461 = data_1f5894
                            
                            if (r1_461 != 0 && &r1_461[5] u< data_1f5898 + data_1f589c)
                                *r1_461 = 0x14
                                r1_461[1] = 0x14
                                data_1f5894 = &r1_461[5]
                                data_1f5890 += 1
                                r1_461[3] = r0_307
                        else if (strcasecmp(__s1_1, "Isla, Serene Prodigy") == 0)
                            r0_307 = 0x18
                            goto label_195db0
            
            goto label_191f5c
        case 0x3b
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)) && arg2[3] == 6)
                int32_t r1_343 = zx.d(*(s_localPlayerStats + 0xf9)) + 1
                *(s_localPlayerStats + 0xf9) = r1_343.b
                
                if (r1_343 << 0xfffffffc s>> 0x18 s< 3 || r5 != 0)
                    goto label_194340
                
                int32_t* r0_240 = data_1f5894
                
                if (r0_240 != 0 && &r0_240[6] u< data_1f5898 + data_1f589c)
                    r0_240[1] = 0x25
                    *r0_240 = 0x18
                    data_1f5894 = &r0_240[6]
                    data_1f5890 += 1
                    r0_240[4] = 1
                    r0_240[5] = 0
                    r0_240[2] = 0x48
                    
                    if (r5 != 0)
                        goto label_191f5c
                    
                    goto label_19434c
            
        label_194340:
            
            if (r5 != 0)
                goto label_191f5c
            
        label_19434c:
            r0_36 = data_1f5894
            
            if (r0_36 == 0 || &r0_36[4] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_36[1] = 0x2b
            *r0_36 = 0x10
            data_1f5894 = &r0_36[4]
            r1_78 = data_1f5890
            goto label_1943a8
        case 0x3c
            if (r5 != 0)
                goto label_191f5c
            
            if (arg2[2] != zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
            label_1965bc:
                r0_17 = data_1f5894
                
                if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                    goto label_191f5c
                
                r0_17[1] = 0x14
                *r0_17 = 0x14
                data_1f5894 = &r0_17[5]
                data_1f5890 += 1
                r1_44 = arg2[2]
                r2_17 = 0x22
                goto label_196620
            
            uint32_t r1_263 = *s_pWorldData
            uint32_t r0_176 = 0
            
            if (r1_263 != 0)
                r0_176 = r1_263 + *(s_InterfaceContext + 0x10) * 0x34
            
            arg2[3]
            
            if (r1_263 != 0)
                r0_176 = *(r0_176 + 0x124)
            
            char* __s1_2 = *(core::CWorldBase::GetInstanceByID(r0_176) + 0xc) + 4
            int32_t r0_196
            
            if (strcasecmp(__s1_2, "Dimension Monk") == 0)
                r0_196 = 1
            else if (strcasecmp(__s1_2, "Divine Askara") == 0)
                r0_196 = 2
            else if (strcasecmp(__s1_2, "Dreamscape Dryad") == 0)
                r0_196 = 4
            else if (strcasecmp(__s1_2, "Evvy, Ogo's Gift") == 0)
                r0_196 = 8
            else if (strcasecmp(__s1_2, "Steelweaver") == 0)
                r0_196 = 0x10
            else if (strcasecmp(__s1_2, "Emma Ironheart") == 0)
                r0_196 = 0x20
            else if (strcasecmp(__s1_2, "Nihil Chemist") == 0)
                r0_196 = 0x40
            else
                if (strcasecmp(__s1_2, "Naka, Shadeborn") != 0)
                    goto label_1965bc
                
                r0_196 = 0x80
            
            int32_t* r1_518 = data_1f5894
            
            if (r1_518 == 0)
                goto label_191f5c
            
            if (&r1_518[6] u< data_1f5898 + data_1f589c)
                r1_518[1] = 0x25
                *r1_518 = 0x18
                data_1f5894 = &r1_518[6]
                data_1f5890 += 1
                r1_518[4] = r0_196
                r1_518[5] = 0
                r1_518[2] = 0x4a
            
            goto label_1965bc
        case 0x3d
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)) && arg2[4] != 0)
                if (r5 != 0 || zx.d(*(s_localPlayerStats + 0xfb)) == 0)
                    *(s_localPlayerStats + 0xfb) = 1
                else
                    int32_t* r0_16 = data_1f5894
                    
                    if (r0_16 != 0 && &r0_16[6] u< data_1f5898 + data_1f589c)
                        r0_16[1] = 0x25
                        *r0_16 = 0x18
                        data_1f5894 = &r0_16[6]
                        data_1f5890 += 1
                        r0_16[4] = 1
                        r0_16[5] = 0
                        r0_16[2] = 0x4b
            
            if (r5 != 0 || arg2[4] != 0)
                goto label_191f5c
            
            r0_17 = data_1f5894
            
            if (r0_17 == 0 || &r0_17[5] u>= data_1f5898 + data_1f589c)
                goto label_191f5c
            
            r0_17[1] = 0x14
            *r0_17 = 0x14
            data_1f5894 = &r0_17[5]
            data_1f5890 += 1
            r1_44 = arg2[2]
            r2_17 = 0x23
            goto label_196620
        case 0x3e
            if (r5 == 0 && arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                int32_t* r0_210 = data_1f5894
                
                if (r0_210 != 0 && &r0_210[6] u< data_1f5898 + data_1f589c)
                    r0_210[1] = 0x25
                    *r0_210 = 0x18
                    data_1f5894 = &r0_210[6]
                    data_1f5890 += 1
                    r0_210[4] = 1
                    r0_210[5] = 0
                    r0_210[2] = 0x4c
            
            goto label_191f5c
        case 0x3f
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                uint32_t r0_217 = *s_pWorldData
                uint32_t r0_219
                
                if (r0_217 == 0)
                    r0_219 = 0
                else
                    r0_219 = *(r0_217 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                arg2[3]
                
                if (strcasecmp(*(core::CWorldBase::GetInstanceByID(r0_219) + 0xc) + 4, 
                        "Dhartha, Mechamonk") == 0)
                    uint32_t r1_394 = zx.d(*(s_localPlayerStats + 0xfa)) + zx.d(arg2[4].b)
                    *(s_localPlayerStats + 0xfa) = r1_394.b
                    
                    if (r1_394 << 0xfffffffc s>> 0x18 s>= 7 && r5 == 0)
                        int32_t* r0_296 = data_1f5894
                        
                        if (r0_296 != 0 && &r0_296[6] u< data_1f5898 + data_1f589c)
                            r0_296[1] = 0x25
                            *r0_296 = 0x18
                            data_1f5894 = &r0_296[6]
                            data_1f5890 += 1
                            r0_296[4] = 1
                            r0_296[5] = 0
                            r0_296[2] = 0x49
            
            goto label_191f5c
        case 0x40
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                int32_t r1_250 = zx.d(*(s_localPlayerStats + 0xfd)) + 1
                *(s_localPlayerStats + 0xfd) = r1_250.b
                
                if (r1_250 << 0xfffffffc s>> 0x18 s>= 5 && r5 == 0)
                    int32_t* r0_169 = data_1f5894
                    
                    if (r0_169 != 0 && &r0_169[6] u< data_1f5898 + data_1f589c)
                        r0_169[1] = 0x25
                        *r0_169 = 0x18
                        data_1f5894 = &r0_169[6]
                        data_1f5890 += 1
                        r0_169[4] = 1
                        r0_169[5] = 0
                        r0_169[2] = 0x4f
            
            goto label_191f5c
        case 0x41
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                int32_t r1_257 = zx.d(*(s_localPlayerStats + 0xfc)) + 1
                *(s_localPlayerStats + 0xfc) = r1_257.b
                
                if (r1_257 << 0xfffffffc s>> 0x18 s>= 5 && r5 == 0)
                    int32_t* r0_173 = data_1f5894
                    
                    if (r0_173 != 0 && &r0_173[6] u< data_1f5898 + data_1f589c)
                        r0_173[1] = 0x25
                        *r0_173 = 0x18
                        data_1f5894 = &r0_173[6]
                        data_1f5890 += 1
                        r0_173[4] = 1
                        r0_173[5] = 0
                        r0_173[2] = 0x4e
            
            goto label_191f5c
        case 0x42
            if (arg2[2] == zx.d(*(*(s_InterfaceContext + 0xc) + 8)))
                uint32_t r0_41 = *s_pWorldData
                uint32_t r0_43
                
                if (r0_41 == 0)
                    r0_43 = 0
                else
                    r0_43 = *(r0_41 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)
                
                arg2[3]
                void* r0_241 = core::CWorldBase::GetInstanceByID(r0_43)
                
                if (r5 == 0)
                    ascension::CCard* r5_8 = *(r0_241 + 0xc)
                    ProcessAquireDefeatAllAchievement(r5_8)
                    
                    if (arg2[4] == 0 && strcasecmp("Pasythea, The Redeemed", r5_8 + 4) == 0)
                        int32_t* r0_245 = data_1f5894
                        
                        if (r0_245 != 0 && &r0_245[6] u< data_1f5898 + data_1f589c)
                            r0_245[1] = 0x25
                            *r0_245 = 0x18
                            data_1f5894 = &r0_245[6]
                            data_1f5890 += 1
                            r0_245[4] = 1
                            r0_245[5] = 0
                            r0_245[2] = 0x50
            
            goto label_191f5c
    
    __stack_chk_fail()
    noreturn

if (r0_1 == 0x8000002)
    if (r5 == 0)
        data_1f4e48 = 1
        int32_t* r0_11 = data_1f5894
        
        if (r0_11 != 0 && &r0_11[7] u< data_1f5898 + data_1f589c)
            r0_11[1] = 1
            *r0_11 = 0x1c
            data_1f5894 = &r0_11[7]
            data_1f5890 += 1
            r0_11[2] = arg2[1]
            r0_11[3] = arg2[2]
            r0_11[4] = arg2[3]
            r0_11[5] = arg2[4]
            r0_11[6] = arg2[5]
else if (r0_1 == 0x8000001 && r5 == 0)
    uint32_t r1_1 = zx.d(arg2[1].b)
    
    if (r1_1 - 2 u< 8)
        int32_t* r0_3 = data_1f5894
        
        if (r0_3 != 0 && &r0_3[0xc] u< data_1f5898 + data_1f589c)
            r0_3[1] = 3
            *r0_3 = 0x30
            data_1f5894 = &r0_3[0xc]
            data_1f5890 += 1
            r0_3[2] = r1_1 << 0xfffffffc s>> 0x18
            r0_3[3] = sx.d(*(arg2 + 5))
            r0_3[4] = arg2[6]
            r0_3[5] = sx.d(*(arg2 + 7))
            r0_3[6] = arg2[3]
            r0_3[7] = sx.d(arg2[2].b)
            r0_3[8] = arg2[4]
            r0_3[9] = arg2[5]
            int32_t r1_10 = sx.d(*(arg2 + 6))
            r0_3[0xb] = 0
            r0_3[0xa] = r1_10
    else
        int32_t* r0_12
        
        if (r1_1 == 0xa)
            r0_12 = data_1f5894
            
            if (r0_12 != 0 && &r0_12[0xa] u< data_1f5898 + data_1f589c)
                r0_12[1] = 4
                *r0_12 = 0x28
                data_1f5894 = &r0_12[0xa]
                data_1f5890 += 1
                r0_12[2] = arg2[5]
                r0_12[3] = sx.d(*(arg2 + 5))
            label_194d14:
                r0_12[4] = sx.d(*(arg2 + 7))
                r0_12[5] = arg2[3]
                r0_12[6] = sx.d(arg2[2].b)
                r0_12[7] = arg2[4]
                r0_12[8] = arg2[6]
                r0_12[9] = arg2[7]
        else if (r1_1 == 1)
            r0_12 = data_1f5894
            
            if (r0_12 != 0 && &r0_12[0xa] u< data_1f5898 + data_1f589c)
                r0_12[1] = 2
                *r0_12 = 0x28
                data_1f5894 = &r0_12[0xa]
                data_1f5890 += 1
                int32_t r1_27 = arg2[5]
                r0_12[2] = r1_27
                uint32_t r3_6 = zx.d(*(arg2 + 5))
                
                if (r3_6 == 9)
                    r0_12[2] = r1_27 + 0x5000
                else if (r3_6 == 0xc)
                    r0_12[2] = r1_27 + 0x6000
                
                r0_12[3] = r3_6 << 0xfffffffc s>> 0x18
                goto label_194d14

goto label_191f5c
