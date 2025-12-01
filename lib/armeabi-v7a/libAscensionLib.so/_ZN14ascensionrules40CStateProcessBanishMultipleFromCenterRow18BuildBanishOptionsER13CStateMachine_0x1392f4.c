// 函数: _ZN14ascensionrules40CStateProcessBanishMultipleFromCenterRow18BuildBanishOptionsER13CStateMachine
// 地址: 0x1392f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t i = 0
int32_t r0 = *__stack_chk_guard
int32_t r6 = *(*(arg1 + 0x24c) + 4)

do
    if (zx.d(*(arg1 + 0x278 + i)) == 0)
        void* r10_1 = arg1 + 0x278 + (i << 2)
        
        if (*(r10_1 - 0x1c) != 0)
            void* r0_4 = ascension::CWorld::GetCenterRowCard(r6)
            
            if (r0_4 == *(r10_1 - 0x1c))
                int32_t i_1 = i
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_4 + 8), 0xa063, 
                    "Banish %s from center row", 
                    ascensionrules::CStateProcessBanishMultipleFromCenterRow::SelectCardToBanish)
            else
                *(r10_1 - 0x1c) = 0
    
    i += 1
while (i != 7)

if (*(arg1 + 0x38) s<= 0)
    *(arg1 + 0x258) = *(arg1 + 0x250)
else
    int32_t var_b4_1 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 
        ascensionrules::CStateProcessBanishMultipleFromCenterRow::SelectDone)
    int32_t r0_9 = *(arg1 + 0x258)
    int32_t r2_1 = *(arg1 + 0x250)
    char const* const format
    void* const r3_1
    
    if (r0_9 == 0)
        r3_1 = &data_1bfacb
        format = "You May Banish %d Card%s from the Center Row"
        
        if (r2_1 != 1)
            r3_1 = &data_1cb34b
    else
        r2_1 -= r0_9
        format = "You May Banish %d More Card%s from the Center Row"
        r3_1 = &data_1bfacb
        
        if (r2_1 != 1)
            r3_1 = &data_1cb34b
    
    char str[0x80]
    sprintf(&str, format, r2_1, r3_1)
    int32_t entry_r1
    (*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str)

int32_t r0_14 = *__stack_chk_guard

if (r0_14 == r0)
    return r0_14 - r0

__stack_chk_fail()
noreturn
