// 函数: _ZN20NetworkClientManager17SubmitChatMessageEjtPKc
// 地址: 0x1857b8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (*(arg1 + 4) != 0)
    char const* r4_1 = arg3
    char* entry_r3
    
    if (arg3 != 0 && entry_r3 != 0)
        int32_t var_e4_1 = arg2
        int32_t var_e8 = 0xcacacaca
        
        if (r4_1 u>= 0xbf)
            r4_1 = 0xbf
        
        int16_t var_e0_1 = r4_1.w
        char var_de[0xbf]
        strcpy(&var_de, entry_r3)
        char var_1f_1 = 0
        int32_t* r0_3 = *(arg1 + 4)
        (*(*r0_3 + 8))(r0_3, &var_e8, zx.d(r4_1.w + 0xd))

int32_t r0_4 = *__stack_chk_guard

if (r0_4 == r0)
    return r0_4 - r0

__stack_chk_fail()
noreturn
