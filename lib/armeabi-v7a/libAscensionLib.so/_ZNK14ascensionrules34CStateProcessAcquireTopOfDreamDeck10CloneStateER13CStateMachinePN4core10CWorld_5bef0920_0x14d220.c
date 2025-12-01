// 函数: _ZNK14ascensionrules34CStateProcessAcquireTopOfDreamDeck10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x14d220
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x2a0)
    uint32_t result_1 = operator new(0x2a0)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *(result + 0x254) = 0
    *result = _vtable_for_ascensionrules::CStateProcessAcquireTopOfDreamDeck + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = 0
    *(result + 0x258) = 0
else
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x254) = 0
    *result = _vtable_for_ascensionrules::CStateProcessAcquireTopOfDreamDeck + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = 0
    *(result + 0x258) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x2a0
    *arg_0 -= 0x2a0

*(result + 0x28) = arg1
void* r0_12 = *(arg1 + 0x250)
int32_t r0_14

if (r0_12 == 0)
    r0_14 = 0
else
    *(r0_12 + 8)
    r0_14 = core::CWorldBase::GetInstanceByID(arg3)

*(result + 0x250) = r0_14
*(result + 0x254) = *(arg1 + 0x254)
*(result + 0x255) = *(arg1 + 0x255)

if (*(arg1 + 0x38) s>= 1)
    ascensionrules::CStateProcessAcquireTopOfDreamDeck::BuildOptionList(result)

return result
