// 函数: _Z16UpdateOnlineGamev
// 地址: 0x191698
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r9
int32_t var_10 = r9
int32_t r8
int32_t var_14 = r8
int32_t r7
int32_t var_18 = r7
int32_t r6
int32_t var_1c = r6
int32_t r5
int32_t var_20 = r5
int32_t r4
int32_t var_24 = r4
unimplemented  {vpush {d8}}
int32_t r7_1 = *(s_InterfaceContext + 0x10)
int32_t r1 = *__stack_chk_guard
core::CWorldBase::AddStateChangeListener(*(*s_pWorldData + r7_1 * 0x34 + 0x124), sub_191e3c)
GameOptionManager::SetOptionListEndCallback(*(*s_pWorldData + r7_1 * 0x34 + 0x134), 
    InterfaceOptionListEndListener)
uint32_t r0_6 = *s_pWorldData
int32_t r2_2 = *(r0_6 + 0x10c)

if (*(r0_6 + 0x114) u>= r2_2)
    uint32_t r1_3 = zx.d(*s_bShowLoadingOverlay)
    
    if (r1_3 == 0)
    label_1917f0:
        int32_t r10 = 0x1f4
        int32_t r8_1 = 0
        
        if (r1_3 == 0)
            r10 = 0xa
        
        while (true)
            int96_t entry_q0
            
            if (zx.d(data_1f4e48) == 0)
                if (*s_pWorldData != 0)
                    int32_t* r0_11 = **(s_InterfaceContext + 4)
                    
                    if (r0_11 != 0 && (*(*r0_11 + 0x14))() != 0)
                        uint32_t r1_8 = *s_pWorldData
                        int32_t r2_8 = *(r1_8 + 0x10c)
                        int32_t r0_17 = *(r1_8 + (r7_1 << 2) + 0xfc)
                        
                        if (r0_17 u>= r2_8)
                            int32_t r2_10 = *(r1_8 + 0x1f8)
                            
                            if (r2_10 u< *(r1_8 + 0x1fc) && r0_17 u< *(r1_8 + 0x114))
                                int32_t* r0_32 = **(s_InterfaceContext + 4)
                                
                                if (r0_32 != 0 &&
                                        (*(*r0_32 + 0x18))(r0_32, *(r1_8 + (r2_10 << 4) + 0x204)) != 0)
                                    uint32_t r0_34 = *s_pWorldData
                                    int32_t r1_21 = *(r0_34 + 0x200)
                                    bool cond:6_1 = r1_21 u< *(r0_34 + 0x1fc)
                                    *(r0_34 + 0x1f8) += 1
                                    
                                    if (cond:6_1)
                                        *(r0_34 + 0x1f8) = r1_21
                                        *(r0_34 + 0x1fc) = r1_21
                                        *(r0_34 + 0x200) = 0xffffffff
                                    
                                    SubmitMove(r1_8 + (r2_10 << 4) + 0x204)
                            else if (zx.d(*s_bShowLoadingOverlay) != 0 && r0_17 u< *(r1_8 + 0x114))
                                *s_bShowLoadingOverlay = 0
                                *(*(r1_8 + r7_1 * 0x34 + 0x124) + 0x10) = 0
                                int32_t* r0_49 = data_1f5894
                                
                                if (r0_49 != 0 && &r0_49[3] u< data_1f5898 + data_1f589c)
                                    r0_49[1] = 0x23
                                    *r0_49 = 0xc
                                    data_1f5894 = &r0_49[3]
                                    data_1f5890 += 1
                                    r0_49[2] = 0x40000000
                                
                                data_1f5890
                                break
                        else
                            int32_t* r3_7 = *(r1_8 + 0x120) + (r0_17 << 4)
                            
                            if (zx.d(*s_bShowLoadingOverlay) != 0)
                                if (r0_17 u< *(r1_8 + 0xa0c))
                                    goto label_1919a8
                                
                                *(*(r1_8 + r7_1 * 0x34 + 0x124) + 0x10) = 0
                                data_1f5888 = 0
                                data_1f588c = 0
                                int32_t* r1_34 = data_1f5894
                                
                                if (r1_34 != 0 && &r1_34[3] u< data_1f5898 + data_1f589c)
                                    r1_34[1] = 0x23
                                    *r1_34 = 0xc
                                    data_1f5894 = &r1_34[3]
                                    data_1f5890 += 1
                                    r1_34[2] = 0x40000000
                                
                                *s_bShowLoadingOverlay = 0
                                data_1f5890
                                break
                            
                            if (r0_17 + 1 u>= r2_8)
                                goto label_1919a8
                            
                            char __tp
                            clock_gettime(1, &__tp)
                            int32_t var_30
                            int32_t r2_14
                            int32_t r4_4
                            r2_14:r4_4 =
                                mulu.dp.d(0x3b9aca00, zx.d(__tp)) + (var_30 s>> 0x1f):var_30
                            int32_t r0_20 = data_1f5888
                            __aeabi_ul2d(r4_4 - r0_20, sbb.d(r2_14, data_1f588c, r4_4 u< r0_20))
                            unimplemented  {vmov d0, r0, r1}
                            entry_q0.q = entry_q0.q f* 1.0000000000000001e-09
                            uint32_t r0_23 = zx.d(r3_7[2].w)
                            void* const r0_24 = &data_1d4424
                            
                            if (r0_23 == 0xa001)
                                r0_24 = &data_1d4418
                            
                            entry_q0:8.d = *(r0_24 + (data_1e4094 << 2))
                            unimplemented  {vcvt.f64.f32 d1, s2}
                            unimplemented  {vcmpe.f64 d0, d1}
                            unimplemented  {vmrs apsr_nzcv, fpscr}
                            
                            if (r0_23 - 0xa001 s>= 0)
                                data_1f5888 = r4_4
                                data_1f588c = r2_14
                            label_1919a8:
                                int32_t* r0_27 = **(s_InterfaceContext + 4)
                                
                                if (r0_27 != 0 && (*(*r0_27 + 0x18))(r0_27, *r3_7) != 0)
                                    uint32_t r0_29 = *s_pWorldData
                                    *(r0_29 + (r7_1 << 2) + 0xfc) += 1
                                    int32_t r2_19 = *(r0_29 + 0x110)
                                    
                                    if (r2_19 u< *(r0_29 + 0x10c))
                                        *(r0_29 + (r7_1 << 2) + 0xfc) = r2_19
                                        *(r0_29 + 0x10c) = *(r0_29 + 0x110)
                                        *(r0_29 + 0x110) = 0xffffffff
                                    
                                    SubmitMove(r3_7)
                
                *(s_InterfaceContext + 4)
                CStateMachine::Update()
                uint32_t r0_14 = zx.d(*(*s_InterfaceContext + 0x11))
                
                if (r0_14 != 0)
                    CommitTemporaryMoveBuffer(r0_14)
                    
                    if (zx.d(*s_bShowLoadingOverlay) != 0)
                        void* r0_39 = *s_pWorldData + r7_1 * 0x34
                        *s_bShowLoadingOverlay = 0
                        *(*(r0_39 + 0x124) + 0x10) = 0
                        int32_t* r0_41 = data_1f5894
                        
                        if (r0_41 != 0 && &r0_41[3] u< data_1f5898 + data_1f589c)
                            r0_41[1] = 0x23
                            *r0_41 = 0xc
                            data_1f5894 = &r0_41[3]
                            data_1f5890 += 1
                            r0_41[2] = 0x40000000
                    
                    goto label_191bfc
                
                r8_1 += 1
                
                if (r8_1 u< r10)
                    continue
            
            if (zx.d(*s_bShowLoadingOverlay) == 0)
                goto label_191bfc
            
            uint32_t r1_22 = *s_pWorldData
            int32_t r0_36 = *(r1_22 + 0x10c)
            
            if (r0_36 == 0)
                unimplemented  {vmov.f32 s0, #2.000000}
            else
                entry_q0:8.d = r0_36
                entry_q0.d = *(r1_22 + (r7_1 << 2) + 0xfc)
                unimplemented  {vcvt.f32.u32 s2, s2}
                unimplemented  {vcvt.f32.u32 s0, s0}
                entry_q0.d = entry_q0.d f/ entry_q0:8.d
            
            int32_t* r0_42 = data_1f5894
            
            if (r0_42 != 0 && &r0_42[3] u< data_1f5898 + data_1f589c)
                *r0_42 = 0xc
                r0_42[1] = 0x23
                data_1f5894 = &r0_42[3]
                data_1f5890 += 1
                r0_42[2] = entry_q0.d
            
            goto label_191bfc
    else if (*(r0_6 + 0x118) u>= r2_2)
        int32_t r2_3 = *(r0_6 + 0xa0c)
        
        if (r2_3 != 0 && *(r0_6 + (r7_1 << 2) + 0xfc) u<= r2_3)
            goto label_1917f0
        
        *(*(r0_6 + r7_1 * 0x34 + 0x124) + 0x10) = 0
        int32_t* r1_5 = data_1f5894
        
        if (r1_5 != 0 && &r1_5[3] u< data_1f5898 + data_1f589c)
            r1_5[1] = 0x23
            *r1_5 = 0xc
            data_1f5894 = &r1_5[3]
            data_1f5890 += 1
            r1_5[2] = 0x40000000
        
        *s_bShowLoadingOverlay = 0
    label_191bfc:
        data_1f5890

if (*__stack_chk_guard == r1)
    unimplemented  {vpopeq {d8}}
    int32_t entry_r10
    jump(entry_r10)

__stack_chk_fail()
noreturn
