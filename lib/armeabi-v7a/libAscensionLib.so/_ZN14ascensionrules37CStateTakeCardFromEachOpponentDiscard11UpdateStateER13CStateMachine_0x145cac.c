// 函数: _ZN14ascensionrules37CStateTakeCardFromEachOpponentDiscard11UpdateStateER13CStateMachine
// 地址: 0x145cac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) != 0 || *(arg1 + 0x38) s> 0 || zx.d(*(arg1 + 0x260)) != 0)
    return CGameStateOptions::UpdateState(arg1) __tailcall

void* r0_6 = *(*(arg1 + 0x24c) + 4)
int32_t r0_8 = *(r0_6 + 0x1c) - *(r0_6 + 0x18)

if (r0_8 s>= 1)
    int32_t i = 0
    
    do
        void* r0_9 = *(arg1 + 0x250 + (i << 2))
        
        if (r0_9 != 0)
            void* var_2c_1 = r0_9
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_9 + 8), 0xa037, "Take %s", 
                ascensionrules::CStateTakeCardFromEachOpponentDiscard::SelectCardToTake)
        
        i += 1
    while (i s< r0_8 s>> 2)

int32_t var_2c_2 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), "You May Take a Discarded Card")
*(arg1 + 0x260) = 1
return 1
