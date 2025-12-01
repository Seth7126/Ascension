// 函数: _ZN14ascensionrules27TakeInsightFromEachOpponentEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x106f5c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = *(arg2 + 0x1c) - *(arg2 + 0x18)

if (result s>= 5)
    int32_t result_1 = result s>> 2
    int32_t r7_1 = 1
    
    do
        int32_t r0_2 = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
        uint32_t r4_1 = *(r0_2 + 0x8c)
        
        if (r4_1 s>= arg4)
            r4_1 = arg4
        
        if (r4_1 s>= 1)
            ascension::CPlayer::RemoveInsightCount(r0_2)
            ascension::CPlayer::AddInsightCount(arg3)
            
            if (*(arg2 + 0xb20) == arg3)
                ascension::CWorld::AddInsightGainedThisTurn(arg2)
            
            int32_t var_30_1 = 0
            ascension::CWorld::OutputAnimationInsight(arg2, r4_1, arg3, r0_2)
            core::CWorldBase::OutputMessageFormat(arg2, "%s takes %d insight from %s\n", 
                (*(*arg3 + 0xc))(arg3), r4_1, (*(*r0_2 + 0xc))(r0_2))
        
        result = result_1
        r7_1 += 1
    while (r7_1 s< result)

return result
