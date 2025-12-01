// 函数: _ZN14ascensionrules21EachPlayerGainInsightEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x106e64
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = *(arg2 + 0x1c) - *(arg2 + 0x18)

if (result s>= 1)
    int32_t r8_1 = result s>> 2
    int32_t r7_1 = 0
    
    do
        int32_t* r0_2 = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
        ascension::CWorld::OutputAnimationInsight(arg2, arg4, r0_2, arg5)
        ascension::CPlayer::AddInsightCount(r0_2)
        
        if (r0_2 == *(arg2 + 0xb20))
            ascension::CWorld::AddInsightGainedThisTurn(arg2)
        
        result = core::CWorldBase::OutputMessageFormat(arg2, "%s gains %d insight\n", 
            (*(*r0_2 + 0xc))(r0_2), arg4, 0)
        r7_1 += 1
    while (r7_1 s< r8_1)

return result
