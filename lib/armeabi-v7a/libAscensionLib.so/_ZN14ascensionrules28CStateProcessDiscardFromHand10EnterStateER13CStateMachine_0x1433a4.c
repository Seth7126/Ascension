// 函数: _ZN14ascensionrules28CStateProcessDiscardFromHand10EnterStateER13CStateMachine
// 地址: 0x1433a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r2 = *(arg1 + 0x24c)
void* r0 = *(r2 + 0x3c)
int32_t* i = *(r0 + 0xc)

if (i != *(r0 + 0x10))
    do
        void* r0_2 = *i
        
        if (*(*(r0_2 + 0xc) + 0x88) != 5)
            void* var_24_1 = r0_2
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_2 + 8), 0xa050, "Discard %s", 
                ascensionrules::CStateProcessDiscardFromHand::SelectCardToDiscard)
            r2 = *(arg1 + 0x24c)
        
        i = &i[1]
    while (i != *(*(r2 + 0x3c) + 0x10))

if (*(arg1 + 0x250) != 0)
    int32_t var_24_2 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
    *(arg1 + 0x24c)

jump(*(*arg1 + 0x34))
