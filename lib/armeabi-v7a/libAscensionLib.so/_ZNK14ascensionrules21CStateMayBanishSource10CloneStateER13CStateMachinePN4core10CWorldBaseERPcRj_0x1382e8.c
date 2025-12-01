// 函数: _ZNK14ascensionrules21CStateMayBanishSource10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x1382e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x25c)
    uint32_t result_1 = operator new(0x25c)
    int32_t r4_1 = *(arg1 + 0x250)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateMayBanishSource + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r4_1
    *(result + 0x254) = 0
    *(result + 0x258) = 0
    *(result + 0x44) = 1
else
    int32_t r10_1 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateMayBanishSource + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r10_1
    *(result + 0x254) = 0
    *(result + 0x258) = 0
    *(result + 0x44) = 1
    *(result + 0x2c) = 0
    *arg4 += 0x25c
    *arg_0 -= 0x25c

*(result + 0x28) = arg1
*(result + 0x258) = *(arg1 + 0x258)

if (*(arg1 + 0x38) s>= 1)
    ascensionrules::CStateMayBanishSource::BuildOptionList(result)

return result
