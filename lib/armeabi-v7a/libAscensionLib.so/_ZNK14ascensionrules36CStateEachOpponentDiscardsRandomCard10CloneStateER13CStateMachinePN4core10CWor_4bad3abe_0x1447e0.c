// 函数: _ZNK14ascensionrules36CStateEachOpponentDiscardsRandomCard10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x1447e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x38) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x3c)
    result = operator new(0x3c)
    CStateList::CStateList()
    *(result + 0x38) = r0_2
    *result = _vtable_for_ascensionrules::CStateEachOpponentDiscardsRandomCard + 8
else
    CStateList::CStateList()
    *(result + 0x38) = r0_2
    *result = _vtable_for_ascensionrules::CStateEachOpponentDiscardsRandomCard + 8
    *(result + 0x2c) = 0
    *arg4 += 0x3c
    *arg_0 -= 0x3c

*(result + 0x28) = arg1
return result
