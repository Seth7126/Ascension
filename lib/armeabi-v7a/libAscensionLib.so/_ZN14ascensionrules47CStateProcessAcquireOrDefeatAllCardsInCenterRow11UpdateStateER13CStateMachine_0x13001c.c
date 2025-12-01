// 函数: _ZN14ascensionrules47CStateProcessAcquireOrDefeatAllCardsInCenterRow11UpdateStateER13CStateMachine
// 地址: 0x13001c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0)
    if (zx.d(*(arg1 + 0x67c)) == 0)
        ascensionrules::CStateProcessAcquireOrDefeatAllCardsInCenterRow::BuildAcquireOrDefeatOptions(
            arg1)
    
    if (zx.d(*(arg1 + 0x67c)) != 0 || zx.d(*(arg1 + 0x67c)) != 0)
        void* __offset(CStateMachine, 0x6a0) r8_2 = arg1 + 0x6a0
        uint32_t r12_2 = zx.d(*r8_2)
        ascension::CPlayer* r0_7 = *(r8_2 - 0x454)
        CState* entry_r1
        int32_t r1_3
        
        if (r12_2 == 1)
            r1_3 = 0
        label_1300dc:
            ascensionrules::CreateStateRemoveCenterRowCard(r0_7, r1_3, 
                *(arg1 + (r1_3 << 2) + 0x684), true, true, 0, 0, false, nullptr, 
                arg1 + ((r1_3 | r1_3 << 5) << 2) + 0x6e4, 2, nullptr, 0)
            int32_t r0_10 = CStateMachine::PushOwnedState(entry_r1)
            *r8_2 = 2
            return r0_10
        
        void* __offset(CStateMachine, 0x6c4) r6_2 = arg1 + 0x6c4
        uint32_t r3_5 = zx.d(*r6_2)
        int32_t r1_5
        
        if (r3_5 == 1)
            r1_5 = 0
        label_130150:
            ascensionrules::CreateStateRemoveCenterRowCard(r0_7, r1_5, 
                *(arg1 + (r1_5 << 2) + 0x6a8), true, true, 0, 0, false, nullptr, 
                arg1 + ((r1_5 | r1_5 << 5) << 2) + 0x6e4, 2, nullptr, 0)
            int32_t r0_13 = CStateMachine::PushOwnedState(entry_r1)
            *r6_2 = 2
            return r0_13
        
        r1_3 = 1
        uint32_t r2_6 = zx.d(*(arg1 + 0x6a1))
        
        if (r2_6 == 1)
            r8_2 = arg1 + 0x6a1
            goto label_1300dc
        
        void* __offset(CStateMachine, 0x6c4) var_2c_1 = r6_2
        r6_2 = arg1 + 0x6c5
        uint32_t lr_3 = zx.d(*r6_2)
        r1_5 = 1
        
        if (lr_3 == 1)
            goto label_130150
        
        r1_3 = 2
        ascension::CPlayer* var_28_1 = r0_7
        uint32_t r6_4 = zx.d(*(arg1 + 0x6a2))
        
        if (r6_4 == 1)
            r8_2 = arg1 + 0x6a2
            r0_7 = var_28_1
            goto label_1300dc
        
        r1_5 = 2
        void* __offset(CStateMachine, 0x6c6) lr_7 = arg1 + 0x6c6
        uint32_t r6_5 = zx.d(*lr_7)
        
        if (r6_5 == 1)
        label_1301f0:
            r6_2 = lr_7
            r0_7 = var_28_1
            goto label_130150
        
        void* __offset(CStateMachine, 0x6a3) r0_15 = arg1 + 0x6a3
        uint32_t r6_6 = zx.d(*r0_15)
        r1_3 = 3
        
        if (r6_6 == 1)
        label_130218:
            r8_2 = r0_15
            r0_7 = var_28_1
            goto label_1300dc
        
        void* __offset(CStateMachine, 0x6c6) var_54_1 = lr_7
        void* __offset(CStateMachine, 0x6a3) var_50_1 = r0_15
        r1_5 = 3
        lr_7 = arg1 + 0x6c7
        uint32_t r0_16 = zx.d(*lr_7)
        
        if (r0_16 == 1)
            goto label_1301f0
        
        r0_15 = arg1 + 0x6a4
        uint32_t lr_9 = zx.d(*r0_15)
        r1_3 = 4
        
        if (lr_9 == 1)
            goto label_130218
        
        uint32_t lr_10 = zx.d(*(arg1 + 0x6c8))
        r1_5 = 4
        
        if (lr_10 == 1)
            r6_2 = arg1 + 0x6c8
            r0_7 = var_28_1
            goto label_130150
        
        uint32_t lr_11 = zx.d(*(arg1 + 0x6a5))
        r1_3 = 5
        
        if (lr_11 == 1)
            r8_2 = arg1 + 0x6a5
            r0_7 = var_28_1
            goto label_1300dc
        
        uint32_t r0_18 = zx.d(*(arg1 + 0x6c9))
        r1_5 = 5
        
        if (r0_18 == 1)
            r6_2 = arg1 + 0x6c9
            r0_7 = var_28_1
            goto label_130150
        
        uint32_t r0_19 = zx.d(*(arg1 + 0x6a6))
        r1_3 = 6
        
        if (r0_19 == 1)
            r8_2 = arg1 + 0x6a6
            r0_7 = var_28_1
            goto label_1300dc
        
        uint32_t r9_1 = zx.d(*(arg1 + 0x6ca))
        r1_5 = 6
        
        if (r9_1 == 1)
            r6_2 = arg1 + 0x6ca
            r0_7 = var_28_1
            goto label_130150
        
        int32_t r10_1 = 0
        int32_t r9_2 = *(var_28_1 + 4)
        
        if (r12_2 == 2)
            goto label_1303e0
        
        r10_1 = 1
        int32_t r0_32
        
        if (r2_6 == 2)
            r8_2 = arg1 + 0x6a1
        label_1303e0:
            
            if (zx.d(*(*(*(arg1 + (r10_1 << 2) + 0x684) + 0xc) + 0xd2)) != 0)
                ascension::CPlayer::AddInsightCount(var_28_1)
                core::CInstance* r2_7 = *(arg1 + 0x24c)
                
                if (r2_7 == *(r9_2 + 0xb20))
                    ascension::CWorld::AddInsightGainedThisTurn(r9_2)
                    r2_7 = *(arg1 + 0x24c)
                
                int32_t var_b0_1 = 0
                ascension::CWorld::OutputAnimationInsight(r9_2, 1, r2_7, 
                    *(arg1 + (r10_1 << 2) + 0x684))
                var_28_1 = *(arg1 + 0x24c)
            
            *(arg1 + 0xacc) = var_28_1
            int32_t r0_28 = *(arg1 + (r10_1 << 2) + 0x684)
            *(arg1 + 0xad4) = 7
            *(arg1 + 0xad0) = r0_28
            *(arg1 + 0xadc) = 0
            *(arg1 + 0xae0) = 1
            *(arg1 + 0xa88) = 0
            ascensionrules::CreateStateHandleEvent(r9_2, arg1 + 0xa80, true, 0, nullptr, 0)
            CStateMachine::PushOwnedState(entry_r1)
            r0_32 = 3
            *r8_2 = r0_32.b
            return r0_32
        
        r10_1 = 2
        
        if (r6_4 == 2)
            r8_2 = arg1 + 0x6a2
            goto label_1303e0
        
        r10_1 = 3
        
        if (r6_6 == 2)
            r8_2 = var_50_1
            goto label_1303e0
        
        r10_1 = 4
        
        if (lr_9 == 2)
            r8_2 = r0_15
            goto label_1303e0
        
        r10_1 = 5
        
        if (lr_11 == 2)
            r8_2 = arg1 + 0x6a5
            goto label_1303e0
        
        r10_1 = 6
        
        if (r0_19 == 2)
            r8_2 = arg1 + 0x6a6
            goto label_1303e0
        
        int32_t r1_29 = 0
        
        if (r12_2 == 3)
        label_1304bc:
            ascensionrules::CreateStateProcessPendingCenterRowEffect(var_28_1, 
                arg1 + ((r1_29 | r1_29 << 5) << 2) + 0x6e4, nullptr, 0)
            CStateMachine::PushOwnedState(entry_r1)
            r0_32 = 4
            *r8_2 = r0_32.b
            return r0_32
        
        int32_t r1_34 = 0
        
        if (r3_5 == 2)
        label_130500:
            ascensionrules::CreateStateProcessPendingCenterRowEffect(var_28_1, 
                arg1 + ((r1_34 | r1_34 << 5) << 2) + 0x6e4, nullptr, 0)
            CStateMachine::PushOwnedState(entry_r1)
            *var_2c_1 = 3
            return 3
        
        r1_29 = 1
        r8_2 = arg1 + 0x6a1
        
        if (r2_6 == 3)
            goto label_1304bc
        
        r1_34 = 1
        var_2c_1 = r6_2
        
        if (lr_3 == 2)
            goto label_130500
        
        r1_29 = 2
        r8_2 = arg1 + 0x6a2
        
        if (r6_4 == 3)
            goto label_1304bc
        
        r1_34 = 2
        var_2c_1 = var_54_1
        
        if (r6_5 == 2)
            goto label_130500
        
        r1_29 = 3
        r8_2 = var_50_1
        
        if (r6_6 == 3)
            goto label_1304bc
        
        r1_34 = 3
        var_2c_1 = lr_7
        
        if (r0_16 == 2)
            goto label_130500
        
        r1_29 = 4
        r8_2 = r0_15
        
        if (lr_9 == 3)
            goto label_1304bc
        
        r1_34 = 4
        var_2c_1 = arg1 + 0x6c8
        
        if (lr_10 == 2)
            goto label_130500
        
        r1_29 = 5
        r8_2 = arg1 + 0x6a5
        
        if (lr_11 == 3)
            goto label_1304bc
        
        r1_34 = 5
        var_2c_1 = arg1 + 0x6c9
        
        if (r0_18 == 2)
            goto label_130500
        
        r1_29 = 6
        r8_2 = arg1 + 0x6a6
        
        if (r0_19 == 3)
            goto label_1304bc
        
        r1_34 = 6
        var_2c_1 = arg1 + 0x6ca
        
        if (r9_1 == 2)
            goto label_130500

return CGameStateOptions::UpdateState(arg1) __tailcall
