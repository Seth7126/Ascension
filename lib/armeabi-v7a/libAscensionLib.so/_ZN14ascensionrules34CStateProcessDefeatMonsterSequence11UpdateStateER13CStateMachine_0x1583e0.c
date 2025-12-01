// 函数: _ZN14ascensionrules34CStateProcessDefeatMonsterSequence11UpdateStateER13CStateMachine
// 地址: 0x1583e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *(arg1 + 0x4c)
core::CCardInstance* r6 = *(*(arg1 + 0x30) + 4)
*(arg1 + 0x4c) = r0 + 1
CState* entry_r1

switch (r0)
    case 0
        char* var_48_1
        int32_t var_44_1
        ascension::CEvent* r1_3
        bool r2
        int32_t r3
        
        if (zx.d(*(arg1 + 0x5c)) != 0 && *(r6 + 0x30) u>= 0x13)
            CState::CleanupEmbeddedState()
            r2 = false
            r3 = 1
            var_48_1 = *(arg1 + 0x20)
            r1_3 = arg1 + 0x54
            var_44_1 = *(arg1 + 0x1c)
        label_1585b0:
            ascensionrules::CreateStateHandleEvent(r6, r1_3, r2, r3, var_48_1, var_44_1)
            CState::SetEmbeddedState(arg1)
            return CStateMachine::PushState(entry_r1) __tailcall
        
        *(arg1 + 0x4c) = 2
    label_158488:
        
        if (*(arg1 + 0x38) == 7 && zx.d(*(arg1 + 0x45)) != 0)
            uint32_t r7_2 = 0
            void* r0_9 = *(*(arg1 + 0x34) + 0xc)
            
            if (zx.d(*(r0_9 + 0xd0)) != 0)
                r7_2 = *(r0_9 + 0x8c)
                
                if (r7_2 == 0)
                    r7_2 = 0x100
            
            CState::CleanupEmbeddedState()
            ascensionrules::CreateStateRemoveCenterRowCard(*(arg1 + 0x30), *(arg1 + 0x3c), 
                *(arg1 + 0x50), false, true, 0, r7_2, false, nullptr, arg1 + 0xc0, 0xb, 
                *(arg1 + 0x20), *(arg1 + 0x1c))
            CState::SetEmbeddedState(arg1)
            return CStateMachine::PushState(entry_r1) __tailcall
        
        *(arg1 + 0x4c) = 3
    label_158520:
        void* r7_3 = *(*(arg1 + 0x34) + 0xc)
        
        if (*(r7_3 + 0xec) != 0)
            CState::CleanupEmbeddedState()
            ascensionrules::CreateStateProcessCardEffect(r6, *(arg1 + 0x30), *(r7_3 + 0xec), 
                *(arg1 + 0x34), arg1 + 0x54, *(arg1 + 0x20), *(arg1 + 0x1c))
            CState::SetEmbeddedState(arg1)
            return CStateMachine::PushState(entry_r1) __tailcall
        
        *(arg1 + 0x4c) = 4
    label_158574:
        
        if (zx.d(*(arg1 + 0x5c)) != 0)
            CState::CleanupEmbeddedState()
            r3 = 0
            r2 = false
            var_48_1 = *(arg1 + 0x20)
            var_44_1 = *(arg1 + 0x1c)
            
            if (*(r6 + 0x30) u< 3)
                r2 = true
            
            r1_3 = arg1 + 0x54
            goto label_1585b0
        
        *(arg1 + 0x4c) = 5
    label_1585c4:
        
        if (zx.d(*(arg1 + 0x44)) != 0 && *(arg1 + 0x48) == 9)
            CState::CleanupEmbeddedState()
            ascensionrules::CreateStatePutCardIntoPlayerDiscard(*(arg1 + 0x30), *(arg1 + 0x34), 1, 
                true, arg1 + 0x54, *(arg1 + 0x20), *(arg1 + 0x1c))
            CState::SetEmbeddedState(arg1)
            return CStateMachine::PushState(entry_r1) __tailcall
        
        *(arg1 + 0x4c) = 6
    label_158618:
        int32_t r0_26 = *(arg1 + 0x38)
        
        if (r0_26 != 7)
            if (r0_26 == 4 && zx.d(*(arg1 + 0x45)) != 0)
            label_158638:
                CState::CleanupEmbeddedState()
                ascensionrules::CreateStateProcessPendingCenterRowEffect(*(arg1 + 0x30), 
                    arg1 + 0xc0, *(arg1 + 0x20), *(arg1 + 0x1c))
                CState::SetEmbeddedState(arg1)
                return CStateMachine::PushState(entry_r1) __tailcall
        else if (zx.d(*(arg1 + 0x45)) != 0)
            goto label_158638
        
        *(arg1 + 0x4c) = 7
    label_1586b4:
        
        if (*(arg1 + 0x48) == 4 && zx.d(*(arg1 + 0xb9)) == 0 && zx.d(*(arg1 + 0x198)) == 0)
            int32_t var_48_4 = 0
            ascension::CWorld::AddToAcquiredCards(r6, (*(arg1 + 0x34)).b, *(arg1 + 0x38), 4)
            *(arg1 + 0x34)
            ascension::CPlayer::AddTurnLog(*(arg1 + 0x30), 3)
            *(arg1 + 0x34)
            ascension::CPlayer::AddOwnedCard(*(arg1 + 0x30))
            void* r0_42 = ascension::CPlayer::PutConstructInPlay(*(arg1 + 0x30), (*(arg1 + 0x34)).b)
            int32_t var_38 = 0
            ascension::CWorld::OutputAnimationCard(r6, *(arg1 + 0x34), 4, 0xb, 0, 4, 
                zx.d(*(r0_42 + 8)), 0)
            int32_t r0_45 = *(arg1 + 0x30)
            int32_t r1_18 = *(arg1 + 0x34)
            *(arg1 + 0x14c) = 0
            *(arg1 + 0x190) = r0_45
            *(arg1 + 0x194) = r1_18
            CState::CleanupEmbeddedState()
            ascensionrules::CreateStateHandleEvent(r6, arg1 + 0x144, true, 0, *(arg1 + 0x20), 
                *(arg1 + 0x1c))
            CState::SetEmbeddedState(arg1)
            int32_t result = CStateMachine::PushState(entry_r1)
            *(arg1 + 0x198) = 1
            return result
        
        *(arg1 + 0x4c) = 8
    case 1
        goto label_158488
    case 2
        goto label_158520
    case 3
        goto label_158574
    case 4
        goto label_1585c4
    case 5
        goto label_158618
    case 6
        goto label_1586b4

return CStateMachine::PopState(entry_r1)
