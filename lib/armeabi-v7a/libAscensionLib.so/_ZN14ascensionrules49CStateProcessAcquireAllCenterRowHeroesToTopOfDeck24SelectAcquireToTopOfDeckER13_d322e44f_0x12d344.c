// 函数: _ZN14ascensionrules49CStateProcessAcquireAllCenterRowHeroesToTopOfDeck24SelectAcquireToTopOfDeckER13CStateMachineP6CStateiPj
// 地址: 0x12d344
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r7 = *(arg2 + 0x24c)
int32_t r6 = *(r7 + 4)
void* result = ascension::CWorld::GetCenterRowCard(r6)

if (result != 0)
    int32_t var_38_1 = 0
    ascension::CWorld::AddToAcquiredCards(r6, result.b, 7, 2)
    ascension::CWorld::OutputEvent(r6, 4, zx.d(*(r7 + 8)), zx.d(*(result + 8)))
    ascension::CPlayer::AddTurnLog(r7, 3)
    ascension::CPlayer::AddOwnedCard(r7)
    core::CWorldBase::OutputMessageFormat(r6, "%s puts %s on top of deck\n", r7 + 0x10, 
        (*(*result + 0xc))(result), 0)
    uint32_t r0_9 = zx.d(*(r7 + 8))
    uint32_t var_28_1 = r0_9
    ascension::CWorld::OutputAnimationCard(r6, result, 3, 7, arg3, 2, r0_9, 1)
    ascension::CPlayer::PutCardOnTopOfDeck(r7)
    ascension::CWorld::RemoveCenterRowCard(r6, arg3.b)
    result = arg2 + arg3
    *(result + 0x454) = 1

return result
