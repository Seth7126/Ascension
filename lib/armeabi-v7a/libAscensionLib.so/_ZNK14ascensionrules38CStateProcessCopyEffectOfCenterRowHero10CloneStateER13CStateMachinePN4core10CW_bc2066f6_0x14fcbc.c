// 函数: _ZNK14ascensionrules38CStateProcessCopyEffectOfCenterRowHero10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x14fcbc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x254)
int32_t r4

if (r0_3 == 0)
    r4 = 0
else
    *(r0_3 + 8)
    r4 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x2b4)
    uint32_t result_1 = operator new(0x2b4)
    int32_t r10_1 = *(arg1 + 0x250)
    result = result_1
    int32_t r8_1 = *(arg1 + 0x258)
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateProcessCopyEffectOfCenterRowHero + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r10_1
    *(result + 0x254) = r4
    *(result + 0x258) = r8_1
    *(result + 0x25c) = 0
    *(result + 0x260) = _vtable_for_ascension::CEventCopyHeroEffect + 8
    *(result + 0x264) = 0x17
    *(result + 0x268) = 0
    *(result + 0x2ac) = r0_2
    *(result + 0x2b0) = 0
else
    int32_t r8 = *(arg1 + 0x250)
    int32_t r6_1 = *(arg1 + 0x258)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessCopyEffectOfCenterRowHero + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r8
    *(result + 0x254) = r4
    *(result + 0x258) = r6_1
    *(result + 0x25c) = 0
    *(result + 0x260) = _vtable_for_ascension::CEventCopyHeroEffect + 8
    *(result + 0x264) = 0x17
    *(result + 0x268) = 0
    *(result + 0x2ac) = r0_2
    *(result + 0x2b0) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x2b4
    *arg_0 -= 0x2b4

*(result + 0x28) = arg1
void* r0_15 = *(arg1 + 0x25c)
int32_t r0_17

if (r0_15 == 0)
    r0_17 = 0
else
    *(r0_15 + 8)
    r0_17 = core::CWorldBase::GetInstanceByID(arg3)

*(result + 0x25c) = r0_17
void* r0_18 = *(arg1 + 0x2b0)

if (r0_18 != 0)
    *(r0_18 + 8)
    *(result + 0x2b0) = core::CWorldBase::GetInstanceByID(arg3)

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
