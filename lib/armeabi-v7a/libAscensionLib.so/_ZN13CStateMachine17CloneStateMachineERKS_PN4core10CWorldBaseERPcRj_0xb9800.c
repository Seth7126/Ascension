// 函数: _ZN13CStateMachine17CloneStateMachineERKS_PN4core10CWorldBaseERPcRj
// 地址: 0xb9800
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* i = *arg2
int32_t* i_1

do
    i_1 = i
    i = i[1]
while (i != 0)

int32_t* result
int32_t* result_2

if (i_1 == 0)
    result_2 = nullptr
    result = nullptr
else
    int32_t* i_3 = nullptr
    result = nullptr
    result_2 = nullptr
    
    do
        int32_t* i_4 = i_3
        i_3 = i_1
        int32_t r0_5
        
        if (i_4 != 0 && i_4[9] == i_3)
            r0_5 = result_2[8]
        
        int32_t* result_1
        int32_t r1_1
        
        if (i_4 == 0 || i_4[9] != i_3 || r0_5 == 0)
            int32_t arg_0
            result_1 = (*(*i_3 + 0x24))(i_3, arg1, arg3, arg4, arg_0)
            r1_1 = 0
            
            if (result_1 != 0)
            label_b98a0:
                
                if (result == 0)
                    result = result_1
                
                if (result_2 != 0)
                    result_2[2] = result_1
                    
                    if (r1_1 == 0)
                        void* r1_4
                        
                        if (result_2[3] == 0)
                            result_2[3] = result_1
                            r1_4 = &result_2[4]
                        else
                            r1_4 = &result_2[4]
                            *(*r1_4 + 0x14) = result_1
                        
                        *r1_4 = result_1
                    
                    result_1[1] = result_2
                
                result_2 = result_1
        else
            int32_t var_2c = result_2[7]
            int32_t var_30 = r0_5
            result_1 = (*(*i_3 + 0x24))(i_3, arg1, arg3, &var_30, &var_2c)
            result_2[9] = result_1
            r1_1 = 1
            
            if (result_1 != 0)
                goto label_b98a0
        i_1 = i_3[2]
    while (i_1 != 0)

if (*arg1 == 0)
    *arg1 = result_2

if (result != 0)
    int32_t* i_2 = result
    
    do
        (*(*i_2 + 0x28))(i_2, arg1)
        i_2 = i_2[2]
    while (i_2 != 0)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
