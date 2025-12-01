// 函数: _ZNK14ascensionrules40CStateProcessGainRunesOrAcquireConstruct10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x12c4d0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x254)
int32_t r10

if (r0_3 == 0)
    r10 = 0
else
    *(r0_3 + 8)
    r10 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u>> 3 u< 0xa9)
    uint32_t result_1 = operator new(0x548)
    int32_t r4_1 = *(arg1 + 0x250)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateProcessGainRunesOrAcquireConstruct + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r4_1
    *(result + 0x254) = r10
    *(result + 0x258) = 0
else
    int32_t r8_1 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessGainRunesOrAcquireConstruct + 8
    *(result + 0x24c) = r0_2
    *(result + 0x50) = r8_1
    *(result + 0x54) = r10
    *(result + 0x258) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x548
    *arg_0 -= 0x548

*(result + 0x28) = arg1

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
