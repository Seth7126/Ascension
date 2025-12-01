// 函数: _ZN14ascensionrules27CStateGainHonorFromOpponent10EnterStateER13CStateMachine
// 地址: 0x15402c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r1 = *(arg1 + 0x24c)
ascension::CPlayer* r6 = *(r1 + 4)
int32_t r0_2 = *(r6 + 0x1c) - *(r6 + 0x18)
int32_t (* const var_b0)(CStateMachine&, CState*, int32_t, uint32_t*)
void* var_ac

if (r0_2 s> 4)
    int32_t r7_1 = 1
    
    while (true)
        void* r0_4 = ascension::CWorld::GetPlayerByTurnOrder(r6, r1)
        
        if (*(r0_4 + 0x90) s>= 1)
            var_ac = r0_4
            var_b0 = ascensionrules::CStateGainHonorFromOpponent::SelectTakeHonor
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_4 + 8), 0xa0e0, 
                "Take Honor from %s", var_b0)
        
        r7_1 += 1
        
        if (r7_1 s>= r0_2 s>> 2)
            break
        
        r1 = *(arg1 + 0x24c)

char str[0x80]
sprintf(&str, "Choose an Opponent to Take %d Honor From", *(arg1 + 0x250))
int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str, var_b0, var_ac)
int32_t r0_9 = *__stack_chk_guard

if (r0_9 == r0)
    return r0_9 - r0

__stack_chk_fail()
noreturn
