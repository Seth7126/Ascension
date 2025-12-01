// 函数: _ZN14ascensionrules35EachOpponentDiscardsConstructInPlayEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1108a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result

if (*(arg2 + 0x30) u< 2)
    int32_t* i = *(arg2 + 0x18)
    
    for (result = *(arg2 + 0x1c); i != result; i = &i[1])
        ascension::CPlayer* r6_1 = *i
        
        if (r6_1 != arg3)
            CState* r0_16 =
                ascensionrules::CreateStateProcessDiscardConstructInPlay(r6_1, r6_1, 0, 0, nullptr)
            int32_t r0_19
            
            if (zx.d(*(arg2 + 0xa2d)) != 0)
                r0_19 = ascension::CPlayer::CountConstructsInPlay(r6_1, false, nullptr)
            
            if (zx.d(*(arg2 + 0xa2d)) == 0 || r0_19 s< 2)
                CStateMachine::PushListState(arg1)
            else
                ascensionrules::CreateStateProcessPendingAsyncResolveEffect(arg3, 
                    *(*(arg2 + 0xbdc) - 8), nullptr, 0, r6_1, r0_16, false)
                ascension::CPlayer::AddPendingAsyncState(r6_1)
        
        result = *(arg2 + 0x1c)
else
    result = *(arg2 + 0x1c) - *(arg2 + 0x18)
    
    if (result s>= 1)
        int32_t r10_1 = result s>> 2
        int32_t r7_1 = 0
        
        do
            result = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
            
            if (result != arg3)
                void* result_1 = result
                int32_t r0_5
                
                if (zx.d(*(arg2 + 0xa2d)) != 0)
                    r0_5 = ascension::CPlayer::CountConstructsInPlay(result_1, false, nullptr)
                
                if (zx.d(*(arg2 + 0xa2d)) == 0 || r0_5 s< 1)
                    ascensionrules::CreateStateProcessDiscardConstructInPlay(result_1, result_1, 0, 
                        0, arg6)
                    result = CStateMachine::PushListState(arg1)
                else
                    CState* r0_7 = ascensionrules::CreateStateProcessDiscardConstructInPlay(
                        result_1, result_1, 0, 0, nullptr)
                    ascensionrules::CreateStateProcessPendingAsyncResolveEffect(arg3, 
                        *(*(arg2 + 0xbdc) - 8), nullptr, 0, result_1, r0_7, false)
                    result = ascension::CPlayer::AddPendingAsyncState(result_1)
                    
                    if (arg6 != 0)
                        void* r1_7 = arg6 + *arg6 + 4
                        result = zx.d(*r1_7)
                        
                        if (result u<= 7)
                            uint32_t r2_1 = zx.d(*(result_1 + 8))
                            *r1_7 = result.b + 1
                            result = arg6 + (*arg6 << 5) + (result << 2)
                            *(result + 0x10) = r2_1
            
            r7_1 += 1
        while (r7_1 s< r10_1)

return result
