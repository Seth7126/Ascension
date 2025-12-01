// 函数: _ZN14ascensionrules49CStateRevealPortalDeckAndPlaceTreasureUnderTrophy11UpdateStateER13CStateMachine
// 地址: 0x149ec4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r0 = *(arg1 + 0x38)
uint32_t r1 = *(arg1 + 0x44)
core::CCardInstance* r5 = *(r0 + 4)
CState* entry_r1

if (r1 == 0)
    int32_t r0_6 = *(arg1 + 0x3c)
    
    if (*(arg1 + 0x48) s>= r0_6)
        core::CInstance* r1_15 = *(arg1 + 0x4c)
        
        if (r1_15 s>= 1)
            ascension::CWorld::OutputAnimationEnergy(r5, r1_15, *(arg1 + 0x40))
            *(arg1 + 0x4c)
            ascension::CWorld::AddCurrentTurnEnergy(r5)
            core::CWorldBase::OutputMessageFormat(r5, "%s gains %d energy\n", 
                (*(**(arg1 + 0x38) + 0xc))(), *(arg1 + 0x4c))
        
        return CStateMachine::PopState(entry_r1)
    
    if (zx.d(*(r5 + 0xa14)) == 0 && (*(*(r5 + 0xa3c) + 0x18) != 0 || *(*(r5 + 0xa4c) + 0x18) != 0))
        uint32_t r0_8 = ascension::CWorld::DrawCardFromPortalDeck()
        
        if (r0_8 == 0)
            r0_6 = *(arg1 + 0x3c)
        else
            *(arg1 + 0x44) = r0_8
            core::CWorldBase::OutputMessageFormat(r5, "%s reveals %s\n", *(arg1 + 0x38) + 0x10, 
                (*(*r0_8 + 0xc))(r0_8))
            ascension::CWorld::PushRevealCard(r5, r0_8, 0xa)
            int32_t var_28_2 = 0
            ascension::CWorld::OutputAnimationCard(r5, r0_8, 0xa, 8, 0, 0xc, 0, 0)
            ascension::CWorld::OutputPauseForAllAnimation()
            ascension::CWorld::OutputPauseForAnimationConfirmation()
            r0_6 = *(arg1 + 0x48) + 1
    
    *(arg1 + 0x48) = r0_6
    return r0_6

if (zx.d(*(arg1 + 0x50)) != 0)
    int32_t var_28_1 = 0
    ascension::CWorld::OutputAnimationCard(r5, r1, 6, 0xb, 0, 9, 0, &__elf_header)
    *(arg1 + 0x44)
    ascension::CWorld::PopResolveEffect(r5)
    *(arg1 + 0x44)
    ascension::CWorld::PutCardInVoid(r5)
    int32_t r0_5 = ascension::CWorld::OutputPauseBrief(r5)
    *(arg1 + 0x44) = 0
    *(arg1 + 0x50) = 0
    return r0_5

void* r7_2 = *(r1 + 0xc)

if (*(r7_2 + 0x88) != 6)
    if (*(r7_2 + 0xf8) != 0 && *(r5 + 0x30) u>= 0x1f)
        *(arg1 + 0x50) = 1
        ascension::CWorld::PushResolveEffect(r5, r1)
        int32_t var_28_4 = 0
        ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x44), 3, 0xc, 0, 0xb, 0, 
            &__elf_symbol_table[0xfe1])
        *(arg1 + 0x44)
        ascension::CWorld::PopRevealCard(r5)
        
        if (*(arg1 + 0x38) == *(r5 + 0xb20))
            ascension::CWorld::AddToBanishedCardCount()
            *(arg1 + 0x44)
            ascension::CPlayer::AddTurnLog(*(arg1 + 0x38), 6)
        
        ascension::CWorld::OutputPauseForAnimationToDestination(r5)
        core::CInstance* r3_5 = *(arg1 + 0x44)
        ascension::CPlayer* r1_24 = *(arg1 + 0x38)
        *(arg1 + 0xa4) = r3_5
        *(arg1 + 0xa8) = 8
        ascensionrules::CreateStateProcessCardEffect(r5, r1_24, *(r7_2 + 0xf8), r3_5, arg1 + 0x54, 
            nullptr, 0)
        return CStateMachine::PushOwnedState(entry_r1) __tailcall
    
    int32_t var_28_5 = 0
    ascension::CWorld::OutputAnimationCard(r5, r1, 6, 0xc, 0, 9, 0, &__elf_header)
    *(arg1 + 0x44)
    ascension::CWorld::PutCardInVoid(r5)
else
    ascension::CPlayer::AddOwnedCard(r0)
    *(arg1 + 0x44)
    ascension::CTrophyInstance::PutCardUnderTrophy(*(arg1 + 0x40))
    int32_t var_28_3 = 0
    ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x44), 3, 0xc, 0, 0xb, 0, 
        &__elf_symbol_table[0xfe1])
    *(arg1 + 0x4c) += 1

*(arg1 + 0x44)
ascension::CWorld::PopRevealCard(r5)
int32_t r0_47 = ascension::CWorld::OutputPauseBrief(r5)
*(arg1 + 0x44) = 0
return r0_47
