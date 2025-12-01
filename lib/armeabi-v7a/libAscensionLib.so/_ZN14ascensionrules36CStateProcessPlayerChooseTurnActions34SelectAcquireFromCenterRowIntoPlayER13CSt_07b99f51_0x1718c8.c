// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions34SelectAcquireFromCenterRowIntoPlayER13CStateMachineP6CStateiPj
// 地址: 0x1718c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
ascension::CPlayer* r0_1 = *(arg2 + 0x24c)
int32_t r5 = *(r0_1 + 4)
core::CInstance* r0_3 = core::CWorldBase::GetInstanceByID(r5)
int32_t r10 = 0

if (ascension::CWorld::GetCenterRowCard(r5) != r0_3)
    r10 = 1
    
    if (ascension::CWorld::GetCenterRowCard(r5) != r0_3)
        r10 = 2
        
        if (ascension::CWorld::GetCenterRowCard(r5) != r0_3)
            r10 = 3
            
            if (ascension::CWorld::GetCenterRowCard(r5) != r0_3)
                r10 = 4
                
                if (ascension::CWorld::GetCenterRowCard(r5) != r0_3)
                    r10 = 5
                    
                    if (ascension::CWorld::GetCenterRowCard(r5) != r0_3)
                        r10 = 7
                        
                        if (ascension::CWorld::GetCenterRowCard(r5) == r0_3)
                            r10 = 6

if (r0_3 != 0)
    int32_t r0_18 = *(arg2 + 0x254)
    
    if (r0_18 s>= 1)
        int32_t r8_1 = 0
        int32_t r1_8 = 0
        
        do
            void* r9_1 = arg2 + r8_1
            
            if (*(r9_1 + 0x258) == r0_3)
                void* r0_19 = *(r9_1 + 0x298)
                
                if (r0_19 == 0xffffffff)
                    r0_19 = memchr(r9_1 + 0x278, 4, *(r9_1 + 0x274)) - (r9_1 + 0x278)
                
                uint32_t r3 = zx.d(*(arg2 + r0_19 + r8_1 + 0x280))
                int32_t r1_12
                
                if (r3 != 0)
                    r1_12 = *(r0_1 + 0x8c)
                    
                    if (zx.d(*(r5 + 0xb3d)) != 0)
                        r1_12 += *(r5 + 0xb48)
                        
                        if (zx.d(*(r5 + 0xb29)) != 0)
                            r1_12 += *(r5 + 0xb40)
                
                if (r3 == 0 || r1_12 s>= r3)
                    if (zx.d(*(arg2 + (r0_19 << 1) + r8_1 + 0x288)) != 0)
                        core::CWorldBase::GetInstanceByID(r5)
                        ascension::CWorld::PlayActiveEffect(r5)
                    
                    void* r7_2 = *(r0_3 + 0xc)
                    int32_t r0_27 = *(r9_1 + 0x264)
                    uint32_t lr_1 = zx.d(*(r9_1 + 0x270))
                    int32_t r1_15 = *(r7_2 + 0x88)
                    int32_t r3_1 = *(r7_2 + 0xa0)
                    int32_t var_2c_1
                    
                    if (r1_15 == 1)
                        if (zx.d(*(r5 + 0xb2c)) != 0)
                            int32_t r1_19 = *(r7_2 + 0xa4) + r0_27 - *(r9_1 + 0x260)
                            
                            if (r0_27 s> r1_19)
                                r0_27 = r1_19 & not.d(r1_19 s>> 0x1f)
                                r3_1 = 0
                        
                        var_2c_1 = r0_27
                        goto label_171b3c
                    
                    var_2c_1 = r0_27
                    ascension::CPlayer* r8_2
                    
                    if (r1_15 == 2)
                        r8_2 = r0_1
                        
                        if (ascension::CWorld::QueryCardFaction(r5, r8_2, r0_3) != 0)
                            ascension::CWorld::RemoveCurrentTurnRunesForMechanaConstruct(r5)
                        
                        if (r3_1 s>= 1)
                            goto label_171b48
                        
                        goto label_171b2c
                    
                label_171b3c:
                    r8_2 = r0_1
                    uint32_t r2_7
                    uint32_t r12_2
                    
                    if (r3_1 s< 1)
                    label_171b2c:
                        r12_2 = 0
                        
                        if (lr_1 != 0 || zx.d(*(r7_2 + 0xd5)) != 0 || zx.d(*(r5 + 0xb2b)) != 0)
                            r2_7 = 2
                        else
                            r2_7 = 0
                    else
                    label_171b48:
                        r12_2 = zx.d(*(r5 + 0xb29))
                        
                        if (r12_2 != 0)
                            r12_2 = 4
                        
                        if (lr_1 != 0 || zx.d(*(r7_2 + 0xd5)) != 0 || zx.d(*(r5 + 0xb2b)) != 0)
                            r2_7 = 2
                        else
                            r2_7 = 0
                    
                    uint32_t r7_3 = 0
                    uint32_t r1_24 = 0
                    
                    if (zx.d(*(r7_2 + 0xd6)) == 0)
                        goto label_171bb4
                    
                    uint32_t r0_32
                    
                    if (zx.d(*(r5 + 0xb3d)) != 0)
                        r1_24 = 2
                        r0_32 = 2
                        
                        if (*(r5 + 0x30) u<= 0x16)
                            goto label_171bb4
                        
                        goto label_171bc0
                    
                    r1_24 = 2
                label_171bb4:
                    r0_32 = r2_7
                    
                    if (r2_7 != 0)
                    label_171bc0:
                        r7_3 = r0_32
                        
                        if (*(r5 + 0xb48) s> 0)
                            goto label_171c1c
                    
                    if (r1_24 == 0 || *(r8_2 + 0x8c) s<= 0)
                        if (r12_2 != 0)
                            r0_32 = r7_3
                        
                        if (r12_2 != 0 && *(r5 + 0xb40) s>= 1)
                            goto label_171c1c
                        
                        ascension::CWorld::RemoveCurrentTurnRunes(r5)
                        
                        if (r3_1 s>= 1)
                            ascension::CWorld::RemoveCurrentTurnPower(r5)
                    else
                        r0_32 = r7_3
                    label_171c1c:
                        ascensionrules::CreateStateMustPayResources(r8_2, r0_3, var_2c_1, r3_1, 0, 
                            r12_2, r0_32, r1_24)
                        CState::AddOwnedChild(arg2)
                        CStateList::AppendState(arg2)
                    
                    if (r3 != 0)
                        if (zx.d(*(r5 + 0xb3d)) == 0 || *(r5 + 0xb48) s< 1)
                            ascension::CPlayer::RemoveInsightCount(r8_2)
                        else
                            uint32_t r0_39 = zx.d(*(r5 + 0xb29))
                            
                            if (r0_39 != 0)
                                r0_39 = 8
                            
                            ascensionrules::CreateStateMustPayResources(r8_2, r0_3, 0, 0, r3, 
                                r0_39, 8, 0)
                            CState::AddOwnedChild(arg2)
                            CStateList::AppendState(arg2)
                    
                    ascensionrules::CreateStateProcessAcquireCardSequence(r8_2, r0_3, 7, r10, 4, 
                        nullptr, 0)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                
                break
            
            r1_8 += 1
            r8_1 += 0x44
        while (r1_8 s< r0_18)

int32_t r0_49 = *__stack_chk_guard

if (r0_49 == r0)
    return r0_49 - r0

__stack_chk_fail()
noreturn
