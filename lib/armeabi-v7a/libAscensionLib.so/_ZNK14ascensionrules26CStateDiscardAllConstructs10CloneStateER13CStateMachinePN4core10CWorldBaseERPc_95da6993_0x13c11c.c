// 函数: _ZNK14ascensionrules26CStateDiscardAllConstructs10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x13c11c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x38) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
void** r2_1

if (result == 0 || *arg_0 u< 0x9c)
    result = operator new(0x9c)
    CStateList::CStateList()
    *(result + 0x38) = r0_2
    *result = _vtable_for_ascensionrules::CStateDiscardAllConstructs + 8
    *(result + 0x3c) = 0
    *(result + 0x44) = 0x19
    *(result + 0x48) = 0
    *(result + 0x8c) = 0
    *(result + 0x90) = 0
    *(result + 0x94) = 0
    *(result + 0x98) = 0
    r2_1 = result + 0x40
    *r2_1 = _vtable_for_ascension::CEventPreventDestroyConstruct + 8
else
    CStateList::CStateList()
    *(result + 0x38) = r0_2
    *result = _vtable_for_ascensionrules::CStateDiscardAllConstructs + 8
    *(result + 0x3c) = 0
    *(result + 0x44) = 0x19
    *(result + 0x48) = 0
    *(result + 0x8c) = 0
    *(result + 0x90) = 0
    *(result + 0x94) = 0
    *(result + 0x98) = 0
    *(result + 0x2c) = 0
    r2_1 = result + 0x40
    *r2_1 = _vtable_for_ascension::CEventPreventDestroyConstruct + 8
    *arg4 += 0x9c
    *arg_0 -= 0x9c

*(result + 0x28) = arg1
*(result + 0x3c) = *(arg1 + 0x3c)
ascension::CEventPreventDestroyConstruct::CloneEvent(r2_1, arg1 + 0x40)
return result
