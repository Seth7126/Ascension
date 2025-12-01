// 函数: _ZN14ascensionrules41CStateProcessDefeatAllMonstersInCenterRow11UpdateStateER13CStateMachine
// 地址: 0x15f6bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0)
    if (zx.d(*(arg1 + 0x494)) == 0)
        ascensionrules::CStateProcessDefeatAllMonstersInCenterRow::BuildDefeatOptions(arg1)
    
    if (zx.d(*(arg1 + 0x494)) != 0 || zx.d(*(arg1 + 0x494)) != 0)
        void* __offset(CStateMachine, 0x4ba) r8_2 = arg1 + 0x4b4
        uint32_t r9_1 = zx.d(*r8_2)
        CState* entry_r1
        int32_t r1_3
        
        if (r9_1 == 1)
            r1_3 = 0
        label_15f830:
            ascensionrules::CreateStateRemoveCenterRowCard(*(arg1 + 0x24c), r1_3, 
                *(arg1 + (r1_3 << 2) + 0x498), false, true, 0, 0, false, nullptr, 
                arg1 + ((r1_3 | r1_3 << 5) << 2) + 0x4d4, 2, nullptr, 0)
            int32_t result = CStateMachine::PushOwnedState(entry_r1)
            *r8_2 = 2
            return result
        
        r1_3 = 1
        uint32_t lr_3 = zx.d(*(arg1 + 0x4b5))
        
        if (lr_3 == 1)
            r8_2 = arg1 + 0x4b5
            goto label_15f830
        
        r1_3 = 2
        uint32_t r10_1 = zx.d(*(arg1 + 0x4b6))
        
        if (r10_1 == 1)
            r8_2 = arg1 + 0x4b6
            goto label_15f830
        
        r1_3 = 3
        uint32_t r6_1 = zx.d(*(arg1 + 0x4b7))
        
        if (r6_1 == 1)
            r8_2 = arg1 + 0x4b7
            goto label_15f830
        
        void* __offset(CStateMachine, 0x4ba) r6_3 = arg1 + 0x4b8
        uint32_t r12_2 = zx.d(*r6_3)
        r1_3 = 4
        
        if (r12_2 == 1)
            r8_2 = r6_3
            goto label_15f830
        
        void* var_30_1 = r6_3
        r6_3 = arg1 + 0x4b9
        uint32_t r12_3 = zx.d(*r6_3)
        r1_3 = 5
        
        if (r12_3 == 1)
            r8_2 = r6_3
            goto label_15f830
        
        void* var_38_1 = r6_3
        r6_3 = arg1 + 0x4ba
        uint32_t r12_4 = zx.d(*r6_3)
        r1_3 = 6
        
        if (r12_4 == 1)
            r8_2 = r6_3
            goto label_15f830
        
        int32_t r1_5 = 0
        
        if (r9_1 == 2)
        label_15f8e8:
            ascensionrules::CreateStateProcessPendingCenterRowEffect(*(arg1 + 0x24c), 
                arg1 + ((r1_5 | r1_5 << 5) << 2) + 0x4d4, nullptr, 0)
            CStateMachine::PushOwnedState(entry_r1)
            *r8_2 = 3
            return 3
        
        r1_5 = 1
        r8_2 = arg1 + 0x4b5
        
        if (lr_3 == 2)
            goto label_15f8e8
        
        r1_5 = 2
        r8_2 = arg1 + 0x4b6
        
        if (r10_1 == 2)
            goto label_15f8e8
        
        r1_5 = 3
        r8_2 = arg1 + 0x4b7
        
        if (r6_1 == 2)
            goto label_15f8e8
        
        r1_5 = 4
        r8_2 = var_30_1
        
        if (r12_2 == 2)
            goto label_15f8e8
        
        r1_5 = 5
        r8_2 = var_38_1
        
        if (r12_3 == 2)
            goto label_15f8e8
        
        r1_5 = 6
        r8_2 = r6_3
        
        if (r12_4 == 2)
            goto label_15f8e8

return CGameStateOptions::UpdateState(arg1) __tailcall
