// 函数: NetworkGetChatChannelMessageList
// 地址: 0x19b770
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6 = arg2
uint32_t r2 = *s_pNetworkClientManager
int32_t r1 = *__stack_chk_guard
int32_t result
void* r0
void* const r7_1

if (arg1 == 0)
    r0 = r2 + 0x5e0
    r7_1 = nullptr
label_19b7f0:
    uint32_t r5_1 = *r0
    result = 0
    
    if (r5_1 != 0)
        int32_t r0_1 = *(r5_1 + 4)
        int32_t r1_2 = *(r5_1 + 8)
        
        if (r0_1 u> r6)
            r6 = r0_1
        
        if (r6 u<= r1_2)
            int32_t result_1 = 0
            void var_3d
            void* var_5c_1 = &var_3d
            uint32_t var_58_1 = r5_1
            
            do
                int32_t* r0_5 = NetworkChatList::GetChatMessage(r5_1)
                
                if (r0_5 == 0)
                    result = result_1
                else
                    if (result_1 u>= arg3)
                        result = arg3
                        break
                    
                    int32_t* r1_6 = arg4 + result_1 * 0xd4
                    *r1_6 = r6
                    int32_t r0_8 = *r0_5
                    r1_6[1] = r0_8
                    void* r1_3 = r0_5 + 0xd2
                    void* r0_3
                    
                    if (zx.d(*r1_3) == 0)
                        if (r7_1 != 0)
                            int32_t r1_8 = *(r7_1 + 0xd4)
                            
                            if (r1_8 s>= 1)
                                void* r2_3 = r7_1 + 0x14
                                int32_t r3_1 = 0
                                
                                do
                                    if (*r2_3 == r0_8)
                                        r0_3 = arg4 + result_1 * 0xd4
                                        r1_3 = r2_3 + 0x10
                                        goto label_19b898
                                    
                                    r3_1 += 1
                                    r2_3 += 0x30
                                while (r3_1 s< r1_8)
                        
                        if (r0_8 != 0)
                            __builtin_strcpy(arg4 + result_1 * 0xd4 + 8, "someone")
                    else
                        r0_3 = arg4 + result_1 * 0xd4
                    label_19b898:
                        strcpy(r0_3 + 8, r1_3)
                    char var_48
                    strcpy(&var_48, ctime(&r0_5[2]))
                    void* r4_1 = arg4 + result_1 * 0xd4
                    char var_45_1 = 0
                    char var_38_1 = 0
                    sprintf(r4_1 + 0x28, "%s %s", &var_48, var_5c_1, r7_1 + 0x14, var_5c_1, 
                        var_58_1, arg3, r1_2, result_1 + 1)
                    int32_t r8_1 = zx.d(r0_5[4].w) + 1
                    
                    if (r8_1 u>= 0x8c)
                        r8_1 = 0x8c
                    
                    __aeabi_memcpy(r4_1 + 0x48, r0_5 + 0x12, r8_1)
                    result = result_1 + 1
                    r5_1 = var_58_1
                    result_1 = result
                    *(r4_1 + 0x48 + r8_1 - 1) = 0
                
                r6 += 1
            while (r6 u<= r1_2)
else
    int32_t* r1_1 = *(r2 + 0xdc)
    result = 0
    int32_t r2_1 = *(r2 + 0xe0)
    
    if (r1_1 != r2_1)
        do
            r7_1 = *r1_1
            r1_1 = &r1_1[1]
            
            if (*(r7_1 + 4) == arg1)
                r0 = r7_1 + 0xa28
                goto label_19b7f0
        while (r2_1 != r1_1)

if (*__stack_chk_guard == r1)
    return result

__stack_chk_fail()
noreturn
