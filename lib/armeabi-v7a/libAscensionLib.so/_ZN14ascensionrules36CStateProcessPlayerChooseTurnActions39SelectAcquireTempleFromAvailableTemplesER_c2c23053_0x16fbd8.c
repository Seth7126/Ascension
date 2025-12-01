// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions39SelectAcquireTempleFromAvailableTemplesER13CStateMachineP6CStateiPj
// 地址: 0x16fbd8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r5 = *(arg2 + 0x24c)
int32_t r7 = *(r5 + 4)
core::CCardInstance* result = core::CWorldBase::GetInstanceByID(r7)

if (result == 0)
    return result

void* r0_1 = *(result + 0xc)
*(r0_1 + 0xbc)
*(r0_1 + 0xc0)
ascension::CWorld::RemoveCurrentTurnLife(r7)
ascension::CWorld::RemoveCurrentTurnDeath(r7)
core::CWorldBase::OutputMessageFormat(r7, "%s acquires %s from Available Temples\n", r5 + 0x10, 
    (*(*result + 0xc))(result))
ascensionrules::CreateStateProcessAcquireCardSequence(r5, result, 0x17, 0, 5, nullptr, 0)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
