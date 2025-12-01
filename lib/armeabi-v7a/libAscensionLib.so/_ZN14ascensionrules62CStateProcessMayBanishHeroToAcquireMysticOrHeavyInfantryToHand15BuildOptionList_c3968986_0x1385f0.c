// 函数: _ZN14ascensionrules62CStateProcessMayBanishHeroToAcquireMysticOrHeavyInfantryToHand15BuildOptionListER13CStateMachine
// 地址: 0x1385f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x24c)
void* r1 = *(r0 + 0x3c)
int32_t* i = *(r1 + 0xc)

if (i != *(r1 + 0x10))
    do
        void* r2_1 = *i
        
        if (*(*(r2_1 + 0xc) + 0x88) == 1)
            void* var_24_1 = r2_1
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_1 + 8), 0xa061, 
                "Banish %s from hand", 
                ascensionrules::CStateProcessMayBanishHeroToAcquireMysticOrHeavyInfantryToHand::SelectBanishFromHand)
            r0 = *(arg1 + 0x24c)
        
        i = &i[1]
    while (i != *(*(r0 + 0x3c) + 0x10))

int32_t var_24_2 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
