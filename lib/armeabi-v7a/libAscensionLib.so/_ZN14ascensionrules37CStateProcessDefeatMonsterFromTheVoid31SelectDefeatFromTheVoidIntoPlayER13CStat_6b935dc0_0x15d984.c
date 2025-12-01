// 函数: _ZN14ascensionrules37CStateProcessDefeatMonsterFromTheVoid31SelectDefeatFromTheVoidIntoPlayER13CStateMachineP6CStateiPj
// 地址: 0x15d984
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (arg3 == 0)
    return 

CStateMachine& r8_1 = arg1
arg1 = *(arg2 + 0x254)

if (arg1 s< 1)
    return 

int32_t r9_1 = *(arg2 + 0x24c)
int32_t r2 = 0
uint32_t r6_1 = *(r9_1 + 4)
int32_t* r1_1 = *(arg2 + 0x258) + 0xc

do
    if (*(r1_1 - 0xc) == arg3)
        void* r5_1 = *(arg3 + 0xc)
        int32_t var_28_1
        
        if (zx.d(*(arg2 + 0x250)) == 0)
            var_28_1 = 0
        else
            int32_t r3_1 = *r1_1
            int32_t r10_1 = *(r6_1 + 0xb48)
            var_28_1 = r3_1
            
            if (zx.d(*(r5_1 + 0xd7)) != 0 && *(r9_1 + 0x8c) s>= 1)
                uint32_t r5_2
                
                if (zx.d(*(r6_1 + 0xb29)) == 0)
                    r5_2 = 0
                    
                    if (zx.d(*(r6_1 + 0xb2a)) != 0)
                        r3_1 = var_28_1
                        
                        if (ascension::CCard::IsCardFaction(r5_1) != 0)
                            r5_2 = 4
                else
                    r5_2 = 4
                
                ascensionrules::CreateStateMustPayResources(r9_1, arg3, 0, r3_1, 0, r5_2, 0, 4)
                CState::AddOwnedChild(arg2)
                CStateList::AppendState(arg2)
            else if (*(r6_1 + 0x30) u< 0x16)
            label_15db38:
                
                if (r3_1 s<= r10_1)
                    ascension::CWorld::RemoveCurrentTurnPower(r6_1)
                else
                    ascension::CWorld::RemoveCurrentTurnPower(r6_1)
                    ascension::CWorld::RemoveCurrentTurnRunes(r6_1)
            else
                if (zx.d(*(r6_1 + 0xb29)) == 0)
                    if (zx.d(*(r6_1 + 0xb2a)) == 0)
                        goto label_15db38
                    
                    r3_1 = var_28_1
                    
                    if (ascension::CCard::IsCardFaction(r5_1) != 0)
                        goto label_15da68
                    
                    goto label_15db38
                
            label_15da68:
                ascensionrules::CreateStateMustPayResources(r9_1, arg3, 0, r3_1, 0, 4, 0, 0)
                CState::AddOwnedChild(arg2)
                CStateList::AppendState(arg2)
        
        if (*(r6_1 + 0x30) u>= 2)
            char const* const r1_13
            
            if (zx.d(*(arg2 + 0x250)) == 0)
                r1_13 = "%s defeats %s from The Void into play\n"
            else
                r1_13 = "%s defeats %s from The Void into play (%d power)\n"
                int32_t var_40_1 = var_28_1
            
            core::CWorldBase::OutputMessageFormat(r6_1, r1_13)
            int32_t var_30_1 = 0
            ascensionrules::CStateProcessDefeatMonsterSequence::CStateProcessDefeatMonsterSequence(
                operator new(0x99c), r9_1, arg3, 9, 0xfffffffe, true, false, true)
            CState::AddOwnedChild(arg2)
            return CStateList::AppendState(arg2) __tailcall
        
        if (ascension::CWorld::RemoveCardFromVoid(r6_1) == 0)
            break
        
        int32_t var_30 = 0
        ascension::CWorld::OutputAnimationCard(r6_1, arg3, 4, 9, 0, 8, 0, 0)
        char const* const r1_16
        
        if (zx.d(*(arg2 + 0x250)) == 0)
            r1_16 = "%s defeats %s from The Void\n"
        else
            r1_16 = "%s defeats %s from The Void (%d power)\n"
            int32_t var_40_2 = var_28_1
        
        core::CWorldBase::OutputMessageFormat(r6_1, r1_16)
        ascensionrules::CreateStateProcessCardEffect(r6_1, r9_1, *(r5_1 + 0xec), arg3, nullptr, 
            nullptr, 0)
        CStateMachine::PushOwnedState(r8_1)
        ascension::CWorld::PutCardOnBottomOfPortalDeck(r6_1)
        int32_t var_40_3 = 9
        ascension::CWorld::OutputEvent(r6_1, 2, zx.d(*(r9_1 + 8)), zx.d(*(arg3 + 8)))
        ascension::CWorld::AddToDefeatedMonsters(r6_1, arg3.w, 9)
        return ascension::CPlayer::AddTurnLog(r9_1, 4) __tailcall
    
    r2 += 1
    r1_1 = &r1_1[0xd]
while (r2 s< arg1)
