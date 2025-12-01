// 函数: _ZN14ascensionrules21CStateMayBanishSource15BuildOptionListER13CStateMachine
// 地址: 0x137fe8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x250)
void* r3 = *(*(arg1 + 0x24c) + 4)
uint32_t r1_5

if (r0_1 == 0)
    r1_5 = 1
else
    int32_t temp0_1 = 0
    uint32_t i = *(*(r0_1 + 0xc) + 0x88) - 3
    
    while (i != 0)
        i u>>= 1
        temp0_1 += 1
    
    r1_5 = (0x20 - temp0_1) u>> 5

int32_t r2 = *(r3 + 0xbd8)
int32_t r3_1 = *(r3 + 0xbdc)

if (r3_1 != r2)
    int32_t i_1 = 0
    
    do
        if (r0_1 == *(r2 + (i_1 << 3)) && *(r2 + (i_1 << 3) + 4) == 7)
            goto label_1380b8
        
        i_1 += 1
    while (i_1 u< (r3_1 - r2) s>> 3)

if (r1_5 == 0)
    void* var_ac_1 = r0_1
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_1 + 8), 0xa061, "Banish %s from play", 
        ascensionrules::CStateMayBanishSource::SelectCardToBanish)

label_1380b8:
int32_t var_ac_2 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 
    ascensionrules::CStateMayBanishSource::SelectNone)
void* r0_4 = *(arg1 + 0x250)
int32_t str

if (r0_4 == 0)
    __builtin_strncpy(&str, "You May Banish", 0xf)
else
    sprintf(&str, "You May Banish %s", *(r0_4 + 0xc) + 4)

int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str)
int32_t r0_9 = *__stack_chk_guard

if (r0_9 == r0)
    return r0_9 - r0

__stack_chk_fail()
noreturn
