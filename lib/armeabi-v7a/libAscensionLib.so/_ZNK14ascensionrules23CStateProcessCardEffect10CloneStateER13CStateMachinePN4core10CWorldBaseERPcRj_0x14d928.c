// 函数: _ZNK14ascensionrules23CStateProcessCardEffect10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x14d928
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x3c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x44)
int32_t r9

if (r0_3 == 0)
    r9 = 0
else
    *(r0_3 + 8)
    r9 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x7a0)
    uint32_t result_1 = operator new(0x7a0)
    int32_t r6_1 = *(arg1 + 0x40)
    result = result_1
    CStateList::CStateList()
    *result = _vtable_for_ascensionrules::CStateProcessCardEffect + 8
    *(result + 0x38) = arg3
    *(result + 0x3c) = r0_2
    *(result + 0x40) = r6_1
    *(result + 0x44) = r9
    *(result + 0x48) = 0
    *(result + 0x19c) = 0
    CState::SetEmbeddedStateBuffer(result, 0x600)
else
    int32_t r10_1 = *(arg1 + 0x40)
    CStateList::CStateList()
    *result = _vtable_for_ascensionrules::CStateProcessCardEffect + 8
    *(result + 0x38) = arg3
    *(result + 0x3c) = r0_2
    *(result + 0x40) = r10_1
    *(result + 0x44) = r9
    *(result + 0x48) = 0
    *(result + 0x19c) = 0
    CState::SetEmbeddedStateBuffer(result, 0x600)
    *(result + 0x2c) = 0
    *arg4 += 0x7a0
    *arg_0 -= 0x7a0

*(result + 0x28) = arg1
*(result + 0x19c) = *(arg1 + 0x19c)
__aeabi_memcpy4(result + 0x4c, arg1 + 0x4c, 0x150)
return result
