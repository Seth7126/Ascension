// 函数: _ZN14ascensionrules35CStateAcquireMechanaConstructToHand19SelectAcquireToHandER13CStateMachineP6CStateiPj
// 地址: 0x12c7b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r5 = *(arg2 + 0x24c)
uint32_t r6 = *(r5 + 4)
uint32_t result = ascension::CWorld::GetCenterRowCard(r6)

if (result == 0)
    return result

uint32_t var_28 = zx.d(*(r5 + 8))
ascension::CWorld::OutputEvent(r6, 5, zx.d(*(*(arg2 + 0x250) + 8)), zx.d(*(result + 8)))
int32_t var_24 = 1
ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
    operator new(0x990), r5, result, 7, arg3)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
