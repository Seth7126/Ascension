// 函数: _ZN14ascensionrules27CStatePutCardUnderConstruct10EnterStateER13CStateMachine
// 地址: 0x13ffd8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
void* r1 = *(r0_1 + 0x3c)
int32_t* i = *(r1 + 0xc)
int32_t (* const var_b0)(CStateMachine&, CState*, int32_t, uint32_t*)
void* var_ac

if (i != *(r1 + 0x10))
    do
        void* r2_1 = *i
        
        if (*(*(r2_1 + 0xc) + 0x88) != 5)
            var_ac = r2_1
            var_b0 = ascensionrules::CStatePutCardUnderConstruct::SelectCardToPutUnderConstruct
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_1 + 8), 0xa034, "Put %s", var_b0)
            r0_1 = *(arg1 + 0x24c)
        
        i = &i[1]
    while (i != *(*(r0_1 + 0x3c) + 0x10))

char str[0x80]
sprintf(&str, "You Must Put a Card under %s", (*(**(arg1 + 0x250) + 0xc))())
int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str, var_b0, var_ac)
int32_t r0_8 = *__stack_chk_guard

if (r0_8 == r0)
    return r0_8 - r0

__stack_chk_fail()
noreturn
