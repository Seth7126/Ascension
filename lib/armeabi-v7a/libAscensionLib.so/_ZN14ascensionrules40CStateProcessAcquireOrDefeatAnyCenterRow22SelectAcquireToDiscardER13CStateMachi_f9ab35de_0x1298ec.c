// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow22SelectAcquireToDiscardER13CStateMachineP6CStateiPj
// 地址: 0x1298ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance* r5 = *(arg2 + 0x24c)
char* r4 = *(r5 + 4)
uint32_t result = ascension::CWorld::GetCenterRowCard(r4)

if (result != 0)
    CState* r0_5
    
    if (*(r4 + 0x30) u< 2)
        core::CWorldBase::OutputMessageFormat(r4, "%s acquires %s\n", r5 + 0x10, 
            *(result + 0xc) + 4)
        int32_t var_38_1 = 0
        ascension::CWorld::OutputAnimationCard(r4, result, 3, 7, arg3, 3, zx.d(*(r5 + 8)), 0)
        ascensionrules::CreateStateRemoveCenterRowCard(r5, arg3, nullptr, true, true, 0, 0, false, 
            nullptr, nullptr, 0, nullptr, 0)
        CState::AddOwnedChild(arg2)
        CStateList::AppendState(arg2)
        int32_t* r0_14 = operator new(0xa0)
        CState::CState()
        *r0_14 = _vtable_for_ascensionrules::CStateProcessAcquireCard + 8
        r0_14[0xc] = r5
        r0_14[0xd] = result
        r0_14[0xe] = _vtable_for_ascension::CEventAcquireCard + 8
        r0_14[0xf] = 0x12
        r0_14[0x10] = 0
        r0_14[0x21] = r5
        r0_14[0x22] = result
        r0_14[0x23] = nullptr
        r0_14[0x24] = 0
        r0_14[0x25] = 0
        r0_14[0x26].b = 1
        r0_14[0x27] = 0
        CState::AddOwnedChild(arg2)
        r0_5 = arg2
    else
        int32_t var_44_1 = 3
        ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
            operator new(0x990), r5, result, 7, arg3)
        CState::AddOwnedChild(arg2)
        r0_5 = arg2
    
    CStateList::AppendState(r0_5)
    result = 1
    *(arg2 + 0xcec) = 1

return result
