// 函数: _ZNSt6__ndk17__sort5IRPFbP13AvailableGameS2_EPS2_EEjT0_S7_S7_S7_S7_T_
// 地址: 0x186f4c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t result = std::__ndk1::__sort4<bool (*&)(AvailableGame*, AvailableGame*), AvailableGame**>(
    arg1, arg2, arg3, arg4, arg6)

if ((*arg6)(*arg5, *arg4) != 0)
    AvailableGame* r0_3 = *arg4
    *arg4 = *arg5
    *arg5 = r0_3
    
    if ((*arg6)(*arg4, *arg3) == 0)
        return result + 1
    
    AvailableGame* r0_6 = *arg3
    *arg3 = *arg4
    *arg4 = r0_6
    
    if ((*arg6)(*arg3, *arg2) == 0)
        return result + 2
    
    AvailableGame* r0_9 = *arg2
    *arg2 = *arg3
    *arg3 = r0_9
    
    if ((*arg6)(*arg2, *arg1) == 0)
        return result + 3
    
    result += 4
    AvailableGame* r0_12 = *arg1
    *arg1 = *arg2
    *arg2 = r0_12

return result
