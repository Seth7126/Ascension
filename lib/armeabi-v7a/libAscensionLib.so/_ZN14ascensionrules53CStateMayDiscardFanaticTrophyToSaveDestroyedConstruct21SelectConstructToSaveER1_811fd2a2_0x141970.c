// 函数: _ZN14ascensionrules53CStateMayDiscardFanaticTrophyToSaveDestroyedConstruct21SelectConstructToSaveER13CStateMachineP6CStateiPj
// 地址: 0x141970
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r5 = *(arg2 + 0x254)
int32_t* r4 = *(arg2 + 0x24c)
uint32_t r7 = *(r5 + 0x10)
core::CCardInstance* r10 = r4[1]
int32_t var_28 = 0
ascension::CWorld::OutputAnimationCard(r10, r7, 6, 5, zx.d(*(r5 + 8)), 9, 0, &__elf_header)
uint32_t r0_2 = zx.d(*(arg3 + 8))
int32_t var_28_1 = 0
ascension::CWorld::OutputAnimationCard(r10, *(arg3 + 0x10), 1, 4, r0_2, 4, r0_2, 0)
int32_t result = ascension::CPlayer::RemoveTrophyFromPlay(r4)

if (result == 0)
    return result

ascension::CPlayer::RemoveOwnedCard(r4)
ascension::CWorld::PutCardInVoid(r10)
ascension::CPlayer::AddTurnLog(r4, 6)
core::CWorldBase::OutputMessageFormat(r10, "%s banishes %s from play\n", (*(*r4 + 0xc))(r4), 
    (*(*r7 + 0xc))(r7))
return ascension::CEventPreventDestroyConstruct::RemoveDestroyConstruct(*(arg2 + 0x250))
