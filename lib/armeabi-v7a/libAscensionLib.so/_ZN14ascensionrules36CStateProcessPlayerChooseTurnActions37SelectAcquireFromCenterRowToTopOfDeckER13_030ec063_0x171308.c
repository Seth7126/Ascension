// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions37SelectAcquireFromCenterRowToTopOfDeckER13CStateMachineP6CStateiPj
// 地址: 0x171308
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
ascension::CPlayer* r0_1 = *(arg2 + 0x24c)
int32_t r5 = *(r0_1 + 4)
core::CCardInstance* r0_3 = core::CWorldBase::GetInstanceByID(r5)
int32_t r9 = 0

if (ascension::CWorld::GetCenterRowCard(r5) != r0_3)
    r9 = 1
    
    if (ascension::CWorld::GetCenterRowCard(r5) != r0_3)
        r9 = 2
        
        if (ascension::CWorld::GetCenterRowCard(r5) != r0_3)
            r9 = 3
            
            if (ascension::CWorld::GetCenterRowCard(r5) != r0_3)
                r9 = 4
                
                if (ascension::CWorld::GetCenterRowCard(r5) != r0_3)
                    r9 = 5
                    
                    if (ascension::CWorld::GetCenterRowCard(r5) != r0_3)
                        r9 = 7
                        
                        if (ascension::CWorld::GetCenterRowCard(r5) == r0_3)
                            r9 = 6

if (r0_3 != 0)
    int32_t r0_18 = *(arg2 + 0x254)
    
    if (r0_18 s>= 1)
        int32_t r8_1 = 0
        int32_t r1_8 = 0
        
        do
            void* r10_1 = arg2 + r8_1
            
            if (*(r10_1 + 0x258) == r0_3)
                void* r0_19 = *(r10_1 + 0x298)
                
                if (r0_19 == 0xffffffff)
                    r0_19 = memchr(r10_1 + 0x278, 2, *(r10_1 + 0x274)) - (r10_1 + 0x278)
                
                if (zx.d(*(arg2 + (r0_19 << 1) + r8_1 + 0x288)) != 0)
                    core::CWorldBase::GetInstanceByID(r5)
                    ascension::CWorld::PlayActiveEffect(r5)
                
                void* r7_2 = *(r0_3 + 0xc)
                int32_t r0_27 = *(r10_1 + 0x264)
                uint32_t r12_1 = zx.d(*(r10_1 + 0x270))
                int32_t r1_11 = *(r7_2 + 0x88)
                int32_t r3 = *(r7_2 + 0xa0)
                int32_t var_2c_1
                
                if (r1_11 == 1)
                    if (zx.d(*(r5 + 0xb2c)) != 0)
                        int32_t r1_15 = *(r7_2 + 0xa4) + r0_27 - *(r10_1 + 0x260)
                        
                        if (r0_27 s> r1_15)
                            r0_27 = r1_15 & not.d(r1_15 s>> 0x1f)
                            r3 = 0
                    
                    var_2c_1 = r0_27
                    goto label_171528
                
                var_2c_1 = r0_27
                ascension::CPlayer* r8_2
                
                if (r1_11 == 2)
                    r8_2 = r0_1
                    
                    if (ascension::CWorld::QueryCardFaction(r5, r8_2, r0_3) != 0)
                        ascension::CWorld::RemoveCurrentTurnRunesForMechanaConstruct(r5)
                    
                    if (r3 s>= 1)
                        goto label_171534
                    
                    goto label_171518
                
            label_171528:
                r8_2 = r0_1
                uint32_t r2_4
                uint32_t lr_1
                
                if (r3 s< 1)
                label_171518:
                    lr_1 = 0
                    
                    if (r12_1 != 0 || zx.d(*(r7_2 + 0xd5)) != 0 || zx.d(*(r5 + 0xb2b)) != 0)
                        r2_4 = 2
                    else
                        r2_4 = 0
                else
                label_171534:
                    lr_1 = zx.d(*(r5 + 0xb29))
                    
                    if (lr_1 != 0)
                        lr_1 = 4
                    
                    if (r12_1 != 0 || zx.d(*(r7_2 + 0xd5)) != 0 || zx.d(*(r5 + 0xb2b)) != 0)
                        r2_4 = 2
                    else
                        r2_4 = 0
                
                uint32_t r12_2 = 0
                uint32_t r1_20 = 0
                
                if (zx.d(*(r7_2 + 0xd6)) == 0)
                    goto label_1715a8
                
                uint32_t r0_32
                
                if (zx.d(*(r5 + 0xb3d)) != 0)
                    r1_20 = 2
                    r0_32 = 2
                    
                    if (*(r5 + 0x30) u<= 0x16)
                        goto label_1715a8
                    
                    goto label_1715b4
                
                r1_20 = 2
            label_1715a8:
                r0_32 = r2_4
                
                if (r2_4 != 0)
                label_1715b4:
                    r12_2 = r0_32
                    
                    if (*(r5 + 0xb48) s> 0)
                        goto label_171610
                
                if (r1_20 == 0 || *(r8_2 + 0x8c) s<= 0)
                    if (lr_1 != 0)
                        r0_32 = r12_2
                    
                    if (lr_1 != 0 && *(r5 + 0xb40) s>= 1)
                        goto label_171610
                    
                    ascension::CWorld::RemoveCurrentTurnRunes(r5)
                    
                    if (r3 s>= 1)
                        ascension::CWorld::RemoveCurrentTurnPower(r5)
                else
                    r0_32 = r12_2
                label_171610:
                    ascensionrules::CreateStateMustPayResources(r8_2, r0_3, var_2c_1, r3, 0, lr_1, 
                        r0_32, r1_20)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                
                ascensionrules::CreateStateProcessAcquireCardSequence(r8_2, r0_3, 7, r9, 2, 
                    nullptr, 0)
                CState::AddOwnedChild(arg2)
                CStateList::AppendState(arg2)
                break
            
            r1_8 += 1
            r8_1 += 0x44
        while (r1_8 s< r0_18)

int32_t r0_41 = *__stack_chk_guard

if (r0_41 == r0)
    return r0_41 - r0

__stack_chk_fail()
noreturn
