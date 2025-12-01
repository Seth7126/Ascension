// 函数: _ZN14ascensionrules32CStateProcessAcquireCardSequence11UpdateStateER13CStateMachine
// 地址: 0x11e6e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x30)
void* r1 = *(arg1 + 0x34)
int32_t r3 = *(arg1 + 0x48)
ascension::CWorld* r6 = *(r0 + 4)
void* r2 = *(r1 + 0xc)
*(arg1 + 0x48) = r3 + 1
CState* entry_r1

if (r3 u<= 5)
    switch (r3)
        case 0
            if (zx.d(*(r2 + 0xe4)) != 0)
                CState::CleanupEmbeddedState()
                ascensionrules::CreateStateProcessBanishFromHandOrDiscardOrSource(*(arg1 + 0x30), 
                    1, false, false, true, 0, nullptr, nullptr, nullptr, *(arg1 + 0x20), 
                    *(arg1 + 0x1c))
                CState::SetEmbeddedState(arg1)
                return CStateMachine::PushState(entry_r1) __tailcall
            
            *(arg1 + 0x48) = 2
        label_11e7a8:
            char* var_40_1
            int32_t var_3c_1
            ascension::CWorld* r0_6
            void* __offset(CStateMachine, 0x50) r1_3
            bool r2_5
            int32_t r3_2
            
            if (zx.d(*(arg1 + 0x58)) != 0 && *(r6 + 0x30) u>= 0x13)
                CState::CleanupEmbeddedState()
                r2_5 = false
                r3_2 = 1
                var_40_1 = *(arg1 + 0x20)
                r1_3 = arg1 + 0x50
                var_3c_1 = *(arg1 + 0x1c)
                r0_6 = r6
            label_11e8d0:
                ascensionrules::CreateStateHandleEvent(r0_6, r1_3, r2_5, r3_2, var_40_1, var_3c_1)
                CState::SetEmbeddedState(arg1)
                return CStateMachine::PushState(entry_r1) __tailcall
            
            *(arg1 + 0x48) = 3
        label_11e7f8:
            
            if (*(arg1 + 0x38) == 7)
                CState::CleanupEmbeddedState()
                ascensionrules::CreateStateRemoveCenterRowCard(*(arg1 + 0x30), *(arg1 + 0x3c), 
                    *(arg1 + 0x4c), true, true, 0, 0, false, nullptr, arg1 + 0xb8, *(arg1 + 0x44), 
                    *(arg1 + 0x20), *(arg1 + 0x1c))
                CState::SetEmbeddedState(arg1)
                return CStateMachine::PushState(entry_r1) __tailcall
            
            *(arg1 + 0x48) = 4
        label_11e864:
            int32_t r0_10
            
            if (zx.d(*(arg1 + 0x58)) != 0)
                CState::CleanupEmbeddedState()
                r2_5 = false
                r0_10 = *(arg1 + 0x1c)
                var_40_1 = *(arg1 + 0x20)
                r1_3 = arg1 + 0x50
            label_11e8c4:
                var_3c_1 = r0_10
                r0_6 = r6
                r3_2 = 0
                goto label_11e8d0
            
            *(arg1 + 0x48) = 5
        label_11e898:
            
            if (*(arg1 + 0x44) == 4)
                *(arg1 + 0x188) = r0
                *(arg1 + 0x18c) = r1
                CState::CleanupEmbeddedState()
                r0_10 = *(arg1 + 0x1c)
                r2_5 = true
                var_40_1 = *(arg1 + 0x20)
                r1_3 = arg1 + 0x13c
                goto label_11e8c4
            
            *(arg1 + 0x48) = 6
        label_11e8e4:
            
            if (*(arg1 + 0x38) == 7)
                CState::CleanupEmbeddedState()
                ascensionrules::CreateStateProcessPendingCenterRowEffect(*(arg1 + 0x30), 
                    arg1 + 0xb8, *(arg1 + 0x20), *(arg1 + 0x1c))
                CState::SetEmbeddedState(arg1)
                return CStateMachine::PushState(entry_r1) __tailcall
        case 1
            goto label_11e7a8
        case 2
            goto label_11e7f8
        case 3
            goto label_11e864
        case 4
            goto label_11e898
        case 5
            goto label_11e8e4
    
    *(arg1 + 0x48) = 7

return CStateMachine::PopState(entry_r1) __tailcall
