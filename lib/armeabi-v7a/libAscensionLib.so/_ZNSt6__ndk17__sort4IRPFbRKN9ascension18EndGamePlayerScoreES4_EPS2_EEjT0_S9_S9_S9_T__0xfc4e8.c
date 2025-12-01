// 函数: _ZNSt6__ndk17__sort4IRPFbRKN9ascension18EndGamePlayerScoreES4_EPS2_EEjT0_S9_S9_S9_T_
// 地址: 0xfc4e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_1 = (*arg5)(arg2, arg1)
int32_t r0_3 = (*arg5)(arg3, arg2)
int32_t result

if (r0_1 == 0)
    result = 0
    
    if (r0_3 != 0)
        int32_t r0_5 = *arg2
        int32_t r1_3 = *(arg2 + 4)
        int32_t r3_1 = *(arg3 + 4)
        *arg2 = *arg3
        *(arg2 + 4) = r3_1
        *arg3 = r0_5
        *(arg3 + 4) = r1_3
        result = 1
        
        if ((*arg5)(arg2, arg1) != 0)
            int32_t r0_8 = *arg1
            int32_t r1_5 = *(arg1 + 4)
            int32_t r3_2 = *(arg2 + 4)
            *arg1 = *arg2
            *(arg1 + 4) = r3_2
            *arg2 = r0_8
            *(arg2 + 4) = r1_5
            result = 2
else
    int32_t r2_2 = *arg1
    int32_t r1_2 = *(arg1 + 4)
    
    if (r0_3 == 0)
        int32_t r3_3 = *(arg2 + 4)
        *arg1 = *arg2
        *(arg1 + 4) = r3_3
        *(arg2 + 4) = r1_2
        *arg2 = r2_2
        result = 1
        
        if ((*arg5)(arg3, arg2) != 0)
            int32_t r0_12 = *arg2
            int32_t r1_7 = *(arg2 + 4)
            int32_t r3_4 = *(arg3 + 4)
            *arg2 = *arg3
            *(arg2 + 4) = r3_4
            *arg3 = r0_12
            *(arg3 + 4) = r1_7
            result = 2
    else
        int32_t r3 = *(arg3 + 4)
        result = 1
        *arg1 = *arg3
        *(arg1 + 4) = r3
        *arg3 = r2_2
        *(arg3 + 4) = r1_2

if ((*arg5)(arg4, arg3) != 0)
    int32_t r0_15 = *arg3
    int32_t r1_9 = *(arg3 + 4)
    int32_t r3_5 = *(arg4 + 4)
    *arg3 = *arg4
    *(arg3 + 4) = r3_5
    *arg4 = r0_15
    *(arg4 + 4) = r1_9
    
    if ((*arg5)(arg3, arg2) == 0)
        return result + 1
    
    int32_t r0_18 = *arg2
    int32_t r1_11 = *(arg2 + 4)
    int32_t r3_6 = *(arg3 + 4)
    *arg2 = *arg3
    *(arg2 + 4) = r3_6
    *arg3 = r0_18
    *(arg3 + 4) = r1_11
    
    if ((*arg5)(arg2, arg1) == 0)
        return result + 2
    
    int32_t r0_21 = *arg1
    int32_t r1_13 = *(arg1 + 4)
    result += 3
    int32_t r3_7 = *(arg2 + 4)
    *arg1 = *arg2
    *(arg1 + 4) = r3_7
    *arg2 = r0_21
    *(arg2 + 4) = r1_13

return result
