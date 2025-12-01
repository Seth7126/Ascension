// 函数: _ZNK14ascensionrules38CStateProcessCopyEffectOfLifeboundHero10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x14f624
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x250) + 8)
int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x2ac)
    uint32_t result_1 = operator new(0x2ac)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateProcessCopyEffectOfLifeboundHero + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r0_5
    *(result + 0x254) = 0
    *(result + 0x258) = _vtable_for_ascension::CEventCopyHeroEffect + 8
    *(result + 0x25c) = 0x17
    *(result + 0x260) = 0
    *(result + 0x2a4) = r0_2
    *(result + 0x2a8) = 0
else
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessCopyEffectOfLifeboundHero + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r0_5
    *(result + 0x254) = 0
    *(result + 0x258) = _vtable_for_ascension::CEventCopyHeroEffect + 8
    *(result + 0x25c) = 0x17
    *(result + 0x260) = 0
    *(result + 0x2a4) = r0_2
    *(result + 0x2a8) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x2ac
    *arg_0 -= 0x2ac

*(result + 0x28) = arg1
void* r0_14 = *(arg1 + 0x2a8)

if (r0_14 != 0)
    *(r0_14 + 8)
    *(result + 0x2a8) = core::CWorldBase::GetInstanceByID(arg3)

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
