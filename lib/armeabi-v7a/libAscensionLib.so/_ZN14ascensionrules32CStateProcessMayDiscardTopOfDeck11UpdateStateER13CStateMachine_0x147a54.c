// 函数: _ZN14ascensionrules32CStateProcessMayDiscardTopOfDeck11UpdateStateER13CStateMachine
// 地址: 0x147a54
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0)
    void* r0_4 = *(arg1 + 0x254)
    
    if (r0_4 != 0 && zx.d(*(arg1 + 0x258)) == 0)
        int32_t var_1c = 0
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_4 + 8), 0xa032, "Put on Deck", 
            ascensionrules::CStateProcessMayDiscardTopOfDeck::SelectPutOnDeck)
        int32_t var_1c_1 = 0
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(*(arg1 + 0x254) + 8), 0xa033, 
            "Put in Discard", ascensionrules::CStateProcessMayDiscardTopOfDeck::SelectPutInDiscard)
        int32_t entry_r1
        (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), 
            "You May Discard the Top Card from your Deck")
        *(arg1 + 0x258) = 1
        return 1

return CGameStateOptions::UpdateState(arg1) __tailcall
