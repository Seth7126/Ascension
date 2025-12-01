// 函数: _ZN20NetworkClientManager14InsertGameDataEP12AppWorldData
// 地址: 0x182d50
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t r0 = *__stack_chk_guard
int32_t* r6 = *(arg1 + 0xdc)
void* r0_1 = *(arg1 + 0xe0)
void* entry_r1

if (r6 != r0_1)
    while (true)
        if (*r6 != entry_r1)
            r6 = &r6[1]
            
            if (r6 == r0_1)
                break
        else
            if (r0_1 != &r6[1])
                __aeabi_memmove4(r6)
            
            r0_1 = &r6[(r0_1 - &r6[1]) s>> 2]
            *(arg1 + 0xe0) = r0_1
            
            if (r6 == r0_1)
                break

int32_t* r7_2 = *(arg1 + 0xe8)
void** r0_3 = *(arg1 + 0xec)

if (r7_2 != r0_3)
    while (true)
        if (*r7_2 != entry_r1)
            r7_2 = &r7_2[1]
            
            if (r7_2 == r0_3)
                break
        else
            if (r0_3 != &r7_2[1])
                __aeabi_memmove4(r7_2)
            
            r0_3 = &r7_2[(r0_3 - &r7_2[1]) s>> 2]
            *(arg1 + 0xec) = r0_3
            
            if (r7_2 == r0_3)
                break

int32_t r12 = *(entry_r1 + 0x10c)
int32_t lr_1 = *(entry_r1 + 0xa0c)

if (lr_1 u< r12 || *(entry_r1 + 0xa04) - 3 u> 1)
    int32_t r3_1 = *(entry_r1 + 0xa08)
    
    if (r3_1 != 0)
        void* r7_3 = entry_r1 + 0x1e
        int32_t r1_7 = 0
        
        do
            if (*(r7_3 - 0xa) == *(arg1 + 0xa4))
                uint32_t r2_4 = zx.d(*r7_3)
                
                if (r2_4 == 5)
                    if (lr_1 u>= r12)
                    label_182ed0:
                        void* var_2c_1 = entry_r1
                        
                        if (r0_3 == *(arg1 + 0xf0))
                            goto label_182efc
                        
                        goto label_182ee0
                else if (r2_4 == 4)
                    goto label_182ed0
            
            r1_7 += 1
            r7_3 += 0x30
        while (r1_7 u< r3_1)
    
    if (*__stack_chk_guard == r0)
        return NetworkClientManager::InsertActiveGameData(arg1) __tailcall
else
    void* var_28_1 = entry_r1
    
    if (r0_3 != *(arg1 + 0xf0))
    label_182ee0:
        *r0_3 = entry_r1
        *(arg1 + 0xec) += 4
    else
    label_182efc:
        std::__ndk1::vector<AppWorldData*, std::__ndk1::allocator<AppWorldData*> >::__push_back_slow_path<AppWorldData* const&>(
            arg1 + 0xe8)
    
    int32_t r0_12 = *__stack_chk_guard
    
    if (r0_12 == r0)
        return r0_12 - r0

__stack_chk_fail()
noreturn
