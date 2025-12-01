// 函数: ResumeGame
// 地址: 0x198be8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* r4 = &data_1f4e58
ClearAppWorldData(&data_1f4e58)
__aeabi_memclr8(&data_1f4e58, 0xa2c)
__aeabi_memclr4(s_localPlayerStats, 0x118)
RestoreAppGameDataFromBuffer(&data_1f4e58, arg1)
bool cond:0 = data_1f4f2c s< 1
*s_pWorldData = &data_1f4e58
int32_t r12

if (cond:0)
    r12 = 0xffffffff
    data_1f504c = 0
else
    r12 = 0xffffffff
    int32_t r7_1 = 0x1c
    int32_t r9_1 = 0
    r4 = &data_1f4e58
    int32_t r5_1 = 0
    int32_t r8_1 = 0
    int32_t r0_14
    
    do
        int32_t r2_1 = 0
        int32_t r3_1 = 0
        int32_t r1_1 = r4[r8_1 + 0x3f]
        uint32_t r0_4 = zx.d(*(r4 + r7_1))
        
        if (r1_1 u> r5_1)
            r2_1 = 1
        
        if (r12 s< 0)
            r3_1 = 1
        
        if ((r3_1 | r2_1) != 0)
            r12 = r8_1
            r5_1 = r1_1
        
        if (r0_4 == 0)
        label_198ccc:
            ascension::GameParameters* r0_6 = operator new(0xbf0)
            int32_t var_4c_1 = 0
            ascension::CWorld::CWorld(r0_6, r4 + 0xe, *r4, (r4[0x3d]).b, false)
            void* r4_1 = *s_pWorldData + r9_1
            *(r4_1 + 0x128) = 0
            *(r4_1 + 0x124) = r0_6
            *(r4_1 + 0x12c) = ascensionrules::CreateStateProcessGame(r0_6)
            int32_t r0_10 = operator new(0x20)
            CStateMachine::CStateMachine()
            *(r4_1 + 0x130) = r0_10
            void (* r0_11)(void*, uint32_t, char const*, 
                bool (*)(CStateMachine*, void*, uint32_t, int32_t, uint16_t, uint16_t, uint32_t*), 
                void*) = operator new(0x400)
            GameOptionManager::GameOptionManager()
            *(r4_1 + 0x134) = r0_11
            GameOptionManager::SetOptionListEndCallback(r0_11, InterfaceOptionListEndListener)
            GameOptionManager::Attach(*(r4_1 + 0x134), *(r4_1 + 0x130))
            r4 = *s_pWorldData
        else if (r0_4 == 1 && r4[0x3e] == 2)
            goto label_198ccc
        
        r0_14 = r4[0x35]
        r8_1 += 1
        r7_1 += 0x30
        r9_1 += 0x34
    while (r8_1 s< r0_14)
    
    r4[0x7d] = 0
    
    if (r0_14 s>= 1)
        int32_t r7_2 = 0
        int32_t var_40_1 = r12
        
        do
            uint32_t r1_9 = zx.d(r4[r7_2 * 0xc + 7].b)
            
            if (r1_9 == 0)
            label_198df0:
                
                if (r0_14 s>= 1)
                    int32_t r9_2 = 0
                    int32_t i = 0
                    uint32_t r0_16 = *(r4 + r7_2 * 0x34 + 0x124)
                    
                    do
                        void* r0_17 = r4 + r9_2
                        void* r10_1
                        
                        if (zx.d(*(r0_17 + 0x1c)) != 2)
                            r10_1 = r0_17 + 0x14
                        else
                            if (r4[0x7d] == 0)
                                ascension::GameParameters* r0_19 = operator new(0xbf0)
                                int32_t var_4c_2 = 0
                                ascension::CWorld::CWorld(r0_19, r4 + 0xe, *r4, (r4[0x3d]).b, true)
                                *(*s_pWorldData + 0x1f4) = r0_19
                                core::CWorldBase::CreateRollbackBuffer(r0_19)
                                r4 = *s_pWorldData
                            
                            void* r6_4 = r4 + r9_2
                            int32_t r0_23 = sx.d(*(r6_4 + 0x1d))
                            void** r7_4
                            
                            if (r0_23 != 3 && r0_23 != 0)
                                void** r0_28 = operator new(0x58)
                                r7_4 = r0_28
                                r4[0x7d]
                                ascension_ai::CMediumAI::CMediumAI(r0_28, *(r6_4 + 0x14))
                                r4 = *s_pWorldData
                                r10_1 = r4 + r9_2 + 0x14
                            else
                                r7_4 = operator new(0x24)
                                int32_t r0_25 = r4[0x7d]
                                int32_t r1_14 = *(r6_4 + 0x14)
                                r7_4[2].b = 0
                                *r7_4 = _vtable_for_ascension_ai::CEasyAI + 8
                                r7_4[1] = r1_14
                                __builtin_memset(&r7_4[3], 0, 0x14)
                                r7_4[8] = r0_25
                                r10_1 = &r4[i * 0xc + 5]
                            
                            r7_4[4] = StoreMoveEntry
                            r7_4[5] = 0
                            r7_4[6] = RetrieveMoveEntry
                            r7_4[7] = 0
                            int64_t* r0_30 = operator new(0x38)
                            int32_t r1_16 = *r10_1
                            r0_30[1].b = 0
                            __builtin_memset(r0_30 + 0xc, 0, 0x14)
                            *r0_30 = r1_16:(_vtable_for_CDelayAIPlayer + 8)
                            r0_30[4].d = r7_4
                            *(r0_30 + 0x24) = 0xffffffff
                            r0_30[5].d = 0
                            r0_30[6].d = 0
                            *(r0_30 + 0x34) = 0
                        
                        ascension::CWorld::AddPlayer(r0_16, *r10_1, r4 + r9_2 + 0x24)
                        r4 = *s_pWorldData
                        r9_2 += 0x30
                        i += 1
                    while (i s< r4[0x35])
                
                void* r0_35 = r4 + r7_2 * 0x34
                *(r0_35 + 0x12c)
                CStateMachine::PushState(*(r0_35 + 0x130))
                r4 = *s_pWorldData
                
                if (r4[0x3e] != 3)
                    CStateMachine::SetOptionListEndCallback(*(r4 + r7_2 * 0x34 + 0x130), 
                        OfflineOptionListEndListener)
                    r4 = *s_pWorldData
                
                r12 = var_40_1
            else if (r1_9 == 1 && r4[0x3e] == 2)
                goto label_198df0
            
            r0_14 = r4[0x35]
            r7_2 += 1
        while (r7_2 s< r0_14)
        
        if (r0_14 s>= 1)
            int32_t r9_3 = 0
            int32_t i_1 = 0
            
            do
                if (i_1 != r12)
                    void* r0_40 = r4 + i_1 * 0x34
                    int32_t* r1_21 = r0_40 + 0x124
                    
                    if (*r1_21 != 0 && zx.d(*(r0_40 + 0x128)) == 0)
                        int32_t r2_12 = 0
                        int32_t r6_5 = r4[5 + i_1 * 0xc]
                        *s_InterfaceContext = 0
                        *(s_InterfaceContext + 4) = 0
                        *(s_InterfaceContext + 8) = 0
                        *(s_InterfaceContext + 0xc) = 0
                        int32_t* r10_2
                        
                        if (r4[5] == r6_5)
                        label_1990d0:
                            void* r0_47 = r2_12.w * 0x34 + r4
                            *(s_InterfaceContext + 0x10) = r2_12
                            *s_InterfaceContext = *(r0_47 + 0x124)
                            *(s_InterfaceContext + 4) = *(r0_47 + 0x130)
                            uint32_t r0_48 = *(r0_47 + 0x134)
                            *(s_InterfaceContext + 8) = r0_48
                            GameOptionManager::SetLocalPlayerIndex(r0_48)
                            *(s_InterfaceContext + 0xc) =
                                ascension::CWorld::GetPlayerByIndex(*s_InterfaceContext)
                            *(s_InterfaceContext + 4)
                            r10_2 = *s_pWorldData
                            r1_21 = r10_2 + i_1 * 0x34 + 0x124
                        else
                            r2_12 = 1
                            
                            if (r4[0x11] == r6_5)
                                goto label_1990d0
                            
                            r2_12 = 2
                            
                            if (r4[0x1d] == r6_5)
                                goto label_1990d0
                            
                            r2_12 = 3
                            
                            if (r4[0x29] == r6_5)
                                goto label_1990d0
                            
                            r10_2 = r4
                        
                        void* r2_13 = &r10_2[i_1]
                        int32_t r5_3 = *(r2_13 + 0xfc)
                        *(r2_13 + 0xfc) = 0
                        *(*r1_21 + 0x10) = 1
                        CStateMachine::Update()
                        r4 = *s_pWorldData
                        int32_t r6_6 = r4[i_1 + 0x3f]
                        int32_t r5_4
                        
                        if (r6_6 u>= r5_3)
                            r5_4 = r5_3
                        else
                            r5_4 = r5_3
                            
                            do
                                int32_t* r0_57 = **(s_InterfaceContext + 4)
                                
                                if (r0_57 != 0)
                                    int32_t r10_3 = r4[0x48]
                                    int32_t r4_2 = *(r10_3 + (r6_6 << 4))
                                    
                                    if ((*(*r0_57 + 0x18))(r0_57, r4_2) != 0)
                                        void* r0_59 = r10_3 + (r6_6 << 4)
                                        uint32_t r12_1 = zx.d(*(r0_59 + 8))
                                        uint32_t lr_1 = zx.d(*(r0_59 + 6))
                                        int32_t* var_2c = *(r0_59 + 0xc)
                                        uint32_t r0_60 = *s_pWorldData
                                        int32_t r1_31 = r0_60 + (i_1 << 2)
                                        *(r1_31 + 0xfc) += 1
                                        int32_t r2_17 = *(r0_60 + 0xd4)
                                        
                                        if (r2_17 s>= 1)
                                            int32_t* r6_7 = r0_60 + 0x14
                                            int32_t r1_32 = 0
                                            
                                            do
                                                if (r4_2 == *r6_7)
                                                    if (*(r0_60 + 0xf8) != 3)
                                                        *(r0_60 + 0xd8) &=
                                                            (not.d(1 << (r1_32 & 0xff))).b
                                                    
                                                    void* r0_62 = r10_2 + r9_3 + (r1_32 << 2)
                                                    int32_t r6_8 = *(r0_62 + 0x138)
                                                    int32_t r1_33 = *(r0_62 + 0x148)
                                                    *(r0_62 + 0x138) = 0
                                                    *(r0_62 + 0x148) = 0
                                                    
                                                    if (r6_8 != 0)
                                                        int32_t* r2_21 = var_2c
                                                        
                                                        if (r2_21 != 0)
                                                            r2_21 = &var_2c
                                                        
                                                        uint32_t var_50_1 = lr_1
                                                        int32_t* var_48_1 = r2_21
                                                        uint32_t var_4c_3 = r12_1
                                                        r6_8(*(r10_2 + i_1 * 0x34 + 0x130), r1_33, 
                                                            r4_2)
                                                    
                                                    break
                                                
                                                r1_32 += 1
                                                r6_7 = &r6_7[0xc]
                                            while (r1_32 s< r2_17)
                                        
                                        r5_4 = r5_3
                                
                                *(s_InterfaceContext + 4)
                                CStateMachine::Update()
                                *(s_InterfaceContext + 4)
                                CStateMachine::Update()
                                r4 = *s_pWorldData
                                r6_6 = r4[i_1 + 0x3f]
                            while (r6_6 u< r5_4)
                        
                        if (r5_4 != 0)
                            while (true)
                                int32_t* r1_34 = **(s_InterfaceContext + 4)
                                
                                if (r1_34 != 0)
                                    if ((*(*r1_34 + 0x14))(r1_34) != 0)
                                        break
                                    
                                    *(s_InterfaceContext + 4)
                                
                                CStateMachine::Update()
                            
                            r4 = *s_pWorldData
                        
                        void* r0_73 = r4 + i_1 * 0x34
                        r12 = var_40_1
                        void* r1_35 = *(r0_73 + 0x124)
                        *(r0_73 + 0x128) = 1
                        *(r1_35 + 0x10) = 0
                
                i_1 += 1
                r9_3 += 0x34
            while (i_1 s< r4[0x35])

int32_t r0_75 = 0
int32_t r6_9 = r4[5 + r12 * 0xc]
*s_InterfaceContext = 0
*(s_InterfaceContext + 4) = 0
*(s_InterfaceContext + 8) = 0
*(s_InterfaceContext + 0xc) = 0

if (r4[5] == r6_9)
label_1993a4:
    *(s_InterfaceContext + 0x10) = r0_75
    void* r1_41 = r0_75.w * 0x34 + r4
    *s_InterfaceContext = *(r1_41 + 0x124)
    *(s_InterfaceContext + 4) = *(r1_41 + 0x130)
    uint32_t r0_78 = *(r1_41 + 0x134)
    *(s_InterfaceContext + 8) = r0_78
    GameOptionManager::SetLocalPlayerIndex(r0_78)
    *(s_InterfaceContext + 0xc) = ascension::CWorld::GetPlayerByIndex(*s_InterfaceContext)
    r4 = *s_pWorldData
else
    r0_75 = 1
    
    if (r4[0x11] == r6_9)
        goto label_1993a4
    
    r0_75 = 2
    
    if (r4[0x1d] == r6_9)
        goto label_1993a4
    
    r0_75 = 3
    
    if (r4[0x29] == r6_9)
        goto label_1993a4

void* r0_81 = r4 + r12 * 0x34

if (zx.d(*(r0_81 + 0x128)) == 0)
    r4[*(s_InterfaceContext + 0x10) + 0x3f] = 0
    *s_bShowLoadingOverlay = 1
    *(*(r0_81 + 0x124) + 0x10) = 1
    *(r0_81 + 0x128) = 1
else
    core::CWorldBase::AddStateChangeListener(*(r0_81 + 0x124), sub_191e3c)
    r4 = *s_pWorldData

int32_t r1_46 = r4[0x3e]
r4[0x80] = 0xffffffff
r4[0x44] = 0xffffffff

if (r1_46 != 3)
    r4[0x45] = 0xffffffff

int32_t r0_84 = *__stack_chk_guard

if (r0_84 == r0)
    return r0_84 - r0

__stack_chk_fail()
noreturn
