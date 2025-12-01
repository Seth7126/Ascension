// 函数: _ZN14ascensionrules30CStateProcessOptionalDrawCards11UpdateStateER13CStateMachine
// 地址: 0x148d20
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0)
    int32_t result = *(arg1 + 0x250)
    
    if (*(arg1 + 0x254) s< result)
        void* r2 = *(arg1 + 0x24c)
        void* r1_2 = *(r2 + 0x38)
        
        if (*(r1_2 + 0x18) == 0 && *(*(r2 + 0x40) + 0x18) == 0)
            *(arg1 + 0x254) = result
            return result
        
        int32_t var_1c = 0
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r1_2 + 8), 0xa035, "Draw Card", 
            ascensionrules::CStateProcessOptionalDrawCards::SelectDrawCard)
        int32_t var_1c_1 = 0
        CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 
            ascensionrules::CStateProcessOptionalDrawCards::SelectNone)
        *(arg1 + 0x24c)
        jump(*(*arg1 + 0x34))

return CGameStateOptions::UpdateState(arg1) __tailcall
