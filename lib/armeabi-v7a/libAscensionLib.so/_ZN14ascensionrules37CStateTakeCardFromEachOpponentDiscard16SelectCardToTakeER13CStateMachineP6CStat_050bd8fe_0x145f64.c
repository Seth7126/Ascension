// 函数: _ZN14ascensionrules37CStateTakeCardFromEachOpponentDiscard16SelectCardToTakeER13CStateMachineP6CStateiPj
// 地址: 0x145f64
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r7 = *(arg2 + 0x24c)
int32_t r9 = *(arg3 + 0xc)
char* r6 = *(r7 + 4)
int32_t r0_2 = (*(r6 + 0x1c) - *(r6 + 0x18)) s>> 2

if (r0_2 u< 2)
label_145fc0:
    core::CWorldBase::OutputMessageFormat(r6, "%s steals %s\n", r7 + 0x10, r9 + 4)
else
    int32_t r1_1 = 0x95
    
    while (*(arg2 + (r1_1 << 2)) != arg3)
        bool cond:0_1 = r1_1 - 0x93 u< r0_2
        r1_1 += 1
        
        if (not(cond:0_1))
            goto label_145fc0
    
    *(arg2 + (r1_1 << 2)) = 0
    core::CCardInstance* r0_14 = ascension::CWorld::GetPlayerByTurnOrder(r6, r7)
    int32_t r3 = r9 + 4
    void* r2_2 = r7 + 0x10
    
    if (r0_14 == 0)
        core::CWorldBase::OutputMessageFormat(r6, "%s steals %s\n", r2_2, r3)
    else
        core::CWorldBase::OutputMessageFormat(r6, "%s steals %s from %s\n", r2_2, r3, r0_14 + 0x10)
        ascension::CPlayer::RemoveOwnedCard(r0_14)

ascension::CPlayer::PutCardInHand(r7)
ascension::CPlayer::AddOwnedCard(r7)
ascension::CPlayer::AddTurnLog(r7, 8)
int32_t var_28 = 0
ascension::CWorld::OutputAnimationCard(r6, arg3, 8, 0xc, 0, 1, zx.d(*(r7 + 8)), 0)
ascension::CWorld::RemoveRevealCard(r6)
ascension::CWorld::OutputPauseForAllAnimation()
*(arg2 + 0x264) = arg3
return ascensionrules::CStateTakeCardFromEachOpponentDiscard::ReturnDiscardedCards() __tailcall
