// 函数: _ZN14ascensionrules44CStateProcessBanishMultipleFromHandOrDiscard15BuildOptionListER13CStateMachine
// 地址: 0x137544
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
void* r10 = *(r0_1 + 4)

if (zx.d(*(arg1 + 0x254)) != 0)
    void* r1_1 = *(r0_1 + 0x3c)
    int32_t* i = *(r1_1 + 0xc)
    
    if (i != *(r1_1 + 0x10))
        do
            void* r2_1 = *i
            
            if (*(*(r2_1 + 0xc) + 0x88) != 5)
                void* var_b4_1 = r2_1
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_1 + 8), 0xa061, 
                    "Banish %s from hand", 
                    ascensionrules::CStateProcessBanishMultipleFromHandOrDiscard::SelectBanishFromHand)
                r0_1 = *(arg1 + 0x24c)
            
            i = &i[1]
        while (i != *(*(r0_1 + 0x3c) + 0x10))

if (zx.d(*(arg1 + 0x255)) != 0)
    void* r1_9 = *(r0_1 + 0x40)
    int32_t* i_1 = *(r1_9 + 0xc)
    
    if (i_1 != *(r1_9 + 0x10))
        do
            void* r0_3 = *i_1
            i_1 = &i_1[1]
            void* var_b4_2 = r0_3
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_3 + 8), 0xa062, 
                "Banish %s from discard", 
                ascensionrules::CStateProcessBanishMultipleFromHandOrDiscard::SelectBanishFromDiscard)
            r0_1 = *(arg1 + 0x24c)
        while (i_1 != *(*(r0_1 + 0x40) + 0x10))

if (zx.d(*(arg1 + 0x256)) != 0)
    void* r0_5 = *(r0_1 + 0x38)
    int32_t* i_2 = *(r0_5 + 0xc)
    
    if (i_2 != *(r0_5 + 0x10))
        do
            void* r0_7 = *i_2
            i_2 = &i_2[1]
            void* var_b4_3 = r0_7
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_7 + 8), 0xa064, 
                "Banish %s from deck", 
                ascensionrules::CStateProcessBanishMultipleFromHandOrDiscard::SelectBanishFromDeck)
        while (i_2 != *(*(*(arg1 + 0x24c) + 0x38) + 0x10))

if (zx.d(*(arg1 + 0x257)) != 0)
    int32_t* i_3 = *(r10 + 0xb80)
    
    for (int32_t r0_13 = *(r10 + 0xb84); i_3 != r0_13; i_3 = &i_3[2])
        if ((zx.d(i_3[1].b) & 0xa3) == 0)
            void* r2_2 = *i_3
            
            if (r2_2 != 0)
                void* var_b4_4 = r2_2
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_2 + 8), 0xa061, 
                    "Banish %s from played", 
                    ascensionrules::CStateProcessBanishMultipleFromHandOrDiscard::SelectBanishFromPlayed)
                r0_13 = *(r10 + 0xb84)

CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 
    ascensionrules::CStateProcessBanishMultipleFromHandOrDiscard::SelectNone)
uint32_t r0_16 = zx.d(*(arg1 + 0x255))
void* const r0_18
void* r1_19

if (zx.d(*(arg1 + 0x254)) == 0)
    if (r0_16 != 0)
        r0_18 = " from Your Discard Pile"
    else if (zx.d(*(arg1 + 0x257)) == 0)
        r1_19 = " from Your Deck"
        r0_18 = &data_1bfacb
    label_1377e4:
        
        if (zx.d(*(arg1 + 0x256)) != 0)
            r0_18 = r1_19
    else
        r0_18 = " from Played Cards"
else if (r0_16 == 0)
    r0_18 = " from Your Hand"
else
    if (zx.d(*(arg1 + 0x257)) == 0)
        r1_19 = &data_1bfacb
        r0_18 = " from Your Hand or Discard Pile"
        goto label_1377e4
    
    r0_18 = &data_1bfacb
int32_t r7_1 = *(arg1 + 0x25c)
int32_t r2_4 = *(arg1 + 0x250)
void* const var_b8_6
char* format
void* const r3

if (r7_1 == 0)
    format = "You May Banish %d Card%s%s"
    var_b8_6 = r0_18
    r3 = &data_1bfacb
    
    if (r2_4 != 1)
        r3 = &data_1cb34b
else
    r2_4 -= r7_1
    format = "You May Banish %d More Card%s%s"
    var_b8_6 = r0_18
    r3 = &data_1cb34b
    
    if (r2_4 == 1)
        r3 = &data_1bfacb

char str[0x80]
sprintf(&str, format, r2_4, r3, var_b8_6, 0)
int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str)
int32_t r0_23 = *__stack_chk_guard

if (r0_23 == r0)
    return r0_23 - r0

__stack_chk_fail()
noreturn
