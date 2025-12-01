// 函数: _ZNK14ascensionrules27CStateProcessPlayEntireHand10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x16b0a0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x38) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
void** r2_1

if (result == 0 || *arg_0 u< 0x90)
    result = operator new(0x90)
    CStateList::CStateList()
    *(result + 0x38) = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessPlayEntireHand + 8
    *(result + 0x40) = 0x18
    *(result + 0x44) = 0
    *(result + 0x88) = 0
    *(result + 0x8c) = 0
    r2_1 = result + 0x3c
    *r2_1 = _vtable_for_ascension::CEventPutConstructIntoPlay + 8
else
    CStateList::CStateList()
    *(result + 0x38) = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessPlayEntireHand + 8
    *(result + 0x40) = 0x18
    *(result + 0x44) = 0
    *(result + 0x88) = 0
    *(result + 0x8c) = 0
    *(result + 0x2c) = 0
    r2_1 = result + 0x3c
    *r2_1 = _vtable_for_ascension::CEventPutConstructIntoPlay + 8
    *arg4 += 0x90
    *arg_0 -= 0x90

*(result + 0x28) = arg1
ascension::CEventPutConstructIntoPlay::CloneEvent(r2_1, arg1 + 0x3c)
return result
