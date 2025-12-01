// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions31SelectDefeatTrophyFromCenterRowER13CStateMachineP6CStateiPj
// 地址: 0x171d64
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r8 = *(arg2 + 0x24c)
int32_t r5 = *(r8 + 4)
core::CInstance* r0_1 = core::CWorldBase::GetInstanceByID(r5)
int32_t r7 = 0
int32_t result = ascension::CWorld::GetCenterRowCard(r5)

if (result != r0_1)
    r7 = 1
    result = ascension::CWorld::GetCenterRowCard(r5)
    
    if (result != r0_1)
        r7 = 2
        result = ascension::CWorld::GetCenterRowCard(r5)
        
        if (result != r0_1)
            r7 = 3
            result = ascension::CWorld::GetCenterRowCard(r5)
            
            if (result != r0_1)
                r7 = 4
                result = ascension::CWorld::GetCenterRowCard(r5)
                
                if (result != r0_1)
                    r7 = 5
                    result = ascension::CWorld::GetCenterRowCard(r5)
                    
                    if (result != r0_1)
                        result = ascension::CWorld::GetCenterRowCard(r5)
                        r7 = 7
                        
                        if (result == r0_1)
                            r7 = 6

if (r0_1 != 0)
    result = *(arg2 + 0xcb4)
    
    if (result s>= 1)
        int32_t r2 = 0
        void* __offset(CState, 0xcc4) r1_8 = arg2 + 0xcc4
        
        do
            if (*(r1_8 - 0xc) == r0_1)
                void* r0_9 = *(r0_1 + 0xc)
                int32_t r9 = *r1_8
                int32_t r10 = *(r5 + 0xb48)
                uint32_t var_3c
                int32_t var_38
                uint32_t r0_11
                
                if (zx.d(*(r0_9 + 0xd7)) != 0 && *(r8 + 0x8c) s>= 1)
                    uint32_t r10_1
                    
                    if (zx.d(*(r5 + 0xb29)) == 0)
                        r10_1 = 0
                        
                        if (zx.d(*(r5 + 0xb2a)) != 0 && ascension::CCard::IsCardFaction(r0_9) != 0)
                            r10_1 = 4
                    else
                        r10_1 = 4
                    
                    r0_11 = 4
                    int32_t var_40_2 = 0
                    var_3c = r10_1
                    var_38 = 0
                    goto label_171f0c
                
                uint32_t var_34
                
                if (*(r5 + 0x30) u< 0x16)
                label_171f64:
                    
                    if (r9 s<= r10)
                        ascension::CWorld::RemoveCurrentTurnPower(r5)
                    else
                        ascension::CWorld::RemoveCurrentTurnPower(r5)
                        ascension::CWorld::RemoveCurrentTurnRunes(r5)
                else
                    if (zx.d(*(r5 + 0xb29)) == 0)
                        if (zx.d(*(r5 + 0xb2a)) == 0)
                            goto label_171f64
                        
                        if (ascension::CCard::IsCardFaction(r0_9) != 0)
                            goto label_171ec8
                        
                        goto label_171f64
                    
                label_171ec8:
                    r0_11 = 0
                    int32_t var_40_1 = 0
                    var_3c = 4
                    var_38 = 0
                label_171f0c:
                    var_34 = r0_11
                    ascensionrules::CreateStateMustPayResources(r8, r0_1, 0, r9, 0, var_3c, 0, 
                        var_34)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                
                core::CWorldBase::OutputMessageFormat(r5, "%s defeats %s (%d power)\n", r8 + 0x10, 
                    (*(*r0_1 + 0xc))(r0_1), r9, var_3c, var_38, var_34)
                CState::CleanupEmbeddedState()
                ascensionrules::CreateStateProcessDefeatMonsterSequence(r8, r0_1, 7, r7, 5, false, 
                    true, false, *(arg2 + 0x20), *(arg2 + 0x1c))
                CState::SetEmbeddedState(arg2)
                return CStateList::AppendState(arg2) __tailcall
            
            r2 += 1
            r1_8 += 0x34
        while (r2 s< result)

return result
