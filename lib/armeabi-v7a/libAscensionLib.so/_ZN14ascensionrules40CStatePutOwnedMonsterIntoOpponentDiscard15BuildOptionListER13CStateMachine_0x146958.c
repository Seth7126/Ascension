// 函数: _ZN14ascensionrules40CStatePutOwnedMonsterIntoOpponentDiscard15BuildOptionListER13CStateMachine
// 地址: 0x146958
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
void* r1 = *(r0_1 + 0x3c)
int32_t* i = *(r1 + 0xc)
int32_t (* const var_b0)(CStateMachine&, CState*, int32_t, uint32_t*)
void* const var_ac

if (i != *(r1 + 0x10))
    do
        void* r2_1 = *i
        
        if (*(*(r2_1 + 0xc) + 0x88) == 3)
            var_ac = r2_1
            var_b0 = ascensionrules::CStatePutOwnedMonsterIntoOpponentDiscard::SelectCardFromHand
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_1 + 8), 0xa059, "Give %s", var_b0)
            r0_1 = *(arg1 + 0x24c)
        
        i = &i[1]
    while (i != *(*(r0_1 + 0x3c) + 0x10))

void* r1_7 = *(r0_1 + 0x40)
void** i_1 = *(r1_7 + 0xc)

if (i_1 != *(r1_7 + 0x10))
    do
        void* r2_2 = *i_1
        
        if (*(*(r2_2 + 0xc) + 0x88) == 3)
            var_ac = r2_2
            var_b0 = ascensionrules::CStatePutOwnedMonsterIntoOpponentDiscard::SelectCardFromDiscard
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_2 + 8), 0xa059, "Give %s", var_b0)
            r0_1 = *(arg1 + 0x24c)
        
        i_1 = &i_1[1]
    while (i_1 != *(*(r0_1 + 0x40) + 0x10))

void* const r2_3

if (*(arg1 + 0x250) == 0)
    r2_3 = "Must"
else
    var_b0 = nullptr
    var_ac = nullptr
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
    r2_3 = &data_1cb12e

char str[0x80]
sprintf(&str, "You %s Banish a Card from Your Discard Pile", r2_3)
int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str, var_b0, var_ac)
int32_t r0_9 = *__stack_chk_guard

if (r0_9 == r0)
    return r0_9 - r0

__stack_chk_fail()
noreturn
