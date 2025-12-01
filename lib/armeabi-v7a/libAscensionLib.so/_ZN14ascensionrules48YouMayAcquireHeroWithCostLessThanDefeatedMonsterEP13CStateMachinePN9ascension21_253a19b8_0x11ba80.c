// 函数: _ZN14ascensionrules48YouMayAcquireHeroWithCostLessThanDefeatedMonsterEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11ba80
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (*(arg4 + 4) == 0x1b)
    int32_t r2 = *(arg4 + 0x50)
    core::CCardInstance* r5_1 = *(arg4 + 0x4c)
    ascension::CPlayer* r6_1 = *(r5_1 + 4)
    int32_t r4_1 = *(*(r2 + 0xc) + 0xa0)
    
    if (*(arg4 + 0x54) == 6)
        int32_t var_28 = 0
        int32_t* var_40_1 = &var_28
        ascension::CWorld::QueryCardPowerCost(r6_1, r5_1, r2, 6)
        int32_t r0_4 = var_28
        
        if (r0_4 s> 0)
            r4_1 += r0_4
    
    if (r4_1 s>= 1)
        bool r0_6 = false
        
        if (*(r6_1 + 0x30) u> 0x18)
            r0_6 = true
        
        ascensionrules::CreateStateProcessAcquireHeroToTopOfDeck(r5_1, 1, 0, 0, r4_1, r0_6, false, 
            false, nullptr, nullptr)
        CStateMachine::PushListState(arg1)

int32_t r0_10 = *__stack_chk_guard

if (r0_10 == r0)
    return r0_10 - r0

__stack_chk_fail()
noreturn
