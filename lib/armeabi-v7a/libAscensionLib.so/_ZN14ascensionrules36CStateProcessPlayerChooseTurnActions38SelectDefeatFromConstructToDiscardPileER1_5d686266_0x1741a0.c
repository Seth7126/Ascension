// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions38SelectDefeatFromConstructToDiscardPileER13CStateMachineP6CStateiPj
// 地址: 0x1741a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r5 = *(arg2 + 0x24c)
char* r7 = *(r5 + 4)
void* r0_1 = core::CWorldBase::GetInstanceByID(r7)
int32_t result = *(r0_1 + 0x4c)
core::CInstance* r6 = *(result - 4)

if (r6 != 0)
    result = *(arg2 + 0xcb4)
    
    if (result s>= 1)
        int32_t r2 = 0
        void* __offset(CState, 0xcc4) r1_1 = arg2 + 0xcc4
        
        do
            if (r6 == *(r1_1 - 0xc))
                void* r0_2 = *(r6 + 0xc)
                int32_t r9 = *r1_1
                int32_t r10 = *(r7 + 0xb48)
                uint32_t var_3c
                int32_t var_38
                uint32_t r0_4
                
                if (zx.d(*(r0_2 + 0xd7)) != 0 && *(r5 + 0x8c) s>= 1)
                    uint32_t r10_1
                    
                    if (zx.d(r7[0xb29]) == 0)
                        r10_1 = 0
                        
                        if (zx.d(r7[0xb2a]) != 0 && ascension::CCard::IsCardFaction(r0_2) != 0)
                            r10_1 = 4
                    else
                        r10_1 = 4
                    
                    r0_4 = 4
                    int32_t var_40_2 = 0
                    var_3c = r10_1
                    var_38 = 0
                    goto label_1742a8
                
                uint32_t var_34
                
                if (*(r7 + 0x30) u< 0x16)
                label_174300:
                    
                    if (r9 s<= r10)
                        ascension::CWorld::RemoveCurrentTurnPower(r7)
                    else
                        ascension::CWorld::RemoveCurrentTurnPower(r7)
                        ascension::CWorld::RemoveCurrentTurnRunes(r7)
                else
                    if (zx.d(r7[0xb29]) == 0)
                        if (zx.d(r7[0xb2a]) == 0)
                            goto label_174300
                        
                        if (ascension::CCard::IsCardFaction(r0_2) != 0)
                            goto label_174264
                        
                        goto label_174300
                    
                label_174264:
                    r0_4 = 0
                    int32_t var_40_1 = 0
                    var_3c = 4
                    var_38 = 0
                label_1742a8:
                    var_34 = r0_4
                    ascensionrules::CreateStateMustPayResources(r5, r6, 0, r9, 0, var_3c, 0, var_34)
                    CState::AddOwnedChild(arg2)
                    CStateList::AppendState(arg2)
                
                core::CWorldBase::OutputMessageFormat(r7, "%s defeats %s (%d power)\n", r5 + 0x10, 
                    (*(*r6 + 0xc))(r6), r9, var_3c, var_38, var_34)
                CState::CleanupEmbeddedState()
                ascensionrules::CreateStateProcessDefeatMonsterSequence(r5, r6, 4, 
                    zx.d(*(r0_1 + 8)), 3, false, true, false, *(arg2 + 0x20), *(arg2 + 0x1c))
                CState::SetEmbeddedState(arg2)
                return CStateList::AppendState(arg2) __tailcall
            
            r2 += 1
            r1_1 += 0x34
        while (r2 s< result)

return result
