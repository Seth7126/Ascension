// 函数: _ZN14ascensionrules44EachPlayerMayBanishMultipleFromHandOrDiscardEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1101fc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = *(arg2 + 0x1c) - *(arg2 + 0x18)

if (result s>= 1)
    int32_t result_1 = result s>> 2
    int32_t r9_1 = 0
    
    do
        ascension::CPlayer* r0_2 = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
        CState* r0_3 = ascensionrules::CreateStateProcessBanishMultipleFromHandOrDiscard(r0_2, 
            arg4, true, true, false, false, nullptr)
        
        if (r0_2 != arg3 && zx.d(*(arg2 + 0xa2d)) != 0)
            ascension::CPlayer* var_40_1
            CState* var_3c_1
            ascension::CPlayer* r0_8
            core::CCardInstance* r2_2
            uint32_t r3
            
            if (arg7 == 0)
            label_1102e4:
                var_40_1 = arg3
                var_3c_1 = r0_3
                int32_t var_38_2 = 1
                r0_8 = r0_2
                r2_2 = nullptr
                r3 = 0
            else
                void* r0_7 = __dynamic_cast(arg7, _typeinfo_for_ascension::CEvent, 
                    _typeinfo_for_ascension::CEventEnterCenterRow, 0)
                
                if (r0_7 == 0)
                    goto label_1102e4
                
                r2_2 = *(r0_7 + 0x50)
                r3 = *(r0_7 + 0x54)
                var_40_1 = arg3
                var_3c_1 = r0_3
                int32_t var_38_1 = 1
                r0_8 = r0_2
            
            ascensionrules::CreateStateProcessPendingAsyncResolveEffect(r0_8, nullptr, r2_2, r3, 
                var_40_1, var_3c_1, true)
            ascension::CPlayer::AddPendingAsyncState(r0_2)
        else
            CStateMachine::PushListState(arg1)
        
        result = result_1
        r9_1 += 1
    while (r9_1 s< result)

return result
