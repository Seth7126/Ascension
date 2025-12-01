// 函数: _ZNK14ascensionrules24CStateMayDoubleHonorGain10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x155204
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x254)
int32_t r7

if (r0_3 == 0)
    r7 = 0
else
    *(r0_3 + 8)
    r7 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x25c)
    uint32_t result_1 = operator new(0x25c)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateMayDoubleHonorGain + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = 0
    *(result + 0x254) = r7
    *(result + 0x258) = 0
else
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateMayDoubleHonorGain + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = 0
    *(result + 0x254) = r7
    *(result + 0x258) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x25c
    *arg_0 -= 0x25c

*(result + 0x28) = arg1
*(result + 0x258) = *(arg1 + 0x258)

if (*(arg1 + 0x38) s>= 1)
    int32_t var_2c_1 = 0
    CGameStateOptions::AddSimpleUserOption(result.w, 0, 0xa0f0, "Double Honor Reward", 
        ascensionrules::CStateMayDoubleHonorGain::SelectDoubleHonorGain)
    int32_t var_2c_2 = 0
    CGameStateOptions::AddSimpleUserOption(result.w, 0, 0xa0f1, "Pass", 
        ascensionrules::CStateMayDoubleHonorGain::SelectPass)
    (*(*result + 0x34))(result, arg2, *(result + 0x24c), "Double the Honor Reward?")

return result
