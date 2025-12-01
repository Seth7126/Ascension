// 函数: _ZNSt6__ndk17__sort4IRPFbP13AvailableGameS2_EPS2_EEjT0_S7_S7_S7_T_
// 地址: 0x186dc4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_1 = (*arg5)(*arg2, *arg1)
int32_t r0_3 = (*arg5)(*arg3, *arg2)
int32_t result

if (r0_1 == 0)
    result = 0
    
    if (r0_3 != 0)
        AvailableGame* r0_5 = *arg2
        *arg2 = *arg3
        *arg3 = r0_5
        result = 1
        
        if ((*arg5)(*arg2, *arg1) != 0)
            AvailableGame* r0_8 = *arg1
            *arg1 = *arg2
            *arg2 = r0_8
            result = 2
else
    AvailableGame* r1_2 = *arg1
    
    if (r0_3 == 0)
        *arg1 = *arg2
        *arg2 = r1_2
        result = 1
        
        if ((*arg5)(*arg3) != 0)
            AvailableGame* r0_12 = *arg2
            *arg2 = *arg3
            *arg3 = r0_12
            result = 2
    else
        result = 1
        *arg1 = *arg3
        *arg3 = r1_2

if ((*arg5)(*arg4, *arg3) != 0)
    AvailableGame* r0_15 = *arg3
    *arg3 = *arg4
    *arg4 = r0_15
    
    if ((*arg5)(*arg3, *arg2) == 0)
        return result + 1
    
    AvailableGame* r0_18 = *arg2
    *arg2 = *arg3
    *arg3 = r0_18
    
    if ((*arg5)(*arg2, *arg1) == 0)
        return result + 2
    
    result += 3
    AvailableGame* r0_21 = *arg1
    *arg1 = *arg2
    *arg2 = r0_21

return result
