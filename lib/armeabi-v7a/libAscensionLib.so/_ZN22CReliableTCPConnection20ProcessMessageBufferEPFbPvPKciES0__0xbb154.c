// 函数: _ZN22CReliableTCPConnection20ProcessMessageBufferEPFbPvPKciES0_
// 地址: 0xbb154
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

bool (* r2)(void*, char const*, int32_t) = arg1
int32_t r0 = *__stack_chk_guard

if (zx.d(*(r2 + 0x18)) != 0)
    int32_t r1 = *(r2 + 0x20)
    int32_t r10_1 = 0
    int32_t r0_2 = *(r2 + 0x1c)
    int32_t r8_1 = r1 - 0x800
    
    if (r1 != 0x800)
        r8_1 = r1
    
    int32_t i_1 = r0_2 - r8_1
    
    if (r0_2 s< r8_1)
        r10_1 = 1
    
    int32_t i = i_1
    
    if (r0_2 s< r8_1)
        i = 0x800 - r8_1 + r0_2
    
    if (i s>= 5)
        bool (* r3_1)(void*, char const*, int32_t) = r2 + 0x24
        
        if (r0_2 s< r8_1)
            i_1 = 0x800 - r8_1
        
        bool (* var_838_1)(void*, char const*, int32_t) = r2
        
        do
            void* r3_2 = r2 + r8_1 + 0x24
            void var_830
            void* r7_1
            
            if (i_1 s< 4)
                r7_1 = &var_830
                __aeabi_memcpy(&var_830, r3_2, i_1)
                __aeabi_memcpy(&var_830 + i_1, r3_1, 4 - i_1)
                r2 = var_838_1
            else
                r7_1 = r3_2
            
            int32_t r6_1 = *r7_1
            
            if (r6_1 + 4 s> i)
                break
            
            int32_t r0_7 = 0
            
            if (r6_1 + r8_1 s< 0x7fd)
                r0_7 = 1
            
            void* r7_2
            
            if (((not.d(r10_1) | r0_7) & 1) != 0)
                r7_2 = r3_2
            else
                r7_2 = &var_830
                __aeabi_memcpy(&var_830, r3_2, i_1)
                __aeabi_memcpy(&var_830 + i_1, r3_1, r6_1 + 4 - i_1)
                r2 = var_838_1
            
            if (arg2 != 0)
                if (*(r7_2 + 4) != 0xabcdef0)
                    (*(*r2 + 4))(r2)
                    break
                
                int32_t entry_r2
                arg2(entry_r2, r7_2 + 8, r6_1 - 4)
                r2 = var_838_1
                
                if (zx.d(*(r2 + 0x18)) == 0)
                    break
            
            int32_t r0_16 = *(r2 + 0x20) + r6_1 + 4
            *(r2 + 0x20) = r0_16
            
            if (r0_16 s>= 0x800)
                if (*(r2 + 0x1c) s>= 0x800)
                    *(r2 + 0x1c) = 0
                
                *(r2 + 0x20) = r0_16 - 0x800
            
            int32_t r1_9 = *(r2 + 0x20)
            r10_1 = 0
            int32_t r0_18 = *(r2 + 0x1c)
            r8_1 = r1_9 - 0x800
            
            if (r1_9 != 0x800)
                r8_1 = r1_9
            
            i = r0_18 - r8_1
            
            if (r0_18 s< r8_1)
                r10_1 = 1
            
            i_1 = i
            
            if (r0_18 s< r8_1)
                i = 0x800 - r8_1 + r0_18
                i_1 = 0x800 - r8_1
        while (i s>= 5)

int32_t r0_21 = *__stack_chk_guard

if (r0_21 == r0)
    return r0_21 - r0

__stack_chk_fail()
noreturn
