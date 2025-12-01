// 函数: _ZNK14ascensionrules26CStateProcessDefeatMonster10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x1578f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x38) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x3c) + 8)
int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t var_2c
int32_t* arg_0
void** r2_1

if (result == 0 || *arg_0 u< 0xb0)
    result = operator new(0xb0)
    var_2c = *(arg1 + 0x40)
    CStateList::CStateList()
    *result = _vtable_for_ascensionrules::CStateProcessDefeatMonster + 8
    *(result + 0x38) = r0_2
    *(result + 0x3c) = r0_5
    *(result + 0x40) = var_2c
    *(result + 0x48) = 0x1b
    *(result + 0x4c) = 0
    *(result + 0x90) = 0
    *(result + 0x94) = 0
    *(result + 0x98) = 0
    *(result + 0x9c) = 0xffffffff
    *(result + 0xa0) = 0
    *(result + 0xa4) = 0
    *(result + 0xa8) = 1
    *(result + 0xaf) = 0
    *(result + 0xad) = 0
    *(result + 0xa9) = 0
    r2_1 = result + 0x44
    *r2_1 = _vtable_for_ascension::CEventDefeatMonster + 8
else
    var_2c = *(arg1 + 0x40)
    CStateList::CStateList()
    *result = _vtable_for_ascensionrules::CStateProcessDefeatMonster + 8
    *(result + 0x38) = r0_2
    *(result + 0x3c) = r0_5
    *(result + 0x40) = var_2c
    *(result + 0x48) = 0x1b
    *(result + 0x4c) = 0
    *(result + 0x90) = 0
    *(result + 0x94) = 0
    *(result + 0x98) = 0
    *(result + 0x9c) = 0xffffffff
    *(result + 0xa0) = 0
    *(result + 0xa4) = 0
    *(result + 0xa8) = 1
    *(result + 0xaf) = 0
    *(result + 0xad) = 0
    *(result + 0xa9) = 0
    r2_1 = result + 0x44
    *r2_1 = _vtable_for_ascension::CEventDefeatMonster + 8
    *(result + 0x2c) = 0
    *arg4 += 0xb0
    *arg_0 -= 0xb0

*(result + 0x28) = arg1
ascension::CEventDefeatMonster::CloneEvent(r2_1, arg1 + 0x44)

for (int32_t* i = *(arg1 + 0x30); i != 0; i = i[6])
    (*(*i + 0x24))(i, arg2, arg3, arg4, arg_0, var_2c, r0_2)
    CState::AddOwnedChild(result)
    CStateList::AppendState(result)

return result
