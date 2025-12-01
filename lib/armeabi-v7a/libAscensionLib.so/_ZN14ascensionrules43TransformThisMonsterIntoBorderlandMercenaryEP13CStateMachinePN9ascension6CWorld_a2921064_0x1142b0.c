// 函数: _ZN14ascensionrules43TransformThisMonsterIntoBorderlandMercenaryEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x1142b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer::AddTurnLog(arg3, 0xb)
void* r0_2 = ascension::CDatabase::GetCard(ascension::g_Database)
ascension::CEvent* result = ascension::CWorld::CreateCard(arg2)

if (result != 0)
    core::CCardInstance* result_1 = result
    int32_t* i = *(r0_2 + 0x130)
    
    while (i != *(r0_2 + 0x134))
        core::CInstance* r1_2 = *i
        i = &i[1]
        ascension::CWorld::AddGlobalActiveEffect(arg2, r1_2)
    
    uint32_t r0_6 = zx.d(*(result_1 + 8))
    ascension::CWorld::OutputEvent(arg2, 0xf, zx.d(*(arg3 + 8)), zx.d(*(arg5 + 8)))
    ascension::CWorld::RemoveCardFromVoid(arg2)
    ascension::CWorld::PopResolveEffect(arg2)
    ascension::CWorld::PushResolveEffect(arg2, result_1)
    ascensionrules::CreateStateProcessAcquireResolveCard(arg3, result_1)
    CStateMachine::PushListState(arg1)
    result = arg7
    
    if (result != 0)
        result = __dynamic_cast(result, _typeinfo_for_ascension::CEvent, 
            _typeinfo_for_ascension::CEventDefeatMonster, 0, r0_6)
        
        if (result != 0)
            *(result + 0x65) = 1

return result
