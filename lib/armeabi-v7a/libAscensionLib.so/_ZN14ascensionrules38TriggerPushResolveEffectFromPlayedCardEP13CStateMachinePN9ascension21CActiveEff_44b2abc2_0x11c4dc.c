// 函数: _ZN14ascensionrules38TriggerPushResolveEffectFromPlayedCardEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11c4dc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
uint32_t result = *(arg2 + 0x14)

if (result != 0)
    result =
        __dynamic_cast(result, _typeinfo_for_core::CInstance, _typeinfo_for_ascension::CPlayer, 0)
    
    if (arg3 != 0)
        uint32_t result_1 = result
        
        if (result != 0)
            result = __dynamic_cast(arg3, _typeinfo_for_core::CInstance, 
                _typeinfo_for_core::CCardInstance, 0)
            
            if (result != 0)
                core::CCardInstance* r5_1 = *(result_1 + 4)
                ascension::CWorld::PushResolveEffect(r5_1, result)
                int32_t var_20 = 0
                ascension::CWorld::OutputAnimationCard(r5_1, result, 1, 0xa, 0, 0xb, 0, 0)
                return ascension::CWorld::OutputPauseForAnimationToDestination(r5_1) __tailcall

return result
