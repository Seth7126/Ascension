// 函数: _ZN14ascensionrules33CStateProcessDiscardMultipleCards21SelectCardToPutOnDeckER13CStateMachineP6CStateiPj
// 地址: 0x143dd0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r6 = *(arg2 + 0x24c)
core::CCardInstance* r7 = *(r6 + 4)
uint32_t r0 = zx.d(*(r6 + 8))
uint32_t var_20 = r0
ascension::CWorld::OutputAnimationCard(r7, arg3, 5, 1, r0, 2, r0, 2)
ascension::CPlayer::AddTurnLog(r6, 5)
ascension::CPlayer::RemoveCardFromHand(r6)
core::CWorldBase::OutputMessageFormat(r7, "%s puts %s on top of deck\n", r6 + 0x10, 
    (*(*arg3 + 0xc))(arg3))
ascension::CPlayer::PutCardOnTopOfDeck(r6)
int32_t* r0_9 = *(arg2 + 0x260)

if (r0_9 != 0)
    void* r2_3 = r0_9 + *r0_9 + 4
    uint32_t r1_5 = zx.d(*r2_3)
    
    if (r1_5 u<= 7)
        uint32_t r12_1 = zx.d(*(arg3 + 8))
        *r2_3 = r1_5.b + 1
        r0_9[*r0_9 * 8 + r1_5 + 4] = r12_1

int32_t r0_13

if (*(arg2 + 0x258) != 0)
    r0_13 = ascension::CWorld::QueryCardFaction(r7, r6, arg3)

int32_t result

if (*(arg2 + 0x258) == 0 || r0_13 == 0)
    result = *(arg2 + 0x264) + 1
else
    result = *(arg2 + 0x250)

*(arg2 + 0x264) = result
return result
