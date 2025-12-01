// 函数: _ZNK14ascensionrules40CStateProcessDiscardHighestCostConstruct10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x13e5a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
void** r2_1

if (result == 0 || *arg_0 u< 0x2b0)
    uint32_t result_1 = operator new(0x2b0)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *(result + 0x24c) = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessDiscardHighestCostConstruct + 8
    *(result + 0x250) = 0
    *(result + 0x258) = 0x19
    *(result + 0x25c) = 0
    *(result + 0x2a0) = 0
    *(result + 0x2a4) = 0
    *(result + 0x2a8) = 0
    *(result + 0x2ac) = 0
    r2_1 = result + 0x254
    *r2_1 = _vtable_for_ascension::CEventPreventDestroyConstruct + 8
else
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x24c) = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessDiscardHighestCostConstruct + 8
    *(result + 0x250) = 0
    *(result + 0x258) = 0x19
    *(result + 0x25c) = 0
    *(result + 0x2a0) = 0
    *(result + 0x2a4) = 0
    *(result + 0x2a8) = 0
    *(result + 0x2ac) = 0
    *(result + 0x2c) = 0
    r2_1 = result + 0x254
    *r2_1 = _vtable_for_ascension::CEventPreventDestroyConstruct + 8
    *arg4 += 0x2b0
    *arg_0 -= 0x2b0

*(result + 0x28) = arg1
*(result + 0x250) = *(arg1 + 0x250)
ascension::CEventPreventDestroyConstruct::CloneEvent(r2_1, arg1 + 0x254)

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
