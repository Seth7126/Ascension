// 函数: _ZN14ascensionrules42EachOpponentDestroysHalfOfConstructsInPlayEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x110fc4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = *(arg2 + 0x1c) - *(arg2 + 0x18)

if (result s>= 5)
    int32_t r10_1 = result s>> 2
    int32_t r7_1 = 1
    
    do
        CState* r0_2 = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
        result = ascension::CPlayer::CountConstructsInPlay(r0_2, false, nullptr)
        
        if (result == 0)
            break
        
        CState* r0_6 = ascensionrules::CreateStateProcessDestroyConstructsInPlay(r0_2, 
            (result + 1 + ((result + 1) u>> 0x1f)) s>> 1, nullptr)
        int32_t r0_9
        
        if (zx.d(*(arg2 + 0xa2d)) != 0)
            r0_9 = ascension::CPlayer::CountConstructsInPlay(r0_2, false, nullptr)
        
        if (zx.d(*(arg2 + 0xa2d)) == 0 || r0_9 s< 1)
            result = CStateMachine::PushListState(arg1)
        else
            ascensionrules::CreateStateProcessPendingAsyncResolveEffect(arg3, 
                *(*(arg2 + 0xbdc) - 8), nullptr, 0, r0_2, r0_6, false)
            result = ascension::CPlayer::AddPendingAsyncState(r0_2)
        
        r7_1 += 1
    while (r7_1 s< r10_1)

return result
