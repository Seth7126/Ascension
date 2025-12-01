// 函数: _ZN14ascensionrules33CStateProcessDiscardMultipleCards18PrepareDiscardListER13CStateMachine
// 地址: 0x143b74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
void* r1 = *(r0_1 + 0x3c)
int32_t* i = *(r1 + 0xc)
int32_t r1_1 = *(r1 + 0x10)
int32_t (* const var_b0)(CStateMachine&, CState*, int32_t, uint32_t*)
void* var_ac
void var_a8
char* str
char* format
int32_t r2_2
void* const r3
int32_t r0_4

if (zx.d(*(arg1 + 0x254)) == 0)
    if (i != r1_1)
        do
            void* r2_3 = *i
            
            if (*(*(r2_3 + 0xc) + 0x88) != 5)
                var_ac = r2_3
                var_b0 = ascensionrules::CStateProcessDiscardMultipleCards::SelectCardToDiscard
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_3 + 8), 0xa050, "Discard %s", 
                    var_b0)
                r0_1 = *(arg1 + 0x24c)
            
            i = &i[1]
        while (i != *(*(r0_1 + 0x3c) + 0x10))
    
    r0_4 = *(arg1 + 0x264)
    
    if (r0_4 == 0)
        int32_t r7_2 = *(arg1 + 0x250)
        int32_t r0_9 = *(arg1 + 0x258)
        void* r6_1 = &data_1bfacb
        
        if (r7_2 != 1)
            r6_1 = &data_1cb34b
        
        if (r0_9 == 0)
            format = "You Must Discard %d Card%s"
        else
            var_b0 = ascension::GetCardFactionAsString(r0_9)
            format = "You Must Discard %d Card%s or an %s Card"
        
        str = &var_a8
        r2_2 = r7_2
        r3 = r6_1
    else
        r2_2 = *(arg1 + 0x250)
        format = "You Must Discard %d More Card%s"
    label_143cc8:
        r2_2 -= r0_4
        r3 = &data_1bfacb
        
        if (r2_2 != 1)
            r3 = &data_1cb34b
        
        str = &var_a8
else
    if (i != r1_1)
        do
            void* r2_1 = *i
            
            if (*(*(r2_1 + 0xc) + 0x88) != 5)
                var_ac = r2_1
                var_b0 = ascensionrules::CStateProcessDiscardMultipleCards::SelectCardToPutOnDeck
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_1 + 8), 0xa05d, "Discard %s", 
                    var_b0)
                r0_1 = *(arg1 + 0x24c)
            
            i = &i[1]
        while (i != *(*(r0_1 + 0x3c) + 0x10))
    
    r0_4 = *(arg1 + 0x264)
    r2_2 = *(arg1 + 0x250)
    
    if (r0_4 != 0)
        format = "You Must Put %d More Card%s on Top of Your Deck"
        goto label_143cc8
    
    r3 = &data_1bfacb
    format = "You Must Put %d Card%s on Top of Your Deck"
    
    if (r2_2 != 1)
        r3 = &data_1cb34b
    
    str = &var_a8
sprintf(str, format, r2_2, r3, var_b0, var_ac)
int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &var_a8)
int32_t r0_7 = *__stack_chk_guard

if (r0_7 == r0)
    return r0_7 - r0

__stack_chk_fail()
noreturn
