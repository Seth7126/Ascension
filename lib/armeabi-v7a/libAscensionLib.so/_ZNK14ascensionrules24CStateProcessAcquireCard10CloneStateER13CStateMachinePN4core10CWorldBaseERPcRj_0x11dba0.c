// 函数: _ZNK14ascensionrules24CStateProcessAcquireCard10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x11dba0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x34) + 8)
int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0xa0)
    result = operator new(0xa0)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateProcessAcquireCard + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r0_5
    *(result + 0x38) = _vtable_for_ascension::CEventAcquireCard + 8
    *(result + 0x3c) = 0x12
    *(result + 0x40) = 0
    *(result + 0x84) = r0_2
    *(result + 0x88) = r0_5
    *(result + 0x8c) = 0
    *(result + 0x90) = 0
    *(result + 0x94) = 0
    *(result + 0x98) = 1
    *(result + 0x9c) = 0
else
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateProcessAcquireCard + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r0_5
    *(result + 0x38) = _vtable_for_ascension::CEventAcquireCard + 8
    *(result + 0x3c) = 0x12
    *(result + 0x40) = 0
    *(result + 0x84) = r0_2
    *(result + 0x88) = r0_5
    *(result + 0x8c) = 0
    *(result + 0x90) = 0
    *(result + 0x94) = 0
    *(result + 0x98) = 1
    *(result + 0x9c) = 0
    *(result + 0x2c) = 0
    *arg4 += 0xa0
    *arg_0 -= 0xa0

*(result + 0x28) = arg1
*(result + 0x98) = *(arg1 + 0x98)
return result
