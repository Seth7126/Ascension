// 函数: _ZNK14ascensionrules36CStateProcessDestroyConstructsInPlay10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x13d5c4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
void** r2_1

if (result == 0 || *arg_0 u< 0x2bc)
    uint32_t result_1 = operator new(0x2bc)
    int32_t r4_1 = *(arg1 + 0x250)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateProcessDestroyConstructsInPlay + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r4_1
    *(result + 0x254) = 0
    *(result + 0x258) = 0
    *(result + 0x260) = 0x19
    *(result + 0x264) = 0
    __builtin_memset(result + 0x2a8, 0, 0x11)
    r2_1 = result + 0x25c
    *r2_1 = _vtable_for_ascension::CEventPreventDestroyConstruct + 8
else
    int32_t r8_1 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessDestroyConstructsInPlay + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r8_1
    *(result + 0x254) = 0
    *(result + 0x258) = 0
    *(result + 0x260) = 0x19
    *(result + 0x264) = 0
    __builtin_memset(result + 0x2a8, 0, 0x11)
    *(result + 0x2c) = 0
    r2_1 = result + 0x25c
    *r2_1 = _vtable_for_ascension::CEventPreventDestroyConstruct + 8
    *arg4 += 0x2bc
    *arg_0 -= 0x2bc

*(result + 0x28) = arg1
*(result + 0x258) = *(arg1 + 0x258)
*(result + 0x2b8) = *(arg1 + 0x2b8)
ascension::CEventPreventDestroyConstruct::CloneEvent(r2_1, arg1 + 0x25c)

if (*(arg1 + 0x38) s>= 1)
    ascensionrules::CStateProcessDestroyConstructsInPlay::BuildDestroyOptions(result)

return result
