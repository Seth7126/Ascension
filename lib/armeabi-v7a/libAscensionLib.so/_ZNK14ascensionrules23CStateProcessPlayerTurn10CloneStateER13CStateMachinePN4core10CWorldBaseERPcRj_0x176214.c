// 函数: _ZNK14ascensionrules23CStateProcessPlayerTurn10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x176214
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x38) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x1cc)
    result = operator new(0x1cc)
    CStateList::CStateList()
    *(result + 0x38) = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessPlayerTurn + 8
    *(result + 0x3c) = 0
    *(result + 0x40) = _vtable_for_ascension::CEventTurnSequence + 8
    *(result + 0x44) = 0x10
    *(result + 0x48) = 0
    *(result + 0x8c) = 0
    *(result + 0x90) = 1
    *(result + 0x1c8) = 0
else
    CStateList::CStateList()
    *(result + 0x38) = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessPlayerTurn + 8
    *(result + 0x3c) = 0
    *(result + 0x40) = _vtable_for_ascension::CEventTurnSequence + 8
    *(result + 0x44) = 0x10
    *(result + 0x48) = 0
    *(result + 0x8c) = 0
    *(result + 0x90) = 1
    *(result + 0x1c8) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x1cc
    *arg_0 -= 0x1cc

*(result + 0x28) = arg1
*(result + 0x3c) = *(arg1 + 0x3c)
*(result + 0x1c8) = *(arg1 + 0x1c8)
return result
