// 函数: _ZN14ascensionrules44CStateProcessDiscardFromHandForEachConstruct19SelectCardToDiscardER13CStateMachineP6CStateiPj
// 地址: 0x145398
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r6 = *(arg2 + 0x24c)
uint32_t r0 = zx.d(*(r6 + 8))
char* r7 = *(r6 + 4)
uint32_t r1_1

if (zx.d(*(arg2 + 0x44)) == 0)
    r1_1 = 2
else
    r1_1 = 2
    
    if (*(arg2 + 0x38) == 1)
        r1_1 = 3

uint32_t var_20 = r0
ascension::CWorld::OutputAnimationCard(r7, arg3, 5, 1, r0, 3, r0, r1_1)
ascension::CPlayer::AddTurnLog(r6, 5)
ascension::CPlayer::RemoveCardFromHand(r6)
core::CWorldBase::OutputMessageFormat(r7, "%s discards %s\n", r6 + 0x10, (*(*arg3 + 0xc))(arg3))
ascension::CPlayer::PutCardInDiscard(r6)
int32_t result = *(arg2 + 0x254) + 1
*(arg2 + 0x254) = result
return result
