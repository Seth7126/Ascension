// 函数: _ZN14ascensionrules34CStateProcessReturnConstructToHand10EnterStateER13CStateMachine
// 地址: 0x13b18c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
core::CCardInstance* r1 = *(arg1 + 0x24c)
int32_t* i = *(r1 + 0x54)
int32_t (* const var_b0)(CStateMachine&, CState*, int32_t, uint32_t*)
void* const var_ac

if (i != *(r1 + 0x58))
    ascension::CPlayer* r6_1 = *(r1 + 4)
    
    do
        void* r8_1 = *i
        
        if (*(arg1 + 0x258) != r8_1)
            int32_t r0_4
            
            if (*(arg1 + 0x254) != 0)
                r0_4 = ascension::CWorld::QueryCardFaction(r6_1, r1, *(r8_1 + 0x10))
            
            if (*(arg1 + 0x254) == 0 || r0_4 != 0)
                var_b0 = ascensionrules::CStateProcessReturnConstructToHand::SelectConstructToReturn
                var_ac = r8_1
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r8_1 + 8), 0xa054, "Return %s", 
                    var_b0)
        
        r1 = *(arg1 + 0x24c)
        i = &i[1]
    while (i != *(r1 + 0x58))

void* const r6_2

if (*(arg1 + 0x250) == 0)
    r6_2 = "Must"
else
    var_b0 = nullptr
    var_ac = nullptr
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
    r6_2 = &data_1cb12e

int32_t r0_9 = *(arg1 + 0x254)
char str[0x80]

if (r0_9 == 0)
    sprintf(&str, "You %s Return a Construct to your Hand", r6_2)
else
    sprintf(&str, "You %s Return a %s Construct to your Hand", r6_2, 
        ascension::GetCardFactionAsString(r0_9), var_b0, var_ac)

int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str, var_b0, var_ac)
int32_t r0_15 = *__stack_chk_guard

if (r0_15 == r0)
    return r0_15 - r0

__stack_chk_fail()
noreturn
