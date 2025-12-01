// 函数: _ZN14ascensionrules22PutThisCardOnTopOfDeckEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1125ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CInstance* result = arg5

if (result != 0)
    result =
        __dynamic_cast(result, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
    
    if (result != 0)
        core::CInstance* result_1 = result
        ascension::CPlayer::PutCardOnTopOfDeck(arg3)
        ascension::CWorld::OutputPauseForAnimationToDestination(arg2)
        int32_t var_28_1 = 0
        ascension::CWorld::OutputAnimationCard(arg2, result_1, 5, 0xb, 0, 2, zx.d(*(arg3 + 8)), 0)
        ascension::CWorld::OutputPauseForAnimationToDestination(arg2)
        
        if (ascension::CWorld::IsResolveEffect(arg2) != 0)
            ascension::CWorld::PopResolveEffect(arg2)
        
        result = *(arg7 + 4)
        
        if (result == 0x14)
            ascension::CWorld::SetPlayedCardsFlags(arg2, result_1)
            result = nullptr
            *(arg7 + 0x54) = 0

return result
