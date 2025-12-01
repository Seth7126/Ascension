// 函数: _ZN14ascensionrules26CStateRecoverDiscardedCard10EnterStateER13CStateMachine
// 地址: 0x126ac8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x250)

for (int32_t* i = *(r0 + 0x54); i != *(r0 + 0x58); i = &i[1])
    void* r2_1 = *i
    
    if (r2_1 != 0)
        void* var_24_1 = r2_1
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_1 + 8), 0xa030, "Recover %s", 
            ascensionrules::CStateRecoverDiscardedCard::SelectCard)
        r0 = *(arg1 + 0x250)

int32_t var_24_2 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
