// 函数: _ZNK14ascensionrules26CStatePlayTreasureFromHand10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x169944
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x34) + 8)
int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x38)
    result = operator new(0x38)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStatePlayTreasureFromHand + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r0_5
else
    CState::CState()
    *result = _vtable_for_ascensionrules::CStatePlayTreasureFromHand + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r0_5
    *(result + 0x2c) = 0
    *arg4 += 0x38
    *arg_0 -= 0x38

*(result + 0x28) = arg1
return result
