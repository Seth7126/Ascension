// 函数: _ZNK14ascensionrules42CStateProcessDefeatNamedMonsterInCenterRow10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x15ce6c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
void** r2_1

if (result == 0 || *arg_0 u< 0x500)
    uint32_t result_1 = operator new(0x500)
    int32_t r4_1 = *(arg1 + 0x250)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *(result + 0x4fd) = 0
    *result = _vtable_for_ascensionrules::CStateProcessDefeatNamedMonsterInCenterRow + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r4_1
    *(result + 0x254) = 0
    *(result + 0x498) = 0x1b
    *(result + 0x49c) = 0
    *(result + 0x4e0) = 0
    *(result + 0x4e4) = 0
    *(result + 0x4e8) = 0
    *(result + 0x4ec) = 0xffffffff
    *(result + 0x4f0) = 0
    *(result + 0x4f4) = 0
    *(result + 0x4f8) = 1
    *(result + 0x4ff) = 0
    *(result + 0x4f9) = 0
    r2_1 = result + 0x494
    *r2_1 = _vtable_for_ascension::CEventDefeatMonster + 8
else
    int32_t r8_1 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x4fd) = 0
    *result = _vtable_for_ascensionrules::CStateProcessDefeatNamedMonsterInCenterRow + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r8_1
    *(result + 0x254) = 0
    *(result + 0x498) = 0x1b
    *(result + 0x49c) = 0
    *(result + 0x4e0) = 0
    *(result + 0x4e4) = 0
    *(result + 0x4e8) = 0
    *(result + 0x4ec) = 0xffffffff
    *(result + 0x4f0) = 0
    *(result + 0x4f4) = 0
    *(result + 0x4f8) = 1
    *(result + 0x4ff) = 0
    *(result + 0x4f9) = 0
    r2_1 = result + 0x494
    *r2_1 = _vtable_for_ascension::CEventDefeatMonster + 8
    *(result + 0x2c) = 0
    *arg4 += 0x500
    *arg_0 -= 0x500

*(result + 0x28) = arg1
ascension::CEventDefeatMonster::CloneEvent(r2_1, arg1 + 0x494)

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
