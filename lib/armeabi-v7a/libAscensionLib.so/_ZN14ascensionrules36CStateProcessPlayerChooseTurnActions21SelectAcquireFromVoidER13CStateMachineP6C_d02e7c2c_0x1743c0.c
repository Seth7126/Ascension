// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions21SelectAcquireFromVoidER13CStateMachineP6CStateiPj
// 地址: 0x1743c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
ascension::CPlayer* r9 = *(arg2 + 0x24c)
ascension::CPlayer* r4 = *(r9 + 4)
core::CInstance* r0_2 = core::CWorldBase::GetInstanceByID(r4)

if (r0_2 != 0)
    int32_t r1_1 = *(arg2 + 0xef4)
    
    if (r1_1 s>= 1)
        int32_t r2 = 0
        int32_t* r0_4 = *(arg2 + 0xef8) + 0xc
        
        do
            if (*(r0_4 - 0xc) == r0_2)
                void* r6_1 = *(r0_2 + 0xc)
                int32_t r1_2 = *r0_4
                uint32_t r3_1 = zx.d(r0_4[3].b)
                int32_t r2_1 = *(r6_1 + 0x88)
                int32_t r8_1 = *(r6_1 + 0xa0)
                int32_t var_2c_1
                
                if (r2_1 == 1)
                    if (zx.d(*(r4 + 0xb2c)) != 0)
                        int32_t r0_7 = *(r6_1 + 0xa4) + r1_2 - *(r0_4 - 4)
                        
                        if (r1_2 s> r0_7)
                            r1_2 = r0_7 & not.d(r0_7 s>> 0x1f)
                            r8_1 = 0
                    
                    var_2c_1 = r1_2
                    
                    if (r8_1 s>= 1)
                        goto label_1744d0
                    
                    goto label_1744e8
                
                var_2c_1 = r1_2
                
                if (r2_1 == 2 && ascension::CWorld::QueryCardFaction(r4, r9, r0_2) != 0)
                    ascension::CWorld::RemoveCurrentTurnRunesForMechanaConstruct(r4)
                
                uint32_t r0_11
                uint32_t r1_6
                
                if (r8_1 s< 1)
                label_1744e8:
                    r0_11 = 0
                    
                    if (r3_1 != 0 || zx.d(*(r6_1 + 0xd5)) != 0 || zx.d(*(r4 + 0xb2b)) != 0)
                        r1_6 = 2
                    else
                        r1_6 = 0
                else
                label_1744d0:
                    r0_11 = zx.d(*(r4 + 0xb29))
                    
                    if (r0_11 != 0)
                        r0_11 = 4
                    
                    if (r3_1 != 0 || zx.d(*(r6_1 + 0xd5)) != 0 || zx.d(*(r4 + 0xb2b)) != 0)
                        r1_6 = 2
                    else
                        r1_6 = 0
                
                uint32_t r3_3
                
                if (zx.d(*(r6_1 + 0xd6)) == 0)
                    r3_3 = 0
                else
                    r3_3 = 2
                    
                    if (zx.d(*(r4 + 0xb3d)) != 0 && *(r4 + 0x30) u> 0x16)
                        r1_6 = 2
                
                if (var_2c_1 + r8_1 s>= 1)
                    if ((r1_6 == 0 || *(r4 + 0xb48) s<= 0) && (r3_3 == 0 || *(r9 + 0x8c) s<= 0)
                            && (r0_11 == 0 || *(r4 + 0xb40) s< 1))
                        ascension::CWorld::RemoveCurrentTurnRunes(r4)
                        
                        if (r8_1 s>= 1)
                            ascension::CWorld::RemoveCurrentTurnPower(r4)
                    else
                        ascensionrules::CreateStateMustPayResources(r9, r0_2, var_2c_1, r8_1, 0, 
                            r0_11, r1_6, r3_3)
                        CState::AddOwnedChild(arg2)
                        CStateList::AppendState(arg2)
                
                ascensionrules::CreateStateProcessAcquireCardSequence(r9, r0_2, 9, 0, 3, nullptr, 0)
                CState::AddOwnedChild(arg2)
                CStateList::AppendState(arg2)
                ascension::CWorld::RemoveAcquireHeroFromVoid(r4)
                break
            
            r2 += 1
            r0_4 = &r0_4[0x11]
        while (r2 s< r1_1)

int32_t r0_21 = *__stack_chk_guard

if (r0_21 == r0)
    return r0_21 - r0

__stack_chk_fail()
noreturn
