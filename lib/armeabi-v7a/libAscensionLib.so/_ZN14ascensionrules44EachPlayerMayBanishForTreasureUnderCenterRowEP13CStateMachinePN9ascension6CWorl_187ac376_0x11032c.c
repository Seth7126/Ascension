// 函数: _ZN14ascensionrules44EachPlayerMayBanishForTreasureUnderCenterRowEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x11032c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CEvent* result = arg7

if (result != 0)
    result = __dynamic_cast(arg7, _typeinfo_for_ascension::CEvent, 
        _typeinfo_for_ascension::CEventEnterCenterRow, 0)
    
    if (result != 0)
        result = *(result + 0x5c)
        int32_t r7_2 = result * arg4
        
        if (r7_2 != 0)
            result = *(arg2 + 0x1c) - *(arg2 + 0x18)
            
            if (result s>= 1)
                int32_t result_1 = result s>> 2
                int32_t r9_1 = 0
                
                do
                    ascension::CPlayer* r0_3 = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
                    CState* r0_4 =
                        ascensionrules::CreateStateProcessBanishMultipleFromHandOrDiscard(r0_3, 
                        r7_2, true, true, false, false, nullptr)
                    
                    if (r0_3 != arg3 && zx.d(*(arg2 + 0xa2d)) != 0)
                        void* r0_8 = __dynamic_cast(arg7, _typeinfo_for_ascension::CEvent, 
                            _typeinfo_for_ascension::CEventEnterCenterRow, 0)
                        ascension::CPlayer* var_38_1
                        CState* var_34_1
                        ascension::CPlayer* r0_9
                        core::CCardInstance* r2_3
                        uint32_t r3
                        
                        if (r0_8 == 0)
                            var_38_1 = arg3
                            var_34_1 = r0_4
                            int32_t var_30_2 = 1
                            r0_9 = r0_3
                            r2_3 = nullptr
                            r3 = 0
                        else
                            r2_3 = *(r0_8 + 0x50)
                            r3 = *(r0_8 + 0x54)
                            var_38_1 = arg3
                            var_34_1 = r0_4
                            int32_t var_30_1 = 1
                            r0_9 = r0_3
                        
                        ascensionrules::CreateStateProcessPendingAsyncResolveEffect(r0_9, nullptr, 
                            r2_3, r3, var_38_1, var_34_1, true)
                        ascension::CPlayer::AddPendingAsyncState(r0_3)
                    else
                        CStateMachine::PushListState(arg1)
                    
                    result = result_1
                    r9_1 += 1
                while (r9_1 s< result)

return result
