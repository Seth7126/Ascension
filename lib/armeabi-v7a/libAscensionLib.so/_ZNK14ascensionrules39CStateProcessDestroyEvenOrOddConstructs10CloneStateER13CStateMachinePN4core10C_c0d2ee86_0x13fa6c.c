// 函数: _ZNK14ascensionrules39CStateProcessDestroyEvenOrOddConstructs10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x13fa6c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x38) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
void** r2_1

if (result == 0 || *arg_0 u< 0xa0)
    uint32_t result_1 = operator new(0xa0)
    int32_t r7_1 = *(arg1 + 0x3c)
    result = result_1
    CStateList::CStateList()
    *result = _vtable_for_ascensionrules::CStateProcessDestroyEvenOrOddConstructs + 8
    *(result + 0x38) = r0_2
    *(result + 0x3c) = r7_1
    *(result + 0x48) = 0x19
    *(result + 0x4c) = 0
    *(result + 0x90) = 0
    *(result + 0x94) = 0
    *(result + 0x98) = 0
    *(result + 0x9c) = 0
    r2_1 = result + 0x44
    *r2_1 = _vtable_for_ascension::CEventPreventDestroyConstruct + 8
else
    int32_t r10_1 = *(arg1 + 0x3c)
    CStateList::CStateList()
    *result = _vtable_for_ascensionrules::CStateProcessDestroyEvenOrOddConstructs + 8
    *(result + 0x38) = r0_2
    *(result + 0x3c) = r10_1
    *(result + 0x48) = 0x19
    *(result + 0x4c) = 0
    *(result + 0x90) = 0
    *(result + 0x94) = 0
    *(result + 0x98) = 0
    *(result + 0x9c) = 0
    *(result + 0x2c) = 0
    r2_1 = result + 0x44
    *r2_1 = _vtable_for_ascension::CEventPreventDestroyConstruct + 8
    *arg4 += 0xa0
    *arg_0 -= 0xa0

*(result + 0x28) = arg1
*(result + 0x40) = *(arg1 + 0x40)
ascension::CEventPreventDestroyConstruct::CloneEvent(r2_1, arg1 + 0x44)
return result
