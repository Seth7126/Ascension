// 函数: _ZN14ascensionrules32CStateProcessMayDiscardTopOfDeck10EnterStateER13CStateMachine
// 地址: 0x1477f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
bool cond:0 = *(arg1 + 0x250) == 0
*(arg1 + 0x258) = 0
*(arg1 + 0x254) = 0

if (not(cond:0))
    void* r0_1 = *(arg1 + 0x24c)
    
    if (*(*(r0_1 + 0x38) + 0x18) s< 1)
        int32_t result = *(*(r0_1 + 0x40) + 0x18)
        
        if (result s< 1)
            return result
        
        int32_t var_1c = 0
        CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa0f0, "Shuffle", 
            ascensionrules::CStateProcessMayDiscardTopOfDeck::SelectShuffleDeck)
        int32_t var_1c_1 = 0
        CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa0f1, "Pass", 0)
        *(arg1 + 0x24c)
        jump(*(*arg1 + 0x34))

return ascensionrules::CStateProcessMayDiscardTopOfDeck::RevealCardFromDeck() __tailcall
