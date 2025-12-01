// 函数: _ZN14ascensionrules36EachPlayerMayBanishFromHandOrDiscardEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10feb4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CWorld* r4 = arg2
int32_t result = *(arg2 + 0x1c) - *(arg2 + 0x18)

if (result s>= 1)
    int32_t result_1 = result s>> 2
    uint32_t r7_1 = arg4
    int32_t r10_1 = 0
    ascension::CWorld* var_30_1 = r4
    
    do
        ascension::CPlayer* r0_2 = ascension::CWorld::GetPlayerByTurnOrder(r4, arg3)
        CState* r0_3 = ascensionrules::CreateStateProcessBanishFromHandOrDiscardOrSource(r0_2, 
            r7_1, true, true, false, 0, nullptr, nullptr, nullptr, nullptr, 0)
        
        if (r0_2 != arg3 && zx.d(*(r4 + 0xa2d)) != 0)
            if (arg7 == 0)
                ascensionrules::CreateStateProcessPendingAsyncResolveEffect(r0_2, nullptr, nullptr, 
                    0, arg3, r0_3, true)
                ascension::CPlayer::AddPendingAsyncState(r0_2)
            else
                void* r0_8 = __dynamic_cast(arg7, _typeinfo_for_ascension::CEvent, 
                    _typeinfo_for_ascension::CEventEnterCenterRow, 0)
                
                if (r0_8 == 0)
                    ascensionrules::CreateStateProcessPendingAsyncResolveEffect(r0_2, nullptr, 
                        nullptr, 0, arg3, r0_3, true)
                    ascension::CPlayer::AddPendingAsyncState(r0_2)
                else
                    core::CCardInstance* r7_2 = *(r0_8 + 0x50)
                    core::CCardInstance* r0_10
                    
                    if (arg5 == 0)
                        r0_10 = nullptr
                    else
                        r0_10 = __dynamic_cast(arg5, _typeinfo_for_core::CInstance, 
                            _typeinfo_for_core::CCardInstance, 0)
                    
                    if (r0_10 != 0)
                        r7_2 = r0_10
                    
                    ascensionrules::CreateStateProcessPendingAsyncResolveEffect(r0_2, nullptr, 
                        r7_2, *(r0_8 + 0x54), arg3, r0_3, true)
                    ascension::CPlayer::AddPendingAsyncState(r0_2)
                    r7_1 = arg4
            
            r4 = var_30_1
        else
            CStateMachine::PushListState(arg1)
        
        result = result_1
        r10_1 += 1
    while (r10_1 s< result)

return result
