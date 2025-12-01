// 函数: _ZNK14ascensionrules25CStatePlayMonsterFromHand10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x169ecc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x34) + 8)
int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
void** r2_1
void** r4_1

if (result == 0 || *arg_0 u< 0x8ec)
    result = operator new(0x8ec)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStatePlayMonsterFromHand + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r0_5
    *(result + 0x38) = 0
    *(result + 0x40) = 0x15
    *(result + 0x44) = 0
    *(result + 0x88) = 0
    *(result + 0x8c) = 0
    *(result + 0x90) = 0
    *(result + 0x98) = 0x18
    *(result + 0x9c) = 0
    *(result + 0xe0) = 0
    *(result + 0xe4) = 0
    *(result + 0xe8) = 0
    r4_1 = result + 0x94
    *r4_1 = _vtable_for_ascension::CEventPutConstructIntoPlay + 8
    r2_1 = result + 0x3c
    *r2_1 = _vtable_for_ascension::CEventPlayMonster + 8
else
    CState::CState()
    *result = _vtable_for_ascensionrules::CStatePlayMonsterFromHand + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r0_5
    *(result + 0x38) = 0
    *(result + 0x40) = 0x15
    *(result + 0x44) = 0
    *(result + 0x88) = 0
    *(result + 0x8c) = 0
    *(result + 0x90) = 0
    *(result + 0x98) = 0x18
    *(result + 0x9c) = 0
    *(result + 0xe0) = 0
    *(result + 0xe4) = 0
    *(result + 0xe8) = 0
    *(result + 0x2c) = 0
    r2_1 = result + 0x3c
    *r2_1 = _vtable_for_ascension::CEventPlayMonster + 8
    r4_1 = result + 0x94
    *r4_1 = _vtable_for_ascension::CEventPutConstructIntoPlay + 8
    *arg4 += 0x8ec
    *arg_0 -= 0x8ec

*(result + 0x28) = arg1
*(result + 0x38) = *(arg1 + 0x38)
ascension::CEventPlayMonster::CloneEvent(r2_1, arg1 + 0x3c)
ascension::CEventPutConstructIntoPlay::CloneEvent(r4_1, arg1 + 0x94)
return result
