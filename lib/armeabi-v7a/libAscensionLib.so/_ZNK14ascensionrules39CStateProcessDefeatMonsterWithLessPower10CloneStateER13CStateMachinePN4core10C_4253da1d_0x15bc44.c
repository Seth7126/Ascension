// 函数: _ZNK14ascensionrules39CStateProcessDefeatMonsterWithLessPower10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x15bc44
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r1_1 = *(arg1 + 0x25c)
int32_t r0_4

if (r1_1 == 0)
    r0_4 = 0
else
    *(r1_1 + 8)
    r0_4 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0
void** r2_1

if (result == 0 || *arg_0 u>> 3 u< 0xa3)
    result = operator new(0x518)
    char r0_16 = *(arg1 + 0x258)
    char r0_17 = *(arg1 + 0x257)
    char r6_1 = *(arg1 + 0x256)
    char r9_1 = *(arg1 + 0x255)
    char r10_1 = *(arg1 + 0x254)
    int32_t r4_1 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessDefeatMonsterWithLessPower + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r4_1
    *(result + 0x254) = r10_1
    *(result + 0x255) = r9_1
    *(result + 0x256) = r6_1
    *(result + 0x257) = r0_17
    *(result + 0x258) = r0_16
    *(result + 0x25c) = r0_4
    *(result + 0x260) = 0
    *(result + 0x264) = 0
    *(result + 0x4a4) = 0
    *(result + 0x4a8) = 0
    *(result + 0x4b0) = 0x1b
    *(result + 0x4b4) = 0
    r2_1 = result + 0x4ac
    *r2_1 = _vtable_for_ascension::CEventDefeatMonster + 8
    *(result + 0x515) = 0
    *(result + 0x4f8) = 0
    *(result + 0x4fc) = 0
    *(result + 0x500) = 0
    *(result + 0x504) = 0xffffffff
    *(result + 0x508) = 0
    *(result + 0x50c) = 0
    *(result + 0x510) = 1
    *(result + 0x517) = 0
    *(result + 0x511) = 0
    *(result + 0x44) = r10_1 ^ 1
else
    int32_t r9 = *(arg1 + 0x255)
    char r10 = *(arg1 + 0x254)
    int32_t r6 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessDefeatMonsterWithLessPower + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r6
    *(result + 0x254) = r10
    *(result + 0x255) = r9
    *(result + 0x25c) = r0_4
    *(result + 0x260) = 0
    *(result + 0x264) = 0
    *(result + 0x4a4) = 0
    *(result + 0x4a8) = 0
    *(result + 0x4b0) = 0x1b
    *(result + 0x4b4) = 0
    r2_1 = result + 0x4ac
    *r2_1 = _vtable_for_ascension::CEventDefeatMonster + 8
    *(result + 0x515) = 0
    *(result + 0x510) = 1
    *(result + 0x4f8) = 0
    *(result + 0x4fc) = 0
    *(result + 0x500) = 0
    *(result + 0x504) = 0xffffffff
    *(result + 0x508) = 0
    *(result + 0x50c) = 0
    *(result + 0x511) = 0
    *(result + 0x517) = 0
    *(result + 0x44) = r10 ^ 1
    *(result + 0x2c) = 0
    *arg4 += 0x518
    *arg_0 -= 0x518

*(result + 0x28) = arg1
ascension::CEventDefeatMonster::CloneEvent(r2_1, arg1 + 0x4ac)

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
