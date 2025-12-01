// 函数: _ZNK14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x12b63c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char*& var_28 = arg3
*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0
void** r2_2

if (result == 0 || *arg_0 u< 0xd5c)
    result = operator new(0xd5c)
    char r0_11 = *(arg1 + 0x259)
    char r0_12 = *(arg1 + 0x258)
    char r0_13 = *(arg1 + 0x257)
    char r7_1 = *(arg1 + 0x256)
    char r10_1 = *(arg1 + 0x255)
    char r4_1 = *(arg1 + 0x254)
    int32_t r8_1 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0xcec) = 0
    *(result + 0xcf8) = 0
    *result = _vtable_for_ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r8_1
    *(result + 0x254) = r4_1
    *(result + 0x255) = r10_1
    *(result + 0x256) = r7_1
    *(result + 0x257) = r0_13
    *(result + 0x258) = r0_12
    *(result + 0x259) = r0_11
    *(result + 0x25c) = 0
    *(result + 0xa9c) = 0
    *(result + 0xcdc) = 0
    *(result + 0xce0) = 0
    *(result + 0xce4) = 0
    *(result + 0xce8) = 0
    *(result + 0xcf4) = 0x1b
    r2_2 = result + 0xcf0
    *r2_2 = _vtable_for_ascension::CEventDefeatMonster + 8
    *(r2_2 + 0xa) = 0
    r2_2[0x13] = 0
    r2_2[0x14] = 0
    r2_2[0x15] = 0
    r2_2[0x16] = 0xffffffff
    r2_2[0x17] = 0
    r2_2[0x18] = 0
    r2_2[0x19].b = 1
    *(r2_2 + 0x6b) = 0
    *(r2_2 + 0x69) = 0
    *(r2_2 + 0x65) = 0
else
    int16_t r9_1 = *(arg1 + 0x258)
    int32_t r7 = *(arg1 + 0x250)
    int32_t r10 = *(arg1 + 0x254)
    CGameStateOptions::CGameStateOptions(result.b)
    *(result + 0x258) = r9_1
    *(result + 0xcec) = 0
    *result = _vtable_for_ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow + 8
    *(result + 0x24c) = r0_2
    *(result + 0x50) = r7
    *(result + 0x54) = r10
    *(result + 0x25c) = 0
    *(result + 0xa9c) = 0
    *(result + 0xcdc) = 0
    *(result + 0xce0) = 0
    *(result + 0xce4) = 0
    *(result + 0xce8) = 0
    *(result + 0xcf4) = 0x1b
    *(result + 0xcf8) = 0
    r2_2 = result + 0xcf0
    *r2_2 = _vtable_for_ascension::CEventDefeatMonster + 8
    *(result + 0xd59) = 0
    *(result + 0xd3c) = 0
    *(result + 0xd40) = 0
    *(result + 0xd44) = 0
    *(result + 0xd48) = 0xffffffff
    *(result + 0xd4c) = 0
    *(result + 0xd50) = 0
    *(result + 0xd54) = 1
    *(result + 0xd5b) = 0
    *(result + 0xd55) = 0
    *(result + 0x2c) = 0
    *arg4 += 0xd5c
    *arg_0 -= 0xd5c

*(result + 0x28) = arg1
*(result + 0xcec) = *(arg1 + 0xcec)
*(result + 0xced) = *(arg1 + 0xced)
ascension::CEventDefeatMonster::CloneEvent(r2_2, arg1 + 0xcf0)

if (*(arg1 + 0x38) s>= 1)
    ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::BuildOptions(result)

return result
