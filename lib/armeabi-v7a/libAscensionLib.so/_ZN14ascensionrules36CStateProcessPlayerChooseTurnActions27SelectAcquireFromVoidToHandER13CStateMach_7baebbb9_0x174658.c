// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions27SelectAcquireFromVoidToHandER13CStateMachineP6CStateiPj
// 地址: 0x174658
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
core::CCardInstance* r9 = *(arg2 + 0x24c)
ascension::CActiveEffectInstance* r4 = *(r9 + 4)
core::CCardInstance* r0_2 = core::CWorldBase::GetInstanceByID(r4)

if (r0_2 != 0)
    int32_t r0_3 = *(arg2 + 0xef4)
    
    if (r0_3 s>= 1)
        int32_t* r8_1 = *(arg2 + 0xef8)
        int32_t r10_1 = 0
        int32_t r1_1 = 0
        
        do
            if (*(r8_1 + r10_1) == r0_2)
                void* r1_2 = r8_1 + r10_1
                void* r0_4 = *(r1_2 + 0x40)
                
                if (r0_4 == 0xffffffff)
                    r0_4 = memchr(r1_2 + 0x20, 1, *(r1_2 + 0x1c)) - (r1_2 + 0x20)
                
                if (zx.d(*(r8_1 + (r0_4 << 1) + r10_1 + 0x30)) != 0)
                    core::CWorldBase::GetInstanceByID(r4)
                    ascension::CWorld::PlayActiveEffect(r4)
                    r8_1 = *(arg2 + 0xef8)
                
                void* r6_2 = *(r0_2 + 0xc)
                void* r1_5 = r8_1 + r10_1
                int32_t r0_12 = *(r1_5 + 0xc)
                int32_t r2_2 = *(r6_2 + 0x88)
                uint32_t r8_2 = zx.d(*(r1_5 + 0x18))
                int32_t r10_2 = *(r6_2 + 0xa0)
                int32_t var_2c_1
                
                if (r2_2 == 1)
                    if (zx.d(*(r4 + 0xb2c)) != 0)
                        int32_t r1_8 = *(r6_2 + 0xa4) + r0_12 - *(r1_5 + 8)
                        
                        if (r0_12 s> r1_8)
                            r0_12 = r1_8 & not.d(r1_8 s>> 0x1f)
                            r10_2 = 0
                    
                    var_2c_1 = r0_12
                    
                    if (r10_2 s>= 1)
                        goto label_1747b8
                    
                    goto label_1747d0
                
                var_2c_1 = r0_12
                
                if (r2_2 == 2 && ascension::CWorld::QueryCardFaction(r4, r9, r0_2) != 0)
                    ascension::CWorld::RemoveCurrentTurnRunesForMechanaConstruct(r4)
                
                uint32_t r0_16
                uint32_t r2_6
                
                if (r10_2 s< 1)
                label_1747d0:
                    r0_16 = 0
                    
                    if (r8_2 != 0 || zx.d(*(r6_2 + 0xd5)) != 0 || zx.d(*(r4 + 0xb2b)) != 0)
                        r2_6 = 2
                    else
                        r2_6 = 0
                else
                label_1747b8:
                    r0_16 = zx.d(*(r4 + 0xb29))
                    
                    if (r0_16 != 0)
                        r0_16 = 4
                    
                    if (r8_2 != 0 || zx.d(*(r6_2 + 0xd5)) != 0 || zx.d(*(r4 + 0xb2b)) != 0)
                        r2_6 = 2
                    else
                        r2_6 = 0
                
                uint32_t r6_3 = 0
                uint32_t r1_13 = 0
                
                if (zx.d(*(r6_2 + 0xd6)) == 0)
                    goto label_174834
                
                uint32_t r3_2
                
                if (zx.d(*(r4 + 0xb3d)) != 0)
                    r1_13 = 2
                    r3_2 = 2
                    
                    if (*(r4 + 0x30) u<= 0x16)
                        goto label_174834
                    
                    goto label_174840
                
                r1_13 = 2
            label_174834:
                r3_2 = r2_6
                
                if (r2_6 != 0)
                label_174840:
                    r6_3 = r3_2
                    
                    if (*(r4 + 0xb48) s> 0)
                        goto label_1748a0
                
                if (r1_13 == 0 || *(r9 + 0x8c) s<= 0)
                    if (r0_16 != 0)
                        r3_2 = r6_3
                    
                    if (r0_16 != 0 && *(r4 + 0xb40) s>= 1)
                        goto label_1748a0
                    
                    ascension::CWorld::RemoveCurrentTurnRunes(r4)
                    
                    if (r10_2 s>= 1)
                        ascension::CWorld::RemoveCurrentTurnPower(r4)
                else
                    r3_2 = r6_3
                label_1748a0:
                    ascensionrules::CreateStateMustPayResources(r9, r0_2, var_2c_1, r10_2, 0, 
                        r0_16, r3_2, r1_13)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                
                ascensionrules::CreateStateProcessAcquireCardSequence(r9, r0_2, 9, 0, 1, nullptr, 0)
                CState::AddOwnedChild(arg2)
                CStateList::AppendState(arg2)
                ascension::CWorld::RemoveAcquireHeroFromVoid(r4)
                break
            
            r1_1 += 1
            r10_1 += 0x44
        while (r1_1 s< r0_3)

int32_t r0_26 = *__stack_chk_guard

if (r0_26 == r0)
    return r0_26 - r0

__stack_chk_fail()
noreturn
