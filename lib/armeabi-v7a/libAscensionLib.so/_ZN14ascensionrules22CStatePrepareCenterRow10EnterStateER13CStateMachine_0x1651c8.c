// 函数: _ZN14ascensionrules22CStatePrepareCenterRow10EnterStateER13CStateMachine
// 地址: 0x1651c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r5 = *(arg1 + 0x30)

if (zx.d(*(r5 + 0xa2c)) == 0)
    ascension::CWorld::ShufflePortalDeck()
    r5 = *(arg1 + 0x30)

ascension::CWorld::GetPlayer(r5)
int32_t result = ascension::CWorld::StartTurn(r5)
*(arg1 + 0x34) = 0
*(arg1 + 0x38) = 0
return result
