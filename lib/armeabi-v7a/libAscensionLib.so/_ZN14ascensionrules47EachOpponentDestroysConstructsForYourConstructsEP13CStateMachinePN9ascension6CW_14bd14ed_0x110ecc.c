// 函数: _ZN14ascensionrules47EachOpponentDestroysConstructsForYourConstructsEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x110ecc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = ascension::CPlayer::CountConstructsInPlay(arg3, false, nullptr)

if (result != 0)
    int32_t result_1 = result
    result = *(arg2 + 0x1c) - *(arg2 + 0x18)
    
    if (result s>= 5)
        int32_t r8_1 = result s>> 2
        int32_t r6_1 = 1
        
        do
            ascension::CPlayer* r0_3 = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
            CState* r0_4 =
                ascensionrules::CreateStateProcessDestroyConstructsInPlay(r0_3, result_1, nullptr)
            int32_t r0_7
            
            if (zx.d(*(arg2 + 0xa2d)) != 0)
                r0_7 = ascension::CPlayer::CountConstructsInPlay(r0_3, false, nullptr)
            
            if (zx.d(*(arg2 + 0xa2d)) == 0 || r0_7 s< 1)
                result = CStateMachine::PushListState(arg1)
            else
                ascensionrules::CreateStateProcessPendingAsyncResolveEffect(arg3, 
                    *(*(arg2 + 0xbdc) - 8), nullptr, 0, r0_3, r0_4, false)
                result = ascension::CPlayer::AddPendingAsyncState(r0_3)
            
            r6_1 += 1
        while (r6_1 s< r8_1)

return result
