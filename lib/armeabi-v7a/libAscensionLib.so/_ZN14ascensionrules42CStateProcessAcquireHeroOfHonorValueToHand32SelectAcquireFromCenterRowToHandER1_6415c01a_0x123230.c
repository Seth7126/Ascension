// 函数: _ZN14ascensionrules42CStateProcessAcquireHeroOfHonorValueToHand32SelectAcquireFromCenterRowToHandER13CStateMachineP6CStateiPj
// 地址: 0x123230
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r6 = *(arg2 + 0x24c)
uint32_t result = ascension::CWorld::GetCenterRowCard(*(r6 + 4))

if (result == 0)
    return result

int32_t var_24 = 1
ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
    operator new(0x990), r6, result, 7, arg3)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
