// 函数: _ZN14ascensionrules36CStateProcessAcquireTrophiesFromVoid22BuildAcquireOptionListER13CStateMachine
// 地址: 0x12524c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r7 = *(*(arg1 + 0x24c) + 4)
void* r0_2 = *(r7 + 0xa4c)

for (int32_t* i = *(r0_2 + 0xc); i != *(r0_2 + 0x10); i = &i[1])
    void* r2_1 = *i
    
    if (r2_1 != 0)
        void* r1_1 = *(r2_1 + 0xc)
        
        if (*(r1_1 + 0x88) == 3 && zx.d(*(r1_1 + 0xc5)) != 0)
            void* var_ac_1 = r2_1
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_1 + 8), 0xa027, "Acquire %s", 
                ascensionrules::CStateProcessAcquireTrophiesFromVoid::SelectAcquireFromTheVoidIntoPlay)
            r0_2 = *(r7 + 0xa4c)

int32_t var_ac_2 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 
    ascensionrules::CStateProcessAcquireTrophiesFromVoid::SelectDone)
int32_t r0_5 = *(arg1 + 0x254)
int32_t r2_2 = *(arg1 + 0x250)
char const* const format
void* const r3_2

if (r0_5 == 0)
    r3_2 = &data_1ca9a5
    format = "You May Acquire %d Troph%s from the Void"
    
    if (r2_2 != 1)
        r3_2 = &data_1ca9a7
else
    r2_2 -= r0_5
    format = "You May Acquire %d More Troph%s from the Void"
    r3_2 = &data_1ca9a5
    
    if (r2_2 != 1)
        r3_2 = &data_1ca9a7

char str[0x80]
sprintf(&str, format, r2_2, r3_2)
int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str)
int32_t r0_9 = *__stack_chk_guard

if (r0_9 == r0)
    return r0_9 - r0

__stack_chk_fail()
noreturn
