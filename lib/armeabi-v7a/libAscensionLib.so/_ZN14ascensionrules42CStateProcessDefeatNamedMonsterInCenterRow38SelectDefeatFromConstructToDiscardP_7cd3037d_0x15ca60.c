// 函数: _ZN14ascensionrules42CStateProcessDefeatNamedMonsterInCenterRow38SelectDefeatFromConstructToDiscardPileER13CStateMachineP6CStateiPj
// 地址: 0x15ca60
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = *(arg3 + 0x4c)
uint32_t r5 = *(result - 4)

if (r5 == 0)
    return result

core::CCardInstance* r6 = *(arg2 + 0x24c)
core::CWorldBase::OutputMessageFormat(*(r6 + 4), "%s defeats %s\n", r6 + 0x10, *(r5 + 0xc) + 4)
int32_t var_28 = 0
ascensionrules::CStateProcessDefeatMonsterSequence::CStateProcessDefeatMonsterSequence(
    operator new(0x99c), r6, r5, 4, zx.d(*(r6 + 8)), true, false, true)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
