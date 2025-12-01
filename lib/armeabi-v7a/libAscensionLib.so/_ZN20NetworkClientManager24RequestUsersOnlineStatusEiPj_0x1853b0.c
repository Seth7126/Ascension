// 函数: _ZN20NetworkClientManager24RequestUsersOnlineStatusEiPj
// 地址: 0x1853b0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (arg2 s>= 1 && *(arg1 + 4) != 0)
    void* r0_2 = *(arg1 + 0x50c)
    uint32_t* r10_1 = arg2
    
    if (arg2 s>= 0xc)
        r10_1 = 0xc
    
    int32_t r4_1 = 0
    int32_t entry_r2
    
    do
        int32_t* r1 = *(arg1 + 0x508)
        
        if (r1 != r0_2)
            int32_t r2 = *(entry_r2 + (r4_1 << 2))
            void* r7_1
            
            if (*r1 != r2)
                bool cond:2_1
                
                do
                    if (r0_2 - 8 == r1)
                        goto label_185460
                    
                    r7_1 = &r1[2]
                    cond:2_1 = r1[2] != r2
                    r1 = r7_1
                while (cond:2_1)
            else
                r7_1 = r1
            
            if (r0_2 != r7_1 + 8)
                __aeabi_memmove4(r7_1)
            
            r0_2 = r7_1 + ((r0_2 - (r7_1 + 8)) s>> 3 << 3)
            *(arg1 + 0x50c) = r0_2
        
    label_185460:
        r4_1 += 1
    while (r4_1 s< r10_1)
    
    int32_t* r6_1 = *(arg1 + 4)
    int32_t var_60_1 = 0
    int32_t var_64 = 0x83838383
    uint32_t* var_5c_1 = r10_1
    void var_58
    __aeabi_memcpy4(&var_58, entry_r2, r10_1 << 2)
    (*(*r6_1 + 8))(r6_1, &var_64, 0x3c)

int32_t r0_7 = *__stack_chk_guard

if (r0_7 == r0)
    return r0_7 - r0

__stack_chk_fail()
noreturn
