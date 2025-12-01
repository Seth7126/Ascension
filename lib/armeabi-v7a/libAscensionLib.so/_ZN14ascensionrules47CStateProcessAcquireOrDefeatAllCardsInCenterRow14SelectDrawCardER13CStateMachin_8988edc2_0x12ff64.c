// 函数: _ZN14ascensionrules47CStateProcessAcquireOrDefeatAllCardsInCenterRow14SelectDrawCardER13CStateMachineP6CStateiPj
// 地址: 0x12ff64
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r5 = *(arg2 + 0x24c)
*(arg2 + 0x67c) = 1
core::CCardInstance* r4 = *(r5 + 4)

if (zx.d(*(r4 + 0xa14)) != 0 && *(r5 + 0x9c) == 0)
    return ascension::CPlayer::AddPendingDraw() __tailcall

uint32_t result = ascension::CPlayer::RemoveTopCardFromDeck()

if (result == 0)
    return result

ascension::CPlayer::PutCardInHand(r5)
uint32_t r0_4 = zx.d(*(r5 + 8))
int32_t var_20 = 0
ascension::CWorld::OutputAnimationCard(r4, result, 2, 2, r0_4, 1, r0_4, 0)
return ascension::CWorld::OutputPauseForAnimationConfirmation() __tailcall
