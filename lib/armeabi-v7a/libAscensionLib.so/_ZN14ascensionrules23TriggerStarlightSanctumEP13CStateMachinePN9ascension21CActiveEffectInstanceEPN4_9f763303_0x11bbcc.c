// 函数: _ZN14ascensionrules23TriggerStarlightSanctumEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11bbcc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = *(arg4 + 4)

if (result == 0x12)
    ascension::CPlayer* r6_1 = *(arg4 + 0x4c)
    ascension::CActiveEffectInstance* r4_1 = *(r6_1 + 4)
    result = ascension::CWorld::HasPlayedActiveEffect(r4_1)
    
    if (result == 0)
        int32_t r2 = 0x98
        result = *(r4_1 + 0x30)
        
        if (result u< 0x14)
            r2 = 0x9c
        
        int32_t r1_2 = *(*(*(arg4 + 0x50) + 0xc) + r2)
        
        if (r1_2 s>= 1)
            bool r0_1 = false
            
            if (result u> 0x18)
                r0_1 = true
            
            ascensionrules::CreateStateProcessAcquireHeroToTopOfDeck(r6_1, 1, 0, 0, r1_2, r0_1, 
                false, false, nullptr, arg2)
            return CStateMachine::PushListState(arg1) __tailcall

return result
