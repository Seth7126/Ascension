// 函数: _ZN14ascensionrules35TriggerRemovePlayedCardEffectActiveEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11ccfc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

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
                return ascension::CWorld::RemovePlayedCardsFlags(*(result_1 + 4), result)

return result
