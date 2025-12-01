// 函数: _ZN14ascensionrules31CStateProcessAcquireFromTheVoid32SelectAcquireFromTheVoidIntoPlayER13CStateMachineP6CStateiPj
// 地址: 0x124bd8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (arg3 != 0)
    int32_t r0_1 = *(arg2 + 0x258)
    
    if (r0_1 s>= 1)
        ascension::CPlayer* r12_1 = *(arg2 + 0x24c)
        ascension::CPlayer* r9_1 = *(r12_1 + 4)
        int32_t* r10_1 = *(arg2 + 0x25c) + 0x40
        int32_t r1_1 = 0
        
        do
            if (*(r10_1 - 0x40) == arg3)
                void* r3 = *r10_1
                uint32_t __n = *(r10_1 - 0x24)
                uint32_t lr_1 = zx.d(*(r10_1 + r3 - 0x18))
                int32_t r0_2 = *(r10_1 - 0x34)
                void* r6_1 = *(arg3 + 0xc)
                uint32_t r7_1 = zx.d(*(r10_1 - 0x28))
                ascension::CPlayer* var_30_1 = r12_1
                int32_t r2_3
                
                if (lr_1 != 0 && *(r9_1 + 0x30) u>= 0x18)
                    r2_3 = *(r12_1 + 0x8c)
                    
                    if (zx.d(*(r9_1 + 0xb3d)) != 0)
                        r12_1 = var_30_1
                        r2_3 += *(r9_1 + 0xb48)
                        
                        if (zx.d(*(r9_1 + 0xb29)) != 0)
                            r2_3 += *(r9_1 + 0xb40)
                
                if (lr_1 == 0 || *(r9_1 + 0x30) u< 0x18 || r2_3 s>= lr_1)
                    int32_t r2_4 = *(r6_1 + 0x88)
                    int32_t r3_4 = *(r6_1 + 0xa0)
                    int32_t var_2c_1
                    
                    if (r2_4 == 1)
                        if (zx.d(*(r9_1 + 0xb2c)) != 0)
                            int32_t r1_4 = *(r6_1 + 0xa4) + r0_2 - *(r10_1 - 0x38)
                            
                            if (r0_2 s> r1_4)
                                r0_2 = r1_4 & not.d(r1_4 s>> 0x1f)
                                r3_4 = 0
                        
                        var_2c_1 = r0_2
                        
                        if (r3_4 s>= 1)
                            goto label_124d50
                        
                        goto label_124d68
                    
                    var_2c_1 = r0_2
                    
                    if (r2_4 == 2)
                        if (ascension::CWorld::QueryCardFaction(r9_1, r12_1, arg3) != 0)
                            ascension::CWorld::RemoveCurrentTurnRunesForMechanaConstruct(r9_1)
                        
                        r12_1 = var_30_1
                    
                    uint32_t r0_6
                    uint32_t r2_8
                    
                    if (r3_4 s< 1)
                    label_124d68:
                        r0_6 = 0
                        
                        if (r7_1 != 0 || zx.d(*(r6_1 + 0xd5)) != 0 || zx.d(*(r9_1 + 0xb2b)) != 0)
                            r2_8 = 2
                        else
                            r2_8 = 0
                    else
                    label_124d50:
                        r0_6 = zx.d(*(r9_1 + 0xb29))
                        
                        if (r0_6 != 0)
                            r0_6 = 4
                        
                        if (r7_1 != 0 || zx.d(*(r6_1 + 0xd5)) != 0 || zx.d(*(r9_1 + 0xb2b)) != 0)
                            r2_8 = 2
                        else
                            r2_8 = 0
                    
                    uint32_t r6_2 = 0
                    uint32_t r1_9 = 0
                    
                    if (zx.d(*(r6_1 + 0xd6)) == 0)
                        goto label_124dcc
                    
                    uint32_t r7_4
                    
                    if (zx.d(*(r9_1 + 0xb3d)) != 0)
                        r1_9 = 2
                        r7_4 = 2
                        
                        if (*(r9_1 + 0x30) u<= 0x17)
                            goto label_124dcc
                        
                        goto label_124dd8
                    
                    r1_9 = 2
                label_124dcc:
                    r7_4 = r2_8
                    
                    if (r2_8 != 0)
                    label_124dd8:
                        r6_2 = r7_4
                        
                        if (*(r9_1 + 0xb48) s> 0)
                            goto label_124e34
                    
                    if (r1_9 == 0 || *(r12_1 + 0x8c) s<= 0)
                        if (r0_6 != 0)
                            r7_4 = r6_2
                        
                        if (r0_6 != 0 && *(r9_1 + 0xb40) s>= 1)
                            goto label_124e34
                        
                        ascension::CWorld::RemoveCurrentTurnRunes(r9_1)
                        
                        if (r3_4 s>= 1)
                            ascension::CWorld::RemoveCurrentTurnPower(r9_1)
                    else
                        r7_4 = r6_2
                    label_124e34:
                        ascensionrules::CreateStateMustPayResources(r12_1, arg3, var_2c_1, r3_4, 0, 
                            r0_6, r7_4, r1_9)
                        CState::AddOwnedChild(arg2)
                        CStateList::AppendState(arg2)
                    
                    if (ascension::CWorld::RemoveCardFromVoid(r9_1) != 0)
                        void* r0_13 = r3
                        
                        if (r0_13 == 0xffffffff)
                            r0_13 = memchr(r10_1 - 0x20, 4, __n) - (r10_1 - 0x20)
                        
                        if (zx.d(*(r10_1 + (r0_13 << 1) - 0x10)) != 0)
                            core::CWorldBase::GetInstanceByID(r9_1)
                            ascension::CWorld::PlayActiveEffect(r9_1)
                        
                        if (lr_1 != 0 && *(r9_1 + 0x30) u>= 0x18)
                            uint32_t r0_22
                            uint32_t r3_6
                            
                            if (zx.d(*(r9_1 + 0xb3d)) != 0)
                                r3_6 = zx.d(*(r9_1 + 0xb29))
                                r0_22 = r3_6
                                
                                if (r3_6 != 0)
                                    r0_22 = 8
                            
                            if (zx.d(*(r9_1 + 0xb3d)) == 0 ||
                                    (*(r9_1 + 0xb48) s<= 0 && (r3_6 == 0 || *(r9_1 + 0xb40) s< 1)))
                                ascension::CPlayer::RemoveInsightCount(var_30_1)
                            else
                                ascensionrules::CreateStateMustPayResources(var_30_1, arg3, 0, 0, 
                                    lr_1, r0_22, 8, 0)
                                CState::AddOwnedChild(arg2)
                                CStateList::AppendState(arg2)
                        
                        int32_t var_4c_3 = 4
                        ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
                            operator new(0x990), var_30_1, arg3, 9, 0)
                        CState::AddOwnedChild(arg2)
                        CStateList::AppendState(arg2)
                
                break
            
            r1_1 += 1
            r10_1 = &r10_1[0x11]
        while (r1_1 s< r0_1)

int32_t r0_34 = *__stack_chk_guard

if (r0_34 == r0)
    return r0_34 - r0

__stack_chk_fail()
noreturn
