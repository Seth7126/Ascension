// 函数: _ZNK14ascensionrules32CStateProcessMayDiscardTopOfDeck10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x147d58
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x25c)
    uint32_t result_1 = operator new(0x25c)
    int32_t r7_1 = *(arg1 + 0x250)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateProcessMayDiscardTopOfDeck + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r7_1
    *(result + 0x254) = 0
    *(result + 0x258) = 0
else
    int32_t r8_1 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateProcessMayDiscardTopOfDeck + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r8_1
    *(result + 0x254) = 0
    *(result + 0x258) = 0
    *(result + 0x2c) = 0
    *arg4 += 0x25c
    *arg_0 -= 0x25c

*(result + 0x28) = arg1
void* r0_12 = *(arg1 + 0x254)
void* const r0_14

if (r0_12 == 0)
    r0_14 = nullptr
else
    *(r0_12 + 8)
    r0_14 = core::CWorldBase::GetInstanceByID(arg3)

*(result + 0x254) = r0_14
*(result + 0x258) = *(arg1 + 0x258)

if (*(arg1 + 0x38) s>= 1)
    int32_t (* const var_30_2)(CStateMachine&, CState*, int32_t, uint32_t*)
    void* r0_18
    char const* const r3
    
    if (zx.d(*(arg1 + 0x258)) == 0)
        int32_t var_2c_3 = 0
        CGameStateOptions::AddSimpleUserOption(result.w, 0, 0xa0f0, "Shuffle", 
            ascensionrules::CStateProcessMayDiscardTopOfDeck::SelectShuffleDeck)
        var_30_2 = nullptr
        int32_t var_2c_4 = 0
        CGameStateOptions::AddSimpleUserOption(result.w, 0, 0xa0f1, "Pass", 0)
        r0_18 = *result
        r3 = "Shuffle Discard Pile into Deck?"
    else
        int32_t var_2c_1 = 0
        CGameStateOptions::AddSimpleUserOption(result.w, *(r0_14 + 8), 0xa032, "Put on Deck", 
            ascensionrules::CStateProcessMayDiscardTopOfDeck::SelectPutOnDeck)
        int32_t var_2c_2 = 0
        var_30_2 = ascensionrules::CStateProcessMayDiscardTopOfDeck::SelectPutInDiscard
        CGameStateOptions::AddSimpleUserOption(result.w, *(*(result + 0x254) + 8), 0xa033, 
            "Put in Discard", var_30_2)
        r0_18 = *result
        r3 = "You May Discard the Top Card from your Deck"
    
    (*(r0_18 + 0x34))(result, arg2, *(result + 0x24c), r3, var_30_2, 0)

return result
