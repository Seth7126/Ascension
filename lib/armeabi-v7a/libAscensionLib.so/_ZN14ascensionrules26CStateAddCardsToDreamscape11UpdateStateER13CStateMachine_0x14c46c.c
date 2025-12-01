// 函数: _ZN14ascensionrules26CStateAddCardsToDreamscape11UpdateStateER13CStateMachine
// 地址: 0x14c46c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r5 = *(*(arg1 + 0x38) + 4)

if (*(arg1 + 0x3c) == 0)
    ascension::CWorld::OutputPauseForAnimationConfirmation()
    CState* entry_r1
    return CStateMachine::PopState(entry_r1)

uint32_t r0_2 = ascension::CWorld::DrawCardFromDreamDeck()

if (r0_2 != 0)
    ascension::CPlayer::PutCardInDreamscape(*(arg1 + 0x38))
    uint32_t r0_5 = zx.d(*(*(arg1 + 0x38) + 8))
    uint32_t var_20_1 = r0_5
    ascension::CWorld::OutputAnimationCard(r5, r0_2, 0, 8, 0, 0x14, r0_5, 8)
    *(*(arg1 + 0x38) + 0xc)
    ascension::CWorld::OutputPauseBrief(r5)

int32_t result = *(arg1 + 0x3c) - 1
*(arg1 + 0x3c) = result
return result
