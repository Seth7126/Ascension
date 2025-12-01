// 函数: _ZN14ascensionrules17DiscardEntireDeckEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1163d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(*(arg3 + 0x38) + 0x18) s>= 1)
    do
        int32_t* r0_3 = ascension::CPlayer::RemoveTopCardFromDeck()
        
        if (r0_3 != 0)
            int32_t var_38
            int32_t var_34
            uint32_t var_30
            int32_t var_2c
            uint32_t var_28
            core::CWorldBase::OutputMessageFormat(arg2, "%s discards %s\n from their deck", 
                arg3 + 0x10, (*(*r0_3 + 0xc))(r0_3), var_38, var_34, var_30, var_2c, var_28)
            uint32_t r0_8 = zx.d(*(arg3 + 8))
            var_38 = r0_8
            var_34 = 3
            var_30 = r0_8
            var_28 = r0_8
            var_2c = 2
            ascension::CWorld::OutputAnimationCard(arg2, r0_3, 5, 2, var_38, 3, var_30, 2)
            ascension::CPlayer::PutCardInDiscard(arg3)
    while (*(*(arg3 + 0x38) + 0x18) s> 0)

return ascension::CWorld::OutputPauseForAnimationToDestination(arg2) __tailcall
