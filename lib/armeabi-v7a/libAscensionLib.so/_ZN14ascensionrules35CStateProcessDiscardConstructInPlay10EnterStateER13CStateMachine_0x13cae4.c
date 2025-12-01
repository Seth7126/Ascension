// 函数: _ZN14ascensionrules35CStateProcessDiscardConstructInPlay10EnterStateER13CStateMachine
// 地址: 0x13cae4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
void* r1 = *(arg1 + 0x250)
int32_t r3 = *(arg1 + 0x258)
void* r10 = *(r0_1 + 4)
*(arg1 + 0x2bc) = 0
int32_t* i = *(r1 + 0x54)
int32_t r2 = *(r1 + 0x58)

if (r3 s<= (r2 - i) s>> 2)
    int16_t r0_2 = -0x5faa
    
    if (zx.d(*(r1 + 8)) == zx.d(*(r0_1 + 8)))
        r0_2 = -0x5faf
    
    int32_t var_b0
    void* const var_ac
    
    if (r2 != i)
        do
            void* r0_3 = *i
            i = &i[1]
            var_ac = r0_3
            var_b0 = ascensionrules::CStateProcessDiscardConstructInPlay::SelectConstructToDiscard
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_3 + 8), zx.d(r0_2), "Discard %s", 
                var_b0)
        while (i != *(*(arg1 + 0x250) + 0x58))
    
    void* const r2_2
    
    if (*(arg1 + 0x254) == 0)
        r2_2 = "Must"
    else
        var_b0 = 0
        var_ac = nullptr
        CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
        r2_2 = &data_1cb12e
    
    char str[0x80]
    str[0] = 0
    
    if (zx.d(*(r10 + 0xa14)) == 0)
        sprintf(&str, "You %s Discard a Construct from Play", r2_2)
    
    int32_t entry_r1
    (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str, var_b0, var_ac)

int32_t r0_13 = *__stack_chk_guard

if (r0_13 == r0)
    return r0_13 - r0

__stack_chk_fail()
noreturn
