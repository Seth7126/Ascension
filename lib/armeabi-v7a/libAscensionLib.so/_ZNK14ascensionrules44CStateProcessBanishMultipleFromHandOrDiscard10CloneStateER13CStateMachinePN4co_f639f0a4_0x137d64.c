// 函数: _ZNK14ascensionrules44CStateProcessBanishMultipleFromHandOrDiscard10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x137d64
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x260)
    result = operator new(0x260)
    char r0_11 = *(arg1 + 0x257)
    char r10_1 = *(arg1 + 0x256)
    char r4_1 = *(arg1 + 0x255)
    char r8_1 = *(arg1 + 0x254)
    int32_t r9_2 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessBanishMultipleFromHandOrDiscard + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r9_2
    *(result + 0x254) = r8_1
    *(result + 0x255) = r4_1
    *(result + 0x256) = r10_1
    *(result + 0x257) = r0_11
    *(result + 0x258) = 0
    *(result + 0x25c) = 0
else
    int32_t r8 = *(arg1 + 0x250)
    int32_t r10 = *(arg1 + 0x254)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessBanishMultipleFromHandOrDiscard + 8
    *(result + 0x24c) = r0_2
    *(result + 0x50) = r8
    *(result + 0x54) = r10
    *(result + 0x258) = 0
    *(result + 0x25c) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x260
    *arg_0 -= 0x260

*(result + 0x28) = arg1
*(result + 0x25c) = *(arg1 + 0x25c)

if (*(arg1 + 0x38) s>= 1)
    ascensionrules::CStateProcessBanishMultipleFromHandOrDiscard::BuildOptionList(result)

return result
