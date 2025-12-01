// 函数: _ZNK14ascensionrules15CStateGainHonor10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x153d18
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x34)
int32_t r8

if (r0_3 == 0)
    r8 = 0
else
    *(r0_3 + 8)
    r8 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0
void** r2_1

if (result == 0 || *arg_0 u< 0x13c)
    uint32_t result_1 = operator new(0x13c)
    char r10_1 = *(arg1 + 0x3c)
    result = result_1
    int32_t r4_1 = *(arg1 + 0x38)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateGainHonor + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r8
    *(result + 0x38) = r4_1
    *(result + 0x3c) = r10_1
    *(result + 0x44) = 0x1c
    *(result + 0x48) = 0
    *(result + 0x8c) = r0_2
    *(result + 0x90) = 0
    *(result + 0x94) = 0
    *(result + 0x98) = 0
    r2_1 = result + 0x40
    *r2_1 = _vtable_for_ascension::CEventGainHonor + 8
else
    char r0_8 = *(arg1 + 0x3c)
    int32_t r10 = *(arg1 + 0x38)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateGainHonor + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r8
    *(result + 0x38) = r10
    *(result + 0x3c) = r0_8
    *(result + 0x44) = 0x1c
    *(result + 0x48) = 0
    *(result + 0x8c) = r0_2
    *(result + 0x90) = 0
    *(result + 0x94) = 0
    *(result + 0x98) = 0
    *(result + 0x2c) = 0
    r2_1 = result + 0x40
    *r2_1 = _vtable_for_ascension::CEventGainHonor + 8
    *arg4 += 0x13c
    *arg_0 -= 0x13c

*(result + 0x28) = arg1
ascension::CEventGainHonor::CloneEvent(r2_1, arg1 + 0x40)
return result
