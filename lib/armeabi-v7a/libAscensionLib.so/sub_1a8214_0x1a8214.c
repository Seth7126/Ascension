// 函数: sub_1a8214
// 地址: 0x1a8214
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result

if (arg2 == 1)
    if ((arg4 | 4) != 5)
        return 2
    
    if (arg4 != 1)
        if (arg3 u> 0x1f)
            return 2
        
        result = sub_1a88a4(arg1, arg3 + 0x100, arg5)
    else
        if (arg3 u> 0xf)
            return 2
        
        sub_1a8992(arg1)
        result = sub_1a88a4(arg1, arg3 + 0x100, arg5)
    
    goto label_1a826a

if (arg2 != 0)
    fprintf(__sF + 0xa8, "libunwind: %s %s:%d - %s\n", "_Unwind_VRS_Get_Internal", 
        "/buildbot/src/android/ndk-release-r19/external/libcxx/../.."
    "/external/libunwind_llvm/src/Unwind-EHABI.cpp", 
        0x35e, "unsupported register class")
    fflush(__sF + 0xa8)
    abort()
    noreturn

result = 2

if (arg3 u<= 0xf && arg4 == 0)
    result = sub_1a8828(arg1, arg3, arg5)
label_1a826a:
    
    if (result != 0)
        return 2

return result
