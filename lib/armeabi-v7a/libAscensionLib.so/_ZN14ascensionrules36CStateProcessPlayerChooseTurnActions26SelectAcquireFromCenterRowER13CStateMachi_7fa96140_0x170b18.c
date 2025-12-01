// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions26SelectAcquireFromCenterRowER13CStateMachineP6CStateiPj
// 地址: 0x170b18
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
ascension::CPlayer* r8 = *(arg2 + 0x24c)
int32_t r5 = *(r8 + 4)
core::CInstance* r0_2 = core::CWorldBase::GetInstanceByID(r5)
int32_t r10 = 0

if (ascension::CWorld::GetCenterRowCard(r5) != r0_2)
    r10 = 1
    
    if (ascension::CWorld::GetCenterRowCard(r5) != r0_2)
        r10 = 2
        
        if (ascension::CWorld::GetCenterRowCard(r5) != r0_2)
            r10 = 3
            
            if (ascension::CWorld::GetCenterRowCard(r5) != r0_2)
                r10 = 4
                
                if (ascension::CWorld::GetCenterRowCard(r5) != r0_2)
                    r10 = 5
                    
                    if (ascension::CWorld::GetCenterRowCard(r5) != r0_2)
                        r10 = 7
                        
                        if (ascension::CWorld::GetCenterRowCard(r5) == r0_2)
                            r10 = 6

if (r0_2 != 0)
    int32_t r1_8 = *(arg2 + 0x254)
    
    if (r1_8 s>= 1)
        void* __offset(CState, 0x270) r0_17 = arg2 + 0x270
        int32_t r2 = 0
        
        do
            if (*(r0_17 - 0x18) == r0_2)
                void* r7_1 = *(r0_2 + 0xc)
                int32_t r2_1 = *(r0_17 - 0xc)
                uint32_t r3_1 = zx.d(*r0_17)
                int32_t r1_9 = *(r7_1 + 0x88)
                int32_t r9_1 = *(r7_1 + 0xa0)
                int32_t var_2c_1
                uint32_t r0_24
                
                if (r1_9 != 1)
                    var_2c_1 = r2_1
                    
                    if (r1_9 == 2 && ascension::CWorld::QueryCardFaction(r5, r8, r0_2) != 0)
                        ascension::CWorld::RemoveCurrentTurnRunesForMechanaConstruct(r5)
                    
                    if (r9_1 s< 1)
                        r0_24 = 0
                    else
                    label_170cd4:
                        r0_24 = zx.d(*(r5 + 0xb29))
                        
                        if (r0_24 != 0)
                            r0_24 = 4
                else
                    if (zx.d(*(r5 + 0xb2c)) != 0)
                        int32_t r0_20 = *(r7_1 + 0xa4) + r2_1 - *(r0_17 - 0x10)
                        
                        if (r2_1 s> r0_20)
                            r2_1 = r0_20 & not.d(r0_20 s>> 0x1f)
                            r9_1 = 0
                    
                    var_2c_1 = r2_1
                    
                    if (r9_1 s>= 1)
                        goto label_170cd4
                    
                    r0_24 = 0
                
                uint32_t r1_15
                
                if (r3_1 != 0 || zx.d(*(r7_1 + 0xd5)) != 0 || zx.d(*(r5 + 0xb2b)) != 0)
                    r1_15 = 2
                else
                    r1_15 = 0
                
                uint32_t r3_3
                
                if (zx.d(*(r7_1 + 0xd6)) == 0)
                    r3_3 = 0
                else
                    r3_3 = 2
                    
                    if (zx.d(*(r5 + 0xb3d)) != 0 && *(r5 + 0x30) u> 0x16)
                        r1_15 = 2
                
                uint32_t var_54
                uint32_t var_50
                uint32_t var_4c
                
                if (var_2c_1 + r9_1 s>= 1)
                    if ((r1_15 == 0 || *(r5 + 0xb48) s<= 0) && (r3_3 == 0 || *(r8 + 0x8c) s<= 0)
                            && (r0_24 == 0 || *(r5 + 0xb40) s< 1))
                        ascension::CWorld::RemoveCurrentTurnRunes(r5)
                        
                        if (r9_1 s>= 1)
                            ascension::CWorld::RemoveCurrentTurnPower(r5)
                    else
                        var_54 = r0_24
                        var_50 = r1_15
                        var_4c = r3_3
                        ascensionrules::CreateStateMustPayResources(r8, r0_2, var_2c_1, r9_1, 0, 
                            var_54, var_50, var_4c)
                        CState::AddOwnedChild(arg2)
                        CStateList::AppendState(arg2)
                
                if (*(r5 + 0x30) u< 2)
                    core::CWorldBase::OutputMessageFormat(r5, "%s acquires %s (%d runes)\n", 
                        r8 + 0x10, (*(*r0_2 + 0xc))(r0_2), r2_1, var_54, var_50, var_4c)
                    int32_t var_48_1 = 0
                    ascension::CWorld::OutputAnimationCard(r5, r0_2, 3, 7, r10, 3, zx.d(*(r8 + 8)), 
                        0)
                    ascensionrules::CreateStateRemoveCenterRowCard(r8, r10, nullptr, true, true, 0, 
                        0, false, nullptr, nullptr, 0, nullptr, 0)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                    ascensionrules::CreateStateProcessAcquireCard(r8, r0_2)
                    CState::AddOwnedChild(arg2)
                else
                    CState::CleanupEmbeddedState()
                    ascensionrules::CreateStateProcessAcquireCardSequence(r8, r0_2, 7, r10, 3, 
                        *(arg2 + 0x20), *(arg2 + 0x1c))
                    CState::SetEmbeddedState(arg2)
                
                CStateList::AppendState(arg2)
                break
            
            r2 += 1
            r0_17 += 0x44
        while (r2 s< r1_8)

int32_t r0_50 = *__stack_chk_guard

if (r0_50 == r0)
    return r0_50 - r0

__stack_chk_fail()
noreturn
