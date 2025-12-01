// 函数: _ZN17CGameStateOptions11UpdateStateER13CStateMachine
// 地址: 0xb824c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *__stack_chk_guard

if (*(arg1 + 0x30) == 0)
    int32_t r0_6 = *(arg1 + 0x38)
    CState* entry_r1
    
    if (r0_6 == 0)
        CStateMachine::PopState(entry_r1)
    label_b83bc:
        int32_t r0_19 = *__stack_chk_guard
        
        if (r0_19 == r0)
            return r0_19 - r0
        
        __stack_chk_fail()
        noreturn
    
    if (r0_6 != 1 || zx.d(*(arg1 + 0x44)) == 0)
        void* r2_3 = *(arg1 + 0x48)
        
        if (r2_3 == 0)
            goto label_b83bc
        
        void* r1_6 = *(r2_3 + 4)
        int32_t var_20 = 0
        int32_t* r0_13 = *(r1_6 + 0x14)
        
        if (r0_13 != 0)
        label_b8364:
            int32_t r0_14 = (*(*r0_13 + 8))(r0_13, r1_6, entry_r1, arg1, &var_20)
            
            if (r0_14 s>= 0 && r0_14 s< *(arg1 + 0x38))
                void* r0_17 = *(arg1 + 0x40) + (r0_14 << 4)
                
                if (r0_17 == 0)
                    printf("    Selected Option %d: NULL\n", r0_14)
                else
                    *(arg1 + 0x38) = 0
                    int32_t r12_4 = *(r0_17 + 8)
                    
                    if (r12_4 != 0)
                        r12_4(entry_r1, arg1, *(r0_17 + 0xc), &var_20)
        else
            r0_13 = *(r2_3 + 0x30)
            
            if (r0_13 != 0)
                goto label_b8364
        
        int32_t r0_24 = *__stack_chk_guard
        
        if (r0_24 == r0)
            return r0_24 - r0
    else
        void* r0_8 = *(arg1 + 0x40)
        
        if (r0_8 != 0)
            *(arg1 + 0x38) = 0
            int32_t r12_2 = *(r0_8 + 8)
            
            if (r12_2 == 0)
                goto label_b83bc
            
            *(r0_8 + 0xc)
            
            if (*__stack_chk_guard == r0)
                jump(r12_2)
        else if (*__stack_chk_guard == r0)
            return printf("    Selected Option %d: NULL\n", 0) __tailcall
else if (*__stack_chk_guard == r0)
    return CStateList::UpdateState(arg1) __tailcall

__stack_chk_fail()
noreturn
