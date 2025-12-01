// 函数: _ZNK14ascensionrules30CStatePutCardIntoPlayerDiscard10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x1466a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x250) + 8)
int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x260)
    uint32_t result_1 = operator new(0x260)
    char r10_1 = *(arg1 + 0x258)
    result = result_1
    int32_t r4_1 = *(arg1 + 0x254)
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStatePutCardIntoPlayerDiscard + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r0_5
    *(result + 0x254) = r4_1
    *(result + 0x258) = r10_1
    *(result + 0x25c) = 0
else
    char r8_1 = *(arg1 + 0x258)
    int32_t r10 = *(arg1 + 0x254)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStatePutCardIntoPlayerDiscard + 8
    *(result + 0x24c) = r0_2
    *(result + 0x50) = r0_5
    *(result + 0x54) = r10
    *(result + 0x258) = r8_1
    *(result + 0x25c) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x260
    *arg_0 -= 0x260

*(result + 0x28) = arg1

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
