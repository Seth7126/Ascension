// 函数: _ZNK14ascensionrules35CStateProcessAcquireHeroOrConstruct10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x12280c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x554)
    result = operator new(0x554)
    char r0_16 = *(arg1 + 0x250)
    char r0_17 = *(arg1 + 0x252)
    char r0_18 = *(arg1 + 0x260)
    int32_t r0_19 = *(arg1 + 0x258)
    int32_t r0_20 = *(arg1 + 0x25c)
    char r9_1 = *(arg1 + 0x251)
    char r10_1 = *(arg1 + 0x253)
    char r4_1 = *(arg1 + 0x255)
    char r8_1 = *(arg1 + 0x254)
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x24c) = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessAcquireHeroOrConstruct + 8
    *(result + 0x250) = r0_16
    *(result + 0x251) = r9_1
    *(result + 0x252) = r0_17
    *(result + 0x253) = r10_1
    *(result + 0x254) = r8_1
    *(result + 0x255) = r4_1
    *(result + 0x258) = r0_19
    *(result + 0x25c) = r0_20
    *(result + 0x260) = r0_18
    *(result + 0x264) = 0
else
    int32_t r0_5 = *(arg1 + 0x250)
    int32_t r0_6 = *(arg1 + 0x258)
    int16_t r8 = *(arg1 + 0x254)
    int32_t r10 = *(arg1 + 0x25c)
    char r9 = *(arg1 + 0x260)
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x254) = r8
    *result = _vtable_for_ascensionrules::CStateProcessAcquireHeroOrConstruct + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r0_5
    *(result + 0x258) = r0_6
    *(result + 0x25c) = r10
    *(result + 0x260) = r9
    *(result + 0x264) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x554
    *arg_0 -= 0x554

*(result + 0x28) = arg1

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
