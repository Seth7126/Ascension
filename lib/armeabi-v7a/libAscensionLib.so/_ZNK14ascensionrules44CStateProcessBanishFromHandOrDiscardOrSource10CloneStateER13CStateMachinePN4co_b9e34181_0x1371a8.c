// 函数: _ZNK14ascensionrules44CStateProcessBanishFromHandOrDiscardOrSource10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x1371a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x264)
int32_t r0_5

if (r0_3 == 0)
    r0_5 = 0
else
    *(r0_3 + 8)
    r0_5 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x268)
    result = operator new(0x268)
    int32_t r0_17 = *(arg1 + 0x258)
    int32_t r0_18 = *(arg1 + 0x25c)
    char r8_1 = *(arg1 + 0x256)
    char r9_1 = *(arg1 + 0x255)
    char r4_1 = *(arg1 + 0x254)
    int32_t r7_1 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessBanishFromHandOrDiscardOrSource + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r7_1
    *(result + 0x254) = r4_1
    *(result + 0x255) = r9_1
    *(result + 0x256) = r8_1
    *(result + 0x258) = r0_17
    *(result + 0x25c) = r0_18
    *(result + 0x260) = 0
    *(result + 0x264) = r0_5
else
    int16_t r4 = *(arg1 + 0x254)
    int32_t r0_8 = *(arg1 + 0x25c)
    int32_t r10_1 = *(arg1 + 0x258)
    char r9 = *(arg1 + 0x256)
    int32_t r8 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x254) = r4
    *result = _vtable_for_ascensionrules::CStateProcessBanishFromHandOrDiscardOrSource + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r8
    *(result + 0x256) = r9
    *(result + 0x258) = r10_1
    *(result + 0x25c) = r0_8
    *(result + 0x260) = 0
    *(result + 0x264) = r0_5
    *(result + 0x2c) = 0
    *arg4 += 0x268
    *arg_0 -= 0x268

*(result + 0x28) = arg1

if (*(arg1 + 0x38) s>= 1)
    ascensionrules::CStateProcessBanishFromHandOrDiscardOrSource::BuildOptionList(result)

return result
