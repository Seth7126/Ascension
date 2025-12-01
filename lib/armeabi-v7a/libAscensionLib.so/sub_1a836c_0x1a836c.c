// 函数: sub_1a836c
// 地址: 0x1a836c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r6
void* var_c = r6
int32_t r5
int32_t var_10 = r5
int32_t r4
int32_t var_14 = r4
int32_t __saved_r7
int32_t* var_28 = &__saved_r7
void* var_2c = r6
int32_t var_30 = r5
int32_t var_34 = r4
void* var_38 = arg4
int32_t var_3c = arg3
int32_t var_40 = arg2
int32_t r0 = *__stack_chk_guard
int32_t result
void* r2_6

if (arg2 != 1)
    if (arg2 != 0)
        fprintf(__sF + 0xa8, "libunwind: %s %s:%d - %s\n", "_Unwind_VRS_Pop", 
            "/buildbot/src/android/ndk-release-r19/external/libcxx/../.."
        "/external/libunwind_llvm/src/Unwind-EHABI.cpp", 
            0x3b8, "unsupported register class")
        fflush(__sF + 0xa8)
        abort()
        noreturn
    
    if (arg4 != 0)
    labelid_d:
        result = 2
    else if (sub_1a8828(arg1, 0xd, &var_38) != 0)
    label_1a8436:
        result = 2
    else
        int32_t i = 0
        int32_t r5_1 = 0
        
        for (; i u<= 0xf; i += 1)
            if ((1 << i & arg3) != 0)
                int32_t* r0_4 = var_38
                var_38 = &r0_4[1]
                var_2c = *r0_4
                
                if (sub_1a82c0(arg1, 0, i, 0, &var_2c) != 0)
                    goto label_1a8436_2
                
                r5_1 |= __clz(i - 0xd) u>> 5
        
        if (r5_1 << 0x1f == 0)
            r2_6 = var_38
        label_1a8464:
            result = sub_1a885c(arg1, 0xd, r2_6)
            
            if (result != 0)
                result = 2
        else
            result = 0
else if ((arg4 | 4) != 5)
label_1a8436_1:
    result = 2
else
    if (sub_1a8828(arg1, 0xd, &var_2c) == 0)
        uint32_t r5_2 = arg3 u>> 0x10
        uint32_t r4_1 = r5_2 + zx.d(arg3.w)
        
        while (r5_2 u< r4_1)
            void* r0_15 = var_2c
            void* r1_1 = *r0_15
            var_2c = r0_15 + 8
            int32_t r0_16 = *(r0_15 + 4)
            var_38 = r1_1
            int32_t var_34_1 = r0_16
            int32_t r0_18 = sub_1a82c0(arg1, 1, r5_2, arg4, &var_38)
            r5_2 += 1
            
            if (r0_18 != 0)
                goto label_1a8436_2
        
        if (arg4 != 1)
            r2_6 = var_2c
        else
            r2_6 = var_2c + 4
            var_2c = r2_6
        
        goto label_1a8464
    
label_1a8436_2:
    result = 2

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
