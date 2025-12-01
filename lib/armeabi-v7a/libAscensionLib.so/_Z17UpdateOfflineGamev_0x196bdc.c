// 函数: _Z17UpdateOfflineGamev
// 地址: 0x196bdc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10 = *(s_InterfaceContext + 0x10)
int32_t r1 = *__stack_chk_guard
core::CWorldBase::AddStateChangeListener(*(*s_pWorldData + r10 * 0x34 + 0x124), sub_191e3c)
GameOptionManager::SetOptionListEndCallback(*(*s_pWorldData + r10 * 0x34 + 0x134), 
    InterfaceOptionListEndListener)
int32_t r1_2 = r10 * 0x34
int32_t r8 = 0x1f4
int32_t r6 = 0

if (zx.d(*s_bShowLoadingOverlay) == 0)
    r8 = 0xa

while (true)
    if (zx.d(data_1f4e48) == 0)
        uint32_t r0_8 = *s_pWorldData
        int32_t r1_4
        int32_t r2_3
        
        if (zx.d(*s_bShowLoadingOverlay) != 0)
            r1_4 = *(r0_8 + 0x10c)
            r2_3 = *(r0_8 + (r10 << 2) + 0xfc)
        
        if (zx.d(*s_bShowLoadingOverlay) != 0 && r2_3 u>= r1_4)
            if (r2_3 u>= *(r0_8 + 0x114))
                goto label_196cd0
            
            *s_bShowLoadingOverlay = 0
            *(*(r0_8 + r10 * 0x34 + 0x124) + 0x10) = 0
            
            if (r1_4 != 0 && *(r0_8 + 0xf8) == 2)
                while (true)
                    int32_t* r1_69 = **(s_InterfaceContext + 4)
                    
                    if (r1_69 != 0)
                        if ((*(*r1_69 + 0x14))(r1_69) != 0)
                            break
                        
                        *(s_InterfaceContext + 4)
                    
                    CStateMachine::Update()
                
                int32_t r0_73 = GetNewLocalPlayerID()
                int32_t r1_70 = 0
                *s_InterfaceContext = 0
                *(s_InterfaceContext + 4) = 0
                uint32_t r0_74 = *s_pWorldData
                *(s_InterfaceContext + 8) = 0
                *(s_InterfaceContext + 0xc) = 0
                
                if (*(r0_74 + 0x14) == r0_73)
                label_197518:
                    *(s_InterfaceContext + 0x10) = r1_70
                    void* r0_75 = r1_70.w * 0x34 + r0_74
                    *s_InterfaceContext = *(r0_75 + 0x124)
                    *(s_InterfaceContext + 4) = *(r0_75 + 0x130)
                    uint32_t r0_76 = *(r0_75 + 0x134)
                    *(s_InterfaceContext + 8) = r0_76
                    GameOptionManager::SetLocalPlayerIndex(r0_76)
                    *(s_InterfaceContext + 0xc) =
                        ascension::CWorld::GetPlayerByIndex(*s_InterfaceContext)
                else
                    r1_70 = 1
                    
                    if (*(r0_74 + 0x44) == r0_73)
                        goto label_197518
                    
                    r1_70 = 2
                    
                    if (*(r0_74 + 0x74) == r0_73)
                        goto label_197518
                    
                    r1_70 = 3
                    
                    if (*(r0_74 + 0xa4) == r0_73)
                        goto label_197518
            
            int32_t* r0_79 = data_1f5894
            
            if (r0_79 != 0 && &r0_79[3] u< data_1f5898 + data_1f589c)
                r0_79[1] = 0x23
                *r0_79 = 0xc
                data_1f5894 = &r0_79[3]
                data_1f5890 += 1
                r0_79[2] = 0x40000000
            
            break
        
        if (r0_8 != 0)
        label_196cd0:
            int32_t* r0_10 = **(s_InterfaceContext + 4)
            
            if (r0_10 != 0 && (*(*r0_10 + 0x14))() != 0)
                uint32_t r1_7 = *s_pWorldData
                int32_t r0_12 = *(r1_7 + 0x10c)
                int32_t r5_1 = *(r1_7 + (r10 << 2) + 0xfc)
                int32_t var_44
                uint32_t var_40
                int32_t var_3c
                
                if (r5_1 u< r0_12 && r5_1 u< *(r1_7 + 0x114))
                    int32_t* r0_14 = **(s_InterfaceContext + 4)
                    
                    if (r0_14 != 0)
                        int32_t r9_1 = *(r1_7 + 0x120)
                        int32_t i = *(r9_1 + (r5_1 << 4))
                        
                        if ((*(*r0_14 + 0x18))(r0_14, i) != 0)
                            void* r0_16 = r9_1 + (r5_1 << 4)
                            uint32_t r1_11 = zx.d(*(r0_16 + 8))
                            var_3c = zx.d(*(r0_16 + 6))
                            int32_t r3_4 = sx.d(*(r0_16 + 4))
                            int32_t* var_2c = *(r0_16 + 0xc)
                            uint32_t r9_2 = *s_pWorldData
                            *(r9_2 + (r10 << 2) + 0xfc) += 1
                            int32_t r1_15 = *(r9_2 + 0x110)
                            
                            if (r1_15 u< *(r9_2 + 0x10c))
                                *(r9_2 + (r10 << 2) + 0xfc) = r1_15
                                *(r9_2 + 0x10c) = *(r9_2 + 0x110)
                                *(r9_2 + 0x110) = 0xffffffff
                            
                            int32_t r1_16 = *(r9_2 + 0xd4)
                            int32_t r5_3
                            uint32_t r12_1
                            
                            if (r1_16 s< 1)
                            label_196e40:
                                r12_1 = 0
                                r5_3 = 0
                            else
                                int32_t* r2_13 = r9_2 + 0x14
                                int32_t r0_21 = 0
                                
                                while (i != *r2_13)
                                    r0_21 += 1
                                    r2_13 = &r2_13[0xc]
                                    
                                    if (r0_21 s>= r1_16)
                                        goto label_196e40
                                
                                if (*(r9_2 + 0xf8) != 3)
                                    *(r9_2 + 0xd8) &= (not.d(1 << (r0_21 & 0xff))).b
                                
                                void* r0_28 = r9_2 + r1_2 + (r0_21 << 2)
                                r5_3 = *(r0_28 + 0x138)
                                r12_1 = *(r0_28 + 0x148)
                                *(r0_28 + 0x138) = 0
                                *(r0_28 + 0x148) = 0
                            
                            uint32_t r0_29 = *(s_InterfaceContext + 8)
                            
                            if (r0_29 != 0)
                                var_40 = r12_1
                                var_44 = r3_4
                                GameOptionManager::ResetPlayerOptionEntry(r0_29)
                                r3_4 = var_44
                                r12_1 = var_40
                            
                            if (r5_3 != 0)
                                int32_t* r1_28 = var_2c
                                
                                if (r1_28 != 0)
                                    r1_28 = &var_2c
                                
                                r5_3(*(r9_2 + r10 * 0x34 + 0x130), r12_1, i, r3_4, var_3c, r1_11, 
                                    r1_28, var_44, var_40, var_3c, r1_11, r1_2)
                            
                            if (zx.d(*(*s_InterfaceContext + 0x10)) == 0)
                                int32_t* r0_34 = data_1f5894
                                
                                if (r0_34 != 0 && &r0_34[5] u< data_1f5898 + data_1f589c)
                                    r0_34[1] = 0x15
                                    *r0_34 = 0x14
                                    data_1f5894 = &r0_34[5]
                                    data_1f5890 += 1
                                    r0_34[3].w = r1_11.w
                                    r0_34[2] = i
                                    *(r0_34 + 0xe) = var_3c.w
                                    r0_34[4] = var_2c
                else
                    int32_t r2_6 = *(r1_7 + 0x1f8)
                    
                    if (r2_6 u< *(r1_7 + 0x1fc) && r5_1 u< *(r1_7 + 0x114))
                        int32_t* r0_23 = **(s_InterfaceContext + 4)
                        
                        if (r0_23 != 0)
                            int32_t r5_4 = r1_7 + (r2_6 << 4)
                            int32_t i_1 = *(r5_4 + 0x204)
                            
                            if ((*(*r0_23 + 0x18))(r0_23, i_1) != 0)
                                uint32_t r12_2 = zx.d(*(r5_4 + 0x20c))
                                uint32_t lr_1 = zx.d(*(r5_4 + 0x20a))
                                int32_t r3_5 = sx.d(*(r5_4 + 0x208))
                                uint32_t r9_3 = *s_pWorldData
                                int32_t* var_30 = *(r5_4 + 0x210)
                                int32_t r0_26 = *(r9_3 + 0x200)
                                bool cond:2_1 = r0_26 u< *(r9_3 + 0x1fc)
                                *(r9_3 + 0x1f8) += 1
                                
                                if (cond:2_1)
                                    *(r9_3 + 0x1f8) = r0_26
                                    *(r9_3 + 0x1fc) = r0_26
                                    *(r9_3 + 0x200) = 0xffffffff
                                
                                int32_t r1_21 = *(r9_3 + 0xd4)
                                int32_t var_38_2
                                int32_t r5_6
                                
                                if (r1_21 s< 1)
                                label_196f00:
                                    r5_6 = 0
                                    var_38_2 = 0
                                else
                                    int32_t* r2_16 = r9_3 + 0x14
                                    int32_t r0_27 = 0
                                    
                                    while (i_1 != *r2_16)
                                        r0_27 += 1
                                        r2_16 = &r2_16[0xc]
                                        
                                        if (r0_27 s>= r1_21)
                                            goto label_196f00
                                    
                                    if (*(r9_3 + 0xf8) != 3)
                                        *(r9_3 + 0xd8) &= (not.d(1 << (r0_27 & 0xff))).b
                                    
                                    void* r0_35 = r9_3 + r1_2 + (r0_27 << 2)
                                    var_38_2 = *(r0_35 + 0x148)
                                    r5_6 = *(r0_35 + 0x138)
                                    *(r0_35 + 0x138) = 0
                                    *(r0_35 + 0x148) = 0
                                
                                uint32_t r0_36 = *(s_InterfaceContext + 8)
                                
                                if (r0_36 != 0)
                                    var_44 = r5_6
                                    var_40 = r9_3
                                    var_3c = r3_5
                                    GameOptionManager::ResetPlayerOptionEntry(r0_36)
                                    r9_3 = var_40
                                    r3_5 = var_3c
                                    r5_6 = var_44
                                
                                if (r5_6 != 0)
                                    int32_t* r1_44 = var_30
                                    
                                    if (r1_44 != 0)
                                        r1_44 = &var_30
                                    
                                    r5_6(*(r9_3 + r10 * 0x34 + 0x130), var_38_2, i_1, r3_5, lr_1, 
                                        r12_2, r1_44, var_44, var_40, var_3c, var_38_2, r1_2)
                    else if (zx.d(*s_bShowLoadingOverlay) != 0 && r5_1 u< *(r1_7 + 0x114))
                        *s_bShowLoadingOverlay = 0
                        *(*(r1_7 + r10 * 0x34 + 0x124) + 0x10) = 0
                        
                        if (*(r1_7 + 0xf8) == 2)
                            if (r0_12 != 0)
                                while (true)
                                    int32_t* r1_79 = **(s_InterfaceContext + 4)
                                    
                                    if (r1_79 != 0)
                                        if ((*(*r1_79 + 0x14))(r1_79) != 0)
                                            break
                                        
                                        *(s_InterfaceContext + 4)
                                    
                                    CStateMachine::Update()
                                
                                int32_t r0_85 = GetNewLocalPlayerID()
                                int32_t r1_80 = 0
                                *s_InterfaceContext = 0
                                *(s_InterfaceContext + 4) = 0
                                uint32_t r0_86 = *s_pWorldData
                                *(s_InterfaceContext + 8) = 0
                                *(s_InterfaceContext + 0xc) = 0
                                
                                if (*(r0_86 + 0x14) == r0_85)
                                label_197670:
                                    *(s_InterfaceContext + 0x10) = r1_80
                                    void* r0_87 = r1_80.w * 0x34 + r0_86
                                    *s_InterfaceContext = *(r0_87 + 0x124)
                                    *(s_InterfaceContext + 4) = *(r0_87 + 0x130)
                                    uint32_t r0_88 = *(r0_87 + 0x134)
                                    *(s_InterfaceContext + 8) = r0_88
                                    GameOptionManager::SetLocalPlayerIndex(r0_88)
                                    *(s_InterfaceContext + 0xc) =
                                        ascension::CWorld::GetPlayerByIndex(*s_InterfaceContext)
                                else
                                    r1_80 = 1
                                    
                                    if (*(r0_86 + 0x44) == r0_85)
                                        goto label_197670
                                    
                                    r1_80 = 2
                                    
                                    if (*(r0_86 + 0x74) == r0_85)
                                        goto label_197670
                                    
                                    r1_80 = 3
                                    
                                    if (*(r0_86 + 0xa4) == r0_85)
                                        goto label_197670
                            
                            break
        
        *(s_InterfaceContext + 4)
        CStateMachine::Update()
        void* r0_40 = *s_InterfaceContext
        
        if (zx.d(*(r0_40 + 0x11)) != 0)
            CommitTemporaryMoveBuffer()
            r0_40 = *s_InterfaceContext
        
        if (zx.d(*(r0_40 + 0x10)) == 0)
            int32_t* r0_43 = **(s_InterfaceContext + 4)
            
            if (r0_43 != 0 && (*(*r0_43 + 0x14))() != 0)
                uint32_t r1_49 = *s_pWorldData
                
                if (*(r1_49 + (r10 << 2) + 0xfc) u>= *(r1_49 + 0x10c))
                    int32_t* r0_47 = **(s_InterfaceContext + 4)
                    
                    if (r0_47 == 0)
                        goto label_1971b4
                    
                    if ((*(*r0_47 + 0x1c))(r0_47, *(*(s_InterfaceContext + 0xc) + 0xc)) != 0)
                        r1_49 = *s_pWorldData
                    label_1971b4:
                        
                        if (*(r1_49 + 0xd4) s>= 1)
                            int32_t r4_1 = 0
                            int32_t i_2 = 0
                            
                            do
                                void* r2_27 = r1_49 + r4_1
                                
                                if (zx.d(*(r2_27 + 0x1c)) u<= 1)
                                    int32_t* r0_52 = **(s_InterfaceContext + 4)
                                    
                                    if (r0_52 != 0)
                                        bool cond:4_1 =
                                            (*(*r0_52 + 0x18))(r0_52, *(r2_27 + 0x14)) != 0
                                        r1_49 = *s_pWorldData
                                        
                                        if (cond:4_1)
                                            int32_t r0_55 = *(r1_49 + 0x1fc)
                                            
                                            if (r0_55 == 0)
                                                int32_t r0_57 = *(r1_49 + 0xf8)
                                                
                                                if (r0_57 == 2)
                                                    int32_t r0_58 = GetNewLocalPlayerID(r0_57)
                                                    int32_t r1_58 = 0
                                                    *s_InterfaceContext = 0
                                                    *(s_InterfaceContext + 4) = 0
                                                    uint32_t r0_59 = *s_pWorldData
                                                    *(s_InterfaceContext + 8) = 0
                                                    *(s_InterfaceContext + 0xc) = 0
                                                    
                                                    if (*(r0_59 + 0x14) == r0_58)
                                                    label_197330:
                                                        *(s_InterfaceContext + 0x10) = r1_58
                                                        void* r0_60 = r1_58.w * 0x34 + r0_59
                                                        *s_InterfaceContext = *(r0_60 + 0x124)
                                                        *(s_InterfaceContext + 4) = *(r0_60 + 0x130)
                                                        uint32_t r0_61 = *(r0_60 + 0x134)
                                                        *(s_InterfaceContext + 8) = r0_61
                                                        GameOptionManager::SetLocalPlayerIndex(
                                                            r0_61)
                                                        *(s_InterfaceContext + 0xc) =
                                                            ascension::CWorld::GetPlayerByIndex(
                                                            *s_InterfaceContext)
                                                    else
                                                        r1_58 = 1
                                                        
                                                        if (*(r0_59 + 0x44) == r0_58)
                                                            goto label_197330
                                                        
                                                        r1_58 = 2
                                                        
                                                        if (*(r0_59 + 0x74) == r0_58)
                                                            goto label_197330
                                                        
                                                        r1_58 = 3
                                                        
                                                        if (*(r0_59 + 0xa4) == r0_58)
                                                            goto label_197330
                                                    
                                                    data_1f4e48 = 1
                                            else
                                                CommitTemporaryMoveBuffer(r0_55)
                                                data_1f4e48 = 1
                                                int32_t* r0_56 = data_1f5894
                                                
                                                if (r0_56 != 0
                                                        && &r0_56[3] u< data_1f5898 + data_1f589c)
                                                    r0_56[1] = 0x24
                                                    *r0_56 = 0xc
                                                    uint32_t r2_31 = *s_pWorldData
                                                    data_1f5894 = &r0_56[3]
                                                    data_1f5890 += 1
                                                    r0_56[2] = *(r2_31 + 0x1fc)
                                            
                                            break
                                
                                i_2 += 1
                                r4_1 += 0x30
                            while (i_2 s< *(r1_49 + 0xd4))
        
        r6 += 1
        
        if (r6 u< r8)
            continue
    
    if (zx.d(*s_bShowLoadingOverlay) == 0)
        break
    
    uint32_t r1_63 = *s_pWorldData
    int32_t r0_65 = *(r1_63 + 0x10c)
    int96_t entry_q0
    
    if (r0_65 == 0)
        unimplemented  {vmov.f32 s0, #2.000000}
    else
        entry_q0:8.d = r0_65
        entry_q0.d = *(r1_63 + (r10 << 2) + 0xfc)
        unimplemented  {vcvt.f32.u32 s2, s2}
        unimplemented  {vcvt.f32.u32 s0, s0}
        entry_q0.d = entry_q0.d f/ entry_q0:8.d
    
    int32_t* r0_66 = data_1f5894
    
    if (r0_66 != 0 && &r0_66[3] u< data_1f5898 + data_1f589c)
        *r0_66 = 0xc
        r0_66[1] = 0x23
        data_1f5894 = &r0_66[3]
        data_1f5890 += 1
        r0_66[2] = entry_q0.d
    
    break

if (*__stack_chk_guard == r1)
    return data_1f5890

__stack_chk_fail()
noreturn
