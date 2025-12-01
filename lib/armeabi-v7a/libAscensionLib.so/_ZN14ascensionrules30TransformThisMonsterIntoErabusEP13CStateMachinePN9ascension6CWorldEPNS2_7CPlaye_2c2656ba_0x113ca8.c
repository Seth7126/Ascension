// 函数: _ZN14ascensionrules30TransformThisMonsterIntoErabusEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x113ca8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer::AddTurnLog(arg3, 0xb)
void* r0_2 = ascension::CDatabase::GetCard(ascension::g_Database)
core::CCardInstance* result = ascension::CWorld::CreateCard(arg2)

if (result != 0)
    int32_t* i = *(r0_2 + 0x130)
    
    while (i != *(r0_2 + 0x134))
        core::CInstance* r1_2 = *i
        i = &i[1]
        ascension::CWorld::AddGlobalActiveEffect(arg2, r1_2)
    
    uint32_t var_38_1 = zx.d(*(result + 8))
    ascension::CWorld::OutputEvent(arg2, 0xf, zx.d(*(arg3 + 8)), zx.d(*(arg5 + 8)))
    ascension::CWorld::RemoveCardFromVoid(arg2)
    ascension::CWorld::PopResolveEffect(arg2)
    int32_t var_38_2
    int32_t var_34_1
    uint32_t var_30_1
    
    if (*(arg2 + 0x30) u< 0x10)
        ascension::CPlayer::AddOwnedCard(arg3)
        ascension::CPlayer::PutCardInHand(arg3)
        var_38_2 = 0
        var_34_1 = 1
        var_30_1 = zx.d(*(arg3 + 8))
        int32_t var_2c = 0
        int32_t var_28 = 0
        result = ascension::CWorld::OutputAnimationCard(arg2, result, 0, 0xb, 0, 1, var_30_1, 0)
        
        if (arg7 != 0)
        label_113e24:
            result = __dynamic_cast(arg7, _typeinfo_for_ascension::CEvent, 
                _typeinfo_for_ascension::CEventDefeatMonster, 0, var_38_2, var_34_1, var_30_1, 
                var_2c, var_28)
            
            if (result != 0)
                *(result + 0x65) = 1
    else
        ascension::CWorld::PushResolveEffect(arg2, result)
        var_38_2 = 1
        var_34_1 = 0
        var_30_1 = 0
        ascensionrules::CreateStateProcessAcquireCardSequence(arg3, result, 0xb, 0, 1, nullptr, 0)
        result = CStateMachine::PushListState(arg1)
        
        if (arg7 != 0)
            goto label_113e24

return result
