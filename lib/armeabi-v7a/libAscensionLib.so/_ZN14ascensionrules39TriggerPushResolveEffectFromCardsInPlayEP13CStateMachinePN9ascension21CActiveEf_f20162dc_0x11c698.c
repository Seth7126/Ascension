// 函数: _ZN14ascensionrules39TriggerPushResolveEffectFromCardsInPlayEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11c698
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
void* result = *(arg2 + 0x14)

if (result != 0)
    result =
        __dynamic_cast(result, _typeinfo_for_core::CInstance, _typeinfo_for_ascension::CPlayer, 0)
    
    if (result != 0)
        core::CCardInstance* r6 = *(result + 4)
        uint32_t r5 = *(arg3 + 0x10)
        ascension::CWorld::PushResolveEffect(r6, r5)
        int32_t var_20 = 0
        ascension::CWorld::OutputAnimationCard(r6, r5, 1, 5, zx.d(*(arg3 + 8)), 0xb, 0, 0)
        return ascension::CWorld::OutputPauseForAnimationToDestination(r6) __tailcall

return result
