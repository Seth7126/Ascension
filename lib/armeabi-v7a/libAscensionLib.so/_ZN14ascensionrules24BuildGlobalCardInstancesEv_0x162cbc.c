// 函数: _ZN14ascensionrules24BuildGlobalCardInstancesEv
// 地址: 0x162cbc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t i = 0
int32_t r0 = *__stack_chk_guard
uint32_t var_2c = 1

do
    void* r6_1 = &(&data_1e4168)[i * 3]
    void* r5_1 = *r6_1
    void* r8_1 = r6_1 + 4
    void* var_34_1 = r6_1
    void* r4_2 = r6_1 + 8
    void* r7_1
    
    if ((*r4_2 - r5_1) s>> 2 u> 0xf)
        r7_1 = r5_1
    else
        void* r6_2 = *r8_1 - r5_1
        void* r0_6 = operator new(0x40)
        r7_1 = r0_6
        
        if (r6_2 s>= 1)
            __aeabi_memcpy4(r7_1, r5_1, r6_2)
        
        r6_1 = var_34_1
        *r6_1 = r7_1
        *r8_1 = r0_6 + r6_2
        *r4_2 = r7_1 + 0x40
        
        if (r5_1 != 0)
            operator delete(r5_1)
            r7_1 = *r6_1
    
    *r8_1 = r7_1
    *(&data_1e43fc + (i << 2)) = 0
    ascension::CDatabase::GetCard(ascension::g_Database)
    core::CWorldBase* r0_12 = operator new(0x10)
    uint32_t r2_2 = var_2c
    var_2c = r2_2 + 1
    core::CCardInstance::CCardInstance(r0_12, 0, r2_2)
    core::CWorldBase** r0_15 = *r8_1
    core::CWorldBase* var_30_1 = r0_12
    
    if (r0_15 == *r4_2)
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            r6_1)
    else
        *r0_15 = r0_12
        *r8_1 += 4
    
    *(&data_1e43fc + (i << 2)) += 1
    core::CWorldBase* r0_21 = operator new(0x10)
    uint32_t r2_3 = var_2c
    var_2c = r2_3 + 1
    core::CCardInstance::CCardInstance(r0_21, 0, r2_3)
    core::CWorldBase** r0_24 = *r8_1
    core::CWorldBase* var_30_2 = r0_21
    
    if (r0_24 == *r4_2)
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            r6_1)
    else
        *r0_24 = r0_21
        *r8_1 += 4
    
    *(&data_1e43fc + (i << 2)) += 1
    ascension::CDatabase::GetCard(ascension::g_Database)
    
    for (int32_t j = 0; j u< 8; )
        core::CWorldBase* r0_32 = operator new(0x10)
        uint32_t r2_4 = var_2c
        var_2c = r2_4 + 1
        core::CCardInstance::CCardInstance(r0_32, 0, r2_4)
        core::CWorldBase** r0_35 = *r8_1
        core::CWorldBase* var_30_3 = r0_32
        
        if (r0_35 == *r4_2)
            std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                var_34_1)
        else
            *r0_35 = r0_32
            *r8_1 += 4
        
        j += 1
        *(&data_1e43fc + (i << 2)) += 1
    
    i += 1
while (i u< 4)

for (int32_t i_1 = 0; i_1 u< 4; i_1 += 1)
    void* r6_3 = &(&data_1e4198)[i_1 * 3]
    void* r5_4 = *r6_3
    void* r8_2 = r6_3 + 4
    void* var_34_2 = r6_3
    void* r4_4 = r6_3 + 8
    void* r7_5
    
    if ((*r4_4 - r5_4) s>> 2 u> 0xf)
        r7_5 = r5_4
    else
        void* r6_4 = *r8_2 - r5_4
        void* r0_46 = operator new(0x40)
        r7_5 = r0_46
        
        if (r6_4 s>= 1)
            __aeabi_memcpy4(r7_5, r5_4, r6_4)
        
        r6_3 = var_34_2
        *r6_3 = r7_5
        *r8_2 = r0_46 + r6_4
        *r4_4 = r7_5 + 0x40
        
        if (r5_4 != 0)
            operator delete(r5_4)
            r7_5 = *r6_3
    
    *r8_2 = r7_5
    *(&data_1e440c + (i_1 << 2)) = 0
    ascension::CDatabase::GetCard(ascension::g_Database)
    core::CWorldBase* r0_52 = operator new(0x10)
    uint32_t r2_6 = var_2c
    var_2c = r2_6 + 1
    core::CCardInstance::CCardInstance(r0_52, 0, r2_6)
    core::CWorldBase** r0_55 = *r8_2
    core::CWorldBase* var_30_4 = r0_52
    
    if (r0_55 == *r4_4)
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            r6_3)
    else
        *r0_55 = r0_52
        *r8_2 += 4
    
    *(&data_1e440c + (i_1 << 2)) += 1
    core::CWorldBase* r0_61 = operator new(0x10)
    uint32_t r2_7 = var_2c
    var_2c = r2_7 + 1
    core::CCardInstance::CCardInstance(r0_61, 0, r2_7)
    core::CWorldBase** r0_64 = *r8_2
    core::CWorldBase* var_30_5 = r0_61
    
    if (r0_64 == *r4_4)
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            r6_3)
    else
        *r0_64 = r0_61
        *r8_2 += 4
    
    *(&data_1e440c + (i_1 << 2)) += 1
    ascension::CDatabase::GetCard(ascension::g_Database)
    
    for (int32_t j_1 = 0; j_1 u< 8; )
        core::CWorldBase* r0_72 = operator new(0x10)
        uint32_t r2_8 = var_2c
        var_2c = r2_8 + 1
        core::CCardInstance::CCardInstance(r0_72, 0, r2_8)
        core::CWorldBase** r0_75 = *r8_2
        core::CWorldBase* var_30_6 = r0_72
        
        if (r0_75 == *r4_4)
            std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                var_34_2)
        else
            *r0_75 = r0_72
            *r8_2 += 4
        
        j_1 += 1
        *(&data_1e440c + (i_1 << 2)) += 1

ascensionrules::BuildPortalDeckSetCardInstances(&data_1e4288, &data_1e441c, &var_2c, 
    ascensionrules::s_StartingCenterDeckSet1List, 0x30)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e42ac, &data_1e4420, &var_2c, 
    ascensionrules::s_StartingCenterDeckSet2List, 0x1f)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e42b8, &data_1e4424, &var_2c, 
    ascensionrules::s_StartingCenterDeckSet3List, 0x34)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e43a8, &data_1e4428, &var_2c, &data_1dafe8, 
    6)
ascension::CWorld::SetStartInstanceID(4, var_2c)
ascension::CWorld::SetStartInstanceID(5, var_2c)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e42c4, &data_1e442c, &var_2c, &data_1db018, 
    0x24)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e42dc, &data_1e4430, &var_2c, 
    ascensionrules::s_SoulGemDeckSet4List, 0x14)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e43b4, &data_1e4434, &var_2c, &data_1db138, 
    6)
ascension::CWorld::SetStartInstanceID(6, var_2c)

if (data_1e442c != 0)
    int32_t i_2 = 0
    int32_t r4_5 = 0
    
    do
        int32_t* r0_83 = *(data_1e42c4 + (i_2 << 2))
        int32_t* var_30_7 = r0_83
        
        if ((r4_5 & 1) != 0)
            goto label_163318
        
        if (strcasecmp((*(*r0_83 + 0xc))(), "Energy Monk") == 0)
            ascension::CDatabase::GetCard(ascension::g_Database)
            core::CWorldBase* r0_95 = operator new(0x10)
            core::CCard* r2_17 = var_2c
            r4_5 = 1
            var_2c = r2_17 + 1
            core::CCardInstance::CCardInstance(r0_95, 0, r2_17)
            var_30_7 = r0_95
        else
            r0_83 = var_30_7
        label_163318:
            
            if (strcasecmp((*(*r0_83 + 0xc))(), "Kythis, Rebel Godling") == 0)
                ascension::CDatabase::GetCard(ascension::g_Database)
                core::CWorldBase* r0_90 = operator new(0x10)
                uint32_t r2_16 = var_2c
                var_2c = r2_16 + 1
                core::CCardInstance::CCardInstance(r0_90, 0, r2_16)
                var_30_7 = r0_90
        
        int32_t** r0_98 = data_1e42d4
        
        if (r0_98 == data_1e42d8)
            std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                &data_1e42d0)
        else
            *r0_98 = var_30_7
            data_1e42d4 += 4
        
        i_2 += 1
        data_1e4438 += 1
    while (i_2 u< data_1e442c)

ascension::CWorld::SetStartInstanceID(7, var_2c)
ascension::CWorld::SetStartInstanceID(8, var_2c)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e43c0, &data_1e443c, &var_2c, &data_1db168, 
    5)
ascension::CWorld::SetStartInstanceID(9, var_2c)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e43cc, &data_1e4440, &var_2c, &data_1db190, 
    5)
ascension::CWorld::SetStartInstanceID(0xa, var_2c)
ascension::CWorld::SetStartInstanceID(0xb, var_2c)

for (int32_t i_3 = 0; i_3 u< 4; i_3 += 1)
    void* r4_6 = (&data_1e41c8)[i_3 * 3]
    void* r5_8
    
    if ((*(i_3 * 0xc + 0x1e41d0) - r4_6) s>> 2 u> 0xf)
        r5_8 = r4_6
    else
        void* r5_7 = (&data_1e41cc)[i_3 * 3] - r4_6
        void* r0_109 = operator new(0x40)
        r5_8 = r0_109
        
        if (r5_7 s>= 1)
            __aeabi_memcpy4(r5_8, r4_6)
        
        (&data_1e41c8)[i_3 * 3] = r5_8
        (&data_1e41cc)[i_3 * 3] = r0_109 + r5_7
        *(i_3 * 0xc + 0x1e41d0) = r0_109 + 0x40
        
        if (r4_6 != 0)
            operator delete(r4_6)
            r5_8 = (&data_1e41c8)[i_3 * 3]
    
    (&data_1e41cc)[i_3 * 3] = r5_8
    *(&data_1e4444 + (i_3 << 2)) = 0
    ascension::CDatabase::GetCard(ascension::g_Database)
    core::CWorldBase* r0_115 = operator new(0x10)
    uint32_t r2_21 = var_2c
    var_2c = r2_21 + 1
    core::CCardInstance::CCardInstance(r0_115, 0, r2_21)
    core::CWorldBase** r0_118 = (&data_1e41cc)[i_3 * 3]
    core::CWorldBase* var_30_8 = r0_115
    
    if (r0_118 == *(i_3 * 0xc + 0x1e41d0))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            &(&data_1e41c8)[i_3 * 3])
    else
        *r0_118 = r0_115
        (&data_1e41cc)[i_3 * 3] += 4
    
    *(&data_1e4444 + (i_3 << 2)) += 1
    core::CWorldBase* r0_124 = operator new(0x10)
    uint32_t r2_22 = var_2c
    var_2c = r2_22 + 1
    core::CCardInstance::CCardInstance(r0_124, 0, r2_22)
    core::CWorldBase** r0_127 = (&data_1e41cc)[i_3 * 3]
    core::CWorldBase* var_30_9 = r0_124
    
    if (r0_127 == *(i_3 * 0xc + 0x1e41d0))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            &(&data_1e41c8)[i_3 * 3])
    else
        *r0_127 = r0_124
        (&data_1e41cc)[i_3 * 3] += 4
    
    *(&data_1e4444 + (i_3 << 2)) += 1
    ascension::CDatabase::GetCard(ascension::g_Database)
    
    for (int32_t j_2 = 0; j_2 u< 8; )
        core::CWorldBase* r0_135 = operator new(0x10)
        uint32_t r2_23 = var_2c
        var_2c = r2_23 + 1
        core::CCardInstance::CCardInstance(r0_135, 0, r2_23)
        core::CWorldBase** r0_138 = (&data_1e41cc)[i_3 * 3]
        core::CWorldBase* var_30_10 = r0_135
        
        if (r0_138 == *(i_3 * 0xc + 0x1e41d0))
            std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                &(&data_1e41c8)[i_3 * 3])
        else
            *r0_138 = r0_135
            (&data_1e41cc)[i_3 * 3] += 4
        
        j_2 += 1
        *(&data_1e4444 + (i_3 << 2)) += 1
    
    ascension::CDatabase::GetCard(ascension::g_Database)
    core::CWorldBase* r0_146 = operator new(0x10)
    uint32_t r2_24 = var_2c
    var_2c = r2_24 + 1
    core::CCardInstance::CCardInstance(r0_146, 0, r2_24)
    core::CWorldBase** r0_149 = (&data_1e41cc)[i_3 * 3]
    core::CWorldBase* var_30_11 = r0_146
    
    if (r0_149 == *(i_3 * 0xc + 0x1e41d0))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            &(&data_1e41c8)[i_3 * 3])
    else
        *r0_149 = r0_146
        (&data_1e41cc)[i_3 * 3] += 4
    
    *(&data_1e4444 + (i_3 << 2)) += 1

ascensionrules::BuildPortalDeckSetCardInstances(&data_1e42e8, &data_1e4454, &var_2c, &data_1db1b8, 
    0x2e)
ascension::CWorld::SetStartInstanceID(0xc, var_2c)
ascension::CWorld::SetStartInstanceID(0xd, var_2c)
ascension::CWorld::SetStartInstanceID(0xe, var_2c)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e42f4, &data_1e4458, &var_2c, &data_1db328, 
    0x22)
ascension::CWorld::SetStartInstanceID(0xf, var_2c)

for (int32_t i_4 = 0; i_4 u< 4; i_4 += 1)
    void* r4_12 = (&data_1e41f8)[i_4 * 3]
    void* r5_13
    
    if ((*(i_4 * 0xc + 0x1e4200) - r4_12) s>> 2 u> 0xf)
        r5_13 = r4_12
    else
        void* r5_12 = (&data_1e41fc)[i_4 * 3] - r4_12
        void* r0_160 = operator new(0x40)
        r5_13 = r0_160
        
        if (r5_12 s>= 1)
            __aeabi_memcpy4(r5_13, r4_12)
        
        (&data_1e41f8)[i_4 * 3] = r5_13
        (&data_1e41fc)[i_4 * 3] = r0_160 + r5_12
        *(i_4 * 0xc + 0x1e4200) = r0_160 + 0x40
        
        if (r4_12 != 0)
            operator delete(r4_12)
            r5_13 = (&data_1e41f8)[i_4 * 3]
    
    (&data_1e41fc)[i_4 * 3] = r5_13
    *(&data_1e445c + (i_4 << 2)) = 0
    ascension::CDatabase::GetCard(ascension::g_Database)
    core::CWorldBase* r0_166 = operator new(0x10)
    uint32_t r2_28 = var_2c
    var_2c = r2_28 + 1
    core::CCardInstance::CCardInstance(r0_166, 0, r2_28)
    core::CWorldBase** r0_169 = (&data_1e41fc)[i_4 * 3]
    core::CWorldBase* var_30_12 = r0_166
    
    if (r0_169 == *(i_4 * 0xc + 0x1e4200))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            &(&data_1e41f8)[i_4 * 3])
    else
        *r0_169 = r0_166
        (&data_1e41fc)[i_4 * 3] += 4
    
    *(&data_1e445c + (i_4 << 2)) += 1
    core::CWorldBase* r0_175 = operator new(0x10)
    uint32_t r2_29 = var_2c
    var_2c = r2_29 + 1
    core::CCardInstance::CCardInstance(r0_175, 0, r2_29)
    core::CWorldBase** r0_178 = (&data_1e41fc)[i_4 * 3]
    core::CWorldBase* var_30_13 = r0_175
    
    if (r0_178 == *(i_4 * 0xc + 0x1e4200))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            &(&data_1e41f8)[i_4 * 3])
    else
        *r0_178 = r0_175
        (&data_1e41fc)[i_4 * 3] += 4
    
    *(&data_1e445c + (i_4 << 2)) += 1
    ascension::CDatabase::GetCard(ascension::g_Database)
    
    for (int32_t j_3 = 0; j_3 u< 8; )
        core::CWorldBase* r0_186 = operator new(0x10)
        uint32_t r2_30 = var_2c
        var_2c = r2_30 + 1
        core::CCardInstance::CCardInstance(r0_186, 0, r2_30)
        core::CWorldBase** r0_189 = (&data_1e41fc)[i_4 * 3]
        core::CWorldBase* var_30_14 = r0_186
        
        if (r0_189 == *(i_4 * 0xc + 0x1e4200))
            std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                &(&data_1e41f8)[i_4 * 3])
        else
            *r0_189 = r0_186
            (&data_1e41fc)[i_4 * 3] += 4
        
        j_3 += 1
        *(&data_1e445c + (i_4 << 2)) += 1
    
    ascension::CDatabase::GetCard(ascension::g_Database)
    core::CWorldBase* r0_197 = operator new(0x10)
    uint32_t r2_31 = var_2c
    var_2c = r2_31 + 1
    core::CCardInstance::CCardInstance(r0_197, 0, r2_31)
    core::CWorldBase** r0_200 = (&data_1e41fc)[i_4 * 3]
    core::CWorldBase* var_30_15 = r0_197
    
    if (r0_200 == *(i_4 * 0xc + 0x1e4200))
        std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
            &(&data_1e41f8)[i_4 * 3])
    else
        *r0_200 = r0_197
        (&data_1e41fc)[i_4 * 3] += 4
    
    *(&data_1e445c + (i_4 << 2)) += 1

ascensionrules::BuildPortalDeckSetCardInstances(&data_1e4300, &data_1e446c, &var_2c, &data_1db438, 
    0x2e)
ascension::CWorld::SetStartInstanceID(0x10, var_2c)
ascension::CWorld::SetStartInstanceID(0x11, var_2c)

if (data_1e446c != 0)
    int32_t i_5 = 0
    int32_t r6_8 = 0
    
    do
        int32_t* r0_208 = *(data_1e4300 + (i_5 << 2))
        int32_t r0_210
        
        if ((r6_8 & 1) == 0)
            r0_210 = strcasecmp((*(*r0_208 + 0xc))(), "Terrorizing Fiend")
        
        if ((r6_8 & 1) == 0 && r0_210 == 0)
            r6_8 = 1
        else
            int32_t** r0_211 = data_1e4310
            
            if (r0_211 == data_1e4314)
                std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                    &data_1e430c)
            else
                *r0_211 = r0_208
                data_1e4310 += 4
            
            data_1e4470 += 1
        
        i_5 += 1
    while (i_5 u< data_1e446c)

ascension::CWorld::SetStartInstanceID(0x12, var_2c)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e4318, &data_1e4474, &var_2c, &data_1db5a8, 
    0x30)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e4324, &data_1e4478, &var_2c, &data_1db728, 
    4)
ascension::CWorld::SetStartInstanceID(0x13, var_2c)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e43d8, &data_1e447c, &var_2c, &data_1db748, 
    5)
ascension::CWorld::SetStartInstanceID(0x14, var_2c)
ascension::CWorld::SetStartInstanceID(0x15, var_2c)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e4330, &data_1e4480, &var_2c, 
    ascensionrules::s_StartingCenterDeckSet9List, 0x30)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e433c, &data_1e4484, &var_2c, 
    ascensionrules::s_StartingDreamDeckSet9List, 0x19)
ascension::CWorld::SetStartInstanceID(0x16, var_2c)
ascension::CWorld::SetStartInstanceID(0x17, var_2c)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e4348, &data_1e4488, &var_2c, &data_1db770, 
    0x2b)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e43f0, &data_1e448c, &var_2c, &data_1db8c8, 
    1)
uint32_t r1_67 = var_2c + 5
var_2c = r1_67
ascension::CWorld::SetStartInstanceID(0x18, r1_67)
ascension::CWorld::SetStartInstanceID(0x19, var_2c)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e4354, &data_1e4490, &var_2c, &data_1db8d0, 
    0x36)
ascension::CWorld::SetStartInstanceID(0x1a, var_2c)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e4360, &data_1e4494, &var_2c, &data_1dba80, 
    1)
ascension::CWorld::SetStartInstanceID(0x1b, var_2c)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e43e4, &data_1e4498, &var_2c, &data_1dba88, 
    0xa)
ascension::CWorld::SetStartInstanceID(0x1c, var_2c)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e436c, &data_1e449c, &var_2c, &data_1dbad8, 
    0x30)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e4378, &data_1e44a0, &var_2c, &data_1dbc58, 
    3)
ascension::CWorld::SetStartInstanceID(0x1d, var_2c)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e4384, &data_1e44a4, &var_2c, &data_1dbc70, 
    0x31)
ascension::CWorld::SetStartInstanceID(0x1e, var_2c)
ascension::CWorld::SetStartInstanceID(0x1f, var_2c)

for (int32_t i_6 = 0; i_6 u< 4; i_6 += 1)
    void* r4_18 = (&data_1e4228)[i_6 * 3]
    void* r7_14
    
    if ((*(i_6 * 0xc + 0x1e4230) - r4_18) s>> 2 u> 0xf)
        r7_14 = r4_18
    else
        void* r7_13 = (&data_1e422c)[i_6 * 3] - r4_18
        void* r0_223 = operator new(0x40)
        r7_14 = r0_223
        
        if (r7_13 s>= 1)
            __aeabi_memcpy4(r7_14, r4_18)
        
        (&data_1e4228)[i_6 * 3] = r7_14
        (&data_1e422c)[i_6 * 3] = r0_223 + r7_13
        *(i_6 * 0xc + 0x1e4230) = r0_223 + 0x40
        
        if (r4_18 != 0)
            operator delete(r4_18)
            r7_14 = (&data_1e4228)[i_6 * 3]
    
    (&data_1e422c)[i_6 * 3] = r7_14
    int32_t j_4 = 0
    *(&data_1e44a8 + (i_6 << 2)) = 0
    
    do
        (&data_1dbdf8)[j_4 * 2]
        ascension::CDatabase::GetCard(ascension::g_Database)
        int32_t r8_7 = 0
        bool cond:11_1
        
        do
            core::CWorldBase* r0_228 = operator new(0x10)
            uint32_t r2_47 = var_2c
            var_2c = r2_47 + 1
            core::CCardInstance::CCardInstance(r0_228, 0, r2_47)
            core::CWorldBase** r0_231 = (&data_1e422c)[i_6 * 3]
            core::CWorldBase* var_30_17 = r0_228
            
            if (r0_231 == *(i_6 * 0xc + 0x1e4230))
                std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                    &(&data_1e4228)[i_6 * 3])
            else
                *r0_231 = r0_228
                (&data_1e422c)[i_6 * 3] += 4
            
            r8_7 += 1
            cond:11_1 = r8_7 u< *((j_4 << 3) + 0x1dbdfc)
            *(&data_1e44a8 + (i_6 << 2)) += 1
        while (cond:11_1)
        j_4 += 1
    while (j_4 u< 4)

ascensionrules::BuildPortalDeckSetCardInstances(&data_1e4390, &data_1e44b8, &var_2c, &data_1dbe18, 
    0x31)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e439c, &data_1e44bc, &var_2c, &data_1dbfa0, 
    1)

for (int32_t i_7 = 0; i_7 u< 4; i_7 += 1)
    void* r4_22 = (&data_1e4258)[i_7 * 3]
    void* r7_17
    
    if ((*(i_7 * 0xc + 0x1e4260) - r4_22) s>> 2 u> 0xf)
        r7_17 = r4_22
    else
        void* r7_16 = (&data_1e425c)[i_7 * 3] - r4_22
        void* r0_242 = operator new(0x40)
        r7_17 = r0_242
        
        if (r7_16 s>= 1)
            __aeabi_memcpy4(r7_17, r4_22)
        
        (&data_1e4258)[i_7 * 3] = r7_17
        (&data_1e425c)[i_7 * 3] = r0_242 + r7_16
        *(i_7 * 0xc + 0x1e4260) = r0_242 + 0x40
        
        if (r4_22 != 0)
            operator delete(r4_22)
            r7_17 = (&data_1e4258)[i_7 * 3]
    
    (&data_1e425c)[i_7 * 3] = r7_17
    int32_t j_5 = 0
    *(&data_1e44c0 + (i_7 << 2)) = 0
    
    do
        (&data_1dbfa8)[j_5 * 2]
        ascension::CDatabase::GetCard(ascension::g_Database)
        int32_t r8_9 = 0
        bool cond:13_1
        
        do
            core::CWorldBase* r0_247 = operator new(0x10)
            uint32_t r2_51 = var_2c
            var_2c = r2_51 + 1
            core::CCardInstance::CCardInstance(r0_247, 0, r2_51)
            core::CWorldBase** r0_250 = (&data_1e425c)[i_7 * 3]
            core::CWorldBase* var_30_18 = r0_247
            
            if (r0_250 == *(i_7 * 0xc + 0x1e4260))
                std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                    &(&data_1e4258)[i_7 * 3])
            else
                *r0_250 = r0_247
                (&data_1e425c)[i_7 * 3] += 4
            
            r8_9 += 1
            cond:13_1 = r8_9 u< *((j_5 << 3) + 0x1dbfac)
            *(&data_1e44c0 + (i_7 << 2)) += 1
        while (cond:13_1)
        j_5 += 1
    while (j_5 u< 4)

ascensionrules::BuildPortalDeckSetCardInstances(&data_1e4294, &data_1e44d0, &var_2c, 
    ascensionrules::s_StartingCenterDeckSet1AnnivList, 0x30)
ascension::CWorld::SetStartInstanceID(0x20, var_2c)
ascensionrules::BuildPortalDeckSetCardInstances(&data_1e42a0, &data_1e44d4, &var_2c, &data_1dbfc8, 
    1)
ascension::CWorld::SetStartInstanceID(0x21, var_2c)
ascension::CWorld::SetStartInstanceID(0x22, var_2c)
int32_t r0_256 = *__stack_chk_guard

if (r0_256 == r0)
    return r0_256 - r0

__stack_chk_fail()
noreturn
