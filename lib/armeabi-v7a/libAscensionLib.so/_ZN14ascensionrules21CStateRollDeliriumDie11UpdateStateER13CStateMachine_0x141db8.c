// 函数: _ZN14ascensionrules21CStateRollDeliriumDie11UpdateStateER13CStateMachine
// 地址: 0x141db8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
CState* entry_r1

if (zx.d(*(arg1 + 0x38)) == 0)
    return CStateMachine::PopState(entry_r1)

void* r0_1 = *(arg1 + 0x30)
*(arg1 + 0x38) = 0
int32_t* r5_1 = *(r0_1 + 4)
uint32_t r8_1 = r5_1[0x2a2]
uint32_t r0_4 = (*(*r5_1 + 0x10))(r5_1, 1, 6)
int32_t var_40_1 = 0
ascension::CWorld::OutputEvent(r5_1, 0x3c, zx.d(*(*(arg1 + 0x30) + 8)), r0_4)
int32_t result = r0_4 - 1

if (result u> 5)
    return result

switch (result)
    case 0
        CState::CleanupEmbeddedState()
        ascensionrules::CreateStateProcessBanishFromHandOrDiscardOrSource(*(arg1 + 0x30), 1, true, 
            true, false, 0, nullptr, nullptr, nullptr, *(arg1 + 0x20), *(arg1 + 0x1c))
    case 1
        CState::CleanupEmbeddedState()
        ascensionrules::CreateStateProcessDrawCards(*(arg1 + 0x30), 2, *(arg1 + 0x20), 
            *(arg1 + 0x1c))
    case 2
        ascension::CWorld::OutputAnimationRune(r5_1, 3, r8_1)
        ascension::CWorld::AddCurrentTurnRunes(r5_1)
        ascension::CWorld::OutputPauseForAllAnimation()
        return core::CWorldBase::OutputMessageFormat(r5_1, "%s gains %d runes\n", 
            (*(**(arg1 + 0x30) + 0xc))(), 3) __tailcall
    case 3
        ascension::CWorld::OutputAnimationPower(r5_1, 4, r8_1)
        ascension::CWorld::OutputPauseForAllAnimation()
        ascension::CWorld::AddCurrentTurnPower(r5_1)
        return core::CWorldBase::OutputMessageFormat(r5_1, "%s gains %d power\n", 
            (*(**(arg1 + 0x30) + 0xc))(), 4) __tailcall
    case 4
        CState::CleanupEmbeddedState()
        ascensionrules::CreateStateGainHonor(*(arg1 + 0x30), r8_1, 5, true, *(arg1 + 0x20), 
            *(arg1 + 0x1c))
    case 5
        int32_t var_40_3 = 0
        ascension::CWorld::OutputAnimationInsight(r5_1, 6, *(arg1 + 0x30), r8_1)
        ascension::CWorld::OutputPauseForAllAnimation()
        ascension::CPlayer::AddInsightCount(*(arg1 + 0x30))
        int32_t* r0_33 = *(arg1 + 0x30)
        
        if (r0_33 == r5_1[0x2c8])
            r5_1[0xc]
            ascension::CWorld::AddInsightGainedThisTurn(r5_1)
            r0_33 = *(arg1 + 0x30)
        
        return core::CWorldBase::OutputMessageFormat(r5_1, "%s gains %d insight\n", 
            (*(*r0_33 + 0xc))(), 6) __tailcall

CState::SetEmbeddedState(arg1)
return CStateMachine::PushState(entry_r1) __tailcall
