// 函数: _ZN14ascensionrules19EachPlayerDrawCardsEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10f438
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = *(arg2 + 0x1c) - *(arg2 + 0x18)

if (result s>= 1)
    int32_t r7_1 = result s>> 2
    int32_t r9_1 = 0
    
    do
        ascension::CPlayer* r0_2 = ascension::CWorld::GetPlayerByTurnOrder(arg2, arg3)
        CState* r0_5
        
        if (*(arg2 + 0x30) u< 3)
            r0_5 = ascensionrules::CreateStateProcessDrawCards(r0_2, arg4, nullptr, 0)
        else
            r0_5 = ascensionrules::CreateStateProcessOptionalDrawCards(r0_2, arg4)
        
        if (r0_2 != arg3 && zx.d(*(arg2 + 0xa2d)) != 0)
            ascension::CPlayer* var_38
            CState* var_34
            ascension::CPlayer* r0_11
            core::CCardInstance* r2_2
            uint32_t r3
            int32_t var_30
            
            if (arg7 == 0)
            label_10f528:
                var_38 = arg3
                var_34 = r0_5
                var_30 = 0
                r0_11 = r0_2
                r2_2 = nullptr
                r3 = 0
            else
                void* r0_10 = __dynamic_cast(arg7, _typeinfo_for_ascension::CEvent, 
                    _typeinfo_for_ascension::CEventEnterCenterRow, 0, var_38, var_34, var_30)
                
                if (r0_10 == 0)
                    goto label_10f528
                
                r2_2 = *(r0_10 + 0x50)
                r3 = *(r0_10 + 0x54)
                var_38 = arg3
                var_34 = r0_5
                var_30 = 0
                r0_11 = r0_2
            ascensionrules::CreateStateProcessPendingAsyncResolveEffect(r0_11, nullptr, r2_2, r3, 
                var_38, var_34, false)
            result = ascension::CPlayer::AddPendingAsyncState(r0_2)
        else
            result = CStateMachine::PushListState(arg1)
        
        r9_1 += 1
    while (r9_1 s< r7_1)

return result
