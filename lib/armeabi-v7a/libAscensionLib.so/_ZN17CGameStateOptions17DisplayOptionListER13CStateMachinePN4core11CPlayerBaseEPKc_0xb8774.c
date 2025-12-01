// 函数: _ZN17CGameStateOptions17DisplayOptionListER13CStateMachinePN4core11CPlayerBaseEPKc
// 地址: 0xb8774
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r0_1 = *(arg1 + 0x38)
*(arg1 + 0x48) = arg3

if (r0_1 != 0 && *(arg3 + 0x30) == 0)
    char* r1_1 = *(arg3 + 0xc)
    
    if (r0_1 s> 1 || zx.d(*(arg1 + 0x44)) == 0)
        CStateMachine::HandleOptionListBegin(arg2)
        
        if (*(arg1 + 0x38) s>= 1)
            int32_t r10_1 = 0
            char* i = nullptr
            
            do
                int32_t r8_1 = *(arg1 + 0x40)
                core::CPlayerBase* r0_8
                char* i_1
                uint32_t r2
                uint32_t r3
                
                if (r8_1 == r10_1)
                    int32_t var_138_2 = 0
                    r0_8 = arg2
                    i_1 = i
                    r3 = 0
                    r2 = "(NULL)"
                else
                    char* r1_2 = *(r8_1 + (i << 4) + 4)
                    char var_12c[0xff]
                    
                    if (r1_2 != 0)
                        strncpy(&var_12c, r1_2, 0x100)
                        char var_2d_1 = 0
                    
                    int16_t* r8_2 = r8_1 - r10_1
                    r3 = zx.d(*r8_2)
                    i_1 = i
                    r2 = &var_12c
                    uint32_t var_138_1 = zx.d(r8_2[1])
                    r0_8 = arg2
                
                CStateMachine::HandleOptionListAdd(r0_8, i_1, r2, r3)
                i = &i[1]
                r10_1 -= 0x10
            while (i s< *(arg1 + 0x38))
        
        bool (* entry_r3)(CStateMachine*, void*, uint32_t, int32_t, uint16_t, uint16_t, uint32_t*)
        bool (* r2_1)(CStateMachine*, void*, uint32_t, int32_t, uint16_t, uint16_t, uint32_t*) =
            entry_r3
        bool cond:0_1 = r2_1 == 0
        
        if (r2_1 == 0)
            r2_1 = &data_107315
        
        CStateMachine& var_138_3 = arg1
        
        if (cond:0_1)
            r2_1 += &data_b8890
        
        CStateMachine::HandleOptionListEnd(arg2, r1_1, r2_1, 
            CGameStateOptions::SelectOptionCallback)

int32_t r0_11 = *__stack_chk_guard

if (r0_11 == r0)
    return r0_11 - r0

__stack_chk_fail()
noreturn
