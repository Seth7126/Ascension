// 函数: _ZN14ascensionrules35CStateProcessAcquireHeroOrConstruct26SelectAcquireFromCenterRowER13CStateMachineP6CStateiPj
// 地址: 0x1221b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r5 = *(arg2 + 0x24c)
char* r4 = *(r5 + 4)
uint32_t result = ascension::CWorld::GetCenterRowCard(r4)

if (result == 0)
    return result

if (*(r4 + 0x30) u< 2)
    core::CWorldBase::OutputMessageFormat(r4, "%s acquires %s\n", r5 + 0x10, 
        (*(*result + 0xc))(result))
    int32_t var_38_1 = 0
    ascension::CWorld::OutputAnimationCard(r4, result, 3, 7, arg3, 3, zx.d(*(r5 + 8)), 0)
    ascensionrules::CreateStateRemoveCenterRowCard(r5, arg3, nullptr, true, true, 0, 0, false, 
        nullptr, nullptr, 0, nullptr, 0)
    CState::AddOwnedChild(arg2)
    CStateList::AppendState(arg2)
    ascension::CPlayer* r4_1 = operator new(0xa0)
    CState::CState()
    *r4_1 = _vtable_for_ascensionrules::CStateProcessAcquireCard + 8
    *(r4_1 + 0x30) = r5
    *(r4_1 + 0x34) = result
    *(r4_1 + 0x38) = _vtable_for_ascension::CEventAcquireCard + 8
    *(r4_1 + 0x3c) = 0x12
    *(r4_1 + 0x40) = 0
    *(r4_1 + 0x84) = r5
    *(r4_1 + 0x88) = result
    *(r4_1 + 0x8c) = nullptr
    *(r4_1 + 0x90) = 0
    *(r4_1 + 0x94) = 0
    *(r4_1 + 0x98) = 1
    *(r4_1 + 0x9c) = 0
else
    int32_t var_44_1 = 3
    ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
        operator new(0x990), r5, result, 7, arg3)

CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
