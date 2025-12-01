// 函数: _ZN14ascensionrules37CStateRecoverConstructFromDiscardPile15SelectConstructER13CStateMachineP6CStateiPj
// 地址: 0x12701c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r5 = *(arg2 + 0x24c)
core::CCardInstance* r6 = *(r5 + 4)
int32_t result = ascension::CPlayer::RemoveCardFromDiscard(r5)

if (result == 0)
    return result

uint32_t r0_1 = zx.d(*(r5 + 8))

if (zx.d(*(arg2 + 0x250)) == 0)
    int32_t var_20_1 = 0
    ascension::CWorld::OutputAnimationCard(r6, arg3, 1, 3, r0_1, 1, r0_1, 0)
    core::CWorldBase::OutputMessageFormat(r6, "%s adds %s from discard to hand\n", r5 + 0x10, 
        (*(*arg3 + 0xc))(arg3))
    return ascension::CPlayer::PutCardInHand(r5) __tailcall

int32_t var_20 = 0
ascension::CWorld::OutputAnimationCard(r6, arg3, 1, 3, r0_1, 2, r0_1, 0)
core::CWorldBase::OutputMessageFormat(r6, "%s adds %s from discard to top of deck\n", r5 + 0x10, 
    (*(*arg3 + 0xc))(arg3))
return ascension::CPlayer::PutCardOnTopOfDeck(r5) __tailcall
