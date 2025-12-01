// 函数: _ZN20NetworkClientManager25SendAddFriendFromUsernameEPKcS1_
// 地址: 0x184ae0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
*(arg1 + 0xa0) = 0
int32_t result

if (strcasecmp(&arg1[0xb0], arg2) == 0)
label_184bd8:
    result = 4
    *(arg1 + 0xa0) = 4
else
    int32_t r7_1 = *(arg1 + 0x514)
    int32_t r0_3 = *(arg1 + 0x518)
    
    if (r0_3 != r7_1)
        int32_t i = 0
        
        do
            if (strcasecmp(*(r7_1 + (i << 2)) + 8, arg2) == 0)
                goto label_184bd8
            
            i += 1
        while (i u< (r0_3 - r7_1) s>> 2)
    
    int32_t var_27c_1 = 0
    int32_t var_280 = 0xbfbfbfbf
    int32_t var_278_1 = 2
    int32_t var_274_1 = 0
    char var_270[0x41]
    strcpy(&var_270, arg2)
    char var_22f[0x203]
    char* entry_s
    ObfuscateString(entry_s, strlen(entry_s), 0x20, 0x7e, 0x2a, &var_22f)
    int32_t* r0_12 = *(arg1 + 4)
    (*(*r0_12 + 8))(r0_12, &var_280, 0x254)
    result = *(arg1 + 0xa0)

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
