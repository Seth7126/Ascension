// 函数: _ZNK14ascensionrules33CStateProcessDiscardMultipleCards10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x144150
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x25c)
core::CWorldBase* var_30 = arg2
char*& var_2c = arg3
int32_t r0_5

if (r0_3 == 0)
    r0_5 = 0
else
    *(r0_3 + 8)
    r0_5 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0
void** r7_2

if (result == 0 || *arg_0 u< 0x2cc)
    uint32_t result_1 = operator new(0x2cc)
    int32_t r8_1 = *(arg1 + 0x258)
    result = result_1
    char r4_2 = *(arg1 + 0x254)
    int32_t r7_3 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateProcessDiscardMultipleCards + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r7_3
    *(result + 0x254) = r4_2
    *(result + 0x258) = r8_1
    *(result + 0x25c) = r0_5
    *(result + 0x260) = 0
    *(result + 0x264) = 0
    *(result + 0x268) = 0
    *(result + 0x270) = 0x1a
    *(result + 0x274) = 0
    *(result + 0x2b8) = r0_2
    *(result + 0x2bc) = 0
    *(result + 0x2c0) = 0
    *(result + 0x2c4) = 0
    *(result + 0x2c8) = 0
    r7_2 = result + 0x26c
    *r7_2 = _vtable_for_ascension::CEventDiscardCardsFromHand + 8
    int32_t r0_22 = operator new(0x10)
    *(result + 0x2c0) = r0_22
    *(result + 0x2c4) = r0_22
    *(result + 0x2c8) = r0_22 + 0x10
else
    int32_t r0_8 = *(arg1 + 0x258)
    char r4_1 = *(arg1 + 0x254)
    int32_t r7 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessDiscardMultipleCards + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r7
    *(result + 0x254) = r4_1
    *(result + 0x258) = r0_8
    *(result + 0x25c) = r0_5
    *(result + 0x260) = 0
    *(result + 0x264) = 0
    *(result + 0x268) = 0
    *(result + 0x270) = 0x1a
    *(result + 0x274) = 0
    *(result + 0x2b8) = r0_2
    *(result + 0x2bc) = 0
    *(result + 0x2c0) = 0
    *(result + 0x2c4) = 0
    *(result + 0x2c8) = 0
    r7_2 = result + 0x26c
    *r7_2 = _vtable_for_ascension::CEventDiscardCardsFromHand + 8
    int32_t r0_14 = operator new(0x10)
    *(result + 0x2c0) = r0_14
    *(result + 0x2c4) = r0_14
    *(result + 0x2c8) = r0_14 + 0x10
    *(result + 0x2c) = 0
    *arg4 += 0x2cc
    *arg_0 -= 0x2cc

*(result + 0x28) = arg1
*(result + 0x264) = *(arg1 + 0x264)
ascension::CEventDiscardCardsFromHand::CloneEvent(r7_2, arg1 + 0x26c)

if (*(arg1 + 0x38) s>= 1)
    ascensionrules::CStateProcessDiscardMultipleCards::PrepareDiscardList(result)

return result
