// 函数: _ZN14ascensionrules36DreamwalkerReplacementEffectCallbackEP13CStateMachinePN9ascension7CPlayerEiPN4core13CCardInstanceEPNS5_9CInstanceE
// 地址: 0x10bbb0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg4 != 0)
    core::CInstance* r3 = arg5
    int32_t r6_1 = *(arg2 + 4)
    
    if (r3 == 0)
        int32_t r1 = *(r6_1 + 0xbdc)
        
        if (*(r6_1 + 0xbd8) != r1)
            r3 = *(r1 - 8)
        else
            r3 = nullptr
    
    ascension::CWorld* r1_2 = *(*(arg4 + 0xc) + 0x88)
    
    if (r1_2 == 1)
        ascensionrules::GainHonor(arg1, r1_2, arg2, 2, r3)
        return 1
    
    if (r1_2 == 2)
        CState* r6_2 = *arg1
        
        if (*(r6_2 + 0x1c) s< 1)
            ascensionrules::CreateStateProcessDrawCards(arg2, 2, nullptr, 0)
            CState::AddOwnedChild(r6_2)
        else
            CState::CleanupEmbeddedState()
            ascensionrules::CreateStateProcessDrawCards(arg2, 2, *(r6_2 + 0x20), *(r6_2 + 0x1c))
            CState::SetEmbeddedState(r6_2)
        
        CStateMachine::PushState(arg1)
        return 1
    
    if (r1_2 == 3)
        ascension::CWorld::OutputAnimationInsight(r6_1, 2, arg2, r3)
        ascension::CPlayer::AddInsightCount(arg2)
        
        if (*(r6_1 + 0xb20) == arg2)
            ascension::CWorld::AddInsightGainedThisTurn(r6_1)
        
        core::CWorldBase::OutputMessageFormat(r6_1, "%s gains %d insight\n", 
            (*(*arg2 + 0xc))(arg2), 2, 0)
        return 1

return 0
