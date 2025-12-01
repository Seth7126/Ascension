// 函数: _ZN14ascensionrules32CStateRecoverHeroFromDiscardPile10EnterStateER13CStateMachine
// 地址: 0x126534
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *__stack_chk_guard
core::CCardInstance* r0_1 = *(arg1 + 0x24c)

if (*(arg1 + 0x254) == 0)
    void* r1_5 = *(r0_1 + 0x40)
    int32_t* i = *(r1_5 + 0xc)
    
    if (i != *(r1_5 + 0x10))
        do
            void* r6_1 = *i
            
            if (r6_1 != 0)
                void* r1_7 = *(r6_1 + 0xc)
                
                if (*(r1_7 + 0x88) == 1)
                    int32_t r0_14
                    
                    if (zx.d(*(r0_1 + 0xa4)) != 0)
                        r0_14 = ascension::CCard::IsCardFaction(r1_7)
                    
                    if (zx.d(*(r0_1 + 0xa4)) == 0 || r0_14 == 0)
                        int16_t r0_16 = -0x5fd0
                        
                        if (*(arg1 + 0x250) != 0)
                            r0_16 = -0x5fcf
                        
                        void* var_ac_3 = r6_1
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r6_1 + 8), zx.d(r0_16), 
                            "Recover %s", 
                            ascensionrules::CStateRecoverHeroFromDiscardPile::SelectHero)
            
            r0_1 = *(arg1 + 0x24c)
            i = &i[1]
        while (i != *(*(r0_1 + 0x40) + 0x10))
    
    int32_t var_ac_4 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
    *(arg1 + 0x24c)
    *(arg1 + 0x250)
    
    if (*__stack_chk_guard == r0)
        jump(*(*arg1 + 0x34))
else
    if (ascension::CPlayer::IsCardInDiscard(r0_1) != 0)
        void* r2_1 = *(arg1 + 0x254)
        int32_t r0_3 = *(arg1 + 0x250)
        int16_t r7_1 = -0x5fcf
        void* var_ac_1 = r2_1
        
        if (r0_3 == 0)
            r7_1 = -0x5fd0
        
        if (r0_3 == 0)
            r7_1 &= 0xffff
        
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_1 + 8), zx.d(r7_1), "Recover %s", 
            ascensionrules::CStateRecoverHeroFromDiscardPile::SelectHero)
        int32_t r3_1 = *(*(arg1 + 0x254) + 0xc)
        char* format = "You May Put %s into Your Hand"
        
        if (*(arg1 + 0x250) != 0)
            format = "You May Put %s on Top of Your Deck"
        
        char str[0x80]
        sprintf(&str, format, r3_1 + 0x44, r3_1)
        int32_t var_ac_2 = 0
        CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
        int32_t entry_r1
        (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str)
    
    int32_t r0_10 = *__stack_chk_guard
    
    if (r0_10 == r0)
        return r0_10 - r0

__stack_chk_fail()
noreturn
