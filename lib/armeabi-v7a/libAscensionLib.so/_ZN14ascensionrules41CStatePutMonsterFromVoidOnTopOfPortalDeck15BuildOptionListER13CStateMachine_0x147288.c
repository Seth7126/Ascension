// 函数: _ZN14ascensionrules41CStatePutMonsterFromVoidOnTopOfPortalDeck15BuildOptionListER13CStateMachine
// 地址: 0x147288
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r7 = *(*(arg1 + 0x24c) + 4)
void* r0_2 = *(r7 + 0xa4c)
int32_t (* const var_b0)(CStateMachine&, CState*, int32_t, uint32_t*)
void* const var_ac

for (int32_t* i = *(r0_2 + 0xc); i != *(r0_2 + 0x10); i = &i[1])
    void* r2_1 = *i
    
    if (r2_1 != *(arg1 + 0x254) && *(*(r2_1 + 0xc) + 0x88) == 3)
        var_ac = r2_1
        var_b0 = ascensionrules::CStatePutMonsterFromVoidOnTopOfPortalDeck::SelectCardFromVoid
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_1 + 8), 0xa038, "Give %s", var_b0)
        r0_2 = *(r7 + 0xa4c)

void* const r2_2

if (*(arg1 + 0x250) == 0)
    r2_2 = "Must"
else
    var_b0 = nullptr
    var_ac = nullptr
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
    r2_2 = &data_1cb12e

char str[0x80]
sprintf(&str, "You %s Put a Monster from the Void on Top of Portal Deck", r2_2)
int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str, var_b0, var_ac)
int32_t r0_9 = *__stack_chk_guard

if (r0_9 == r0)
    return r0_9 - r0

__stack_chk_fail()
noreturn
