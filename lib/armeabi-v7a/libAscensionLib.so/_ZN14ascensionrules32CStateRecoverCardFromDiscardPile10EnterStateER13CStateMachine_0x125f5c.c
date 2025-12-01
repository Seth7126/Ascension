// 函数: _ZN14ascensionrules32CStateRecoverCardFromDiscardPile10EnterStateER13CStateMachine
// 地址: 0x125f5c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *__stack_chk_guard
core::CCardInstance* r1 = *(arg1 + 0x24c)

if (*(arg1 + 0x258) == 0)
    void* r0_13 = *(r1 + 0x40)
    int32_t* i = *(r0_13 + 0xc)
    
    if (i != *(r0_13 + 0x10))
        ascension::CPlayer* r6_1 = *(r1 + 4)
        
        do
            void* r4_1 = *i
            
            if (r4_1 != 0)
                int32_t r0_16
                
                if (*(arg1 + 0x254) != 0)
                    r0_16 = ascension::CWorld::QueryCardFaction(r6_1, r1, r4_1)
                
                if (*(arg1 + 0x254) == 0 || r0_16 != 0)
                    int16_t r0_18 = -0x5fd0
                    
                    if (*(arg1 + 0x250) != 0)
                        r0_18 = -0x5fcf
                    
                    void* var_ac_3 = r4_1
                    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r4_1 + 8), zx.d(r0_18), 
                        "Recover %s", ascensionrules::CStateRecoverCardFromDiscardPile::SelectCard)
            
            r1 = *(arg1 + 0x24c)
            i = &i[1]
        while (i != *(*(r1 + 0x40) + 0x10))
    
    int32_t var_ac_4 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
    *(arg1 + 0x24c)
    *(arg1 + 0x250)
    
    if (*__stack_chk_guard == r0)
        jump(*(*arg1 + 0x34))
else
    if (ascension::CPlayer::IsCardInDiscard(r1) != 0)
        void* r2_1 = *(arg1 + 0x258)
        int32_t r0_3 = *(arg1 + 0x250)
        int16_t r7_1 = -0x5fcf
        void* var_ac_1 = r2_1
        
        if (r0_3 == 0)
            r7_1 = -0x5fd0
        
        if (r0_3 == 0)
            r7_1 &= 0xffff
        
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_1 + 8), zx.d(r7_1), "Recover %s", 
            ascensionrules::CStateRecoverCardFromDiscardPile::SelectCard)
        int32_t* r0_5 = *(arg1 + 0x258)
        int32_t r1_3 = *(arg1 + 0x250)
        char const* const format = "You May Put %s into Your Hand"
        
        if (r1_3 != 0)
            format = "You May Put %s on Top of Your Deck"
        
        char str[0x80]
        sprintf(&str, format, (*(*r0_5 + 0xc))(r0_5, r1_3, "You May Put %s on Top of Your Deck"))
        int32_t var_ac_2 = 0
        CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
        int32_t entry_r1
        (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str)
    
    int32_t r0_11 = *__stack_chk_guard
    
    if (r0_11 == r0)
        return r0_11 - r0

__stack_chk_fail()
noreturn
