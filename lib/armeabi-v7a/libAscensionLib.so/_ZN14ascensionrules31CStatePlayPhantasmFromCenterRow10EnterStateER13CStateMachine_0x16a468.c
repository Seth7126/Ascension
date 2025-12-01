// 函数: _ZN14ascensionrules31CStatePlayPhantasmFromCenterRow10EnterStateER13CStateMachine
// 地址: 0x16a468
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r5 = *(*(arg1 + 0x30) + 4)
ascension::CWorld::AddToPlayedCards(r5, *(arg1 + 0x38))
*(arg1 + 0x38)
ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 0xd)
ascension::CWorld::PushResolveEffect(r5, *(arg1 + 0x38))
uint32_t var_20 = zx.d(*(*(arg1 + 0x30) + 8))
ascension::CWorld::OutputAnimationCard(r5, *(arg1 + 0x38), 0xd, 7, *(arg1 + 0x34), 0xb, 0, 1)
ascension::CWorld::OutputPauseForAnimationToDestination(r5)
int32_t result = ascension::CWorld::AddToBanishedCardCount()
*(arg1 + 0x3c) = 0
return result
