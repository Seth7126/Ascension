// 函数: _ZN14ascensionrules47CStateProcessAcquireOrDefeatAllCardsInCenterRow22SelectAcquireToDiscardER13CStateMachineP6CStateiPj
// 地址: 0x12edfc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r7 = *(arg2 + 0x24c)
uint32_t r6 = *(r7 + 4)
int32_t* result = ascension::CWorld::GetCenterRowCard(r6)

if (result != 0)
    int32_t var_38_1 = 0
    ascension::CWorld::AddToAcquiredCards(r6, result.b, 7, 3)
    ascension::CWorld::OutputEvent(r6, 4, zx.d(*(r7 + 8)), zx.d(result[2].w))
    ascension::CPlayer::AddTurnLog(r7, 3)
    ascension::CPlayer::AddOwnedCard(r7)
    core::CWorldBase::OutputMessageFormat(r6, "%s acquires %s\n", r7 + 0x10, 
        (*(*result + 0xc))(result), 0)
    uint32_t r0_9 = zx.d(*(r7 + 8))
    uint32_t var_28_1 = r0_9
    ascension::CWorld::OutputAnimationCard(r6, result, 3, 7, arg3, 3, r0_9, 1)
    ascension::CPlayer::PutCardInDiscard(r7)
    ascension::CWorld::RemoveCenterRowCard(r6, arg3.b)
    *(arg2 + arg3 + 0x6a0) = 1
    result = *(arg2 + 0x680) + 1
    *(arg2 + 0x680) = result

return result
