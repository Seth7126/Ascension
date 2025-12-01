// 函数: _ZN14ascensionrules44CStateProcessDiscardFromHandForEachConstruct19BuildDiscardOptionsER13CStateMachine
// 地址: 0x1451e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
void* r1 = *(r0_1 + 0x3c)
int32_t* i = *(r1 + 0xc)
int32_t (* const var_138)(CStateMachine&, CState*, int32_t, uint32_t*)
void* var_134

if (i != *(r1 + 0x10))
    do
        void* r2_1 = *i
        
        if (*(*(r2_1 + 0xc) + 0x88) != 5)
            var_134 = r2_1
            var_138 =
                ascensionrules::CStateProcessDiscardFromHandForEachConstruct::SelectCardToDiscard
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_1 + 8), 0xa050, "Discard %s", 
                var_138)
            r0_1 = *(arg1 + 0x24c)
        
        i = &i[1]
    while (i != *(*(r0_1 + 0x3c) + 0x10))

int32_t r2_2 = *(arg1 + 0x254)
char* format
int32_t r2_3
void* const r3

if (r2_2 s< 1)
    void** i_1 = *(r0_1 + 0x54)
    
    if (i_1 != *(r0_1 + 0x58))
        do
            void* r0_4 = *i_1
            i_1 = &i_1[1]
            var_134 = r0_4
            var_138 = ascensionrules::CStateProcessDiscardFromHandForEachConstruct::SelectDiscardAllConstructs
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_4 + 8), 0xa053, "Discard %s", 
                var_138)
        while (i_1 != *(*(arg1 + 0x24c) + 0x58))
    
    r2_3 = *(arg1 + 0x250)
    r3 = &data_1cb34b
    format = "You Must Discard %d Card%s or all of Your Constructs"
else
    r2_3 = *(arg1 + 0x250) - r2_2
    format = "You Must Discard %d More Card%s from Your Hand"
    r3 = &data_1cb34b

if (r2_3 s<= 1)
    r3 = &data_1bfacb

char str[0x100]
sprintf(&str, format, r2_3, r3, var_138, var_134)
int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str)
int32_t r0_11 = *__stack_chk_guard

if (r0_11 == r0)
    return r0_11 - r0

__stack_chk_fail()
noreturn
