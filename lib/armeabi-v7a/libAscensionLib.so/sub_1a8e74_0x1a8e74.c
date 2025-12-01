// 函数: sub_1a8e74
// 地址: 0x1a8e74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0
int32_t r0 = *__stack_chk_guard
int32_t var_30 = arg2
int32_t r6 = arg3[1]
int32_t* r2 = *(arg1 + 4)
int32_t var_3c
sub_1a9044(&var_3c, 0, r2, arg3, r6, r2)
int32_t r0_2 = var_3c

if (r0_2 != 0 && r0_2 != r6)
    int32_t* var_34
    int32_t* r1_2 = *var_34 + (r0_2 << 3)
    int32_t r2_1 = *r1_2
    void* r0_4 = &r1_2[-1]
    int32_t r3_1
    
    if (r0_4 != 0)
        r3_1 = *r0_4
    
    if (r0_4 != 0 && r3_1 != 1)
        int32_t r8_1 = *(r1_2 - 8)
        void* r3_5
        int32_t r5_1
        int32_t r12_2
        void* lr_1
        
        if (r3_1 s< 0)
            r12_2 = 1
        label_1a8f1a:
            int32_t r6_5 = r3_1 u>> 0x18 & 0xf
            char const* const r4_1
            int32_t r6_10
            
            if (r6_5 == 2)
                lr_1 = &data_1a84fd
                r5_1 = 1
            label_1a8f56:
                int32_t r3_6 = r3_1 u>> 0x10 & 0xff
                
                if ((__clz(r3_6) u>> 5 | (r12_2 ^ 1)) != 0)
                    r3_5 = r0_4 + (r3_6 << 2) + 4
                    goto label_1a8f74
                
                r6_10 = 0x335
                r4_1 = "index inlined table detected but pr function requires extra words"
            label_1a8ffc:
                void var_2c
                fprintf(__sF + 0xa8, "libunwind: %s %s:%d - %s\n", "getInfoFromEHABISection", 
                    "/buildbot/src/android/ndk-release-r19/external/libcxx/../.."
                "/external/libunwind_llvm/src/UnwindCursor.hpp", 
                    r6_10, r4_1, arg3, &var_30, &var_2c)
                fflush(__sF + 0xa8)
                abort()
                noreturn
            
            if (r6_5 == 1)
                lr_1 = &data_1a84f5
                r5_1 = 0
                goto label_1a8f56
            
            if (r6_5 != 0)
                r6_10 = 0x32e
                r4_1 = "unknown personality routine"
                goto label_1a8ffc
            
            r3_5 = r0_4 + 4
            
            if (r12_2 != 0)
                r3_5 = nullptr
            
            lr_1 = &data_1a84bd
            goto label_1a8f3c
        
        int32_t* r6_2 = r3_1 | (r3_1 & 0x40000000) << 1
        r3_1 = *(r6_2 + r0_4)
        r0_4 += r6_2
        
        if (r3_1 s<= 0xffffffff)
            r12_2 = 0
            goto label_1a8f1a
        
        lr_1 = (r3_1 | (r3_1 & 0x40000000) << 1) + r0_4
        r12_2 = 0
        r3_5 = r0_4 + 4 + (*(r0_4 + 4) u>> 0x18 << 2) + 4
    label_1a8f3c:
        r5_1 = 0
    label_1a8f74:
        *(arg1 + 0x178) = r0_4
        *(arg1 + 0x158) = (r8_1 | (r8_1 & 0x40000000) << 1) + r1_2 - 8
        *(arg1 + 0x15c) = r1_2 + (r2_1 | (r2_1 & 0x40000000) << 1)
        *(arg1 + 0x160) = r3_5
        *(arg1 + 0x164) = lr_1
        
        if (r5_1 != 0)
            r5_1 = 2
        
        if (r12_2 != 0)
            r5_1 = 1
        
        *(arg1 + 0x16c) = r5_1
        result = 1
    else
        result = 0

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
