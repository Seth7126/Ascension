// 函数: _ZNK14ascensionrules30CStatePlayVisionFromDreamscape10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x16b568
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x34) + 8)
int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
void** r2_1

if (result == 0 || *arg_0 u< 0x8a8)
    result = operator new(0x8a8)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStatePlayVisionFromDreamscape + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r0_5
    *(result + 0x38) = 0
    *(result + 0x83c) = 0
    *(result + 0x844) = 0x12
    *(result + 0x848) = 0
    *(result + 0x88c) = r0_2
    *(result + 0x890) = r0_5
    *(result + 0x894) = 0
    *(result + 0x898) = 0
    *(result + 0x89c) = 0
    *(result + 0x8a0) = 1
    *(result + 0x8a4) = 0
    r2_1 = result + 0x840
    *r2_1 = _vtable_for_ascension::CEventAcquireCard + 8
else
    CState::CState()
    *result = _vtable_for_ascensionrules::CStatePlayVisionFromDreamscape + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r0_5
    *(result + 0x38) = 0
    *(result + 0x83c) = 0
    *(result + 0x844) = 0x12
    *(result + 0x848) = 0
    *(result + 0x88c) = r0_2
    *(result + 0x890) = r0_5
    *(result + 0x894) = 0
    *(result + 0x898) = 0
    *(result + 0x89c) = 0
    *(result + 0x8a0) = 1
    *(result + 0x8a4) = 0
    *(result + 0x2c) = 0
    r2_1 = result + 0x840
    *r2_1 = _vtable_for_ascension::CEventAcquireCard + 8
    *arg4 += 0x8a8
    *arg_0 -= 0x8a8

*(result + 0x28) = arg1
*(result + 0x83c) = *(arg1 + 0x83c)
ascension::CEventAcquireCard::CloneEvent(r2_1, arg1 + 0x840)
return result
