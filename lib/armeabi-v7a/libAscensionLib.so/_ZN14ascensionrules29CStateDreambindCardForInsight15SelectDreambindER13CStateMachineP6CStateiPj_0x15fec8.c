// 函数: _ZN14ascensionrules29CStateDreambindCardForInsight15SelectDreambindER13CStateMachineP6CStateiPj
// 地址: 0x15fec8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r6 = *(arg2 + 0x24c)
int32_t r7 = *(arg2 + 0x270)
core::CCardInstance* r5 = *(r6 + 4)

if (r7 s>= 1)
    if (zx.d(*(r5 + 0xb3d)) == 0)
        ascension::CPlayer::RemoveInsightCount(r6)
    else
        uint32_t r1 = zx.d(*(r5 + 0xb29))
        uint32_t r0_1 = r1
        
        if (r1 != 0)
            r0_1 = 8
        
        if (*(r5 + 0xb48) s<= 0 && (r1 == 0 || *(r5 + 0xb40) s< 1))
            ascension::CPlayer::RemoveInsightCount(r6)
        else
            ascensionrules::CreateStateMustPayResources(r6, *(arg2 + 0x254), 0, 0, r7, r0_1, 8, 0)
            CState::AddOwnedChild(arg2)
            CStateList::AppendState(arg2)
            
            if (*(r5 + 0x30) u<= 0x17)
                ascension::CPlayer::RemoveInsightCount(r6)

int32_t var_38_2 = 0
ascension::CWorld::AddToAcquiredCards(r5, (*(arg2 + 0x254)).b, *(*(arg2 + 0x258) + 0x54), 3)
*(arg2 + 0x254)
ascension::CPlayer::AddTurnLog(r6, 3)
int32_t var_28 = 0
ascension::CWorld::OutputAnimationCard(r5, *(arg2 + 0x254), 3, 0xb, 0, 3, zx.d(*(r6 + 8)), 0)
*(arg2 + 0x254)
ascension::CWorld::RemoveCardFromVoid(r5)
*(arg2 + 0x254)
ascension::CPlayer::AddOwnedCard(r6)
*(arg2 + 0x254)
ascension::CPlayer::PutCardInDiscard(r6)
ascension::CWorld::OutputPauseForAnimationToDestination(r5)
void* result = *(arg2 + 0x258)

if (result != 0)
    *(result + 0x64) = 0

return result
