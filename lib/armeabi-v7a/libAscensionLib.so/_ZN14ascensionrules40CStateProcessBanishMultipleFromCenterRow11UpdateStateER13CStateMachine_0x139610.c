// 函数: _ZN14ascensionrules40CStateProcessBanishMultipleFromCenterRow11UpdateStateER13CStateMachine
// 地址: 0x139610
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr

if (*(arg1 + 0x30) == 0 && *(arg1 + 0x38) s<= 0)
    if (*(arg1 + 0x258) s< *(arg1 + 0x250))
        return ascensionrules::CStateProcessBanishMultipleFromCenterRow::BuildBanishOptions(arg1)
            __tailcall
    
    void* __offset(CStateMachine, 0x278) r5_2 = arg1 + 0x278
    uint32_t r9_1 = zx.d(*r5_2)
    int32_t result
    CState* entry_r1
    int32_t r1_7
    
    if (r9_1 == 1)
        r1_7 = 0
    label_139778:
        ascensionrules::CreateStateRemoveCenterRowCard(*(arg1 + 0x24c), r1_7, nullptr, true, false, 
            0, 0, false, nullptr, arg1 + ((r1_7 | r1_7 << 5) << 2) + 0x280, 0, nullptr, 0)
        CStateMachine::PushOwnedState(entry_r1)
        result = 2
        *r5_2 = result.b
        return result
    
    r1_7 = 1
    uint32_t lr_5 = zx.d(*(arg1 + 0x279))
    
    if (lr_5 == 1)
        r5_2 = arg1 + 0x279
        goto label_139778
    
    r1_7 = 2
    uint32_t r10_1 = zx.d(*(arg1 + 0x27a))
    
    if (r10_1 == 1)
        r5_2 = arg1 + 0x27a
        goto label_139778
    
    r1_7 = 3
    uint32_t r6_1 = zx.d(*(arg1 + 0x27b))
    
    if (r6_1 == 1)
        r5_2 = arg1 + 0x27b
        goto label_139778
    
    void* r6_3 = arg1 + 0x27c
    uint32_t r8_1 = zx.d(*r6_3)
    r1_7 = 4
    
    if (r8_1 == 1)
        r5_2 = r6_3
        goto label_139778
    
    void* var_2c_1 = r6_3
    r1_7 = 5
    uint32_t r6_4 = zx.d(*(arg1 + 0x27d))
    
    if (r6_4 == 1)
        r5_2 = arg1 + 0x27d
        goto label_139778
    
    r6_3 = arg1 + 0x27e
    uint32_t r8_4 = zx.d(*r6_3)
    r1_7 = 6
    
    if (r8_4 == 1)
        r5_2 = r6_3
        goto label_139778
    
    int32_t r1_9 = 0
    
    if (r9_1 == 2)
    label_139834:
        ascensionrules::CreateStateProcessPendingCenterRowEffect(*(arg1 + 0x24c), 
            arg1 + ((r1_9 | r1_9 << 5) << 2) + 0x280, nullptr, 0)
        CStateMachine::PushOwnedState(entry_r1)
        result = 3
        *r5_2 = result.b
        return result
    
    r1_9 = 1
    r5_2 = arg1 + 0x279
    
    if (lr_5 == 2)
        goto label_139834
    
    r1_9 = 2
    r5_2 = arg1 + 0x27a
    
    if (r10_1 == 2)
        goto label_139834
    
    r1_9 = 3
    r5_2 = arg1 + 0x27b
    
    if (r6_1 == 2)
        goto label_139834
    
    r1_9 = 4
    r5_2 = var_2c_1
    
    if (r8_1 == 2)
        goto label_139834
    
    r1_9 = 5
    r5_2 = arg1 + 0x27d
    
    if (r6_4 == 2)
        goto label_139834
    
    r1_9 = 6
    r5_2 = r6_3
    
    if (r8_4 == 2)
        goto label_139834

return CGameStateOptions::UpdateState(arg1) __tailcall
