// 函数: _ZN14ascensionrules21EachOpponentDrawCardsEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10f810
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* result = *(arg2 + 0x1c) - *(arg2 + 0x18)

if (result s>= 1)
    int32_t r7_1 = result s>> 2
    int32_t r9_1 = 0
    
    do
        result = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
        
        if (result != arg3)
            CState* r0_4
            
            if (*(arg2 + 0x30) u< 3)
                r0_4 = ascensionrules::CreateStateProcessDrawCards(result, arg4, nullptr, 0)
            else
                r0_4 = ascensionrules::CreateStateProcessOptionalDrawCards(result, arg4)
            
            if (zx.d(*(arg2 + 0xa2d)) == 0)
                result = CStateMachine::PushListState(arg1)
            else
                ascension::CPlayer* var_38
                CState* var_34
                ascension::CPlayer* result_1
                core::CCardInstance* r2_2
                uint32_t r3
                int32_t var_30
                
                if (arg7 == 0)
                label_10f8f8:
                    var_38 = arg3
                    var_34 = r0_4
                    var_30 = 0
                    result_1 = result
                    r2_2 = nullptr
                    r3 = 0
                else
                    void* r0_8 = __dynamic_cast(arg7, _typeinfo_for_ascension::CEvent, 
                        _typeinfo_for_ascension::CEventEnterCenterRow, 0, var_38, var_34, var_30)
                    
                    if (r0_8 == 0)
                        goto label_10f8f8
                    
                    r2_2 = *(r0_8 + 0x50)
                    r3 = *(r0_8 + 0x54)
                    var_38 = arg3
                    var_34 = r0_4
                    var_30 = 0
                    result_1 = result
                ascensionrules::CreateStateProcessPendingAsyncResolveEffect(result_1, nullptr, 
                    r2_2, r3, var_38, var_34, false)
                result = ascension::CPlayer::AddPendingAsyncState(result)
        
        r9_1 += 1
    while (r9_1 s< r7_1)

return result
