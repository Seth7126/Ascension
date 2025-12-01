// 函数: _ZN14ascensionrules30CStateSelectCardsForDreamscape18BuildSelectionListER13CStateMachine
// 地址: 0x14bc30
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
void* r1 = *(r0_1 + 0x3c)
int32_t* i = *(r1 + 0xc)
int32_t (* const var_b0)(CStateMachine&, CState*, int32_t, uint32_t*)
void* var_ac

if (i != *(r1 + 0x10))
    do
        void* r0_2 = *i
        i = &i[1]
        var_ac = r0_2
        var_b0 = ascensionrules::CStateSelectCardsForDreamscape::SelectAddCardToDreamscape
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_2 + 8), 0xa0d0, "Select %s", var_b0)
        r0_1 = *(arg1 + 0x24c)
    while (i != *(*(r0_1 + 0x3c) + 0x10))

int32_t r2 = *(arg1 + 0x250)
int32_t r0_5 = *(*(r0_1 + 0x44) + 0x18)
char str[0x80]

if (r0_5 == 0)
    sprintf(&str, "Choose %d Cards for your Dreamscape", r2)
else
    int32_t r2_1 = r2 - r0_5
    void* const r3_1 = &data_1cb34b
    
    if (r2_1 s<= 1)
        r3_1 = &data_1bfacb
    
    sprintf(&str, "Choose %d More Card%s for your Dreamscape", r2_1, r3_1, var_b0, var_ac)

int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str, var_b0, var_ac)
int32_t r0_10 = *__stack_chk_guard

if (r0_10 == r0)
    return r0_10 - r0

__stack_chk_fail()
noreturn
