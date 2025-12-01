// 函数: _ZN14ascensionrules37CStateTakeCardFromEachOpponentDiscard19BuildTakeOptionListER13CStateMachine
// 地址: 0x145dc8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0_1 = *(*(arg1 + 0x24c) + 4)
int32_t r0_3 = *(r0_1 + 0x1c) - *(r0_1 + 0x18)

if (r0_3 s>= 1)
    int32_t i = 0
    
    do
        void* r0_4 = *(arg1 + 0x250 + (i << 2))
        
        if (r0_4 != 0)
            void* var_2c_1 = r0_4
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_4 + 8), 0xa037, "Take %s", 
                ascensionrules::CStateTakeCardFromEachOpponentDiscard::SelectCardToTake)
        
        i += 1
    while (i s< r0_3 s>> 2)

int32_t var_2c_2 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
