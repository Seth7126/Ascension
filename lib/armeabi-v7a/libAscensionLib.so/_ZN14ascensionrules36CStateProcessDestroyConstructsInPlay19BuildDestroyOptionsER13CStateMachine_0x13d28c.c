// 函数: _ZN14ascensionrules36CStateProcessDestroyConstructsInPlay19BuildDestroyOptionsER13CStateMachine
// 地址: 0x13d28c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* r0_1 = *(arg1 + 0x24c)
int32_t* i = *(r0_1 + 0x54)
int32_t (* const var_b0)(CStateMachine&, CState*, int32_t, uint32_t*)
void* var_ac

if (i != *(r0_1 + 0x58))
    do
        void* r0_3 = *i
        i = &i[1]
        var_ac = r0_3
        var_b0 = ascensionrules::CStateProcessDestroyConstructsInPlay::SelectConstructToDestroy
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_3 + 8), 0xa051, "Discard %s", var_b0)
    while (i != *(*(arg1 + 0x24c) + 0x58))

int32_t r0_7 = *(arg1 + 0x258)
int32_t r2 = *(arg1 + 0x250)
char* format
void* const r3

if (r0_7 == 0)
    r3 = &data_1cb34b
    format = "You Must Destroy %d Construct%s"
    
    if (r2 s<= 1)
        r3 = &data_1bfacb
else
    r2 -= r0_7
    format = "You Must Destroy %d More Construct%s"
    r3 = &data_1cb34b
    
    if (r2 s<= 1)
        r3 = &data_1bfacb

char str[0x80]
sprintf(&str, format, r2, r3, var_b0, var_ac)
int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str)
int32_t r0_11 = *__stack_chk_guard

if (r0_11 == r0)
    return r0_11 - r0

__stack_chk_fail()
noreturn
