// 函数: _ZNK14ascensionrules35CStateProcessAcquireHeroToTopOfDeck10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x1206dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x268)
int32_t r0_5

if (r0_3 == 0)
    r0_5 = 0
else
    *(r0_3 + 8)
    r0_5 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x55c)
    result = operator new(0x55c)
    int32_t r0_20 = *(arg1 + 0x250)
    char r0_21 = *(arg1 + 0x262)
    int32_t r7_1 = *(arg1 + 0x254)
    int32_t r10_1 = *(arg1 + 0x258)
    int32_t r9_1 = *(arg1 + 0x25c)
    char r8_1 = *(arg1 + 0x261)
    char r4_1 = *(arg1 + 0x260)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessAcquireHeroToTopOfDeck + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r0_20
    *(result + 0x54) = r7_1
    *(result + 0x58) = r10_1
    *(result + 0x25c) = r9_1
    *(result + 0x260) = r4_1
    *(result + 0x261) = r8_1
    *(result + 0x262) = r0_21
    *(result + 0x264) = 0
    *(result + 0x268) = r0_5
    *(result + 0x26c) = 0
else
    int32_t r0_8 = *(arg1 + 0x250)
    int32_t r0_9 = *(arg1 + 0x25c)
    int16_t r4 = *(arg1 + 0x260)
    int32_t r9 = *(arg1 + 0x254)
    int32_t r10 = *(arg1 + 0x258)
    char r8 = *(arg1 + 0x262)
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x260) = r4
    *result = _vtable_for_ascensionrules::CStateProcessAcquireHeroToTopOfDeck + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r0_8
    *(result + 0x54) = r9
    *(result + 0x58) = r10
    *(result + 0x25c) = r0_9
    *(result + 0x262) = r8
    *(result + 0x264) = 0
    *(result + 0x268) = r0_5
    *(result + 0x26c) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x55c
    *arg_0 -= 0x55c

*(result + 0x28) = arg1

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
