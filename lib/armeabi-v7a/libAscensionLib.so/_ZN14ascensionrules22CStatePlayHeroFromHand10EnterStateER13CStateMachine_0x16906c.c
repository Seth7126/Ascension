// 函数: _ZN14ascensionrules22CStatePlayHeroFromHand10EnterStateER13CStateMachine
// 地址: 0x16906c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r5 = *(*(arg1 + 0x30) + 4)
ascension::CWorld::AddToPlayedCards(r5, *(arg1 + 0x34))
int32_t var_20 = 0
ascension::CWorld::OutputEvent(r5, 9, zx.d(*(*(arg1 + 0x30) + 8)), zx.d(*(*(arg1 + 0x34) + 8)))
*(arg1 + 0x34)
ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 1)
int32_t result = ascension::CWorld::PushResolveEffect(r5, *(arg1 + 0x34))
*(arg1 + 0x38) = 0
return result
