// 函数: _ZNK14ascensionrules31CStateProcessDefeatHeroSequence10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x1591b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x38) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
*(*(arg1 + 0x3c) + 8)
int32_t r0_5 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
void** r2_1
void** r6_2

if (result == 0 || *arg_0 u< 0x144)
    result = operator new(0x144)
    int32_t r0_20 = *(arg1 + 0x40)
    int32_t r0_21 = *(arg1 + 0x48)
    char r0_22 = *(arg1 + 0x4d)
    int32_t r10_1 = *(arg1 + 0x44)
    char r8_1 = *(arg1 + 0x4c)
    CStateList::CStateList()
    *result = _vtable_for_ascensionrules::CStateProcessDefeatHeroSequence + 8
    *(result + 0x38) = r0_2
    *(result + 0x3c) = r0_5
    *(result + 0x40) = r0_20
    *(result + 0x44) = r10_1
    *(result + 0x48) = r0_21
    *(result + 0x4c) = r8_1
    *(result + 0x4d) = r0_22
    *(result + 0x54) = 0x1b
    *(result + 0x58) = 0
    *(result + 0x9c) = 0
    *(result + 0xa0) = 0
    *(result + 0xa4) = 0
    *(result + 0xa8) = 0xffffffff
    *(result + 0xac) = 0
    *(result + 0xb0) = 0
    *(result + 0xb4) = 1
    r2_1 = result + 0x50
    *r2_1 = _vtable_for_ascension::CEventDefeatMonster + 8
    r6_2 = result + 0xbc
    *r6_2 = _vtable_for_ascension::CEventEnterCenterRow + 8
    *(r6_2 - 1) = 0
    *(r6_2 - 3) = 0
    *(r6_2 - 7) = 0
    r6_2[1] = 0x11
    r6_2[2] = 0
    r6_2[0x13] = 0
    r6_2[0x14] = 0
    r6_2[0x15] = 0xffffffff
    r6_2[0x16] = 0
    r6_2[0x17] = 0
    r6_2[0x18] = 0
    r6_2[0x21] = 0
else
    int32_t r0_8 = *(arg1 + 0x44)
    int32_t r10 = *(arg1 + 0x40)
    int16_t r0_9 = *(arg1 + 0x4c)
    int32_t r7_1 = *(arg1 + 0x48)
    CStateList::CStateList()
    *result = _vtable_for_ascensionrules::CStateProcessDefeatHeroSequence + 8
    *(result + 0x38) = r0_2
    *(result + 0x3c) = r0_5
    *(result + 0x40) = r10
    *(result + 0x44) = r0_8
    *(result + 0x48) = r7_1
    *(result + 0x4c) = r0_9
    *(result + 0x54) = 0x1b
    *(result + 0x58) = 0
    *(result + 0x9c) = 0
    *(result + 0xa0) = 0
    *(result + 0xa4) = 0
    *(result + 0xa8) = 0xffffffff
    *(result + 0xac) = 0
    *(result + 0xb0) = 0
    *(result + 0xb4) = 1
    r2_1 = result + 0x50
    *r2_1 = _vtable_for_ascension::CEventDefeatMonster + 8
    r6_2 = result + 0xbc
    *r6_2 = _vtable_for_ascension::CEventEnterCenterRow + 8
    *(r6_2 - 1) = 0
    *(r6_2 - 3) = 0
    *(r6_2 - 7) = 0
    r6_2[1] = 0x11
    r6_2[2] = 0
    r6_2[0x13] = 0
    r6_2[0x14] = 0
    r6_2[0x15] = 0xffffffff
    r6_2[0x16] = 0
    r6_2[0x17] = 0
    r6_2[0x18] = 0
    r6_2[0x21] = 0
    *(r6_2 - 0x90) = 0
    *arg4 += 0x144
    *arg_0 -= 0x144

*(result + 0x28) = arg1
ascension::CEventDefeatMonster::CloneEvent(r2_1, arg1 + 0x50)
ascension::CEventEnterCenterRow::CloneEvent(r6_2, arg1 + 0xbc)
*(result + 0xb8) = r6_2
*(result + 0x140) = *(arg1 + 0x140)
return result
