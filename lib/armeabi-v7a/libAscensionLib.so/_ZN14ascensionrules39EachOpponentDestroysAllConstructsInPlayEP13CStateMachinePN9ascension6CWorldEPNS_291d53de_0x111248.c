// 函数: _ZN14ascensionrules39EachOpponentDestroysAllConstructsInPlayEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x111248
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = *(arg2 + 0x1c) - *(arg2 + 0x18)

if (result s>= 5)
    int32_t r10_1 = result s>> 2
    int32_t r7_1 = 1
    
    do
        ascension::CPlayer* r0_2 = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
        CState* r0_3 = ascensionrules::CreateStateDiscardAllConstructs(r0_2)
        int32_t r0_6
        
        if (zx.d(*(arg2 + 0xa2d)) != 0)
            r0_6 = ascension::CPlayer::CountConstructsInPlay(r0_2, false, nullptr)
        
        if (zx.d(*(arg2 + 0xa2d)) == 0 || r0_6 s< 1)
            result = CStateMachine::PushListState(arg1)
        else
            ascensionrules::CreateStateProcessPendingAsyncResolveEffect(arg3, 
                *(*(arg2 + 0xbdc) - 8), nullptr, 0, r0_2, r0_3, false)
            result = ascension::CPlayer::AddPendingAsyncState(r0_2)
        
        r7_1 += 1
    while (r7_1 s< r10_1)

return result
