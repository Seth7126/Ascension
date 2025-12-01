// 函数: _ZN14ascensionrules44CStateProcessDiscardAllButOneConstructInPlay10EnterStateER13CStateMachine
// 地址: 0x13ebec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r2 = *(arg1 + 0x24c)
*(arg1 + 0x250) = 0
int32_t* i = *(r2 + 0x54)

if (i != *(r2 + 0x58))
    do
        void* r0_1 = *i
        i = &i[1]
        void* var_24_1 = r0_1
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_1 + 8), 0xa052, "Keep %s", 
            ascensionrules::CStateProcessDiscardAllButOneConstructInPlay::SelectConstructToKeep)
    while (i != *(*(arg1 + 0x24c) + 0x58))

jump(*(*arg1 + 0x34))
