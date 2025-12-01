// 函数: _ZNK14ascensionrules17CStateHandleEvent10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x1530b4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x50)
    uint32_t result_1 = operator new(0x50)
    int32_t r8_2 = *(arg1 + 0x44)
    result = result_1
    char r7_1 = *(arg1 + 0x40)
    CStateList::CStateList()
    *result = _vtable_for_ascensionrules::CStateHandleEvent + 8
    *(result + 0x38) = arg3
    *(result + 0x3c) = 0
    *(result + 0x40) = r7_1
    *(result + 0x44) = r8_2
    *(result + 0x48) = 0
    *(result + 0x4c) = 0
else
    int32_t r9_1 = *(arg1 + 0x44)
    char r10_1 = *(arg1 + 0x40)
    CStateList::CStateList()
    *result = _vtable_for_ascensionrules::CStateHandleEvent + 8
    *(result + 0x38) = arg3
    *(result + 0x3c) = 0
    *(result + 0x40) = r10_1
    *(result + 0x44) = r9_1
    *(result + 0x48) = 0
    *(result + 0x4c) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x50
    *arg_0 -= 0x50

*(result + 0x28) = arg1
*(result + 0x48) = *(arg1 + 0x48)
*(result + 0x4c) = *(arg1 + 0x4c)
return result
