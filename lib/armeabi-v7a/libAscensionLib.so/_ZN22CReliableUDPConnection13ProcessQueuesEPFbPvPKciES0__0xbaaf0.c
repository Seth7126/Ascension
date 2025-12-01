// 函数: _ZN22CReliableUDPConnection13ProcessQueuesEPFbPvPKciES0_
// 地址: 0xbaaf0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *__stack_chk_guard

if (zx.d(*(arg1 + 0x20)) == 0)
label_bacf0:
    int32_t r0_24 = *__stack_chk_guard
    
    if (r0_24 == r0)
        return r0_24 - r0
else
    for (int32_t i = *(arg1 + 0x40); i != 0; i = *(arg1 + 0x40))
        void* r0_2 = *(arg1 + 0x3c)
        int32_t r2 = *(arg1 + 0x28)
        int32_t* r7_1 = *(r0_2 + 8)
        
        if (r7_1[2] u> r2)
            break
        
        *(arg1 + 0x28) = r2 + 1
        void* r2_2 = *r0_2
        *(r2_2 + 4) = *(r0_2 + 4)
        **(r0_2 + 4) = r2_2
        *(arg1 + 0x40) = i - 1
        operator delete(r0_2)
        
        if (arg2 != 0)
            int32_t entry_r2
            arg2(entry_r2, &r7_1[4], *r7_1)
            operator delete(r7_1)
        else if (r7_1 != 0)
            operator delete(r7_1)
    
    clock_t r0_5 = clock()
    
    if (r0_5 - *(arg1 + 0x1c) s< 0x3938701)
        for (void* i_1 = *(arg1 + 0x30); arg1 + 0x2c != i_1; i_1 = *(i_1 + 4))
            int32_t* r8_1 = *(i_1 + 8)
            
            if (r0_5 - *r8_1 s>= 0xe4e1c1 && zx.d(*(arg1 + 0x20)) != 0)
                clock_t r0_15 = clock()
                *(arg1 + 0x18) = r0_15
                *r8_1 = r0_15
                uint32_t __n = r8_1[1]
                r8_1[4] = *(arg1 + 0x28)
                sendto(*(arg1 + 4), &r8_1[2], __n, 0, arg1 + 8, 0x10)
        
        if (r0_5 - *(arg1 + 0x18) s>= 0x2faf081)
            int32_t __buf = 0xabcdef0
            int32_t var_80c_1 = 0x10
            int32_t var_804_1 = 0
            int32_t var_7fc_1 = 0xffffffff
            
            if (zx.d(*(arg1 + 0x20)) != 0)
                clock_t r0_21 = clock()
                *(arg1 + 0x18) = r0_21
                clock_t var_810_1 = r0_21
                int32_t var_800_1 = *(arg1 + 0x28)
                sendto(*(arg1 + 4), &__buf, 0x10, 0, arg1 + 8, 0x10)
        
        goto label_bacf0
    
    if (*__stack_chk_guard == r0)
        jump(*(*arg1 + 4))

__stack_chk_fail()
noreturn
