// 函数: _ZN14ascensionrules42CStateProcessDefeatNamedMonsterInCenterRow38SelectDefeatFromCenterRowToDiscardPileER13CStateMachineP6CStateiPj
// 地址: 0x15cd94
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r5 = *(arg2 + 0x24c)
char* r4 = *(r5 + 4)
uint32_t result = ascension::CWorld::GetCenterRowCard(r4)

if (result == 0)
    return result

core::CWorldBase::OutputMessageFormat(r4, "%s defeats %s\n", r5 + 0x10, *(result + 0xc) + 4)
int32_t var_28 = 0
ascensionrules::CStateProcessDefeatMonsterSequence::CStateProcessDefeatMonsterSequence(
    operator new(0x99c), r5, result, 7, arg3, true, false, true)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
