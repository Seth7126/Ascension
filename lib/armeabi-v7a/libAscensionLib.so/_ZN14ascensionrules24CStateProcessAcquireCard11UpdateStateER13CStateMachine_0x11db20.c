// 函数: _ZN14ascensionrules24CStateProcessAcquireCard11UpdateStateER13CStateMachine
// 地址: 0x11db20
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (zx.d(*(arg1 + 0x98)) != 0)
    int32_t var_18_1 = 0
    ascension::CWorld::AddToAcquiredCards(*(*(arg1 + 0x30) + 4), (*(arg1 + 0x34)).b, 7, 3)
    *(arg1 + 0x34)
    ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 3)
    *(arg1 + 0x34)
    ascension::CPlayer::PutCardInDiscard(*(arg1 + 0x30))
    *(arg1 + 0x34)
    ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))

CState* entry_r1
return CStateMachine::PopState(entry_r1) __tailcall
