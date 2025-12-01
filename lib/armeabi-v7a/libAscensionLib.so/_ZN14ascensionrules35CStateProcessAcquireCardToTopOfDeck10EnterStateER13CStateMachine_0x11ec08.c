// 函数: _ZN14ascensionrules35CStateProcessAcquireCardToTopOfDeck10EnterStateER13CStateMachine
// 地址: 0x11ec08
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t var_18 = 0
ascension::CWorld::AddToAcquiredCards(*(*(arg1 + 0x30) + 4), (*(arg1 + 0x34)).b, 7, 2)
*(arg1 + 0x34)
ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 3)
*(arg1 + 0x34)
ascension::CPlayer::PutCardOnTopOfDeck(*(arg1 + 0x30))
*(arg1 + 0x34)
return ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30)) __tailcall
