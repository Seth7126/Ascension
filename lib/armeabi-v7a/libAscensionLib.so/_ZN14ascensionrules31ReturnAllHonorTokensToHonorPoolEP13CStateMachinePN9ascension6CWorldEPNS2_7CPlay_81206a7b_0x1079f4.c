// 函数: _ZN14ascensionrules31ReturnAllHonorTokensToHonorPoolEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1079f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg2 + 0x1c) != *(arg2 + 0x18))
    void* r10_1 = *(arg2 + 0xb0c)
    int32_t i = 0
    
    do
        int32_t* r0_2 = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
        ascension::CPlayer* r5_1 = r0_2[0x24]
        
        if (r5_1 s>= 1)
            int32_t var_28
            core::CWorldBase::OutputMessageFormat(arg2, "%s returns %d Honor Tokens\n", 
                (*(*r0_2 + 0xc))(r0_2), r5_1, var_28)
            var_28 = 0
            ascension::CWorld::OutputAnimationHonor(arg2, r5_1, nullptr, r0_2)
            ascension::CPlayer::RemoveHonorTokens(r0_2)
            r10_1 += r5_1
            ascension::CWorld::SetHonorTokenPool(arg2)
        
        i += 1
    while (i u< (*(arg2 + 0x1c) - *(arg2 + 0x18)) s>> 2)

return ascension::CWorld::OutputPauseForAllAnimation() __tailcall
