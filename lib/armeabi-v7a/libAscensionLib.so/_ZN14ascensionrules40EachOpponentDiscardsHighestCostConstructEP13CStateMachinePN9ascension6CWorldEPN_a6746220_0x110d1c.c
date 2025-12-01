// 函数: _ZN14ascensionrules40EachOpponentDiscardsHighestCostConstructEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x110d1c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* result = *(arg2 + 0x1c) - *(arg2 + 0x18)

if (result s>= 1)
    int32_t r10_1 = result s>> 2
    int32_t r7_1 = 0
    
    do
        result = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
        
        if (result != arg3)
            CState* r0_2 = ascensionrules::CreateStateProcessDiscardHighestCostConstruct(result)
            int32_t r0_5
            
            if (zx.d(*(arg2 + 0xa2d)) != 0)
                r0_5 = ascension::CPlayer::CountConstructsInPlay(result, false, nullptr)
            
            if (zx.d(*(arg2 + 0xa2d)) == 0 || r0_5 s< 1)
                result = CStateMachine::PushListState(arg1)
            else
                ascensionrules::CreateStateProcessPendingAsyncResolveEffect(arg3, 
                    *(*(arg2 + 0xbdc) - 8), nullptr, 0, result, r0_2, false)
                result = ascension::CPlayer::AddPendingAsyncState(result)
        
        r7_1 += 1
    while (r7_1 s< r10_1)

return result
