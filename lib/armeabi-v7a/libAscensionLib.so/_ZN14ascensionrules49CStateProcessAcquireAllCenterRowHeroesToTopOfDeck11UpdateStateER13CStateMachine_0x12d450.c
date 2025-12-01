// 函数: _ZN14ascensionrules49CStateProcessAcquireAllCenterRowHeroesToTopOfDeck11UpdateStateER13CStateMachine
// 地址: 0x12d450
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0)
    if (zx.d(*(arg1 + 0x434)) == 0)
        ascensionrules::CStateProcessAcquireAllCenterRowHeroesToTopOfDeck::BuildAcquireOptions(arg1)
    
    if (zx.d(*(arg1 + 0x434)) != 0 || zx.d(*(arg1 + 0x434)) != 0)
        void* __offset(CStateMachine, 0x454) r10_2 = arg1 + 0x454
        uint32_t r12_2 = zx.d(*r10_2)
        ascension::CPlayer* r0_7 = *(r10_2 - 0x208)
        CState* entry_r1
        int32_t r1_3
        
        if (r12_2 == 1)
            r1_3 = 0
        label_12d5ac:
            ascensionrules::CreateStateRemoveCenterRowCard(r0_7, r1_3, 
                *(arg1 + (r1_3 << 2) + 0x438), true, true, 0, 0, false, nullptr, 
                arg1 + ((r1_3 | r1_3 << 5) << 2) + 0x45c, 2, nullptr, 0)
            int32_t r0_10 = CStateMachine::PushOwnedState(entry_r1)
            *r10_2 = 2
            return r0_10
        
        r1_3 = 1
        uint32_t r9_1 = zx.d(*(arg1 + 0x455))
        
        if (r9_1 == 1)
            r10_2 = arg1 + 0x455
            goto label_12d5ac
        
        r1_3 = 2
        uint32_t r2_2 = zx.d(*(arg1 + 0x456))
        
        if (r2_2 == 1)
            r10_2 = arg1 + 0x456
            goto label_12d5ac
        
        r1_3 = 3
        void* __offset(CStateMachine, 0x457) r7_2 = arg1 + 0x457
        uint32_t r8_1 = zx.d(*r7_2)
        
        if (r8_1 == 1)
            r10_2 = r7_2
            goto label_12d5ac
        
        r1_3 = 4
        void* __offset(CStateMachine, 0x457) var_30_1 = r7_2
        r7_2 = arg1 + 0x458
        uint32_t r8_2 = zx.d(*r7_2)
        
        if (r8_2 == 1)
            r10_2 = r7_2
            goto label_12d5ac
        
        void* __offset(CStateMachine, 0x457) var_38_1 = r7_2
        r7_2 = arg1 + 0x459
        uint32_t r2_3 = zx.d(*r7_2)
        r1_3 = 5
        
        if (r2_3 == 1)
            r10_2 = r7_2
            goto label_12d5ac
        
        uint32_t r7_8 = zx.d(*(arg1 + 0x45a))
        r1_3 = 6
        
        if (r7_8 == 1)
            r10_2 = arg1 + 0x45a
            goto label_12d5ac
        
        int32_t r3_2 = *(r0_7 + 4)
        int32_t r1_5 = 0
        
        if (r12_2 == 2)
            goto label_12d6a0
        
        r1_5 = 1
        int32_t r0_18
        
        if (r9_1 == 2)
            r10_2 = arg1 + 0x455
        label_12d6a0:
            
            if (zx.d(*(*(*(arg1 + (r1_5 << 2) + 0x438) + 0xc) + 0xd2)) != 0)
                ascension::CPlayer::AddInsightCount(r0_7)
                core::CInstance* r2_10 = *(arg1 + 0x24c)
                
                if (r2_10 == *(r3_2 + 0xb20))
                    ascension::CWorld::AddInsightGainedThisTurn(r3_2)
                    r2_10 = *(arg1 + 0x24c)
                
                int32_t var_70_1 = 0
                ascension::CWorld::OutputAnimationInsight(r3_2, 1, r2_10, 
                    *(arg1 + (r1_5 << 2) + 0x438))
                r0_7 = *(arg1 + 0x24c)
            
            *(arg1 + 0x844) = r0_7
            int32_t r0_14 = *(arg1 + (r1_5 << 2) + 0x438)
            *(arg1 + 0x84c) = 7
            *(arg1 + 0x848) = r0_14
            *(arg1 + 0x854) = 0
            *(arg1 + 0x858) = 1
            *(arg1 + 0x800) = 0
            ascensionrules::CreateStateHandleEvent(r3_2, arg1 + 0x7f8, true, 0, nullptr, 0)
            CStateMachine::PushOwnedState(entry_r1)
            r0_18 = 3
            *r10_2 = r0_18.b
            return r0_18
        
        r1_5 = 2
        
        if (r2_2 == 2)
            r10_2 = arg1 + 0x456
            goto label_12d6a0
        
        r1_5 = 3
        
        if (r8_1 == 2)
            r10_2 = var_30_1
            goto label_12d6a0
        
        r1_5 = 4
        
        if (r8_2 == 2)
            r10_2 = var_38_1
            goto label_12d6a0
        
        r1_5 = 5
        
        if (r2_3 == 2)
            r10_2 = r7_2
            goto label_12d6a0
        
        r1_5 = 6
        
        if (r7_8 == 2)
            r10_2 = arg1 + 0x45a
            goto label_12d6a0
        
        int32_t r1_13 = 0
        
        if (r12_2 == 3)
        label_12d7e4:
            ascensionrules::CreateStateProcessPendingCenterRowEffect(r0_7, 
                arg1 + ((r1_13 | r1_13 << 5) << 2) + 0x45c, nullptr, 0)
            CStateMachine::PushOwnedState(entry_r1)
            r0_18 = 4
            *r10_2 = r0_18.b
            return r0_18
        
        r1_13 = 1
        r10_2 = arg1 + 0x455
        
        if (r9_1 == 3)
            goto label_12d7e4
        
        r1_13 = 2
        r10_2 = arg1 + 0x456
        
        if (r2_2 == 3)
            goto label_12d7e4
        
        r1_13 = 3
        r10_2 = var_30_1
        
        if (r8_1 == 3)
            goto label_12d7e4
        
        r1_13 = 4
        r10_2 = var_38_1
        
        if (r8_2 == 3)
            goto label_12d7e4
        
        r1_13 = 5
        r10_2 = r7_2
        
        if (r2_3 == 3)
            goto label_12d7e4
        
        r1_13 = 6
        r10_2 = arg1 + 0x45a
        
        if (r7_8 == 3)
            goto label_12d7e4

return CGameStateOptions::UpdateState(arg1) __tailcall
