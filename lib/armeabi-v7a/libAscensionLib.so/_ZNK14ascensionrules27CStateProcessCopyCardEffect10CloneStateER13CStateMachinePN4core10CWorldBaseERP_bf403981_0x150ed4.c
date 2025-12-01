// 函数: _ZNK14ascensionrules27CStateProcessCopyCardEffect10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x150ed4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x40)
int32_t r0_5

if (r0_3 == 0)
    r0_5 = 0
else
    *(r0_3 + 8)
    r0_5 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x9c)
    uint32_t result_1 = operator new(0x9c)
    int32_t r4_1 = *(arg1 + 0x34)
    result = result_1
    int32_t r9_1 = *(arg1 + 0x38)
    char r7_1 = *(arg1 + 0x3d)
    char r8_1 = *(arg1 + 0x3c)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateProcessCopyCardEffect + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r4_1
    *(result + 0x38) = r9_1
    *(result + 0x3c) = r8_1
    *(result + 0x3d) = r7_1
    *(result + 0x40) = r0_5
    *(result + 0x44) = 0
    *(result + 0x48) = _vtable_for_ascension::CEventCopyHeroEffect + 8
    *(result + 0x4c) = 0x17
    *(result + 0x50) = 0
    *(result + 0x94) = r0_2
    *(result + 0x98) = 0
else
    int32_t r7 = *(arg1 + 0x34)
    int32_t r9 = *(arg1 + 0x38)
    int16_t r8 = *(arg1 + 0x3c)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateProcessCopyCardEffect + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r7
    *(result + 0x38) = r9
    *(result + 0x3c) = r8
    *(result + 0x40) = r0_5
    *(result + 0x44) = 0
    *(result + 0x48) = _vtable_for_ascension::CEventCopyHeroEffect + 8
    *(result + 0x4c) = 0x17
    *(result + 0x50) = 0
    *(result + 0x94) = r0_2
    *(result + 0x98) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x9c
    *arg_0 -= 0x9c

*(result + 0x28) = arg1
void* r0_15 = *(arg1 + 0x44)

if (r0_15 != 0)
    *(r0_15 + 8)
    *(result + 0x44) = core::CWorldBase::GetInstanceByID(arg3)

void* r0_18 = *(arg1 + 0x98)

if (r0_18 != 0)
    *(r0_18 + 8)
    *(result + 0x98) = core::CWorldBase::GetInstanceByID(arg3)

return result
