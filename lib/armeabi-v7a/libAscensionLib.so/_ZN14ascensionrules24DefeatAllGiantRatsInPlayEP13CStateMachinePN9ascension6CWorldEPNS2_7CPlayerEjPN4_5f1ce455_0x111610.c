// 函数: _ZN14ascensionrules24DefeatAllGiantRatsInPlayEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x111610
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* result

for (int32_t i = 0; i != 7; i += 1)
    result = ascension::CWorld::GetCenterRowCard(arg2)
    
    if (result != 0)
        int32_t* result_1 = result
        result = strcasecmp((*(*result + 0xc))(result_1), "Giant Rat")
        
        if (result == 0)
            int32_t var_50
            int32_t var_4c
            int32_t var_48
            int32_t var_44
            int32_t var_40
            int32_t var_3c
            int32_t var_38
            int32_t var_34
            int32_t var_30
            core::CWorldBase::OutputMessageFormat(arg2, "%s defeats %s\n", (*(*arg3 + 0xc))(arg3), 
                (*(*result_1 + 0xc))(result_1), var_50, var_4c, var_48, var_44, var_40, var_3c, 
                var_38, var_34, var_30)
            CStateMachine* r0_17
            
            if (*(arg2 + 0x30) u> 7)
                var_50 = 9
                var_4c = 0
                var_48 = 1
                var_44 = 0
                var_40 = 0
                var_3c = 0
                ascensionrules::CreateStateProcessDefeatMonsterSequence(arg3, result_1, 7, i, 9, 
                    false, true, false, nullptr, 0)
                r0_17 = arg1
            else
                __builtin_memset(&var_50, 0, 0x24)
                ascensionrules::CreateStateRemoveCenterRowCard(arg3, i, nullptr, true, false, 0, 0, 
                    false, nullptr, nullptr, 0, nullptr, 0)
                CStateMachine::PushListState(arg1)
                ascensionrules::CreateStateProcessDefeatMonster(arg3, result_1, i)
                r0_17 = arg1
            
            result = CStateMachine::PushListState(r0_17)

return result
