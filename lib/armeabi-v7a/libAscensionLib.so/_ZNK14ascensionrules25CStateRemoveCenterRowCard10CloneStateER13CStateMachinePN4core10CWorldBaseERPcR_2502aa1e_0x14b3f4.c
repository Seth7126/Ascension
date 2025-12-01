// 函数: _ZNK14ascensionrules25CStateRemoveCenterRowCard10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x14b3f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x30) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x38)
int32_t r0_5

if (r0_3 == 0)
    r0_5 = 0
else
    *(r0_3 + 8)
    r0_5 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0xe0)
    result = operator new(0xe0)
    int32_t r0_22 = *(arg1 + 0x54)
    int32_t r0_23 = *(arg1 + 0x4c)
    char r0_24 = *(arg1 + 0x48)
    int32_t r0_25 = *(arg1 + 0x40)
    int32_t r0_26 = *(arg1 + 0x44)
    char r8_1 = *(arg1 + 0x3d)
    char r7_1 = *(arg1 + 0x3c)
    int32_t r10_1 = *(arg1 + 0x34)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateRemoveCenterRowCard + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r10_1
    *(result + 0x38) = r0_5
    *(result + 0x3c) = r7_1
    *(result + 0x3d) = r8_1
    *(result + 0x40) = r0_25
    *(result + 0x44) = r0_26
    *(result + 0x48) = r0_24
    *(result + 0x4c) = r0_23
    *(result + 0x50) = 0
    *(result + 0x54) = r0_22
    *(result + 0x58) = 0
    *(result + 0x5c) = _vtable_for_ascension::CEventEnterCenterRow + 8
    *(result + 0x60) = 0x11
    *(result + 0x64) = 0
    *(result + 0xa8) = 0
    *(result + 0xac) = 0
    *(result + 0xb0) = 0xffffffff
    *(result + 0xb4) = 0
    *(result + 0xb8) = 0
    *(result + 0xbc) = 0
else
    int32_t r0_8 = *(arg1 + 0x40)
    int32_t r0_9 = *(arg1 + 0x44)
    int32_t r0_10 = *(arg1 + 0x54)
    int32_t r0_11 = *(arg1 + 0x4c)
    int32_t r4_1 = *(arg1 + 0x34)
    char r10 = *(arg1 + 0x48)
    int16_t r8 = *(arg1 + 0x3c)
    CState::CState()
    *result = _vtable_for_ascensionrules::CStateRemoveCenterRowCard + 8
    *(result + 0x30) = r0_2
    *(result + 0x34) = r4_1
    *(result + 0x38) = r0_5
    *(result + 0x3c) = r8
    *(result + 0x40) = r0_8
    *(result + 0x44) = r0_9
    *(result + 0x48) = r10
    *(result + 0x4c) = r0_11
    *(result + 0x50) = 0
    *(result + 0x54) = r0_10
    *(result + 0x58) = 0
    *(result + 0x5c) = _vtable_for_ascension::CEventEnterCenterRow + 8
    *(result + 0x60) = 0x11
    *(result + 0x64) = 0
    *(result + 0xa8) = 0
    *(result + 0xac) = 0
    *(result + 0xb0) = 0xffffffff
    *(result + 0xb4) = 0
    *(result + 0xb8) = 0
    *(result + 0xbc) = 0
    *(result + 0x2c) = 0
    *arg4 += 0xe0
    *arg_0 -= 0xe0

*(result + 0x28) = arg1
void* r0_33 = *(arg1 + 0x58)
int32_t r0_35

if (r0_33 == 0)
    r0_35 = 0
else
    *(r0_33 + 8)
    r0_35 = core::CWorldBase::GetInstanceByID(arg3)

*(result + 0x58) = r0_35
ascension::CEventEnterCenterRow::CloneEvent(result + 0x5c, arg1 + 0x5c)
return result
