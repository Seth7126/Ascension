// 函数: _ZN20NetworkClientManager23SendAddFriendFromUserIdEjPKc
// 地址: 0x184cb4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0
int32_t r0 = *__stack_chk_guard
int32_t r0_1 = *(arg1 + 0xa4)
*(arg1 + 0xa0) = 0

if (r0_1 != arg2)
    int32_t* r0_2 = *(arg1 + 0x514)
    int32_t r2 = *(arg1 + 0x518)
    int32_t entry_r3
    
    if (r0_2 == r2)
    label_184d24:
        int32_t var_274_1 = 0
        result = 1
        int32_t var_278 = 0xbfbfbfbf
        int32_t var_270_1 = 1
        char const* var_26c_1 = arg2
        void var_268
        __aeabi_memclr8(&var_268, 0x41, r2, entry_r3)
        char var_227[0x203]
        char* entry_s
        ObfuscateString(entry_s, strlen(entry_s), 0x20, 0x7e, 0x2a, &var_227)
        int32_t* r0_7 = *(arg1 + 4)
        (*(*r0_7 + 8))(r0_7, &var_278, 0x254)
    else
        while (true)
            int32_t* r3 = *r0_2
            r0_2 = &r0_2[1]
            entry_r3 = *r3
            
            if (entry_r3 == arg2)
                result = 0
                break
            
            if (r2 == r0_2)
                goto label_184d24
        
        *(arg1 + 0xa0) = 4
else
    *(arg1 + 0xa0) = 4

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
