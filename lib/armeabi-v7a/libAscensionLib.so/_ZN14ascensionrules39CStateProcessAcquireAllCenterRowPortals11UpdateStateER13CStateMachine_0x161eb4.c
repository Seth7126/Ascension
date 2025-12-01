// 函数: _ZN14ascensionrules39CStateProcessAcquireAllCenterRowPortals11UpdateStateER13CStateMachine
// 地址: 0x161eb4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0)
    if (zx.d(*(arg1 + 0x250)) == 0)
        ascensionrules::CStateProcessAcquireAllCenterRowPortals::BuildAcquireOptions(arg1)
    
    if (zx.d(*(arg1 + 0x250)) != 0 || zx.d(*(arg1 + 0x250)) != 0)
        void* __offset(CStateMachine, 0x276) r6_2 = arg1 + 0x270
        uint32_t r9_1 = zx.d(*r6_2)
        int32_t result
        CState* entry_r1
        int32_t r1_3
        
        if (r9_1 == 1)
            r1_3 = 0
        label_162010:
            ascensionrules::CreateStateRemoveCenterRowCard(*(arg1 + 0x24c), r1_3, 
                *(arg1 + (r1_3 << 2) + 0x254), true, true, 0, 0, false, nullptr, 
                arg1 + ((r1_3 | r1_3 << 5) << 2) + 0x278, 2, nullptr, 0)
            CStateMachine::PushOwnedState(entry_r1)
            result = 3
            *r6_2 = result.b
            return result
        
        r1_3 = 1
        uint32_t lr_3 = zx.d(*(arg1 + 0x271))
        
        if (lr_3 == 1)
            r6_2 = arg1 + 0x271
            goto label_162010
        
        r1_3 = 2
        uint32_t r10_1 = zx.d(*(arg1 + 0x272))
        
        if (r10_1 == 1)
            r6_2 = arg1 + 0x272
            goto label_162010
        
        r1_3 = 3
        uint32_t r2_2 = zx.d(*(arg1 + 0x273))
        
        if (r2_2 == 1)
            r6_2 = arg1 + 0x273
            goto label_162010
        
        void* __offset(CStateMachine, 0x276) r2_4 = arg1 + 0x274
        uint32_t r8_1 = zx.d(*r2_4)
        r1_3 = 4
        
        if (r8_1 == 1)
            r6_2 = r2_4
            goto label_162010
        
        void* __offset(CStateMachine, 0x276) var_2c_1 = r2_4
        r1_3 = 5
        uint32_t r2_5 = zx.d(*(arg1 + 0x275))
        
        if (r2_5 == 1)
            r6_2 = arg1 + 0x275
            goto label_162010
        
        r2_4 = arg1 + 0x276
        uint32_t r8_4 = zx.d(*r2_4)
        r1_3 = 6
        
        if (r8_4 == 1)
            r6_2 = r2_4
            goto label_162010
        
        int32_t r1_5 = 0
        
        if (r9_1 == 3)
        label_1620e4:
            ascensionrules::CreateStateProcessPendingCenterRowEffect(*(arg1 + 0x24c), 
                arg1 + ((r1_5 | r1_5 << 5) << 2) + 0x278, nullptr, 0)
            CStateMachine::PushOwnedState(entry_r1)
            result = 4
            *r6_2 = result.b
            return result
        
        r1_5 = 1
        r6_2 = arg1 + 0x271
        
        if (lr_3 == 3)
            goto label_1620e4
        
        r1_5 = 2
        r6_2 = arg1 + 0x272
        
        if (r10_1 == 3)
            goto label_1620e4
        
        r1_5 = 3
        r6_2 = arg1 + 0x273
        
        if (r2_2 == 3)
            goto label_1620e4
        
        r1_5 = 4
        r6_2 = var_2c_1
        
        if (r8_1 == 3)
            goto label_1620e4
        
        r1_5 = 5
        r6_2 = arg1 + 0x275
        
        if (r2_5 == 3)
            goto label_1620e4
        
        r1_5 = 6
        r6_2 = r2_4
        
        if (r8_4 == 3)
            goto label_1620e4

return CGameStateOptions::UpdateState(arg1) __tailcall
