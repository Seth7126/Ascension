// 函数: _ZN14ascensionrules29CStateProcessAcquirePotOfGold25SelectAcquireFromOpponentER13CStateMachineP6CStateiPj
// 地址: 0x125bfc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r4 = *(arg2 + 0x24c)
core::CCardInstance* r8 = *(arg3 + 0xc)
uint32_t r5 = *(arg3 + 0x10)
uint32_t r6 = *(r4 + 4)
int32_t var_38 = 0
ascension::CWorld::OutputEvent(r6, 0x2a, zx.d(*(r4 + 8)), 0)
int32_t var_28 = 0
ascension::CWorld::OutputAnimationCard(r6, r5, 8, 4, zx.d(*(arg3 + 8)), 3, zx.d(*(r4 + 8)), 0)
int32_t result = ascension::CPlayer::RemoveConstructFromPlay(r8)

if (result == 0)
    return result

ascension::CPlayer::RemoveOwnedCard(r8)
ascension::CPlayer::PutCardInDiscard(r4)
ascension::CPlayer::AddOwnedCard(r4)
return ascension::CPlayer::AddTurnLog(r4, 8) __tailcall
