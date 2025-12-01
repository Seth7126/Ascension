// 函数: _ZN14ascensionrules35CStateProcessChooseCardNameFromDeck10EnterStateER13CStateMachine
// 地址: 0x149244
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(*(arg1 + 0x24c) + 0x84)
int32_t* i = *(r0 + 0xc)

if (i != *(r0 + 0x10))
    do
        void* r0_2 = *i
        i = &i[1]
        void* var_24_1 = r0_2
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_2 + 8) + 0x4000, 0xa0e1, "Name %s", 
            ascensionrules::CStateProcessChooseCardNameFromDeck::SelectCard)
    while (i != *(*(*(arg1 + 0x24c) + 0x84) + 0x10))

jump(*(*arg1 + 0x34))
