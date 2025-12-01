// 函数: _ZNK14ascensionrules29CStateDreambindCardForInsight10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x160030
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x254)
int32_t r6

if (r0_3 == 0)
    r6 = 0
else
    *(r0_3 + 8)
    r6 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x290)
    uint32_t result_1 = operator new(0x290)
    int32_t r4_1 = *(arg1 + 0x250)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateDreambindCardForInsight + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r4_1
    *(result + 0x254) = r6
    *(result + 0x258) = 0
else
    int32_t r9_1 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateDreambindCardForInsight + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r9_1
    *(result + 0x254) = r6
    *(result + 0x258) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x290
    *arg_0 -= 0x290

*(result + 0x28) = arg1
ascension::CEventQueryCardDefeatAttributes::DefeatCardEntry::CloneDefeatCardEntry(result + 0x25c, 
    arg1 + 0x25c)

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
