// 函数: _ZNK14ascensionrules39CStateMayAcquireOrDefeatTopOfCenterDeck10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x132d48
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x254)
    uint32_t result_1 = operator new(0x254)
    int32_t r4_1 = *(arg1 + 0x250)
    result = result_1
    CGameStateOptions::CGameStateOptions(result_1.b)
    *result = _vtable_for_ascensionrules::CStateMayAcquireOrDefeatTopOfCenterDeck + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r4_1
else
    int32_t r10_1 = *(arg1 + 0x250)
    CGameStateOptions::CGameStateOptions(result.b)
    *result = _vtable_for_ascensionrules::CStateMayAcquireOrDefeatTopOfCenterDeck + 8
    *(result + 0x24c) = r0_2
    *(result + 0x250) = r10_1
    *(result + 0x2c) = 0
    *arg4 += 0x254
    *arg_0 -= 0x254

*(result + 0x28) = arg1

if (*(arg1 + 0x38) s>= 1)
    int32_t var_2c_1 = 0
    CGameStateOptions::AddSimpleUserOption(result.w, 0, 0xa0f0, 0x1cafcb, 
        ascensionrules::CStateMayAcquireOrDefeatTopOfCenterDeck::SelectRevealCard)
    int32_t var_2c_2 = 0
    CGameStateOptions::AddSimpleUserOption(result.w, 0, 0xa0f1, 0x1cafcf, 
        ascensionrules::CStateMayAcquireOrDefeatTopOfCenterDeck::SelectDone)
    (*(*result + 0x34))(result, arg2, *(result + 0x24c), "Acquire or Defeat from Portal Deck?")

return result
