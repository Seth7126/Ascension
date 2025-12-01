// 函数: _ZN14ascensionrules45TriggerEffectPlayerChooseFactionForPlayedCardEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11bdb0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* result = *(arg4 + 4)

if (result != 0x13)
    return result

core::CCardInstance* r5 = *(arg4 + 0x50)

if (r5 != 0)
    result = *(arg2 + 0x14)
    
    if (result != 0)
        result = __dynamic_cast(result, _typeinfo_for_core::CInstance, 
            _typeinfo_for_ascension::CPlayer, 0)
        
        if (result != 0)
            ascensionrules::CreateStateProcessChooseFactionForCard(result, r5)
            return CStateMachine::PushListState(arg1) __tailcall

return result
