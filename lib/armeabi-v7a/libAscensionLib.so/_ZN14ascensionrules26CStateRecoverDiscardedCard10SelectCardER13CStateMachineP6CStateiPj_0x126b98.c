// 函数: _ZN14ascensionrules26CStateRecoverDiscardedCard10SelectCardER13CStateMachineP6CStateiPj
// 地址: 0x126b98
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r7 = *(arg2 + 0x24c)
core::CCardInstance* r4 = *(r7 + 4)
int32_t result = ascension::CPlayer::RemoveCardFromDiscard(r7)

if (result != 0)
    uint32_t r0_1 = zx.d(*(r7 + 8))
    int32_t var_20_1 = 0
    ascension::CWorld::OutputAnimationCard(r4, arg3, 1, 3, r0_1, 1, r0_1, 0)
    core::CWorldBase::OutputMessageFormat(r4, "%s puts %s from discard into hand\n", r7 + 0x10, 
        (*(*arg3 + 0xc))(arg3))
    result = ascension::CPlayer::PutCardInHand(r7)
    
    if (*(arg2 + 0x254) != 0)
        return ascension::CWorld::PlayActiveEffect(r4) __tailcall

return result
