// 函数: _ZN14ascensionrules32CStateRecoverCardFromDiscardPile10SelectCardER13CStateMachineP6CStateiPj
// 地址: 0x1261c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r5 = *(arg2 + 0x24c)
core::CCardInstance* r4 = *(r5 + 4)
void* result = ascension::CPlayer::RemoveCardFromDiscard(r5)

if (result != 0)
    uint32_t r0_1 = zx.d(*(r5 + 8))
    
    if (*(arg2 + 0x250) == 0)
        int32_t var_20_2 = 0
        ascension::CWorld::OutputAnimationCard(r4, arg3, 1, 3, r0_1, 1, r0_1, 0)
        core::CWorldBase::OutputMessageFormat(r4, "%s puts %s from discard into hand\n", r5 + 0x10, 
            (*(*arg3 + 0xc))(arg3))
        ascension::CPlayer::PutCardInHand(r5)
    else
        int32_t var_20_1 = 0
        ascension::CWorld::OutputAnimationCard(r4, arg3, 2, 3, r0_1, 2, r0_1, 0)
        core::CWorldBase::OutputMessageFormat(r4, "%s puts %s from discard on top of deck\n", 
            r5 + 0x10, (*(*arg3 + 0xc))(arg3))
        ascension::CPlayer::PutCardOnTopOfDeck(r5)
    
    result = *(arg2 + 0x258)
    
    if (result != 0)
        int32_t var_30_3 = 0
        return ascension::CWorld::OutputEvent(r4, 0x10, zx.d(*(r5 + 8)), zx.d(*(result + 8)))

return result
