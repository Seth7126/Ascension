// 函数: StartGame
// 地址: 0x197d88
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r4 = &data_1f4e58
ClearAppWorldData(&data_1f4e58)
__aeabi_memclr8(&data_1f4e58, 0xa2c)
*s_pWorldData = &data_1f4e58
__aeabi_memclr4(s_localPlayerStats, 0x118)
*s_bShowLoadingOverlay = 1
int32_t r1 = *arg1
data_1f4e6a = arg1[1].w
data_1f4e66 = r1
data_1f4e58 = 0x22
int32_t r0_2 = arg2

if (arg2 s>= 4)
    r0_2 = 4

data_1f4f2c = arg2
data_1f4f4c = arg4
__aeabi_memcpy4(0x1f4e6c, arg3, r0_2 * 0x30)

if (arg2 s< 1)
    data_1f4f50 = 1
else
    int32_t r0_5 = 0
    int32_t r1_2 = 0x1c
    int32_t i_3 = arg2
    r4 = &data_1f4e58
    int32_t i
    
    do
        uint32_t r3 = zx.d(*(&data_1f4e58 + r1_2))
        r1_2 += 0x30
        
        if (r3 != 2)
            r0_5 += 1
        
        i = i_3
        i_3 -= 1
    while (i != 1)
    int32_t r1_3 = 1
    
    if (r0_5 u> 1)
        r1_3 = 2
    
    data_1f4f50 = r1_3
    
    if (arg2 s>= 1)
        char* r5_1 = arg3 + 8
        int32_t r4_1 = 0
        int32_t r8_1 = 0
        
        do
            uint32_t r0_6 = zx.d(*r5_1)
            
            if (r0_6 == 0)
            label_197ebc:
                ascension::GameParameters* r0_9 = operator new(0xbf0)
                uint32_t* r1_4 = *s_pWorldData
                int32_t var_3c_1 = 0
                ascension::CWorld::CWorld(r0_9, r1_4 + 0xe, *r1_4, arg4.b, false)
                void* r9_1 = *s_pWorldData + r4_1
                *(r9_1 + 0x124) = r0_9
                *(r9_1 + 0x12c) = ascensionrules::CreateStateProcessGame(r0_9)
                int32_t r0_13 = operator new(0x20)
                CStateMachine::CStateMachine()
                *(r9_1 + 0x130) = r0_13
                void (* r0_14)(void*, uint32_t, char const*, 
                    bool (*)(CStateMachine*, void*, uint32_t, int32_t, uint16_t, uint16_t, 
                        uint32_t*), 
                    void*) = operator new(0x400)
                GameOptionManager::GameOptionManager()
                *(r9_1 + 0x134) = r0_14
                GameOptionManager::SetOptionListEndCallback(r0_14, InterfaceOptionListEndListener)
                GameOptionManager::Attach(*(r9_1 + 0x134), *(r9_1 + 0x130))
            else if (r0_6 == 1 && *(*s_pWorldData + 0xf8) == 2)
                goto label_197ebc
            
            r8_1 += 1
            r4_1 += 0x34
            r5_1 = &r5_1[0x30]
        while (r8_1 s< arg2)
        
        r4 = *s_pWorldData

int32_t r1_8 = r4[0x35]
int32_t r0_17 = 0
r4[0x7d] = 0

if (r1_8 s>= 1)
    int32_t r7_4 = 0
    r0_17 = 0
    
    do
        int32_t r3_2 = r7_4
        uint32_t r2_6 = zx.d(r4[r7_4 * 0xc + 7].b)
        
        if (r2_6 == 0)
        label_197fe8:
            
            if (r1_8 s>= 1)
                int32_t r10_1 = 0
                int32_t i_1 = 0
                uint32_t r6_1 = *(r4 + r7_4 * 0x34 + 0x124)
                
                do
                    void* r0_21 = r4 + r10_1
                    void* r0_22
                    
                    if (zx.d(*(r0_21 + 0x1c)) == 2 || arg5 != 0)
                        if (r4[0x7d] == 0)
                            ascension::GameParameters* r0_24 = operator new(0xbf0)
                            int32_t var_3c_2 = 0
                            ascension::CWorld::CWorld(r0_24, r4 + 0xe, *r4, (r4[0x3d]).b, true)
                            *(*s_pWorldData + 0x1f4) = r0_24
                            core::CWorldBase::CreateRollbackBuffer(r0_24)
                        
                        void** r7_6
                        
                        if (arg5 == 0)
                            void* r9_2 = *s_pWorldData
                            void* r4_2 = r9_2 + r10_1
                            int32_t r0_33 = sx.d(*(r4_2 + 0x1d))
                            
                            if (r0_33 != 3 && r0_33 != 0)
                                void** r0_36 = operator new(0x58)
                                r7_6 = r0_36
                                *(r9_2 + 0x1f4)
                                ascension_ai::CMediumAI::CMediumAI(r0_36, *(r4_2 + 0x14))
                            else
                                r7_6 = operator new(0x24)
                                int32_t r0_35 = *(r9_2 + 0x1f4)
                                int32_t r1_14 = *(r4_2 + 0x14)
                                r7_6[2].b = 0
                                *r7_6 = _vtable_for_ascension_ai::CEasyAI + 8
                                r7_6[1] = r1_14
                                __builtin_memset(&r7_6[3], 0, 0x14)
                                r7_6[8] = r0_35
                        else
                            r7_6 = operator new(0x58)
                            void* r0_30 = *s_pWorldData
                            *(r0_30 + 0x1f4)
                            ascension_ai::CMediumAI::CMediumAI(r7_6, *(r0_30 + r10_1 + 0x14))
                        
                        r7_6[4] = StoreMoveEntry
                        r7_6[5] = 0
                        r7_6[6] = RetrieveMoveEntry
                        r7_6[7] = 0
                        int64_t* r0_37 = operator new(0x38)
                        r4 = *s_pWorldData
                        int32_t r1_16 = *(r4 + r10_1 + 0x14)
                        r0_37[1].b = 0
                        __builtin_memset(r0_37 + 0xc, 0, 0x14)
                        *r0_37 = r1_16:(_vtable_for_CDelayAIPlayer + 8)
                        r0_37[4].d = r7_6
                        *(r0_37 + 0x24) = 0xffffffff
                        r0_37[5].d = 0
                        r0_37[6].d = 0
                        r0_22 = &r4[i_1 * 0xc + 5]
                        *(r0_37 + 0x34) = 0
                    else
                        r0_22 = r0_21 + 0x14
                    
                    ascension::CWorld::AddPlayer(r6_1, *r0_22, r4 + r10_1 + 0x24)
                    r4 = *s_pWorldData
                    r10_1 += 0x30
                    i_1 += 1
                while (i_1 s< r4[0x35])
            
            void* r0_44 = r4 + r7_4 * 0x34
            *(r0_44 + 0x12c)
            CStateMachine::PushState(*(r0_44 + 0x130))
            r4 = *s_pWorldData
            
            if (r4[0x3e] != 3)
                CStateMachine::SetOptionListEndCallback(*(r4 + r7_4 * 0x34 + 0x130), 
                    OfflineOptionListEndListener)
                r4 = *s_pWorldData
            
            r0_17 = r3_2
        else if (r2_6 == 1)
            r3_2 = r0_17
            
            if (r4[0x3e] == 2)
                goto label_197fe8
        
        r1_8 = r4[0x35]
        r7_4 += 1
    while (r7_4 s< r1_8)

int32_t r8_2 = r4[r0_17 * 0xc + 5]

if (r4[0x3e] == 2)
    int32_t r6_2 = *(r4 + r0_17 * 0x34 + 0x124)
    
    if (*(r6_2 + 0x1c) != *(r6_2 + 0x18))
        int32_t i_2 = 0
        
        do
            void* r0_52 = ascension::CWorld::GetPlayer(r6_2)
            r4 = *s_pWorldData
            void* r1_23 = nullptr
            int32_t r2_17 = r4[0x35]
            
            if (r2_17 s>= 1)
                r1_23 = &r4[5]
                int32_t r3_6 = 0
                
                while (*r1_23 != *(r0_52 + 0xc))
                    r3_6 += 1
                    r1_23 += 0x30
                    
                    if (r3_6 s>= r2_17)
                        r1_23 = nullptr
                        break
            
            if (zx.d(*(r1_23 + 8)) u<= 1)
                r8_2 = *r1_23
                break
            
            i_2 += 1
        while (i_2 u< (*(r6_2 + 0x1c) - *(r6_2 + 0x18)) s>> 2)

int32_t r1_25 = 0
*s_InterfaceContext = 0
*(s_InterfaceContext + 4) = 0
*(s_InterfaceContext + 8) = 0
*(s_InterfaceContext + 0xc) = 0
void (* r0_60)(void*, core::CStateChangeMessage const*, uint32_t)

if (r4[5] == r8_2)
label_198330:
    *(s_InterfaceContext + 0x10) = r1_25
    void* r0_61 = r1_25.w * 0x34 + r4
    *s_InterfaceContext = *(r0_61 + 0x124)
    *(s_InterfaceContext + 4) = *(r0_61 + 0x130)
    uint32_t r0_62 = *(r0_61 + 0x134)
    *(s_InterfaceContext + 8) = r0_62
    GameOptionManager::SetLocalPlayerIndex(r0_62)
    int32_t r0_64 = ascension::CWorld::GetPlayerByIndex(*s_InterfaceContext)
    r0_60 = *s_InterfaceContext
    *(s_InterfaceContext + 0xc) = r0_64
else
    r1_25 = 1
    
    if (r4[0x11] == r8_2)
        goto label_198330
    
    r1_25 = 2
    
    if (r4[0x1d] == r8_2)
        goto label_198330
    
    r0_60 = nullptr
    r1_25 = 3
    
    if (r4[0x29] == r8_2)
        goto label_198330

core::CWorldBase::AddStateChangeListener(r0_60, sub_191e3c)
uint32_t r0_65 = *s_pWorldData
int32_t r3_7 = *(r0_65 + 0x10c)
bool cond:5 = *(r0_65 + 0xf8) != 3
*(r0_65 + 0x110) = 0xffffffff
*(r0_65 + 0x118) = r3_7

if (cond:5)
    *(r0_65 + 0x114) = 0xffffffff

*(r0_65 + 0x1f8) = 0
*(r0_65 + 0x1fc) = 0
*(r0_65 + 0x200) = 0xffffffff
return SaveGameData() __tailcall
