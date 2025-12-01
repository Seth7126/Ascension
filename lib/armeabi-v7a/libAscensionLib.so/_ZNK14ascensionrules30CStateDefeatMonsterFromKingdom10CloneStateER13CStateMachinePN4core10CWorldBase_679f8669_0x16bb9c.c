// 函数: _ZNK14ascensionrules30CStateDefeatMonsterFromKingdom10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x16bb9c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x34) + 8)
int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x38) + 8)
int32_t r0_8 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
void** r2_1

if (result == 0 || *arg_0 u< 0x8b4)
    uint32_t result_1 = operator new(0x8b4)
    char r10_1 = *(arg1 + 0x3c)
    result = result_1
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateDefeatMonsterFromKingdom + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r0_5
    *(result + 0x38) = r0_8
    *(result + 0x3c) = r10_1
    *(result + 0x40) = 0
    *(result + 0x844) = 0
    *(result + 0x84c) = 0x1b
    *(result + 0x850) = 0
    *(result + 0x894) = r0_2
    *(result + 0x898) = r0_5
    *(result + 0x89c) = 0
    *(result + 0x8a0) = 0xffffffff
    *(result + 0x8a4) = 0
    *(result + 0x8a8) = 0
    *(result + 0x8ac) = 1
    r2_1 = result + 0x848
    *r2_1 = _vtable_for_ascension::CEventDefeatMonster + 8
    *(result + 0x8b3) = 0
    *(result + 0x8b1) = 0
    *(result + 0x8ad) = 0
else
    char r0_11 = *(arg1 + 0x3c)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateDefeatMonsterFromKingdom + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r0_5
    *(result + 0x38) = r0_8
    *(result + 0x3c) = r0_11
    *(result + 0x40) = 0
    *(result + 0x844) = 0
    *(result + 0x84c) = 0x1b
    *(result + 0x850) = 0
    *(result + 0x894) = r0_2
    *(result + 0x898) = r0_5
    *(result + 0x89c) = 0
    *(result + 0x8a0) = 0xffffffff
    *(result + 0x8a4) = 0
    *(result + 0x8a8) = 0
    *(result + 0x8ac) = 1
    r2_1 = result + 0x848
    *r2_1 = _vtable_for_ascension::CEventDefeatMonster + 8
    *(result + 0x8b3) = 0
    *(result + 0x8b1) = 0
    *(result + 0x8ad) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x8b4
    *arg_0 -= 0x8b4

*(result + 0x28) = arg1
*(result + 0x844) = *(arg1 + 0x844)
ascension::CEventDefeatMonster::CloneEvent(r2_1, arg1 + 0x848)
return result
