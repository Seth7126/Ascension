// 函数: _ZN14ascensionrules22DiscardTopXCardsOfDeckEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x116318
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg4 != 0)
    uint32_t i_1 = arg4
    uint32_t i
    
    do
        int32_t* r0_1 = ascension::CPlayer::RemoveTopCardFromDeck()
        
        if (r0_1 != 0)
            int32_t var_38
            int32_t var_34
            uint32_t var_30
            int32_t var_2c
            uint32_t var_28
            core::CWorldBase::OutputMessageFormat(arg2, "%s discards %s\n from their deck", 
                arg3 + 0x10, (*(*r0_1 + 0xc))(r0_1), var_38, var_34, var_30, var_2c, var_28)
            uint32_t r0_6 = zx.d(*(arg3 + 8))
            var_38 = r0_6
            var_34 = 3
            var_30 = r0_6
            var_28 = r0_6
            var_2c = 2
            ascension::CWorld::OutputAnimationCard(arg2, r0_1, 5, 2, var_38, 3, var_30, 2)
            ascension::CPlayer::PutCardInDiscard(arg3)
        
        i = i_1
        i_1 -= 1
    while (i != 1)

return ascension::CWorld::OutputPauseForAnimationToDestination(arg2) __tailcall
