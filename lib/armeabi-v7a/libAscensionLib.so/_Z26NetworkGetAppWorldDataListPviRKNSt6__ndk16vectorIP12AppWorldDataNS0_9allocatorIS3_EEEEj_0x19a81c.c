// 函数: _Z26NetworkGetAppWorldDataListPviRKNSt6__ndk16vectorIP12AppWorldDataNS0_9allocatorIS3_EEEEj
// 地址: 0x19a81c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r7 = arg1
int32_t r0 = *__stack_chk_guard
int32_t r0_1 = *arg3
int32_t r2_1 = *(arg3 + 4) - r0_1

if (arg2 s>= r2_1 s>> 2)
    arg2 = r2_1 s>> 2

int32_t r2_5

if (arg2 s< 1)
    r2_5 = 0
else
    int32_t var_5c_1 = 0
    int32_t r1 = 0
    uint32_t var_58_1 = arg4
    
    while (true)
        int32_t* r9_1 = *(r0_1 + (r1 << 2))
        
        if (arg4 != 0 && r9_1[1] != arg4)
            var_5c_1 += 1
        else
            int32_t r10_1 = 0
            int32_t var_30 = 0
            int32_t var_2c = 0
            int32_t r6_1 = r9_1[0x282]
            
            if (r6_1 != 0)
                __aeabi_memcpy(&var_2c, &r9_1[0x288], r6_1)
                int32_t r0_5 = 0
                
                do
                    *(&var_30 + zx.d(*(&r9_1[0x288] + r0_5))) = r0_5.b
                    r0_5 += 1
                while (r0_5 u< r6_1)
                
                int32_t r1_3 = 0
                r10_1 = 0
                
                do
                    char r2_3 = *(&var_30 + r1_3)
                    int32_t r3 = 1 & zx.d(r9_1[0x36].b) u>> (r1_3 & 0xff)
                    r1_3 += 1
                    r10_1 |= r3 << zx.d(r2_3)
                while (r6_1 != r1_3)
            
            uint32_t r0_8 = zx.d(var_2c.b) * 3
            void* r0_9 = &r9_1[5 + r0_8 * 4]
            strcpy(r7 + 0xc, r0_9 + 0x10)
            uint32_t r0_12 = zx.d(var_2c:1.b) * 3
            void* r0_13 = &r9_1[5 + r0_12 * 4]
            strcpy(r7 + 0x2c, r0_13 + 0x10)
            uint32_t r0_16 = zx.d(var_2c:2.b) * 3
            void* r6_2 = &r9_1[5 + r0_16 * 4]
            strcpy(r7 + 0x4c, r6_2 + 0x10)
            uint32_t r0_19 = zx.d(var_2c:3.b) * 3
            void* r5_1 = &r9_1[5 + r0_19 * 4]
            strcpy(r7 + 0x6c, r5_1 + 0x10)
            *(r7 + 0x8c) = r9_1[1]
            *(r7 + 0x90) = zx.d(*(r9_1 + 0xe))
            *(r7 + 0x94) = zx.d(r9_1[4].w)
            *(r7 + 0x98) = r9_1[0x39]
            int32_t r0_25 = r9_1[0x38]
            *(r7 + 0xa4) = r10_1
            *(r7 + 0xa0) = r0_25
            *(r7 + 0xa8) = r9_1[0x37]
            *(r7 + 0xac) = *r9_1
            *(r7 + 0xb4) = r9_1[0x281]
            *(r7 + 0xb8) = *(r0_9 + 0xa)
            *(r7 + 0xba) = *(r0_13 + 0xa)
            *(r7 + 0xbc) = *(r6_2 + 0xa)
            *(r7 + 0xbe) = *(r5_1 + 0xa)
            *(r7 + 0xec) = zx.d(*(r0_9 + 4))
            *(r7 + 0xf0) = zx.d(*(r0_13 + 4))
            *(r7 + 0xf4) = zx.d(*(r6_2 + 4))
            *(r7 + 0xf8) = zx.d(*(r5_1 + 4))
            *(r7 + 0xc0) = *(r0_9 + 6)
            *(r7 + 0xc2) = *(r0_13 + 6)
            *(r7 + 0xc4) = *(r6_2 + 6)
            *(r7 + 0xc6) = *(r5_1 + 6)
            *(r7 + 0xc8) = *(r0_9 + 0xc)
            *(r7 + 0xcc) = *(r0_13 + 0xc)
            *(r7 + 0xd0) = *(r6_2 + 0xc)
            *(r7 + 0xd4) = *(r5_1 + 0xc)
            *(r7 + 0xd8) = r9_1[0x285]
            *(r7 + 0xdc) = r9_1[5 + r0_8 * 4]
            *(r7 + 0xe0) = r9_1[5 + r0_12 * 4]
            *(r7 + 0xe4) = r9_1[5 + r0_16 * 4]
            *(r7 + 0xe8) = r9_1[5 + r0_19 * 4]
            *(r7 + 0xfc) = r9_1[0x35] | r9_1[0x282] << 0x10
            int32_t r0_56 = r9_1[0x43]
            int32_t r1_10 = 0
            
            if (r0_56 != 0)
                r1_10 = 0
                
                if (r9_1[0x283] u>= r0_56)
                    r1_10 = 1
            
            *(r7 + 0x9c) = r1_10
            arg4 = var_58_1
        
        r1 += 1
        
        if (r1 s>= arg2)
            break
        
        r7 += 0x108
        r0_1 = *arg3
    
    r2_5 = var_5c_1

if (*__stack_chk_guard == r0)
    return arg2 - r2_5

__stack_chk_fail()
noreturn
