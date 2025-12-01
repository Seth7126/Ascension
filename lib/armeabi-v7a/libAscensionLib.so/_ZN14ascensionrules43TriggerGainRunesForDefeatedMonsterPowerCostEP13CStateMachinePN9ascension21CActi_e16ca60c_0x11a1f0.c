// 函数: _ZN14ascensionrules43TriggerGainRunesForDefeatedMonsterPowerCostEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11a1f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (*(arg4 + 4) == 0x1b)
    int32_t r2 = *(arg4 + 0x50)
    core::CCardInstance* r7_1 = *(arg4 + 0x4c)
    ascension::CPlayer* r9_1 = *(r7_1 + 4)
    uint32_t r5_1 = *(*(r2 + 0xc) + 0xa0)
    
    if (*(arg4 + 0x54) == 6)
        int32_t var_2c = 0
        int32_t* var_38_1 = &var_2c
        ascension::CWorld::QueryCardPowerCost(r9_1, r7_1, r2, 6)
        int32_t r0_4 = var_2c
        
        if (r0_4 s> 0)
            r5_1 += r0_4
    
    ascensionrules::GainRunes(arg1, r9_1, r7_1, r5_1, arg3, nullptr, arg4)

int32_t r0_6 = *__stack_chk_guard

if (r0_6 == r0)
    return r0_6 - r0

__stack_chk_fail()
noreturn
