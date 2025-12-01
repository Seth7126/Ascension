// 函数: _ZNK14ascensionrules43CStateProcessAcquireOrDefeatTopOfCenterDeck10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x1328b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x2a4)
    uint32_t result_1 = operator new(0x2a4)
    char r7_1 = *(arg1 + 0x250)
    result = result_1
    char r10_1 = *(arg1 + 0x251)
    char r4_1 = *(arg1 + 0x252)
    CGameStateOptions::CGameStateOptions(result_1.b)
    *(result + 0x258) = 0
    *(result + 0x24c) = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck + 8
    *(result + 0x250) = r7_1
    *(result + 0x251) = r10_1
    *(result + 0x252) = r4_1
    *(result + 0x254) = 0
    *(result + 0x25c) = 0
else
    int16_t r4 = *(arg1 + 0x250)
    char r9_1 = *(arg1 + 0x252)
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x250) = r4
    *(result + 0x258) = 0
    *(result + 0x24c) = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck + 8
    *(result + 0x252) = r9_1
    *(result + 0x254) = 0
    *(result + 0x25c) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x2a4
    *arg_0 -= 0x2a4

*(result + 0x28) = arg1
void* r0_12 = *(arg1 + 0x254)
int32_t r0_14

if (r0_12 == 0)
    r0_14 = 0
else
    *(r0_12 + 8)
    r0_14 = core::CWorldBase::GetInstanceByID(arg3)

*(result + 0x254) = r0_14
*(result + 0x258) = *(arg1 + 0x258)
*(result + 0x259) = *(arg1 + 0x259)

if (*(arg1 + 0x38) s>= 1)
    ascensionrules::CStateProcessAcquireOrDefeatTopOfCenterDeck::BuildOptionList(result)

return result
