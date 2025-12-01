// 函数: sub_1a85a4
// 地址: 0x1a85a4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r10 = arg4
int32_t r0 = *__stack_chk_guard
sub_1a87e0(arg2, arg1)
int32_t r8 = 1

while (true)
    int32_t r6_1 = 1
    int32_t r0_3 = r10 & 1
    
    if (r0_3 != 0)
        r6_1 = 2
    
    if (r0_3 != 0 && r8 == 0)
        sub_1a885c(arg2, 0xffffffff, *(arg3 + 0x10))
        r10 = 0
    
    int32_t var_2c
    sub_1a8828(arg2, 0xfffffffe, &var_2c)
    int32_t var_54
    
    if (sub_1a891e(arg2, &var_54) != 0)
        break
    
    int32_t var_48
    
    if (var_48 != 0)
        *(arg3 + 0x48) = var_54
        int32_t var_34
        *(arg3 + 0x4c) = var_34
        int32_t var_40
        *(arg3 + 0x50) = var_40
        int32_t r0_10 = var_48(r6_1, arg3, arg2)
        
        if (r0_10 == 7)
            int32_t var_58
            sub_1a8828(arg2, 0xffffffff, &var_58)
            *(arg3 + 0x10) = var_58
            sub_1a8940(arg2)
            break
        
        if (r0_10 != 8)
            if (r0_10 != 9)
                break
            
            abort()
            noreturn
        
        if (var_2c == *(arg3 + 0x20))
            fprintf(__sF + 0xa8, "libunwind: %s %s:%d - %s\n", "unwind_phase2", 
                "/buildbot/src/android/ndk-release-r19/external/libcxx/../.."
            "/external/libunwind_llvm/src/Unwind-EHABI.cpp", 
                0x268, 
                "during phase1 personality function said it would stop here, but now in phase2 it did "
            "not stop here")
            fflush(__sF + 0xa8)
            abort()
            noreturn
    
    r8 -= 1

int32_t r1_5 = *__stack_chk_guard

if (r1_5 == r0)
    return r1_5 - r0

__stack_chk_fail()
noreturn
