// 函数: _ZN14ascensionrules30CStateProcessOptionalDrawCards14SelectDrawCardER13CStateMachineP6CStateiPj
// 地址: 0x148f08
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r6 = *(arg2 + 0x24c)
core::CCardInstance* r5 = *(r6 + 4)

if (zx.d(*(r5 + 0xa14)) == 0 || *(r6 + 0x9c) != 0)
    uint32_t r0_3 = ascension::CPlayer::RemoveTopCardFromDeck()
    
    if (r0_3 != 0)
        ascension::CPlayer::PutCardInHand(r6)
        uint32_t r0_5 = zx.d(*(r6 + 8))
        int32_t var_20_1 = 0
        ascension::CWorld::OutputAnimationCard(r5, r0_3, 2, 2, r0_5, 1, r0_5, 0)
        ascension::CWorld::OutputPauseForAnimationConfirmation()
else
    ascension::CPlayer::AddPendingDraw()

int32_t result = *(arg2 + 0x254) + 1
*(arg2 + 0x254) = result
return result
