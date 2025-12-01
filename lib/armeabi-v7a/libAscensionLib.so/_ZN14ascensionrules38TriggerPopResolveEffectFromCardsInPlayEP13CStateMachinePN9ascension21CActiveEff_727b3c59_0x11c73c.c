// 函数: _ZN14ascensionrules38TriggerPopResolveEffectFromCardsInPlayEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11c73c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* result = *(arg2 + 0x14)

if (result != 0)
    result =
        __dynamic_cast(result, _typeinfo_for_core::CInstance, _typeinfo_for_ascension::CPlayer, 0)
    
    if (result != 0)
        core::CCardInstance* r5_1 = *(result + 4)
        result = *(r5_1 + 0xbdc)
        
        if (*(r5_1 + 0xbd8) != result)
            uint32_t r6_1 = *(arg3 + 0x10)
            result = *(result - 8)
            
            if (result == r6_1)
                int32_t var_20 = 0
                ascension::CWorld::OutputAnimationCard(r5_1, r6_1, 1, 0xb, 0, 5, zx.d(*(arg3 + 8)), 
                    0)
                return ascension::CWorld::PopResolveEffect(r5_1) __tailcall

return result
