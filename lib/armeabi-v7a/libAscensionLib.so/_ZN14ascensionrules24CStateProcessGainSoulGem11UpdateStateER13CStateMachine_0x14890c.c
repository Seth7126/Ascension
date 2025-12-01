// 函数: _ZN14ascensionrules24CStateProcessGainSoulGem11UpdateStateER13CStateMachine
// 地址: 0x14890c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x38)
core::CCardInstance* r5 = *(r0 + 4)

if (*(arg1 + 0x3c) == 0)
    ascension::CWorld::OutputPauseForAnimationConfirmation()
    CState* entry_r1
    return CStateMachine::PopState(entry_r1)

if (zx.d(*(r5 + 0xa14)) == 0 || *(r0 + 0x9c) != 0)
    uint32_t r0_2 = ascension::CWorld::DrawCardFromSoulGemDeck()
    
    if (r0_2 != 0)
        ascension::CPlayer::PutCardInHand(*(arg1 + 0x38))
        uint32_t r0_5 = zx.d(*(*(arg1 + 0x38) + 8))
        uint32_t var_20_1 = r0_5
        ascension::CWorld::OutputAnimationCard(r5, r0_2, 2, 0xe, 0, 1, r0_5, 0xb)
        *(*(arg1 + 0x38) + 0xc)
        ascension::CWorld::OutputPauseBrief(r5)
else
    ascension::CPlayer::AddPendingDraw()

int32_t result = *(arg1 + 0x3c) - 1
*(arg1 + 0x3c) = result
return result
