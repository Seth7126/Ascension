// 函数: _ZN20NetworkClientManager26SendRemoveFriendFromUserIdEjPKc
// 地址: 0x184dc0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t result = 0
int32_t r2 = *(arg1 + 0xa4)
*(arg1 + 0xa0) = 0

if (r2 != arg2)
    int32_t* r2_1 = *(arg1 + 0x514)
    int32_t r3_1 = *(arg1 + 0x518)
    
    if (r3_1 != r2_1)
        int32_t* r6_3
        
        if (**r2_1 != arg2)
            r3_1 -= 4
            
            while (r3_1 != r2_1)
                r6_3 = &r2_1[1]
                bool cond:0_1 = *r2_1[1] != arg2
                r2_1 = r6_3
                
                if (not(cond:0_1))
                    goto label_184e54
        else
            r6_3 = r2_1
        label_184e54:
            int32_t var_274_1 = 0
            int32_t var_278 = 0xbfbfbfbf
            int32_t var_270_1 = 0
            char const* var_26c_1 = arg2
            void var_268
            __aeabi_memclr8(&var_268, 0x41, 0xbfbfbfbf, r3_1)
            char var_227[0x203]
            char* entry_s
            ObfuscateString(entry_s, strlen(entry_s), 0x20, 0x7e, 0x2a, &var_227)
            int32_t* r0_5 = *(arg1 + 4)
            (*(*r0_5 + 8))(r0_5, &var_278, 0x254)
            int32_t r0_6 = *(arg1 + 0x518)
            
            if (r0_6 != &r6_3[1])
                __aeabi_memmove4(r6_3)
            
            *(arg1 + 0x518) = &r6_3[(r0_6 - &r6_3[1]) s>> 2]
            result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
