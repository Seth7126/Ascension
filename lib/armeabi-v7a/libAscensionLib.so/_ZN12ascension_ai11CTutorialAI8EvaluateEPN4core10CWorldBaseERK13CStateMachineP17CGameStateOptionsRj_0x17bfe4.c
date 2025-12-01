// 函数: _ZN12ascension_ai11CTutorialAI8EvaluateEPN4core10CWorldBaseERK13CStateMachineP17CGameStateOptionsRj
// 地址: 0x17bfe4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t r7 = *(arg1 + 0x18)
int32_t result_1
int32_t* arg_0
int32_t r0_2
void var_34
void var_30

if (r7 != 0)
    r0_2 = r7(*(arg1 + 0x1c), *(arg1 + 4), &result_1, &var_30, &var_34, arg_0)
int32_t result

if (r7 == 0 || r0_2 == 0)
    int32_t* r0_3 = *(arg1 + 0x24)
    int32_t r0_12
    
    if (r0_3 != 0 && *r0_3 != 0)
        r0_12 = CGameStateOptions::GetOptionCount()
    
    if (r0_3 == 0 || *r0_3 == 0 || r0_12 s< 1)
    label_17c074:
        int32_t* var_40_2 = arg_0
        result = ascension_ai::CEasyAI::Evaluate(arg1, arg2, arg3, arg4)
    else
        result = 0
        
        while (true)
            int16_t* r0_14 = CGameStateOptions::GetOption(arg4)
            int32_t* r0_15 = *(arg1 + 0x24)
            
            if (*r0_15 == zx.d(r0_14[1]))
                char* r1_5 = r0_15[1]
                
                if (r1_5 == 0 || zx.d(*r1_5) == 0)
                    goto label_17c148
                
                *r0_14
                int32_t* r0_17 = core::CWorldBase::GetInstanceByID(arg2)
                
                if (r0_17 != 0 && strcasecmp(*(*(arg1 + 0x24) + 4), (*(*r0_17 + 0xc))()) == 0)
                    r0_15 = *(arg1 + 0x24)
                label_17c148:
                    *(arg1 + 0x24) = &r0_15[2]
                    void* r0_23 = r0_15[2]
                    int32_t r5_1 = *(arg1 + 0x10)
                    
                    if (r0_23 != 0)
                        r0_23 = &r0_15[2]
                    
                    *(arg1 + 0x24) = r0_23
                    
                    if (r5_1 != 0)
                        r5_1(*(arg1 + 0x14), *(arg1 + 4), result, zx.d(*r0_14), zx.d(r0_14[1]), 
                            *arg_0, arg3)
                    
                    break
            
            result += 1
            
            if (result s>= CGameStateOptions::GetOptionCount())
                goto label_17c074
else
    result = result_1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
