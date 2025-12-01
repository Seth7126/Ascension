// 函数: StartTutorial
// 地址: 0x198424
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = &data_1f4e58
int32_t r1 = *__stack_chk_guard
data_1f5884 = 0
ClearAppWorldData(&data_1f4e58)
__aeabi_memclr8(&data_1f4e58, 0xa2c)
*s_pWorldData = &data_1f4e58
__aeabi_memclr4(s_localPlayerStats, 0x118)
*s_bShowLoadingOverlay = 1
int32_t r1_1 = *arg1
data_1f4e6a = arg1[1].w
data_1f4e66 = r1_1
data_1f4e58 = 0x22
int32_t r0_2 = arg2

if (arg2 s>= 4)
    r0_2 = 4

data_1f4f2c = arg2
data_1f4f4c = arg4
__aeabi_memcpy4(0x1f4e6c, arg3, r0_2 * 0x30)
data_1f4f50 = 0

if (arg2 s>= 1)
    char* r4_1 = arg3 + 8
    int32_t r9_1 = 0
    int32_t r10_1 = 0
    
    do
        uint32_t r0_4 = zx.d(*r4_1)
        
        if (r0_4 == 0)
        label_198528:
            ascension::GameParameters* r0_7 = operator new(0xbf0)
            int32_t* r1_3 = *s_pWorldData
            int32_t var_4c_1 = 1
            ascension::CWorld::CWorld(r0_7, r1_3 + 0xe, *r1_3, arg4.b, false)
            void* r5_1 = *s_pWorldData + r9_1
            *(r5_1 + 0x124) = r0_7
            *(r5_1 + 0x12c) = ascensionrules::CreateStateProcessGame(r0_7)
            int32_t r0_12 = operator new(0x20)
            CStateMachine::CStateMachine()
            *(r5_1 + 0x130) = r0_12
            void (* r0_13)(void*, uint32_t, char const*, 
                bool (*)(CStateMachine*, void*, uint32_t, int32_t, uint16_t, uint16_t, uint32_t*), 
                void*) = operator new(0x400)
            GameOptionManager::GameOptionManager()
            *(r5_1 + 0x134) = r0_13
            GameOptionManager::SetOptionListEndCallback(r0_13, InterfaceOptionListEndListener)
            GameOptionManager::Attach(*(r5_1 + 0x134), *(r5_1 + 0x130))
        else if (r0_4 == 1 && *(*s_pWorldData + 0xf8) == 2)
            goto label_198528
        
        r10_1 += 1
        r9_1 += 0x34
        r4_1 = &r4_1[0x30]
    while (r10_1 s< arg2)
    
    r5 = *s_pWorldData

int32_t r0_16 = r5[0x35]
r5[0x7d] = 0
int32_t var_3c

if (r0_16 s< 1)
    var_3c = 0
else
    int32_t r4_2 = 0
    var_3c = 0
    
    do
        void* r1_10 = &r5[r4_2 * 0xc]
        uint32_t r2_5 = zx.d(*(r1_10 + 0x1c))
        
        if (r2_5 == 1)
            if (r5[0x3e] == 2)
                goto label_198654
        else if (r2_5 == 0)
            var_3c = *(r1_10 + 0x14)
        label_198654:
            
            if (r0_16 s>= 1)
                int32_t r9_2 = 0
                int32_t i = 0
                uint32_t r4_3 = *(r5 + r4_2 * 0x34 + 0x124)
                uint32_t var_30_1 = r4_3
                
                do
                    void* r0_18 = r5 + r9_2
                    void* r0_26
                    
                    if (zx.d(*(r0_18 + 0x1c)) != 2)
                        r0_26 = r0_18 + 0x14
                    else
                        if (r5[0x7d] == 0)
                            ascension::GameParameters* r0_20 = operator new(0xbf0)
                            int32_t var_4c_2 = 0
                            ascension::CWorld::CWorld(r0_20, r5 + 0xe, *r5, (r5[0x3d]).b, true)
                            *(*s_pWorldData + 0x1f4) = r0_20
                            core::CWorldBase::CreateRollbackBuffer(r0_20)
                            r5 = *s_pWorldData
                        
                        void* r8_1 = r5 + r9_2
                        int32_t r0_24 = sx.d(*(r8_1 + 0x1d))
                        void** r6_2
                        
                        if (r0_24 == 0)
                            r6_2 = operator new(0x24)
                            int32_t r0_28 = r5[0x7d]
                            int32_t r1_17 = *(r8_1 + 0x14)
                            r6_2[2].b = 0
                            *r6_2 = _vtable_for_ascension_ai::CEasyAI + 8
                            r6_2[1] = r1_17
                            __builtin_memset(&r6_2[3], 0, 0x14)
                            r6_2[8] = r0_28
                        else if (r0_24 != 3)
                            void** r0_29 = operator new(0x58)
                            r6_2 = r0_29
                            r5[0x7d]
                            ascension_ai::CMediumAI::CMediumAI(r0_29, *(r8_1 + 0x14))
                        else
                            void** r0_25 = operator new(0x28)
                            r6_2 = r0_25
                            r5[0x7d]
                            ascension_ai::CTutorialAI::CTutorialAI(r0_25, *(r8_1 + 0x14))
                        
                        r6_2[4] = StoreTutorialMoveEntry
                        r6_2[5] = 0
                        r6_2[6] = RetrieveTutorialMoveEntry
                        r6_2[7] = 0
                        int64_t* r0_30 = operator new(0x38)
                        r5 = *s_pWorldData
                        int32_t r1_19 = *(r5 + r9_2 + 0x14)
                        r0_30[1].b = 0
                        *(r0_30 + 0xc) = 0
                        *r0_30 = r1_19:(_vtable_for_CDelayAIPlayer + 8)
                        r0_30[4].d = r6_2
                        *(r0_30 + 0x24) = 0xffffffff
                        r0_30[5].d = 0
                        r0_30[6].d = 0
                        *(r0_30 + 0x34) = 0
                        r0_30[2].d = StoreTutorialMoveEntry
                        *(r0_30 + 0x14) = 0
                        r0_30[3].d = RetrieveTutorialMoveEntry
                        *(r0_30 + 0x1c) = 0
                        r4_3 = var_30_1
                        r0_26 = &r5[i * 0xc + 5]
                    
                    ascension::CWorld::AddPlayer(r4_3, *r0_26, r5 + r9_2 + 0x24)
                    r5 = *s_pWorldData
                    r9_2 += 0x30
                    i += 1
                while (i s< r5[0x35])
            
            void* r0_37 = r5 + r4_2 * 0x34
            *(r0_37 + 0x12c)
            CStateMachine::PushState(*(r0_37 + 0x130))
            r5 = *s_pWorldData
            
            if (r5[0x3e] != 3)
                CStateMachine::SetOptionListEndCallback(*(r5 + r4_2 * 0x34 + 0x130), 
                    OfflineOptionListEndListener)
                r5 = *s_pWorldData
        
        r0_16 = r5[0x35]
        r4_2 += 1
    while (r4_2 s< r0_16)

int32_t r0_42 = 0
*s_InterfaceContext = 0
*(s_InterfaceContext + 4) = 0
*(s_InterfaceContext + 8) = 0
*(s_InterfaceContext + 0xc) = 0

if (r5[5] == var_3c)
label_1988e8:
    *(s_InterfaceContext + 0x10) = r0_42
    void* r1_27 = r0_42.w * 0x34 + r5
    *s_InterfaceContext = *(r1_27 + 0x124)
    *(s_InterfaceContext + 4) = *(r1_27 + 0x130)
    uint32_t r0_45 = *(r1_27 + 0x134)
    *(s_InterfaceContext + 8) = r0_45
    GameOptionManager::SetLocalPlayerIndex(r0_45)
    *(s_InterfaceContext + 0xc) = ascension::CWorld::GetPlayerByIndex(*s_InterfaceContext)
else
    r0_42 = 1
    
    if (r5[0x11] == var_3c)
        goto label_1988e8
    
    r0_42 = 2
    
    if (r5[0x1d] == var_3c)
        goto label_1988e8
    
    r0_42 = 3
    
    if (r5[0x29] == var_3c)
        goto label_1988e8

if (arg5 s>= 1)
    int32_t r1_30 = *(s_InterfaceContext + 0x10)
    int32_t r5_2 = var_3c
    int32_t r6_4 = arg5
    int32_t r10_2 = 0
    
    while (true)
    label_19894c:
        *(s_InterfaceContext + 4)
        CStateMachine::Update()
        
        if (*(*(s_InterfaceContext + 8) + 0x3fc) != 0)
            int32_t* r0_54 = **(s_InterfaceContext + 4)
            
            if (r0_54 != 0 && (*(*r0_54 + 0x18))(r0_54, r5_2) != 0)
                void* r0_56 = *(s_InterfaceContext + 8)
                int32_t* var_2c = nullptr
                void* r1_33 = *(r0_56 + 0x3fc)
                int32_t r0_57 = *(r1_33 + 0x98)
                
                if (r0_57 s>= 1)
                    int32_t r5_3 = 0
                    int16_t* r3_6 = arg6 + (r10_2 << 4)
                    uint32_t r7_4 = zx.d(*r3_6)
                    int16_t* r2_15 = *(r1_33 + 0xa0) + 4
                    
                    do
                        if (zx.d(r2_15[1]) == r7_4)
                            uint32_t r9_3 = zx.d(*r2_15)
                            
                            if (r9_3 == zx.d(r3_6[1]))
                                uint32_t r0_58 = *s_pWorldData
                                var_2c = nullptr
                                int32_t r2_16 = r0_58 + (r1_30 << 2)
                                int32_t* r6_6 = *(r0_58 + 0x120) + (*(r2_16 + 0xfc) << 4)
                                *r6_6 = var_3c
                                r6_6[1].w = r5_3.w
                                *(r6_6 + 6) = r9_3.w
                                r6_6[2].w = r7_4.w
                                r6_6[3] = var_2c
                                void* r8_2 = r0_58 + r1_30 * 0x34
                                *(r2_16 + 0xfc) += 1
                                char r2_17 = *(r0_58 + 0xd8)
                                *(r0_58 + 0x10c) += 1
                                *(r0_58 + 0xd8) = r2_17 & (not.d(1 << (r1_30 & 0xff))).b
                                void* r0_59 = r8_2 + (r1_30 << 2)
                                int32_t r6_7 = *(r0_59 + 0x138)
                                int32_t r3_16 = *(r0_59 + 0x148)
                                *(r0_59 + 0x138) = 0
                                *(r0_59 + 0x148) = 0
                                uint32_t r0_60 = *(s_InterfaceContext + 8)
                                
                                if (r0_60 != 0)
                                    GameOptionManager::ResetPlayerOptionEntry(r0_60)
                                
                                if (r6_7 != 0)
                                    int32_t* r1_37 = var_2c
                                    
                                    if (r1_37 != 0)
                                        r1_37 = &var_2c
                                    
                                    r6_7(*(r8_2 + 0x130), r3_16, var_3c, r5_3, r9_3, r7_4, r1_37)
                                
                                r10_2 += 1
                                r6_4 = arg5
                                r5_2 = var_3c
                                
                                if (r10_2 s< r6_4)
                                    goto label_19894c
                                
                                goto label_198b04
                        
                        r5_3 += 1
                        r2_15 = &r2_15[0x20]
                    while (r5_3 s< r0_57)
                    
                    r5_2 = var_3c
                
                if (r10_2 s>= r6_4)
                    break

label_198b04:
core::CWorldBase::AddStateChangeListener(*s_InterfaceContext, sub_191e3c)
uint32_t r0_63 = *s_pWorldData
int32_t r3_18 = *(r0_63 + 0x10c)
bool cond:2 = *(r0_63 + 0xf8) != 3
*(r0_63 + 0x110) = 0xffffffff
*(r0_63 + 0x118) = r3_18

if (cond:2)
    *(r0_63 + 0x114) = 0xffffffff

*(r0_63 + 0x1f8) = 0
*(r0_63 + 0x1fc) = 0
*(r0_63 + 0x200) = 0xffffffff
SaveGameData()
int32_t r0_64 = *__stack_chk_guard

if (r0_64 == r1)
    return r0_64 - r1

__stack_chk_fail()
noreturn
