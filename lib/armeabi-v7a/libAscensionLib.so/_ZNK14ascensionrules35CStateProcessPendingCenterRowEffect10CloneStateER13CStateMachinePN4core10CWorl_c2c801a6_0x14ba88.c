// 函数: _ZNK14ascensionrules35CStateProcessPendingCenterRowEffect10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x14ba88
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x40)
    result = operator new(0x40)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateProcessPendingCenterRowEffect + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = 0
    *(result + 0x38) = 0
    *(result + 0x3c) = 0
else
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateProcessPendingCenterRowEffect + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = 0
    *(result + 0x38) = 0
    *(result + 0x3c) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x40
    *arg_0 -= 0x40

*(result + 0x28) = arg1
*(result + 0x38) = *(arg1 + 0x38)
void* r0_13 = *(arg1 + 0x3c)
int32_t r0_15

if (r0_13 == 0)
    r0_15 = 0
else
    *(r0_13 + 8)
    r0_15 = core::CWorldBase::GetInstanceByID(arg3)

*(result + 0x3c) = r0_15
return result
