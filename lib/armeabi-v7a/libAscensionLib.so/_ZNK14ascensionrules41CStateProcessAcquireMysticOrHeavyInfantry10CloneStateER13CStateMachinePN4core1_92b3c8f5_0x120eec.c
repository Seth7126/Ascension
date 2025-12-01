// 函数: _ZNK14ascensionrules41CStateProcessAcquireMysticOrHeavyInfantry10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x120eec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x264)
    result = operator new(0x264)
    int32_t r4_1 = *(arg1 + 0x250)
    int32_t r9_1 = *(arg1 + 0x54)
    int32_t r10_2 = *(arg1 + 0x58)
    int32_t r0_17 = *(arg1 + 0x260)
    int32_t r8_1 = *(arg1 + 0x25c)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessAcquireMysticOrHeavyInfantry + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r4_1
    *(result + 0x54) = r9_1
    *(result + 0x58) = r10_2
    *(result + 0x25c) = r8_1
    *(result + 0x260) = r0_17
else
    int32_t r0_5 = *(arg1 + 0x25c)
    int32_t r0_6 = *(arg1 + 0x260)
    int32_t r8 = *(arg1 + 0x250)
    int32_t r10 = *(arg1 + 0x254)
    int32_t r9 = *(arg1 + 0x258)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessAcquireMysticOrHeavyInfantry + 8
    *(result + 0x24c) = r0_2
    *(result + 0x50) = r8
    *(result + 0x54) = r10
    *(result + 0x258) = r9
    *(result + 0x25c) = r0_5
    *(result + 0x260) = r0_6
    *(result + 0x2c) = 0
    *arg4 += 0x264
    *arg_0 -= 0x264

*(result + 0x28) = arg1

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
