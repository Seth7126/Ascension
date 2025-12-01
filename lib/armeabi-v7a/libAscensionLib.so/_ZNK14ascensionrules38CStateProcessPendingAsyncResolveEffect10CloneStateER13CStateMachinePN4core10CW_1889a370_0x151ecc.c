// 函数: _ZNK14ascensionrules38CStateProcessPendingAsyncResolveEffect10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x151ecc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x34)
int32_t r10 = 0
int32_t r7 = 0

if (r0_3 != 0)
    *(r0_3 + 8)
    r7 = core::CWorldBase::GetInstanceByID(arg3)

void* r0_6 = *(arg1 + 0x38)

if (r0_6 != 0)
    *(r0_6 + 8)
    r10 = core::CWorldBase::GetInstanceByID(arg3)

void* r0_9 = *(arg1 + 0x40)
int32_t r5_1

if (r0_9 == 0)
    r5_1 = 0
else
    *(r0_9 + 8)
    r5_1 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x4c)
    uint32_t result_1 = operator new(0x4c)
    char r8_1 = *(arg1 + 0x48)
    result = result_1
    int32_t r6_1 = *(arg1 + 0x3c)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateProcessPendingAsyncResolveEffect + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r7
    *(result + 0x38) = r10
    *(result + 0x3c) = r6_1
    *(result + 0x40) = r5_1
    *(result + 0x44) = 0
    *(result + 0x48) = r8_1
else
    char r0_14 = *(arg1 + 0x48)
    int32_t r5_2 = *(arg1 + 0x3c)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateProcessPendingAsyncResolveEffect + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r7
    *(result + 0x38) = r10
    *(result + 0x3c) = r5_2
    *(result + 0x40) = r5_1
    *(result + 0x44) = 0
    *(result + 0x48) = r0_14
    *(result + 0x2c) = 0
    *arg4 += 0x4c
    *arg_0 -= 0x4c

*(result + 0x28) = arg1
return result
