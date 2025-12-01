// 函数: _ZN14ascensionrules31CStateProcessAcquireFromTheVoid24SelectAcquireFromTheVoidER13CStateMachineP6CStateiPj
// 地址: 0x1241d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *__stack_chk_guard

if (arg3 != 0)
    int32_t r1_1 = *(arg2 + 0x258)
    
    if (r1_1 s>= 1)
        core::CCardInstance* r10_1 = *(arg2 + 0x24c)
        core::CCardInstance* r9_1 = *(r10_1 + 4)
        int32_t* r6_1 = *(arg2 + 0x25c) + 0xc
        int32_t r2_1 = 0
        
        do
            if (*(r6_1 - 0xc) == arg3)
                void* r5_1 = *(arg3 + 0xc)
                int32_t r1_2 = *r6_1
                uint32_t r12_1 = zx.d(r6_1[3].b)
                int32_t r2_2 = *(r5_1 + 0x88)
                int32_t r3_1 = *(r5_1 + 0xa0)
                int32_t var_2c_1
                
                if (r2_2 == 1)
                    if (zx.d(*(r9_1 + 0xb2c)) != 0)
                        int32_t r0_2 = *(r5_1 + 0xa4) + r1_2 - *(r6_1 - 4)
                        
                        if (r1_2 s> r0_2)
                            r1_2 = r0_2 & not.d(r0_2 s>> 0x1f)
                            r3_1 = 0
                    
                    var_2c_1 = r1_2
                    
                    if (r3_1 s>= 1)
                        goto label_1242ec
                    
                    goto label_124304
                
                var_2c_1 = r1_2
                
                if (r2_2 == 2 && ascension::CWorld::QueryCardFaction(r9_1, r10_1, arg3) != 0)
                    ascension::CWorld::RemoveCurrentTurnRunesForMechanaConstruct(r9_1)
                
                uint32_t r0_6
                uint32_t r6_3
                
                if (r3_1 s< 1)
                label_124304:
                    r0_6 = 0
                    
                    if (r12_1 != 0 || zx.d(*(r5_1 + 0xd5)) != 0 || zx.d(*(r9_1 + 0xb2b)) != 0)
                        r6_3 = 2
                    else
                        r6_3 = 0
                else
                label_1242ec:
                    r0_6 = zx.d(*(r9_1 + 0xb29))
                    
                    if (r0_6 != 0)
                        r0_6 = 4
                    
                    if (r12_1 != 0 || zx.d(*(r5_1 + 0xd5)) != 0 || zx.d(*(r9_1 + 0xb2b)) != 0)
                        r6_3 = 2
                    else
                        r6_3 = 0
                
                uint32_t r2_6 = 0
                uint32_t r1_7 = 0
                
                if (zx.d(*(r5_1 + 0xd6)) == 0)
                    goto label_12436c
                
                uint32_t r5_4
                
                if (zx.d(*(r9_1 + 0xb3d)) != 0)
                    r1_7 = 2
                    r5_4 = 2
                    
                    if (*(r9_1 + 0x30) u<= 0x17)
                        goto label_12436c
                    
                    goto label_12437c
                
                r1_7 = 2
            label_12436c:
                r5_4 = r6_3
                
                if (r6_3 != 0)
                label_12437c:
                    r2_6 = r5_4
                    
                    if (*(r9_1 + 0xb48) s> 0)
                        goto label_1243c0
                
                int32_t var_48
                uint32_t var_44
                uint32_t var_40
                uint32_t var_3c
                
                if (r1_7 == 0 || *(r10_1 + 0x8c) s<= 0)
                    if (r0_6 != 0)
                        r5_4 = r2_6
                    
                    if (r0_6 != 0 && *(r9_1 + 0xb40) s>= 1)
                        goto label_1243c0
                    
                    ascension::CWorld::RemoveCurrentTurnRunes(r9_1)
                    
                    if (r3_1 s>= 1)
                        ascension::CWorld::RemoveCurrentTurnPower(r9_1)
                else
                    r5_4 = r2_6
                label_1243c0:
                    var_48 = 0
                    var_44 = r0_6
                    var_40 = r5_4
                    var_3c = r1_7
                    ascensionrules::CreateStateMustPayResources(r10_1, arg3, var_2c_1, r3_1, 0, 
                        var_44, var_40, var_3c)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                
                if (ascension::CWorld::RemoveCardFromVoid(r9_1) != 0)
                    if (*(r9_1 + 0x30) u< 2)
                        core::CWorldBase::OutputMessageFormat(r9_1, "%s acquires %s\n", 
                            r10_1 + 0x10, r5_1 + 4, var_48, var_44, var_40, var_3c)
                        int32_t var_38_1 = 0
                        ascension::CWorld::OutputAnimationCard(r9_1, arg3, 3, 9, 0, 3, 
                            zx.d(*(r10_1 + 8)), 0)
                        int32_t* r0_22 = operator new(0xa0)
                        CState::CState()
                        *r0_22 = _vtable_for_ascensionrules::CStateProcessAcquireCard + 8
                        r0_22[0xc] = r10_1
                        r0_22[0xd] = arg3
                        r0_22[0xe] = _vtable_for_ascension::CEventAcquireCard + 8
                        r0_22[0xf] = 0x12
                        r0_22[0x10] = 0
                        r0_22[0x21] = r10_1
                        r0_22[0x22] = arg3
                        r0_22[0x23] = 0
                        r0_22[0x24] = 0
                        r0_22[0x25] = 0
                        r0_22[0x26].b = 1
                        r0_22[0x27] = 0
                        CStateMachine::PushOwnedState(arg1)
                    else
                        int32_t var_44_1 = 3
                        ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
                            operator new(0x990), r10_1, arg3, 9, 0)
                        CState::AddOwnedChild(arg2)
                        CStateList::AppendState(arg2)
                
                break
            
            r2_1 += 1
            r6_1 = &r6_1[0x11]
        while (r2_1 s< r1_1)

int32_t r0_25 = *__stack_chk_guard

if (r0_25 == r1)
    return r0_25 - r1

__stack_chk_fail()
noreturn
