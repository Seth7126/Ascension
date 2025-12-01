// 函数: _ZNK14ascensionrules28CStateProcessDiscardFromHand10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x143640
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
void* r0_3 = *(arg1 + 0x254)
int32_t r0_5

if (r0_3 == 0)
    r0_5 = 0
else
    *(r0_3 + 8)
    r0_5 = core::CWorldBase::GetInstanceByID(arg3)

uint32_t result = *arg4
int32_t* arg_0
void** r7_2

if (result == 0 || *arg_0 u< 0x2bc)
    uint32_t result_1 = operator new(0x2bc)
    int32_t r9_1 = *(arg1 + 0x250)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateProcessDiscardFromHand + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r9_1
    *(result + 0x254) = r0_5
    *(result + 0x258) = 0
    *(result + 0x260) = 0x1a
    *(result + 0x264) = 0
    *(result + 0x2a8) = r0_2
    *(result + 0x2ac) = 0
    *(result + 0x2b0) = 0
    *(result + 0x2b4) = 0
    *(result + 0x2b8) = 0
    r7_2 = result + 0x25c
    *r7_2 = _vtable_for_ascension::CEventDiscardCardsFromHand + 8
    int32_t r0_20 = operator new(0x10)
    *(result + 0x2b0) = r0_20
    *(result + 0x2b4) = r0_20
    *(result + 0x2b8) = r0_20 + 0x10
else
    int32_t r9 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessDiscardFromHand + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r9
    *(result + 0x254) = r0_5
    *(result + 0x258) = 0
    *(result + 0x260) = 0x1a
    *(result + 0x264) = 0
    *(result + 0x2a8) = r0_2
    *(result + 0x2ac) = 0
    *(result + 0x2b0) = 0
    *(result + 0x2b4) = 0
    *(result + 0x2b8) = 0
    r7_2 = result + 0x25c
    *r7_2 = _vtable_for_ascension::CEventDiscardCardsFromHand + 8
    int32_t r0_12 = operator new(0x10)
    *(result + 0x2b0) = r0_12
    *(result + 0x2b4) = r0_12
    *(result + 0x2b8) = r0_12 + 0x10
    *(result + 0x2c) = 0
    *arg4 += 0x2bc
    *arg_0 -= 0x2bc

*(result + 0x28) = arg1
ascension::CEventDiscardCardsFromHand::CloneEvent(r7_2, arg1 + 0x25c)

if (*(arg1 + 0x38) s>= 1)
    (*(*result + 8))(result, arg2)

return result
