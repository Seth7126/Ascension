// 函数: _ZNK14ascensionrules52CStateProcessRevealAndDrawTopOfDeckUntilEndCondition10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x148704
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x38) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x4c)
    uint32_t result_1 = operator new(0x4c)
    char r7_1 = *(arg1 + 0x3c)
    result = result_1
    char r10_1 = *(arg1 + 0x3d)
    int32_t r8_1 = *(arg1 + 0x40)
    CStateList::CStateList()
    *(result + 0x38) = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessRevealAndDrawTopOfDeckUntilEndCondition + 8
    *(result + 0x3c) = r7_1
    *(result + 0x3d) = r10_1
    *(result + 0x40) = r8_1
    *(result + 0x44) = 0
    *(result + 0x48) = 0
else
    int32_t r10 = *(arg1 + 0x40)
    int16_t r8 = *(arg1 + 0x3c)
    CStateList::CStateList()
    *(result + 0x38) = r0_2
    *result = _vtable_for_ascensionrules::CStateProcessRevealAndDrawTopOfDeckUntilEndCondition + 8
    *(result + 0x3c) = r8
    *(result + 0x40) = r10
    *(result + 0x44) = 0
    *(result + 0x48) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x4c
    *arg_0 -= 0x4c

*(result + 0x28) = arg1
void* r0_12 = *(arg1 + 0x44)
int32_t r0_14

if (r0_12 == 0)
    r0_14 = 0
else
    *(r0_12 + 8)
    r0_14 = core::CWorldBase::GetInstanceByID(arg3)

*(result + 0x44) = r0_14
*(result + 0x48) = *(arg1 + 0x48)
return result
