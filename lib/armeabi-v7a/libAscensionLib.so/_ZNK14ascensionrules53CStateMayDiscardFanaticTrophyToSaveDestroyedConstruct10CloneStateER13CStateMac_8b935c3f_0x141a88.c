// 函数: _ZNK14ascensionrules53CStateMayDiscardFanaticTrophyToSaveDestroyedConstruct10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x141a88
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
int32_t* r7_2

if (result == 0 || *arg_0 u< 0x258)
    uint32_t result_1 = operator new(0x258)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateMayDiscardFanaticTrophyToSaveDestroyedConstruct + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = 0
    r7_2 = result + 0x254
    *r7_2 = 0
else
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateMayDiscardFanaticTrophyToSaveDestroyedConstruct + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = 0
    *(result + 0x2c) = 0
    r7_2 = result + 0x254
    *r7_2 = 0
    *arg4 += 0x258
    *arg_0 -= 0x258

*(result + 0x28) = arg1
*(*(arg1 + 0x254) + 8)
*r7_2 = core::CWorldBase::GetInstanceByID(arg3)
return result
