// 函数: sub_d2f94
// 地址: 0xd2f94
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
uint32_t r4 = strlen(arg2)
uint32_t r0_2 = zx.d(*arg2)
void* r1

if (r0_2 == 0x40)
    if (r4 u> arg3)
        arg1[2] = 0x2e
        *arg1 = 0x2e2e
        return __aeabi_memcpy(&arg1[3], &arg2[r4 + 3 - arg3 + 1], arg3 - 3) __tailcall
    
    r1 = &arg2[1]
else
    if (r0_2 != 0x3d)
        char* r0_9 = strchr(arg2, 0xa)
        __builtin_strncpy(arg1, "[string \"", 9)
        void* result
        
        if (r4 u>= arg3 - 0xf || r0_9 != 0)
            if (r0_9 != 0)
                r4 = r0_9 - arg2
            
            if (r4 u> arg3 - 0xf)
                r4 = arg3 - 0xf
            
            __aeabi_memcpy(&arg1[9], arg2, r4)
            void* r6_2 = &arg1[9 + r4]
            *r6_2 = 0x2e2e
            *(r6_2 + 2) = 0x2e
            result = r6_2 + 3
        else
            __aeabi_memcpy(&arg1[9], arg2, r4)
            result = &arg1[9 + r4]
        
        *(result + 2) = 0
        *result = 0x5d22
        return result
    
    r1 = &arg2[1]
    
    if (r4 u> arg3)
        __aeabi_memcpy(arg1, r1, arg3 - 1)
        arg1[arg3 - 1] = 0
        return 0

return __aeabi_memcpy(arg1, r1, r4) __tailcall
